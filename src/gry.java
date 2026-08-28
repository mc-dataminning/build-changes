public class gry extends gpj<cqa, gxq> {
   public static final alj a = alj.b("textures/entity/trident.png");
   private final gbp b;

   public gry(gpk.a $$0) {
      super($$0);
      this.b = new gbp($$0.a(gck.dd));
   }

   public void a(gxq $$0, fer $$1, gjg $$2, int $$3) {
      $$1.a();
      $$1.a(a.d.rotationDegrees($$0.b - 90.0F));
      $$1.a(a.f.rotationDegrees($$0.a + 90.0F));
      fev $$4 = gqi.a($$2, this.b.a(a), false, $$0.c);
      this.b.a($$1, $$4, $$3, gyv.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   public gxq a() {
      return new gxq();
   }

   public void a(cqa $$0, gxq $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.k($$2);
      $$1.a = $$0.j($$2);
      $$1.c = $$0.A();
   }
}
