public class ghf<T extends bpp, M extends foe<T> & fne> extends ghm<T, M> {
   private final fxo a;

   public ghf(gew<T, M> $$0, fxo $$1) {
      super($$0);
      this.a = $$1;
   }

   public void a(eub $$0, fxs $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      boolean $$10 = $$3.fr() == bpj.b;
      cqm $$11 = $$10 ? $$3.eV() : $$3.eU();
      cqm $$12 = $$10 ? $$3.eU() : $$3.eV();
      if (!$$11.b() || !$$12.b()) {
         $$0.a();
         if (this.c().e) {
            float $$13 = 0.5F;
            $$0.a(0.0F, 0.75F, 0.0F);
            $$0.b(0.5F, 0.5F, 0.5F);
         }

         this.a($$3, $$12, cqj.c, bpj.b, $$0, $$1, $$2);
         this.a($$3, $$11, cqj.b, bpj.a, $$0, $$1, $$2);
         $$0.b();
      }
   }

   protected void a(bpp $$0, cqm $$1, cqj $$2, bpj $$3, eub $$4, fxs $$5, int $$6) {
      if (!$$1.b()) {
         $$4.a();
         this.c().a($$3, $$4);
         $$4.a(a.b.rotationDegrees(-90.0F));
         $$4.a(a.d.rotationDegrees(180.0F));
         boolean $$7 = $$3 == bpj.a;
         $$4.a((float)($$7 ? -1 : 1) / 16.0F, 0.125F, -0.625F);
         this.a.a($$0, $$1, $$2, $$7, $$4, $$5, $$6);
         $$4.b();
      }
   }
}
