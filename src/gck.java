public class gck extends gcb {
   private final gco b;
   protected boolean a;

   gck(fyl $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, gco $$7) {
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
   public gbx b() {
      return gbx.c;
   }

   @Override
   public void a() {
      super.a();
      this.b(this.b);
   }

   public static class a implements gbw<ln> {
      private final gco a;

      public a(gco $$0) {
         this.a = $$0;
      }

      public gbt a(ln $$0, fyl $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         gck $$8 = new gck($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
         $$8.e(1.0F);
         $$8.a = true;
         return $$8;
      }
   }

   public static class b implements gbw<ln> {
      private final gco a;

      public b(gco $$0) {
         this.a = $$0;
      }

      public gbt a(ln $$0, fyl $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         gck $$8 = new gck($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
         $$8.e(1.0F);
         return $$8;
      }
   }
}
