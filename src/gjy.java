public class gjy extends gjp {
   private final gkc b;
   protected boolean a;

   gjy(gfz $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, gkc $$7) {
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
   public gjl b() {
      return gjl.c;
   }

   @Override
   public void a() {
      super.a();
      this.b(this.b);
   }

   public static class a implements gjk<lx> {
      private final gkc a;

      public a(gkc $$0) {
         this.a = $$0;
      }

      public gjh a(lx $$0, gfz $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         gjy $$8 = new gjy($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
         $$8.e(1.0F);
         $$8.a = true;
         return $$8;
      }
   }

   public static class b implements gjk<lx> {
      private final gkc a;

      public b(gkc $$0) {
         this.a = $$0;
      }

      public gjh a(lx $$0, gfz $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         gjy $$8 = new gjy($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
         $$8.e(1.0F);
         return $$8;
      }
   }
}
