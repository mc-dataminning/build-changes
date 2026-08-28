import com.google.common.collect.ImmutableList;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class fwq extends fum {
   private static final wp a = wp.c("structure_block.structure_name");
   private static final wp b = wp.c("structure_block.position");
   private static final wp c = wp.c("structure_block.size");
   private static final wp d = wp.c("structure_block.integrity");
   private static final wp s = wp.c("structure_block.custom_data");
   private static final wp u = wp.c("structure_block.include_entities");
   private static final wp v = wp.c("structure_block.detect_size");
   private static final wp w = wp.c("structure_block.show_air");
   private static final wp x = wp.c("structure_block.show_boundingbox");
   private static final ImmutableList<dyh> y = ImmutableList.copyOf(dyh.values());
   private static final ImmutableList<dyh> z = y.stream().filter($$0 -> $$0 != dyh.d).collect(ImmutableList.toImmutableList());
   private final dvs A;
   private dom B = dom.a;
   private dqf C = dqf.a;
   private dyh D = dyh.d;
   private boolean E;
   private boolean F;
   private boolean G;
   private fpd H;
   private fpd I;
   private fpd J;
   private fpd K;
   private fpd L;
   private fpd M;
   private fpd N;
   private fpd O;
   private fpd P;
   private fpd Q;
   private fou R;
   private fou S;
   private fou T;
   private fou U;
   private fou V;
   private fou W;
   private fou X;
   private fpb<Boolean> Y;
   private fpb<dom> Z;
   private fpb<Boolean> aa;
   private fpb<Boolean> ab;
   private final DecimalFormat ac = new DecimalFormat("0.0###");

   public fwq(dvs $$0) {
      super(wp.c(djp.pC.v()));
      this.A = $$0;
      this.ac.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ROOT));
   }

   private void m() {
      if (this.a(dvs.a.a)) {
         this.m.a(null);
      }
   }

   private void E() {
      this.A.a(this.B);
      this.A.a(this.C);
      this.A.a(this.D);
      this.A.a(this.E);
      this.A.d(this.F);
      this.A.e(this.G);
      this.m.a(null);
   }

   @Override
   protected void aR_() {
      this.c((fou)fou.a(wo.d, $$0x -> this.m()).a(this.n / 2 - 4 - 150, 210, 150, 20).a());
      this.c((fou)fou.a(wo.e, $$0x -> this.E()).a(this.n / 2 + 4, 210, 150, 20).a());
      this.B = this.A.k();
      this.C = this.A.s();
      this.D = this.A.u();
      this.E = this.A.v();
      this.F = this.A.D();
      this.G = this.A.E();
      this.R = this.c((fou)fou.a(wp.c("structure_block.button.save"), $$0x -> {
         if (this.A.u() == dyh.a) {
            this.a(dvs.a.b);
            this.m.a(null);
         }
      }).a(this.n / 2 + 4 + 100, 185, 50, 20).a());
      this.S = this.c((fou)fou.a(wp.c("structure_block.button.load"), $$0x -> {
         if (this.A.u() == dyh.b) {
            this.a(dvs.a.c);
            this.m.a(null);
         }
      }).a(this.n / 2 + 4 + 100, 185, 50, 20).a());
      this.c(
         fpb.<dyh>a($$0x -> wp.c("structure_block.mode." + $$0x.c()))
            .a(z, y)
            .a()
            .a(this.D)
            .a(this.n / 2 - 4 - 150, 185, 50, 20, wp.b("MODE"), ($$0x, $$1x) -> {
               this.A.a($$1x);
               this.a($$1x);
            })
      );
      this.X = this.c((fou)fou.a(wp.c("structure_block.button.detect_size"), $$0x -> {
         if (this.A.u() == dyh.a) {
            this.a(dvs.a.d);
            this.m.a(null);
         }
      }).a(this.n / 2 + 4 + 100, 120, 50, 20).a());
      this.Y = this.c(fpb.b(!this.A.v()).a().a(this.n / 2 + 4 + 100, 160, 50, 20, u, ($$0x, $$1x) -> this.A.a(!$$1x)));
      this.Z = this.c(fpb.<dom>a(dom::b).a(dom.values()).a().a(this.B).a(this.n / 2 - 20, 185, 40, 20, wp.b("MIRROR"), ($$0x, $$1x) -> this.A.a($$1x)));
      this.aa = this.c(fpb.b(this.A.D()).a().a(this.n / 2 + 4 + 100, 80, 50, 20, w, ($$0x, $$1x) -> this.A.d($$1x)));
      this.ab = this.c(fpb.b(this.A.E()).a().a(this.n / 2 + 4 + 100, 80, 50, 20, x, ($$0x, $$1x) -> this.A.e($$1x)));
      this.T = this.c((fou)fou.a(wp.b("0"), $$0x -> {
         this.A.a(dqf.a);
         this.F();
      }).a(this.n / 2 - 1 - 40 - 1 - 40 - 20, 185, 40, 20).a());
      this.U = this.c((fou)fou.a(wp.b("90"), $$0x -> {
         this.A.a(dqf.b);
         this.F();
      }).a(this.n / 2 - 1 - 40 - 20, 185, 40, 20).a());
      this.V = this.c((fou)fou.a(wp.b("180"), $$0x -> {
         this.A.a(dqf.c);
         this.F();
      }).a(this.n / 2 + 1 + 20, 185, 40, 20).a());
      this.W = this.c((fou)fou.a(wp.b("270"), $$0x -> {
         this.A.a(dqf.d);
         this.F();
      }).a(this.n / 2 + 1 + 40 + 1 + 20, 185, 40, 20).a());
      this.H = new fpd(this.p, this.n / 2 - 152, 40, 300, 20, wp.c("structure_block.structure_name")) {
         @Override
         public boolean a(char $$0, int $$1) {
            return !fwq.this.a(this.a(), $$0, this.e()) ? false : super.a($$0, $$1);
         }
      };
      this.H.f(128);
      this.H.a(this.A.c());
      this.d(this.H);
      ji $$0 = this.A.f();
      this.I = new fpd(this.p, this.n / 2 - 152, 80, 80, 20, wp.c("structure_block.position.x"));
      this.I.f(15);
      this.I.a(Integer.toString($$0.u()));
      this.d(this.I);
      this.J = new fpd(this.p, this.n / 2 - 72, 80, 80, 20, wp.c("structure_block.position.y"));
      this.J.f(15);
      this.J.a(Integer.toString($$0.v()));
      this.d(this.J);
      this.K = new fpd(this.p, this.n / 2 + 8, 80, 80, 20, wp.c("structure_block.position.z"));
      this.K.f(15);
      this.K.a(Integer.toString($$0.w()));
      this.d(this.K);
      km $$1 = this.A.j();
      this.L = new fpd(this.p, this.n / 2 - 152, 120, 80, 20, wp.c("structure_block.size.x"));
      this.L.f(15);
      this.L.a(Integer.toString($$1.u()));
      this.d(this.L);
      this.M = new fpd(this.p, this.n / 2 - 72, 120, 80, 20, wp.c("structure_block.size.y"));
      this.M.f(15);
      this.M.a(Integer.toString($$1.v()));
      this.d(this.M);
      this.N = new fpd(this.p, this.n / 2 + 8, 120, 80, 20, wp.c("structure_block.size.z"));
      this.N.f(15);
      this.N.a(Integer.toString($$1.w()));
      this.d(this.N);
      this.O = new fpd(this.p, this.n / 2 - 152, 120, 80, 20, wp.c("structure_block.integrity.integrity"));
      this.O.f(15);
      this.O.a(this.ac.format((double)this.A.w()));
      this.d(this.O);
      this.P = new fpd(this.p, this.n / 2 - 72, 120, 80, 20, wp.c("structure_block.integrity.seed"));
      this.P.f(31);
      this.P.a(Long.toString(this.A.x()));
      this.d(this.P);
      this.Q = new fpd(this.p, this.n / 2 - 152, 120, 240, 20, wp.c("structure_block.custom_data"));
      this.Q.f(128);
      this.Q.a(this.A.t());
      this.d(this.Q);
      this.F();
      this.a(this.D);
   }

   @Override
   protected void aF_() {
      this.b(this.H);
   }

   @Override
   public void b(fof $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }

   @Override
   public void a(flk $$0, int $$1, int $$2) {
      String $$3 = this.H.a();
      String $$4 = this.I.a();
      String $$5 = this.J.a();
      String $$6 = this.K.a();
      String $$7 = this.L.a();
      String $$8 = this.M.a();
      String $$9 = this.N.a();
      String $$10 = this.O.a();
      String $$11 = this.P.a();
      String $$12 = this.Q.a();
      this.b($$0, $$1, $$2);
      this.H.a($$3);
      this.I.a($$4);
      this.J.a($$5);
      this.K.a($$6);
      this.L.a($$7);
      this.M.a($$8);
      this.N.a($$9);
      this.O.a($$10);
      this.P.a($$11);
      this.Q.a($$12);
   }

   private void F() {
      this.T.j = true;
      this.U.j = true;
      this.V.j = true;
      this.W.j = true;
      switch (this.A.s()) {
         case a:
            this.T.j = false;
            break;
         case c:
            this.V.j = false;
            break;
         case d:
            this.W.j = false;
            break;
         case b:
            this.U.j = false;
      }
   }

   private void a(dyh $$0) {
      this.H.g(false);
      this.I.g(false);
      this.J.g(false);
      this.K.g(false);
      this.L.g(false);
      this.M.g(false);
      this.N.g(false);
      this.O.g(false);
      this.P.g(false);
      this.Q.g(false);
      this.R.k = false;
      this.S.k = false;
      this.X.k = false;
      this.Y.k = false;
      this.Z.k = false;
      this.T.k = false;
      this.U.k = false;
      this.V.k = false;
      this.W.k = false;
      this.aa.k = false;
      this.ab.k = false;
      switch ($$0) {
         case a:
            this.H.g(true);
            this.I.g(true);
            this.J.g(true);
            this.K.g(true);
            this.L.g(true);
            this.M.g(true);
            this.N.g(true);
            this.R.k = true;
            this.X.k = true;
            this.Y.k = true;
            this.aa.k = true;
            break;
         case b:
            this.H.g(true);
            this.I.g(true);
            this.J.g(true);
            this.K.g(true);
            this.O.g(true);
            this.P.g(true);
            this.S.k = true;
            this.Y.k = true;
            this.Z.k = true;
            this.T.k = true;
            this.U.k = true;
            this.V.k = true;
            this.W.k = true;
            this.ab.k = true;
            this.F();
            break;
         case c:
            this.H.g(true);
            break;
         case d:
            this.Q.g(true);
      }
   }

   private boolean a(dvs.a $$0) {
      ji $$1 = new ji(this.c(this.I.a()), this.c(this.J.a()), this.c(this.K.a()));
      km $$2 = new km(this.c(this.L.a()), this.c(this.M.a()), this.c(this.N.a()));
      float $$3 = this.b(this.O.a());
      long $$4 = this.a(this.P.a());
      this.m
         .L()
         .b(new aic(this.A.aA_(), $$0, this.A.u(), this.H.a(), $$1, $$2, this.A.k(), this.A.s(), this.Q.a(), this.A.v(), this.A.D(), this.A.E(), $$3, $$4));
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
   public void a(fof $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      dyh $$4 = this.A.u();
      $$0.a(this.p, this.l, this.n / 2, 10, 16777215);
      if ($$4 != dyh.d) {
         $$0.b(this.p, a, this.n / 2 - 153, 30, 10526880);
         this.H.a($$0, $$1, $$2, $$3);
      }

      if ($$4 == dyh.b || $$4 == dyh.a) {
         $$0.b(this.p, b, this.n / 2 - 153, 70, 10526880);
         this.I.a($$0, $$1, $$2, $$3);
         this.J.a($$0, $$1, $$2, $$3);
         this.K.a($$0, $$1, $$2, $$3);
         $$0.b(this.p, u, this.n / 2 + 154 - this.p.a(u), 150, 10526880);
      }

      if ($$4 == dyh.a) {
         $$0.b(this.p, c, this.n / 2 - 153, 110, 10526880);
         this.L.a($$0, $$1, $$2, $$3);
         this.M.a($$0, $$1, $$2, $$3);
         this.N.a($$0, $$1, $$2, $$3);
         $$0.b(this.p, v, this.n / 2 + 154 - this.p.a(v), 110, 10526880);
         $$0.b(this.p, w, this.n / 2 + 154 - this.p.a(w), 70, 10526880);
      }

      if ($$4 == dyh.b) {
         $$0.b(this.p, d, this.n / 2 - 153, 110, 10526880);
         this.O.a($$0, $$1, $$2, $$3);
         this.P.a($$0, $$1, $$2, $$3);
         $$0.b(this.p, x, this.n / 2 + 154 - this.p.a(x), 70, 10526880);
      }

      if ($$4 == dyh.d) {
         $$0.b(this.p, s, this.n / 2 - 153, 110, 10526880);
         this.Q.a($$0, $$1, $$2, $$3);
      }

      $$0.b(this.p, $$4.a(), this.n / 2 - 153, 174, 10526880);
   }

   @Override
   public boolean k() {
      return false;
   }
}
