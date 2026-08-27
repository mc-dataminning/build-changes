public class gbe extends gcz<bny> {
   private static final aiy a = new aiy("textures/entity/squid/glow_squid.png");

   public gbe(gas.a $$0, fod<bny> $$1) {
      super($$0, $$1);
   }

   public aiy a(bny $$0) {
      return a;
   }

   protected int a(bny $$0, hz $$1) {
      int $$2 = (int)awh.b(0.0F, 15.0F, 1.0F - (float)$$0.A() / 10.0F);
      return $$2 == 15 ? 15 : Math.max($$2, super.a($$0, $$1));
   }
}
