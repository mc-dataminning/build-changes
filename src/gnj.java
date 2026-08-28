public abstract class gnj<T extends buh, S extends gtk, M extends fxn<S>> extends gln<T, S, M> {
   public gnj(gms.a $$0, M $$1, float $$2) {
      this($$0, $$1, $$1, $$2);
   }

   public gnj(gms.a $$0, M $$1, M $$2, float $$3) {
      this($$0, $$1, $$2, $$3, gqk.a.a);
   }

   public gnj(gms.a $$0, M $$1, M $$2, float $$3, gqk.a $$4) {
      super($$0, $$1, $$2, $$3);
      this.a(new gqk<>(this, $$0.f(), $$4, $$0.b()));
      this.a(new gqo<>(this, $$0.f()));
      this.a(new gqy<>(this, $$0.b()));
   }

   public void a(T $$0, S $$1, float $$2) {
      super.a($$0, $$1, $$2);
      a($$0, $$1, $$2);
   }

   public static void a(buf $$0, gtk $$1, float $$2) {
      $$1.I = $$0.cf();
      $$1.J = $$0.fE();
      $$1.K = $$0.ch();
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
      $$1.E = (float)cty.b($$0.fx(), $$0);
      $$1.F = $$0.fz();
      $$1.M = $$0.fv();
      $$1.N = $$0.aY.a($$2);
      $$1.O = $$0.aY.b($$2);
      $$1.P = $$0.aY.c($$2);
      $$1.Q = $$0.a(btr.e).u();
      $$1.R = $$0.a(btr.d).u();
      $$1.S = $$0.a(btr.c).u();
   }

   private static btz c(buf $$0) {
      btz $$1 = $$0.fu();
      return $$0.aG == brj.a ? $$1 : $$1.e();
   }
}
