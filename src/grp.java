public class grp extends gns<crb, gwf> {
   private final gka b;

   public grp(gpa.a $$0) {
      super($$0, gcb.cI);
      this.b = $$0.d();
   }

   protected void a(gwf $$0, dvo $$1, fek $$2, gix $$3, int $$4) {
      float $$5 = $$0.C;
      if ($$5 > -1.0F && $$5 < 10.0F) {
         float $$6 = 1.0F - $$5 / 10.0F;
         $$6 = azn.a($$6, 0.0F, 1.0F);
         $$6 *= $$6;
         $$6 *= $$6;
         float $$7 = 1.0F + $$6 * 0.3F;
         $$2.b($$7, $$7, $$7);
      }

      a(this.b, $$1, $$2, $$3, $$4, $$5 > -1.0F && (int)$$5 / 5 % 2 == 0);
   }

   public static void a(gka $$0, dvo $$1, fek $$2, gix $$3, int $$4, boolean $$5) {
      int $$6;
      if ($$5) {
         $$6 = gyk.a(gyk.a(1.0F), 10);
      } else {
         $$6 = gyk.d;
      }

      $$0.a($$1, $$2, $$3, $$4, $$6);
   }

   public gwf a() {
      return new gwf();
   }

   public void a(crb $$0, gwf $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.C = $$0.G() > -1 ? (float)$$0.G() - $$2 + 1.0F : -1.0F;
   }
}
