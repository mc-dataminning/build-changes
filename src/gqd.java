public class gqd extends goz<cpj, gwd> {
   private static final all a = all.b("textures/entity/llama/spit.png");
   private final fzt b;

   public gqd(gpa.a $$0) {
      super($$0);
      this.b = new fzt($$0.a(gcb.bg));
   }

   public void a(gwd $$0, fek $$1, gix $$2, int $$3) {
      $$1.a();
      $$1.a(0.0F, 0.15F, 0.0F);
      $$1.a(a.d.rotationDegrees($$0.a - 90.0F));
      $$1.a(a.f.rotationDegrees($$0.b));
      this.b.a($$0);
      feo $$4 = $$2.getBuffer(this.b.a(a));
      this.b.a($$1, $$4, $$3, gyk.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   public gwd a() {
      return new gwd();
   }

   public void a(cpj $$0, gwd $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.j($$2);
      $$1.a = $$0.k($$2);
   }
}
