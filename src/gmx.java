public class gmx extends gnj<chl, ful<chl>> {
   private final ful<chl> a;

   public gmx(gkt<chl, ful<chl>> $$0, fww $$1) {
      super($$0);
      this.a = new ful<>($$1.a(fwz.aq));
   }

   public void a(ezy $$0, gdo $$1, int $$2, chl $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      cup $$10 = $$3.fR();
      if ($$10.g() instanceof csd $$11 && $$11.d() == csd.a.a) {
         this.c().a(this.a);
         this.a.a($$3, $$4, $$5, $$6);
         this.a.a($$3, $$4, $$5, $$7, $$8, $$9);
         float $$15;
         float $$16;
         float $$14;
         if ($$10.a(awy.by)) {
            int $$13 = cxh.a($$10, -6265536);
            $$14 = (float)ayj.b.b($$13) / 255.0F;
            $$15 = (float)ayj.b.c($$13) / 255.0F;
            $$16 = (float)ayj.b.d($$13) / 255.0F;
         } else {
            $$14 = 1.0F;
            $$15 = 1.0F;
            $$16 = 1.0F;
         }

         fac $$20 = $$1.getBuffer(gdw.e($$11.b()));
         this.a.a($$0, $$20, $$2, goq.d, $$14, $$15, $$16, 1.0F);
         return;
      }
   }
}
