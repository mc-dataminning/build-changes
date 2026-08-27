public class ggd extends ghy<bql> {
   private static final ajv a = new ajv("textures/entity/squid/glow_squid.png");

   public ggd(gfr.a $$0, fsx<bql> $$1) {
      super($$0, $$1);
   }

   public ajv a(bql $$0) {
      return a;
   }

   protected int a(bql $$0, id $$1) {
      int $$2 = (int)axm.b(0.0F, 15.0F, 1.0F - (float)$$0.y() / 10.0F);
      return $$2 == 15 ? 15 : Math.max($$2, super.a($$0, $$1));
   }
}
