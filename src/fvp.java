public class fvp<T extends biw, M extends ffp<T>> extends fxa<T, M> {
   private final fsh a;

   public fvp(fsj.a $$0, ftk<T, M> $$1) {
      super($$1);
      this.a = $$0.a();
   }

   @Override
   protected int a(T $$0) {
      return $$0.eM();
   }

   @Override
   protected void a(elh $$0, fng $$1, int $$2, big $$3, float $$4, float $$5, float $$6, float $$7) {
      float $$8 = aro.c($$4 * $$4 + $$6 * $$6);
      cbt $$9 = new cbt($$3.dK(), $$3.dp(), $$3.dr(), $$3.dv());
      $$9.r((float)(Math.atan2((double)$$4, (double)$$6) * 180.0F / (float)Math.PI));
      $$9.s((float)(Math.atan2((double)$$5, (double)$$8) * 180.0F / (float)Math.PI));
      $$9.N = $$9.dA();
      $$9.O = $$9.dC();
      this.a.a($$9, 0.0, 0.0, 0.0, 0.0F, $$7, $$0, $$1, $$2);
   }
}
