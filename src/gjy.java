public class gjy extends gkc<ccx, fru<ccx>> {
   private final gae a;

   public gjy(ghm<ccx, fru<ccx>> $$0, gae $$1) {
      super($$0);
      this.a = $$1;
   }

   public void a(ewr $$0, gai $$1, int $$2, ccx $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      crs $$10 = $$3.d(bqh.a);
      if ($$3.y() && !$$3.gF()) {
         float $$11 = -0.6F;
         float $$12 = 1.4F;
         if ($$3.gt()) {
            $$11 -= 0.2F * axm.a($$7 * 0.6F) + 0.2F;
            $$12 -= 0.09F * axm.a($$7 * 0.6F);
         }

         $$0.a();
         $$0.a(0.1F, $$12, $$11);
         this.a.a($$3, $$10, crp.h, false, $$0, $$1, $$2);
         $$0.b();
      }
   }
}
