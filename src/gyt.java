import java.util.function.UnaryOperator;

public class gyt extends gvm {
   private final ggp<hcq> a;
   private final alg g;

   public gyt(gwy.a $$0, gjr $$1) {
      super($$0);
      this.g = $$1.a().a((UnaryOperator<String>)($$0x -> "textures/entity/" + $$0x + ".png"));
      this.a = new gic($$0.a($$1));
   }

   @Override
   protected ggp<hcq> a() {
      return this.a;
   }

   @Override
   protected grc b() {
      return this.a.a(this.g);
   }
}
