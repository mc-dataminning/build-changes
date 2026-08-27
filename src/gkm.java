public class gkm extends gky<cez, fsc<cez>> {
   private final fsc<cez> a;

   public gkm(gii<cez, fsc<cez>> $$0, fun $$1) {
      super($$0);
      this.a = new fsc<>($$1.a(fuq.aq));
   }

   public void a(exn $$0, gbe $$1, int $$2, cez $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      csd $$10 = $$3.fQ();
      if ($$10.f() instanceof cpr $$11 && $$11.d() == cpr.a.a) {
         this.c().a(this.a);
         this.a.a($$3, $$4, $$5, $$6);
         this.a.a($$3, $$4, $$5, $$7, $$8, $$9);
         float $$15;
         float $$16;
         float $$14;
         if ($$10.a(avw.ba)) {
            int $$13 = cut.a($$10, -6265536);
            $$14 = (float)axg.b.b($$13) / 255.0F;
            $$15 = (float)axg.b.c($$13) / 255.0F;
            $$16 = (float)axg.b.d($$13) / 255.0F;
         } else {
            $$14 = 1.0F;
            $$15 = 1.0F;
            $$16 = 1.0F;
         }

         exr $$20 = $$1.getBuffer(gbm.e($$11.b()));
         this.a.a($$0, $$20, $$2, gmf.d, $$14, $$15, $$16, 1.0F);
         return;
      }
   }
}
