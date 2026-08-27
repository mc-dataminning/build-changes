public class gfp extends geg<clb> {
   private final fym f;

   public gfp(gdb.a $$0) {
      super($$0, fre.bG);
      this.f = $$0.c();
   }

   protected void a(clb $$0, float $$1, dnb $$2, eub $$3, fxs $$4, int $$5) {
      int $$6 = $$0.C();
      if ($$6 > -1 && (float)$$6 - $$1 + 1.0F < 10.0F) {
         float $$7 = 1.0F - ((float)$$6 - $$1 + 1.0F) / 10.0F;
         $$7 = aww.a($$7, 0.0F, 1.0F);
         $$7 *= $$7;
         $$7 *= $$7;
         float $$8 = 1.0F + $$7 * 0.3F;
         $$3.b($$8, $$8, $$8);
      }

      a(this.f, $$2, $$3, $$4, $$5, $$6 > -1 && $$6 / 5 % 2 == 0);
   }

   public static void a(fym $$0, dnb $$1, eub $$2, fxs $$3, int $$4, boolean $$5) {
      int $$6;
      if ($$5) {
         $$6 = git.a(git.a(1.0F), 10);
      } else {
         $$6 = git.d;
      }

      $$0.a($$1, $$2, $$3, $$4, $$6);
   }
}
