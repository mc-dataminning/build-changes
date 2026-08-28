public class gnm extends gny<cgx, fuz<cgx>> {
   private final fuz<cgx> a;

   public gnm(gli<cgx, fuz<cgx>> $$0, fxk $$1) {
      super($$0);
      this.a = new fuz<>($$1.a(fxn.aq));
   }

   public void a(fam $$0, ged $$1, int $$2, cgx $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      cuc $$10 = $$3.fO();
      if ($$10.g() instanceof crr $$11 && $$11.d() == crr.a.a) {
         this.c().a(this.a);
         this.a.a($$3, $$4, $$5, $$6);
         this.a.a($$3, $$4, $$5, $$7, $$8, $$9);
         float $$15;
         float $$16;
         float $$14;
         if ($$10.a(awf.by)) {
            int $$13 = cwt.a($$10, -6265536);
            $$14 = (float)axq.b.b($$13) / 255.0F;
            $$15 = (float)axq.b.c($$13) / 255.0F;
            $$16 = (float)axq.b.d($$13) / 255.0F;
         } else {
            $$14 = 1.0F;
            $$15 = 1.0F;
            $$16 = 1.0F;
         }

         faq $$20 = $$1.getBuffer(gel.e($$11.b()));
         this.a.a($$0, $$20, $$2, gpf.d, $$14, $$15, $$16, 1.0F);
         return;
      }
   }
}
