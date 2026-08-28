public class gbg extends gcr {
   private final gcm a;

   protected gbg(fyj $$0, double $$1, double $$2, double $$3, gcm $$4) {
      super($$0, $$1, $$2, $$3);
      this.a = $$4;
      this.b($$4);
      this.t = 12 + this.r.a(4);
      this.D = 1.0F;
      this.b(1.0F, 1.0F);
   }

   @Override
   public gbv b() {
      return gbv.d;
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

   public static class a implements gbu<ln> {
      private final gcm a;

      public a(gcm $$0) {
         this.a = $$0;
      }

      public gbr a(ln $$0, fyj $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gbg($$1, $$2, $$3, $$4, this.a);
      }
   }

   public static class b implements gbu<ln> {
      private final gcm a;

      public b(gcm $$0) {
         this.a = $$0;
      }

      public gbr a(ln $$0, fyj $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         gbr $$8 = new gbg($$1, $$2, $$3, $$4, this.a);
         $$8.d(0.15F);
         return $$8;
      }
   }
}
