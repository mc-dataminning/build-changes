public class gvj extends gss<cmq, haz, ger<haz>> {
   private static final aku a = aku.b("textures/entity/zombie_villager/zombie_villager.png");

   public gvj(gsb.a $$0) {
      super($$0, new ger<>($$0.a(gez.dW)), new ger<>($$0.a(gez.dX)), 0.5F, gux.a);
      this.a(new gwf<>(this, new ger($$0.a(gez.ea)), new ger($$0.a(gez.eb)), new ger($$0.a(gez.dY)), new ger($$0.a(gez.dZ)), $$0.h()));
      this.a(new gxa<>(this, $$0.e(), "zombie_villager"));
   }

   public aku a(haz $$0) {
      return a;
   }

   public haz b() {
      return new haz();
   }

   public void a(cmq $$0, haz $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.gy();
      $$1.c = $$0.gz();
      $$1.a = $$0.ge();
   }

   protected boolean b(haz $$0) {
      return super.a($$0) || $$0.b;
   }
}
