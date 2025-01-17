package de.codescape.jira.plugins.multiplesubtasks.service;

import com.atlassian.activeobjects.external.ActiveObjects;
import com.atlassian.activeobjects.tx.Transactional;
import com.atlassian.jira.user.ApplicationUser;
import com.atlassian.plugin.spring.scanner.annotation.imports.ComponentImport;
import de.codescape.jira.plugins.multiplesubtasks.ao.SubtaskTemplate;
import de.codescape.jira.plugins.multiplesubtasks.model.SubtaskTemplateType;
import net.java.ao.DBParam;
import net.java.ao.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * Subtask template service to persist and load templates from and to the database.
 */
@Transactional
@Component
public class SubtaskTemplateService {

    private final ActiveObjects activeObjects;

    @Autowired
    public SubtaskTemplateService(@ComponentImport ActiveObjects activeObjects) {
        this.activeObjects = activeObjects;
    }

    public void saveUserTemplate(ApplicationUser applicationUser, String name, String template) {
        SubtaskTemplate subtaskTemplate = activeObjects.create(SubtaskTemplate.class,
            new DBParam("TEMPLATE_TYPE", SubtaskTemplateType.USER),
            new DBParam("USER_ID", applicationUser.getId()),
            new DBParam("NAME", name),
            new DBParam("TEMPLATE", template)
        );
        subtaskTemplate.save();
    }

    public List<SubtaskTemplate> getUserTemplates(ApplicationUser applicationUser) {
        return Arrays.asList(activeObjects.find(SubtaskTemplate.class,
            Query.select().where("USER_ID = ?", applicationUser.getId()).order("ID DESC"))
        );
    }

    public void deleteUserTemplate(ApplicationUser applicationUser, Long templateId) {
        SubtaskTemplate[] subtaskTemplates = activeObjects.find(SubtaskTemplate.class,
            Query.select().where("USER_ID = ? and ID = ?", applicationUser.getId(), templateId));
        if (subtaskTemplates.length > 0) {
            activeObjects.delete(subtaskTemplates[0]);
        }
    }

}
