/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Baka.java
 *
 * Created on 2009/05/09, 9:13:54
 */

package open.dolphin.order;

/**
 *
 * @author kushiro
 */
public class InjectionViewText extends javax.swing.JPanel implements IInjectionView {

    /** Creates new form Baka */
    public InjectionViewText() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        infoLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        setTable = new javax.swing.JTable();
        techChk = new javax.swing.JCheckBox();
        stampNameField = new javax.swing.JTextField();
        okCntBtn = new javax.swing.JButton();
        okBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        searchTextField = new javax.swing.JTextField();
        rtBtn = new javax.swing.JCheckBox();
        countField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        searchResultTable = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        numberCombo = new javax.swing.JComboBox();
        noChargeChk = new javax.swing.JCheckBox();
        partialChk = new javax.swing.JCheckBox();

        setBorder(javax.swing.BorderFactory.createEmptyBorder(12, 12, 11, 11));
        setMaximumSize(new java.awt.Dimension(1024, 768));
        setMinimumSize(new java.awt.Dimension(700, 600));
        setPreferredSize(new java.awt.Dimension(700, 600));

        infoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/open/dolphin/resources/images/about_16.gif"))); // NOI18N
        infoLabel.setText("info"); // NOI18N

        setTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        setTable.setToolTipText("セット内容は Drag & Drop で順番を入れ替えることができます。"); // NOI18N
        jScrollPane1.setViewportView(setTable);

        techChk.setText("診療行為"); // NOI18N
        techChk.setToolTipText("診療行為がセットにあればチェックされます。"); // NOI18N
        techChk.setEnabled(false);

        stampNameField.setBackground(new java.awt.Color(255, 255, 0));
        stampNameField.setToolTipText("セット名を入力します。"); // NOI18N

        okCntBtn.setText("展開継続"); // NOI18N
        okCntBtn.setToolTipText("セットをカルテに展開し継続します。"); // NOI18N

        okBtn.setText("展開"); // NOI18N
        okBtn.setToolTipText("セットをカルテに展開し終了します。"); // NOI18N

        clearBtn.setText("クリア"); // NOI18N
        clearBtn.setToolTipText("セット内容をクリアします。"); // NOI18N

        deleteBtn.setText("削除"); // NOI18N
        deleteBtn.setToolTipText("選択した項目を削除します。"); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/open/dolphin/resources/images/srch_16.gif"))); // NOI18N

        searchTextField.setToolTipText("検索したい点数マスタ項目を入力します。"); // NOI18N

        rtBtn.setText("RT"); // NOI18N
        rtBtn.setToolTipText("チェックすると入力中にリアルタイムで検索します。"); // NOI18N

        countField.setToolTipText("検索結果の件数を表示します。"); // NOI18N

        jLabel4.setText("件数"); // NOI18N

        searchResultTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(searchResultTable);

        jLabel5.setText("数量"); // NOI18N

        numberCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", " " }));

        noChargeChk.setText("手技料なし"); // NOI18N
        noChargeChk.setToolTipText("ORCAで作成したセットが手技料なしの場合チェックされます。"); // NOI18N

        partialChk.setText("部分一致"); // NOI18N
        partialChk.setToolTipText("部分一致検索をします。"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jScrollPane2)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(infoLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(noChargeChk)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(techChk))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(stampNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numberCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addComponent(deleteBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clearBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(okBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(okCntBtn))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rtBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(partialChk)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(countField, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(techChk)
                            .addComponent(noChargeChk))
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(infoLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteBtn)
                    .addComponent(clearBtn)
                    .addComponent(okBtn)
                    .addComponent(okCntBtn)
                    .addComponent(stampNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(numberCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rtBtn)
                        .addComponent(partialChk)
                        .addComponent(jLabel4)
                        .addComponent(countField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(13, 13, 13)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearBtn;
    private javax.swing.JTextField countField;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel infoLabel;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JCheckBox noChargeChk;
    private javax.swing.JComboBox numberCombo;
    private javax.swing.JButton okBtn;
    private javax.swing.JButton okCntBtn;
    private javax.swing.JCheckBox partialChk;
    private javax.swing.JCheckBox rtBtn;
    private javax.swing.JTable searchResultTable;
    private javax.swing.JTextField searchTextField;
    private javax.swing.JTable setTable;
    private javax.swing.JTextField stampNameField;
    private javax.swing.JCheckBox techChk;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the clearBtn
     */
    public javax.swing.JButton getClearBtn() {
        return clearBtn;
    }

    /**
     * @return the countField
     */
    public javax.swing.JTextField getCountField() {
        return countField;
    }

    /**
     * @return the deleteBtn
     */
    public javax.swing.JButton getDeleteBtn() {
        return deleteBtn;
    }

    /**
     * @return the infoLabel
     */
    public javax.swing.JLabel getInfoLabel() {
        return infoLabel;
    }

    /**
     * @return the numberCombo
     */
    public javax.swing.JComboBox getNumberCombo() {
        return numberCombo;
    }

    /**
     * @return the okBtn
     */
    public javax.swing.JButton getOkBtn() {
        return okBtn;
    }

    /**
     * @return the okCntBtn
     */
    public javax.swing.JButton getOkCntBtn() {
        return okCntBtn;
    }

    /**
     * @return the rtBtn
     */
    public javax.swing.JCheckBox getRtBtn() {
        return rtBtn;
    }

    /**
     * @return the searchResultTabel
     */
    public javax.swing.JTable getSearchResultTable() {
        return searchResultTable;
    }

    /**
     * @return the searchTextField
     */
    public javax.swing.JTextField getSearchTextField() {
        return searchTextField;
    }

    /**
     * @return the stampNameField
     */
    public javax.swing.JTextField getStampNameField() {
        return stampNameField;
    }

    /**
     * @return the techChk
     */
    public javax.swing.JCheckBox getTechChk() {
        return techChk;
    }

    /**
     * @return the setTable
     */
    public javax.swing.JTable getSetTable() {
        return setTable;
    }

    public javax.swing.JCheckBox getNoChargeChk() {
        return noChargeChk;
    }

    public javax.swing.JCheckBox getPartialChk() {
        return partialChk;
    }

}