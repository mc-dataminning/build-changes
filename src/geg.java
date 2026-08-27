public class geg extends gbr<cfl, fpc<cfl>> {
   private static final aiy a = new aiy("textures/entity/zombie_villager/zombie_villager.png");

   public geg(gba.a $$0) {
      super($$0, new fpc<>($$0.a(fpi.cg)), 0.5F);
      this.a(new gfb<>(this, new fpc($$0.a(fpi.ch)), new fpc($$0.a(fpi.ci)), $$0.g()));
      this.a(new gfw<>(this, $$0.e(), "zombie_villager"));
   }

   public aiy a(cfl $$0) {
      return a;
   }

   protected boolean b(cfl $$0) {
      return super.a($$0) || $$0.gq();
   }
}
