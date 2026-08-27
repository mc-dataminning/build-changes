public class fvn extends fsx {
   private static final int a = 12235202;

   protected fvn(fra $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, float $$7, fuz $$8) {
      super($$0, $$1, $$2, $$3, 0.1F, 0.1F, 0.1F, $$4, $$5, $$6, $$7, $$8, 0.3F, 8, -0.1F, true);
      this.v = 0.7294118F;
      this.w = 0.69411767F;
      this.x = 0.7607843F;
   }

   public static class a implements fuh<ke> {
      private final fuz a;

      public a(fuz $$0) {
         this.a = $$0;
      }

      public fue a(ke $$0, fra $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new fvn($$1, $$2, $$3, $$4, $$5, $$6, $$7, 1.0F, this.a);
      }
   }
}
