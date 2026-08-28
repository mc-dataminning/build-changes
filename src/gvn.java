public class gvn extends gsw<cmt, hbd, gev<hbd>> {
   private static final akv a = akv.b("textures/entity/zombie_villager/zombie_villager.png");

   public gvn(gsf.a $$0) {
      super($$0, new gev<>($$0.a(gfd.dW)), new gev<>($$0.a(gfd.dX)), 0.5F, gvb.a);
      this.a(new gwj<>(this, new gev($$0.a(gfd.ea)), new gev($$0.a(gfd.eb)), new gev($$0.a(gfd.dY)), new gev($$0.a(gfd.dZ)), $$0.h()));
      this.a(new gxe<>(this, $$0.e(), "zombie_villager"));
   }

   public akv a(hbd $$0) {
      return a;
   }

   public hbd b() {
      return new hbd();
   }

   public void a(cmt $$0, hbd $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.gB();
      $$1.c = $$0.gC();
      $$1.a = $$0.gh();
   }

   protected boolean b(hbd $$0) {
      return super.a($$0) || $$0.b;
   }
}
