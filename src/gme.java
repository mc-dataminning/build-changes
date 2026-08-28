public class gme extends gjo<ckx, fwt<ckx>> {
   private static final alf a = new alf("textures/entity/zombie_villager/zombie_villager.png");

   public gme(gix.a $$0) {
      super($$0, new fwt<>($$0.a(fwz.ck)), 0.5F);
      this.a(new gmz<>(this, new fwt($$0.a(fwz.cl)), new fwt($$0.a(fwz.cm)), $$0.g()));
      this.a(new gnu<>(this, $$0.e(), "zombie_villager"));
   }

   public alf a(ckx $$0) {
      return a;
   }

   protected boolean b(ckx $$0) {
      return super.a($$0) || $$0.gA();
   }
}
