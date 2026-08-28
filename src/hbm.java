public class hbm extends hbt<hdv, ghf> {
   private static final alr a = alr.b("textures/entity/creeper/creeper_armor.png");
   private final ghf b;

   public hbm(gzs<hdv, ghf> $$0, gkn $$1) {
      super($$0);
      this.b = new ghf($$1.a(gkq.ar));
   }

   protected boolean a(hdv $$0) {
      return $$0.b;
   }

   @Override
   protected float a(float $$0) {
      return $$0 * 0.01F;
   }

   @Override
   protected alr a() {
      return a;
   }

   protected ghf b() {
      return this.b;
   }
}
