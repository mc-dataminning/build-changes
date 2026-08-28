public class gus extends gsd<cqd, hao> {
   public static final akv a = akv.b("textures/entity/trident.png");
   private final geh b;

   public gus(gse.a $$0) {
      super($$0);
      this.b = new geh($$0.a(gfc.dl));
   }

   public void a(hao $$0, ffu $$1, gly $$2, int $$3) {
      $$1.a();
      $$1.a(a.d.rotationDegrees($$0.b - 90.0F));
      $$1.a(a.f.rotationDegrees($$0.a + 90.0F));
      ffy $$4 = gtc.a($$2, this.b.a(a), false, $$0.c);
      this.b.a($$1, $$4, $$3, hei.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   public hao a() {
      return new hao();
   }

   public void a(cqd $$0, hao $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.k($$2);
      $$1.a = $$0.j($$2);
      $$1.c = $$0.D();
   }
}
