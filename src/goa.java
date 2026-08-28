public abstract class goa<T extends bum, S extends gub, M extends fxx<S>> extends gme<T, S, M> {
   public goa(gnj.a $$0, M $$1, float $$2) {
      this($$0, $$1, $$1, $$2);
   }

   public goa(gnj.a $$0, M $$1, M $$2, float $$3) {
      this($$0, $$1, $$2, $$3, grb.a.a);
   }

   public goa(gnj.a $$0, M $$1, M $$2, float $$3, grb.a $$4) {
      super($$0, $$1, $$2, $$3);
      this.a(new grb<>(this, $$0.f(), $$4, $$0.b()));
      this.a(new grf<>(this, $$0.f()));
      this.a(new grp<>(this, $$0.b()));
   }

   public void a(T $$0, S $$1, float $$2) {
      super.a($$0, $$1, $$2);
      a($$0, $$1, $$2);
   }

   public static void a(buk $$0, gub $$1, float $$2) {
      $$1.I = $$0.cf();
      $$1.J = $$0.fF();
      $$1.K = $$0.ci();
      $$1.L = $$0.bW();
      $$1.D = 1.0F;
      if ($$1.J) {
         $$1.D = (float)$$0.dv().h();
         $$1.D /= 0.2F;
         $$1.D = $$1.D * $$1.D * $$1.D;
      }

      if ($$1.D < 1.0F) {
         $$1.D = 1.0F;
      }

      $$1.C = $$0.D($$2);
      $$1.B = $$0.a($$2);
      $$1.G = c($$0);
      $$1.H = $$0.fw();
      $$1.E = (float)cud.b($$0.fx(), $$0);
      $$1.F = $$0.fz();
      $$1.M = $$0.fv();
      $$1.N = $$0.aX.a($$2);
      $$1.O = $$0.aX.b($$2);
      $$1.P = $$0.aX.c($$2);
      $$1.Q = $$0.a(btw.e).u();
      $$1.R = $$0.a(btw.d).u();
      $$1.S = $$0.a(btw.c).u();
   }

   private static bue c(buk $$0) {
      bue $$1 = $$0.fu();
      return $$0.aF == bro.a ? $$1 : $$1.e();
   }
}
