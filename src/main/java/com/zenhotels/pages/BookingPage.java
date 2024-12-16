package com.zenhotels.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.*;
import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;

public class BookingPage {

    WebDriver driver;
    WebDriverWait wait;

    public BookingPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    By hotelSearch = By.cssSelector("input[placeholder='Search for destination']");
    By checkInTime = By.cssSelector("input[placeholder='Check-in date']");
    By checkOutTime = By.cssSelector("input[placeholder='Check-out date']");
    By guestSelect = By.cssSelector("input[placeholder='Guests']");
    By leisureTrip = By.cssSelector("input[value='Leisure']");
    By searchButton = By.cssSelector("button[type='submit']");
    By selectHotel = By.linkText("Marigold by Greenpark");
    By showRooms = By.linkText("Show rooms");
    By selectRoom = By.xpath("//table//tr[last()]//a[text()='Select room']");
    By email = By.id("email");
    By lastName = By.id("lastName");
    By firstName = By.id("firstName");
    By teleNum = By.id("phone");
    By citizenship = By.id("citizenship");
    By selectTime = By.cssSelector("select[name='arrivalTime']");
    By continueButton = By.cssSelector("button[type='continue']");

    private WebElement getElement(By locator) {
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public void searchHotel(String destination) {
        try {
            WebElement searchElement = getElement(hotelSearch);
            searchElement.clear();
            searchElement.sendKeys(destination);
        } catch (Exception e) {
            System.err.println("Error in searchHotel: " + e.getMessage());
        }
    }

    public void setCheckInDate(String date) {
        try {
            WebElement checkinElement = getElement(checkInTime);
            ((JavascriptExecutor) driver).executeScript("arguments[0].value='" + date + "';", checkinElement);
        } catch (Exception e) {
            System.err.println("Error in setCheckInDate: " + e.getMessage());
        }
    }

    public void setCheckOutDate(String date) {
        try {
            WebElement checkoutElement = getElement(checkOutTime);
            checkoutElement.clear();
            checkoutElement.sendKeys(date);
        } catch (Exception e) {
            System.err.println("Error in setCheckOutDate: " + e.getMessage());
        }
    }

    public void selectGuests(String numberOfGuests) {
        try {
            WebElement guestElement = getElement(guestSelect);
            guestElement.clear();
            guestElement.sendKeys(numberOfGuests);
        } catch (Exception e) {
            System.err.println("Error in selectGuests: " + e.getMessage());
        }
    }

    public void selectLeisureTrip() {
        try {
            WebElement leisureElement = getElement(leisureTrip);
            leisureElement.click();
        } catch (Exception e) {
            System.err.println("Error in selectLeisureTrip: " + e.getMessage());
        }
    }

    public void clickSearchButton() {
        try {
            WebElement buttonElement = getElement(searchButton);
            buttonElement.click();
        } catch (Exception e) {
            System.err.println("Error in clickSearchButton: " + e.getMessage());
        }
    }

    public void selectHotel() {
        try {
            WebElement hotelElement = getElement(selectHotel);
            hotelElement.click();
        } catch (Exception e) {
            System.err.println("Error in selectHotel: " + e.getMessage());
        }
    }

    public void showRooms() {
        try {
            WebElement roomsElement = getElement(showRooms);
            roomsElement.click();
        } catch (Exception e) {
            System.err.println("Error in showRooms: " + e.getMessage());
        }
    }

    public void selectRoom() {
        try {
            WebElement roomElement = getElement(selectRoom);
            roomElement.click();
        } catch (Exception e) {
            System.err.println("Error in selectRoom: " + e.getMessage());
        }
    }

    public void enterEmail(String emailInput) {
        try {
            WebElement emailElement = getElement(email);
            emailElement.clear();
            emailElement.sendKeys(emailInput);
        } catch (Exception e) {
            System.err.println("Error in enterEmail: " + e.getMessage());
        }
    }

    public void enterLastName(String lastNameInput) {
        try {
            WebElement lastnameElement = getElement(lastName);
            lastnameElement.clear();
            lastnameElement.sendKeys(lastNameInput);
        } catch (Exception e) {
            System.err.println("Error in enterLastName: " + e.getMessage());
        }
    }

    public void enterFirstName(String firstNameInput) {
        try {
            WebElement firstnameElement = getElement(firstName);
            firstnameElement.clear();
            firstnameElement.sendKeys(firstNameInput);
        } catch (Exception e) {
            System.err.println("Error in enterFirstName: " + e.getMessage());
        }
    }

    public void enterPhoneNumber(String phoneNumber) {
        try {
            WebElement numberElement = getElement(teleNum);
            numberElement.clear();
            numberElement.sendKeys(phoneNumber);
        } catch (Exception e) {
            System.err.println("Error in enterPhoneNumber: " + e.getMessage());
        }
    }

    public void enterCitizenship(String citizenshipInput) {
        try {
            WebElement citizenElement = getElement(citizenship);
            citizenElement.clear();
            citizenElement.sendKeys(citizenshipInput);
        } catch (Exception e) {
            System.err.println("Error in enterCitizenship: " + e.getMessage());
        }
    }

    public void selectArrivalTime(String time) {
        try {
            WebElement timeElement = getElement(selectTime);
            Select select = new Select(timeElement);
            select.selectByVisibleText(time);
        } catch (Exception e) {
            System.err.println("Error in selectArrivalTime: " + e.getMessage());
        }
    }

    public void clickContinue() {
        try {
            WebElement continueElement = getElement(continueButton);
            continueElement.click();
        } catch (Exception e) {
            System.err.println("Error in clickContinue: " + e.getMessage());
        }
    }
}
