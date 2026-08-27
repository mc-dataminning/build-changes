public class gde extends gcb<cbc, fmf<cbc>> {
   private static final ahd a = new ahd("textures/entity/wither/wither_armor.png");
   private final fmf<cbc> b;

   public gde(gaa<cbc, fmf<cbc>> $$0, fml $$1) {
      super($$0);
      this.b = new fmf<>($$1.a(fmo.bT));
   }

   @Override
   protected float a(float $$0) {
      return aui.b($$0 * 0.02F) * 3.0F;
   }

   @Override
   protected ahd a() {
      return a;
   }

   @Override
   protected fjp<cbc> b() {
      return this.b;
   }
}
