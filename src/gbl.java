public class gbl extends gbm<lh> {
   protected gbl(fyz $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, lh $$7, gdc $$8) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8);
      float $$9 = this.r.i() * 0.4F + 0.6F;
      this.v = this.a($$7.b().x(), $$9);
      this.w = this.a($$7.b().y(), $$9);
      this.x = this.a($$7.b().z(), $$9);
   }

   public static class a implements gck<lh> {
      private final gdc a;

      public a(gdc $$0) {
         this.a = $$0;
      }

      public gch a(lh $$0, fyz $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gbl($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$0, this.a);
      }
   }
}
