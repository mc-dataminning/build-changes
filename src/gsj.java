public class gsj extends grh<gvx, fzz> {
   private static final alc a = alc.b("textures/entity/wither/wither_armor.png");
   private final fzz b;

   public gsj(gpf<gvx, fzz> $$0, gah $$1) {
      super($$0);
      this.b = new fzz($$1.a(gak.da));
   }

   protected boolean a(gvx $$0) {
      return $$0.d;
   }

   @Override
   protected float a(float $$0) {
      return azd.b($$0 * 0.02F) * 3.0F;
   }

   @Override
   protected alc a() {
      return a;
   }

   protected fzz b() {
      return this.b;
   }
}
