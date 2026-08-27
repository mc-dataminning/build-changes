public class gjv<T extends bqt, M extends fqv<T> & fpu> extends gkc<T, M> {
   private final gae a;

   public gjv(ghm<T, M> $$0, gae $$1) {
      super($$0);
      this.a = $$1;
   }

   public void a(ewr $$0, gai $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      boolean $$10 = $$3.fr() == bqn.b;
      crs $$11 = $$10 ? $$3.eV() : $$3.eU();
      crs $$12 = $$10 ? $$3.eU() : $$3.eV();
      if (!$$11.d() || !$$12.d()) {
         $$0.a();
         if (this.c().e) {
            float $$13 = 0.5F;
            $$0.a(0.0F, 0.75F, 0.0F);
            $$0.b(0.5F, 0.5F, 0.5F);
         }

         this.a($$3, $$12, crp.c, bqn.b, $$0, $$1, $$2);
         this.a($$3, $$11, crp.b, bqn.a, $$0, $$1, $$2);
         $$0.b();
      }
   }

   protected void a(bqt $$0, crs $$1, crp $$2, bqn $$3, ewr $$4, gai $$5, int $$6) {
      if (!$$1.d()) {
         $$4.a();
         this.c().a($$3, $$4);
         $$4.a(a.b.rotationDegrees(-90.0F));
         $$4.a(a.d.rotationDegrees(180.0F));
         boolean $$7 = $$3 == bqn.a;
         $$4.a((float)($$7 ? -1 : 1) / 16.0F, 0.125F, -0.625F);
         this.a.a($$0, $$1, $$2, $$7, $$4, $$5, $$6);
         $$4.b();
      }
   }
}
