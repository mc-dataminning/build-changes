public class gqn extends gpj<cpm, gwo> {
   private static final alj a = alj.b("textures/entity/llama/spit.png");
   private final gac b;

   public gqn(gpk.a $$0) {
      super($$0);
      this.b = new gac($$0.a(gck.bs));
   }

   public void a(gwo $$0, fer $$1, gjg $$2, int $$3) {
      $$1.a();
      $$1.a(0.0F, 0.15F, 0.0F);
      $$1.a(a.d.rotationDegrees($$0.a - 90.0F));
      $$1.a(a.f.rotationDegrees($$0.b));
      this.b.a($$0);
      fev $$4 = $$2.getBuffer(this.b.a(a));
      this.b.a($$1, $$4, $$3, gyv.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   public gwo a() {
      return new gwo();
   }

   public void a(cpm $$0, gwo $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.j($$2);
      $$1.a = $$0.k($$2);
   }
}
