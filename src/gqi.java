public class gqi extends gqq<gsn, fws> {
   private static final alb a = alb.b("textures/entity/creeper/creeper_armor.png");
   private final fws b;

   public gqi(goo<gsn, fws> $$0, fzx $$1) {
      super($$0);
      this.b = new fws($$1.a(gaa.X));
   }

   protected boolean a(gsn $$0) {
      return $$0.b;
   }

   @Override
   protected float a(float $$0) {
      return $$0 * 0.01F;
   }

   @Override
   protected alb a() {
      return a;
   }

   protected fws b() {
      return this.b;
   }
}
