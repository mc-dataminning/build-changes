public class guf extends gqg<csj, gyw> {
   private final gmn b;

   public guf(grp.a $$0) {
      super($$0, gem.dd);
      this.b = $$0.d();
   }

   protected void a(gyw $$0, dxu $$1, fgr $$2, glk $$3, int $$4) {
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

   public static void a(gmn $$0, dxu $$1, fgr $$2, glk $$3, int $$4, boolean $$5) {
      int $$6;
      if ($$5) {
         $$6 = hbb.a(hbb.a(1.0F), 10);
      } else {
         $$6 = hbb.d;
      }

      $$0.a($$1, $$2, $$3, $$4, $$6);
   }

   public gyw a() {
      return new gyw();
   }

   public void a(csj $$0, gyw $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.C = $$0.x() > -1 ? (float)$$0.x() - $$2 + 1.0F : -1.0F;
   }
}
