public class grs extends gqq<gvg, fzp> {
   private static final alb a = alb.b("textures/entity/wither/wither_armor.png");
   private final fzp b;

   public grs(goo<gvg, fzp> $$0, fzx $$1) {
      super($$0);
      this.b = new fzp($$1.a(gaa.cZ));
   }

   protected boolean a(gvg $$0) {
      return $$0.d;
   }

   @Override
   protected float a(float $$0) {
      return azc.b($$0 * 0.02F) * 3.0F;
   }

   @Override
   protected alb a() {
      return a;
   }

   protected fzp b() {
      return this.b;
   }
}
