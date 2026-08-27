public class gjq extends gkc<ceo, frg<ceo>> {
   private final frg<ceo> a;

   public gjq(ghm<ceo, frg<ceo>> $$0, ftr $$1) {
      super($$0);
      this.a = new frg<>($$1.a(ftu.aq));
   }

   public void a(ewr $$0, gai $$1, int $$2, ceo $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      crs $$10 = $$3.fP();
      if ($$10.f() instanceof cpg $$11 && $$11.d() == cpg.a.a) {
         this.c().a(this.a);
         this.a.a($$3, $$4, $$5, $$6);
         this.a.a($$3, $$4, $$5, $$7, $$8, $$9);
         float $$15;
         float $$16;
         float $$14;
         if ($$10.a(avm.ba)) {
            int $$13 = cuf.a($$10, -6265536);
            $$14 = (float)aww.b.b($$13) / 255.0F;
            $$15 = (float)aww.b.c($$13) / 255.0F;
            $$16 = (float)aww.b.d($$13) / 255.0F;
         } else {
            $$14 = 1.0F;
            $$15 = 1.0F;
            $$16 = 1.0F;
         }

         ewv $$20 = $$1.getBuffer(gaq.e($$11.b()));
         this.a.a($$0, $$20, $$2, glj.d, $$14, $$15, $$16, 1.0F);
         return;
      }
   }
}
