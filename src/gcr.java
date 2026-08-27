public class gcr<T extends bml, M extends fjx<T> & fix> extends gcy<T, M> {
   private final ftd a;

   public gcr(gai<T, M> $$0, ftd $$1) {
      super($$0);
      this.a = $$1;
   }

   public void a(eqb $$0, fth $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      boolean $$10 = $$3.fm() == bmf.b;
      cmy $$11 = $$10 ? $$3.eU() : $$3.eT();
      cmy $$12 = $$10 ? $$3.eT() : $$3.eU();
      if (!$$11.b() || !$$12.b()) {
         $$0.a();
         if (this.c().e) {
            float $$13 = 0.5F;
            $$0.a(0.0F, 0.75F, 0.0F);
            $$0.b(0.5F, 0.5F, 0.5F);
         }

         this.a($$3, $$12, cmv.c, bmf.b, $$0, $$1, $$2);
         this.a($$3, $$11, cmv.b, bmf.a, $$0, $$1, $$2);
         $$0.b();
      }
   }

   protected void a(bml $$0, cmy $$1, cmv $$2, bmf $$3, eqb $$4, fth $$5, int $$6) {
      if (!$$1.b()) {
         $$4.a();
         this.c().a($$3, $$4);
         $$4.a(a.b.rotationDegrees(-90.0F));
         $$4.a(a.d.rotationDegrees(180.0F));
         boolean $$7 = $$3 == bmf.a;
         $$4.a((float)($$7 ? -1 : 1) / 16.0F, 0.125F, -0.625F);
         this.a.a($$0, $$1, $$2, $$7, $$4, $$5, $$6);
         $$4.b();
      }
   }
}
