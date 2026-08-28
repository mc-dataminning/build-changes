public class gjv extends gjm {
   private final gjz b;
   protected boolean a;

   gjv(gfw $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, gjz $$7) {
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
   public gji b() {
      return gji.c;
   }

   @Override
   public void a() {
      super.a();
      this.b(this.b);
   }

   public static class a implements gjh<lx> {
      private final gjz a;

      public a(gjz $$0) {
         this.a = $$0;
      }

      public gje a(lx $$0, gfw $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         gjv $$8 = new gjv($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
         $$8.e(1.0F);
         $$8.a = true;
         return $$8;
      }
   }

   public static class b implements gjh<lx> {
      private final gjz a;

      public b(gjz $$0) {
         this.a = $$0;
      }

      public gje a(lx $$0, gfw $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         gjv $$8 = new gjv($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
         $$8.e(1.0F);
         return $$8;
      }
   }
}
