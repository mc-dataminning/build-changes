import java.util.List;

public class gyn extends gyh<cob, heu> {
   private final gtd a;

   public gyn(gyi.a $$0) {
      super($$0);
      this.e = 0.5F;
      this.a = $$0.d();
   }

   public boolean a(cob $$0, gvu $$1, double $$2, double $$3, double $$4) {
      return !super.a($$0, $$1, $$2, $$3, $$4) ? false : $$0.j() != $$0.dV().a_($$0.dv());
   }

   public void a(heu $$0, flo $$1, gsa $$2, int $$3) {
      ebe $$4 = $$0.c;
      if ($$4.o() == dtp.b) {
         $$1.a();
         $$1.a(-0.5, 0.0, -0.5);
         List<gtm> $$5 = this.a.a($$4).a(azx.a($$4.b($$0.a)));
         this.a.b().a($$0, $$5, $$4, $$0.b, $$1, $$2.getBuffer(grs.b($$4)), false, hkq.d);
         $$1.b();
         super.a($$0, $$1, $$2, $$3);
      }
   }

   public heu a() {
      return new heu();
   }

   public void a(cob $$0, heu $$1, float $$2) {
      super.a($$0, $$1, $$2);
      iv $$3 = iv.a($$0.dA(), $$0.cR().e, $$0.dG());
      $$1.a = $$0.f();
      $$1.b = $$3;
      $$1.c = $$0.j();
      $$1.d = $$0.dV().u($$3);
      $$1.e = $$0.dV();
   }
}
