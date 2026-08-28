public class ghy extends ghk {
   private static final int a = 12235202;

   protected ghy(gfk $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, float $$7, gjn $$8) {
      super($$0, $$1, $$2, $$3, 0.7F, 0.6F, 0.7F, $$4, $$5 + 0.15F, $$6, $$7, $$8, 0.5F, 7, 0.5F, false);
      float $$9 = (float)Math.random() * 0.2F;
      this.v = (float)ayp.b(12235202) / 255.0F - $$9;
      this.w = (float)ayp.c(12235202) / 255.0F - $$9;
      this.x = (float)ayp.d(12235202) / 255.0F - $$9;
   }

   @Override
   public void a() {
      this.u = 0.88F * this.u;
      this.B = 0.92F * this.B;
      super.a();
   }

   public static class a implements giv<lw> {
      private final gjn a;

      public a(gjn $$0) {
         this.a = $$0;
      }

      public gis a(lw $$0, gfk $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new ghy($$1, $$2, $$3, $$4, $$5, $$6, $$7, 1.0F, this.a);
      }
   }
}
