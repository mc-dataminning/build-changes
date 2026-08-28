public abstract class gsh<T extends bwi, S extends gyl, M extends gbz<S>> extends gqk<T, S, M> {
   public gsh(grq.a $$0, M $$1, float $$2) {
      this($$0, $$1, $$1, $$2);
   }

   public gsh(grq.a $$0, M $$1, M $$2, float $$3) {
      this($$0, $$1, $$2, $$3, gvj.a.a);
   }

   public gsh(grq.a $$0, M $$1, M $$2, float $$3, gvj.a $$4) {
      super($$0, $$1, $$2, $$3);
      this.a(new gvj<>(this, $$0.f(), $$4, $$0.b()));
      this.a(new gwq<>(this, $$0.f(), $$0.h()));
      this.a(new gvx<>(this, $$0.b()));
   }

   public void a(T $$0, S $$1, float $$2) {
      super.a($$0, $$1, $$2);
      a($$0, $$1, $$2);
   }

   public static void a(bwg $$0, gyl $$1, float $$2) {
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
      $$1.E = (float)cwg.b($$0.fB(), $$0);
      $$1.F = $$0.fD();
      $$1.M = $$0.fz();
      $$1.N = $$0.bb.a($$2);
      $$1.O = $$0.bb.b($$2);
      $$1.P = $$0.bb.c($$2);
      $$1.Q = $$0.a(bvs.e).v();
      $$1.R = $$0.a(bvs.d).v();
      $$1.S = $$0.a(bvs.c).v();
   }

   private static bwa c(bwg $$0) {
      bwa $$1 = $$0.fy();
      return $$0.aJ == bti.a ? $$1 : $$1.e();
   }
}
