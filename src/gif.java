public class gif extends ggw<cmh> {
   private final gbc f;

   public gif(gfr.a $$0) {
      super($$0, ftu.bG);
      this.f = $$0.c();
   }

   protected void a(cmh $$0, float $$1, dpi $$2, ewr $$3, gai $$4, int $$5) {
      int $$6 = $$0.C();
      if ($$6 > -1 && (float)$$6 - $$1 + 1.0F < 10.0F) {
         float $$7 = 1.0F - ((float)$$6 - $$1 + 1.0F) / 10.0F;
         $$7 = axm.a($$7, 0.0F, 1.0F);
         $$7 *= $$7;
         $$7 *= $$7;
         float $$8 = 1.0F + $$7 * 0.3F;
         $$3.b($$8, $$8, $$8);
      }

      a(this.f, $$2, $$3, $$4, $$5, $$6 > -1 && $$6 / 5 % 2 == 0);
   }

   public static void a(gbc $$0, dpi $$1, ewr $$2, gai $$3, int $$4, boolean $$5) {
      int $$6;
      if ($$5) {
         $$6 = glj.a(glj.a(1.0F), 10);
      } else {
         $$6 = glj.d;
      }

      $$0.a($$1, $$2, $$3, $$4, $$6);
   }
}
