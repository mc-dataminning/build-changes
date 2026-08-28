public class gur extends gwo<bwi> {
   private static final ald a = ald.b("textures/entity/squid/glow_squid.png");

   public gur(guf.a $$0, gge $$1, gge $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   public ald a(hcj $$0) {
      return a;
   }

   protected int a(bwi $$0, jj $$1) {
      int $$2 = (int)azk.b(0.0F, 15.0F, 1.0F - (float)$$0.x() / 10.0F);
      return $$2 == 15 ? 15 : Math.max($$2, super.a($$0, $$1));
   }
}
