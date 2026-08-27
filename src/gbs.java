public class gbs extends fzd<cdi, fmp<cdi>> {
   private static final ahg a = new ahg("textures/entity/zombie_villager/zombie_villager.png");

   public gbs(fym.a $$0) {
      super($$0, new fmp<>($$0.a(fmv.cg)), 0.5F);
      this.a(new gcn<>(this, new fmp($$0.a(fmv.ch)), new fmp($$0.a(fmv.ci)), $$0.g()));
      this.a(new gdi<>(this, $$0.e(), "zombie_villager"));
   }

   public ahg a(cdi $$0) {
      return a;
   }

   protected boolean b(cdi $$0) {
      return super.a($$0) || $$0.go();
   }
}
