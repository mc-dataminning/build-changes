public class grv extends gts<bvt> {
   private static final alz a = alz.b("textures/entity/squid/glow_squid.png");

   public grv(grj.a $$0, gdi $$1, gdi $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   public alz a(gzm $$0) {
      return a;
   }

   protected int a(bvt $$0, jh $$1) {
      int $$2 = (int)bae.b(0.0F, 15.0F, 1.0F - (float)$$0.x() / 10.0F);
      return $$2 == 15 ? 15 : Math.max($$2, super.a($$0, $$1));
   }
}
