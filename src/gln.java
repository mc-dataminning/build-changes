public class gln extends gkb<cge, fwg<cge>> {
   private static final ale a = new ale("textures/entity/turtle/big_sea_turtle.png");

   public gln(giv.a $$0) {
      super($$0, new fwg<>($$0.a(fwx.bN)), 0.7F);
   }

   protected float a(cge $$0) {
      float $$1 = super.b($$0);
      return $$0.p_() ? $$1 * 0.83F : $$1;
   }

   public ale b(cge $$0) {
      return a;
   }
}
