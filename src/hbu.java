public class hbu extends har<hfm, gjc> {
   private static final alg a = alg.b("textures/entity/wither/wither_armor.png");
   private final gjc b;

   public hbu(gyq<hfm, gjc> $$0, gjk $$1) {
      super($$0);
      this.b = new gjc($$1.a(gjn.dT));
   }

   protected boolean a(hfm $$0) {
      return $$0.d;
   }

   @Override
   protected float a(float $$0) {
      return azm.b($$0 * 0.02F) * 3.0F;
   }

   @Override
   protected alg a() {
      return a;
   }

   protected gjc b() {
      return this.b;
   }
}
