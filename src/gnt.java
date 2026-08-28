public class gnt extends gnn<ckg, gtv> {
   private final gio a;

   public gnt(gno.a $$0) {
      super($$0);
      this.f = 0.5F;
      this.a = $$0.d();
   }

   public boolean a(ckg $$0, glc $$1, double $$2, double $$3, double $$4) {
      return !super.a($$0, $$1, $$2, $$3, $$4) ? false : $$0.q() != $$0.dS().a_($$0.ds());
   }

   public void a(gtv $$0, fdi $$1, ghl $$2, int $$3) {
      dus $$4 = $$0.c;
      if ($$4.o() == dnt.c) {
         $$1.a();
         $$1.a(-0.5, 0.0, -0.5);
         this.a.b().a($$0, this.a.a($$4), $$4, $$0.b, $$1, $$2.getBuffer(ghd.b($$4)), false, azn.a(), $$4.b($$0.a), gwx.d);
         $$1.b();
         super.a($$0, $$1, $$2, $$3);
      }
   }

   public gtv a() {
      return new gtv();
   }

   public void a(ckg $$0, gtv $$1, float $$2) {
      super.a($$0, $$1, $$2);
      jf $$3 = jf.a($$0.dx(), $$0.cO().e, $$0.dD());
      $$1.a = $$0.m();
      $$1.b = $$3;
      $$1.c = $$0.q();
      $$1.d = $$0.dS().t($$3);
      $$1.e = $$0.dS();
   }
}
