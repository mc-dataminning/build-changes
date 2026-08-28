public class gjl extends giy {
   private static final int a = 12235202;

   protected gjl(ggy $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, float $$7, glb $$8) {
      super($$0, $$1, $$2, $$3, 0.7F, 0.6F, 0.7F, $$4, $$5 + 0.15F, $$6, $$7, $$8, 0.5F, 7, 0.5F, false);
      float $$9 = (float)Math.random() * 0.2F;
      this.v = (float)axk.b(12235202) / 255.0F - $$9;
      this.w = (float)axk.c(12235202) / 255.0F - $$9;
      this.x = (float)axk.d(12235202) / 255.0F - $$9;
   }

   @Override
   public void a() {
      this.u = 0.88F * this.u;
      this.B = 0.92F * this.B;
      super.a();
   }

   public static class a implements gkj<lx> {
      private final glb a;

      public a(glb $$0) {
         this.a = $$0;
      }

      public gkg a(lx $$0, ggy $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gjl($$1, $$2, $$3, $$4, $$5, $$6, $$7, 1.0F, this.a);
      }
   }
}
