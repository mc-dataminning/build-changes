public class gsq extends gsx<guw, fys> {
   private static final all a = all.b("textures/entity/creeper/creeper_armor.png");
   private final fys b;

   public gsq(gqw<guw, fys> $$0, gby $$1) {
      super($$0);
      this.b = new fys($$1.a(gcb.X));
   }

   protected boolean a(guw $$0) {
      return $$0.b;
   }

   @Override
   protected float a(float $$0) {
      return $$0 * 0.01F;
   }

   @Override
   protected all a() {
      return a;
   }

   protected fys b() {
      return this.b;
   }
}
