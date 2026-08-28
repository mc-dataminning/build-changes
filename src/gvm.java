public class gvm extends gsv<cms, hbc, geu<hbc>> {
   private static final akv a = akv.b("textures/entity/zombie_villager/zombie_villager.png");

   public gvm(gse.a $$0) {
      super($$0, new geu<>($$0.a(gfc.dW)), new geu<>($$0.a(gfc.dX)), 0.5F, gva.a);
      this.a(new gwi<>(this, new geu($$0.a(gfc.ea)), new geu($$0.a(gfc.eb)), new geu($$0.a(gfc.dY)), new geu($$0.a(gfc.dZ)), $$0.h()));
      this.a(new gxd<>(this, $$0.e(), "zombie_villager"));
   }

   public akv a(hbc $$0) {
      return a;
   }

   public hbc b() {
      return new hbc();
   }

   public void a(cms $$0, hbc $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.gB();
      $$1.c = $$0.gC();
      $$1.a = $$0.gh();
   }

   protected boolean b(hbc $$0) {
      return super.a($$0) || $$0.b;
   }
}
