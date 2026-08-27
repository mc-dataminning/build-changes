public class gae extends gbz<bzy, flq<bzy>> {
   private static final aiy a = new aiy("textures/entity/chicken.png");

   public gae(gat.a $$0) {
      super($$0, new flq<>($$0.a(fpb.v)), 0.3F);
   }

   public aiy a(bzy $$0) {
      return a;
   }

   protected float a(bzy $$0, float $$1) {
      float $$2 = awh.i($$1, $$0.bX, $$0.bT);
      float $$3 = awh.i($$1, $$0.bW, $$0.bU);
      return (awh.a($$2) + 1.0F) * $$3;
   }
}
