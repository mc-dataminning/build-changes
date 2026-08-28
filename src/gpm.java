public class gpm extends gri<buw> {
   private static final all a = all.b("textures/entity/squid/glow_squid.png");

   public gpm(gpa.a $$0, gbd $$1, gbd $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   public all a(gxb $$0) {
      return a;
   }

   protected int a(buw $$0, jh $$1) {
      int $$2 = (int)azn.b(0.0F, 15.0F, 1.0F - (float)$$0.y() / 10.0F);
      return $$2 == 15 ? 15 : Math.max($$2, super.a($$0, $$1));
   }
}
