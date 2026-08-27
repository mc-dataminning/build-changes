public class fzr extends gak<bxe, fhp<bxe>> {
   private final fqv a;

   public fzr(fxx<bxe, fhp<bxe>> $$0, fqv $$1) {
      super($$0);
      this.a = $$1;
   }

   public void a(eob $$0, fqz $$1, int $$2, bxe $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      boolean $$10 = $$3.fn() == blf.b;
      $$0.a();
      float $$11 = 1.0F;
      float $$12 = -1.0F;
      float $$13 = atq.e($$3.dF()) / 60.0F;
      if ($$3.dF() < 0.0F) {
         $$0.a(0.0F, 1.0F - $$13 * 0.5F, -1.0F + $$13 * 0.5F);
      } else {
         $$0.a(0.0F, 1.0F + $$13 * 0.8F, -1.0F + $$13 * 0.2F);
      }

      clo $$14 = $$10 ? $$3.eU() : $$3.eV();
      this.a.a($$3, $$14, cll.h, false, $$0, $$1, $$2);
      $$0.b();
   }
}
