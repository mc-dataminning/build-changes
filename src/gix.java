public class gix extends ggi<cia, fto<cia>> {
   private static final ajv a = new ajv("textures/entity/zombie_villager/zombie_villager.png");

   public gix(gfr.a $$0) {
      super($$0, new fto<>($$0.a(ftu.ck)), 0.5F);
      this.a(new gjs<>(this, new fto($$0.a(ftu.cl)), new fto($$0.a(ftu.cm)), $$0.g()));
      this.a(new gkn<>(this, $$0.e(), "zombie_villager"));
   }

   public ajv a(cia $$0) {
      return a;
   }

   protected boolean b(cia $$0) {
      return super.a($$0) || $$0.gx();
   }
}
