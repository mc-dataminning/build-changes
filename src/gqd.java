public class gqd extends gpu {
   private final gqh b;
   protected boolean a;

   gqd(gmd $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, gqh $$7) {
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
   public gpq b() {
      return gpq.c;
   }

   @Override
   public void a() {
      super.a();
      this.b(this.b);
   }

   public static class a implements gpp<md> {
      private final gqh a;

      public a(gqh $$0) {
         this.a = $$0;
      }

      public gpm a(md $$0, gmd $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         gqd $$8 = new gqd($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
         $$8.e(1.0F);
         $$8.a = true;
         return $$8;
      }
   }

   public static class b implements gpp<md> {
      private final gqh a;

      public b(gqh $$0) {
         this.a = $$0;
      }

      public gpm a(md $$0, gmd $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         gqd $$8 = new gqd($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
         $$8.e(1.0F);
         return $$8;
      }
   }
}
