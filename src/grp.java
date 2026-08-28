public class grp extends grw<gtv, fxr> {
   private static final alh a = alh.b("textures/entity/creeper/creeper_armor.png");
   private final fxr b;

   public grp(gpv<gtv, fxr> $$0, gax $$1) {
      super($$0);
      this.b = new fxr($$1.a(gba.X));
   }

   protected boolean a(gtv $$0) {
      return $$0.b;
   }

   @Override
   protected float a(float $$0) {
      return $$0 * 0.01F;
   }

   @Override
   protected alh a() {
      return a;
   }

   protected fxr b() {
      return this.b;
   }
}
