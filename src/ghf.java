public class ghf extends ggw {
   private final ghj b;
   protected boolean a;

   ghf(gdh $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, ghj $$7) {
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
   public ggs b() {
      return ggs.c;
   }

   @Override
   public void a() {
      super.a();
      this.b(this.b);
   }

   public static class a implements ggr<lw> {
      private final ghj a;

      public a(ghj $$0) {
         this.a = $$0;
      }

      public ggo a(lw $$0, gdh $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         ghf $$8 = new ghf($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
         $$8.e(1.0F);
         $$8.a = true;
         return $$8;
      }
   }

   public static class b implements ggr<lw> {
      private final ghj a;

      public b(ghj $$0) {
         this.a = $$0;
      }

      public ggo a(lw $$0, gdh $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         ghf $$8 = new ghf($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
         $$8.e(1.0F);
         return $$8;
      }
   }
}
