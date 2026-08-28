public abstract class goq<T extends bux, S extends gus, M extends fym<S>> extends gmu<T, S, M> {
   public goq(gnz.a $$0, M $$1, float $$2) {
      this($$0, $$1, $$1, $$2);
   }

   public goq(gnz.a $$0, M $$1, M $$2, float $$3) {
      this($$0, $$1, $$2, $$3, grr.a.a);
   }

   public goq(gnz.a $$0, M $$1, M $$2, float $$3, grr.a $$4) {
      super($$0, $$1, $$2, $$3);
      this.a(new grr<>(this, $$0.f(), $$4, $$0.b()));
      this.a(new gsy<>(this, $$0.f(), $$0.h()));
      this.a(new gsf<>(this, $$0.b()));
   }

   public void a(T $$0, S $$1, float $$2) {
      super.a($$0, $$1, $$2);
      a($$0, $$1, $$2);
   }

   public static void a(buv $$0, gus $$1, float $$2) {
      $$1.I = $$0.cj();
      $$1.J = $$0.fL();
      $$1.K = $$0.cm();
      $$1.L = $$0.ca();
      $$1.D = 1.0F;
      if ($$1.J) {
         $$1.D = (float)$$0.dA().h();
         $$1.D /= 0.2F;
         $$1.D = $$1.D * $$1.D * $$1.D;
      }

      if ($$1.D < 1.0F) {
         $$1.D = 1.0F;
      }

      $$1.C = $$0.D($$2);
      $$1.B = $$0.a($$2);
      $$1.G = c($$0);
      $$1.H = $$0.fC();
      $$1.E = (float)cuo.b($$0.fD(), $$0);
      $$1.F = $$0.fF();
      $$1.M = $$0.fB();
      $$1.N = $$0.aY.a($$2);
      $$1.O = $$0.aY.b($$2);
      $$1.P = $$0.aY.c($$2);
      $$1.Q = $$0.a(buh.e).v();
      $$1.R = $$0.a(buh.d).v();
      $$1.S = $$0.a(buh.c).v();
   }

   private static bup c(buv $$0) {
      bup $$1 = $$0.fA();
      return $$0.aG == brx.a ? $$1 : $$1.e();
   }
}
