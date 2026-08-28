public class gzl extends gxz<ckf, hff, ggk<hff>> {
   private final ggk<hff> a = this.c();
   private final ggk<hff> j;
   private static final alg k = alg.b("textures/entity/fish/tropical_a.png");
   private static final alg l = alg.b("textures/entity/fish/tropical_b.png");

   public gzl(gwt.a $$0) {
      super($$0, new gis($$0.a(gjn.dE)), 0.15F);
      this.j = new git($$0.a(gjn.dC));
      this.a(new hbq(this, $$0.f()));
   }

   public alg a(hff $$0) {
      return switch ($$0.a.a()) {
         case a -> k;
         case b -> l;
      };
   }

   public hff b() {
      return new hff();
   }

   public void a(ckf $$0, hff $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gB();
      $$1.b = $$0.gz().d();
      $$1.c = $$0.gA().d();
   }

   public void a(hff $$0, fjy $$1, gqm $$2, int $$3) {
      this.g = switch ($$0.a.a()) {
         case a -> this.a;
         case b -> this.j;
      };
      super.a($$0, $$1, $$2, $$3);
   }

   protected int b(hff $$0) {
      return $$0.b;
   }

   protected void a(hff $$0, fjy $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      float $$4 = 4.3F * azm.a(0.6F * $$0.u);
      $$1.a(a.d.rotationDegrees($$4));
      if (!$$0.ak) {
         $$1.a(0.2F, 0.1F, 0.0F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }
}
