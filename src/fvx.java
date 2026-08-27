public class fvx extends fuo<cdz> {
   private final fpa f;

   public fvx(ftj.a $$0) {
      super($$0, fid.bA);
      this.f = $$0.c();
   }

   protected void a(cdz $$0, float $$1, dfl $$2, elr $$3, fog $$4, int $$5) {
      int $$6 = $$0.H();
      if ($$6 > -1 && (float)$$6 - $$1 + 1.0F < 10.0F) {
         float $$7 = 1.0F - ((float)$$6 - $$1 + 1.0F) / 10.0F;
         $$7 = ary.a($$7, 0.0F, 1.0F);
         $$7 *= $$7;
         $$7 *= $$7;
         float $$8 = 1.0F + $$7 * 0.3F;
         $$3.b($$8, $$8, $$8);
      }

      a(this.f, $$2, $$3, $$4, $$5, $$6 > -1 && $$6 / 5 % 2 == 0);
   }

   public static void a(fpa $$0, dfl $$1, elr $$2, fog $$3, int $$4, boolean $$5) {
      int $$6;
      if ($$5) {
         $$6 = fyx.a(fyx.a(1.0F), 10);
      } else {
         $$6 = fyx.d;
      }

      $$0.a($$1, $$2, $$3, $$4, $$6);
   }
}
