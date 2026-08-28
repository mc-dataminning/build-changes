public class gwu extends gxb<gzc, gcs> {
   private static final aku a = aku.b("textures/entity/creeper/creeper_armor.png");
   private final gcs b;

   public gwu(gva<gzc, gcs> $$0, gfy $$1) {
      super($$0);
      this.b = new gcs($$1.a(ggb.al));
   }

   protected boolean a(gzc $$0) {
      return $$0.b;
   }

   @Override
   protected float a(float $$0) {
      return $$0 * 0.01F;
   }

   @Override
   protected aku a() {
      return a;
   }

   protected gcs b() {
      return this.b;
   }
}
