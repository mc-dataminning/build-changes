public class fxs extends fyl<bwc, ffs<bwc>> {
   private final fox a;

   public fxs(fvy<bwc, ffs<bwc>> $$0, fox $$1) {
      super($$0);
      this.a = $$1;
   }

   public void a(emh $$0, fpb $$1, int $$2, bwc $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      boolean $$10 = $$3.fm() == bkd.b;
      $$0.a();
      float $$11 = 1.0F;
      float $$12 = -1.0F;
      float $$13 = asy.e($$3.dD()) / 60.0F;
      if ($$3.dD() < 0.0F) {
         $$0.a(0.0F, 1.0F - $$13 * 0.5F, -1.0F + $$13 * 0.5F);
      } else {
         $$0.a(0.0F, 1.0F + $$13 * 0.8F, -1.0F + $$13 * 0.2F);
      }

      ckj $$14 = $$10 ? $$3.eS() : $$3.eT();
      this.a.a($$3, $$14, ckg.h, false, $$0, $$1, $$2);
      $$0.b();
   }
}
