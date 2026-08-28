public class gas extends gcd {
   private final gby a;

   protected gas(fxw $$0, double $$1, double $$2, double $$3, gby $$4) {
      super($$0, $$1, $$2, $$3);
      this.a = $$4;
      this.b($$4);
      this.t = 12 + this.r.a(4);
      this.D = 1.0F;
      this.b(1.0F, 1.0F);
   }

   @Override
   public gbh b() {
      return gbh.d;
   }

   @Override
   public int a(float $$0) {
      return 15728880;
   }

   @Override
   public void a() {
      if (this.s++ >= this.t) {
         this.k();
      } else {
         this.b(this.a);
      }
   }

   public static class a implements gbg<lm> {
      private final gby a;

      public a(gby $$0) {
         this.a = $$0;
      }

      public gbd a(lm $$0, fxw $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gas($$1, $$2, $$3, $$4, this.a);
      }
   }

   public static class b implements gbg<lm> {
      private final gby a;

      public b(gby $$0) {
         this.a = $$0;
      }

      public gbd a(lm $$0, fxw $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         gbd $$8 = new gas($$1, $$2, $$3, $$4, this.a);
         $$8.d(0.15F);
         return $$8;
      }
   }
}
