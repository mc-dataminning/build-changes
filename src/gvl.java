public class gvl extends gsu<cmr, hbb, get<hbb>> {
   private static final akv a = akv.b("textures/entity/zombie_villager/zombie_villager.png");

   public gvl(gsd.a $$0) {
      super($$0, new get<>($$0.a(gfb.dW)), new get<>($$0.a(gfb.dX)), 0.5F, guz.a);
      this.a(new gwh<>(this, new get($$0.a(gfb.ea)), new get($$0.a(gfb.eb)), new get($$0.a(gfb.dY)), new get($$0.a(gfb.dZ)), $$0.h()));
      this.a(new gxc<>(this, $$0.e(), "zombie_villager"));
   }

   public akv a(hbb $$0) {
      return a;
   }

   public hbb b() {
      return new hbb();
   }

   public void a(cmr $$0, hbb $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.gB();
      $$1.c = $$0.gC();
      $$1.a = $$0.gh();
   }

   protected boolean b(hbb $$0) {
      return super.a($$0) || $$0.b;
   }
}
