package lippia.web.constants;

public class HomePageConstants {
    public static final String HOME_BUTTON = "xpath://*[@id=\"content\"]/nav/a";
    public static final String SHOP_BUTTON = "xpath://a[contains(text(),'Shop')]";
    public static final String SLICER_DIV = "xpath://*[@id=\"n2-ss-6\"]/div[1]/div/div";
    public static final String IMG_SLICER = "xpath://*[@id=\"n2-ss-6\"]/div[1]/div/div/div/div/img";
    public static final String ARRIVALS_DIV = "xpath://div[2]/div/div/div/div/div[2]";
    public static final String IMG_ARRIVALS = "xpath://*/div/ul/li/a/img";
    public static final String AD_IFRAME1_XPATH = "xpath:/html/ins/*/*[contains(@id, 'aswift_') and not(contains(@id, 'host'))]";
    public static final String AD_IFRAME2_XPATH = "xpath://*[@id='ad_iframe']";
    public static final String AD_CLOSE_BUTTON_XPATH = "xpath://*[@id='dismiss-button']";
    public static final String SELENIUM_BOOK = "xpath://*[contains(@title, 'Selenium Ruby')]";
    public static final String HTML_BOOK = "xpath://*[contains(@title, 'Thinking in HTML')]";
    public static final String JAVASCRIPT_BOOK = "xpath://*[contains(@title, 'Mastering JavaScript')]";
    public static final String ADD_TO_CART_BUTTON = "xpath://*[contains(@class, 'single_add_to_cart_button button alt')]";
    public static final String AMOUNT_LINK_MENU = "xpath://*[contains(@class, 'amount')]";
    public static final String SUBTOTAL_AMOUNT_VALUE= "xpath://*[contains(@data-title,'Subtotal')]";
    public static final String TAX_AMOUNT_VALUE= "xpath:(//span[contains(@class, 'woocommerce-Price-amount amount')])[4]";
    public static final String TOTAL_AMOUNT_VALUE= "xpath://*[contains(@data-title,'Total')]/strong";
    public static final String PROCEED_CHECK_OUT_BUTTON = "xpath://*[contains(@class, 'checkout-button button alt wc-forward')]";
    public static final String BILLING_DETAILS_HEADER_FORM = "xpath://h3[contains(text(),'Billing Details')]";
    public static final String YOUR_ORDER_HEADER = "id:order_review_heading";
    public static final String ADDITIONAL_INFORMATION_HEADER = "xpath://h3[contains(text(),'Additional Information')]";
    public static final String PAYMENT_METHOD_DIV = "id:payment";
    public static final String FIRST_NAME_INPUT = "id:billing_first_name";
    public static final String LAST_NAME_INPUT = "id:billing_last_name";
    public static final String COMPANY_NAME_INPUT = "id:billing_company";
    public static final String EMIAL_INPUT = "id:billing_email";
    public static final String PHONE_INPUT = "id:billing_phone";
    public static final String COUNTRY_INPUT = "id:s2id_autogen1";
    public static final String COUNTRY_INDIA = "xpath:(//div[contains(.,'India')])[14]";

    public static final String COUNTRY_ARGENTINA = "xpath:(//div[contains(.,'Argentina')])[12]";
    public static final String ADRESS_INPUT = "id:billing_address_1";
    public static final String APARTMENT_INPUT = "id:billing_address_2";
    public static final String TOWN_INPUT = "id:billing_city";
    public static final String STATE_INPUT = "id:s2id_autogen2";
    public static final String STATE_INDIA = "xpath:(//div[contains(.,'Andhra Pradesh')])[12]";
    public static final String STATE_ARGENTINA = "xpath:(//div[contains(.,'Buenos Aires')])[12]";
    public static final String POSTCODE_INPUT = "id:billing_postcode";
    public static final String PAYMENT_METHOD_INPUT = "id:";
    public static final String COUPON_LINK_2 = "xpath://a[contains(text(),'Click here to enter your code')]";
    public static final String COUPON_FORM = "xpath://*[contains(@class, 'checkout_coupon')]";
    public static final String PLACE_ORDER_BUTTON = "xpath://input[@id='place_order']";
    public static final String BANK_DETAILS_HEADER = "xpath://h2[contains(text(),'Our Bank Details')]";
    public static final String ORDER_DETAILS_HEADER = "xpath://h2[contains(text(),'Order Details')]";
    public static final String CUSTOMER_DETAILS_HEADER = "xpath://h2[contains(text(),'Customer Details')]";
    public static final String BILLING_DETAILS_HEADER = "xpath://h3[contains(text(),'Billing Address')]";






}
