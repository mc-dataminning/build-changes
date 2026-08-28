public class gma extends gnl {
   private final gng a;

   protected gma(gjd $$0, double $$1, double $$2, double $$3, gng $$4) {
      super($$0, $$1, $$2, $$3);
      this.a = $$4;
      this.b($$4);
      this.t = 12 + this.r.a(4);
      this.D = 1.0F;
      this.b(1.0F, 1.0F);
   }

   @Override
   public gmp b() {
      return gmp.b;
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

   public static class a implements gmo<mb> {
      private final gng a;

      public a(gng $$0) {
         this.a = $$0;
      }

      public gml a(mb $$0, gjd $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gma($$1, $$2, $$3, $$4, this.a);
      }
   }

   public static class b implements gmo<mb> {
      private final gng a;

      public b(gng $$0) {
         this.a = $$0;
      }

      public gml a(mb $$0, gjd $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         gml $$8 = new gma($$1, $$2, $$3, $$4, this.a);
         $$8.d(0.15F);
         return $$8;
      }
   }
}
