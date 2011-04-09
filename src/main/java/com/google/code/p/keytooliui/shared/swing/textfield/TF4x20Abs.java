/*
 *
 * Copyright (c) 2001-2011 keyTool IUI Project.
 * LGPL License.
 * http://code.google.com/p/keytool-iui/
 *
 *
 * You shall not disclose such confidential information and shall use it only in
 * accordance with the terms of keyTool IUI Project's license agreement.
 *
 * THE SOFTWARE IS PROVIDED AND LICENSED "AS IS" WITHOUT WARRANTY OF ANY KIND,
 * EITHER EXPRESS OR IMPLIED, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE. 
 *
 * LICENSE FOR THE SOFTWARE DOES NOT INCLUDE ANY CONSIDERATION FOR ASSUMPTION OF RISK
 * BY KEYTOOL IUI PROJECT, AND KEYTOOL IUI PROJECT DISCLAIMS ANY AND ALL LIABILITY FOR INCIDENTAL
 * OR CONSEQUENTIAL DAMAGES ARISING OUT OF THE USE OR OPERATION OF OR INABILITY
 * TO USE THE SOFTWARE, EVEN IF KEYTOOL IUI PROJECT HAS BEEN ADVISED OF THE POSSIBILITY OF SUCH DAMAGES. 
 *
 */
 
 
 package com.google.code.p.keytooliui.shared.swing.textfield;

/**
    known subclasses:
    . TF4x20SelString

    textfield:
    . columns = 4
    . height = 20
**/


public abstract class TF4x20Abs extends TFAbstract
{  
    // --------------------
    // PRIVATE STATIC FINAL
    
    private static final int _f_s_intColumns = 4; //30; //4;
    private static final int _f_s_intH = 20;
    
    // ---------
    // PROTECTED
    
    protected TF4x20Abs(String strTip, javax.swing.event.DocumentListener docListenerParent)
    {
        super(strTip, TF4x20Abs._f_s_intColumns, TF4x20Abs._f_s_intH, docListenerParent);
    }
}