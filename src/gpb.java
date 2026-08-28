public abstract class gpb<T extends bvc, S extends gvd, M extends fyx<S>> extends gnf<T, S, M> {
   public gpb(gok.a $$0, M $$1, float $$2) {
      this($$0, $$1, $$1, $$2);
   }

   public gpb(gok.a $$0, M $$1, M $$2, float $$3) {
      this($$0, $$1, $$2, $$3, gsc.a.a);
   }

   public gpb(gok.a $$0, M $$1, M $$2, float $$3, gsc.a $$4) {
      super($$0, $$1, $$2, $$3);
      this.a(new gsc<>(this, $$0.f(), $$4, $$0.b()));
      this.a(new gtj<>(this, $$0.f(), $$0.h()));
      this.a(new gsq<>(this, $$0.b()));
   }

   public void a(T $$0, S $$1, float $$2) {
      super.a($$0, $$1, $$2);
      a($$0, $$1, $$2);
   }

   public static void a(bva $$0, gvd $$1, float $$2) {
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
      $$1.E = (float)cus.b($$0.fD(), $$0);
      $$1.F = $$0.fF();
      $$1.M = $$0.fB();
      $$1.N = $$0.bb.a($$2);
      $$1.O = $$0.bb.b($$2);
      $$1.P = $$0.bb.c($$2);
      $$1.Q = $$0.a(bum.e).v();
      $$1.R = $$0.a(bum.d).v();
      $$1.S = $$0.a(bum.c).v();
   }

   private static buu c(bva $$0) {
      buu $$1 = $$0.fA();
      return $$0.aJ == bsc.a ? $$1 : $$1.e();
   }
}
