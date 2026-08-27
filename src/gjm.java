public class gjm<T extends bqo, M extends fqm<T> & fpl> extends gjt<T, M> {
   private final fzv a;

   public gjm(ghd<T, M> $$0, fzv $$1) {
      super($$0);
      this.a = $$1;
   }

   public void a(ewi $$0, fzz $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      boolean $$10 = $$3.fr() == bqi.b;
      crj $$11 = $$10 ? $$3.eV() : $$3.eU();
      crj $$12 = $$10 ? $$3.eU() : $$3.eV();
      if (!$$11.d() || !$$12.d()) {
         $$0.a();
         if (this.c().e) {
            float $$13 = 0.5F;
            $$0.a(0.0F, 0.75F, 0.0F);
            $$0.b(0.5F, 0.5F, 0.5F);
         }

         this.a($$3, $$12, crg.c, bqi.b, $$0, $$1, $$2);
         this.a($$3, $$11, crg.b, bqi.a, $$0, $$1, $$2);
         $$0.b();
      }
   }

   protected void a(bqo $$0, crj $$1, crg $$2, bqi $$3, ewi $$4, fzz $$5, int $$6) {
      if (!$$1.d()) {
         $$4.a();
         this.c().a($$3, $$4);
         $$4.a(a.b.rotationDegrees(-90.0F));
         $$4.a(a.d.rotationDegrees(180.0F));
         boolean $$7 = $$3 == bqi.a;
         $$4.a((float)($$7 ? -1 : 1) / 16.0F, 0.125F, -0.625F);
         this.a.a($$0, $$1, $$2, $$7, $$4, $$5, $$6);
         $$4.b();
      }
   }
}
