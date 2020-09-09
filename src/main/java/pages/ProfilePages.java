package pages;

import operation.BaseHomepage;
import operation.BaseLanding;
import operation.BaseLogout;
import operation.BaseProfile;
import utilities.finders.ElementAction;

public class ProfilePages {
    BaseHomepage baseHomepage = new BaseHomepage();
    BaseProfile baseProfile = new BaseProfile();
    BaseLogout baseLogout = new BaseLogout();
    BaseLanding baseLanding = new BaseLanding();
    ElementAction action = new ElementAction();

    public void testUpdateFullName() {
        action.click(baseHomepage.btnProfile);
        action.click(baseProfile.btnEdit);
        baseProfile.updateFullNameProfile();
        action.click(baseProfile.btnSubmitChangeProfile);
    }

    public void testUpdateAlternatePhoneNumber() {
        action.click(baseHomepage.btnProfile);
        action.click(baseProfile.btnEdit);
        baseProfile.updateAlternatePhoneNumber();
        action.click(baseProfile.btnSubmitChangeProfile);
    }

    public void testChangeLanguage() throws InterruptedException{
        action.click(baseHomepage.btnProfile);
        baseProfile.clickButtonLanguage();
    }

    public void clickButtonBahasa() throws InterruptedException {
        action.click(baseHomepage.btnProfile);
        action.scrollOnly(baseProfile.btnCLanguage);
        action.clickElementScroll(baseProfile.btnCLanguage);
        action.click(baseProfile.btnBahasa);
        Thread.sleep(4000);
    }

    public void testInputFullName(String fullName) {
        action.click(baseHomepage.btnProfile);
        action.click(baseProfile.btnEdit);
        action.sendKeys(baseProfile.inputFullName, fullName);
        action.click(baseProfile.btnSubmitChangeProfile);
    }

    public void testChooseFavorite() {
        action.click(baseHomepage.btnProfile);
    }

    public void testCopyReferralCode(String refCode) throws InterruptedException {
        action.click(baseHomepage.btnProfile);
        action.clickElementScroll(baseProfile.btnReferral);
        action.checkerEqual(baseProfile.txtReferralCode, refCode);
        action.click(baseProfile.btnCopyReferralCode);
    }

    public void testShareReferralCode(String refCode) throws InterruptedException {
        action.click(baseHomepage.btnProfile);
        action.clickElementScroll(baseProfile.btnReferral);
        action.checkerEqual(baseProfile.txtReferralCode, refCode);
        action.click(baseProfile.btnShareReferralCode);
    }

    public void testCheckWishlist() {
        action.click(baseHomepage.btnProfile);
        action.clickElementScroll(baseProfile.btnYourWishList);
    }

    public void testChangePin(String pin) {
        action.click(baseHomepage.btnProfile);
        action.clickElementScroll(baseProfile.btnAccount);
        action.click(baseProfile.btnChangePIN);
        action.sendKeys(baseProfile.inputChangePIN, pin);
        action.click(baseProfile.btnConfirmChangePIN);
    }

    public void testPhaseTwoChangePin(String pin) {
        testChangePin(pin);
        action.sendKeys(baseProfile.inputChangePIN, pin);
        action.click(baseProfile.btnConfirmChangePIN);
    }

    public void testCompleteChangePin(String pin) {
        testChangePin(pin);
        action.sendKeys(baseProfile.inputChangePIN, pin);
        action.click(baseProfile.btnConfirmChangePIN);
        action.sendKeys(baseProfile.inputChangePIN, pin);
        action.click(baseProfile.btnConfirmChangePIN);
    }

    public void testAddDeliveryAddress(String homeOfficeName, String recipientName, String recipientNumber) {
        action.click(baseHomepage.btnProfile);
        action.clickElementScroll(baseProfile.btnAccount);
        action.click(baseProfile.btnDeliveryAddress);
        action.click(baseProfile.btnAddAddress);
        action.inputElementScroll(baseProfile.inputHomeOrOffice, homeOfficeName);
        action.inputElementScroll(baseProfile.inputRecipientName, recipientName);
        action.inputElementScroll(baseProfile.inputRecipientPhoneNumber, recipientNumber);
    }

    public void testDeliveryAddress(String city, String address) {
        action.clickElementScroll(baseProfile.btnCityOrDistrict);
        action.inputElementScroll(baseProfile.inputSrcCityOrDistrict, city);
        action.click(baseProfile.btnSelectCityOrDistrict);
        action.inputElementScroll(baseProfile.inputAddressDetail, address);
        action.clickElementScroll(baseProfile.btnChooseLocation);
        action.click(baseProfile.btnSelectThisLocation);
        action.clickElementScroll(baseProfile.cbTermsAndConditions);
        action.clickElementScroll(baseProfile.btnSave);
    }

    public void testCheckSIMInfo() {
        action.click(baseHomepage.btnProfile);
        action.clickElementScroll(baseProfile.btnSIMSetting);
        action.click(baseProfile.btnSIMInfo);
//        baseProfile.checkSIMInfo();
    }

    public void testCheckCompatibility() {
        action.click(baseHomepage.btnProfile);
        action.clickElementScroll(baseProfile.btnSIMSetting);
        action.click(baseProfile.btnCheckCompatibility);
//        baseProfile.checkCompatibility();
    }

    public void testChatWithShely() {
        action.click(baseHomepage.btnProfile);
        action.clickElementScroll(baseProfile.btnHelp);
        baseProfile.clickButtonChatWithShely();
        baseProfile.clickButtonChat();
    }

    public void testEmailUs() {
        action.click(baseHomepage.btnProfile);
        action.clickElementScroll(baseProfile.btnHelp);
        baseProfile.clickButtonChatWithShely();
        baseProfile.clickButtonEmail();
    }

    public void testValidLogout() throws InterruptedException {
        action.click(baseHomepage.btnProfile);
        action.clickElementScroll(baseProfile.btnLogout);
        action.click(baseLogout.btnConfirmLogout);
    }

    public void testLogout() {
        action.clickElementScroll(baseProfile.btnLogout);
        action.click(baseLogout.btnConfirmLogout);
    }

    public void testClickButtonLoginHere() {
        action.click(baseLogout.btnLoginHere);
        baseLanding.checkValidationWelcomeText();
    }
}
