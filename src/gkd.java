public class gkd extends gho<cjh, fuu<cjh>> {
   private static final akh a = new akh("textures/entity/zombie_villager/zombie_villager.png");

   public gkd(ggx.a $$0) {
      super($$0, new fuu<>($$0.a(fva.ck)), 0.5F);
      this.a(new gky<>(this, new fuu($$0.a(fva.cl)), new fuu($$0.a(fva.cm)), $$0.g()));
      this.a(new glt<>(this, $$0.e(), "zombie_villager"));
   }

   public akh a(cjh $$0) {
      return a;
   }

   protected boolean b(cjh $$0) {
      return super.a($$0) || $$0.gz();
   }
}
