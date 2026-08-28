public class gjh extends gld<btf> {
   private static final ale a = new ale("textures/entity/squid/glow_squid.png");

   public gjh(giv.a $$0, fwa<btf> $$1) {
      super($$0, $$1);
   }

   public ale a(btf $$0) {
      return a;
   }

   protected int a(btf $$0, iz $$1) {
      int $$2 = (int)ayx.b(0.0F, 15.0F, 1.0F - (float)$$0.y() / 10.0F);
      return $$2 == 15 ? 15 : Math.max($$2, super.a($$0, $$1));
   }
}
