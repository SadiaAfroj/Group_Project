package EncryptionTool;

public class SoftwareTools {
    public static final String END_MASSAGE= "Thank You!";
    public static final String WELCOME = "Welcome to our Encryption Tool!";
    public static final String YES = "yes";
    public static final String TERMS_AND_CONDITIONS = "\t\tTerms and Conditions\n\n" +
    "1. Acceptance of Terms: By using the Caesar Cipher Encryption Tool software (\"Encryption Tool\"), you agree to comply with and be bound by the following terms and conditions. If you do not agree to these terms and conditions, please do not use the Software.\n\n" +
    "2. License: The Software is provided under a non-exclusive, non-transferable, revocable license for personal and non-commercial use. You may not modify, distribute, or reverse-engineer the Software.\n\n" +
    "3. Use of Encryption: You understand and acknowledge that the Software is designed for educational and informational purposes only. You agree not to use the Software for any unlawful, malicious, or harmful activities. The Software should not be used for encrypting sensitive or confidential information.\n\n" +
    "4. Accuracy of Results: The Caesar cipher encryption provided by the Software is a basic and easily breakable encryption method. It is not suitable for securing sensitive data. We make no guarantee as to the security of the encrypted data, and you use it at your own risk.\n\n" +
    "5. Privacy: The Software does not collect or store any personal or user data. We respect your privacy, and your usage data remains confidential.\n\n" +
    "6. No Warranty: The Software is provided \"as is,\" without any warranties, express or implied. We do not warrant that the Software will be error-free or meet your specific requirements.\n\n" +
    "7. Limitation of Liability: In no event shall we be liable for any direct, indirect, incidental, special, or consequential damages arising out of or in any way connected with the use or misuse of the Software.\n\n" +
    "8. Termination: We reserve the right to terminate or suspend your access to the Software at our discretion, without notice, for any reason, including, but not limited to, your failure to comply with these terms and conditions.\n\n" +
    "9. Changes to Terms: We may update these terms and conditions at any time without prior notice. Your continued use of the Software after such modifications will constitute your acknowledgment and agreement to the revised terms.\n\n" +
    "10. Governing Law: These terms and conditions shall be governed by and construed in accordance with the laws of Constitute of Bangladesh.\n\n" +
    "By using the Software, you acknowledge that you have read, understood, and agree to these terms and conditions. If you do not agree with any part of these terms and conditions, please refrain from using the Software.\n\n" +
    "For questions or concerns about these terms and conditions, please contact us at saimahmedemon7@gmail.com.\n\nDo you agree with the terms and conditions. (yes/no)\n=>";

    public static void clearScreen(){
        System.out.print("\033[H\033[2J");  
        System.out.flush(); 
    }
    
}
