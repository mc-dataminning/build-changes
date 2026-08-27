public class fzl<T extends bky, M extends fhc<T> & fgd> extends fzs<T, M> {
   private final fqd a;

   public fzl(fxf<T, M> $$0, fqd $$1) {
      super($$0);
      this.a = $$1;
   }

   public void a(enk $$0, fqh $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      boolean $$10 = $$3.fm() == bks.b;
      clb $$11 = $$10 ? $$3.eT() : $$3.eS();
      clb $$12 = $$10 ? $$3.eS() : $$3.eT();
      if (!$$11.b() || !$$12.b()) {
         $$0.a();
         if (this.c().e) {
            float $$13 = 0.5F;
            $$0.a(0.0F, 0.75F, 0.0F);
            $$0.b(0.5F, 0.5F, 0.5F);
         }

         this.a($$3, $$12, cky.c, bks.b, $$0, $$1, $$2);
         this.a($$3, $$11, cky.b, bks.a, $$0, $$1, $$2);
         $$0.b();
      }
   }

   protected void a(bky $$0, clb $$1, cky $$2, bks $$3, enk $$4, fqh $$5, int $$6) {
      if (!$$1.b()) {
         $$4.a();
         this.c().a($$3, $$4);
         $$4.a(a.b.rotationDegrees(-90.0F));
         $$4.a(a.d.rotationDegrees(180.0F));
         boolean $$7 = $$3 == bks.a;
         $$4.a((float)($$7 ? -1 : 1) / 16.0F, 0.125F, -0.625F);
         this.a.a($$0, $$1, $$2, $$7, $$4, $$5, $$6);
         $$4.b();
      }
   }
}
