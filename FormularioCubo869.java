package programacion2.proyecto869;

import java.awt.Color;
import static programacion2.proyecto869.Proyecto869.C1;
import static programacion2.proyecto869.Proyecto869.C2;
import static programacion2.proyecto869.Proyecto869.C3;
import static programacion2.proyecto869.Proyecto869.C4;
import static programacion2.proyecto869.Proyecto869.C6;
import static programacion2.proyecto869.Proyecto869.ImprimeCubo;

public class FormularioCubo869 extends javax.swing.JFrame {

    public static int C1[][] = {{0, 0, 0, 0}, {0, 11, 12, 13}, {0, 14, 15, 16}, {0, 17, 18, 19}};
    public static int C2[][] = {{0, 0, 0, 0}, {0, 21, 22, 23}, {0, 24, 25, 26}, {0, 27, 28, 29}};
    public static int C3[][] = {{0, 0, 0, 0}, {0, 31, 32, 33}, {0, 34, 35, 36}, {0, 37, 38, 39}};
    public static int C4[][] = {{0, 0, 0, 0}, {0, 41, 42, 43}, {0, 44, 45, 46}, {0, 47, 48, 49}};
    public static int C5[][] = {{0, 0, 0, 0}, {0, 51, 52, 53}, {0, 54, 55, 56}, {0, 57, 58, 59}};
    public static int C6[][] = {{0, 0, 0, 0}, {0, 61, 62, 63}, {0, 64, 65, 66}, {0, 67, 68, 69}};
    public static int cc = 0;
    public static int ccol = 0;
    public static Color Rojo = Color.red;
    public static Color Amarillo = Color.yellow;
    public static Color Naranja = Color.orange;
    public static Color Blanco = Color.white;
    public static Color Verde = Color.green;
    public static Color Azul = new Color(89, 120, 237);

    public static Color Col1[][] = {{Rojo, Rojo, Rojo, Rojo}, {Rojo, Rojo, Rojo, Rojo}, {Rojo, Rojo, Rojo, Rojo}, {Rojo, Rojo, Rojo, Rojo}};
    public static Color Col2[][] = {{Amarillo, Amarillo, Amarillo, Amarillo}, {Amarillo, Amarillo, Amarillo, Amarillo}, {Amarillo, Amarillo, Amarillo, Amarillo}, {Amarillo, Amarillo, Amarillo, Amarillo}};
    public static Color Col3[][] = {{Naranja, Naranja, Naranja, Naranja}, {Naranja, Naranja, Naranja, Naranja}, {Naranja, Naranja, Naranja, Naranja}, {Naranja, Naranja, Naranja, Naranja}};
    public static Color Col4[][] = {{Blanco, Blanco, Blanco, Blanco}, {Blanco, Blanco, Blanco, Blanco}, {Blanco, Blanco, Blanco, Blanco}, {Blanco, Blanco, Blanco, Blanco}};
    public static Color Col5[][] = {{Verde, Verde, Verde, Verde}, {Verde, Verde, Verde, Verde}, {Verde, Verde, Verde, Verde}, {Verde, Verde, Verde, Verde}};
    public static Color Col6[][] = {{Azul, Azul, Azul, Azul}, {Azul, Azul, Azul, Azul}, {Azul, Azul, Azul, Azul}, {Azul, Azul, Azul, Azul}};

    void EtiquetasOn() {
        EtiquetasON1();
        EtiquetasON2();
        EtiquetasON3();
        EtiquetasON4();
        EtiquetasON5();
        EtiquetasON6();
    }

    void EtiquetasON1() {

        Txt1_11.setText(String.valueOf(C1[1][1]));
        Txt1_12.setText(String.valueOf(C1[1][2]));
        Txt1_13.setText(String.valueOf(C1[1][3]));
        Txt1_21.setText(String.valueOf(C1[2][1]));
        Txt1_22.setText(String.valueOf(C1[2][2]));
        Txt1_23.setText(String.valueOf(C1[2][3]));
        Txt1_31.setText(String.valueOf(C1[3][1]));
        Txt1_32.setText(String.valueOf(C1[3][2]));
        Txt1_33.setText(String.valueOf(C1[3][3]));

    }

    void EtiquetasON2() {

        Txt2_11.setText(String.valueOf(C2[1][1]));
        Txt2_12.setText(String.valueOf(C2[1][2]));
        Txt2_13.setText(String.valueOf(C2[1][3]));
        Txt2_21.setText(String.valueOf(C2[2][1]));
        Txt2_22.setText(String.valueOf(C2[2][2]));
        Txt2_23.setText(String.valueOf(C2[2][3]));
        Txt2_31.setText(String.valueOf(C2[3][1]));
        Txt2_32.setText(String.valueOf(C2[3][2]));
        Txt2_33.setText(String.valueOf(C2[3][3]));

    }

    void EtiquetasON3() {

        Txt3_11.setText(String.valueOf(C3[1][1]));
        Txt3_12.setText(String.valueOf(C3[1][2]));
        Txt3_13.setText(String.valueOf(C3[1][3]));
        Txt3_21.setText(String.valueOf(C3[2][1]));
        Txt3_22.setText(String.valueOf(C3[2][2]));
        Txt3_23.setText(String.valueOf(C3[2][3]));
        Txt3_31.setText(String.valueOf(C3[3][1]));
        Txt3_32.setText(String.valueOf(C3[3][2]));
        Txt3_33.setText(String.valueOf(C3[3][3]));

    }

