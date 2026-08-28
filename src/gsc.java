public abstract class gsc<T extends bvz, S extends gyg, M extends gbu<S>> extends gqf<T, S, M> {
   public gsc(grl.a $$0, M $$1, float $$2) {
      this($$0, $$1, $$1, $$2);
   }

   public gsc(grl.a $$0, M $$1, M $$2, float $$3) {
      this($$0, $$1, $$2, $$3, gve.a.a);
   }

   public gsc(grl.a $$0, M $$1, M $$2, float $$3, gve.a $$4) {
      super($$0, $$1, $$2, $$3);
      this.a(new gve<>(this, $$0.f(), $$4, $$0.b()));
      this.a(new gwl<>(this, $$0.f(), $$0.h()));
      this.a(new gvs<>(this, $$0.b()));
   }

   public void a(T $$0, S $$1, float $$2) {
      super.a($$0, $$1, $$2);
      a($$0, $$1, $$2);
   }

   public static void a(bvx $$0, gyg $$1, float $$2) {
      $$1.I = $$0.ci();
      $$1.J = $$0.fJ();
      $$1.K = $$0.cl();
      $$1.L = $$0.bZ();
      $$1.D = 1.0F;
      if ($$1.J) {
         $$1.D = (float)$$0.dz().h();
         $$1.D /= 0.2F;
         $$1.D = $$1.D * $$1.D * $$1.D;
      }

      if ($$1.D < 1.0F) {
         $$1.D = 1.0F;
      }

      $$1.C = $$0.D($$2);
      $$1.B = $$0.a($$2);
      $$1.G = c($$0);
      $$1.H = $$0.fA();
      $$1.E = (float)cvx.b($$0.fB(), $$0);
      $$1.F = $$0.fD();
      $$1.M = $$0.fz();
      $$1.N = $$0.bb.a($$2);
      $$1.O = $$0.bb.b($$2);
      $$1.P = $$0.bb.c($$2);
      $$1.Q = $$0.a(bvj.e).v();
      $$1.R = $$0.a(bvj.d).v();
      $$1.S = $$0.a(bvj.c).v();
   }

   private static bvr c(bvx $$0) {
      bvr $$1 = $$0.fy();
      return $$0.aJ == bsz.a ? $$1 : $$1.e();
   }
}
