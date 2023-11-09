package demoMaven;

public class Greeting {
	String msg;

	@Override
	public String toString() {
		return "Greeting [msg=" + msg + "]";
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
}