    void EtiquetasON4() {

        Txt4_11.setText(String.valueOf(C4[1][1]));
        Txt4_12.setText(String.valueOf(C4[1][2]));
        Txt4_13.setText(String.valueOf(C4[1][3]));
        Txt4_21.setText(String.valueOf(C4[2][1]));
        Txt4_22.setText(String.valueOf(C4[2][2]));
        Txt4_23.setText(String.valueOf(C4[2][3]));
        Txt4_31.setText(String.valueOf(C4[3][1]));
        Txt4_32.setText(String.valueOf(C4[3][2]));
        Txt4_33.setText(String.valueOf(C4[3][3]));

    }

    void EtiquetasON5() {

        Txt5_11.setText(String.valueOf(C5[1][1]));
        Txt5_12.setText(String.valueOf(C5[1][2]));
        Txt5_13.setText(String.valueOf(C5[1][3]));
        Txt5_21.setText(String.valueOf(C5[2][1]));
        Txt5_22.setText(String.valueOf(C5[2][2]));
        Txt5_23.setText(String.valueOf(C5[2][3]));
        Txt5_31.setText(String.valueOf(C5[3][1]));
        Txt5_32.setText(String.valueOf(C5[3][2]));
        Txt5_33.setText(String.valueOf(C5[3][3]));

    }

    void EtiquetasON6() {

        Txt6_11.setText(String.valueOf(C6[1][1]));
        Txt6_12.setText(String.valueOf(C6[1][2]));
        Txt6_13.setText(String.valueOf(C6[1][3]));
        Txt6_21.setText(String.valueOf(C6[2][1]));
        Txt6_22.setText(String.valueOf(C6[2][2]));
        Txt6_23.setText(String.valueOf(C6[2][3]));
        Txt6_31.setText(String.valueOf(C6[3][1]));
        Txt6_32.setText(String.valueOf(C6[3][2]));
        Txt6_33.setText(String.valueOf(C6[3][3]));

    }

    void BorrarEtiquetas() {
        EtiquetasOFF1();
        EtiquetasOFF2();
        EtiquetasOFF3();
        EtiquetasOFF4();
        EtiquetasOFF5();
        EtiquetasOFF6();
    }

    void EtiquetasOFF1() {
        Txt1_11.setText("");
        Txt1_12.setText("");
        Txt1_13.setText("");
        Txt1_21.setText("");
        Txt1_22.setText("");
        Txt1_23.setText("");
        Txt1_31.setText("");
        Txt1_32.setText("");
        Txt1_33.setText("");

    }

    void EtiquetasOFF2() {
        Txt2_11.setText("");
        Txt2_12.setText("");
        Txt2_13.setText("");
        Txt2_21.setText("");
        Txt2_22.setText("");
        Txt2_23.setText("");
        Txt2_31.setText("");
        Txt2_32.setText("");
        Txt2_33.setText("");

    }

    void EtiquetasOFF3() {
        Txt3_11.setText("");
        Txt3_12.setText("");
        Txt3_13.setText("");
        Txt3_21.setText("");
        Txt3_22.setText("");
        Txt3_23.setText("");
        Txt3_31.setText("");
        Txt3_32.setText("");
        Txt3_33.setText("");

    }

    void EtiquetasOFF4() {
        Txt4_11.setText("");
        Txt4_12.setText("");
        Txt4_13.setText("");
        Txt4_21.setText("");
        Txt4_22.setText("");
        Txt4_23.setText("");
        Txt4_31.setText("");
        Txt4_32.setText("");
        Txt4_33.setText("");
    }

    void EtiquetasOFF5() {
        Txt5_11.setText("");
        Txt5_12.setText("");
        Txt5_13.setText("");
        Txt5_21.setText("");
        Txt5_22.setText("");
        Txt5_23.setText("");
        Txt5_31.setText("");
        Txt5_32.setText("");
        Txt5_33.setText("");

    }

    void EtiquetasOFF6() {
        Txt6_11.setText("");
        Txt6_12.setText("");
        Txt6_13.setText("");
        Txt6_21.setText("");
        Txt6_22.setText("");
        Txt6_23.setText("");
        Txt6_31.setText("");
        Txt6_32.setText("");
        Txt6_33.setText("");

    }

    void Etiqueta() {
        cc = cc + 1;
        if (cc > 1) {
            cc = 0;
        }
        if (cc == 1) {
            EtiquetasOn();
        } else {
            BorrarEtiquetas();
        }

    }

    void ColoresON1() {
        Txt1_11.setBackground(Col1[1][1]);
        Txt1_12.setBackground(Col1[1][2]);
        Txt1_13.setBackground(Col1[1][3]);
        Txt1_21.setBackground(Col1[2][1]);
        Txt1_22.setBackground(Col1[2][2]);
        Txt1_23.setBackground(Col1[2][3]);
        Txt1_31.setBackground(Col1[3][1]);
        Txt1_32.setBackground(Col1[3][2]);
        Txt1_33.setBackground(Col1[3][3]);
    }

