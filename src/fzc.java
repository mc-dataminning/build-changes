public class fzc extends fwo<ccc, fkh<ccc>> {
   private static final agi a = new agi("textures/entity/zombie_villager/zombie_villager.png");

   public fzc(fvx.a $$0) {
      super($$0, new fkh<>($$0.a(fkn.cc)), 0.5F);
      this.a(new fzv<>(this, new fkh($$0.a(fkn.cd)), new fkh($$0.a(fkn.ce)), $$0.g()));
      this.a(new gaq<>(this, $$0.e(), "zombie_villager"));
   }

   public agi a(ccc $$0) {
      return a;
   }

   protected boolean b(ccc $$0) {
      return super.a($$0) || $$0.gp();
   }
}
