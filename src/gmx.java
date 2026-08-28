public class gmx extends gmr<cjy, gsz> {
   private final ghu a;

   public gmx(gms.a $$0) {
      super($$0);
      this.f = 0.5F;
      this.a = $$0.d();
   }

   public boolean a(cjy $$0, gkh $$1, double $$2, double $$3, double $$4) {
      return !super.a($$0, $$1, $$2, $$3, $$4) ? false : $$0.q() != $$0.dS().a_($$0.ds());
   }

   public void a(gsz $$0, fcu $$1, ggv $$2, int $$3) {
      dua $$4 = $$0.c;
      if ($$4.o() == dnc.c) {
         $$1.a();
         $$1.a(-0.5, 0.0, -0.5);
         this.a.b().a($$0, this.a.a($$4), $$4, $$0.b, $$1, $$2.getBuffer(ggn.b($$4)), false, azk.a(), $$4.b($$0.a), gwb.d);
         $$1.b();
         super.a($$0, $$1, $$2, $$3);
      }
   }

   public alb a(gsz $$0) {
      return gwj.d;
   }

   public gsz a() {
      return new gsz();
   }

   public void a(cjy $$0, gsz $$1, float $$2) {
      super.a($$0, $$1, $$2);
      je $$3 = je.a($$0.dx(), $$0.cO().e, $$0.dD());
      $$1.a = $$0.m();
      $$1.b = $$3;
      $$1.c = $$0.q();
      $$1.d = $$0.dS().t($$3);
      $$1.e = $$0.dS();
   }
}
