public class gdn extends gfi<bph> {
   private static final ajh a = new ajh("textures/entity/squid/glow_squid.png");

   public gdn(gdb.a $$0, fqh<bph> $$1) {
      super($$0, $$1);
   }

   public ajh a(bph $$0) {
      return a;
   }

   protected int a(bph $$0, ib $$1) {
      int $$2 = (int)aww.b(0.0F, 15.0F, 1.0F - (float)$$0.y() / 10.0F);
      return $$2 == 15 ? 15 : Math.max($$2, super.a($$0, $$1));
   }
}
