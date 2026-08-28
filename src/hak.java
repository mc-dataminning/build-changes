public class hak extends har<hcs, ggc> {
   private static final alg a = alg.b("textures/entity/creeper/creeper_armor.png");
   private final ggc b;

   public hak(gyq<hcs, ggc> $$0, gjk $$1) {
      super($$0);
      this.b = new ggc($$1.a(gjn.ar));
   }

   protected boolean a(hcs $$0) {
      return $$0.b;
   }

   @Override
   protected float a(float $$0) {
      return $$0 * 0.01F;
   }

   @Override
   protected alg a() {
      return a;
   }

   protected ggc b() {
      return this.b;
   }
}
