public class gak extends fzw {
   private static final int a = 12235202;

   protected gak(fxx $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, float $$7, gbz $$8) {
      super($$0, $$1, $$2, $$3, 0.7F, 0.6F, 0.7F, $$4, $$5 + 0.15F, $$6, $$7, $$8, 0.5F, 7, 0.5F, false);
      float $$9 = (float)Math.random() * 0.2F;
      this.v = (float)ayj.b.b(12235202) / 255.0F - $$9;
      this.w = (float)ayj.b.c(12235202) / 255.0F - $$9;
      this.x = (float)ayj.b.d(12235202) / 255.0F - $$9;
   }

   @Override
   public void a() {
      this.u = 0.88F * this.u;
      this.B = 0.92F * this.B;
      super.a();
   }

   public static class a implements gbh<lm> {
      private final gbz a;

      public a(gbz $$0) {
         this.a = $$0;
      }

      public gbe a(lm $$0, fxx $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gak($$1, $$2, $$3, $$4, $$5, $$6, $$7, 1.0F, this.a);
      }
   }
}
