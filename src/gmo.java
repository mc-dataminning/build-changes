public class gmo extends gmw<cjr, ftw<cjr>> {
   private static final alf a = new alf("textures/entity/creeper/creeper_armor.png");
   private final ftw<cjr> b;

   public gmo(gkv<cjr, ftw<cjr>> $$0, fwy $$1) {
      super($$0);
      this.b = new ftw<>($$1.a(fxb.I));
   }

   @Override
   protected float a(float $$0) {
      return $$0 * 0.01F;
   }

   @Override
   protected alf a() {
      return a;
   }

   @Override
   protected fuc<cjr> b() {
      return this.b;
   }
}
