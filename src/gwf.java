public class gwf extends gvy<crn, hcm> {
   private final hfg a;

   public gwf(gvz.a $$0) {
      super($$0);
      this.a = $$0.b();
   }

   public void a(hcm $$0, fjc $$1, gps $$2, int $$3) {
      $$1.a();
      $$1.a(this.d.b());
      if ($$0.a) {
         $$1.a(a.f.rotationDegrees(180.0F));
         $$1.a(a.d.rotationDegrees(180.0F));
         $$1.a(a.b.rotationDegrees(90.0F));
      }

      $$0.b.a($$1, $$2, $$3, hif.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   public hcm a() {
      return new hcm();
   }

   public void a(crn $$0, hcm $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.g();
      this.a.a($$1.b, $$0.f(), cyw.h, $$0);
   }
}
