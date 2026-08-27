public class fxy extends fzt<byd, fjm<byd>> {
   private static final ahg a = new ahg("textures/entity/chicken.png");

   public fxy(fyn.a $$0) {
      super($$0, new fjm<>($$0.a(fmw.w)), 0.3F);
   }

   public ahg a(byd $$0) {
      return a;
   }

   protected float a(byd $$0, float $$1) {
      float $$2 = auo.i($$1, $$0.bX, $$0.bT);
      float $$3 = auo.i($$1, $$0.bW, $$0.bU);
      return (auo.a($$2) + 1.0F) * $$3;
   }
}
