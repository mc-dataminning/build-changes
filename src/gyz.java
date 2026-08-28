public class gyz extends gxn<ckb, het, gfy<het>> {
   private final gfy<het> a = this.c();
   private final gfy<het> j;
   private static final alg k = alg.b("textures/entity/fish/tropical_a.png");
   private static final alg l = alg.b("textures/entity/fish/tropical_b.png");

   public gyz(gwh.a $$0) {
      super($$0, new gig($$0.a(gjb.dE)), 0.15F);
      this.j = new gih($$0.a(gjb.dC));
      this.a(new hbe(this, $$0.f()));
   }

   public alg a(het $$0) {
      return switch ($$0.a.a()) {
         case a -> k;
         case b -> l;
      };
   }

   public het b() {
      return new het();
   }

   public void a(ckb $$0, het $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gz();
      $$1.b = $$0.gx().d();
      $$1.c = $$0.gy().d();
   }

   public void a(het $$0, fjj $$1, gqa $$2, int $$3) {
      this.g = switch ($$0.a.a()) {
         case a -> this.a;
         case b -> this.j;
      };
      super.a($$0, $$1, $$2, $$3);
   }

   protected int b(het $$0) {
      return $$0.b;
   }

   protected void a(het $$0, fjj $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      float $$4 = 4.3F * azm.a(0.6F * $$0.u);
      $$1.a(a.d.rotationDegrees($$4));
      if (!$$0.ak) {
         $$1.a(0.2F, 0.1F, 0.0F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }
}
