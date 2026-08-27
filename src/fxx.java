public class fxx extends fzs<byc, fjl<byc>> {
   private static final ahg a = new ahg("textures/entity/chicken.png");

   public fxx(fym.a $$0) {
      super($$0, new fjl<>($$0.a(fmv.w)), 0.3F);
   }

   public ahg a(byc $$0) {
      return a;
   }

   protected float a(byc $$0, float $$1) {
      float $$2 = aun.i($$1, $$0.bX, $$0.bT);
      float $$3 = aun.i($$1, $$0.bW, $$0.bU);
      return (aun.a($$2) + 1.0F) * $$3;
   }
}
