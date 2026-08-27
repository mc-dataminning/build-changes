public class gke<T extends bsa, M extends ftg<T>> extends glr<T, M> {
   private final ggv a;

   public gke(ggx.a $$0, ghy<T, M> $$1) {
      super($$1);
      this.a = $$0.a();
   }

   @Override
   protected int a(T $$0) {
      return $$0.eR();
   }

   @Override
   protected void a(exx $$0, gbo $$1, int $$2, brh $$3, float $$4, float $$5, float $$6, float $$7) {
      float $$8 = axz.c($$4 * $$4 + $$6 * $$6);
      clp $$9 = new clp($$3.dN(), $$3.ds(), $$3.du(), $$3.dy(), csz.i);
      $$9.r((float)(Math.atan2((double)$$4, (double)$$6) * 180.0F / (float)Math.PI));
      $$9.s((float)(Math.atan2((double)$$5, (double)$$8) * 180.0F / (float)Math.PI));
      $$9.O = $$9.dD();
      $$9.P = $$9.dF();
      this.a.a($$9, 0.0, 0.0, 0.0, 0.0F, $$7, $$0, $$1, $$2);
   }
}
