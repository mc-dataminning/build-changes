public class gxh extends gwd<haz, ges> {
   private static final akv a = akv.b("textures/entity/wither/wither_armor.png");
   private final ges b;

   public gxh(guc<haz, ges> $$0, gfa $$1) {
      super($$0);
      this.b = new ges($$1.a(gfd.dB));
   }

   protected boolean a(haz $$0) {
      return $$0.d;
   }

   @Override
   protected float a(float $$0) {
      return ayz.b($$0 * 0.02F) * 3.0F;
   }

   @Override
   protected akv a() {
      return a;
   }

   protected ges b() {
      return this.b;
   }
}