    void ColoresON2() {
        Txt2_11.setBackground(Col2[1][1]);
        Txt2_12.setBackground(Col2[1][2]);
        Txt2_13.setBackground(Col2[1][3]);
        Txt2_21.setBackground(Col2[2][1]);
        Txt2_22.setBackground(Col2[2][2]);
        Txt2_23.setBackground(Col2[2][3]);
        Txt2_31.setBackground(Col2[3][1]);
        Txt2_32.setBackground(Col2[3][2]);
        Txt2_33.setBackground(Col2[3][3]);
    }

    void ColoresON3() {
        Txt3_11.setBackground(Col3[1][1]);
        Txt3_12.setBackground(Col3[1][2]);
        Txt3_13.setBackground(Col3[1][3]);
        Txt3_21.setBackground(Col3[2][1]);
        Txt3_22.setBackground(Col3[2][2]);
        Txt3_23.setBackground(Col3[2][3]);
        Txt3_31.setBackground(Col3[3][1]);
        Txt3_32.setBackground(Col3[3][2]);
        Txt3_33.setBackground(Col3[3][3]);
    }

    void ColoresON4() {
        Txt4_11.setBackground(Col4[1][1]);
        Txt4_12.setBackground(Col4[1][2]);
        Txt4_13.setBackground(Col4[1][3]);
        Txt4_21.setBackground(Col4[2][1]);
        Txt4_22.setBackground(Col4[2][2]);
        Txt4_23.setBackground(Col4[2][3]);
        Txt4_31.setBackground(Col4[3][1]);
        Txt4_32.setBackground(Col4[3][2]);
        Txt4_33.setBackground(Col4[3][3]);
    }

    void ColoresON5() {
        Txt5_11.setBackground(Col5[1][1]);
        Txt5_12.setBackground(Col5[1][2]);
        Txt5_13.setBackground(Col5[1][3]);
        Txt5_21.setBackground(Col5[2][1]);
        Txt5_22.setBackground(Col5[2][2]);
        Txt5_23.setBackground(Col5[2][3]);
        Txt5_31.setBackground(Col5[3][1]);
        Txt5_32.setBackground(Col5[3][2]);
        Txt5_33.setBackground(Col5[3][3]);
    }

    void ColoresON6() {
        Txt6_11.setBackground(Col6[1][1]);
        Txt6_12.setBackground(Col6[1][2]);
        Txt6_13.setBackground(Col6[1][3]);
        Txt6_21.setBackground(Col6[2][1]);
        Txt6_22.setBackground(Col6[2][2]);
        Txt6_23.setBackground(Col6[2][3]);
        Txt6_31.setBackground(Col6[3][1]);
        Txt6_32.setBackground(Col6[3][2]);
        Txt6_33.setBackground(Col6[3][3]);
    }

    void ColoresON() {
        ColoresON1();
        ColoresON2();
        ColoresON3();
        ColoresON4();
        ColoresON5();
        ColoresON6();

    }

    void ColoresOFF1() {
        Txt1_11.setBackground(Color.white);
        Txt1_12.setBackground(Color.white);
        Txt1_13.setBackground(Color.white);
        Txt1_21.setBackground(Color.white);
        Txt1_22.setBackground(Color.white);
        Txt1_23.setBackground(Color.white);
        Txt1_31.setBackground(Color.white);
        Txt1_32.setBackground(Color.white);
        Txt1_33.setBackground(Color.white);

    }

    void ColoresOFF2() {
        Txt2_11.setBackground(Color.white);
        Txt2_12.setBackground(Color.white);
        Txt2_13.setBackground(Color.white);
        Txt2_21.setBackground(Color.white);
        Txt2_22.setBackground(Color.white);
        Txt2_23.setBackground(Color.white);
        Txt2_31.setBackground(Color.white);
        Txt2_32.setBackground(Color.white);
        Txt2_33.setBackground(Color.white);
    }

    void ColoresOFF3() {
        Txt3_11.setBackground(Color.white);
        Txt3_12.setBackground(Color.white);
        Txt3_13.setBackground(Color.white);
        Txt3_21.setBackground(Color.white);
        Txt3_22.setBackground(Color.white);
        Txt3_23.setBackground(Color.white);
        Txt3_31.setBackground(Color.white);
        Txt3_32.setBackground(Color.white);
        Txt3_33.setBackground(Color.white);
    }

    void ColoresOFF4() {
        Txt4_11.setBackground(Color.white);
        Txt4_12.setBackground(Color.white);
        Txt4_13.setBackground(Color.white);
        Txt4_21.setBackground(Color.white);
        Txt4_22.setBackground(Color.white);
        Txt4_23.setBackground(Color.white);
        Txt4_31.setBackground(Color.white);
        Txt4_32.setBackground(Color.white);
        Txt4_33.setBackground(Color.white);
    }

    void ColoresOFF5() {
        Txt5_11.setBackground(Color.white);
        Txt5_12.setBackground(Color.white);
        Txt5_13.setBackground(Color.white);
        Txt5_21.setBackground(Color.white);
        Txt5_22.setBackground(Color.white);
        Txt5_23.setBackground(Color.white);
        Txt5_31.setBackground(Color.white);
        Txt5_32.setBackground(Color.white);
        Txt5_33.setBackground(Color.white);
    }

    void ColoresOFF6() {
        Txt6_11.setBackground(Color.white);
        Txt6_12.setBackground(Color.white);
        Txt6_13.setBackground(Color.white);
        Txt6_21.setBackground(Color.white);
        Txt6_22.setBackground(Color.white);
        Txt6_23.setBackground(Color.white);
        Txt6_31.setBackground(Color.white);
        Txt6_32.setBackground(Color.white);
        Txt6_33.setBackground(Color.white);
    }

