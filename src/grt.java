public class grt extends grn<clz, gxy> {
   private final gmm a;

   public grt(gro.a $$0) {
      super($$0);
      this.f = 0.5F;
      this.a = $$0.d();
   }

   public boolean a(clz $$0, gpa $$1, double $$2, double $$3, double $$4) {
      return !super.a($$0, $$1, $$2, $$3, $$4) ? false : $$0.p() != $$0.dV().a_($$0.dv());
   }

   public void a(gxy $$0, fgq $$1, glj $$2, int $$3) {
      dxu $$4 = $$0.c;
      if ($$4.o() == dqu.c) {
         $$1.a();
         $$1.a(-0.5, 0.0, -0.5);
         this.a.b().a($$0, this.a.a($$4), $$4, $$0.b, $$1, $$2.getBuffer(glb.b($$4)), false, bam.a(), $$4.b($$0.a), hba.d);
         $$1.b();
         super.a($$0, $$1, $$2, $$3);
      }
   }

   public gxy a() {
      return new gxy();
   }

   public void a(clz $$0, gxy $$1, float $$2) {
      super.a($$0, $$1, $$2);
      jh $$3 = jh.a($$0.dA(), $$0.cR().e, $$0.dG());
      $$1.a = $$0.l();
      $$1.b = $$3;
      $$1.c = $$0.p();
      $$1.d = $$0.dV().t($$3);
      $$1.e = $$0.dV();
   }
}
