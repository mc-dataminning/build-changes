public class glz extends gjj<cks, fwo<cks>> {
   private static final alb a = new alb("textures/entity/zombie_villager/zombie_villager.png");

   public glz(gis.a $$0) {
      super($$0, new fwo<>($$0.a(fwu.ck)), 0.5F);
      this.a(new gmu<>(this, new fwo($$0.a(fwu.cl)), new fwo($$0.a(fwu.cm)), $$0.g()));
      this.a(new gnp<>(this, $$0.e(), "zombie_villager"));
   }

   public alb a(cks $$0) {
      return a;
   }

   protected boolean b(cks $$0) {
      return super.a($$0) || $$0.gA();
   }
}
