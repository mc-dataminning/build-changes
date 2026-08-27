public class fzm extends gbh<bmg> {
   private static final ahh a = new ahh("textures/entity/squid/glow_squid.png");

   public fzm(fza.a $$0, fml<bmg> $$1) {
      super($$0, $$1);
   }

   public ahh a(bmg $$0) {
      return a;
   }

   protected int a(bmg $$0, hx $$1) {
      int $$2 = (int)aup.b(0.0F, 15.0F, 1.0F - (float)$$0.A() / 10.0F);
      return $$2 == 15 ? 15 : Math.max($$2, super.a($$0, $$1));
   }
}
