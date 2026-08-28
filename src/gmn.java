public class gmn extends gjx<ckh, fxb<ckh>> {
   private static final akk a = new akk("textures/entity/zombie_villager/zombie_villager.png");

   public gmn(gjg.a $$0) {
      super($$0, new fxb<>($$0.a(fxh.ck)), 0.5F);
      this.a(new gni<>(this, new fxb($$0.a(fxh.cl)), new fxb($$0.a(fxh.cm)), $$0.g()));
      this.a(new god<>(this, $$0.e(), "zombie_villager"));
   }

   public akk a(ckh $$0) {
      return a;
   }

   protected boolean b(ckh $$0) {
      return super.a($$0) || $$0.gx();
   }
}
