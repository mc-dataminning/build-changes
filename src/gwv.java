public class gwv extends gsw<csv, hbo> {
   private final gpc g;

   public gwv(guf.a $$0) {
      super($$0, ghc.du);
      this.g = $$0.d();
   }

   protected void a(hbo $$0, dym $$1, fho $$2, gny $$3, int $$4) {
      float $$5 = $$0.n;
      if ($$5 > -1.0F && $$5 < 10.0F) {
         float $$6 = 1.0F - $$5 / 10.0F;
         $$6 = azk.a($$6, 0.0F, 1.0F);
         $$6 *= $$6;
         $$6 *= $$6;
         float $$7 = 1.0F + $$6 * 0.3F;
         $$2.b($$7, $$7, $$7);
      }

      a(this.g, $$1, $$2, $$3, $$4, $$5 > -1.0F && (int)$$5 / 5 % 2 == 0);
   }

   public static void a(gpc $$0, dym $$1, fho $$2, gny $$3, int $$4, boolean $$5) {
      int $$6;
      if ($$5) {
         $$6 = hgi.a(hgi.a(1.0F), 10);
      } else {
         $$6 = hgi.d;
      }

      $$0.a($$1, $$2, $$3, $$4, $$6);
   }

   public hbo a() {
      return new hbo();
   }

   public void a(csv $$0, hbo $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.n = $$0.q() > -1 ? (float)$$0.q() - $$2 + 1.0F : -1.0F;
   }
}
