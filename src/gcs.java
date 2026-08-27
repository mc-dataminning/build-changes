public class gcs extends gdl<byk, fke<byk>> {
   private final ftp a;

   public gcs(gav<byk, fke<byk>> $$0, ftp $$1) {
      super($$0);
      this.a = $$1;
   }

   public void a(eqk $$0, ftt $$1, int $$2, byk $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      boolean $$10 = $$3.fm() == bmi.b;
      $$0.a();
      float $$11 = 1.0F;
      float $$12 = -1.0F;
      float $$13 = aup.e($$3.dD()) / 60.0F;
      if ($$3.dD() < 0.0F) {
         $$0.a(0.0F, 1.0F - $$13 * 0.5F, -1.0F + $$13 * 0.5F);
      } else {
         $$0.a(0.0F, 1.0F + $$13 * 0.8F, -1.0F + $$13 * 0.2F);
      }

      cng $$14 = $$10 ? $$3.eT() : $$3.eU();
      this.a.a($$3, $$14, cnd.h, false, $$0, $$1, $$2);
      $$0.b();
   }
}
