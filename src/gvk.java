public class gvk extends gst<cmr, hba, get<hba>> {
   private static final aku a = aku.b("textures/entity/zombie_villager/zombie_villager.png");

   public gvk(gsc.a $$0) {
      super($$0, new get<>($$0.a(gfb.dW)), new get<>($$0.a(gfb.dX)), 0.5F, guy.a);
      this.a(new gwg<>(this, new get($$0.a(gfb.ea)), new get($$0.a(gfb.eb)), new get($$0.a(gfb.dY)), new get($$0.a(gfb.dZ)), $$0.h()));
      this.a(new gxb<>(this, $$0.e(), "zombie_villager"));
   }

   public aku a(hba $$0) {
      return a;
   }

   public hba b() {
      return new hba();
   }

   public void a(cmr $$0, hba $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.gy();
      $$1.c = $$0.gz();
      $$1.a = $$0.ge();
   }

   protected boolean b(hba $$0) {
      return super.a($$0) || $$0.b;
   }
}
