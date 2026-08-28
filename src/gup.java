public class gup extends gwq<coq, hbd, gel> {
   private static final ale a = ale.b("textures/entity/breeze/breeze.png");

   public gup(gvk.a $$0) {
      super($$0, new gel($$0.a(gif.K)), 0.5F);
      this.a(new gyx($$0, this));
      this.a(new gyw(this));
   }

   public void a(hbd $$0, fiq $$1, gpd $$2, int $$3) {
      gel $$4 = this.c();
      a($$4, $$4.a(), $$4.c());
      super.a($$0, $$1, $$2, $$3);
   }

   public ale a(hbd $$0) {
      return a;
   }

   public hbd a() {
      return new hbd();
   }

   public void a(coq $$0, hbd $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a.a($$0.a);
      $$1.b.a($$0.bF);
      $$1.c.a($$0.b);
      $$1.d.a($$0.c);
      $$1.e.a($$0.bG);
      $$1.f.a($$0.d);
   }

   public static gel a(gel $$0, gig... $$1) {
      $$0.a().k = false;
      $$0.b().k = false;
      $$0.c().k = false;
      $$0.d().k = false;

      for (gig $$2 : $$1) {
         $$2.k = true;
      }

      return $$0;
   }
}
