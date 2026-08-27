public class gbl extends fyw<cdd, fmi<cdd>> {
   private static final ahd a = new ahd("textures/entity/zombie_villager/zombie_villager.png");

   public gbl(fyf.a $$0) {
      super($$0, new fmi<>($$0.a(fmo.cg)), 0.5F);
      this.a(new gcg<>(this, new fmi($$0.a(fmo.ch)), new fmi($$0.a(fmo.ci)), $$0.g()));
      this.a(new gdb<>(this, $$0.e(), "zombie_villager"));
   }

   public ahd a(cdd $$0) {
      return a;
   }

   protected boolean b(cdd $$0) {
      return super.a($$0) || $$0.go();
   }
}
