public class gdc extends gct {
   private final gdg b;
   protected boolean a;

   gdc(fzd $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, gdg $$7) {
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
   public gcp b() {
      return gcp.c;
   }

   @Override
   public void a() {
      super.a();
      this.b(this.b);
   }

   public static class a implements gco<lq> {
      private final gdg a;

      public a(gdg $$0) {
         this.a = $$0;
      }

      public gcl a(lq $$0, fzd $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         gdc $$8 = new gdc($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
         $$8.e(1.0F);
         $$8.a = true;
         return $$8;
      }
   }

   public static class b implements gco<lq> {
      private final gdg a;

      public b(gdg $$0) {
         this.a = $$0;
      }

      public gcl a(lq $$0, fzd $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         gdc $$8 = new gdc($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
         $$8.e(1.0F);
         return $$8;
      }
   }
}
