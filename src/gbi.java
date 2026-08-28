public class gbi extends gct {
   private final gco a;

   protected gbi(fyl $$0, double $$1, double $$2, double $$3, gco $$4) {
      super($$0, $$1, $$2, $$3);
      this.a = $$4;
      this.b($$4);
      this.t = 12 + this.r.a(4);
      this.D = 1.0F;
      this.b(1.0F, 1.0F);
   }

   @Override
   public gbx b() {
      return gbx.d;
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

   public static class a implements gbw<ln> {
      private final gco a;

      public a(gco $$0) {
         this.a = $$0;
      }

      public gbt a(ln $$0, fyl $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gbi($$1, $$2, $$3, $$4, this.a);
      }
   }

   public static class b implements gbw<ln> {
      private final gco a;

      public b(gco $$0) {
         this.a = $$0;
      }

      public gbt a(ln $$0, fyl $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         gbt $$8 = new gbi($$1, $$2, $$3, $$4, this.a);
         $$8.d(0.15F);
         return $$8;
      }
   }
}
