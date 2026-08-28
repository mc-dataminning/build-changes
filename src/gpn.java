public class gpn extends goj<cpf, gvn> {
   private static final ali a = ali.b("textures/entity/llama/spit.png");
   private final fzd b;

   public gpn(gok.a $$0) {
      super($$0);
      this.b = new fzd($$0.a(gbl.bg));
   }

   public void a(gvn $$0, feb $$1, gih $$2, int $$3) {
      $$1.a();
      $$1.a(0.0F, 0.15F, 0.0F);
      $$1.a(a.d.rotationDegrees($$0.a - 90.0F));
      $$1.a(a.f.rotationDegrees($$0.b));
      this.b.a($$0);
      fef $$4 = $$2.getBuffer(this.b.a(a));
      this.b.a($$1, $$4, $$3, gxu.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   public gvn a() {
      return new gvn();
   }

   public void a(cpf $$0, gvn $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.j($$2);
      $$1.a = $$0.k($$2);
   }
}
