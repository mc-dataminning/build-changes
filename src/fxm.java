import com.google.common.collect.ImmutableList;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class fxm extends fvi {
   private static final wp a = wp.c("structure_block.structure_name");
   private static final wp b = wp.c("structure_block.position");
   private static final wp c = wp.c("structure_block.size");
   private static final wp d = wp.c("structure_block.integrity");
   private static final wp s = wp.c("structure_block.custom_data");
   private static final wp u = wp.c("structure_block.include_entities");
   private static final wp v = wp.c("structure_block.strict");
   private static final wp w = wp.c("structure_block.detect_size");
   private static final wp x = wp.c("structure_block.show_air");
   private static final wp y = wp.c("structure_block.show_boundingbox");
   private static final ImmutableList<dza> z = ImmutableList.copyOf(dza.values());
   private static final ImmutableList<dza> A = z.stream().filter($$0 -> $$0 != dza.d).collect(ImmutableList.toImmutableList());
   private final dwk B;
   private dpf C = dpf.a;
   private dqw D = dqw.a;
   private dza E = dza.d;
   private boolean F;
   private boolean G;
   private boolean H;
   private boolean I;
   private fpz J;
   private fpz K;
   private fpz L;
   private fpz M;
   private fpz N;
   private fpz O;
   private fpz P;
   private fpz Q;
   private fpz R;
   private fpz S;
   private fpq T;
   private fpq U;
   private fpq V;
   private fpq W;
   private fpq X;
   private fpq Y;
   private fpq Z;
   private fpx<Boolean> aa;
   private fpx<Boolean> ab;
   private fpx<dpf> ac;
   private fpx<Boolean> ad;
   private fpx<Boolean> ae;
   private final DecimalFormat af = new DecimalFormat("0.0###");

   public fxm(dwk $$0) {
      super(wp.c(dkg.pC.v()));
      this.B = $$0;
      this.af.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ROOT));
   }

   private void m() {
      if (this.a(dwk.a.a)) {
         this.m.a(null);
      }
   }

   private void E() {
      this.B.a(this.C);
      this.B.a(this.D);
      this.B.a(this.E);
      this.B.a(this.F);
      this.B.b(this.G);
      this.B.e(this.H);
      this.B.f(this.I);
      this.m.a(null);
   }

   @Override
   protected void aR_() {
      this.c((fpq)fpq.a(wo.d, $$0x -> this.m()).a(this.n / 2 - 4 - 150, 210, 150, 20).a());
      this.c((fpq)fpq.a(wo.e, $$0x -> this.E()).a(this.n / 2 + 4, 210, 150, 20).a());
      this.C = this.B.k();
      this.D = this.B.s();
      this.E = this.B.u();
      this.F = this.B.v();
      this.G = this.B.w();
      this.H = this.B.E();
      this.I = this.B.F();
      this.T = this.c((fpq)fpq.a(wp.c("structure_block.button.save"), $$0x -> {
         if (this.B.u() == dza.a) {
            this.a(dwk.a.b);
            this.m.a(null);
         }
      }).a(this.n / 2 + 4 + 100, 185, 50, 20).a());
      this.U = this.c((fpq)fpq.a(wp.c("structure_block.button.load"), $$0x -> {
         if (this.B.u() == dza.b) {
            this.a(dwk.a.c);
            this.m.a(null);
         }
      }).a(this.n / 2 + 4 + 100, 185, 50, 20).a());
      this.c(
         fpx.<dza>a($$0x -> wp.c("structure_block.mode." + $$0x.c()))
            .a(A, z)
            .a()
            .a(this.E)
            .a(this.n / 2 - 4 - 150, 185, 50, 20, wp.b("MODE"), ($$0x, $$1x) -> {
               this.B.a($$1x);
               this.a($$1x);
            })
      );
      this.Z = this.c((fpq)fpq.a(wp.c("structure_block.button.detect_size"), $$0x -> {
         if (this.B.u() == dza.a) {
            this.a(dwk.a.d);
            this.m.a(null);
         }
      }).a(this.n / 2 + 4 + 100, 120, 50, 20).a());
      this.aa = this.c(fpx.b(!this.B.v()).a().a(this.n / 2 + 4 + 100, 160, 50, 20, u, ($$0x, $$1x) -> this.B.a(!$$1x)));
      this.ab = this.c(fpx.b(this.B.w()).a().a(this.n / 2 + 4 + 100, 120, 50, 20, v, ($$0x, $$1x) -> this.B.b($$1x)));
      this.ac = this.c(fpx.<dpf>a(dpf::b).a(dpf.values()).a().a(this.C).a(this.n / 2 - 20, 185, 40, 20, wp.b("MIRROR"), ($$0x, $$1x) -> this.B.a($$1x)));
      this.ad = this.c(fpx.b(this.B.E()).a().a(this.n / 2 + 4 + 100, 80, 50, 20, x, ($$0x, $$1x) -> this.B.e($$1x)));
      this.ae = this.c(fpx.b(this.B.F()).a().a(this.n / 2 + 4 + 100, 80, 50, 20, y, ($$0x, $$1x) -> this.B.f($$1x)));
      this.V = this.c((fpq)fpq.a(wp.b("0"), $$0x -> {
         this.B.a(dqw.a);
         this.F();
      }).a(this.n / 2 - 1 - 40 - 1 - 40 - 20, 185, 40, 20).a());
      this.W = this.c((fpq)fpq.a(wp.b("90"), $$0x -> {
         this.B.a(dqw.b);
         this.F();
      }).a(this.n / 2 - 1 - 40 - 20, 185, 40, 20).a());
      this.X = this.c((fpq)fpq.a(wp.b("180"), $$0x -> {
         this.B.a(dqw.c);
         this.F();
      }).a(this.n / 2 + 1 + 20, 185, 40, 20).a());
      this.Y = this.c((fpq)fpq.a(wp.b("270"), $$0x -> {
         this.B.a(dqw.d);
         this.F();
      }).a(this.n / 2 + 1 + 40 + 1 + 20, 185, 40, 20).a());
      this.J = new fpz(this.p, this.n / 2 - 152, 40, 300, 20, wp.c("structure_block.structure_name")) {
         @Override
         public boolean a(char $$0, int $$1) {
            return !fxm.this.a(this.a(), $$0, this.e()) ? false : super.a($$0, $$1);
         }
      };
      this.J.f(128);
      this.J.a(this.B.c());
      this.d(this.J);
      ji $$0 = this.B.f();
      this.K = new fpz(this.p, this.n / 2 - 152, 80, 80, 20, wp.c("structure_block.position.x"));
      this.K.f(15);
      this.K.a(Integer.toString($$0.u()));
      this.d(this.K);
      this.L = new fpz(this.p, this.n / 2 - 72, 80, 80, 20, wp.c("structure_block.position.y"));
      this.L.f(15);
      this.L.a(Integer.toString($$0.v()));
      this.d(this.L);
      this.M = new fpz(this.p, this.n / 2 + 8, 80, 80, 20, wp.c("structure_block.position.z"));
      this.M.f(15);
      this.M.a(Integer.toString($$0.w()));
      this.d(this.M);
      km $$1 = this.B.j();
      this.N = new fpz(this.p, this.n / 2 - 152, 120, 80, 20, wp.c("structure_block.size.x"));
      this.N.f(15);
      this.N.a(Integer.toString($$1.u()));
      this.d(this.N);
      this.O = new fpz(this.p, this.n / 2 - 72, 120, 80, 20, wp.c("structure_block.size.y"));
      this.O.f(15);
      this.O.a(Integer.toString($$1.v()));
      this.d(this.O);
      this.P = new fpz(this.p, this.n / 2 + 8, 120, 80, 20, wp.c("structure_block.size.z"));
      this.P.f(15);
      this.P.a(Integer.toString($$1.w()));
      this.d(this.P);
      this.Q = new fpz(this.p, this.n / 2 - 152, 120, 80, 20, wp.c("structure_block.integrity.integrity"));
      this.Q.f(15);
      this.Q.a(this.af.format((double)this.B.x()));
      this.d(this.Q);
      this.R = new fpz(this.p, this.n / 2 - 72, 120, 80, 20, wp.c("structure_block.integrity.seed"));
      this.R.f(31);
      this.R.a(Long.toString(this.B.y()));
      this.d(this.R);
      this.S = new fpz(this.p, this.n / 2 - 152, 120, 240, 20, wp.c("structure_block.custom_data"));
      this.S.f(128);
      this.S.a(this.B.t());
      this.d(this.S);
      this.F();
      this.a(this.E);
   }

   @Override
   protected void aF_() {
      this.b(this.J);
   }

   @Override
   public void b(fpc $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }

   @Override
   public void a(fmg $$0, int $$1, int $$2) {
      String $$3 = this.J.a();
      String $$4 = this.K.a();
      String $$5 = this.L.a();
      String $$6 = this.M.a();
      String $$7 = this.N.a();
      String $$8 = this.O.a();
      String $$9 = this.P.a();
      String $$10 = this.Q.a();
      String $$11 = this.R.a();
      String $$12 = this.S.a();
      this.b($$0, $$1, $$2);
      this.J.a($$3);
      this.K.a($$4);
      this.L.a($$5);
      this.M.a($$6);
      this.N.a($$7);
      this.O.a($$8);
      this.P.a($$9);
      this.Q.a($$10);
      this.R.a($$11);
      this.S.a($$12);
   }

   private void F() {
      this.V.j = true;
      this.W.j = true;
      this.X.j = true;
      this.Y.j = true;
      switch (this.B.s()) {
         case a:
            this.V.j = false;
            break;
         case c:
            this.X.j = false;
            break;
         case d:
            this.Y.j = false;
            break;
         case b:
            this.W.j = false;
      }
   }

   private void a(dza $$0) {
      this.J.g(false);
      this.K.g(false);
      this.L.g(false);
      this.M.g(false);
      this.N.g(false);
      this.O.g(false);
      this.P.g(false);
      this.Q.g(false);
      this.R.g(false);
      this.S.g(false);
      this.T.k = false;
      this.U.k = false;
      this.Z.k = false;
      this.aa.k = false;
      this.ab.k = false;
      this.ac.k = false;
      this.V.k = false;
      this.W.k = false;
      this.X.k = false;
      this.Y.k = false;
      this.ad.k = false;
      this.ae.k = false;
      switch ($$0) {
         case a:
            this.J.g(true);
            this.K.g(true);
            this.L.g(true);
            this.M.g(true);
            this.N.g(true);
            this.O.g(true);
            this.P.g(true);
            this.T.k = true;
            this.Z.k = true;
            this.aa.k = true;
            this.ab.k = false;
            this.ad.k = true;
            break;
         case b:
            this.J.g(true);
            this.K.g(true);
            this.L.g(true);
            this.M.g(true);
            this.Q.g(true);
            this.R.g(true);
            this.U.k = true;
            this.aa.k = true;
            this.ab.k = true;
            this.ac.k = true;
            this.V.k = true;
            this.W.k = true;
            this.X.k = true;
            this.Y.k = true;
            this.ae.k = true;
            this.F();
            break;
         case c:
            this.J.g(true);
            break;
         case d:
            this.S.g(true);
      }
   }

   private boolean a(dwk.a $$0) {
      ji $$1 = new ji(this.c(this.K.a()), this.c(this.L.a()), this.c(this.M.a()));
      km $$2 = new km(this.c(this.N.a()), this.c(this.O.a()), this.c(this.P.a()));
      float $$3 = this.b(this.Q.a());
      long $$4 = this.a(this.R.a());
      this.m
         .L()
         .b(
            new aib(
               this.B.aA_(),
               $$0,
               this.B.u(),
               this.J.a(),
               $$1,
               $$2,
               this.B.k(),
               this.B.s(),
               this.S.a(),
               this.B.v(),
               this.B.w(),
               this.B.E(),
               this.B.F(),
               $$3,
               $$4
            )
         );
      return true;
   }

   private long a(String $$0) {
      try {
         return Long.valueOf($$0);
      } catch (NumberFormatException var3) {
         return 0L;
      }
   }

   private float b(String $$0) {
      try {
         return Float.valueOf($$0);
      } catch (NumberFormatException var3) {
         return 1.0F;
      }
   }

   private int c(String $$0) {
      try {
         return Integer.parseInt($$0);
      } catch (NumberFormatException var3) {
         return 0;
      }
   }

   @Override
   public void aO_() {
      this.E();
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (super.a($$0, $$1, $$2)) {
         return true;
      } else if ($$0 != 257 && $$0 != 335) {
         return false;
      } else {
         this.m();
         return true;
      }
   }

   @Override
   public void a(fpc $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      dza $$4 = this.B.u();
      $$0.a(this.p, this.l, this.n / 2, 10, 16777215);
      if ($$4 != dza.d) {
         $$0.b(this.p, a, this.n / 2 - 153, 30, 10526880);
         this.J.a($$0, $$1, $$2, $$3);
      }

      if ($$4 == dza.b || $$4 == dza.a) {
         $$0.b(this.p, b, this.n / 2 - 153, 70, 10526880);
         this.K.a($$0, $$1, $$2, $$3);
         this.L.a($$0, $$1, $$2, $$3);
         this.M.a($$0, $$1, $$2, $$3);
         $$0.b(this.p, u, this.n / 2 + 154 - this.p.a(u), 150, 10526880);
      }

      if ($$4 == dza.a) {
         $$0.b(this.p, c, this.n / 2 - 153, 110, 10526880);
         this.N.a($$0, $$1, $$2, $$3);
         this.O.a($$0, $$1, $$2, $$3);
         this.P.a($$0, $$1, $$2, $$3);
         $$0.b(this.p, w, this.n / 2 + 154 - this.p.a(w), 110, 10526880);
         $$0.b(this.p, x, this.n / 2 + 154 - this.p.a(x), 70, 10526880);
      }

      if ($$4 == dza.b) {
         $$0.b(this.p, d, this.n / 2 - 153, 110, 10526880);
         this.Q.a($$0, $$1, $$2, $$3);
         this.R.a($$0, $$1, $$2, $$3);
         $$0.b(this.p, v, this.n / 2 + 154 - this.p.a(v), 110, 10526880);
         $$0.b(this.p, y, this.n / 2 + 154 - this.p.a(y), 70, 10526880);
      }

      if ($$4 == dza.d) {
         $$0.b(this.p, s, this.n / 2 - 153, 110, 10526880);
         this.S.a($$0, $$1, $$2, $$3);
      }

      $$0.b(this.p, $$4.a(), this.n / 2 - 153, 174, 10526880);
   }

   @Override
   public boolean k() {
      return false;
   }
}
