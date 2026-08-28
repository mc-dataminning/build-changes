public class gtl extends gsa<bvl, gzc> {
   private static final float a = 40.0F;
   private static final int b = 50;
   private final hbi h;
   private final azg i = azg.a();

   protected gtl(gsb.a $$0) {
      super($$0);
      this.h = $$0.b();
   }

   public gzc a() {
      return new gzc();
   }

   public void a(bvl $$0, gzc $$1, float $$2) {
      super.a($$0, $$1, $$2);
      cwn $$3 = $$0.m();
      $$1.a($$0, $$3, this.h);
   }

   public void a(gzc $$0, ffs $$1, glv $$2, int $$3) {
      if (!$$0.a.c()) {
         $$1.a();
         if ($$0.u <= 50.0F) {
            float $$4 = Math.min($$0.u, 50.0F) / 50.0F;
            $$1.b($$4, $$4, $$4);
         }

         float $$5 = ayy.h($$0.u * 40.0F);
         $$1.a(a.d.rotationDegrees($$5));
         gsx.a($$1, $$2, 15728880, $$0, this.i);
         $$1.b();
      }
   }
}
