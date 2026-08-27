public class gge extends gdp<cgs, fqw<cgs>> {
   private static final ajh a = new ajh("textures/entity/zombie_villager/zombie_villager.png");

   public gge(gcy.a $$0) {
      super($$0, new fqw<>($$0.a(frc.cg)), 0.5F);
      this.a(new ggz<>(this, new fqw($$0.a(frc.ch)), new fqw($$0.a(frc.ci)), $$0.g()));
      this.a(new ghu<>(this, $$0.e(), "zombie_villager"));
   }

   public ajh a(cgs $$0) {
      return a;
   }

   protected boolean b(cgs $$0) {
      return super.a($$0) || $$0.gx();
   }
}
