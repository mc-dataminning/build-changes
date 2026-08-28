import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gdz extends gdw {
   public static final Logger g = LogUtils.getLogger();
   private static final int cJ = 20;
   private static final int cK = 600;
   private static final int cL = 100;
   private static final float cM = 0.6F;
   private static final double cN = 0.35;
   private static final double cO = 0.13962634F;
   public final fze h;
   private final awa cP;
   private final ffy cQ;
   private final List<gti> cR = Lists.newArrayList();
   private int cS = 0;
   private double cT;
   private double cU;
   private double cV;
   private float cW;
   private float cX;
   private boolean cY;
   private boolean cZ;
   private boolean da;
   private boolean db;
   private int dc;
   private boolean dd;
   public gdx cz;
   protected final fgm cB;
   protected int cC;
   public float cD;
   public float cE;
   public float cF;
   public float cG;
   private int de;
   private float df;
   public float cH;
   public float cI;
   private boolean dg;
   @Nullable
   private bqq dh;
   private boolean di;
   private boolean dj = true;
   private int dk;
   private boolean dl;
   private int dm;
   private boolean dn = true;
   private boolean do = false;

   public gdz(fgm $$0, fzd $$1, fze $$2, awa $$3, ffy $$4, boolean $$5, boolean $$6) {
      super($$1, $$2.o());
      this.cB = $$0;
      this.h = $$2;
      this.cP = $$3;
      this.cQ = $$4;
      this.da = $$5;
      this.db = $$6;
      this.cR.add(new gua(this, $$0.aj()));
      this.cR.add(new gtn(this));
      this.cR.add(new gtm(this, $$0.aj(), $$1.F_()));
   }

   @Override
   public boolean a(brk $$0, float $$1) {
      return false;
   }

   @Override
   public void c(float $$0) {
   }

   @Override
   public boolean a(bsr $$0, boolean $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         if ($$0 instanceof cot) {
            this.cB.aj().a((gty)(new gts(this, (cot)$$0, true)));
            this.cB.aj().a((gty)(new gts(this, (cot)$$0, false)));
         }

         return true;
      }
   }

   @Override
   public void bJ() {
      super.bJ();
      this.di = false;
   }

   @Override
   public float h(float $$0) {
      return this.dH();
   }

   @Override
   public float i(float $$0) {
      return this.bS() ? super.i($$0) : this.dF();
   }

   @Override
   public void l() {
      if (this.dP().f(this.dt(), this.dz())) {
         super.l();
         if (this.bS()) {
            this.h.b(new ahg.c(this.dF(), this.dH(), this.aF()));
            this.h.b(new aho(this.bo, this.bq, this.cz.g, this.cz.h));
            bsr $$0 = this.da();
            if ($$0 != this && $$0.db()) {
               this.h.b(new ahh($$0));
               this.F();
            }
         } else {
            this.E();
         }

         for (gti $$1 : this.cR) {
            $$1.a();
         }
      }
   }

   public float d() {
      for (gti $$0 : this.cR) {
         if ($$0 instanceof gtm) {
            return ((gtm)$$0).b();
         }
      }

      return 0.0F;
   }

   private void E() {
      this.F();
      boolean $$0 = this.bW();
      if ($$0 != this.da) {
         ahn.a $$1 = $$0 ? ahn.a.a : ahn.a.b;
         this.h.b(new ahn(this, $$1));
         this.da = $$0;
      }

      if (this.x()) {
         double $$2 = this.du() - this.cT;
         double $$3 = this.dw() - this.cU;
         double $$4 = this.dA() - this.cV;
         double $$5 = (double)(this.dF() - this.cW);
         double $$6 = (double)(this.dH() - this.cX);
         this.dc++;
         boolean $$7 = ayo.f($$2, $$3, $$4) > ayo.k(2.0E-4) || this.dc >= 20;
         boolean $$8 = $$5 != 0.0 || $$6 != 0.0;
         if (this.bS()) {
            exa $$9 = this.ds();
            this.h.b(new ahg.b($$9.c, -999.0, $$9.e, this.dF(), this.dH(), this.aF()));
            $$7 = false;
         } else if ($$7 && $$8) {
            this.h.b(new ahg.b(this.du(), this.dw(), this.dA(), this.dF(), this.dH(), this.aF()));
         } else if ($$7) {
            this.h.b(new ahg.a(this.du(), this.dw(), this.dA(), this.aF()));
         } else if ($$8) {
            this.h.b(new ahg.c(this.dF(), this.dH(), this.aF()));
         } else if (this.cY != this.aF()) {
            this.h.b(new ahg.d(this.aF()));
         }

         if ($$7) {
            this.cT = this.du();
            this.cU = this.dw();
            this.cV = this.dA();
            this.dc = 0;
         }

         if ($$8) {
            this.cW = this.dF();
            this.cX = this.dH();
         }

         this.cY = this.aF();
         this.dj = this.cB.m.H().c();
      }
   }

   private void F() {
      boolean $$0 = this.cc();
      if ($$0 != this.db) {
         ahn.a $$1 = $$0 ? ahn.a.d : ahn.a.e;
         this.h.b(new ahn(this, $$1));
         this.db = $$0;
      }
   }

   public boolean a(boolean $$0) {
      ahm.a $$1 = $$0 ? ahm.a.d : ahm.a.e;
      cuq $$2 = this.fZ().a($$0);
      this.h.b(new ahm($$1, jd.c, ji.a));
      return !$$2.e();
   }

   @Override
   public void a(bqq $$0) {
      super.a($$0);
      this.h.b(new aic($$0));
   }

   @Override
   public void fX() {
      this.h.b(new agt(agt.a.a));
      fgk.c();
   }

   @Override
   protected void f(brk $$0, float $$1) {
      if (!this.b($$0)) {
         this.v(this.ex() - $$1);
      }
   }

   @Override
   public void s() {
      this.h.b(new agy(this.cd.j));
      this.e();
   }

   public void e() {
      super.s();
      this.cB.a(null);
   }

   public void H(float $$0) {
      if (this.dd) {
         float $$1 = this.ex() - $$0;
         if ($$1 <= 0.0F) {
            this.v($$0);
            if ($$1 < 0.0F) {
               this.am = 10;
            }
         } else {
            this.bm = $$1;
            this.am = 20;
            this.v($$0);
            this.aP = 10;
            this.aO = this.aP;
         }
      } else {
         this.v($$0);
         this.dd = true;
      }
   }

   @Override
   public void z() {
      this.h.b(new ahl(this.ga()));
   }

   @Override
   public boolean g() {
      return true;
   }

   @Override
   public boolean fA() {
      return !this.ga().b && super.fA();
   }

   @Override
   public boolean br() {
      return !this.ga().b && super.br();
   }

   protected void h() {
      this.h.b(new ahn(this, ahn.a.f, ayo.d(this.v() * 100.0F)));
   }

   public void i() {
      this.h.b(new ahn(this, ahn.a.h));
   }

   public awa j() {
      return this.cP;
   }

   public ffy m() {
      return this.cQ;
   }

   public void a(czb<?> $$0) {
      if (this.cQ.d($$0)) {
         this.cQ.e($$0);
         this.h.b(new ahq($$0));
      }
   }

   @Override
   protected int G() {
      return this.cS;
   }

   public void a(int $$0) {
      this.cS = $$0;
   }

   @Override
   public void a(wz $$0, boolean $$1) {
      this.cB.aW().a($$0, $$1);
   }

   private void c(double $$0, double $$1) {
      jd $$2 = jd.a($$0, this.dw(), $$1);
      if (this.c($$2)) {
         double $$3 = $$0 - (double)$$2.u();
         double $$4 = $$1 - (double)$$2.w();
         ji $$5 = null;
         double $$6 = Double.MAX_VALUE;
         ji[] $$7 = new ji[]{ji.e, ji.f, ji.c, ji.d};

         for (ji $$8 : $$7) {
            double $$9 = $$8.o().a($$3, 0.0, $$4);
            double $$10 = $$8.f() == ji.b.a ? 1.0 - $$9 : $$9;
            if ($$10 < $$6 && !this.c($$2.a($$8))) {
               $$6 = $$10;
               $$5 = $$8;
            }
         }

         if ($$5 != null) {
            exa $$11 = this.ds();
            if ($$5.o() == ji.a.a) {
               this.n(0.1 * (double)$$5.j(), $$11.d, $$11.e);
            } else {
               this.n($$11.c, $$11.d, 0.1 * (double)$$5.l());
            }
         }
      }
   }

   private boolean c(jd $$0) {
      ewv $$1 = this.cL();
      ewv $$2 = new ewv((double)$$0.u(), $$1.b, (double)$$0.w(), (double)$$0.u() + 1.0, $$1.e, (double)$$0.w() + 1.0).h(1.0E-7);
      return this.dP().f(this, $$2);
   }

   public void a(float $$0, int $$1, int $$2) {
      this.cs = $$0;
      this.cr = $$1;
      this.cq = $$2;
   }

   @Override
   public void a(wz $$0) {
      this.cB.l.d().a($$0);
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
      this.dn = $$0;
   }

   public boolean o() {
      return this.dn;
   }

   public void w(boolean $$0) {
      this.do = $$0;
   }

   public boolean p() {
      return this.do;
   }

   @Override
   public void a(avo $$0, float $$1, float $$2) {
      this.dP().a(this.du(), this.dw(), this.dA(), $$0, this.df(), $$1, $$2, false);
   }

   @Override
   public void a(avo $$0, avq $$1, float $$2, float $$3) {
      this.dP().a(this.du(), this.dw(), this.dA(), $$0, $$1, $$2, $$3, false);
   }

   @Override
   public boolean dc() {
      return true;
   }

   @Override
   public void c(bqq $$0) {
      cuq $$1 = this.b($$0);
      if (!$$1.e() && !this.fs()) {
         super.c($$0);
         this.dg = true;
         this.dh = $$0;
      }
   }

   @Override
   public boolean fs() {
      return this.dg;
   }

   @Override
   public void fy() {
      super.fy();
      this.dg = false;
   }

   @Override
   public bqq ft() {
      return Objects.requireNonNullElse(this.dh, bqq.a);
   }

   @Override
   public void a(ajw<?> $$0) {
      super.a($$0);
      if (aE.equals($$0)) {
         boolean $$1 = (this.ao.a(aE) & 1) > 0;
         bqq $$2 = (this.ao.a(aE) & 2) > 0 ? bqq.b : bqq.a;
         if ($$1 && !this.dg) {
            this.c($$2);
         } else if (!$$1 && this.dg) {
            this.fy();
         }
      }

      if (ap.equals($$0) && this.fB() && !this.dl) {
         this.cB.aj().a((gty)(new gto(this)));
      }
   }

   @Nullable
   public bty q() {
      if (this.de() instanceof bty $$0 && $$0.a()) {
         return $$0;
      }

      return null;
   }

   public float v() {
      return this.df;
   }

   @Override
   public boolean Z() {
      return this.cB.aQ();
   }

   @Override
   public void a(drs $$0, boolean $$1) {
      if ($$0 instanceof drf $$2) {
         this.cB.a(new fpo($$2, $$1, this.cB.aQ()));
      } else {
         this.cB.a(new fqb($$0, $$1, this.cB.aQ()));
      }
   }

   @Override
   public void a(dbx $$0) {
      this.cB.a(new fpy($$0));
   }

   @Override
   public void a(dqr $$0) {
      this.cB.a(new fpb($$0));
   }

   @Override
   public void a(drx $$0) {
      this.cB.a(new fqf($$0));
   }

   @Override
   public void a(dri $$0) {
      this.cB.a(new fpt($$0));
   }

   @Override
   public void a(cuq $$0, bqq $$1) {
      if ($$0.a(cut.tZ)) {
         this.cB.a(new fox(this, $$0, $$1));
      }
   }

   @Override
   public void b(bsr $$0) {
      this.cB.g.a($$0, lm.f);
   }

   @Override
   public void c(bsr $$0) {
      this.cB.g.a($$0, lm.r);
   }

   @Override
   public boolean bW() {
      return this.cz != null && this.cz.h;
   }

   @Override
   public boolean cb() {
      return this.cZ;
   }

   @Override
   public boolean w() {
      return this.cb() || this.cf();
   }

   @Override
   public void fn() {
      super.fn();
      if (this.x()) {
         this.bo = this.cz.a;
         this.bq = this.cz.b;
         this.bn = this.cz.g;
         this.cF = this.cD;
         this.cG = this.cE;
         this.cE = this.cE + (this.dH() - this.cE) * 0.5F;
         this.cD = this.cD + (this.dF() - this.cD) * 0.5F;
      }
   }

   protected boolean x() {
      return this.cB.an() == this;
   }

   public void y() {
      this.b(bua.a);
      if (this.dP() != null) {
         for (double $$0 = this.dw(); $$0 > (double)this.dP().I_() && $$0 < (double)this.dP().am(); $$0++) {
            this.a_(this.du(), $$0, this.dA());
            if (this.dP().g(this)) {
               break;
            }
         }

         this.i(exa.b);
         this.u(0.0F);
      }

      this.v(this.eO());
      this.aQ = 0;
   }

   @Override
   public void m_() {
      if (this.cC > 0) {
         this.cC--;
      }

      if (!(this.cB.y instanceof fnz)) {
         this.x(this.A() == dlr.a.a);
         this.M();
      }

      boolean $$0 = this.cz.g;
      boolean $$1 = this.cz.h;
      boolean $$2 = this.L();
      cmu $$3 = this.ga();
      this.cZ = !$$3.b && !this.cd() && !this.bS() && this.h(bua.f) && (this.bW() || !this.fI() && !this.h(bua.a));
      float $$4 = (float)this.g(buw.z);
      this.cz.a(this.w(), $$4);
      this.cB.ax().a(this.cz);
      if (this.fs() && !this.bS()) {
         this.cz.a *= 0.2F;
         this.cz.b *= 0.2F;
         this.cC = 0;
      }

      boolean $$5 = false;
      if (this.dk > 0) {
         this.dk--;
         $$5 = true;
         this.cz.g = true;
      }

      if (!this.ag) {
         this.c(this.du() - (double)this.dk() * 0.35, this.dA() + (double)this.dk() * 0.35);
         this.c(this.du() - (double)this.dk() * 0.35, this.dA() - (double)this.dk() * 0.35);
         this.c(this.du() + (double)this.dk() * 0.35, this.dA() - (double)this.dk() * 0.35);
         this.c(this.du() + (double)this.dk() * 0.35, this.dA() + (double)this.dk() * 0.35);
      }

      if ($$1) {
         this.cC = 0;
      }

      boolean $$6 = this.J();
      boolean $$7 = this.bS() ? this.dd().aF() : this.aF();
      boolean $$8 = !$$1 && !$$2;
      if (($$7 || this.bk()) && $$8 && $$6) {
         if (this.cC <= 0 && !this.cB.m.C.e()) {
            this.cC = 7;
         } else {
            this.h(true);
         }
      }

      if ((!this.bf() || this.bk()) && $$6 && this.cB.m.C.e()) {
         this.h(true);
      }

      if (this.cc()) {
         boolean $$9 = !this.cz.b() || !this.N();
         boolean $$10 = $$9 || this.Q && !this.T || this.bf() && !this.bk();
         if (this.cd()) {
            if (!this.aF() && !this.cz.h && $$9 || !this.bf()) {
               this.h(false);
            }
         } else if ($$10) {
            this.h(false);
         }
      }

      boolean $$11 = false;
      if ($$3.c) {
         if (this.cB.q.h()) {
            if (!$$3.b) {
               $$3.b = true;
               $$11 = true;
               this.z();
            }
         } else if (!$$0 && this.cz.g && !$$5) {
            if (this.cf == 0) {
               this.cf = 7;
            } else if (!this.cd()) {
               $$3.b = !$$3.b;
               if ($$3.b && this.aF()) {
                  this.fg();
               }

               $$11 = true;
               this.z();
               this.cf = 0;
            }
         }
      }

      if (this.cz.g && !$$11 && !$$0 && !$$3.b && !this.bS() && !this.p_()) {
         cuq $$12 = this.a(bsy.e);
         if ($$12.a(cut.nT) && ctm.i($$12) && this.ge()) {
            this.h.b(new ahn(this, ahn.a.i));
         }
      }

      this.dl = this.fB();
      if (this.bf() && this.cz.h && this.ed()) {
         this.fh();
      }

      if (this.a(awk.a)) {
         int $$13 = this.R_() ? 10 : 1;
         this.dm = ayo.a(this.dm + $$13, 0, 600);
      } else if (this.dm > 0) {
         this.a(awk.a);
         this.dm = ayo.a(this.dm - 10, 0, 600);
      }

      if ($$3.b && this.x()) {
         int $$14 = 0;
         if (this.cz.h) {
            $$14--;
         }

         if (this.cz.g) {
            $$14++;
         }

         if ($$14 != 0) {
            this.i(this.ds().b(0.0, (double)((float)$$14 * $$3.a() * 3.0F), 0.0));
         }
      }

      bty $$15 = this.q();
      if ($$15 != null && $$15.c() == 0) {
         if (this.de < 0) {
            this.de++;
            if (this.de == 0) {
               this.df = 0.0F;
            }
         }

         if ($$0 && !this.cz.g) {
            this.de = -10;
            $$15.b(ayo.d(this.v() * 100.0F));
            this.h();
         } else if (!$$0 && this.cz.g) {
            this.de = 0;
            this.df = 0.0F;
         } else if ($$0) {
            this.de++;
            if (this.de < 10) {
               this.df = (float)this.de * 0.1F;
            } else {
               this.df = 0.8F + 2.0F / (float)(this.de - 9) * 0.1F;
            }
         }
      } else {
         this.df = 0.0F;
      }

      super.m_();
      if (this.aF() && $$3.b && !this.cB.q.h()) {
         $$3.b = false;
         this.z();
      }
   }

   public dlr.a A() {
      return this.aw == null ? dlr.a.b : this.aw.a();
   }

   @Override
   protected void ee() {
      this.aQ++;
      if (this.aQ == 20) {
         this.a(bsr.c.a);
      }
   }

   private void x(boolean $$0) {
      this.cI = this.cH;
      float $$1 = 0.0F;
      if ($$0 && this.aw != null && this.aw.e()) {
         if (this.cB.y != null && !this.cB.y.k() && !(this.cB.y instanceof fnf) && !(this.cB.y instanceof foe)) {
            if (this.cB.y instanceof foq) {
               this.s();
            }

            this.cB.a(null);
         }

         if (this.cH == 0.0F) {
            this.cB.aj().a(gtt.b(avp.uJ, this.ah.i() * 0.4F + 0.8F, 0.25F));
         }

         $$1 = 0.0125F;
         this.aw.a(false);
      } else if (this.b(bsb.i) && !this.c(bsb.i).a(60)) {
         $$1 = 0.006666667F;
      } else if (this.cH > 0.0F) {
         $$1 = -0.05F;
      }

      this.cH = ayo.a(this.cH + $$1, 0.0F, 1.0F);
   }

   @Override
   public void u() {
      super.u();
      this.di = false;
      if (this.de() instanceof cov $$0) {
         $$0.a(this.cz.e, this.cz.f, this.cz.c, this.cz.d);
         this.di = this.di | (this.cz.e || this.cz.f || this.cz.c || this.cz.d);
      }
   }

   public boolean B() {
      return this.di;
   }

   @Nullable
   @Override
   public brz d(jm<brx> $$0) {
      if ($$0.a(bsb.i)) {
         this.cI = 0.0F;
         this.cH = 0.0F;
      }

      return super.d($$0);
   }

   @Override
   public void a(bts $$0, exa $$1) {
      double $$2 = this.du();
      double $$3 = this.dA();
      super.a($$0, $$1);
      this.g((float)(this.du() - $$2), (float)(this.dA() - $$3));
   }

   public boolean C() {
      return this.dj;
   }

   protected void g(float $$0, float $$1) {
      if (this.H()) {
         exa $$2 = this.dn();
         exa $$3 = $$2.b((double)$$0, 0.0, (double)$$1);
         exa $$4 = new exa((double)$$0, 0.0, (double)$$1);
         float $$5 = this.fk();
         float $$6 = (float)$$4.g();
         if ($$6 <= 0.001F) {
            ewz $$7 = this.cz.a();
            float $$8 = $$5 * $$7.i;
            float $$9 = $$5 * $$7.j;
            float $$10 = ayo.a(this.dF() * (float) (Math.PI / 180.0));
            float $$11 = ayo.b(this.dF() * (float) (Math.PI / 180.0));
            $$4 = new exa((double)($$8 * $$11 - $$9 * $$10), $$4.d, (double)($$9 * $$11 + $$8 * $$10));
            $$6 = (float)$$4.g();
            if ($$6 <= 0.001F) {
               return;
            }
         }

         float $$12 = ayo.i($$6);
         exa $$13 = $$4.a((double)$$12);
         exa $$14 = this.bO();
         float $$15 = (float)($$14.c * $$13.c + $$14.e * $$13.e);
         if (!($$15 < -0.15F)) {
            exf $$16 = exf.a(this);
            jd $$17 = jd.a(this.du(), this.cL().e, this.dA());
            dtc $$18 = this.dP().a_($$17);
            if ($$18.b(this.dP(), $$17, $$16).c()) {
               $$17 = $$17.d();
               dtc $$19 = this.dP().a_($$17);
               if ($$19.b(this.dP(), $$17, $$16).c()) {
                  float $$20 = 7.0F;
                  float $$21 = 1.2F;
                  if (this.b(bsb.h)) {
                     $$21 += (float)(this.c(bsb.h).e() + 1) * 0.75F;
                  }

                  float $$22 = Math.max($$5 * 7.0F, 1.0F / $$12);
                  exa $$24 = $$3.e($$13.a((double)$$22));
                  float $$25 = this.dk();
                  float $$26 = this.dl();
                  ewv $$27 = new ewv($$2, $$24.b(0.0, (double)$$26, 0.0)).c((double)$$25, 0.0, (double)$$25);
                  exa $$23 = $$2.b(0.0, 0.51F, 0.0);
                  $$24 = $$24.b(0.0, 0.51F, 0.0);
                  exa $$28 = $$13.c(new exa(0.0, 1.0, 0.0));
                  exa $$29 = $$28.a((double)($$25 * 0.5F));
                  exa $$30 = $$23.d($$29);
                  exa $$31 = $$24.d($$29);
                  exa $$32 = $$23.e($$29);
                  exa $$33 = $$24.e($$29);
                  Iterable<ext> $$34 = this.dP().d(this, $$27);
                  Iterator<ewv> $$35 = StreamSupport.stream($$34.spliterator(), false).flatMap($$0x -> $$0x.e().stream()).iterator();
                  float $$36 = Float.MIN_VALUE;

                  while ($$35.hasNext()) {
                     ewv $$37 = $$35.next();
                     if ($$37.a($$30, $$31) || $$37.a($$32, $$33)) {
                        $$36 = (float)$$37.e;
                        exa $$38 = $$37.f();
                        jd $$39 = jd.a((jw)$$38);

                        for (int $$40 = 1; (float)$$40 < $$21; $$40++) {
                           jd $$41 = $$39.b($$40);
                           dtc $$42 = this.dP().a_($$41);
                           ext $$43;
                           if (!($$43 = $$42.b(this.dP(), $$41, $$16)).c()) {
                              $$36 = (float)$$43.c(ji.a.b) + (float)$$41.v();
                              if ((double)$$36 - this.dw() > (double)$$21) {
                                 return;
                              }
                           }

                           if ($$40 > 1) {
                              $$17 = $$17.d();
                              dtc $$44 = this.dP().a_($$17);
                              if (!$$44.b(this.dP(), $$17, $$16).c()) {
                                 return;
                              }
                           }
                        }
                        break;
                     }
                  }

                  if ($$36 != Float.MIN_VALUE) {
                     float $$45 = (float)((double)$$36 - this.dw());
                     if (!($$45 <= 0.5F) && !($$45 > $$21)) {
                        this.dk = 1;
                     }
                  }
               }
            }
         }
      }
   }

   @Override
   protected boolean d(exa $$0) {
      float $$1 = this.dF() * (float) (Math.PI / 180.0);
      double $$2 = (double)ayo.a($$1);
      double $$3 = (double)ayo.b($$1);
      double $$4 = (double)this.bo * $$3 - (double)this.bq * $$2;
      double $$5 = (double)this.bq * $$3 + (double)this.bo * $$2;
      double $$6 = ayo.k($$4) + ayo.k($$5);
      double $$7 = ayo.k($$0.c) + ayo.k($$0.e);
      if (!($$6 < 1.0E-5F) && !($$7 < 1.0E-5F)) {
         double $$8 = $$4 * $$0.c + $$5 * $$0.e;
         double $$9 = Math.acos($$8 / Math.sqrt($$6 * $$7));
         return $$9 < 0.13962634F;
      } else {
         return false;
      }
   }

   private boolean H() {
      return this.C() && this.dk <= 0 && this.aF() && !this.fQ() && !this.bS() && this.I() && (double)this.aN() >= 1.0;
   }

   private boolean I() {
      ewz $$0 = this.cz.a();
      return $$0.i != 0.0F || $$0.j != 0.0F;
   }

   private boolean J() {
      return !this.cc() && this.L() && this.N() && !this.fs() && !this.b(bsb.o) && (!this.bS() || this.d(this.dd())) && !this.fB();
   }

   private boolean d(bsr $$0) {
      return $$0.dI() && $$0.db();
   }

   private boolean L() {
      double $$0 = 0.8;
      return this.bk() ? this.cz.b() : (double)this.cz.b >= 0.8;
   }

   private boolean N() {
      return this.bS() || (float)this.gj().a() > 6.0F || this.ga().c;
   }

   public float D() {
      if (!this.a(awk.a)) {
         return 0.0F;
      } else {
         float $$0 = 600.0F;
         float $$1 = 100.0F;
         if ((float)this.dm >= 600.0F) {
            return 1.0F;
         } else {
            float $$2 = ayo.a((float)this.dm / 100.0F, 0.0F, 1.0F);
            float $$3 = (float)this.dm < 100.0F ? 0.0F : ayo.a(((float)this.dm - 100.0F) / 500.0F, 0.0F, 1.0F);
            return $$2 * 0.6F + $$3 * 0.39999998F;
         }
      }
   }

   public void a(dct $$0) {
      if ($$0 == dct.d) {
         this.i(this.ds().a(ji.a.b, 0.0));
      }
   }

   @Override
   public boolean bk() {
      return this.cp;
   }

   @Override
   protected boolean fR() {
      boolean $$0 = this.cp;
      boolean $$1 = super.fR();
      if (this.R_()) {
         return this.cp;
      } else {
         if (!$$0 && $$1) {
            this.dP().a(this.du(), this.dw(), this.dA(), avp.x, avq.i, 1.0F, 1.0F, false);
            this.cB.aj().a((gty)(new gub.b(this)));
         }

         if ($$0 && !$$1) {
            this.dP().a(this.du(), this.dw(), this.dA(), avp.y, avq.i, 1.0F, 1.0F, false);
         }

         return this.cp;
      }
   }

   @Override
   public exa s(float $$0) {
      if (this.cB.m.aA().a()) {
         float $$1 = ayo.i($$0 * 0.5F, this.dF(), this.O) * (float) (Math.PI / 180.0);
         float $$2 = ayo.i($$0 * 0.5F, this.dH(), this.P) * (float) (Math.PI / 180.0);
         double $$3 = this.fr() == btg.b ? -1.0 : 1.0;
         exa $$4 = new exa(0.39 * $$3, -0.6, 0.3);
         return $$4.a(-$$2).b(-$$1).e(this.k($$0));
      } else {
         return super.s($$0);
      }
   }

   @Override
   public void a(cuq $$0, cuq $$1, cqd $$2) {
      this.cB.ax().a($$0, $$1, $$2);
   }

   @Override
   public float dG() {
      return this.dF();
   }
}
