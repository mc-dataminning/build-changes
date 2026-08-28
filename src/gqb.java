public abstract class gqb<T extends bvj, S extends gwe, M extends fzw<S>> extends gof<T, S, M> {
   public gqb(gpk.a $$0, M $$1, float $$2) {
      this($$0, $$1, $$1, $$2);
   }

   public gqb(gpk.a $$0, M $$1, M $$2, float $$3) {
      this($$0, $$1, $$2, $$3, gtd.a.a);
   }

   public gqb(gpk.a $$0, M $$1, M $$2, float $$3, gtd.a $$4) {
      super($$0, $$1, $$2, $$3);
      this.a(new gtd<>(this, $$0.f(), $$4, $$0.b()));
      this.a(new guk<>(this, $$0.f(), $$0.h()));
      this.a(new gtr<>(this, $$0.b()));
   }

   public void a(T $$0, S $$1, float $$2) {
      super.a($$0, $$1, $$2);
      a($$0, $$1, $$2);
   }

   public static void a(bvh $$0, gwe $$1, float $$2) {
      $$1.I = $$0.ci();
      $$1.J = $$0.fH();
      $$1.K = $$0.cl();
      $$1.L = $$0.bZ();
      $$1.D = 1.0F;
      if ($$1.J) {
         $$1.D = (float)$$0.dy().h();
         $$1.D /= 0.2F;
         $$1.D = $$1.D * $$1.D * $$1.D;
      }

      if ($$1.D < 1.0F) {
         $$1.D = 1.0F;
      }

      $$1.C = $$0.D($$2);
      $$1.B = $$0.a($$2);
      $$1.G = c($$0);
      $$1.H = $$0.fy();
      $$1.E = (float)cvd.b($$0.fz(), $$0);
      $$1.F = $$0.fB();
      $$1.M = $$0.fx();
      $$1.N = $$0.ba.a($$2);
      $$1.O = $$0.ba.b($$2);
      $$1.P = $$0.ba.c($$2);
      $$1.Q = $$0.a(but.e).v();
      $$1.R = $$0.a(but.d).v();
      $$1.S = $$0.a(but.c).v();
   }

   private static bvb c(bvh $$0) {
      bvb $$1 = $$0.fw();
      return $$0.aI == bsj.a ? $$1 : $$1.e();
   }
}
