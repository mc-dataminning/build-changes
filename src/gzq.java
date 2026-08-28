import java.util.function.UnaryOperator;

public class gzq extends gwj {
   private final ghn<hdn> a;
   private final alr g;

   public gzq(gxv.a $$0, gkp $$1) {
      super($$0);
      this.g = $$1.a().a((UnaryOperator<String>)($$0x -> "textures/entity/" + $$0x + ".png"));
      this.a = new gja($$0.a($$1));
   }

   @Override
   protected ghn<hdn> a() {
      return this.a;
   }

   @Override
   protected gry b() {
      return this.a.a(this.g);
   }
}
