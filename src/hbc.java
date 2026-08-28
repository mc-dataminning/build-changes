public class hbc extends gzq<cks, hgx, gic<hgx>> {
   private final gic<hgx> a = this.c();
   private final gic<hgx> j;
   private static final alk k = alk.b("textures/entity/fish/tropical_a.png");
   private static final alk l = alk.b("textures/entity/fish/tropical_b.png");

   public hbc(gyk.a $$0) {
      super($$0, new gkk($$0.a(glf.dG)), 0.15F);
      this.j = new gkl($$0.a(glf.dE));
      this.a(new hdi(this, $$0.f()));
   }

   public alk a(hgx $$0) {
      return switch ($$0.a.a()) {
         case a -> k;
         case b -> l;
      };
   }

   public hgx b() {
      return new hgx();
   }

   public void a(cks $$0, hgx $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gC();
      $$1.b = $$0.gA().d();
      $$1.c = $$0.gB().d();
   }

   public void a(hgx $$0, flq $$1, gsc $$2, int $$3) {
      this.g = switch ($$0.a.a()) {
         case a -> this.a;
         case b -> this.j;
      };
      super.a($$0, $$1, $$2, $$3);
   }

   protected int b(hgx $$0) {
      return $$0.b;
   }

   protected void a(hgx $$0, flq $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      float $$4 = 4.3F * azq.a(0.6F * $$0.u);
      $$1.a(a.d.rotationDegrees($$4));
      if (!$$0.ak) {
         $$1.a(0.2F, 0.1F, 0.0F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }
}
