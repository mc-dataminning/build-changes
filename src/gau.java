public class gau extends fyf<cct, flr<cct>> {
   private static final agt a = new agt("textures/entity/zombie_villager/zombie_villager.png");

   public gau(fxo.a $$0) {
      super($$0, new flr<>($$0.a(flx.cg)), 0.5F);
      this.a(new gbp<>(this, new flr($$0.a(flx.ch)), new flr($$0.a(flx.ci)), $$0.g()));
      this.a(new gck<>(this, $$0.e(), "zombie_villager"));
   }

   public agt a(cct $$0) {
      return a;
   }

   protected boolean b(cct $$0) {
      return super.a($$0) || $$0.go();
   }
}
