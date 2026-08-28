import java.util.function.UnaryOperator;

public class gty extends gqr {
   private final gca<gxv> a;
   private final akv b;

   public gty(gsd.a $$0, gfa $$1) {
      super($$0);
      this.b = $$1.a().a((UnaryOperator<String>)($$0x -> "textures/entity/" + $$0x + ".png"));
      this.a = new gdm($$0.a($$1));
   }

   @Override
   protected gca<gxv> a() {
      return this.a;
   }

   @Override
   protected gmh b() {
      return this.a.a(this.b);
   }
}
