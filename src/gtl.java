import java.util.function.UnaryOperator;

public class gtl extends gqe {
   private final gbm<gxh> a;
   private final alz b;

   public gtl(grq.a $$0, gem $$1) {
      super($$0);
      this.b = $$1.a().a((UnaryOperator<String>)($$0x -> "textures/entity/" + $$0x + ".png"));
      this.a = new gcy($$0.a($$1));
   }

   @Override
   protected gbm<gxh> a() {
      return this.a;
   }

   @Override
   protected glv b() {
      return this.a.a(this.b);
   }
}
