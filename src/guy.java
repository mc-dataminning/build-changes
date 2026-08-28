public class guy extends gsh<cnr, hal, gef<hal>> {
   private static final alz a = alz.b("textures/entity/zombie_villager/zombie_villager.png");

   public guy(grq.a $$0) {
      super($$0, new gef<>($$0.a(gen.dQ)), new gef<>($$0.a(gen.dR)), 0.5F, gum.a);
      this.a(new gvu<>(this, new gef($$0.a(gen.dU)), new gef($$0.a(gen.dV)), new gef($$0.a(gen.dS)), new gef($$0.a(gen.dT)), $$0.h()));
      this.a(new gwp<>(this, $$0.e(), "zombie_villager"));
   }

   public alz a(hal $$0) {
      return a;
   }

   public hal b() {
      return new hal();
   }

   public void a(cnr $$0, hal $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.gx();
      $$1.c = $$0.gy();
      $$1.a = $$0.gd();
   }

   protected boolean b(hal $$0) {
      return super.a($$0) || $$0.b;
   }
}
