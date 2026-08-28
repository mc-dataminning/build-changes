public class gue extends grp<crd, gzx> {
   public static final alz a = alz.b("textures/entity/trident.png");
   private final gds b;

   public gue(grq.a $$0) {
      super($$0);
      this.b = new gds($$0.a(gen.dg));
   }

   public void a(gzx $$0, fgs $$1, gll $$2, int $$3) {
      $$1.a();
      $$1.a(a.d.rotationDegrees($$0.b - 90.0F));
      $$1.a(a.f.rotationDegrees($$0.a + 90.0F));
      fgw $$4 = gso.a($$2, this.b.a(a), false, $$0.c);
      this.b.a($$1, $$4, $$3, hbc.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   public gzx a() {
      return new gzx();
   }

   public void a(crd $$0, gzx $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.k($$2);
      $$1.a = $$0.j($$2);
      $$1.c = $$0.D();
   }
}
