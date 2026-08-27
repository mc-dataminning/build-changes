public class gbc extends gbk<cbl, fis<cbl>> {
   private static final agt a = new agt("textures/entity/creeper/creeper_armor.png");
   private final fis<cbl> b;

   public gbc(fzj<cbl, fis<cbl>> $$0, flu $$1) {
      super($$0);
      this.b = new fis<>($$1.a(flx.F));
   }

   @Override
   protected float a(float $$0) {
      return $$0 * 0.01F;
   }

   @Override
   protected agt a() {
      return a;
   }

   @Override
   protected fiy<cbl> b() {
      return this.b;
   }
}
