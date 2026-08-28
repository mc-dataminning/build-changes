public class guh extends guj<cmr, hbg, gdq> {
   private static final aku a = aku.b("textures/entity/slime/magmacube.png");

   public guh(gtd.a $$0) {
      super($$0, new gdq($$0.a(ggb.bz)), 0.25F);
   }

   protected int a(cmr $$0, ji $$1) {
      return 15;
   }

   public aku a(hbg $$0) {
      return a;
   }

   public hbg b() {
      return new hbg();
   }

   public void a(cmr $$0, hbg $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = ayz.h($$2, $$0.bF, $$0.bE);
      $$1.b = $$0.gq();
   }

   protected float b(hbg $$0) {
      return (float)$$0.b * 0.25F;
   }

   protected void a(hbg $$0, fgr $$1) {
      int $$2 = $$0.b;
      float $$3 = $$0.a / ((float)$$2 * 0.5F + 1.0F);
      float $$4 = 1.0F / ($$3 + 1.0F);
      $$1.b($$4 * (float)$$2, 1.0F / $$4 * (float)$$2, $$4 * (float)$$2);
   }
}
