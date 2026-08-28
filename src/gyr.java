public class gyr extends gxf<cjx, hel, gfq<hel>> {
   private final gfq<hel> a = this.c();
   private final gfq<hel> j;
   private static final alg k = alg.b("textures/entity/fish/tropical_a.png");
   private static final alg l = alg.b("textures/entity/fish/tropical_b.png");

   public gyr(gvz.a $$0) {
      super($$0, new ghy($$0.a(git.dC)), 0.15F);
      this.j = new ghz($$0.a(git.dA));
      this.a(new haw(this, $$0.f()));
   }

   public alg a(hel $$0) {
      return switch ($$0.a.a()) {
         case a -> k;
         case b -> l;
      };
   }

   public hel b() {
      return new hel();
   }

   public void a(cjx $$0, hel $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gy();
      $$1.b = $$0.gw().d();
      $$1.c = $$0.gx().d();
   }

   public void a(hel $$0, fjc $$1, gps $$2, int $$3) {
      this.g = switch ($$0.a.a()) {
         case a -> this.a;
         case b -> this.j;
      };
      super.a($$0, $$1, $$2, $$3);
   }

   protected int b(hel $$0) {
      return $$0.b;
   }

   protected void a(hel $$0, fjc $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      float $$4 = 4.3F * azm.a(0.6F * $$0.u);
      $$1.a(a.d.rotationDegrees($$4));
      if (!$$0.ak) {
         $$1.a(0.2F, 0.1F, 0.0F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }
}
