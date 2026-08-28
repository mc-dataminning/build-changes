public class gun extends gtc<bwe, hae> {
   private static final float a = 40.0F;
   private static final int b = 50;
   private final hcl h;
   private final azh i = azh.a();

   protected gun(gtd.a $$0) {
      super($$0);
      this.h = $$0.b();
   }

   public hae a() {
      return new hae();
   }

   public void a(bwe $$0, hae $$1, float $$2) {
      super.a($$0, $$1, $$2);
      cxh $$3 = $$0.g();
      $$1.a($$0, $$3, this.h);
   }

   public void a(hae $$0, fgr $$1, gmx $$2, int $$3) {
      if (!$$0.a.c()) {
         $$1.a();
         if ($$0.u <= 50.0F) {
            float $$4 = Math.min($$0.u, 50.0F) / 50.0F;
            $$1.b($$4, $$4, $$4);
         }

         float $$5 = ayz.h($$0.u * 40.0F);
         $$1.a(a.d.rotationDegrees($$5));
         gtz.a($$1, $$2, 15728880, $$0, this.i);
         $$1.b();
      }
   }
}
