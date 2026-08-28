public class gsh extends gsa<cpj, gyo> {
   private final hbi a;

   public gsh(gsb.a $$0) {
      super($$0);
      this.a = $$0.b();
   }

   public void a(gyo $$0, ffs $$1, glv $$2, int $$3) {
      $$1.a();
      $$1.a(this.e.b());
      if ($$0.a) {
         $$1.a(a.f.rotationDegrees(180.0F));
         $$1.a(a.d.rotationDegrees(180.0F));
         $$1.a(a.b.rotationDegrees(90.0F));
      }

      $$0.b.a($$1, $$2, $$3, hec.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   public gyo a() {
      return new gyo();
   }

   public void a(cpj $$0, gyo $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.m();
      this.a.a($$1.b, $$0.l(), cwl.h, $$0);
   }
}
