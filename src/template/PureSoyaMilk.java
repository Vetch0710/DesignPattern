package template;

public class PureSoyaMilk extends SoyaMilk{

	@Override
	void addCondiments() {
		//空实现
	}

	//重写父类钩子方法----不添加配料
	@Override
	boolean customerWantCondiments() {
		return false;
	}
 
}
