public class gmd extends gjn<ckw, fws<ckw>> {
   private static final ale a = new ale("textures/entity/zombie_villager/zombie_villager.png");

   public gmd(giw.a $$0) {
      super($$0, new fws<>($$0.a(fwy.ck)), 0.5F);
      this.a(new gmy<>(this, new fws($$0.a(fwy.cl)), new fws($$0.a(fwy.cm)), $$0.g()));
      this.a(new gnt<>(this, $$0.e(), "zombie_villager"));
   }

   public ale a(ckw $$0) {
      return a;
   }

   protected boolean b(ckw $$0) {
      return super.a($$0) || $$0.gA();
   }
}
