public class gug extends gqh<csk, gyx> {
   private final gmo b;

   public gug(grq.a $$0) {
      super($$0, gen.dd);
      this.b = $$0.d();
   }

   protected void a(gyx $$0, dxv $$1, fgs $$2, gll $$3, int $$4) {
      float $$5 = $$0.C;
      if ($$5 > -1.0F && $$5 < 10.0F) {
         float $$6 = 1.0F - $$5 / 10.0F;
         $$6 = bae.a($$6, 0.0F, 1.0F);
         $$6 *= $$6;
         $$6 *= $$6;
         float $$7 = 1.0F + $$6 * 0.3F;
         $$2.b($$7, $$7, $$7);
      }

      a(this.b, $$1, $$2, $$3, $$4, $$5 > -1.0F && (int)$$5 / 5 % 2 == 0);
   }

   public static void a(gmo $$0, dxv $$1, fgs $$2, gll $$3, int $$4, boolean $$5) {
      int $$6;
      if ($$5) {
         $$6 = hbc.a(hbc.a(1.0F), 10);
      } else {
         $$6 = hbc.d;
      }

      $$0.a($$1, $$2, $$3, $$4, $$6);
   }

   public gyx a() {
      return new gyx();
   }

   public void a(csk $$0, gyx $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.C = $$0.x() > -1 ? (float)$$0.x() - $$2 + 1.0F : -1.0F;
   }
}
