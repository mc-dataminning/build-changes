import java.util.List;

public class gyp extends gyj<cod, hew> {
   private final gtf a;

   public gyp(gyk.a $$0) {
      super($$0);
      this.e = 0.5F;
      this.a = $$0.d();
   }

   public boolean a(cod $$0, gvw $$1, double $$2, double $$3, double $$4) {
      return !super.a($$0, $$1, $$2, $$3, $$4) ? false : $$0.j() != $$0.dV().a_($$0.dv());
   }

   public void a(hew $$0, flq $$1, gsc $$2, int $$3) {
      ebg $$4 = $$0.c;
      if ($$4.o() == dtr.b) {
         $$1.a();
         $$1.a(-0.5, 0.0, -0.5);
         List<gto> $$5 = this.a.a($$4).a(azz.a($$4.b($$0.a)));
         this.a.b().a($$0, $$5, $$4, $$0.b, $$1, $$2.getBuffer(gru.b($$4)), false, hks.d);
         $$1.b();
         super.a($$0, $$1, $$2, $$3);
      }
   }

   public hew a() {
      return new hew();
   }

   public void a(cod $$0, hew $$1, float $$2) {
      super.a($$0, $$1, $$2);
      iw $$3 = iw.a($$0.dA(), $$0.cR().e, $$0.dG());
      $$1.a = $$0.f();
      $$1.b = $$3;
      $$1.c = $$0.j();
      $$1.d = $$0.dV().u($$3);
      $$1.e = $$0.dV();
   }
}
