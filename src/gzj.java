public class gzj extends gvk<cuk, hed> {
   private final grp g;

   public gzj(gwt.a $$0) {
      super($$0, gjn.dy);
      this.g = $$0.d();
   }

   protected void a(hed $$0, eao $$1, fjy $$2, gqm $$3, int $$4) {
      float $$5 = $$0.n;
      if ($$5 > -1.0F && $$5 < 10.0F) {
         float $$6 = 1.0F - $$5 / 10.0F;
         $$6 = azm.a($$6, 0.0F, 1.0F);
         $$6 *= $$6;
         $$6 *= $$6;
         float $$7 = 1.0F + $$6 * 0.3F;
         $$2.b($$7, $$7, $$7);
      }

      a(this.g, $$1, $$2, $$3, $$4, $$5 > -1.0F && (int)$$5 / 5 % 2 == 0);
   }

   public static void a(grp $$0, eao $$1, fjy $$2, gqm $$3, int $$4, boolean $$5) {
      int $$6;
      if ($$5) {
         $$6 = hja.a(hja.a(1.0F), 10);
      } else {
         $$6 = hja.d;
      }

      $$0.a($$1, $$2, $$3, $$4, $$6);
   }

   public hed a() {
      return new hed();
   }

   public void a(cuk $$0, hed $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.n = $$0.q() > -1 ? (float)$$0.q() - $$2 + 1.0F : -1.0F;
   }
}
