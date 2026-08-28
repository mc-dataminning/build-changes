public class gok extends glr {
   private static final int a = 12235202;

   protected gok(gjr $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, float $$7, gnv $$8) {
      super($$0, $$1, $$2, $$3, 0.1F, 0.1F, 0.1F, $$4, $$5, $$6, $$7, $$8, 0.3F, 8, -0.1F, true);
      this.v = 0.7294118F;
      this.w = 0.69411767F;
      this.x = 0.7607843F;
   }

   public static class a implements gnd<mb> {
      private final gnv a;

      public a(gnv $$0) {
         this.a = $$0;
      }

      public gna a(mb $$0, gjr $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gok($$1, $$2, $$3, $$4, $$5, $$6, $$7, 1.0F, this.a);
      }
   }
}
