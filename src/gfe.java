public class gfe<T extends boi, M extends fmi<T> & fli> extends gfl<T, M> {
   private final fvp a;

   public gfe(gcv<T, M> $$0, fvp $$1) {
      super($$0);
      this.a = $$1;
   }

   public void a(esh $$0, fvt $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      boolean $$10 = $$3.fm() == boc.b;
      cpd $$11 = $$10 ? $$3.eU() : $$3.eT();
      cpd $$12 = $$10 ? $$3.eT() : $$3.eU();
      if (!$$11.b() || !$$12.b()) {
         $$0.a();
         if (this.c().e) {
            float $$13 = 0.5F;
            $$0.a(0.0F, 0.75F, 0.0F);
            $$0.b(0.5F, 0.5F, 0.5F);
         }

         this.a($$3, $$12, cpa.c, boc.b, $$0, $$1, $$2);
         this.a($$3, $$11, cpa.b, boc.a, $$0, $$1, $$2);
         $$0.b();
      }
   }

   protected void a(boi $$0, cpd $$1, cpa $$2, boc $$3, esh $$4, fvt $$5, int $$6) {
      if (!$$1.b()) {
         $$4.a();
         this.c().a($$3, $$4);
         $$4.a(a.b.rotationDegrees(-90.0F));
         $$4.a(a.d.rotationDegrees(180.0F));
         boolean $$7 = $$3 == boc.a;
         $$4.a((float)($$7 ? -1 : 1) / 16.0F, 0.125F, -0.625F);
         this.a.a($$0, $$1, $$2, $$7, $$4, $$5, $$6);
         $$4.b();
      }
   }
}
