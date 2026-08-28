public class gnv extends gpr<buc> {
   private static final alc a = alc.b("textures/entity/squid/glow_squid.png");

   public gnv(gnj.a $$0, fzm $$1, fzm $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   public alc a(gvj $$0) {
      return a;
   }

   protected int a(buc $$0, je $$1) {
      int $$2 = (int)azd.b(0.0F, 15.0F, 1.0F - (float)$$0.y() / 10.0F);
      return $$2 == 15 ? 15 : Math.max($$2, super.a($$0, $$1));
   }
}
