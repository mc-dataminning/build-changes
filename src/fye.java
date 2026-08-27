public class fye extends fxv {
   private final fyi b;
   protected boolean a;

   fye(fuh $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, fyi $$7) {
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
   public fxr b() {
      return fxr.c;
   }

   @Override
   public void a() {
      super.a();
      this.b(this.b);
   }

   public static class a implements fxq<ko> {
      private final fyi a;

      public a(fyi $$0) {
         this.a = $$0;
      }

      public fxn a(ko $$0, fuh $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         fye $$8 = new fye($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
         $$8.e(1.0F);
         $$8.a = true;
         return $$8;
      }
   }

   public static class b implements fxq<ko> {
      private final fyi a;

      public b(fyi $$0) {
         this.a = $$0;
      }

      public fxn a(ko $$0, fuh $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         fye $$8 = new fye($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
         $$8.e(1.0F);
         return $$8;
      }
   }
}
