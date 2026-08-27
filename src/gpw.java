public class gpw extends goq<chu, fyi<chu>> {
   private static final akt a = new akt("textures/entity/wither/wither_armor.png");
   private final fyi<chu> b;

   public gpw(gmp<chu, fyi<chu>> $$0, fyo $$1) {
      super($$0);
      this.b = new fyi<>($$1.a(fyr.cc));
   }

   @Override
   protected float a(float $$0) {
      return aym.b($$0 * 0.02F) * 3.0F;
   }

   @Override
   protected akt a() {
      return a;
   }

   @Override
   protected fvq<chu> b() {
      return this.b;
   }
}
