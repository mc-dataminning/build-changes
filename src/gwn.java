public class gwn extends gwg<crs, hcu> {
   private final hfo a;

   public gwn(gwh.a $$0) {
      super($$0);
      this.a = $$0.b();
   }

   public void a(hcu $$0, fjj $$1, gqa $$2, int $$3) {
      $$1.a();
      $$1.a(this.d.b());
      if ($$0.a) {
         $$1.a(a.f.rotationDegrees(180.0F));
         $$1.a(a.d.rotationDegrees(180.0F));
         $$1.a(a.b.rotationDegrees(90.0F));
      }

      $$0.b.a($$1, $$2, $$3, hin.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   public hcu a() {
      return new hcu();
   }

   public void a(crs $$0, hcu $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.g();
      this.a.a($$1.b, $$0.f(), czb.h, $$0);
   }
}
