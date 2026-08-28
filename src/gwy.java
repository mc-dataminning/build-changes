public abstract class gwy<T extends bxg, S extends hde, M extends ggm<S>> extends gvb<T, S, M> {
   public gwy(gwh.a $$0, M $$1, float $$2) {
      this($$0, $$1, $$1, $$2);
   }

   public gwy(gwh.a $$0, M $$1, M $$2, float $$3) {
      this($$0, $$1, $$2, $$3, haa.a.a);
   }

   public gwy(gwh.a $$0, M $$1, M $$2, float $$3, haa.a $$4) {
      super($$0, $$1, $$2, $$3);
      this.a(new haa<>(this, $$0.f(), $$4));
      this.a(new hbg<>(this, $$0.f(), $$0.h()));
      this.a(new han<>(this));
   }

   protected ggm.a a(T $$0, bwx $$1) {
      return ggm.a.a;
   }

   public void a(T $$0, S $$1, float $$2) {
      super.a($$0, $$1, $$2);
      a($$0, $$1, $$2, this.h);
      $$1.h = this.a($$0, bwx.a);
      $$1.f = this.a($$0, bwx.b);
   }

   public static void a(bxe $$0, hde $$1, float $$2, hfo $$3) {
      hbr.a($$0, $$1, $$3);
      $$1.N = $$0.ci();
      $$1.O = $$0.fJ();
      $$1.P = $$0.cl();
      $$1.Q = $$0.bZ();
      $$1.I = 1.0F;
      if ($$1.O) {
         $$1.I = (float)$$0.dy().h();
         $$1.I /= 0.2F;
         $$1.I = $$1.I * $$1.I * $$1.I;
      }

      if ($$1.I < 1.0F) {
         $$1.I = 1.0F;
      }

      $$1.H = $$0.D($$2);
      $$1.G = $$0.a($$2);
      $$1.L = c($$0);
      $$1.M = $$0.fA();
      $$1.J = (float)cxw.b($$0.fB(), $$0);
      $$1.K = $$0.fD();
      $$1.R = $$0.fz();
      $$1.S = $$0.aZ.a($$2);
      $$1.T = $$0.aZ.b($$2);
      $$1.U = $$0.aZ.c($$2);
      $$1.V = a($$0, bwp.f);
      $$1.W = a($$0, bwp.e);
      $$1.X = a($$0, bwp.d);
      $$1.Y = a($$0, bwp.c);
   }

   private static czd a(bxe $$0, bwp $$1) {
      czd $$2 = $$0.a($$1);
      return hak.a($$2, $$1) ? $$2.v() : czd.k;
   }

   private static bwx c(bxe $$0) {
      bwx $$1 = $$0.fy();
      return $$0.aJ == buc.a ? $$1 : $$1.e();
   }
}
