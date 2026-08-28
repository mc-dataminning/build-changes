import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gpo extends gpl {
   public static final Logger h = LogUtils.getLogger();
   private static final int cy = 20;
   private static final int cz = 600;
   private static final int cA = 100;
   private static final float cB = 0.6F;
   private static final double cC = 0.35;
   private static final double cD = 0.13962634F;
   public static final float i = 0.2F;
   public final gkr j;
   private final awy cE;
   private final fpe cF;
   private final bao cG = new bao(20, 1280);
   private final List<hmy> cH = Lists.newArrayList();
   private int cI = 0;
   private double cJ;
   private double cK;
   private double cL;
   private float cM;
   private float cN;
   private boolean cO;
   private boolean cP;
   private boolean cQ;
   private boolean cR;
   private boolean cS;
   private int cT;
   private boolean cU;
   public gpm k = new gpm();
   private crk cV = crk.b;
   protected final fpt cq;
   protected int cr;
   public float cs;
   public float ct;
   public float cu;
   public float cv;
   private int cW;
   private float cX;
   public float cw;
   public float cx;
   private boolean cY;
   @Nullable
   private buf cZ;
   private boolean da;
   private boolean db = true;
   private int dc;
   private boolean dd;
   private int de;
   private boolean df = true;
   private boolean dg = false;

   public gpo(fpt $$0, gkq $$1, gkr $$2, awy $$3, fpe $$4, boolean $$5, boolean $$6) {
      super($$1, $$2.o());
      this.cq = $$0;
      this.j = $$2;
      this.cE = $$3;
      this.cF = $$4;
      this.cR = $$5;
      this.cS = $$6;
      this.cH.add(new hnq(this, $$0.ak()));
      this.cH.add(new hnd(this));
      this.cH.add(new hnc(this, $$0.ak(), $$1.D_()));
   }

   @Override
   public void c(float $$0) {
   }

   @Override
   public boolean a(bwi $$0, boolean $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         if ($$0 instanceof ctz) {
            this.cq.ak().a((hno)(new hni(this, (ctz)$$0, true)));
            this.cq.ak().a((hno)(new hni(this, (ctz)$$0, false)));
         }

         return true;
      }
   }

   @Override
   public void ab() {
      super.ab();
      this.da = false;
   }

   @Override
   public float i(float $$0) {
      return this.dM();
   }

   @Override
   public float j(float $$0) {
      return this.bX() ? super.j($$0) : this.dK();
   }

   @Override
   public void h() {
      this.gJ();
      if (this.gI()) {
         this.cG.b();
         super.h();
         this.H();
         if (!this.cV.equals(this.k.a)) {
            this.j.b(new ahx(this.k.a));
            this.cV = this.k.a;
         }

         if (this.bX()) {
            this.j.b(new aho.c(this.dK(), this.dM(), this.aH(), this.P));
            bwi $$0 = this.de();
            if ($$0 != this && $$0.df()) {
               this.j.b(ahp.a($$0));
               this.I();
            }
         } else {
            this.F();
         }

         for (hmy $$1 : this.cH) {
            $$1.a();
         }
      }
   }

   public float d() {
      for (hmy $$0 : this.cH) {
         if ($$0 instanceof hnc) {
            return ((hnc)$$0).b();
         }
      }

      return 0.0F;
   }

   private void F() {
      this.I();
      if (this.y()) {
         double $$0 = this.dz() - this.cJ;
         double $$1 = this.dB() - this.cK;
         double $$2 = this.dF() - this.cL;
         double $$3 = (double)(this.dK() - this.cM);
         double $$4 = (double)(this.dM() - this.cN);
         this.cT++;
         boolean $$5 = azm.f($$0, $$1, $$2) > azm.k(2.0E-4) || this.cT >= 20;
         boolean $$6 = $$3 != 0.0 || $$4 != 0.0;
         if ($$5 && $$6) {
            this.j.b(new aho.b(this.dz(), this.dB(), this.dF(), this.dK(), this.dM(), this.aH(), this.P));
         } else if ($$5) {
            this.j.b(new aho.a(this.dz(), this.dB(), this.dF(), this.aH(), this.P));
         } else if ($$6) {
            this.j.b(new aho.c(this.dK(), this.dM(), this.aH(), this.P));
         } else if (this.cO != this.aH() || this.cP != this.P) {
            this.j.b(new aho.d(this.aH(), this.P));
         }

         if ($$5) {
            this.cJ = this.dz();
            this.cK = this.dB();
            this.cL = this.dF();
            this.cT = 0;
         }

         if ($$6) {
            this.cM = this.dK();
            this.cN = this.dM();
         }

         this.cO = this.aH();
         this.cP = this.P;
         this.db = this.cq.n.J().c();
      }
   }

   private void H() {
      boolean $$0 = this.cb();
      if ($$0 != this.cR) {
         ahw.a $$1 = $$0 ? ahw.a.a : ahw.a.b;
         this.j.b(new ahw(this, $$1));
         this.cR = $$0;
      }
   }

   private void I() {
      boolean $$0 = this.ch();
      if ($$0 != this.cS) {
         ahw.a $$1 = $$0 ? ahw.a.d : ahw.a.e;
         this.j.b(new ahw(this, $$1));
         this.cS = $$0;
      }
   }

   public boolean a(boolean $$0) {
      ahv.a $$1 = $$0 ? ahv.a.d : ahv.a.e;
      czn $$2 = this.gi().a($$0);
      this.j.b(new ahv($$1, iv.c, jb.a));
      return !$$2.f();
   }

   @Override
   public void a(buf $$0) {
      super.a($$0);
      this.j.b(new aio($$0));
   }

   @Override
   public void gf() {
      this.j.b(new aha(aha.a.a));
      fpr.c();
   }

   @Override
   public void p() {
      this.j.b(new ahg(this.bR.l));
      this.e();
   }

   public void e() {
      super.p();
      this.cq.a(null);
   }

   public void J(float $$0) {
      if (this.cU) {
         float $$1 = this.eF() - $$0;
         if ($$1 <= 0.0F) {
            this.d($$0);
            if ($$1 < 0.0F) {
               this.aj = 10;
            }
         } else {
            this.be = $$1;
            this.aj = 20;
            this.d($$0);
            this.aO = 10;
            this.aN = this.aO;
         }
      } else {
         this.d($$0);
         this.cU = true;
      }
   }

   @Override
   public void x() {
      this.j.b(new ahu(this.gj()));
   }

   @Override
   public boolean gg() {
      return true;
   }

   @Override
   public boolean fH() {
      return !this.gj().b && super.fH();
   }

   @Override
   public boolean bs() {
      return !this.gj().b && super.bs();
   }

   protected void f() {
      this.j.b(new ahw(this, ahw.a.f, azm.d(this.v() * 100.0F)));
   }

   public void i() {
      this.j.b(new ahw(this, ahw.a.h));
   }

   public awy l() {
      return this.cE;
   }

   public fpe m() {
      return this.cF;
   }

   public void a(dfm $$0) {
      if (this.cF.b($$0)) {
         this.cF.c($$0);
         this.j.b(new aia($$0));
      }
   }

   @Override
   public int G() {
      return this.cI;
   }

   public void a(int $$0) {
      this.cI = $$0;
   }

   @Override
   public void a(wy $$0, boolean $$1) {
      this.cq.aZ().a($$0, $$1);
   }

   private void c(double $$0, double $$1) {
      iv $$2 = iv.a($$0, this.dB(), $$1);
      if (this.c($$2)) {
         double $$3 = $$0 - (double)$$2.u();
         double $$4 = $$1 - (double)$$2.w();
         jb $$5 = null;
         double $$6 = Double.MAX_VALUE;
         jb[] $$7 = new jb[]{jb.e, jb.f, jb.c, jb.d};

         for (jb $$8 : $$7) {
            double $$9 = $$8.o().a($$3, 0.0, $$4);
            double $$10 = $$8.f() == jb.b.a ? 1.0 - $$9 : $$9;
            if ($$10 < $$6 && !this.c($$2.a($$8))) {
               $$6 = $$10;
               $$5 = $$8;
            }
         }

         if ($$5 != null) {
            ffc $$11 = this.dx();
            if ($$5.o() == jb.a.a) {
               this.n(0.1 * (double)$$5.j(), $$11.e, $$11.f);
            } else {
               this.n($$11.d, $$11.e, 0.1 * (double)$$5.l());
            }
         }
      }
   }

   private boolean c(iv $$0) {
      fex $$1 = this.cQ();
      fex $$2 = new fex((double)$$0.u(), $$1.b, (double)$$0.w(), (double)$$0.u() + 1.0, $$1.e, (double)$$0.w() + 1.0).h(1.0E-7);
      return this.dU().g(this, $$2);
   }

   public void a(float $$0, int $$1, int $$2) {
      this.ch = $$0;
      this.cg = $$1;
      this.cf = $$2;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 >= 24 && $$0 <= 28) {
         this.a($$0 - 24);
      } else {
         super.b($$0);
      }
   }

   public void b(boolean $$0) {
      this.df = $$0;
   }

   public boolean n() {
      return this.df;
   }

   public void x(boolean $$0) {
      this.dg = $$0;
   }

   public boolean t() {
      return this.dg;
   }

   @Override
   public void a(awm $$0, float $$1, float $$2) {
      this.dU().a(this.dz(), this.dB(), this.dF(), $$0, this.dl(), $$1, $$2, false);
   }

   @Override
   public void a(awm $$0, awo $$1, float $$2, float $$3) {
      this.dU().a(this.dz(), this.dB(), this.dF(), $$0, $$1, $$2, $$3, false);
   }

   @Override
   public void c(buf $$0) {
      czn $$1 = this.b($$0);
      if (!$$1.f() && !this.fy()) {
         super.c($$0);
         this.cY = true;
         this.cZ = $$0;
      }
   }

   @Override
   public boolean fy() {
      return this.cY;
   }

   @Override
   public void fE() {
      super.fE();
      this.cY = false;
   }

   @Override
   public buf fz() {
      return Objects.requireNonNullElse(this.cZ, buf.a);
   }

   @Override
   public void a(akj<?> $$0) {
      super.a($$0);
      if (aC.equals($$0)) {
         boolean $$1 = (this.al.a(aC) & 1) > 0;
         buf $$2 = (this.al.a(aC) & 2) > 0 ? buf.b : buf.a;
         if ($$1 && !this.cY) {
            this.c($$2);
         } else if (!$$1 && this.cY) {
            this.fE();
         }
      }

      if (am.equals($$0) && this.fI() && !this.dd) {
         this.cq.ak().a((hno)(new hne(this)));
      }
   }

   @Nullable
   public bxt u() {
      if (this.dk() instanceof bxt $$0 && $$0.a()) {
         return $$0;
      }

      return null;
   }

   public float v() {
      return this.cX;
   }

   @Override
   public boolean X() {
      return this.cq.aT();
   }

   @Override
   public void a(dzf $$0, boolean $$1) {
      if ($$0 instanceof dys $$2) {
         this.cq.a(new gaf($$2, $$1, this.cq.aT()));
      } else {
         this.cq.a(new gas($$0, $$1, this.cq.aT()));
      }
   }

   @Override
   public void a(dil $$0) {
      this.cq.a(new gap($$0));
   }

   @Override
   public void a(dyc $$0) {
      this.cq.a(new fzs($$0));
   }

   @Override
   public void a(dzk $$0) {
      this.cq.a(new gaw($$0));
   }

   @Override
   public void a(dzl $$0) {
      this.cq.a(new gax($$0));
   }

   @Override
   public void a(dzm $$0) {
      this.cq.a(new gay($$0));
   }

   @Override
   public void a(dyv $$0) {
      this.cq.a(new gak($$0));
   }

   @Override
   public void a(czn $$0, buf $$1) {
      dcw $$2 = $$0.a(kk.U);
      if ($$2 != null) {
         this.cq.a(new fzo(this, $$0, $$1, $$2));
      }
   }

   @Override
   public void b(bwi $$0) {
      this.cq.g.a($$0, ly.f);
   }

   @Override
   public void c(bwi $$0) {
      this.cq.g.a($$0, ly.r);
   }

   @Override
   public boolean cb() {
      return this.k.a.f();
   }

   @Override
   public boolean cg() {
      return this.cQ;
   }

   public boolean w() {
      return this.cg() || this.ck();
   }

   @Override
   public void fp() {
      if (this.y()) {
         ffb $$0 = this.a(this.k.b());
         this.bg = $$0.j;
         this.bi = $$0.k;
         this.bf = this.k.a.e();
         this.cu = this.cs;
         this.cv = this.ct;
         this.ct = this.ct + (this.dM() - this.ct) * 0.5F;
         this.cs = this.cs + (this.dK() - this.cs) * 0.5F;
      } else {
         super.fp();
      }
   }

   private ffb a(ffb $$0) {
      if ($$0.c() == 0.0F) {
         return $$0;
      } else {
         ffb $$1 = $$0.a(0.98F);
         if (this.fy() && !this.bX()) {
            $$1 = $$1.a(0.2F);
         }

         if (this.w()) {
            float $$2 = (float)this.h(byp.z);
            $$1 = $$1.a($$2);
         }

         return b($$1);
      }
   }

   private static ffb b(ffb $$0) {
      float $$1 = $$0.b();
      if ($$1 <= 0.0F) {
         return $$0;
      } else {
         ffb $$2 = $$0.a(1.0F / $$1);
         float $$3 = c($$2);
         float $$4 = Math.min($$1 * $$3, 1.0F);
         return $$2.a($$4);
      }
   }

   private static float c(ffb $$0) {
      float $$1 = Math.abs($$0.j);
      float $$2 = Math.abs($$0.k);
      float $$3 = $$2 > $$1 ? $$1 / $$2 : $$2 / $$1;
      return azm.c(1.0F + azm.l($$3));
   }

   protected boolean y() {
      return this.cq.ao() == this;
   }

   public void z() {
      this.b(bxv.a);
      if (this.dU() != null) {
         for (double $$0 = this.dB(); $$0 > (double)this.dU().G_() && $$0 <= (double)this.dU().ao(); $$0++) {
            this.a_(this.dz(), $$0, this.dF());
            if (this.dU().g(this)) {
               break;
            }
         }

         this.i(ffc.c);
         this.x(0.0F);
      }

      this.d(this.eT());
      this.aP = 0;
   }

   @Override
   public void k_() {
      if (this.cr > 0) {
         this.cr--;
      }

      if (!(this.cq.z instanceof fyq)) {
         this.y(this.A() == dsq.a.a);
         this.M();
      }

      boolean $$0 = this.k.a.e();
      boolean $$1 = this.k.a.f();
      boolean $$2 = this.k.c();
      cri $$3 = this.gj();
      this.cQ = !$$3.b && !this.ci() && !this.bX() && this.h(bxv.f) && (this.cb() || !this.fQ() && !this.h(bxv.a));
      this.k.a();
      this.cq.aB().a(this.k);
      boolean $$4 = false;
      if (this.dc > 0) {
         this.dc--;
         $$4 = true;
         this.k.d();
      }

      if (!this.ad) {
         this.c(this.dz() - (double)this.dp() * 0.35, this.dF() + (double)this.dp() * 0.35);
         this.c(this.dz() - (double)this.dp() * 0.35, this.dF() - (double)this.dp() * 0.35);
         this.c(this.dz() + (double)this.dp() * 0.35, this.dF() - (double)this.dp() * 0.35);
         this.c(this.dz() + (double)this.dp() * 0.35, this.dF() + (double)this.dp() * 0.35);
      }

      if ($$1 || this.fy() && !this.bX()) {
         this.cr = 0;
      }

      if (this.Q()) {
         if (!$$2) {
            if (this.cr > 0) {
               this.h(true);
            } else {
               this.cr = 7;
            }
         }

         if (this.k.a.g()) {
            this.h(true);
         }
      }

      if (this.ch()) {
         if (this.ci()) {
            if (this.L()) {
               this.h(false);
            }
         } else if (this.J()) {
            this.h(false);
         }
      }

      boolean $$5 = false;
      if ($$3.c) {
         if (this.cq.r.g()) {
            if (!$$3.b) {
               $$3.b = true;
               $$5 = true;
               this.x();
            }
         } else if (!$$0 && this.k.a.e() && !$$4) {
            if (this.bT == 0) {
               this.bT = 7;
            } else if (!this.ci()) {
               $$3.b = !$$3.b;
               if ($$3.b && this.aH()) {
                  this.s();
               }

               $$5 = true;
               this.x();
               this.bT = 0;
            }
         }
      }

      if (this.k.a.e() && !$$5 && !$$0 && !this.d_() && this.gp()) {
         this.j.b(new ahw(this, ahw.a.i));
      }

      this.dd = this.fI();
      if (this.bh() && this.k.a.f() && this.el()) {
         this.fi();
      }

      if (this.a(axh.a)) {
         int $$6 = this.V_() ? 10 : 1;
         this.de = azm.a(this.de + $$6, 0, 600);
      } else if (this.de > 0) {
         this.a(axh.a);
         this.de = azm.a(this.de - 10, 0, 600);
      }

      if ($$3.b && this.y()) {
         int $$7 = 0;
         if (this.k.a.f()) {
            $$7--;
         }

         if (this.k.a.e()) {
            $$7++;
         }

         if ($$7 != 0) {
            this.i(this.dx().b(0.0, (double)((float)$$7 * $$3.a() * 3.0F), 0.0));
         }
      }

      bxt $$8 = this.u();
      if ($$8 != null && $$8.c() == 0) {
         if (this.cW < 0) {
            this.cW++;
            if (this.cW == 0) {
               this.cX = 0.0F;
            }
         }

         if ($$0 && !this.k.a.e()) {
            this.cW = -10;
            $$8.b(azm.d(this.v() * 100.0F));
            this.f();
         } else if (!$$0 && this.k.a.e()) {
            this.cW = 0;
            this.cX = 0.0F;
         } else if ($$0) {
            this.cW++;
            if (this.cW < 10) {
               this.cX = (float)this.cW * 0.1F;
            } else {
               this.cX = 0.8F + 2.0F / (float)(this.cW - 9) * 0.1F;
            }
         }
      } else {
         this.cX = 0.0F;
      }

      super.k_();
      if (this.aH() && $$3.b && !this.cq.r.g()) {
         $$3.b = false;
         this.x();
      }
   }

   private boolean J() {
      return this.N() || this.bX() && !this.a(this.dj()) || !this.k.c() || !this.R() || this.P && !this.S || this.bh() && !this.bl();
   }

   private boolean L() {
      return this.N() || this.bX() && !this.a(this.dj()) || !this.bh() || !this.k.c() && !this.aH() && !this.k.a.f() || !this.R();
   }

   private boolean N() {
      return this.b(bvo.o);
   }

   public dsq.a A() {
      return this.as == null ? dsq.a.b : this.as.a();
   }

   @Override
   protected void em() {
      this.aP++;
      if (this.aP == 20) {
         this.a(bwi.d.a);
      }
   }

   private void y(boolean $$0) {
      this.cx = this.cw;
      float $$1 = 0.0F;
      if ($$0 && this.as != null && this.as.e()) {
         if (this.cq.z != null && !this.cq.z.k() && !(this.cq.z instanceof fxw) && !(this.cq.z instanceof fyv)) {
            if (this.cq.z instanceof fzh) {
               this.p();
            }

            this.cq.a(null);
         }

         if (this.cw == 0.0F) {
            this.cq.ak().a(hnj.b(awn.vx, this.ae.i() * 0.4F + 0.8F, 0.25F));
         }

         $$1 = 0.0125F;
         this.as.a(false);
      } else if (this.cw > 0.0F) {
         $$1 = -0.05F;
      }

      this.cw = azm.a(this.cw + $$1, 0.0F, 1.0F);
   }

   @Override
   public void r() {
      super.r();
      this.da = false;
      if (this.dk() instanceof ctx $$0) {
         $$0.a(this.k.a.c(), this.k.a.d(), this.k.a.a(), this.k.a.b());
         this.da = this.da | (this.k.a.c() || this.k.a.d() || this.k.a.a() || this.k.a.b());
      }
   }

   public boolean B() {
      return this.da;
   }

   @Override
   public void a(bxn $$0, ffc $$1) {
      double $$2 = this.dz();
      double $$3 = this.dF();
      super.a($$0, $$1);
      float $$4 = (float)(this.dz() - $$2);
      float $$5 = (float)(this.dF() - $$3);
      this.f($$4, $$5);
      this.g = this.g + azm.f($$4, $$5) * 0.6F;
   }

   public boolean C() {
      return this.db;
   }

   @Override
   public boolean gP() {
      return this.cq.n.K().c();
   }

   @Override
   protected void f(float $$0, float $$1) {
      if (this.O()) {
         ffc $$2 = this.ds();
         ffc $$3 = $$2.b((double)$$0, 0.0, (double)$$1);
         ffc $$4 = new ffc((double)$$0, 0.0, (double)$$1);
         float $$5 = this.fn();
         float $$6 = (float)$$4.h();
         if ($$6 <= 0.001F) {
            ffb $$7 = this.k.b();
            float $$8 = $$5 * $$7.j;
            float $$9 = $$5 * $$7.k;
            float $$10 = azm.a(this.dK() * (float) (Math.PI / 180.0));
            float $$11 = azm.b(this.dK() * (float) (Math.PI / 180.0));
            $$4 = new ffc((double)($$8 * $$11 - $$9 * $$10), $$4.e, (double)($$9 * $$11 + $$8 * $$10));
            $$6 = (float)$$4.h();
            if ($$6 <= 0.001F) {
               return;
            }
         }

         float $$12 = azm.j($$6);
         ffc $$13 = $$4.c((double)$$12);
         ffc $$14 = this.bT();
         float $$15 = (float)($$14.d * $$13.d + $$14.f * $$13.f);
         if (!($$15 < -0.15F)) {
            ffh $$16 = ffh.a(this);
            iv $$17 = iv.a(this.dz(), this.cQ().e, this.dF());
            eat $$18 = this.dU().a_($$17);
            if ($$18.b(this.dU(), $$17, $$16).c()) {
               $$17 = $$17.d();
               eat $$19 = this.dU().a_($$17);
               if ($$19.b(this.dU(), $$17, $$16).c()) {
                  float $$20 = 7.0F;
                  float $$21 = 1.2F;
                  if (this.b(bvo.h)) {
                     $$21 += (float)(this.c(bvo.h).e() + 1) * 0.75F;
                  }

                  float $$22 = Math.max($$5 * 7.0F, 1.0F / $$12);
                  ffc $$24 = $$3.e($$13.c((double)$$22));
                  float $$25 = this.dp();
                  float $$26 = this.dq();
                  fex $$27 = new fex($$2, $$24.b(0.0, (double)$$26, 0.0)).c((double)$$25, 0.0, (double)$$25);
                  ffc $$23 = $$2.b(0.0, 0.51F, 0.0);
                  $$24 = $$24.b(0.0, 0.51F, 0.0);
                  ffc $$28 = $$13.c(new ffc(0.0, 1.0, 0.0));
                  ffc $$29 = $$28.c((double)($$25 * 0.5F));
                  ffc $$30 = $$23.d($$29);
                  ffc $$31 = $$24.d($$29);
                  ffc $$32 = $$23.e($$29);
                  ffc $$33 = $$24.e($$29);
                  Iterable<ffw> $$34 = this.dU().d(this, $$27);
                  Iterator<fex> $$35 = StreamSupport.stream($$34.spliterator(), false).flatMap($$0x -> $$0x.e().stream()).iterator();
                  float $$36 = Float.MIN_VALUE;

                  while ($$35.hasNext()) {
                     fex $$37 = $$35.next();
                     if ($$37.a($$30, $$31) || $$37.a($$32, $$33)) {
                        $$36 = (float)$$37.e;
                        ffc $$38 = $$37.f();
                        iv $$39 = iv.a((jp)$$38);

                        for (int $$40 = 1; (float)$$40 < $$21; $$40++) {
                           iv $$41 = $$39.b($$40);
                           eat $$42 = this.dU().a_($$41);
                           ffw $$43;
                           if (!($$43 = $$42.b(this.dU(), $$41, $$16)).c()) {
                              $$36 = (float)$$43.c(jb.a.b) + (float)$$41.v();
                              if ((double)$$36 - this.dB() > (double)$$21) {
                                 return;
                              }
                           }

                           if ($$40 > 1) {
                              $$17 = $$17.d();
                              eat $$44 = this.dU().a_($$17);
                              if (!$$44.b(this.dU(), $$17, $$16).c()) {
                                 return;
                              }
                           }
                        }
                        break;
                     }
                  }

                  if ($$36 != Float.MIN_VALUE) {
                     float $$45 = (float)((double)$$36 - this.dB());
                     if (!($$45 <= 0.5F) && !($$45 > $$21)) {
                        this.dc = 1;
                     }
                  }
               }
            }
         }
      }
   }

   @Override
   protected boolean d(ffc $$0) {
      float $$1 = this.dK() * (float) (Math.PI / 180.0);
      double $$2 = (double)azm.a($$1);
      double $$3 = (double)azm.b($$1);
      double $$4 = (double)this.bg * $$3 - (double)this.bi * $$2;
      double $$5 = (double)this.bi * $$3 + (double)this.bg * $$2;
      double $$6 = azm.k($$4) + azm.k($$5);
      double $$7 = azm.k($$0.d) + azm.k($$0.f);
      if (!($$6 < 1.0E-5F) && !($$7 < 1.0E-5F)) {
         double $$8 = $$4 * $$0.d + $$5 * $$0.f;
         double $$9 = Math.acos($$8 / Math.sqrt($$6 * $$7));
         return $$9 < 0.13962634F;
      } else {
         return false;
      }
   }

   private boolean O() {
      return this.C() && this.dc <= 0 && this.aH() && !this.fZ() && !this.bX() && this.P() && (double)this.aQ() >= 1.0;
   }

   private boolean P() {
      return this.k.b().c() > 0.0F;
   }

   private boolean Q() {
      return !this.ch()
         && this.k.c()
         && this.R()
         && !this.fy()
         && !this.N()
         && (!this.bX() || this.a(this.dj()))
         && (!this.fI() || this.bl())
         && (!this.w() || this.bl())
         && (!this.bh() || this.bl());
   }

   private boolean a(bwi $$0) {
      return $$0.dN() && $$0.df();
   }

   private boolean R() {
      return this.bX() || (float)this.gt().a() > 6.0F || this.gj().c;
   }

   public float D() {
      if (!this.a(axh.a)) {
         return 0.0F;
      } else {
         float $$0 = 600.0F;
         float $$1 = 100.0F;
         if ((float)this.de >= 600.0F) {
            return 1.0F;
         } else {
            float $$2 = azm.a((float)this.de / 100.0F, 0.0F, 1.0F);
            float $$3 = (float)this.de < 100.0F ? 0.0F : azm.a(((float)this.de - 100.0F) / 500.0F, 0.0F, 1.0F);
            return $$2 * 0.6F + $$3 * 0.39999998F;
         }
      }
   }

   public void a(djj $$0) {
      if ($$0 == djj.d) {
         this.i(this.dx().a(jb.a.b, 0.0));
      }
   }

   @Override
   public boolean bl() {
      return this.ce;
   }

   @Override
   protected boolean ga() {
      boolean $$0 = this.ce;
      boolean $$1 = super.ga();
      if (this.V_()) {
         return this.ce;
      } else {
         if (!$$0 && $$1) {
            this.dU().a(this.dz(), this.dB(), this.dF(), awn.x, awo.i, 1.0F, 1.0F, false);
            this.cq.ak().a((hno)(new hnr.b(this)));
         }

         if ($$0 && !$$1) {
            this.dU().a(this.dz(), this.dB(), this.dF(), awn.y, awo.i, 1.0F, 1.0F, false);
         }

         return this.ce;
      }
   }

   @Override
   public ffc v(float $$0) {
      if (this.cq.n.aE().a()) {
         float $$1 = azm.h($$0 * 0.5F, this.dK(), this.N) * (float) (Math.PI / 180.0);
         float $$2 = azm.h($$0 * 0.5F, this.dM(), this.O) * (float) (Math.PI / 180.0);
         double $$3 = this.fx() == bxa.b ? -1.0 : 1.0;
         ffc $$4 = new ffc(0.39 * $$3, -0.6, 0.3);
         return $$4.a(-$$2).b(-$$1).e(this.n($$0));
      } else {
         return super.v($$0);
      }
   }

   @Override
   public void a(czn $$0, czn $$1, cvp $$2) {
      this.cq.aB().a($$0, $$1, $$2);
   }

   @Override
   public float dL() {
      return this.dK();
   }

   @Override
   public void g(czn $$0) {
      this.cq.r.a($$0);
   }

   @Override
   public boolean gm() {
      return this.cG.c();
   }

   public bao E() {
      return this.cG;
   }
}
