public class gut extends gsc<cni, hag, gea<hag>> {
   private static final alp a = alp.b("textures/entity/zombie_villager/zombie_villager.png");

   public gut(grl.a $$0) {
      super($$0, new gea<>($$0.a(gei.dW)), new gea<>($$0.a(gei.dX)), 0.5F, guh.a);
      this.a(new gvp<>(this, new gea($$0.a(gei.ea)), new gea($$0.a(gei.eb)), new gea($$0.a(gei.dY)), new gea($$0.a(gei.dZ)), $$0.h()));
      this.a(new gwk<>(this, $$0.e(), "zombie_villager"));
   }

   public alp a(hag $$0) {
      return a;
   }

   public hag b() {
      return new hag();
   }

   public void a(cni $$0, hag $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.gx();
      $$1.c = $$0.gy();
      $$1.a = $$0.gd();
   }

   protected boolean b(hag $$0) {
      return super.a($$0) || $$0.b;
   }
}
