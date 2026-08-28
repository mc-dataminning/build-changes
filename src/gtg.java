public class gtg extends gti<clw, haf, gcq> {
   private static final aku a = aku.b("textures/entity/slime/magmacube.png");

   public gtg(gsc.a $$0) {
      super($$0, new gcq($$0.a(gfb.bx)), 0.25F);
   }

   protected int a(clw $$0, ji $$1) {
      return 15;
   }

   public aku a(haf $$0) {
      return a;
   }

   public haf b() {
      return new haf();
   }

   public void a(clw $$0, haf $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = ayz.h($$2, $$0.bY, $$0.bX);
      $$1.b = $$0.gp();
   }

   protected float b(haf $$0) {
      return (float)$$0.b * 0.25F;
   }

   protected void a(haf $$0, ffu $$1) {
      int $$2 = $$0.b;
      float $$3 = $$0.a / ((float)$$2 * 0.5F + 1.0F);
      float $$4 = 1.0F / ($$3 + 1.0F);
      $$1.b($$4 * (float)$$2, 1.0F / $$4 * (float)$$2, $$4 * (float)$$2);
   }
}
