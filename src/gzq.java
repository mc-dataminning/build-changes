public class gzq extends gye<ckf, hfl, ggp<hfl>> {
   private final ggp<hfl> a = this.c();
   private final ggp<hfl> j;
   private static final alg k = alg.b("textures/entity/fish/tropical_a.png");
   private static final alg l = alg.b("textures/entity/fish/tropical_b.png");

   public gzq(gwy.a $$0) {
      super($$0, new gix($$0.a(gjs.dG)), 0.15F);
      this.j = new giy($$0.a(gjs.dE));
      this.a(new hbw(this, $$0.f()));
   }

   public alg a(hfl $$0) {
      return switch ($$0.a.a()) {
         case a -> k;
         case b -> l;
      };
   }

   public hfl b() {
      return new hfl();
   }

   public void a(ckf $$0, hfl $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gB();
      $$1.b = $$0.gz().d();
      $$1.c = $$0.gA().d();
   }

   public void a(hfl $$0, fkd $$1, gqr $$2, int $$3) {
      this.g = switch ($$0.a.a()) {
         case a -> this.a;
         case b -> this.j;
      };
      super.a($$0, $$1, $$2, $$3);
   }

   protected int b(hfl $$0) {
      return $$0.b;
   }

   protected void a(hfl $$0, fkd $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      float $$4 = 4.3F * azm.a(0.6F * $$0.u);
      $$1.a(a.d.rotationDegrees($$4));
      if (!$$0.ak) {
         $$1.a(0.2F, 0.1F, 0.0F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }
}
