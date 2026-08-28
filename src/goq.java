public class goq extends goj<cpb, guu> {
   private final gpi a;

   public goq(gok.a $$0) {
      super($$0);
      this.a = $$0.b();
   }

   public void a(guu $$0, feb $$1, gih $$2, int $$3) {
      $$1.a();
      $$1.a(this.e.b());
      if ($$0.a) {
         $$1.a(a.f.rotationDegrees(180.0F));
         $$1.a(a.d.rotationDegrees(180.0F));
         $$1.a(a.b.rotationDegrees(90.0F));
      }

      this.a.a($$0.c, cvz.h, false, $$1, $$2, $$3, gxu.d, $$0.b);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   public guu a() {
      return new guu();
   }

   public void a(cpb $$0, guu $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.o();
      cwb $$3 = $$0.m();
      $$1.c = $$3.v();
      $$1.b = !$$3.f() ? this.a.a($$3, $$0.dX(), null, $$0.as()) : null;
   }
}
