public class fvx extends fvo {
   private final fwb b;
   protected boolean a;

   fvx(fsa $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, fwb $$7) {
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
   public fvk b() {
      return fvk.c;
   }

   @Override
   public void a() {
      super.a();
      this.b(this.b);
   }

   public static class a implements fvj<kf> {
      private final fwb a;

      public a(fwb $$0) {
         this.a = $$0;
      }

      public fvg a(kf $$0, fsa $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         fvx $$8 = new fvx($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
         $$8.e(1.0F);
         $$8.a = true;
         return $$8;
      }
   }

   public static class b implements fvj<kf> {
      private final fwb a;

      public b(fwb $$0) {
         this.a = $$0;
      }

      public fvg a(kf $$0, fsa $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         fvx $$8 = new fvx($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
         $$8.e(1.0F);
         return $$8;
      }
   }
}
