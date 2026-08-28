public class gmc extends gjm<ckv, fwr<ckv>> {
   private static final ale a = new ale("textures/entity/zombie_villager/zombie_villager.png");

   public gmc(giv.a $$0) {
      super($$0, new fwr<>($$0.a(fwx.ck)), 0.5F);
      this.a(new gmx<>(this, new fwr($$0.a(fwx.cl)), new fwr($$0.a(fwx.cm)), $$0.g()));
      this.a(new gns<>(this, $$0.e(), "zombie_villager"));
   }

   public ale a(ckv $$0) {
      return a;
   }

   protected boolean b(ckv $$0) {
      return super.a($$0) || $$0.gA();
   }
}
