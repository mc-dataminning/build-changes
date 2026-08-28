public class gwl extends gtu<cnm, hcb, gft<hcb>> {
   private static final aku a = aku.b("textures/entity/zombie_villager/zombie_villager.png");

   public gwl(gtd.a $$0) {
      super($$0, new gft<>($$0.a(ggb.dY)), new gft<>($$0.a(ggb.dZ)), 0.5F, gvz.a);
      this.a(new gxh<>(this, new gft($$0.a(ggb.ec)), new gft($$0.a(ggb.ed)), new gft($$0.a(ggb.ea)), new gft($$0.a(ggb.eb)), $$0.h()));
      this.a(new gyc<>(this, $$0.e(), "zombie_villager"));
   }

   public aku a(hcb $$0) {
      return a;
   }

   public hcb b() {
      return new hcb();
   }

   public void a(cnm $$0, hcb $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.gz();
      $$1.c = $$0.gA();
      $$1.a = $$0.gj();
   }

   protected boolean b(hcb $$0) {
      return super.a($$0) || $$0.b;
   }
}
