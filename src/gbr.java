public class gbr extends fzc<cdi, fmo<cdi>> {
   private static final ahg a = new ahg("textures/entity/zombie_villager/zombie_villager.png");

   public gbr(fyl.a $$0) {
      super($$0, new fmo<>($$0.a(fmu.cg)), 0.5F);
      this.a(new gcm<>(this, new fmo($$0.a(fmu.ch)), new fmo($$0.a(fmu.ci)), $$0.g()));
      this.a(new gdh<>(this, $$0.e(), "zombie_villager"));
   }

   public ahg a(cdi $$0) {
      return a;
   }

   protected boolean b(cdi $$0) {
      return super.a($$0) || $$0.go();
   }
}
