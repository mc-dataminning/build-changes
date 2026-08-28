import java.util.function.UnaryOperator;

public class gtz extends gqs {
   private final gcb<gxw> a;
   private final akv b;

   public gtz(gse.a $$0, gfb $$1) {
      super($$0);
      this.b = $$1.a().a((UnaryOperator<String>)($$0x -> "textures/entity/" + $$0x + ".png"));
      this.a = new gdn($$0.a($$1));
   }

   @Override
   protected gcb<gxw> a() {
      return this.a;
   }

   @Override
   protected gmi b() {
      return this.a.a(this.b);
   }
}
