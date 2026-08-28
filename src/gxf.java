import java.util.function.UnaryOperator;

public class gxf extends gty {
   private final gfd<hbb> a;
   private final ale g;

   public gxf(gvk.a $$0, gie $$1) {
      super($$0);
      this.g = $$1.a().a((UnaryOperator<String>)($$0x -> "textures/entity/" + $$0x + ".png"));
      this.a = new ggq($$0.a($$1));
   }

   @Override
   protected gfd<hbb> a() {
      return this.a;
   }

   @Override
   protected gpn b() {
      return this.a.a(this.g);
   }
}
