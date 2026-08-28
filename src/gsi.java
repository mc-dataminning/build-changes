public class gsi extends gsb<cpl, gyp> {
   private final hbj a;

   public gsi(gsc.a $$0) {
      super($$0);
      this.a = $$0.b();
   }

   public void a(gyp $$0, ffu $$1, glx $$2, int $$3) {
      $$1.a();
      $$1.a(this.e.b());
      if ($$0.a) {
         $$1.a(a.f.rotationDegrees(180.0F));
         $$1.a(a.d.rotationDegrees(180.0F));
         $$1.a(a.b.rotationDegrees(90.0F));
      }

      $$0.b.a($$1, $$2, $$3, hea.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   public gyp a() {
      return new gyp();
   }

   public void a(cpl $$0, gyp $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.m();
      this.a.a($$1.b, $$0.l(), cwn.h, $$0);
   }
}
