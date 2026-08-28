public class gwz extends gwn<cou, hdo> {
   private static final alr a = alr.b("textures/entity/skeleton/bogged.png");
   private static final alr j = alr.b("textures/entity/skeleton/bogged_overlay.png");

   public gwz(gxv.a $$0) {
      super($$0, gkq.G, gkq.H, new ggr($$0.a(gkq.F)));
      this.a(new hcn<>(this, $$0.f(), gkq.I, j));
   }

   public alr a(hdo $$0) {
      return a;
   }

   public hdo a() {
      return new hdo();
   }

   public void a(cou $$0, hdo $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gy();
   }
}