    void ColoresOFF() {
        ColoresOFF1();
        ColoresOFF2();
        ColoresOFF3();
        ColoresOFF4();
        ColoresOFF5();
        ColoresOFF6();
    }

    void Colores() {
        ccol = ccol + 1;
        if (ccol > 1) {
            ccol = 0;
        }
        if (ccol == 1) {
            ColoresON();
        } else {
            ColoresOFF();
        }
    }

    public void RDC6() {
        int t = C6[1][3];
        C6[1][3] = C6[1][1];
        C6[1][1] = C6[3][1];
        C6[3][1] = C6[3][3];
        C6[3][3] = t;
        t = C6[2][3];
        C6[2][3] = C6[1][2];
        C6[1][2] = C6[2][1];
        C6[2][1] = C6[3][2];
        C6[3][2] = t;

        Color t2 = Col6[1][3];
        Col6[1][3] = Col6[1][1];
        Col6[1][1] = Col6[3][1];
        Col6[3][1] = Col6[3][3];
        Col6[3][3] = t2;
        t2 = Col6[2][3];
        Col6[2][3] = Col6[1][2];
        Col6[1][2] = Col6[2][1];
        Col6[2][1] = Col6[3][2];
        Col6[3][2] = t2;
    }

    public void A3Col() {
        Color t;
        for (int i = 1; i <= 3; i++) {
            t = Col1[i][3];
            Col1[i][3] = Col2[i][3];
            Col2[i][3] = Col3[i][3];
            Col3[i][3] = Col4[i][3];
            Col4[i][3] = t;
        }

    }

    public void A2Col() {
        Color t;
        for (int i = 1; i <= 3; i++) {
            t = Col1[i][2];
            Col1[i][2] = Col2[i][2];
            Col2[i][2] = Col3[i][2];
            Col3[i][2] = Col4[i][2];
            Col4[i][2] = t;
        }

    }
    
     public void A1Col() {
        Color t;
        for (int i = 1; i <= 3; i++) {
            t = Col1[i][1];
            Col1[i][1] = Col2[i][1];
            Col2[i][1] = Col3[i][1];
            Col3[i][1] = Col4[i][1];
            Col4[i][1] = t;
        }

    }

     public void D1Col() {
        Color t;
        for (int i = 1; i <= 3; i++) {
            t = Col6[1][i];
            Col6[1][i] = Col1[1][i];
            Col1[1][i] = Col5[1][i];
            Col5[1][i] = Col3[1][i];
            Col3[1][i] = t;
        }

    }

    public void A3() {

        for (int i = 1; i <= 3; i++) {
            int t = C1[i][3];
            C1[i][3] = C2[i][3];
            C2[i][3] = C3[i][3];
            C3[i][3] = C4[i][3];
            C4[i][3] = t;
        }
        A3Col();
        RDC6();
        if (cc == 1) {
            EtiquetasOn();
        }
        if (ccol == 1) {
            ColoresON();
        }
    }

    public void A2() {

        for (int i = 1; i <= 3; i++) {
            int t = C1[i][2];
            C1[i][2] = C2[i][2];
            C2[i][2] = C3[i][2];
            C3[i][2] = C4[i][2];
            C4[i][2] = t;
        }
         
        A2Col();
        RDC6();

        if (cc == 1) {
            EtiquetasOn();
        }
        if (ccol == 1) {
            ColoresON();
        }
    }
    
    public void A1() {

        for (int i = 1; i <= 3; i++) {
            int t = C1[i][1];
            C1[i][1] = C2[i][1];
            C2[i][1] = C3[i][1];
            C3[i][1] = C4[i][1];
            C4[i][1] = t;
        }
        
        A1Col();
        RDC6();

        if (cc == 1) {
            EtiquetasOn();
        }
        if (ccol == 1) {
            ColoresON();
        }
    }
    
    public void D1() {

        for (int i = 1; i <= 3; i++) {
            int t = C6[1][i];
            C6[1][i] = C1[1][i]; //Cara roja pasa a cara azul
            C1[1][i] = C5[1][i]; // Cara verde pasa a cara roja 
            C5[1][i] = C3[1][i]; // Cara anaranjada pasa a cara verde
            C3[1][i] = t; //Cara azul pasa a blanca 
        }
        // RDC6();
        D1Col();
        //RDC6();

        if (cc == 1) {
            EtiquetasOn();
        }
        if (ccol == 1) {
            ColoresON();
        }
    }
    
    

