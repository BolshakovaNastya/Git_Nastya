package Tests;

public class Tests {
    @Test
    public void testWebFormSubmission() {
        // 1. Заполнить поле "Text input" (ФИО)
        WebElement textInput = driver.findElement(By.id("my-text-id"));
        textInput.sendKeys("Большакова Анастасия Михайловна");
        Assert.assertTrue(textInput.gettextInput("Большакова Анастасия Михайловна"));
    }

    // 2. Заполнить поле "Textarea" (Название компании)
    WebElement textarea = driver.findElement(By.name("my-textarea"));
        textarea.sendKeys("ООО Рога и Копыта");
    Assert.assertTrue(textarea.gettextarea("ООО Рога и Копыта"))

    // 3. Заполнить поле "Password"
    WebElement passwordInput = driver.findElement(By.name("my-password"));
        passwordInput.sendKeys("Password");
    assertEquals(passwordInput.getAttribute("value"),
    "Password", "Пароль не отображается");
     Assert.assertTrue(passwordInput.getpasswordInput("Password"));

     // 4. Выбрать "Two" в dropdown
    Select dropdown = new Select(driver.findElement(By.name("my-select")));
        dropdown.selectByValue("2");
    assertEquals(dropdown.getFirstSelectedOption().getText(),
    "Two", "Не выбран вариант 'Two'");

    // 5. Выбрать "Seattle" в datalist
    WebElement datalistInput = driver.findElement(By.name("my-datalist"));
        datalistInput.sendKeys("Seattle");

    // 6. Активировать оба чекбокса
    WebElement checkbox1 = driver.findElement(By.id("my-check-1"));
    WebElement checkbox2 = driver.findElement(By.id("my-check-2"));
        if (!checkbox1.isSelected()) checkbox1.click();
        if (!checkbox2.isSelected()) checkbox2.click();
    assertTrue(checkbox1.isSelected() && checkbox2.isSelected(),
            "Чекбоксы не выбраны");

    // 7. Выбрать радиокнопку "Default radio"
    WebElement radioButton = driver.findElement(By.id("my-radio-2"));
        radioButton.click();
    assertTrue(radioButton.isSelected(), "Радиокнопка не выбрана");

    // 8. Установить дату 23 сентября 2024
    WebElement datePicker = driver.findElement(By.name("my-date"));
        datePicker.sendKeys("09/23/2024");

    // 9. Выбрать зеленый цвет (#00FF00)
    WebElement colorPicker = driver.findElement(By.name("my-colors"));
        colorPicker.sendKeys("#00FF00");

    // 10. Установить range в максимум
    WebElement rangeInput = driver.findElement(By.name("my-range"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].value = arguments[0].max", rangeInput);

    // 11. Нажать кнопку "Submit"
    WebElement submitButton = driver.findElement(By.cssSelector("button[type='submit']"));
        submitButton.click();

    // 12. Проверить сообщение "Received!"
    WebElement successMessage = wait.until(
            ExpectedConditions.visibilityOfElementLocated(By.id("message"))
    );
    AssertEquals(successMessage.getText(), "Received!", "Форма не отправлена");
}

@AfterMethod
public void tearDown() {
    if (driver != null) {
        driver.quit();
    }
}

}
