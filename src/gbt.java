public class gbt extends gbk {
   private final gbx b;
   protected boolean a;

   gbt(fxv $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, gbx $$7) {
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
   public gbg b() {
      return gbg.c;
   }

   @Override
   public void a() {
      super.a();
      this.b(this.b);
   }

   public static class a implements gbf<lm> {
      private final gbx a;

      public a(gbx $$0) {
         this.a = $$0;
      }

      public gbc a(lm $$0, fxv $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         gbt $$8 = new gbt($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
         $$8.e(1.0F);
         $$8.a = true;
         return $$8;
      }
   }

   public static class b implements gbf<lm> {
      private final gbx a;

      public b(gbx $$0) {
         this.a = $$0;
      }

      public gbc a(lm $$0, fxv $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         gbt $$8 = new gbt($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
         $$8.e(1.0F);
         return $$8;
      }
   }
}
