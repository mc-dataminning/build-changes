public class gwx extends gvl<cjj, hcq, gea<hcq>> {
   private final gea<hcq> a = this.c();
   private final gea<hcq> j;
   private static final ald k = ald.b("textures/entity/fish/tropical_a.png");
   private static final ald l = ald.b("textures/entity/fish/tropical_b.png");

   public gwx(guf.a $$0) {
      super($$0, new ggi($$0.a(ghc.dA)), 0.15F);
      this.j = new ggj($$0.a(ghc.dy));
      this.a(new gzc(this, $$0.f()));
   }

   public ald a(hcq $$0) {
      return switch ($$0.a.a()) {
         case a -> k;
         case b -> l;
      };
   }

   public hcq b() {
      return new hcq();
   }

   public void a(cjj $$0, hcq $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gy();
      $$1.b = $$0.gw().d();
      $$1.c = $$0.gx().d();
   }

   public void a(hcq $$0, fho $$1, gny $$2, int $$3) {
      this.g = switch ($$0.a.a()) {
         case a -> this.a;
         case b -> this.j;
      };
      super.a($$0, $$1, $$2, $$3);
   }

   protected int b(hcq $$0) {
      return $$0.b;
   }

   protected void a(hcq $$0, fho $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      float $$4 = 4.3F * azk.a(0.6F * $$0.u);
      $$1.a(a.d.rotationDegrees($$4));
      if (!$$0.ak) {
         $$1.a(0.2F, 0.1F, 0.0F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }
}
