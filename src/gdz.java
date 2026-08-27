public class gdz extends gbk<cfh, fov<cfh>> {
   private static final aiy a = new aiy("textures/entity/zombie_villager/zombie_villager.png");

   public gdz(gat.a $$0) {
      super($$0, new fov<>($$0.a(fpb.cg)), 0.5F);
      this.a(new geu<>(this, new fov($$0.a(fpb.ch)), new fov($$0.a(fpb.ci)), $$0.g()));
      this.a(new gfp<>(this, $$0.e(), "zombie_villager"));
   }

   public aiy a(cfh $$0) {
      return a;
   }

   protected boolean b(cfh $$0) {
      return super.a($$0) || $$0.gq();
   }
}
