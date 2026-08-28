public class gmh extends gmp<cjk, ftp<cjk>> {
   private static final alb a = new alb("textures/entity/creeper/creeper_armor.png");
   private final ftp<cjk> b;

   public gmh(gko<cjk, ftp<cjk>> $$0, fwr $$1) {
      super($$0);
      this.b = new ftp<>($$1.a(fwu.I));
   }

   @Override
   protected float a(float $$0) {
      return $$0 * 0.01F;
   }

   @Override
   protected alb a() {
      return a;
   }

   @Override
   protected ftv<cjk> b() {
      return this.b;
   }
}
