public class gqd extends gmg<cqi, gus> {
   private final gio b;

   public gqd(gno.a $$0) {
      super($$0, gap.cI);
      this.b = $$0.d();
   }

   protected void a(gus $$0, dus $$1, fdi $$2, ghl $$3, int $$4) {
      float $$5 = $$0.C;
      if ($$5 > -1.0F && $$5 < 10.0F) {
         float $$6 = 1.0F - $$5 / 10.0F;
         $$6 = azf.a($$6, 0.0F, 1.0F);
         $$6 *= $$6;
         $$6 *= $$6;
         float $$7 = 1.0F + $$6 * 0.3F;
         $$2.b($$7, $$7, $$7);
      }

      a(this.b, $$1, $$2, $$3, $$4, $$5 > -1.0F && (int)$$5 / 5 % 2 == 0);
   }

   public static void a(gio $$0, dus $$1, fdi $$2, ghl $$3, int $$4, boolean $$5) {
      int $$6;
      if ($$5) {
         $$6 = gwx.a(gwx.a(1.0F), 10);
      } else {
         $$6 = gwx.d;
      }

      $$0.a($$1, $$2, $$3, $$4, $$6);
   }

   public gus a() {
      return new gus();
   }

   public void a(cqi $$0, gus $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.C = $$0.G() > -1 ? (float)$$0.G() - $$2 + 1.0F : -1.0F;
   }
}
