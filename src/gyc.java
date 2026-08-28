import java.util.function.UnaryOperator;

public class gyc extends guv {
   private final gfy<hby> a;
   private final alg g;

   public gyc(gwh.a $$0, gja $$1) {
      super($$0);
      this.g = $$1.a().a((UnaryOperator<String>)($$0x -> "textures/entity/" + $$0x + ".png"));
      this.a = new ghl($$0.a($$1));
   }

   @Override
   protected gfy<hby> a() {
      return this.a;
   }

   @Override
   protected gqk b() {
      return this.a.a(this.g);
   }
}
