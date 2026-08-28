public class gfe extends ggp {
   private final ggk a;

   protected gfe(gci $$0, double $$1, double $$2, double $$3, ggk $$4) {
      super($$0, $$1, $$2, $$3);
      this.a = $$4;
      this.b($$4);
      this.t = 12 + this.r.a(4);
      this.D = 1.0F;
      this.b(1.0F, 1.0F);
   }

   @Override
   public gft b() {
      return gft.b;
   }

   @Override
   public int a(float $$0) {
      return 15728880;
   }

   @Override
   public void a() {
      if (this.s++ >= this.t) {
         this.k();
      } else {
         this.b(this.a);
      }
   }

   public static class a implements gfs<lv> {
      private final ggk a;

      public a(ggk $$0) {
         this.a = $$0;
      }

      public gfp a(lv $$0, gci $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gfe($$1, $$2, $$3, $$4, this.a);
      }
   }

   public static class b implements gfs<lv> {
      private final ggk a;

      public b(ggk $$0) {
         this.a = $$0;
      }

      public gfp a(lv $$0, gci $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         gfp $$8 = new gfe($$1, $$2, $$3, $$4, this.a);
         $$8.d(0.15F);
         return $$8;
      }
   }
}
