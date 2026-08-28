public class goq extends gqq<cmu, gvd, fyu> {
   private static final alj a = alj.b("textures/entity/breeze/breeze.png");

   public goq(gpk.a $$0) {
      super($$0, new fyu($$0.a(gck.H)), 0.5F);
      this.a(new gsx($$0, this));
      this.a(new gsw(this));
   }

   public void a(gvd $$0, fer $$1, gjg $$2, int $$3) {
      fyu $$4 = this.c();
      a($$4, $$4.a(), $$4.c());
      super.a($$0, $$1, $$2, $$3);
   }

   public alj a(gvd $$0) {
      return a;
   }

   public gvd a() {
      return new gvd();
   }

   public void a(cmu $$0, gvd $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a.a($$0.bY);
      $$1.b.a($$0.b);
      $$1.c.a($$0.c);
      $$1.d.a($$0.bZ);
      $$1.e.a($$0.d);
   }

   public static fyu a(fyu $$0, gcl... $$1) {
      $$0.a().k = false;
      $$0.b().k = false;
      $$0.c().k = false;
      $$0.d().k = false;

      for (gcl $$2 : $$1) {
         $$2.k = true;
      }

      return $$0;
   }
}
