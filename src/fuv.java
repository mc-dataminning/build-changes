public class fuv extends fwq<bwo, fgr<bwo>> {
   private static final agg a = new agg("textures/entity/chicken.png");

   public fuv(fvk.a $$0) {
      super($$0, new fgr<>($$0.a(fka.t)), 0.3F);
   }

   public agg a(bwo $$0) {
      return a;
   }

   protected float a(bwo $$0, float $$1) {
      float $$2 = ati.i($$1, $$0.bX, $$0.bT);
      float $$3 = ati.i($$1, $$0.bW, $$0.bU);
      return (ati.a($$2) + 1.0F) * $$3;
   }
}
