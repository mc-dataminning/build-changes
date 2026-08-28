public class gbv extends gbm {
   private final gbz b;
   protected boolean a;

   gbv(fxx $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, gbz $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      this.b = $$7;
      this.d(1.5F);
      this.b($$7);
   }

   @Override
   public int a(float $$0) {
      return this.a ? 240 : super.a($$0);
   }

   @Override
   public gbi b() {
      return gbi.c;
   }

   @Override
   public void a() {
      super.a();
      this.b(this.b);
   }

   public static class a implements gbh<lm> {
      private final gbz a;

      public a(gbz $$0) {
         this.a = $$0;
      }

      public gbe a(lm $$0, fxx $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         gbv $$8 = new gbv($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
         $$8.e(1.0F);
         $$8.a = true;
         return $$8;
      }
   }

   public static class b implements gbh<lm> {
      private final gbz a;

      public b(gbz $$0) {
         this.a = $$0;
      }

      public gbe a(lm $$0, fxx $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         gbv $$8 = new gbv($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
         $$8.e(1.0F);
         return $$8;
      }
   }
}
