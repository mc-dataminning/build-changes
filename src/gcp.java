public class gcp<T extends bmk, M extends fjv<T> & fiv> extends gcw<T, M> {
   private final ftb a;

   public gcp(gag<T, M> $$0, ftb $$1) {
      super($$0);
      this.a = $$1;
   }

   public void a(epz $$0, ftf $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      boolean $$10 = $$3.fm() == bme.b;
      cmx $$11 = $$10 ? $$3.eU() : $$3.eT();
      cmx $$12 = $$10 ? $$3.eT() : $$3.eU();
      if (!$$11.b() || !$$12.b()) {
         $$0.a();
         if (this.c().e) {
            float $$13 = 0.5F;
            $$0.a(0.0F, 0.75F, 0.0F);
            $$0.b(0.5F, 0.5F, 0.5F);
         }

         this.a($$3, $$12, cmu.c, bme.b, $$0, $$1, $$2);
         this.a($$3, $$11, cmu.b, bme.a, $$0, $$1, $$2);
         $$0.b();
      }
   }

   protected void a(bmk $$0, cmx $$1, cmu $$2, bme $$3, epz $$4, ftf $$5, int $$6) {
      if (!$$1.b()) {
         $$4.a();
         this.c().a($$3, $$4);
         $$4.a(a.b.rotationDegrees(-90.0F));
         $$4.a(a.d.rotationDegrees(180.0F));
         boolean $$7 = $$3 == bme.a;
         $$4.a((float)($$7 ? -1 : 1) / 16.0F, 0.125F, -0.625F);
         this.a.a($$0, $$1, $$2, $$7, $$4, $$5, $$6);
         $$4.b();
      }
   }
}
