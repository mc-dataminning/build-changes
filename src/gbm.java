public class gbm extends gcc {
   private final gbx a;

   gbm(fxv $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, gbx $$7) {
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
   public gbg b() {
      return gbg.c;
   }

   @Override
   public void a() {
      super.a();
      this.b(this.a);
   }

   public static record a(gbx a) implements gbf<lm> {
      public gbc a(lm $$0, fxv $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         gbm $$8 = new gbm($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
         $$8.e(1.0F);
         $$8.b($$5, $$6, $$7);
         $$8.a($$1.z.a(4) + 6);
         return $$8;
      }
   }
}
