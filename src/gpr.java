public abstract class gpr<T extends bvg, S extends gvt, M extends fzn<S>> extends gnv<T, S, M> {
   public gpr(gpa.a $$0, M $$1, float $$2) {
      this($$0, $$1, $$1, $$2);
   }

   public gpr(gpa.a $$0, M $$1, M $$2, float $$3) {
      this($$0, $$1, $$2, $$3, gss.a.a);
   }

   public gpr(gpa.a $$0, M $$1, M $$2, float $$3, gss.a $$4) {
      super($$0, $$1, $$2, $$3);
      this.a(new gss<>(this, $$0.f(), $$4, $$0.b()));
      this.a(new gtz<>(this, $$0.f(), $$0.h()));
      this.a(new gtg<>(this, $$0.b()));
   }

   public void a(T $$0, S $$1, float $$2) {
      super.a($$0, $$1, $$2);
      a($$0, $$1, $$2);
   }

   public static void a(bve $$0, gvt $$1, float $$2) {
      $$1.I = $$0.ck();
      $$1.J = $$0.fM();
      $$1.K = $$0.cn();
      $$1.L = $$0.cb();
      $$1.D = 1.0F;
      if ($$1.J) {
         $$1.D = (float)$$0.dB().h();
         $$1.D /= 0.2F;
         $$1.D = $$1.D * $$1.D * $$1.D;
      }

      if ($$1.D < 1.0F) {
         $$1.D = 1.0F;
      }

      $$1.C = $$0.D($$2);
      $$1.B = $$0.a($$2);
      $$1.G = c($$0);
      $$1.H = $$0.fD();
      $$1.E = (float)cuw.b($$0.fE(), $$0);
      $$1.F = $$0.fG();
      $$1.M = $$0.fC();
      $$1.N = $$0.bb.a($$2);
      $$1.O = $$0.bb.b($$2);
      $$1.P = $$0.bb.c($$2);
      $$1.Q = $$0.a(buq.e).v();
      $$1.R = $$0.a(buq.d).v();
      $$1.S = $$0.a(buq.c).v();
   }

   private static buy c(bve $$0) {
      buy $$1 = $$0.fB();
      return $$0.aJ == bsg.a ? $$1 : $$1.e();
   }
}
