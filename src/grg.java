public class grg extends goq<cmg, gws, gas<gws>> {
   private static final alh a = alh.b("textures/entity/zombie_villager/zombie_villager.png");

   public grg(gnz.a $$0) {
      super($$0, new gas<>($$0.a(gba.dv)), new gas<>($$0.a(gba.dy)), 0.5F, gqu.a);
      this.a(new gsc<>(this, new gas($$0.a(gba.dw)), new gas($$0.a(gba.dx)), new gas($$0.a(gba.dz)), new gas($$0.a(gba.dA)), $$0.h()));
      this.a(new gsw<>(this, $$0.e(), "zombie_villager"));
   }

   public alh a(gws $$0) {
      return a;
   }

   public gws c() {
      return new gws();
   }

   public void a(cmg $$0, gws $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.gE();
      $$1.c = $$0.gF();
      $$1.a = $$0.gk();
   }

   protected boolean b(gws $$0) {
      return super.a($$0) || $$0.b;
   }
}
