public class gor extends gnn<coq, guq> {
   private static final ale a = ale.b("textures/entity/llama/spit.png");
   private final fyh b;

   public gor(gno.a $$0) {
      super($$0);
      this.b = new fyh($$0.a(gap.bg));
   }

   public void a(guq $$0, fdi $$1, ghl $$2, int $$3) {
      $$1.a();
      $$1.a(0.0F, 0.15F, 0.0F);
      $$1.a(a.d.rotationDegrees($$0.a - 90.0F));
      $$1.a(a.f.rotationDegrees($$0.b));
      this.b.a($$0);
      fdm $$4 = $$2.getBuffer(this.b.a(a));
      this.b.a($$1, $$4, $$3, gwx.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   public guq a() {
      return new guq();
   }

   public void a(coq $$0, guq $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.j($$2);
      $$1.a = $$0.k($$2);
   }
}
