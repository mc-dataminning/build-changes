public class gxp extends gzq<cpx, hee, ghi> {
   private static final alk a = alk.b("textures/entity/breeze/breeze.png");

   public gxp(gyk.a $$0) {
      super($$0, new ghi($$0.a(glf.K)), 0.5F);
      this.a(new hbx($$0, this));
      this.a(new hbw(this));
   }

   public void a(hee $$0, flq $$1, gsc $$2, int $$3) {
      ghi $$4 = this.c();
      a($$4, $$4.a(), $$4.c());
      super.a($$0, $$1, $$2, $$3);
   }

   public alk a(hee $$0) {
      return a;
   }

   public hee a() {
      return new hee();
   }

   public void a(cpx $$0, hee $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a.a($$0.a);
      $$1.b.a($$0.e);
      $$1.c.a($$0.b);
      $$1.d.a($$0.c);
      $$1.e.a($$0.f);
      $$1.f.a($$0.d);
   }

   public static ghi a(ghi $$0, glg... $$1) {
      $$0.a().k = false;
      $$0.b().k = false;
      $$0.c().k = false;
      $$0.d().k = false;

      for (glg $$2 : $$1) {
         $$2.k = true;
      }

      return $$0;
   }
}
