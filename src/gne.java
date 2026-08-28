public class gne extends gpa<btx> {
   private static final alb a = alb.b("textures/entity/squid/glow_squid.png");

   public gne(gms.a $$0, fzc $$1, fzc $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   public alb a(gus $$0) {
      return a;
   }

   protected int a(btx $$0, je $$1) {
      int $$2 = (int)azc.b(0.0F, 15.0F, 1.0F - (float)$$0.y() / 10.0F);
      return $$2 == 15 ? 15 : Math.max($$2, super.a($$0, $$1));
   }
}
