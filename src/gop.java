import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gop extends gom {
   public static final Logger h = LogUtils.getLogger();
   private static final int cx = 20;
   private static final int cy = 600;
   private static final int cz = 100;
   private static final float cA = 0.6F;
   private static final double cB = 0.35;
   private static final double cC = 0.13962634F;
   public static final float i = 0.2F;
   public final gjs j;
   private final awy cD;
   private final foc cE;
   private final bao cF = new bao(20, 1280);
   private final List<hlw> cG = Lists.newArrayList();
   private int cH = 0;
   private double cI;
   private double cJ;
   private double cK;
   private float cL;
   private float cM;
   private boolean cN;
   private boolean cO;
   private boolean cP;
   private boolean cQ;
   private boolean cR;
   private int cS;
   private boolean cT;
   public gon k = new gon();
   private cqw cU = cqw.b;
   protected final fos cp;
   protected int cq;
   public float cr;
   public float cs;
   public float ct;
   public float cu;
   private int cV;
   private float cW;
   public float cv;
   public float cw;
   private boolean cX;
   @Nullable
   private bua cY;
   private boolean cZ;
   private boolean da = true;
   private int db;
   private boolean dc;
   private int dd;
   private boolean de = true;
   private boolean df = false;

   public gop(fos $$0, gjr $$1, gjs $$2, awy $$3, foc $$4, boolean $$5, boolean $$6) {
      super($$1, $$2.o());
      this.cp = $$0;
      this.j = $$2;
      this.cD = $$3;
      this.cE = $$4;
      this.cQ = $$5;
      this.cR = $$6;
      this.cG.add(new hmo(this, $$0.ak()));
      this.cG.add(new hmb(this));
      this.cG.add(new hma(this, $$0.ak(), $$1.D_()));
   }

   @Override
   public void c(float $$0) {
   }

   @Override
   public boolean a(bwd $$0, boolean $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         if ($$0 instanceof ctk) {
            this.cp.ak().a((hmm)(new hmg(this, (ctk)$$0, true)));
            this.cp.ak().a((hmm)(new hmg(this, (ctk)$$0, false)));
         }

         return true;
      }
   }

   @Override
   public void ae() {
      super.ae();
      this.cZ = false;
   }

   @Override
   public float i(float $$0) {
      return this.dN();
   }

   @Override
   public float j(float $$0) {
      return this.bZ() ? super.j($$0) : this.dL();
   }

   @Override
   public void h() {
      this.gJ();
      if (this.gI()) {
         this.cF.b();
         super.h();
         this.H();
         if (!this.cU.equals(this.k.a)) {
            this.j.b(new ahx(this.k.a));
            this.cU = this.k.a;
         }

         if (this.bZ()) {
            this.j.b(new aho.c(this.dL(), this.dN(), this.aJ(), this.P));
            bwd $$0 = this.df();
            if ($$0 != this && $$0.dg()) {
               this.j.b(ahp.a($$0));
               this.I();
            }
         } else {
            this.F();
         }

         for (hlw $$1 : this.cG) {
            $$1.a();
         }
      }
   }

   public float d() {
      for (hlw $$0 : this.cG) {
         if ($$0 instanceof hma) {
            return ((hma)$$0).b();
         }
      }

      return 0.0F;
   }

   private void F() {
      this.I();
      if (this.y()) {
         double $$0 = this.dA() - this.cI;
         double $$1 = this.dC() - this.cJ;
         double $$2 = this.dG() - this.cK;
         double $$3 = (double)(this.dL() - this.cL);
         double $$4 = (double)(this.dN() - this.cM);
         this.cS++;
         boolean $$5 = azm.f($$0, $$1, $$2) > azm.k(2.0E-4) || this.cS >= 20;
         boolean $$6 = $$3 != 0.0 || $$4 != 0.0;
         if ($$5 && $$6) {
            this.j.b(new aho.b(this.dA(), this.dC(), this.dG(), this.dL(), this.dN(), this.aJ(), this.P));
         } else if ($$5) {
            this.j.b(new aho.a(this.dA(), this.dC(), this.dG(), this.aJ(), this.P));
         } else if ($$6) {
            this.j.b(new aho.c(this.dL(), this.dN(), this.aJ(), this.P));
         } else if (this.cN != this.aJ() || this.cO != this.P) {
            this.j.b(new aho.d(this.aJ(), this.P));
         }

         if ($$5) {
            this.cI = this.dA();
            this.cJ = this.dC();
            this.cK = this.dG();
            this.cS = 0;
         }

         if ($$6) {
            this.cL = this.dL();
            this.cM = this.dN();
         }

         this.cN = this.aJ();
         this.cO = this.P;
         this.da = this.cp.n.J().c();
      }
   }

   private void H() {
      boolean $$0 = this.cd();
      if ($$0 != this.cQ) {
         ahw.a $$1 = $$0 ? ahw.a.a : ahw.a.b;
         this.j.b(new ahw(this, $$1));
         this.cQ = $$0;
      }
   }

   private void I() {
      boolean $$0 = this.cj();
      if ($$0 != this.cR) {
         ahw.a $$1 = $$0 ? ahw.a.d : ahw.a.e;
         this.j.b(new ahw(this, $$1));
         this.cR = $$0;
      }
   }

   public boolean a(boolean $$0) {
      ahv.a $$1 = $$0 ? ahv.a.d : ahv.a.e;
      cyy $$2 = this.gi().a($$0);
      this.j.b(new ahv($$1, iu.c, ja.a));
      return !$$2.f();
   }

   @Override
   public void a(bua $$0) {
      super.a($$0);
      this.j.b(new aio($$0));
   }

   @Override
   public void gf() {
      this.j.b(new aha(aha.a.a));
      fop.c();
   }

   @Override
   public void p() {
      this.j.b(new ahg(this.bQ.l));
      this.e();
   }

   public void e() {
      super.p();
      this.cp.a(null);
   }

   public void J(float $$0) {
      if (this.cT) {
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
         this.cT = true;
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
   public boolean bu() {
      return !this.gj().b && super.bu();
   }

   protected void f() {
      this.j.b(new ahw(this, ahw.a.f, azm.d(this.v() * 100.0F)));
   }

   public void i() {
      this.j.b(new ahw(this, ahw.a.h));
   }

   public awy l() {
      return this.cD;
   }

   public foc m() {
      return this.cE;
   }

   public void a(dex $$0) {
      if (this.cE.b($$0)) {
         this.cE.c($$0);
         this.j.b(new aia($$0));
      }
   }

   @Override
   public int G() {
      return this.cH;
   }

   public void a(int $$0) {
      this.cH = $$0;
   }

   @Override
   public void a(wy $$0, boolean $$1) {
      this.cp.aZ().a($$0, $$1);
   }

   private void c(double $$0, double $$1) {
      iu $$2 = iu.a($$0, this.dC(), $$1);
      if (this.c($$2)) {
         double $$3 = $$0 - (double)$$2.u();
         double $$4 = $$1 - (double)$$2.w();
         ja $$5 = null;
         double $$6 = Double.MAX_VALUE;
         ja[] $$7 = new ja[]{ja.e, ja.f, ja.c, ja.d};

         for (ja $$8 : $$7) {
            double $$9 = $$8.o().a($$3, 0.0, $$4);
            double $$10 = $$8.f() == ja.b.a ? 1.0 - $$9 : $$9;
            if ($$10 < $$6 && !this.c($$2.a($$8))) {
               $$6 = $$10;
               $$5 = $$8;
            }
         }

         if ($$5 != null) {
            fei $$11 = this.dy();
            if ($$5.o() == ja.a.a) {
               this.n(0.1 * (double)$$5.j(), $$11.e, $$11.f);
            } else {
               this.n($$11.d, $$11.e, 0.1 * (double)$$5.l());
            }
         }
      }
   }

   private boolean c(iu $$0) {
      fed $$1 = this.cR();
      fed $$2 = new fed((double)$$0.u(), $$1.b, (double)$$0.w(), (double)$$0.u() + 1.0, $$1.e, (double)$$0.w() + 1.0).h(1.0E-7);
      return this.dV().g(this, $$2);
   }

   public void a(float $$0, int $$1, int $$2) {
      this.cg = $$0;
      this.cf = $$1;
      this.ce = $$2;
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
      this.de = $$0;
   }

   public boolean n() {
      return this.de;
   }

   public void x(boolean $$0) {
      this.df = $$0;
   }

   public boolean t() {
      return this.df;
   }

   @Override
   public void a(awm $$0, float $$1, float $$2) {
      this.dV().a(this.dA(), this.dC(), this.dG(), $$0, this.dm(), $$1, $$2, false);
   }

   @Override
   public void a(awm $$0, awo $$1, float $$2, float $$3) {
      this.dV().a(this.dA(), this.dC(), this.dG(), $$0, $$1, $$2, $$3, false);
   }

   @Override
   public void c(bua $$0) {
      cyy $$1 = this.b($$0);
      if (!$$1.f() && !this.fy()) {
         super.c($$0);
         this.cX = true;
         this.cY = $$0;
      }
   }

   @Override
   public boolean fy() {
      return this.cX;
   }

   @Override
   public void fE() {
      super.fE();
      this.cX = false;
   }

   @Override
   public bua fz() {
      return Objects.requireNonNullElse(this.cY, bua.a);
   }

   @Override
   public void a(akj<?> $$0) {
      super.a($$0);
      if (aC.equals($$0)) {
         boolean $$1 = (this.al.a(aC) & 1) > 0;
         bua $$2 = (this.al.a(aC) & 2) > 0 ? bua.b : bua.a;
         if ($$1 && !this.cX) {
            this.c($$2);
         } else if (!$$1 && this.cX) {
            this.fE();
         }
      }

      if (am.equals($$0) && this.fI() && !this.dc) {
         this.cp.ak().a((hmm)(new hmc(this)));
      }
   }

   @Nullable
   public bxm u() {
      if (this.dl() instanceof bxm $$0 && $$0.a()) {
         return $$0;
      }

      return null;
   }

   public float v() {
      return this.cW;
   }

   @Override
   public boolean aa() {
      return this.cp.aT();
   }

   @Override
   public void a(dyl $$0, boolean $$1) {
      if ($$0 instanceof dxy $$2) {
         this.cp.a(new fzh($$2, $$1, this.cp.aT()));
      } else {
         this.cp.a(new fzu($$0, $$1, this.cp.aT()));
      }
   }

   @Override
   public void a(dhw $$0) {
      this.cp.a(new fzr($$0));
   }

   @Override
   public void a(dxi $$0) {
      this.cp.a(new fyu($$0));
   }

   @Override
   public void a(dyq $$0) {
      this.cp.a(new fzy($$0));
   }

   @Override
   public void a(dyr $$0) {
      this.cp.a(new fzz($$0));
   }

   @Override
   public void a(dys $$0) {
      this.cp.a(new gaa($$0));
   }

   @Override
   public void a(dyb $$0) {
      this.cp.a(new fzm($$0));
   }

   @Override
   public void a(cyy $$0, bua $$1) {
      dch $$2 = $$0.a(kj.U);
      if ($$2 != null) {
         this.cp.a(new fyq(this, $$0, $$1, $$2));
      }
   }

   @Override
   public void b(bwd $$0) {
      this.cp.g.a($$0, lx.f);
   }

   @Override
   public void c(bwd $$0) {
      this.cp.g.a($$0, lx.r);
   }

   @Override
   public boolean cd() {
      return this.k.a.f();
   }

   @Override
   public boolean ci() {
      return this.cP;
   }

   public boolean w() {
      return this.ci() || this.cm();
   }

   @Override
   public void fp() {
      if (this.y()) {
         feh $$0 = this.a(this.k.b());
         this.bg = $$0.i;
         this.bi = $$0.j;
         this.bf = this.k.a.e();
         this.ct = this.cr;
         this.cu = this.cs;
         this.cs = this.cs + (this.dN() - this.cs) * 0.5F;
         this.cr = this.cr + (this.dL() - this.cr) * 0.5F;
      } else {
         super.fp();
      }
   }

   private feh a(feh $$0) {
      if ($$0.c() == 0.0F) {
         return $$0;
      } else {
         feh $$1 = $$0.a(0.98F);
         if (this.fy() && !this.bZ()) {
            $$1 = $$1.a(0.2F);
         }

         if (this.w()) {
            float $$2 = (float)this.h(byi.z);
            $$1 = $$1.a($$2);
         }

         return b($$1);
      }
   }

   private static feh b(feh $$0) {
      float $$1 = $$0.b();
      feh $$2 = $$0.a(1.0F / $$1);
      float $$3 = c($$2);
      float $$4 = Math.min($$1 * $$3, 1.0F);
      return $$2.a($$4);
   }

   private static float c(feh $$0) {
      float $$1 = Math.abs($$0.i);
      float $$2 = Math.abs($$0.j);
      float $$3 = $$2 > $$1 ? $$1 / $$2 : $$2 / $$1;
      return azm.c(1.0F + azm.l($$3));
   }

   protected boolean y() {
      return this.cp.ao() == this;
   }

   public void z() {
      this.b(bxo.a);
      if (this.dV() != null) {
         for (double $$0 = this.dC(); $$0 > (double)this.dV().G_() && $$0 <= (double)this.dV().ao(); $$0++) {
            this.a_(this.dA(), $$0, this.dG());
            if (this.dV().g(this)) {
               break;
            }
         }

         this.i(fei.c);
         this.x(0.0F);
      }

      this.d(this.eT());
      this.aP = 0;
   }

   @Override
   public void k_() {
      if (this.cq > 0) {
         this.cq--;
      }

      if (!(this.cp.z instanceof fxs)) {
         this.y(this.A() == dry.a.a);
         this.M();
      }

      boolean $$0 = this.k.a.e();
      boolean $$1 = this.k.a.f();
      boolean $$2 = this.k.c();
      cqu $$3 = this.gj();
      this.cP = !$$3.b && !this.ck() && !this.bZ() && this.h(bxo.f) && (this.cd() || !this.fQ() && !this.h(bxo.a));
      this.k.a();
      this.cp.aB().a(this.k);
      boolean $$4 = false;
      if (this.db > 0) {
         this.db--;
         $$4 = true;
         this.k.d();
      }

      if (!this.ad) {
         this.c(this.dA() - (double)this.dq() * 0.35, this.dG() + (double)this.dq() * 0.35);
         this.c(this.dA() - (double)this.dq() * 0.35, this.dG() - (double)this.dq() * 0.35);
         this.c(this.dA() + (double)this.dq() * 0.35, this.dG() - (double)this.dq() * 0.35);
         this.c(this.dA() + (double)this.dq() * 0.35, this.dG() + (double)this.dq() * 0.35);
      }

      if ($$1 || this.fy() && !this.bZ()) {
         this.cq = 0;
      }

      if (this.Q()) {
         if (!$$2) {
            if (this.cq > 0) {
               this.h(true);
            } else {
               this.cq = 7;
            }
         }

         if (this.k.a.g()) {
            this.h(true);
         }
      }

      if (this.cj()) {
         if (this.ck()) {
            if (this.L()) {
               this.h(false);
            }
         } else if (this.J()) {
            this.h(false);
         }
      }

      boolean $$5 = false;
      if ($$3.c) {
         if (this.cp.r.g()) {
            if (!$$3.b) {
               $$3.b = true;
               $$5 = true;
               this.x();
            }
         } else if (!$$0 && this.k.a.e() && !$$4) {
            if (this.bS == 0) {
               this.bS = 7;
            } else if (!this.ck()) {
               $$3.b = !$$3.b;
               if ($$3.b && this.aJ()) {
                  this.s();
               }

               $$5 = true;
               this.x();
               this.bS = 0;
            }
         }
      }

      if (this.k.a.e() && !$$5 && !$$0 && !this.d_() && this.gp()) {
         this.j.b(new ahw(this, ahw.a.i));
      }

      this.dc = this.fI();
      if (this.bj() && this.k.a.f() && this.el()) {
         this.fi();
      }

      if (this.a(axh.a)) {
         int $$6 = this.U_() ? 10 : 1;
         this.dd = azm.a(this.dd + $$6, 0, 600);
      } else if (this.dd > 0) {
         this.a(axh.a);
         this.dd = azm.a(this.dd - 10, 0, 600);
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
            this.i(this.dy().b(0.0, (double)((float)$$7 * $$3.a() * 3.0F), 0.0));
         }
      }

      bxm $$8 = this.u();
      if ($$8 != null && $$8.c() == 0) {
         if (this.cV < 0) {
            this.cV++;
            if (this.cV == 0) {
               this.cW = 0.0F;
            }
         }

         if ($$0 && !this.k.a.e()) {
            this.cV = -10;
            $$8.b(azm.d(this.v() * 100.0F));
            this.f();
         } else if (!$$0 && this.k.a.e()) {
            this.cV = 0;
            this.cW = 0.0F;
         } else if ($$0) {
            this.cV++;
            if (this.cV < 10) {
               this.cW = (float)this.cV * 0.1F;
            } else {
               this.cW = 0.8F + 2.0F / (float)(this.cV - 9) * 0.1F;
            }
         }
      } else {
         this.cW = 0.0F;
      }

      super.k_();
      if (this.aJ() && $$3.b && !this.cp.r.g()) {
         $$3.b = false;
         this.x();
      }
   }

   private boolean J() {
      return this.N() || this.bZ() && !this.a(this.dk()) || !this.k.c() || !this.R() || this.P && !this.S || this.bj() && !this.bn();
   }

   private boolean L() {
      return this.N() || this.bZ() && !this.a(this.dk()) || !this.bj() || !this.k.c() && !this.aJ() && !this.k.a.f() || !this.R();
   }

   private boolean N() {
      return this.b(bvj.o);
   }

   public dry.a A() {
      return this.as == null ? dry.a.b : this.as.a();
   }

   @Override
   protected void em() {
      this.aP++;
      if (this.aP == 20) {
         this.a(bwd.e.a);
      }
   }

   private void y(boolean $$0) {
      this.cw = this.cv;
      float $$1 = 0.0F;
      if ($$0 && this.as != null && this.as.e()) {
         if (this.cp.z != null && !this.cp.z.k() && !(this.cp.z instanceof fwy) && !(this.cp.z instanceof fxx)) {
            if (this.cp.z instanceof fyj) {
               this.p();
            }

            this.cp.a(null);
         }

         if (this.cv == 0.0F) {
            this.cp.ak().a(hmh.b(awn.vu, this.ae.i() * 0.4F + 0.8F, 0.25F));
         }

         $$1 = 0.0125F;
         this.as.a(false);
      } else if (this.cv > 0.0F) {
         $$1 = -0.05F;
      }

      this.cv = azm.a(this.cv + $$1, 0.0F, 1.0F);
   }

   @Override
   public void r() {
      super.r();
      this.cZ = false;
      if (this.dl() instanceof cti $$0) {
         $$0.a(this.k.a.c(), this.k.a.d(), this.k.a.a(), this.k.a.b());
         this.cZ = this.cZ | (this.k.a.c() || this.k.a.d() || this.k.a.a() || this.k.a.b());
      }
   }

   public boolean B() {
      return this.cZ;
   }

   @Override
   public void a(bxg $$0, fei $$1) {
      double $$2 = this.dA();
      double $$3 = this.dG();
      super.a($$0, $$1);
      float $$4 = (float)(this.dA() - $$2);
      float $$5 = (float)(this.dG() - $$3);
      this.f($$4, $$5);
      this.g = this.g + azm.f($$4, $$5) * 0.6F;
   }

   public boolean C() {
      return this.da;
   }

   @Override
   public boolean gP() {
      return this.cp.n.K().c();
   }

   @Override
   protected void f(float $$0, float $$1) {
      if (this.O()) {
         fei $$2 = this.dt();
         fei $$3 = $$2.b((double)$$0, 0.0, (double)$$1);
         fei $$4 = new fei((double)$$0, 0.0, (double)$$1);
         float $$5 = this.fn();
         float $$6 = (float)$$4.h();
         if ($$6 <= 0.001F) {
            feh $$7 = this.k.b();
            float $$8 = $$5 * $$7.i;
            float $$9 = $$5 * $$7.j;
            float $$10 = azm.a(this.dL() * (float) (Math.PI / 180.0));
            float $$11 = azm.b(this.dL() * (float) (Math.PI / 180.0));
            $$4 = new fei((double)($$8 * $$11 - $$9 * $$10), $$4.e, (double)($$9 * $$11 + $$8 * $$10));
            $$6 = (float)$$4.h();
            if ($$6 <= 0.001F) {
               return;
            }
         }

         float $$12 = azm.j($$6);
         fei $$13 = $$4.c((double)$$12);
         fei $$14 = this.bV();
         float $$15 = (float)($$14.d * $$13.d + $$14.f * $$13.f);
         if (!($$15 < -0.15F)) {
            fen $$16 = fen.a(this);
            iu $$17 = iu.a(this.dA(), this.cR().e, this.dG());
            dzz $$18 = this.dV().a_($$17);
            if ($$18.b(this.dV(), $$17, $$16).c()) {
               $$17 = $$17.d();
               dzz $$19 = this.dV().a_($$17);
               if ($$19.b(this.dV(), $$17, $$16).c()) {
                  float $$20 = 7.0F;
                  float $$21 = 1.2F;
                  if (this.b(bvj.h)) {
                     $$21 += (float)(this.c(bvj.h).e() + 1) * 0.75F;
                  }

                  float $$22 = Math.max($$5 * 7.0F, 1.0F / $$12);
                  fei $$24 = $$3.e($$13.c((double)$$22));
                  float $$25 = this.dq();
                  float $$26 = this.dr();
                  fed $$27 = new fed($$2, $$24.b(0.0, (double)$$26, 0.0)).c((double)$$25, 0.0, (double)$$25);
                  fei $$23 = $$2.b(0.0, 0.51F, 0.0);
                  $$24 = $$24.b(0.0, 0.51F, 0.0);
                  fei $$28 = $$13.c(new fei(0.0, 1.0, 0.0));
                  fei $$29 = $$28.c((double)($$25 * 0.5F));
                  fei $$30 = $$23.d($$29);
                  fei $$31 = $$24.d($$29);
                  fei $$32 = $$23.e($$29);
                  fei $$33 = $$24.e($$29);
                  Iterable<ffc> $$34 = this.dV().d(this, $$27);
                  Iterator<fed> $$35 = StreamSupport.stream($$34.spliterator(), false).flatMap($$0x -> $$0x.e().stream()).iterator();
                  float $$36 = Float.MIN_VALUE;

                  while ($$35.hasNext()) {
                     fed $$37 = $$35.next();
                     if ($$37.a($$30, $$31) || $$37.a($$32, $$33)) {
                        $$36 = (float)$$37.e;
                        fei $$38 = $$37.f();
                        iu $$39 = iu.a((jo)$$38);

                        for (int $$40 = 1; (float)$$40 < $$21; $$40++) {
                           iu $$41 = $$39.b($$40);
                           dzz $$42 = this.dV().a_($$41);
                           ffc $$43;
                           if (!($$43 = $$42.b(this.dV(), $$41, $$16)).c()) {
                              $$36 = (float)$$43.c(ja.a.b) + (float)$$41.v();
                              if ((double)$$36 - this.dC() > (double)$$21) {
                                 return;
                              }
                           }

                           if ($$40 > 1) {
                              $$17 = $$17.d();
                              dzz $$44 = this.dV().a_($$17);
                              if (!$$44.b(this.dV(), $$17, $$16).c()) {
                                 return;
                              }
                           }
                        }
                        break;
                     }
                  }

                  if ($$36 != Float.MIN_VALUE) {
                     float $$45 = (float)((double)$$36 - this.dC());
                     if (!($$45 <= 0.5F) && !($$45 > $$21)) {
                        this.db = 1;
                     }
                  }
               }
            }
         }
      }
   }

   @Override
   protected boolean d(fei $$0) {
      float $$1 = this.dL() * (float) (Math.PI / 180.0);
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
      return this.C() && this.db <= 0 && this.aJ() && !this.fZ() && !this.bZ() && this.P() && (double)this.aS() >= 1.0;
   }

   private boolean P() {
      return this.k.b().c() > 0.0F;
   }

   private boolean Q() {
      return !this.cj()
         && this.k.c()
         && this.R()
         && !this.fy()
         && !this.N()
         && (!this.bZ() || this.a(this.dk()))
         && (!this.fI() || this.bn())
         && (!this.w() || this.bn())
         && (!this.bj() || this.bn());
   }

   private boolean a(bwd $$0) {
      return $$0.dO() && $$0.dg();
   }

   private boolean R() {
      return this.bZ() || (float)this.gt().a() > 6.0F || this.gj().c;
   }

   public float D() {
      if (!this.a(axh.a)) {
         return 0.0F;
      } else {
         float $$0 = 600.0F;
         float $$1 = 100.0F;
         if ((float)this.dd >= 600.0F) {
            return 1.0F;
         } else {
            float $$2 = azm.a((float)this.dd / 100.0F, 0.0F, 1.0F);
            float $$3 = (float)this.dd < 100.0F ? 0.0F : azm.a(((float)this.dd - 100.0F) / 500.0F, 0.0F, 1.0F);
            return $$2 * 0.6F + $$3 * 0.39999998F;
         }
      }
   }

   public void a(dis $$0) {
      if ($$0 == dis.d) {
         this.i(this.dy().a(ja.a.b, 0.0));
      }
   }

   @Override
   public boolean bn() {
      return this.cd;
   }

   @Override
   protected boolean ga() {
      boolean $$0 = this.cd;
      boolean $$1 = super.ga();
      if (this.U_()) {
         return this.cd;
      } else {
         if (!$$0 && $$1) {
            this.dV().a(this.dA(), this.dC(), this.dG(), awn.x, awo.i, 1.0F, 1.0F, false);
            this.cp.ak().a((hmm)(new hmp.b(this)));
         }

         if ($$0 && !$$1) {
            this.dV().a(this.dA(), this.dC(), this.dG(), awn.y, awo.i, 1.0F, 1.0F, false);
         }

         return this.cd;
      }
   }

   @Override
   public fei v(float $$0) {
      if (this.cp.n.aE().a()) {
         float $$1 = azm.h($$0 * 0.5F, this.dL(), this.N) * (float) (Math.PI / 180.0);
         float $$2 = azm.h($$0 * 0.5F, this.dN(), this.O) * (float) (Math.PI / 180.0);
         double $$3 = this.fx() == bwv.b ? -1.0 : 1.0;
         fei $$4 = new fei(0.39 * $$3, -0.6, 0.3);
         return $$4.a(-$$2).b(-$$1).e(this.n($$0));
      } else {
         return super.v($$0);
      }
   }

   @Override
   public void a(cyy $$0, cyy $$1, cva $$2) {
      this.cp.aB().a($$0, $$1, $$2);
   }

   @Override
   public float dM() {
      return this.dL();
   }

   @Override
   public void h(cyy $$0) {
      this.cp.r.a($$0);
   }

   @Override
   public boolean gm() {
      return this.cF.c();
   }

   public bao E() {
      return this.cF;
   }
}
