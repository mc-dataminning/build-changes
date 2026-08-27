public class gjh extends gjt<ceh, fqx<ceh>> {
   private final fqx<ceh> a;

   public gjh(ghd<ceh, fqx<ceh>> $$0, fti $$1) {
      super($$0);
      this.a = new fqx<>($$1.a(ftl.aq));
   }

   public void a(ewi $$0, fzz $$1, int $$2, ceh $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      crj $$10 = $$3.fP();
      if ($$10.f() instanceof cox $$11 && $$11.d() == cox.a.a) {
         this.c().a(this.a);
         this.a.a($$3, $$4, $$5, $$6);
         this.a.a($$3, $$4, $$5, $$7, $$8, $$9);
         float $$15;
         float $$16;
         float $$14;
         if ($$10.a(avk.ba)) {
            int $$13 = ctw.a($$10, -6265536);
            $$14 = (float)awu.b.b($$13) / 255.0F;
            $$15 = (float)awu.b.c($$13) / 255.0F;
            $$16 = (float)awu.b.d($$13) / 255.0F;
         } else {
            $$14 = 1.0F;
            $$15 = 1.0F;
            $$16 = 1.0F;
         }

         ewm $$20 = $$1.getBuffer(gah.e($$11.b()));
         this.a.a($$0, $$20, $$2, gla.d, $$14, $$15, $$16, 1.0F);
         return;
      }
   }
}
