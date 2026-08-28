public class gpu extends gqk {
   private final gqf a;

   gpu(gmb $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, gqf $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      this.B = 0.96F;
      this.a = $$7;
      this.d(1.0F);
      this.n = false;
      this.b($$7);
   }

   @Override
   public int a(float $$0) {
      return 240;
   }

   @Override
   public gpo b() {
      return gpo.c;
   }

   @Override
   public void a() {
      super.a();
      this.b(this.a);
   }

   public static record a(gqf a) implements gpn<mc> {
      public gpk a(mc $$0, gmb $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         gpu $$8 = new gpu($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
         $$8.e(1.0F);
         $$8.b($$5, $$6, $$7);
         $$8.a($$1.A.a(4) + 6);
         return $$8;
      }
   }
}
