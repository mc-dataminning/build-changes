public class gol extends gqh<bun> {
   private static final alh a = alh.b("textures/entity/squid/glow_squid.png");

   public gol(gnz.a $$0, gac $$1, gac $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   public alh a(gwa $$0) {
      return a;
   }

   protected int a(bun $$0, jg $$1) {
      int $$2 = (int)azj.b(0.0F, 15.0F, 1.0F - (float)$$0.y() / 10.0F);
      return $$2 == 15 ? 15 : Math.max($$2, super.a($$0, $$1));
   }
}
