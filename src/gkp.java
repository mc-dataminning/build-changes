public class gkp extends gli<cdx, frw<cdx>> {
   private final gbk a;

   public gkp(gis<cdx, frw<cdx>> $$0, gbk $$1) {
      super($$0);
      this.a = $$1;
   }

   public void a(exx $$0, gbo $$1, int $$2, cdx $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      boolean $$10 = $$3.fs() == bru.b;
      $$0.a();
      float $$11 = 1.0F;
      float $$12 = -1.0F;
      float $$13 = axz.e($$3.dF()) / 60.0F;
      if ($$3.dF() < 0.0F) {
         $$0.a(0.0F, 1.0F - $$13 * 0.5F, -1.0F + $$13 * 0.5F);
      } else {
         $$0.a(0.0F, 1.0F + $$13 * 0.8F, -1.0F + $$13 * 0.2F);
      }

      csz $$14 = $$10 ? $$3.eV() : $$3.eW();
      this.a.a($$3, $$14, csw.h, false, $$0, $$1, $$2);
      $$0.b();
   }
}
