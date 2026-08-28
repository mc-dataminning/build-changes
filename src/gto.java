public class gto extends gsd<bvn, gzf> {
   private static final float a = 40.0F;
   private static final int b = 50;
   private final hbm h;
   private final azh i = azh.a();

   protected gto(gse.a $$0) {
      super($$0);
      this.h = $$0.b();
   }

   public gzf a() {
      return new gzf();
   }

   public void a(bvn $$0, gzf $$1, float $$2) {
      super.a($$0, $$1, $$2);
      cwp $$3 = $$0.m();
      $$1.a($$0, $$3, this.h);
   }

   public void a(gzf $$0, ffu $$1, gly $$2, int $$3) {
      if (!$$0.a.c()) {
         $$1.a();
         if ($$0.u <= 50.0F) {
            float $$4 = Math.min($$0.u, 50.0F) / 50.0F;
            $$1.b($$4, $$4, $$4);
         }

         float $$5 = ayz.h($$0.u * 40.0F);
         $$1.a(a.d.rotationDegrees($$5));
         gta.a($$1, $$2, 15728880, $$0, this.i);
         $$1.b();
      }
   }
}
