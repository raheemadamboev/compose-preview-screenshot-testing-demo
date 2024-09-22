package xyz.teamgravity.composepreviewscreenshottestingdemo

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import xyz.teamgravity.composepreviewscreenshottestingdemo.ui.LoginScreen

class LoginScreenTest {

    @Preview(showBackground = true)
    @Composable
    fun LoginScreenPreview() {
        LoginScreen()
    }
}