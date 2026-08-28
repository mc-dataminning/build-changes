public class glk extends gjy<cgb, fwd<cgb>> {
   private static final alb a = new alb("textures/entity/turtle/big_sea_turtle.png");

   public glk(gis.a $$0) {
      super($$0, new fwd<>($$0.a(fwu.bN)), 0.7F);
   }

   protected float a(cgb $$0) {
      float $$1 = super.b($$0);
      return $$0.p_() ? $$1 * 0.83F : $$1;
   }

   public alb b(cgb $$0) {
      return a;
   }
}
