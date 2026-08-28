public class gar extends gad {
   private static final int a = 12235202;

   protected gar(fyd $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, float $$7, gcg $$8) {
      super($$0, $$1, $$2, $$3, 0.7F, 0.6F, 0.7F, $$4, $$5 + 0.15F, $$6, $$7, $$8, 0.5F, 7, 0.5F, false);
      float $$9 = (float)Math.random() * 0.2F;
      this.v = (float)axo.b.b(12235202) / 255.0F - $$9;
      this.w = (float)axo.b.c(12235202) / 255.0F - $$9;
      this.x = (float)axo.b.d(12235202) / 255.0F - $$9;
   }

   @Override
   public void a() {
      this.u = 0.88F * this.u;
      this.B = 0.92F * this.B;
      super.a();
   }

   public static class a implements gbo<ln> {
      private final gcg a;

      public a(gcg $$0) {
         this.a = $$0;
      }

      public gbl a(ln $$0, fyd $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gar($$1, $$2, $$3, $$4, $$5, $$6, $$7, 1.0F, this.a);
      }
   }
}
