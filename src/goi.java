public class goi extends goq<cio, fvk<cio>> {
   private static final akt a = new akt("textures/entity/creeper/creeper_armor.png");
   private final fvk<cio> b;

   public goi(gmp<cio, fvk<cio>> $$0, fyo $$1) {
      super($$0);
      this.b = new fvk<>($$1.a(fyr.J));
   }

   @Override
   protected float a(float $$0) {
      return $$0 * 0.01F;
   }

   @Override
   protected akt a() {
      return a;
   }

   @Override
   protected fvq<cio> b() {
      return this.b;
   }
}
