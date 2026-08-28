public class gme extends gks<cfs, fww<cfs>> {
   private static final akk a = new akk("textures/entity/turtle/big_sea_turtle.png");

   public gme(gjm.a $$0) {
      super($$0, new fww<>($$0.a(fxn.bN)), 0.7F);
   }

   protected float a(cfs $$0) {
      float $$1 = super.b($$0);
      return $$0.p_() ? $$1 * 0.83F : $$1;
   }

   public akk b(cfs $$0) {
      return a;
   }
}