    public FormularioCubo869() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Txt1_13 = new javax.swing.JTextField();
        Txt1_21 = new javax.swing.JTextField();
        Txt1_22 = new javax.swing.JTextField();
        Txt1_11 = new javax.swing.JTextField();
        Txt1_23 = new javax.swing.JTextField();
        Txt1_12 = new javax.swing.JTextField();
        Txt1_31 = new javax.swing.JTextField();
        Txt1_32 = new javax.swing.JTextField();
        Txt1_33 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        Txt3_11 = new javax.swing.JTextField();
        Txt3_12 = new javax.swing.JTextField();
        Txt3_13 = new javax.swing.JTextField();
        Txt3_21 = new javax.swing.JTextField();
        Txt3_22 = new javax.swing.JTextField();
        Txt3_23 = new javax.swing.JTextField();
        Txt3_31 = new javax.swing.JTextField();
        Txt3_32 = new javax.swing.JTextField();
        Txt3_33 = new javax.swing.JTextField();
        Btn_EtiquetasON = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        Txt2_11 = new javax.swing.JTextField();
        Txt2_12 = new javax.swing.JTextField();
        Txt2_13 = new javax.swing.JTextField();
        Txt2_21 = new javax.swing.JTextField();
        Txt2_22 = new javax.swing.JTextField();
        Txt2_23 = new javax.swing.JTextField();
        Txt2_31 = new javax.swing.JTextField();
        Txt2_32 = new javax.swing.JTextField();
        Txt2_33 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        Txt5_11 = new javax.swing.JTextField();
        Txt5_12 = new javax.swing.JTextField();
        Txt5_13 = new javax.swing.JTextField();
        Txt5_21 = new javax.swing.JTextField();
        Txt5_22 = new javax.swing.JTextField();
        Txt5_23 = new javax.swing.JTextField();
        Txt5_31 = new javax.swing.JTextField();
        Txt5_32 = new javax.swing.JTextField();
        Txt5_33 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        Txt6_11 = new javax.swing.JTextField();
        Txt6_12 = new javax.swing.JTextField();
        Txt6_13 = new javax.swing.JTextField();
        Txt6_21 = new javax.swing.JTextField();
        Txt6_22 = new javax.swing.JTextField();
        Txt6_23 = new javax.swing.JTextField();
        Txt6_31 = new javax.swing.JTextField();
        Txt6_32 = new javax.swing.JTextField();
        Txt6_33 = new javax.swing.JTextField();
        Txt4_12 = new javax.swing.JTextField();
        Txt4_13 = new javax.swing.JTextField();
        Txt4_21 = new javax.swing.JTextField();
        Txt4_22 = new javax.swing.JTextField();
        Txt4_23 = new javax.swing.JTextField();
        Txt4_31 = new javax.swing.JTextField();
        Txt4_32 = new javax.swing.JTextField();
        Txt4_33 = new javax.swing.JTextField();
        Txt4_11 = new javax.swing.JTextField();
        Btn_ColoresON1 = new javax.swing.JButton();
        ButtonA3 = new javax.swing.JButton();
        ButtonA2 = new javax.swing.JButton();
        ButtonA1 = new javax.swing.JButton();
        ButtonD1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Txt1_13.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Txt1_13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Txt1_13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Txt1_13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt1_13ActionPerformed(evt);
            }
        });

        Txt1_21.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Txt1_21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Txt1_21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Txt1_21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt1_21ActionPerformed(evt);
            }
        });

        Txt1_22.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Txt1_22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Txt1_22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Txt1_22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt1_22ActionPerformed(evt);
            }
        });

        Txt1_11.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Txt1_11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Txt1_11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Txt1_11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt1_11ActionPerformed(evt);
            }
        });

        Txt1_23.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Txt1_23.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Txt1_23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Txt1_23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt1_23ActionPerformed(evt);
            }
        });

        Txt1_12.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Txt1_12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Txt1_12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Txt1_12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt1_12ActionPerformed(evt);
            }
        });

        Txt1_31.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Txt1_31.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Txt1_31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Txt1_31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt1_31ActionPerformed(evt);
            }
        });

        Txt1_32.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Txt1_32.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Txt1_32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Txt1_32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt1_32ActionPerformed(evt);
            }
        });

        Txt1_33.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Txt1_33.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Txt1_33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Txt1_33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt1_33ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Txt1_31, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(Txt1_32, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(Txt1_33, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(Txt1_21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(2, 2, 2)
                            .addComponent(Txt1_22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(2, 2, 2)
                            .addComponent(Txt1_23, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(Txt1_11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(2, 2, 2)
                            .addComponent(Txt1_12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(2, 2, 2)
                            .addComponent(Txt1_13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt1_11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt1_12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt1_13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt1_21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt1_22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt1_23, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt1_31, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt1_32, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt1_33, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(129, 129, 129))
        );

        Txt3_11.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Txt3_11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Txt3_11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Txt3_11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt3_11ActionPerformed(evt);
            }
        });

        Txt3_12.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Txt3_12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Txt3_12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Txt3_12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt3_12ActionPerformed(evt);
            }
        });

        Txt3_13.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Txt3_13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Txt3_13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Txt3_13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt3_13ActionPerformed(evt);
            }
        });

        Txt3_21.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Txt3_21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Txt3_21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Txt3_21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt3_21ActionPerformed(evt);
            }
        });

        Txt3_22.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Txt3_22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Txt3_22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Txt3_22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt3_22ActionPerformed(evt);
            }
        });

        Txt3_23.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Txt3_23.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Txt3_23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Txt3_23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt3_23ActionPerformed(evt);
            }
        });

        Txt3_31.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Txt3_31.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Txt3_31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Txt3_31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt3_31ActionPerformed(evt);
            }
        });

        Txt3_32.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Txt3_32.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Txt3_32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Txt3_32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt3_32ActionPerformed(evt);
            }
        });

        Txt3_33.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Txt3_33.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Txt3_33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Txt3_33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt3_33ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(18, 18, 18)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(Txt3_31, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(2, 2, 2)
                            .addComponent(Txt3_32, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(2, 2, 2)
                            .addComponent(Txt3_33, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Txt3_21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(Txt3_22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(Txt3_23, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Txt3_11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(Txt3_12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(Txt3_13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addContainerGap(18, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 111, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(11, 11, 11)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Txt3_11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Txt3_12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Txt3_13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(2, 2, 2)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Txt3_21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Txt3_22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Txt3_23, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(2, 2, 2)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Txt3_31, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Txt3_32, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Txt3_33, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        Btn_EtiquetasON.setText("Etiquetas On");
        Btn_EtiquetasON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_EtiquetasONActionPerformed(evt);
            }
        });

        Txt2_11.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Txt2_11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Txt2_11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Txt2_11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt2_11ActionPerformed(evt);
            }
        });

        Txt2_12.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Txt2_12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Txt2_12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Txt2_12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt2_12ActionPerformed(evt);
            }
        });

        Txt2_13.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Txt2_13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Txt2_13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Txt2_13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt2_13ActionPerformed(evt);
            }
        });

        Txt2_21.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Txt2_21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Txt2_21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Txt2_21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt2_21ActionPerformed(evt);
            }
        });

        Txt2_22.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Txt2_22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Txt2_22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Txt2_22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt2_22ActionPerformed(evt);
            }
        });

        Txt2_23.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Txt2_23.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Txt2_23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Txt2_23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt2_23ActionPerformed(evt);
            }
        });

        Txt2_31.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Txt2_31.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Txt2_31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Txt2_31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt2_31ActionPerformed(evt);
            }
        });

        Txt2_32.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Txt2_32.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Txt2_32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Txt2_32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt2_32ActionPerformed(evt);
            }
        });

        Txt2_33.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Txt2_33.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Txt2_33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Txt2_33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt2_33ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 118, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(18, 18, 18)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(Txt2_31, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(2, 2, 2)
                            .addComponent(Txt2_32, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(2, 2, 2)
                            .addComponent(Txt2_33, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(Txt2_21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(Txt2_22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(Txt2_23, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(Txt2_11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(Txt2_12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(Txt2_13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 111, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(11, 11, 11)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Txt2_11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Txt2_12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Txt2_13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(2, 2, 2)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Txt2_21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Txt2_22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Txt2_23, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(2, 2, 2)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Txt2_31, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Txt2_32, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Txt2_33, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        Txt5_11.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Txt5_11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Txt5_11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Txt5_11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt5_11ActionPerformed(evt);
            }
        });

        Txt5_12.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Txt5_12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Txt5_12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Txt5_12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt5_12ActionPerformed(evt);
            }
        });

        Txt5_13.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Txt5_13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Txt5_13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Txt5_13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt5_13ActionPerformed(evt);
            }
        });

        Txt5_21.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Txt5_21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Txt5_21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Txt5_21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt5_21ActionPerformed(evt);
            }
        });

        Txt5_22.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Txt5_22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Txt5_22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Txt5_22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt5_22ActionPerformed(evt);
            }
        });

        Txt5_23.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Txt5_23.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Txt5_23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Txt5_23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt5_23ActionPerformed(evt);
            }
        });

        Txt5_31.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Txt5_31.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Txt5_31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Txt5_31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt5_31ActionPerformed(evt);
            }
        });

        Txt5_32.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Txt5_32.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Txt5_32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Txt5_32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt5_32ActionPerformed(evt);
            }
        });

        Txt5_33.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Txt5_33.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Txt5_33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Txt5_33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt5_33ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 118, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(18, 18, 18)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(Txt5_31, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(2, 2, 2)
                            .addComponent(Txt5_32, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(2, 2, 2)
                            .addComponent(Txt5_33, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(Txt5_21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(Txt5_22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(Txt5_23, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(Txt5_11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(Txt5_12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(Txt5_13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(11, 11, 11)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Txt5_11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Txt5_12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Txt5_13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(2, 2, 2)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Txt5_21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Txt5_22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Txt5_23, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(2, 2, 2)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Txt5_31, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Txt5_32, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Txt5_33, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        Txt6_11.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Txt6_11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Txt6_11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Txt6_11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt6_11ActionPerformed(evt);
            }
        });

        Txt6_12.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Txt6_12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Txt6_12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Txt6_12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt6_12ActionPerformed(evt);
            }
        });

        Txt6_13.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Txt6_13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Txt6_13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Txt6_13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt6_13ActionPerformed(evt);
            }
        });

        Txt6_21.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Txt6_21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Txt6_21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Txt6_21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt6_21ActionPerformed(evt);
            }
        });

        Txt6_22.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Txt6_22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Txt6_22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Txt6_22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt6_22ActionPerformed(evt);
            }
        });

        Txt6_23.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Txt6_23.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Txt6_23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Txt6_23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt6_23ActionPerformed(evt);
            }
        });

        Txt6_31.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Txt6_31.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Txt6_31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Txt6_31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt6_31ActionPerformed(evt);
            }
        });

        Txt6_32.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Txt6_32.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Txt6_32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Txt6_32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt6_32ActionPerformed(evt);
            }
        });

        Txt6_33.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Txt6_33.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Txt6_33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Txt6_33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt6_33ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 128, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(18, 18, 18)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(Txt6_31, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(2, 2, 2)
                            .addComponent(Txt6_32, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(2, 2, 2)
                            .addComponent(Txt6_33, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(Txt6_21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(Txt6_22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(Txt6_23, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(Txt6_11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(Txt6_12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(Txt6_13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addContainerGap(16, Short.MAX_VALUE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 119, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(11, 11, 11)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Txt6_11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Txt6_12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Txt6_13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(2, 2, 2)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Txt6_21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Txt6_22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Txt6_23, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(2, 2, 2)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Txt6_31, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Txt6_32, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Txt6_33, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(14, Short.MAX_VALUE)))
        );

        Txt4_12.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Txt4_12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Txt4_12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Txt4_12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt4_12ActionPerformed(evt);
            }
        });

        Txt4_13.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Txt4_13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Txt4_13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Txt4_13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt4_13ActionPerformed(evt);
            }
        });

        Txt4_21.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Txt4_21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Txt4_21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Txt4_21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt4_21ActionPerformed(evt);
            }
        });

        Txt4_22.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Txt4_22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Txt4_22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Txt4_22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt4_22ActionPerformed(evt);
            }
        });

        Txt4_23.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Txt4_23.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Txt4_23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Txt4_23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt4_23ActionPerformed(evt);
            }
        });

        Txt4_31.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Txt4_31.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Txt4_31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Txt4_31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt4_31ActionPerformed(evt);
            }
        });

        Txt4_32.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Txt4_32.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Txt4_32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Txt4_32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt4_32ActionPerformed(evt);
            }
        });

        Txt4_33.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Txt4_33.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Txt4_33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Txt4_33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt4_33ActionPerformed(evt);
            }
        });

        Txt4_11.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        Txt4_11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Txt4_11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Txt4_11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt4_11ActionPerformed(evt);
            }
        });

        Btn_ColoresON1.setText("Colores On");
        Btn_ColoresON1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ColoresON1ActionPerformed(evt);
            }
        });

        ButtonA3.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        ButtonA3.setText("A3");
        ButtonA3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonA3ActionPerformed(evt);
            }
        });

        ButtonA2.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        ButtonA2.setText("A2");
        ButtonA2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonA2ActionPerformed(evt);
            }
        });

        ButtonA1.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        ButtonA1.setText("A1");
        ButtonA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonA1ActionPerformed(evt);
            }
        });

        ButtonD1.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        ButtonD1.setText("D1");
        ButtonD1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonD1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Btn_EtiquetasON, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Btn_ColoresON1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Txt4_31, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(Txt4_32, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(Txt4_33, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(Txt4_21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(2, 2, 2)
                                    .addComponent(Txt4_22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(2, 2, 2)
                                    .addComponent(Txt4_23, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(Txt4_11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(2, 2, 2)
                                    .addComponent(Txt4_12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(2, 2, 2)
                                    .addComponent(Txt4_13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(ButtonA1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonA2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonA3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(120, 120, 120)))
                .addComponent(ButtonD1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(222, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonA3)
                    .addComponent(ButtonA2)
                    .addComponent(ButtonA1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Btn_EtiquetasON, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addComponent(Btn_ColoresON1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(ButtonD1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt4_11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt4_12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt4_13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt4_21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt4_22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt4_23, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt4_31, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt4_32, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt4_33, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Txt1_11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt1_11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt1_11ActionPerformed

    private void Txt1_12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt1_12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt1_12ActionPerformed

    private void Txt1_13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt1_13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt1_13ActionPerformed

    private void Txt1_21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt1_21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt1_21ActionPerformed

    private void Txt1_22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt1_22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt1_22ActionPerformed

    private void Txt1_23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt1_23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt1_23ActionPerformed

    private void Txt1_31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt1_31ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt1_31ActionPerformed

    private void Txt1_32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt1_32ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt1_32ActionPerformed

    private void Txt1_33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt1_33ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt1_33ActionPerformed

    private void Txt3_33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt3_33ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt3_33ActionPerformed

    private void Txt3_32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt3_32ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt3_32ActionPerformed

    private void Txt3_31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt3_31ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt3_31ActionPerformed

    private void Txt3_12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt3_12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt3_12ActionPerformed

    private void Txt3_23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt3_23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt3_23ActionPerformed

    private void Txt3_11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt3_11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt3_11ActionPerformed

    private void Txt3_22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt3_22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt3_22ActionPerformed

    private void Txt3_21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt3_21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt3_21ActionPerformed

    private void Txt3_13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt3_13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt3_13ActionPerformed

    private void Btn_EtiquetasONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_EtiquetasONActionPerformed
        Etiqueta();
    }//GEN-LAST:event_Btn_EtiquetasONActionPerformed

    private void Txt2_11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt2_11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt2_11ActionPerformed

    private void Txt2_12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt2_12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt2_12ActionPerformed

    private void Txt2_13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt2_13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt2_13ActionPerformed

    private void Txt2_21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt2_21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt2_21ActionPerformed

    private void Txt2_22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt2_22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt2_22ActionPerformed

    private void Txt2_23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt2_23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt2_23ActionPerformed

    private void Txt2_31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt2_31ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt2_31ActionPerformed

    private void Txt2_32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt2_32ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt2_32ActionPerformed

    private void Txt2_33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt2_33ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt2_33ActionPerformed

    private void Txt5_11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt5_11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt5_11ActionPerformed

    private void Txt5_12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt5_12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt5_12ActionPerformed

    private void Txt5_13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt5_13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt5_13ActionPerformed

    private void Txt5_21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt5_21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt5_21ActionPerformed

    private void Txt5_22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt5_22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt5_22ActionPerformed

    private void Txt5_23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt5_23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt5_23ActionPerformed

    private void Txt5_31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt5_31ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt5_31ActionPerformed

    private void Txt5_32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt5_32ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt5_32ActionPerformed

    private void Txt5_33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt5_33ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt5_33ActionPerformed

    private void Txt6_11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt6_11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt6_11ActionPerformed

    private void Txt6_12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt6_12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt6_12ActionPerformed

    private void Txt6_13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt6_13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt6_13ActionPerformed

    private void Txt6_21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt6_21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt6_21ActionPerformed

    private void Txt6_22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt6_22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt6_22ActionPerformed

    private void Txt6_23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt6_23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt6_23ActionPerformed

    private void Txt6_31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt6_31ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt6_31ActionPerformed

    private void Txt6_32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt6_32ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt6_32ActionPerformed

    private void Txt6_33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt6_33ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt6_33ActionPerformed

    private void Txt4_12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt4_12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt4_12ActionPerformed

    private void Txt4_13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt4_13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt4_13ActionPerformed

    private void Txt4_21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt4_21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt4_21ActionPerformed

    private void Txt4_22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt4_22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt4_22ActionPerformed

    private void Txt4_23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt4_23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt4_23ActionPerformed

    private void Txt4_31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt4_31ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt4_31ActionPerformed

    private void Txt4_32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt4_32ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt4_32ActionPerformed

    private void Txt4_33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt4_33ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt4_33ActionPerformed

    private void Txt4_11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt4_11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt4_11ActionPerformed

    private void Btn_ColoresON1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ColoresON1ActionPerformed
        // TODO add your handling code here:
        Colores();
    }//GEN-LAST:event_Btn_ColoresON1ActionPerformed

    private void ButtonA3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonA3ActionPerformed
        A3();
    }//GEN-LAST:event_ButtonA3ActionPerformed

    private void ButtonA2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonA2ActionPerformed
        A2();
    }//GEN-LAST:event_ButtonA2ActionPerformed

    private void ButtonA1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonA1ActionPerformed
        A1();
    }//GEN-LAST:event_ButtonA1ActionPerformed

    private void ButtonD1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonD1ActionPerformed
        D1();
    }//GEN-LAST:event_ButtonD1ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormularioCubo869.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioCubo869.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioCubo869.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioCubo869.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioCubo869().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_ColoresON1;
    private javax.swing.JButton Btn_EtiquetasON;
    private javax.swing.JButton ButtonA1;
    private javax.swing.JButton ButtonA2;
    private javax.swing.JButton ButtonA3;
    private javax.swing.JButton ButtonD1;
    private javax.swing.JTextField Txt1_11;
    private javax.swing.JTextField Txt1_12;
    private javax.swing.JTextField Txt1_13;
    private javax.swing.JTextField Txt1_21;
    private javax.swing.JTextField Txt1_22;
    private javax.swing.JTextField Txt1_23;
    private javax.swing.JTextField Txt1_31;
    private javax.swing.JTextField Txt1_32;
    private javax.swing.JTextField Txt1_33;
    private javax.swing.JTextField Txt2_11;
    private javax.swing.JTextField Txt2_12;
    private javax.swing.JTextField Txt2_13;
    private javax.swing.JTextField Txt2_21;
    private javax.swing.JTextField Txt2_22;
    private javax.swing.JTextField Txt2_23;
    private javax.swing.JTextField Txt2_31;
    private javax.swing.JTextField Txt2_32;
    private javax.swing.JTextField Txt2_33;
    private javax.swing.JTextField Txt3_11;
    private javax.swing.JTextField Txt3_12;
    private javax.swing.JTextField Txt3_13;
    private javax.swing.JTextField Txt3_21;
    private javax.swing.JTextField Txt3_22;
    private javax.swing.JTextField Txt3_23;
    private javax.swing.JTextField Txt3_31;
    private javax.swing.JTextField Txt3_32;
    private javax.swing.JTextField Txt3_33;
    private javax.swing.JTextField Txt4_11;
    private javax.swing.JTextField Txt4_12;
    private javax.swing.JTextField Txt4_13;
    private javax.swing.JTextField Txt4_21;
    private javax.swing.JTextField Txt4_22;
    private javax.swing.JTextField Txt4_23;
    private javax.swing.JTextField Txt4_31;
    private javax.swing.JTextField Txt4_32;
    private javax.swing.JTextField Txt4_33;
    private javax.swing.JTextField Txt5_11;
    private javax.swing.JTextField Txt5_12;
    private javax.swing.JTextField Txt5_13;
    private javax.swing.JTextField Txt5_21;
    private javax.swing.JTextField Txt5_22;
    private javax.swing.JTextField Txt5_23;
    private javax.swing.JTextField Txt5_31;
    private javax.swing.JTextField Txt5_32;
    private javax.swing.JTextField Txt5_33;
    private javax.swing.JTextField Txt6_11;
    private javax.swing.JTextField Txt6_12;
    private javax.swing.JTextField Txt6_13;
    private javax.swing.JTextField Txt6_21;
    private javax.swing.JTextField Txt6_22;
    private javax.swing.JTextField Txt6_23;
    private javax.swing.JTextField Txt6_31;
    private javax.swing.JTextField Txt6_32;
    private javax.swing.JTextField Txt6_33;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}
