package com.trycloud.step_definitions;

import com.trycloud.pages.FilesPage;
import com.trycloud.utilities.ConfigurationReader;
import io.cucumber.java.en.Then;

public class FilesStepDef {
    @Then("the user add new files")
    public void the_user_add_new_files() {
        FilesPage file = new FilesPage();
        String filename = ConfigurationReader.get("fileName");
        file.plus(filename);
    }
}
