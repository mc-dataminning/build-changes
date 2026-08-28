public class goz extends gqk {
   private final gqf a;

   protected goz(gmb $$0, double $$1, double $$2, double $$3, gqf $$4) {
      super($$0, $$1, $$2, $$3);
      this.a = $$4;
      this.b($$4);
      this.t = 12 + this.r.a(4);
      this.D = 1.0F;
      this.b(1.0F, 1.0F);
   }

   @Override
   public gpo b() {
      return gpo.b;
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

   public static class a implements gpn<mc> {
      private final gqf a;

      public a(gqf $$0) {
         this.a = $$0;
      }

      public gpk a(mc $$0, gmb $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new goz($$1, $$2, $$3, $$4, this.a);
      }
   }

   public static class b implements gpn<mc> {
      private final gqf a;

      public b(gqf $$0) {
         this.a = $$0;
      }

      public gpk a(mc $$0, gmb $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         gpk $$8 = new goz($$1, $$2, $$3, $$4, this.a);
         $$8.d(0.15F);
         return $$8;
      }
   }
}
