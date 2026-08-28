public class gbu extends gbl {
   private final gby b;
   protected boolean a;

   gbu(fxw $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, gby $$7) {
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
   public gbh b() {
      return gbh.c;
   }

   @Override
   public void a() {
      super.a();
      this.b(this.b);
   }

   public static class a implements gbg<lm> {
      private final gby a;

      public a(gby $$0) {
         this.a = $$0;
      }

      public gbd a(lm $$0, fxw $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         gbu $$8 = new gbu($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
         $$8.e(1.0F);
         $$8.a = true;
         return $$8;
      }
   }

   public static class b implements gbg<lm> {
      private final gby a;

      public b(gby $$0) {
         this.a = $$0;
      }

      public gbd a(lm $$0, fxw $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         gbu $$8 = new gbu($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
         $$8.e(1.0F);
         return $$8;
      }
   }
}
