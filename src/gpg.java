public class gpg extends goz<cpf, gvk> {
   private final gpy a;

   public gpg(gpa.a $$0) {
      super($$0);
      this.a = $$0.b();
   }

   public void a(gvk $$0, fek $$1, gix $$2, int $$3) {
      $$1.a();
      $$1.a(this.e.b());
      if ($$0.a) {
         $$1.a(a.f.rotationDegrees(180.0F));
         $$1.a(a.d.rotationDegrees(180.0F));
         $$1.a(a.b.rotationDegrees(90.0F));
      }

      this.a.a($$0.c, cwd.h, false, $$1, $$2, $$3, gyk.d, $$0.b);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   public gvk a() {
      return new gvk();
   }

   public void a(cpf $$0, gvk $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.o();
      cwf $$3 = $$0.m();
      $$1.c = $$3.v();
      $$1.b = !$$3.f() ? this.a.a($$3, $$0.dY(), null, $$0.as()) : null;
   }
}
