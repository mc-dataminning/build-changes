import com.google.common.collect.ImmutableList;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class fzm extends fxi {
   private static final ww a = ww.c("structure_block.structure_name");
   private static final ww b = ww.c("structure_block.position");
   private static final ww c = ww.c("structure_block.size");
   private static final ww d = ww.c("structure_block.integrity");
   private static final ww s = ww.c("structure_block.custom_data");
   private static final ww u = ww.c("structure_block.include_entities");
   private static final ww v = ww.c("structure_block.strict");
   private static final ww w = ww.c("structure_block.detect_size");
   private static final ww x = ww.c("structure_block.show_air");
   private static final ww y = ww.c("structure_block.show_boundingbox");
   private static final ImmutableList<eay> z = ImmutableList.copyOf(eay.values());
   private static final ImmutableList<eay> A = z.stream().filter($$0 -> $$0 != eay.d).collect(ImmutableList.toImmutableList());
   private final dyg B;
   private dqv C = dqv.a;
   private dsm D = dsm.a;
   private eay E = eay.d;
   private boolean F;
   private boolean G;
   private boolean H;
   private boolean I;
   private frz J;
   private frz K;
   private frz L;
   private frz M;
   private frz N;
   private frz O;
   private frz P;
   private frz Q;
   private frz R;
   private frz S;
   private frq T;
   private frq U;
   private frq V;
   private frq W;
   private frq X;
   private frq Y;
   private frq Z;
   private frx<Boolean> aa;
   private frx<Boolean> ab;
   private frx<dqv> ac;
   private frx<Boolean> ad;
   private frx<Boolean> ae;
   private final DecimalFormat af = new DecimalFormat("0.0###");

   public fzm(dyg $$0) {
      super(ww.c(dlw.pC.v()));
      this.B = $$0;
      this.af.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ROOT));
   }

   private void m() {
      if (this.a(dyg.a.a)) {
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
   protected void aN_() {
      this.c((frq)frq.a(wv.d, $$0x -> this.m()).a(this.n / 2 - 4 - 150, 210, 150, 20).a());
      this.c((frq)frq.a(wv.e, $$0x -> this.E()).a(this.n / 2 + 4, 210, 150, 20).a());
      this.C = this.B.s();
      this.D = this.B.t();
      this.E = this.B.v();
      this.F = this.B.w();
      this.G = this.B.x();
      this.H = this.B.F();
      this.I = this.B.G();
      this.T = this.c((frq)frq.a(ww.c("structure_block.button.save"), $$0x -> {
         if (this.B.v() == eay.a) {
            this.a(dyg.a.b);
            this.m.a(null);
         }
      }).a(this.n / 2 + 4 + 100, 185, 50, 20).a());
      this.U = this.c((frq)frq.a(ww.c("structure_block.button.load"), $$0x -> {
         if (this.B.v() == eay.b) {
            this.a(dyg.a.c);
            this.m.a(null);
         }
      }).a(this.n / 2 + 4 + 100, 185, 50, 20).a());
      this.c(
         frx.<eay>a($$0x -> ww.c("structure_block.mode." + $$0x.c()))
            .a(A, z)
            .a()
            .a(this.E)
            .a(this.n / 2 - 4 - 150, 185, 50, 20, ww.b("MODE"), ($$0x, $$1x) -> {
               this.B.a($$1x);
               this.a($$1x);
            })
      );
      this.Z = this.c((frq)frq.a(ww.c("structure_block.button.detect_size"), $$0x -> {
         if (this.B.v() == eay.a) {
            this.a(dyg.a.d);
            this.m.a(null);
         }
      }).a(this.n / 2 + 4 + 100, 120, 50, 20).a());
      this.aa = this.c(frx.b(!this.B.w()).a().a(this.n / 2 + 4 + 100, 160, 50, 20, u, ($$0x, $$1x) -> this.B.a(!$$1x)));
      this.ab = this.c(frx.b(this.B.x()).a().a(this.n / 2 + 4 + 100, 120, 50, 20, v, ($$0x, $$1x) -> this.B.b($$1x)));
      this.ac = this.c(frx.<dqv>a(dqv::b).a(dqv.values()).a().a(this.C).a(this.n / 2 - 20, 185, 40, 20, ww.b("MIRROR"), ($$0x, $$1x) -> this.B.a($$1x)));
      this.ad = this.c(frx.b(this.B.F()).a().a(this.n / 2 + 4 + 100, 80, 50, 20, x, ($$0x, $$1x) -> this.B.e($$1x)));
      this.ae = this.c(frx.b(this.B.G()).a().a(this.n / 2 + 4 + 100, 80, 50, 20, y, ($$0x, $$1x) -> this.B.f($$1x)));
      this.V = this.c((frq)frq.a(ww.b("0"), $$0x -> {
         this.B.a(dsm.a);
         this.F();
      }).a(this.n / 2 - 1 - 40 - 1 - 40 - 20, 185, 40, 20).a());
      this.W = this.c((frq)frq.a(ww.b("90"), $$0x -> {
         this.B.a(dsm.b);
         this.F();
      }).a(this.n / 2 - 1 - 40 - 20, 185, 40, 20).a());
      this.X = this.c((frq)frq.a(ww.b("180"), $$0x -> {
         this.B.a(dsm.c);
         this.F();
      }).a(this.n / 2 + 1 + 20, 185, 40, 20).a());
      this.Y = this.c((frq)frq.a(ww.b("270"), $$0x -> {
         this.B.a(dsm.d);
         this.F();
      }).a(this.n / 2 + 1 + 40 + 1 + 20, 185, 40, 20).a());
      this.J = new frz(this.p, this.n / 2 - 152, 40, 300, 20, ww.c("structure_block.structure_name")) {
         @Override
         public boolean a(char $$0, int $$1) {
            return !fzm.this.a(this.a(), $$0, this.e()) ? false : super.a($$0, $$1);
         }
      };
      this.J.f(128);
      this.J.a(this.B.d());
      this.d(this.J);
      iu $$0 = this.B.j();
      this.K = new frz(this.p, this.n / 2 - 152, 80, 80, 20, ww.c("structure_block.position.x"));
      this.K.f(15);
      this.K.a(Integer.toString($$0.u()));
      this.d(this.K);
      this.L = new frz(this.p, this.n / 2 - 72, 80, 80, 20, ww.c("structure_block.position.y"));
      this.L.f(15);
      this.L.a(Integer.toString($$0.v()));
      this.d(this.L);
      this.M = new frz(this.p, this.n / 2 + 8, 80, 80, 20, ww.c("structure_block.position.z"));
      this.M.f(15);
      this.M.a(Integer.toString($$0.w()));
      this.d(this.M);
      jz $$1 = this.B.k();
      this.N = new frz(this.p, this.n / 2 - 152, 120, 80, 20, ww.c("structure_block.size.x"));
      this.N.f(15);
      this.N.a(Integer.toString($$1.u()));
      this.d(this.N);
      this.O = new frz(this.p, this.n / 2 - 72, 120, 80, 20, ww.c("structure_block.size.y"));
      this.O.f(15);
      this.O.a(Integer.toString($$1.v()));
      this.d(this.O);
      this.P = new frz(this.p, this.n / 2 + 8, 120, 80, 20, ww.c("structure_block.size.z"));
      this.P.f(15);
      this.P.a(Integer.toString($$1.w()));
      this.d(this.P);
      this.Q = new frz(this.p, this.n / 2 - 152, 120, 80, 20, ww.c("structure_block.integrity.integrity"));
      this.Q.f(15);
      this.Q.a(this.af.format((double)this.B.y()));
      this.d(this.Q);
      this.R = new frz(this.p, this.n / 2 - 72, 120, 80, 20, ww.c("structure_block.integrity.seed"));
      this.R.f(31);
      this.R.a(Long.toString(this.B.z()));
      this.d(this.R);
      this.S = new frz(this.p, this.n / 2 - 152, 120, 240, 20, ww.c("structure_block.custom_data"));
      this.S.f(128);
      this.S.a(this.B.u());
      this.d(this.S);
      this.F();
      this.a(this.E);
   }

   @Override
   protected void aB_() {
      this.b(this.J);
   }

   @Override
   public void b(frc $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }

   @Override
   public void a(fof $$0, int $$1, int $$2) {
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
      switch (this.B.t()) {
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

   private void a(eay $$0) {
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

   private boolean a(dyg.a $$0) {
      iu $$1 = new iu(this.c(this.K.a()), this.c(this.L.a()), this.c(this.M.a()));
      jz $$2 = new jz(this.c(this.N.a()), this.c(this.O.a()), this.c(this.P.a()));
      float $$3 = this.b(this.Q.a());
      long $$4 = this.a(this.R.a());
      this.m
         .L()
         .b(
            new aij(
               this.B.aw_(),
               $$0,
               this.B.v(),
               this.J.a(),
               $$1,
               $$2,
               this.B.s(),
               this.B.t(),
               this.S.a(),
               this.B.w(),
               this.B.x(),
               this.B.F(),
               this.B.G(),
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
   public void aK_() {
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
   public void a(frc $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      eay $$4 = this.B.v();
      $$0.a(this.p, this.l, this.n / 2, 10, 16777215);
      if ($$4 != eay.d) {
         $$0.b(this.p, a, this.n / 2 - 153, 30, 10526880);
         this.J.a($$0, $$1, $$2, $$3);
      }

      if ($$4 == eay.b || $$4 == eay.a) {
         $$0.b(this.p, b, this.n / 2 - 153, 70, 10526880);
         this.K.a($$0, $$1, $$2, $$3);
         this.L.a($$0, $$1, $$2, $$3);
         this.M.a($$0, $$1, $$2, $$3);
         $$0.b(this.p, u, this.n / 2 + 154 - this.p.a(u), 150, 10526880);
      }

      if ($$4 == eay.a) {
         $$0.b(this.p, c, this.n / 2 - 153, 110, 10526880);
         this.N.a($$0, $$1, $$2, $$3);
         this.O.a($$0, $$1, $$2, $$3);
         this.P.a($$0, $$1, $$2, $$3);
         $$0.b(this.p, w, this.n / 2 + 154 - this.p.a(w), 110, 10526880);
         $$0.b(this.p, x, this.n / 2 + 154 - this.p.a(x), 70, 10526880);
      }

      if ($$4 == eay.b) {
         $$0.b(this.p, d, this.n / 2 - 153, 110, 10526880);
         this.Q.a($$0, $$1, $$2, $$3);
         this.R.a($$0, $$1, $$2, $$3);
         $$0.b(this.p, v, this.n / 2 + 154 - this.p.a(v), 110, 10526880);
         $$0.b(this.p, y, this.n / 2 + 154 - this.p.a(y), 70, 10526880);
      }

      if ($$4 == eay.d) {
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
