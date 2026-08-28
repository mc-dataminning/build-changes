public class gnp extends gni<coi, gts> {
   private final goh a;

   public gnp(gnj.a $$0) {
      super($$0);
      this.a = $$0.b();
   }

   public void a(gts $$0, fde $$1, ghg $$2, int $$3) {
      $$1.a();
      $$1.a(this.e.b());
      if ($$0.a) {
         $$1.a(a.f.rotationDegrees(180.0F));
         $$1.a(a.d.rotationDegrees(180.0F));
         $$1.a(a.b.rotationDegrees(90.0F));
      }

      this.a.a($$0.c, cvm.h, false, $$1, $$2, $$3, gws.d, $$0.b);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   public alc a(gts $$0) {
      return gxa.d;
   }

   public gts a() {
      return new gts();
   }

   public void a(coi $$0, gts $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.o();
      cvp $$3 = $$0.m();
      $$1.c = $$3.u();
      $$1.b = !$$3.f() ? this.a.a($$3, $$0.dS(), null, $$0.ap()) : null;
   }
}
