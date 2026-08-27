public class gcn extends gbk<cas, flo<cas>> {
   private static final agt a = new agt("textures/entity/wither/wither_armor.png");
   private final flo<cas> b;

   public gcn(fzj<cas, flo<cas>> $$0, flu $$1) {
      super($$0);
      this.b = new flo<>($$1.a(flx.bT));
   }

   @Override
   protected float a(float $$0) {
      return aty.b($$0 * 0.02F) * 3.0F;
   }

   @Override
   protected agt a() {
      return a;
   }

   @Override
   protected fiy<cas> b() {
      return this.b;
   }
}
