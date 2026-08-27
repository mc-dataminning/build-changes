public class fzy<T extends blg, M extends fhp<T> & fgq> extends gaf<T, M> {
   private final fqq a;

   public fzy(fxs<T, M> $$0, fqq $$1) {
      super($$0);
      this.a = $$1;
   }

   public void a(enw $$0, fqu $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      boolean $$10 = $$3.fn() == bla.b;
      clj $$11 = $$10 ? $$3.eV() : $$3.eU();
      clj $$12 = $$10 ? $$3.eU() : $$3.eV();
      if (!$$11.b() || !$$12.b()) {
         $$0.a();
         if (this.c().e) {
            float $$13 = 0.5F;
            $$0.a(0.0F, 0.75F, 0.0F);
            $$0.b(0.5F, 0.5F, 0.5F);
         }

         this.a($$3, $$12, clg.c, bla.b, $$0, $$1, $$2);
         this.a($$3, $$11, clg.b, bla.a, $$0, $$1, $$2);
         $$0.b();
      }
   }

   protected void a(blg $$0, clj $$1, clg $$2, bla $$3, enw $$4, fqu $$5, int $$6) {
      if (!$$1.b()) {
         $$4.a();
         this.c().a($$3, $$4);
         $$4.a(a.b.rotationDegrees(-90.0F));
         $$4.a(a.d.rotationDegrees(180.0F));
         boolean $$7 = $$3 == bla.a;
         $$4.a((float)($$7 ? -1 : 1) / 16.0F, 0.125F, -0.625F);
         this.a.a($$0, $$1, $$2, $$7, $$4, $$5, $$6);
         $$4.b();
      }
   }
}
