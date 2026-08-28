import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gdv extends gds {
   public static final Logger g = LogUtils.getLogger();
   private static final int cK = 20;
   private static final int cL = 600;
   private static final int cM = 100;
   private static final float cN = 0.6F;
   private static final double cO = 0.35;
   private static final double cP = 0.13962634F;
   public final fza h;
   private final avz cQ;
   private final ffu cR;
   private final List<gtd> cS = Lists.newArrayList();
   private int cT = 0;
   private double cU;
   private double cV;
   private double cW;
   private float cX;
   private float cY;
   private boolean cZ;
   private boolean da;
   private boolean db;
   private boolean dc;
   private int dd;
   private boolean de;
   public gdt cB;
   protected final fgi cC;
   protected int cD;
   public float cE;
   public float cF;
   public float cG;
   public float cH;
   private int df;
   private float dg;
   public float cI;
   public float cJ;
   private boolean dh;
   @Nullable
   private bqp di;
   private boolean dj;
   private boolean dk = true;
   private int dl;
   private boolean dm;
   private int dn;
   private boolean do = true;
   private boolean dp = false;

   public gdv(fgi $$0, fyz $$1, fza $$2, avz $$3, ffu $$4, boolean $$5, boolean $$6) {
      super($$1, $$2.o());
      this.cC = $$0;
      this.h = $$2;
      this.cQ = $$3;
      this.cR = $$4;
      this.db = $$5;
      this.dc = $$6;
      this.cS.add(new gtv(this, $$0.aj()));
      this.cS.add(new gti(this));
      this.cS.add(new gth(this, $$0.aj(), $$1.F_()));
   }

   @Override
   public boolean a(brj $$0, float $$1) {
      return false;
   }

   @Override
   public void c(float $$0) {
   }

   @Override
   public boolean a(bsq $$0, boolean $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         if ($$0 instanceof cor) {
            this.cC.aj().a((gtt)(new gtn(this, (cor)$$0, true)));
            this.cC.aj().a((gtt)(new gtn(this, (cor)$$0, false)));
         }

         return true;
      }
   }

   @Override
   public void bJ() {
      super.bJ();
      this.dj = false;
   }

   @Override
   public float h(float $$0) {
      return this.dI();
   }

   @Override
   public float i(float $$0) {
      return this.bS() ? super.i($$0) : this.dG();
   }

   @Override
   public void l() {
      if (this.dQ().f(this.du(), this.dA())) {
         super.l();
         if (this.bS()) {
            this.h.b(new ahf.c(this.dG(), this.dI(), this.aF()));
            this.h.b(new ahn(this.bo, this.bq, this.cB.g, this.cB.h));
            bsq $$0 = this.da();
            if ($$0 != this && $$0.db()) {
               this.h.b(new ahg($$0));
               this.H();
            }
         } else {
            this.F();
         }

         for (gtd $$1 : this.cS) {
            $$1.a();
         }
      }
   }

   public float d() {
      for (gtd $$0 : this.cS) {
         if ($$0 instanceof gth) {
            return ((gth)$$0).b();
         }
      }

      return 0.0F;
   }

   private void F() {
      this.H();
      boolean $$0 = this.bW();
      if ($$0 != this.db) {
         ahm.a $$1 = $$0 ? ahm.a.a : ahm.a.b;
         this.h.b(new ahm(this, $$1));
         this.db = $$0;
      }

      if (this.x()) {
         double $$2 = this.dv() - this.cU;
         double $$3 = this.dx() - this.cV;
         double $$4 = this.dB() - this.cW;
         double $$5 = (double)(this.dG() - this.cX);
         double $$6 = (double)(this.dI() - this.cY);
         this.dd++;
         boolean $$7 = ayn.f($$2, $$3, $$4) > ayn.k(2.0E-4) || this.dd >= 20;
         boolean $$8 = $$5 != 0.0 || $$6 != 0.0;
         if (this.bS()) {
            eww $$9 = this.dt();
            this.h.b(new ahf.b($$9.c, -999.0, $$9.e, this.dG(), this.dI(), this.aF()));
            $$7 = false;
         } else if ($$7 && $$8) {
            this.h.b(new ahf.b(this.dv(), this.dx(), this.dB(), this.dG(), this.dI(), this.aF()));
         } else if ($$7) {
            this.h.b(new ahf.a(this.dv(), this.dx(), this.dB(), this.aF()));
         } else if ($$8) {
            this.h.b(new ahf.c(this.dG(), this.dI(), this.aF()));
         } else if (this.cZ != this.aF()) {
            this.h.b(new ahf.d(this.aF()));
         }

         if ($$7) {
            this.cU = this.dv();
            this.cV = this.dx();
            this.cW = this.dB();
            this.dd = 0;
         }

         if ($$8) {
            this.cX = this.dG();
            this.cY = this.dI();
         }

         this.cZ = this.aF();
         this.dk = this.cC.m.H().c();
      }
   }

   private void H() {
      boolean $$0 = this.cc();
      if ($$0 != this.dc) {
         ahm.a $$1 = $$0 ? ahm.a.d : ahm.a.e;
         this.h.b(new ahm(this, $$1));
         this.dc = $$0;
      }
   }

   public boolean a(boolean $$0) {
      ahl.a $$1 = $$0 ? ahl.a.d : ahl.a.e;
      cuo $$2 = this.fZ().a($$0);
      this.h.b(new ahl($$1, jd.c, ji.a));
      return !$$2.e();
   }

   @Override
   public void a(bqp $$0) {
      super.a($$0);
      this.h.b(new aib($$0));
   }

   @Override
   public void fX() {
      this.h.b(new ags(ags.a.a));
      fgg.c();
   }

   @Override
   protected void f(brj $$0, float $$1) {
      if (!this.b($$0)) {
         this.u(this.ex() - $$1);
      }
   }

   @Override
   public void s() {
      this.h.b(new agx(this.cd.j));
      this.e();
   }

   public void e() {
      super.s();
      this.cC.a(null);
   }

   public void G(float $$0) {
      if (this.de) {
         float $$1 = this.ex() - $$0;
         if ($$1 <= 0.0F) {
            this.u($$0);
            if ($$1 < 0.0F) {
               this.am = 10;
            }
         } else {
            this.bm = $$1;
            this.am = 20;
            this.u($$0);
            this.aP = 10;
            this.aO = this.aP;
         }
      } else {
         this.u($$0);
         this.de = true;
      }
   }

   @Override
   public void z() {
      this.h.b(new ahk(this.ga()));
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
      this.h.b(new ahm(this, ahm.a.f, ayn.d(this.v() * 100.0F)));
   }

   public void i() {
      this.h.b(new ahm(this, ahm.a.h));
   }

   public avz j() {
      return this.cQ;
   }

   public ffu m() {
      return this.cR;
   }

   public void a(cyz<?> $$0) {
      if (this.cR.d($$0)) {
         this.cR.e($$0);
         this.h.b(new ahp($$0));
      }
   }

   @Override
   protected int G() {
      return this.cT;
   }

   public void a(int $$0) {
      this.cT = $$0;
   }

   @Override
   public void a(wy $$0, boolean $$1) {
      this.cC.aW().a($$0, $$1);
   }

   private void c(double $$0, double $$1) {
      jd $$2 = jd.a($$0, this.dx(), $$1);
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
            eww $$11 = this.dt();
            if ($$5.o() == ji.a.a) {
               this.n(0.1 * (double)$$5.j(), $$11.d, $$11.e);
            } else {
               this.n($$11.c, $$11.d, 0.1 * (double)$$5.l());
            }
         }
      }
   }

   private boolean c(jd $$0) {
      ewr $$1 = this.cL();
      ewr $$2 = new ewr((double)$$0.u(), $$1.b, (double)$$0.w(), (double)$$0.u() + 1.0, $$1.e, (double)$$0.w() + 1.0).h(1.0E-7);
      return this.dQ().f(this, $$2);
   }

   public void a(float $$0, int $$1, int $$2) {
      this.cs = $$0;
      this.cr = $$1;
      this.cq = $$2;
   }

   @Override
   public void a(wy $$0) {
      this.cC.l.d().a($$0);
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
      this.do = $$0;
   }

   public boolean o() {
      return this.do;
   }

   public void c(boolean $$0) {
      this.dp = $$0;
   }

   public boolean p() {
      return this.dp;
   }

   @Override
   public void a(avn $$0, float $$1, float $$2) {
      this.dQ().a(this.dv(), this.dx(), this.dB(), $$0, this.df(), $$1, $$2, false);
   }

   @Override
   public void a(avn $$0, avp $$1, float $$2, float $$3) {
      this.dQ().a(this.dv(), this.dx(), this.dB(), $$0, $$1, $$2, $$3, false);
   }

   @Override
   public boolean dc() {
      return true;
   }

   @Override
   public void c(bqp $$0) {
      cuo $$1 = this.b($$0);
      if (!$$1.e() && !this.fs()) {
         super.c($$0);
         this.dh = true;
         this.di = $$0;
      }
   }

   @Override
   public boolean fs() {
      return this.dh;
   }

   @Override
   public void fy() {
      super.fy();
      this.dh = false;
   }

   @Override
   public bqp ft() {
      return Objects.requireNonNullElse(this.di, bqp.a);
   }

   @Override
   public void a(ajv<?> $$0) {
      super.a($$0);
      if (aE.equals($$0)) {
         boolean $$1 = (this.ao.a(aE) & 1) > 0;
         bqp $$2 = (this.ao.a(aE) & 2) > 0 ? bqp.b : bqp.a;
         if ($$1 && !this.dh) {
            this.c($$2);
         } else if (!$$1 && this.dh) {
            this.fy();
         }
      }

      if (ap.equals($$0) && this.fB() && !this.dm) {
         this.cC.aj().a((gtt)(new gtj(this)));
      }
   }

   @Nullable
   public btw q() {
      if (this.de() instanceof btw $$0 && $$0.a()) {
         return $$0;
      }

      return null;
   }

   public float v() {
      return this.dg;
   }

   @Override
   public boolean Z() {
      return this.cC.aQ();
   }

   @Override
   public void a(drq $$0, boolean $$1) {
      if ($$0 instanceof drd $$2) {
         this.cC.a(new fpk($$2, $$1, this.cC.aQ()));
      } else {
         this.cC.a(new fpx($$0, $$1, this.cC.aQ()));
      }
   }

   @Override
   public void a(dbv $$0) {
      this.cC.a(new fpu($$0));
   }

   @Override
   public void a(dqp $$0) {
      this.cC.a(new fox($$0));
   }

   @Override
   public void a(drv $$0) {
      this.cC.a(new fqb($$0));
   }

   @Override
   public void a(drg $$0) {
      this.cC.a(new fpp($$0));
   }

   @Override
   public void a(cuo $$0, bqp $$1) {
      if ($$0.a(cur.tZ)) {
         this.cC.a(new fot(this, $$0, $$1));
      }
   }

   @Override
   public void b(bsq $$0) {
      this.cC.g.a($$0, lm.f);
   }

   @Override
   public void c(bsq $$0) {
      this.cC.g.a($$0, lm.r);
   }

   @Override
   public boolean bW() {
      return this.cB != null && this.cB.h;
   }

   @Override
   public boolean cb() {
      return this.da;
   }

   @Override
   public boolean w() {
      return this.cb() || this.cf();
   }

   @Override
   public void fn() {
      super.fn();
      if (this.x()) {
         this.bo = this.cB.a;
         this.bq = this.cB.b;
         this.bn = this.cB.g;
         this.cG = this.cE;
         this.cH = this.cF;
         this.cF = this.cF + (this.dI() - this.cF) * 0.5F;
         this.cE = this.cE + (this.dG() - this.cE) * 0.5F;
      }
   }

   protected boolean x() {
      return this.cC.an() == this;
   }

   @Override
   public void A() {
      this.b(bty.a);
      if (this.dQ() != null) {
         for (double $$0 = this.dx(); $$0 > (double)this.dQ().I_() && $$0 < (double)this.dQ().am(); $$0++) {
            this.a_(this.dv(), $$0, this.dB());
            if (this.dQ().g(this)) {
               break;
            }
         }

         this.i(eww.b);
         this.t(0.0F);
      }

      this.u(this.eO());
      this.aQ = 0;
   }

   @Override
   public void m_() {
      if (this.cD > 0) {
         this.cD--;
      }

      if (!(this.cC.y instanceof fnv)) {
         this.w(this.B() == dlp.a.a);
         this.M();
      }

      boolean $$0 = this.cB.g;
      boolean $$1 = this.cB.h;
      boolean $$2 = this.N();
      cms $$3 = this.ga();
      this.da = !$$3.b && !this.cd() && !this.bS() && this.h(bty.f) && (this.bW() || !this.fI() && !this.h(bty.a));
      float $$4 = (float)this.g(buu.z);
      this.cB.a(this.w(), $$4);
      this.cC.ax().a(this.cB);
      if (this.fs() && !this.bS()) {
         this.cB.a *= 0.2F;
         this.cB.b *= 0.2F;
         this.cD = 0;
      }

      boolean $$5 = false;
      if (this.dl > 0) {
         this.dl--;
         $$5 = true;
         this.cB.g = true;
      }

      if (!this.ag) {
         this.c(this.dv() - (double)this.dk() * 0.35, this.dB() + (double)this.dk() * 0.35);
         this.c(this.dv() - (double)this.dk() * 0.35, this.dB() - (double)this.dk() * 0.35);
         this.c(this.dv() + (double)this.dk() * 0.35, this.dB() - (double)this.dk() * 0.35);
         this.c(this.dv() + (double)this.dk() * 0.35, this.dB() + (double)this.dk() * 0.35);
      }

      if ($$1) {
         this.cD = 0;
      }

      boolean $$6 = this.L();
      boolean $$7 = this.bS() ? this.dd().aF() : this.aF();
      boolean $$8 = !$$1 && !$$2;
      if (($$7 || this.bk()) && $$8 && $$6) {
         if (this.cD <= 0 && !this.cC.m.C.e()) {
            this.cD = 7;
         } else {
            this.i(true);
         }
      }

      if ((!this.bf() || this.bk()) && $$6 && this.cC.m.C.e()) {
         this.i(true);
      }

      if (this.cc()) {
         boolean $$9 = !this.cB.b() || !this.O();
         boolean $$10 = $$9 || this.Q && !this.T || this.bf() && !this.bk();
         if (this.cd()) {
            if (!this.aF() && !this.cB.h && $$9 || !this.bf()) {
               this.i(false);
            }
         } else if ($$10) {
            this.i(false);
         }
      }

      boolean $$11 = false;
      if ($$3.c) {
         if (this.cC.q.h()) {
            if (!$$3.b) {
               $$3.b = true;
               $$11 = true;
               this.z();
            }
         } else if (!$$0 && this.cB.g && !$$5) {
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

      if (this.cB.g && !$$11 && !$$0 && !$$3.b && !this.bS() && !this.p_()) {
         cuo $$12 = this.a(bsx.e);
         if ($$12.a(cur.nT) && ctk.i($$12) && this.ge()) {
            this.h.b(new ahm(this, ahm.a.i));
         }
      }

      this.dm = this.fB();
      if (this.bf() && this.cB.h && this.ed()) {
         this.fh();
      }

      if (this.a(awj.a)) {
         int $$13 = this.N_() ? 10 : 1;
         this.dn = ayn.a(this.dn + $$13, 0, 600);
      } else if (this.dn > 0) {
         this.a(awj.a);
         this.dn = ayn.a(this.dn - 10, 0, 600);
      }

      if ($$3.b && this.x()) {
         int $$14 = 0;
         if (this.cB.h) {
            $$14--;
         }

         if (this.cB.g) {
            $$14++;
         }

         if ($$14 != 0) {
            this.i(this.dt().b(0.0, (double)((float)$$14 * $$3.a() * 3.0F), 0.0));
         }
      }

      btw $$15 = this.q();
      if ($$15 != null && $$15.c() == 0) {
         if (this.df < 0) {
            this.df++;
            if (this.df == 0) {
               this.dg = 0.0F;
            }
         }

         if ($$0 && !this.cB.g) {
            this.df = -10;
            $$15.b(ayn.d(this.v() * 100.0F));
            this.h();
         } else if (!$$0 && this.cB.g) {
            this.df = 0;
            this.dg = 0.0F;
         } else if ($$0) {
            this.df++;
            if (this.df < 10) {
               this.dg = (float)this.df * 0.1F;
            } else {
               this.dg = 0.8F + 2.0F / (float)(this.df - 9) * 0.1F;
            }
         }
      } else {
         this.dg = 0.0F;
      }

      super.m_();
      if (this.aF() && $$3.b && !this.cC.q.h()) {
         $$3.b = false;
         this.z();
      }
   }

   public dlp.a B() {
      return this.aw == null ? dlp.a.b : this.aw.a();
   }

   @Override
   protected void ee() {
      this.aQ++;
      if (this.aQ == 20) {
         this.a(bsq.c.a);
      }
   }

   private void w(boolean $$0) {
      this.cJ = this.cI;
      float $$1 = 0.0F;
      if ($$0 && this.aw != null && this.aw.e()) {
         if (this.cC.y != null && !this.cC.y.k() && !(this.cC.y instanceof fnb) && !(this.cC.y instanceof foa)) {
            if (this.cC.y instanceof fom) {
               this.s();
            }

            this.cC.a(null);
         }

         if (this.cI == 0.0F) {
            this.cC.aj().a(gto.b(avo.uJ, this.ah.i() * 0.4F + 0.8F, 0.25F));
         }

         $$1 = 0.0125F;
         this.aw.a(false);
      } else if (this.b(bsa.i) && !this.c(bsa.i).a(60)) {
         $$1 = 0.006666667F;
      } else if (this.cI > 0.0F) {
         $$1 = -0.05F;
      }

      this.cI = ayn.a(this.cI + $$1, 0.0F, 1.0F);
   }

   @Override
   public void u() {
      super.u();
      this.dj = false;
      if (this.de() instanceof cot $$0) {
         $$0.a(this.cB.e, this.cB.f, this.cB.c, this.cB.d);
         this.dj = this.dj | (this.cB.e || this.cB.f || this.cB.c || this.cB.d);
      }
   }

   public boolean C() {
      return this.dj;
   }

   @Nullable
   @Override
   public bry d(jm<brw> $$0) {
      if ($$0.a(bsa.i)) {
         this.cJ = 0.0F;
         this.cI = 0.0F;
      }

      return super.d($$0);
   }

   @Override
   public void a(btq $$0, eww $$1) {
      double $$2 = this.dv();
      double $$3 = this.dB();
      super.a($$0, $$1);
      this.g((float)(this.dv() - $$2), (float)(this.dB() - $$3));
   }

   public boolean D() {
      return this.dk;
   }

   protected void g(float $$0, float $$1) {
      if (this.I()) {
         eww $$2 = this.do();
         eww $$3 = $$2.b((double)$$0, 0.0, (double)$$1);
         eww $$4 = new eww((double)$$0, 0.0, (double)$$1);
         float $$5 = this.fk();
         float $$6 = (float)$$4.g();
         if ($$6 <= 0.001F) {
            ewv $$7 = this.cB.a();
            float $$8 = $$5 * $$7.i;
            float $$9 = $$5 * $$7.j;
            float $$10 = ayn.a(this.dG() * (float) (Math.PI / 180.0));
            float $$11 = ayn.b(this.dG() * (float) (Math.PI / 180.0));
            $$4 = new eww((double)($$8 * $$11 - $$9 * $$10), $$4.d, (double)($$9 * $$11 + $$8 * $$10));
            $$6 = (float)$$4.g();
            if ($$6 <= 0.001F) {
               return;
            }
         }

         float $$12 = ayn.i($$6);
         eww $$13 = $$4.a((double)$$12);
         eww $$14 = this.bO();
         float $$15 = (float)($$14.c * $$13.c + $$14.e * $$13.e);
         if (!($$15 < -0.15F)) {
            exb $$16 = exb.a(this);
            jd $$17 = jd.a(this.dv(), this.cL().e, this.dB());
            dta $$18 = this.dQ().a_($$17);
            if ($$18.b(this.dQ(), $$17, $$16).c()) {
               $$17 = $$17.c();
               dta $$19 = this.dQ().a_($$17);
               if ($$19.b(this.dQ(), $$17, $$16).c()) {
                  float $$20 = 7.0F;
                  float $$21 = 1.2F;
                  if (this.b(bsa.h)) {
                     $$21 += (float)(this.c(bsa.h).e() + 1) * 0.75F;
                  }

                  float $$22 = Math.max($$5 * 7.0F, 1.0F / $$12);
                  eww $$24 = $$3.e($$13.a((double)$$22));
                  float $$25 = this.dk();
                  float $$26 = this.dl();
                  ewr $$27 = new ewr($$2, $$24.b(0.0, (double)$$26, 0.0)).c((double)$$25, 0.0, (double)$$25);
                  eww $$23 = $$2.b(0.0, 0.51F, 0.0);
                  $$24 = $$24.b(0.0, 0.51F, 0.0);
                  eww $$28 = $$13.c(new eww(0.0, 1.0, 0.0));
                  eww $$29 = $$28.a((double)($$25 * 0.5F));
                  eww $$30 = $$23.d($$29);
                  eww $$31 = $$24.d($$29);
                  eww $$32 = $$23.e($$29);
                  eww $$33 = $$24.e($$29);
                  Iterable<exp> $$34 = this.dQ().d(this, $$27);
                  Iterator<ewr> $$35 = StreamSupport.stream($$34.spliterator(), false).flatMap($$0x -> $$0x.e().stream()).iterator();
                  float $$36 = Float.MIN_VALUE;

                  while ($$35.hasNext()) {
                     ewr $$37 = $$35.next();
                     if ($$37.a($$30, $$31) || $$37.a($$32, $$33)) {
                        $$36 = (float)$$37.e;
                        eww $$38 = $$37.f();
                        jd $$39 = jd.a((jw)$$38);

                        for (int $$40 = 1; (float)$$40 < $$21; $$40++) {
                           jd $$41 = $$39.b($$40);
                           dta $$42 = this.dQ().a_($$41);
                           exp $$43;
                           if (!($$43 = $$42.b(this.dQ(), $$41, $$16)).c()) {
                              $$36 = (float)$$43.c(ji.a.b) + (float)$$41.v();
                              if ((double)$$36 - this.dx() > (double)$$21) {
                                 return;
                              }
                           }

                           if ($$40 > 1) {
                              $$17 = $$17.c();
                              dta $$44 = this.dQ().a_($$17);
                              if (!$$44.b(this.dQ(), $$17, $$16).c()) {
                                 return;
                              }
                           }
                        }
                        break;
                     }
                  }

                  if ($$36 != Float.MIN_VALUE) {
                     float $$45 = (float)((double)$$36 - this.dx());
                     if (!($$45 <= 0.5F) && !($$45 > $$21)) {
                        this.dl = 1;
                     }
                  }
               }
            }
         }
      }
   }

   @Override
   protected boolean d(eww $$0) {
      float $$1 = this.dG() * (float) (Math.PI / 180.0);
      double $$2 = (double)ayn.a($$1);
      double $$3 = (double)ayn.b($$1);
      double $$4 = (double)this.bo * $$3 - (double)this.bq * $$2;
      double $$5 = (double)this.bq * $$3 + (double)this.bo * $$2;
      double $$6 = ayn.k($$4) + ayn.k($$5);
      double $$7 = ayn.k($$0.c) + ayn.k($$0.e);
      if (!($$6 < 1.0E-5F) && !($$7 < 1.0E-5F)) {
         double $$8 = $$4 * $$0.c + $$5 * $$0.e;
         double $$9 = Math.acos($$8 / Math.sqrt($$6 * $$7));
         return $$9 < 0.13962634F;
      } else {
         return false;
      }
   }

   private boolean I() {
      return this.D() && this.dl <= 0 && this.aF() && !this.fQ() && !this.bS() && this.J() && (double)this.aN() >= 1.0;
   }

   private boolean J() {
      ewv $$0 = this.cB.a();
      return $$0.i != 0.0F || $$0.j != 0.0F;
   }

   private boolean L() {
      return !this.cc() && this.N() && this.O() && !this.fs() && !this.b(bsa.o) && (!this.bS() || this.d(this.dd())) && !this.fB();
   }

   private boolean d(bsq $$0) {
      return $$0.dJ() && $$0.db();
   }

   private boolean N() {
      double $$0 = 0.8;
      return this.bk() ? this.cB.b() : (double)this.cB.b >= 0.8;
   }

   private boolean O() {
      return this.bS() || (float)this.gj().a() > 6.0F || this.ga().c;
   }

   public float E() {
      if (!this.a(awj.a)) {
         return 0.0F;
      } else {
         float $$0 = 600.0F;
         float $$1 = 100.0F;
         if ((float)this.dn >= 600.0F) {
            return 1.0F;
         } else {
            float $$2 = ayn.a((float)this.dn / 100.0F, 0.0F, 1.0F);
            float $$3 = (float)this.dn < 100.0F ? 0.0F : ayn.a(((float)this.dn - 100.0F) / 500.0F, 0.0F, 1.0F);
            return $$2 * 0.6F + $$3 * 0.39999998F;
         }
      }
   }

   public void a(dcr $$0) {
      if ($$0 == dcr.d) {
         this.i(this.dt().a(ji.a.b, 0.0));
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
      if (this.N_()) {
         return this.cp;
      } else {
         if (!$$0 && $$1) {
            this.dQ().a(this.dv(), this.dx(), this.dB(), avo.x, avp.i, 1.0F, 1.0F, false);
            this.cC.aj().a((gtt)(new gtw.b(this)));
         }

         if ($$0 && !$$1) {
            this.dQ().a(this.dv(), this.dx(), this.dB(), avo.y, avp.i, 1.0F, 1.0F, false);
         }

         return this.cp;
      }
   }

   @Override
   public eww r(float $$0) {
      if (this.cC.m.aA().a()) {
         float $$1 = ayn.i($$0 * 0.5F, this.dG(), this.O) * (float) (Math.PI / 180.0);
         float $$2 = ayn.i($$0 * 0.5F, this.dI(), this.P) * (float) (Math.PI / 180.0);
         double $$3 = this.fr() == btf.b ? -1.0 : 1.0;
         eww $$4 = new eww(0.39 * $$3, -0.6, 0.3);
         return $$4.a(-$$2).b(-$$1).e(this.k($$0));
      } else {
         return super.r($$0);
      }
   }

   @Override
   public void a(cuo $$0, cuo $$1, cqb $$2) {
      this.cC.ax().a($$0, $$1, $$2);
   }

   @Override
   public float dH() {
      return this.dG();
   }
}
