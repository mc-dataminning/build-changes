import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gdf extends gdc {
   public static final Logger g = LogUtils.getLogger();
   private static final int cL = 20;
   private static final int cM = 600;
   private static final int cN = 100;
   private static final float cO = 0.6F;
   private static final double cP = 0.35;
   private static final double cQ = 0.13962634F;
   public final fyk cB;
   private final avs cR;
   private final ffg cS;
   private final List<gsm> cT = Lists.newArrayList();
   private int cU = 0;
   private double cV;
   private double cW;
   private double cX;
   private float cY;
   private float cZ;
   private boolean da;
   private boolean db;
   private boolean dc;
   private boolean dd;
   private int de;
   private boolean df;
   public gdd cC;
   protected final fft cD;
   protected int cE;
   public float cF;
   public float cG;
   public float cH;
   public float cI;
   private int dg;
   private float dh;
   public float cJ;
   public float cK;
   private boolean di;
   @Nullable
   private bqf dj;
   private boolean dk;
   private boolean dl = true;
   private int dm;
   private boolean dn;
   private int do;
   private boolean dp = true;
   private boolean dq = false;

   public gdf(fft $$0, fyj $$1, fyk $$2, avs $$3, ffg $$4, boolean $$5, boolean $$6) {
      super($$1, $$2.o());
      this.cD = $$0;
      this.cB = $$2;
      this.cR = $$3;
      this.cS = $$4;
      this.dc = $$5;
      this.dd = $$6;
      this.cT.add(new gte(this, $$0.aj()));
      this.cT.add(new gsr(this));
      this.cT.add(new gsq(this, $$0.aj(), $$1.F_()));
   }

   @Override
   public boolean a(bqz $$0, float $$1) {
      return false;
   }

   @Override
   public void c(float $$0) {
   }

   @Override
   public boolean a(bsg $$0, boolean $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         if ($$0 instanceof cof) {
            this.cD.aj().a((gtc)(new gsw(this, (cof)$$0, true)));
            this.cD.aj().a((gtc)(new gsw(this, (cof)$$0, false)));
         }

         return true;
      }
   }

   @Override
   public void bJ() {
      super.bJ();
      this.dk = false;
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
            this.cB.b(new agz.c(this.dG(), this.dI(), this.aF()));
            this.cB.b(new ahh(this.bo, this.bq, this.cC.g, this.cC.h));
            bsg $$0 = this.da();
            if ($$0 != this && $$0.db()) {
               this.cB.b(new aha($$0));
               this.G();
            }
         } else {
            this.E();
         }

         for (gsm $$1 : this.cT) {
            $$1.a();
         }
      }
   }

   public float d() {
      for (gsm $$0 : this.cT) {
         if ($$0 instanceof gsq) {
            return ((gsq)$$0).b();
         }
      }

      return 0.0F;
   }

   private void E() {
      this.G();
      boolean $$0 = this.bW();
      if ($$0 != this.dc) {
         ahg.a $$1 = $$0 ? ahg.a.a : ahg.a.b;
         this.cB.b(new ahg(this, $$1));
         this.dc = $$0;
      }

      if (this.z()) {
         double $$2 = this.dv() - this.cV;
         double $$3 = this.dx() - this.cW;
         double $$4 = this.dB() - this.cX;
         double $$5 = (double)(this.dG() - this.cY);
         double $$6 = (double)(this.dI() - this.cZ);
         this.de++;
         boolean $$7 = ayg.f($$2, $$3, $$4) > ayg.k(2.0E-4) || this.de >= 20;
         boolean $$8 = $$5 != 0.0 || $$6 != 0.0;
         if (this.bS()) {
            ewf $$9 = this.dt();
            this.cB.b(new agz.b($$9.c, -999.0, $$9.e, this.dG(), this.dI(), this.aF()));
            $$7 = false;
         } else if ($$7 && $$8) {
            this.cB.b(new agz.b(this.dv(), this.dx(), this.dB(), this.dG(), this.dI(), this.aF()));
         } else if ($$7) {
            this.cB.b(new agz.a(this.dv(), this.dx(), this.dB(), this.aF()));
         } else if ($$8) {
            this.cB.b(new agz.c(this.dG(), this.dI(), this.aF()));
         } else if (this.da != this.aF()) {
            this.cB.b(new agz.d(this.aF()));
         }

         if ($$7) {
            this.cV = this.dv();
            this.cW = this.dx();
            this.cX = this.dB();
            this.de = 0;
         }

         if ($$8) {
            this.cY = this.dG();
            this.cZ = this.dI();
         }

         this.da = this.aF();
         this.dl = this.cD.m.H().c();
      }
   }

   private void G() {
      boolean $$0 = this.cc();
      if ($$0 != this.dd) {
         ahg.a $$1 = $$0 ? ahg.a.d : ahg.a.e;
         this.cB.b(new ahg(this, $$1));
         this.dd = $$0;
      }
   }

   public boolean a(boolean $$0) {
      ahf.a $$1 = $$0 ? ahf.a.d : ahf.a.e;
      cuc $$2 = this.fZ().a($$0);
      this.cB.b(new ahf($$1, ja.c, jf.a));
      return !$$2.e();
   }

   @Override
   public void a(bqf $$0) {
      super.a($$0);
      this.cB.b(new ahv($$0));
   }

   @Override
   public void fX() {
      this.cB.b(new agm(agm.a.a));
      ffr.c();
   }

   @Override
   protected void f(bqz $$0, float $$1) {
      if (!this.b($$0)) {
         this.u(this.ex() - $$1);
      }
   }

   @Override
   public void r() {
      this.cB.b(new agr(this.cd.j));
      this.e();
   }

   public void e() {
      super.r();
      this.cD.a(null);
   }

   public void G(float $$0) {
      if (this.df) {
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
         this.df = true;
      }
   }

   @Override
   public void y() {
      this.cB.b(new ahe(this.ga()));
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
      this.cB.b(new ahg(this, ahg.a.f, ayg.d(this.v() * 100.0F)));
   }

   public void i() {
      this.cB.b(new ahg(this, ahg.a.h));
   }

   public avs j() {
      return this.cR;
   }

   public ffg m() {
      return this.cS;
   }

   public void a(cyk<?> $$0) {
      if (this.cS.d($$0)) {
         this.cS.e($$0);
         this.cB.b(new ahj($$0));
      }
   }

   @Override
   protected int F() {
      return this.cU;
   }

   public void a(int $$0) {
      this.cU = $$0;
   }

   @Override
   public void a(wu $$0, boolean $$1) {
      this.cD.aY().a($$0, $$1);
   }

   private void c(double $$0, double $$1) {
      ja $$2 = ja.a($$0, this.dx(), $$1);
      if (this.c($$2)) {
         double $$3 = $$0 - (double)$$2.u();
         double $$4 = $$1 - (double)$$2.w();
         jf $$5 = null;
         double $$6 = Double.MAX_VALUE;
         jf[] $$7 = new jf[]{jf.e, jf.f, jf.c, jf.d};

         for (jf $$8 : $$7) {
            double $$9 = $$8.o().a($$3, 0.0, $$4);
            double $$10 = $$8.f() == jf.b.a ? 1.0 - $$9 : $$9;
            if ($$10 < $$6 && !this.c($$2.a($$8))) {
               $$6 = $$10;
               $$5 = $$8;
            }
         }

         if ($$5 != null) {
            ewf $$11 = this.dt();
            if ($$5.o() == jf.a.a) {
               this.o(0.1 * (double)$$5.j(), $$11.d, $$11.e);
            } else {
               this.o($$11.c, $$11.d, 0.1 * (double)$$5.l());
            }
         }
      }
   }

   private boolean c(ja $$0) {
      ewa $$1 = this.cL();
      ewa $$2 = new ewa((double)$$0.u(), $$1.b, (double)$$0.w(), (double)$$0.u() + 1.0, $$1.e, (double)$$0.w() + 1.0).h(1.0E-7);
      return this.dQ().f(this, $$2);
   }

   public void a(float $$0, int $$1, int $$2) {
      this.cs = $$0;
      this.cr = $$1;
      this.cq = $$2;
   }

   @Override
   public void a(wu $$0) {
      this.cD.l.d().a($$0);
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
      this.dp = $$0;
   }

   public boolean o() {
      return this.dp;
   }

   public void v(boolean $$0) {
      this.dq = $$0;
   }

   public boolean p() {
      return this.dq;
   }

   @Override
   public void a(avg $$0, float $$1, float $$2) {
      this.dQ().a(this.dv(), this.dx(), this.dB(), $$0, this.df(), $$1, $$2, false);
   }

   @Override
   public void a(avg $$0, avi $$1, float $$2, float $$3) {
      this.dQ().a(this.dv(), this.dx(), this.dB(), $$0, $$1, $$2, $$3, false);
   }

   @Override
   public boolean dc() {
      return true;
   }

   @Override
   public void c(bqf $$0) {
      cuc $$1 = this.b($$0);
      if (!$$1.e() && !this.fs()) {
         super.c($$0);
         this.di = true;
         this.dj = $$0;
      }
   }

   @Override
   public boolean fs() {
      return this.di;
   }

   @Override
   public void fy() {
      super.fy();
      this.di = false;
   }

   @Override
   public bqf ft() {
      return Objects.requireNonNullElse(this.dj, bqf.a);
   }

   @Override
   public void a(ajp<?> $$0) {
      super.a($$0);
      if (aF.equals($$0)) {
         boolean $$1 = (this.ao.a(aF) & 1) > 0;
         bqf $$2 = (this.ao.a(aF) & 2) > 0 ? bqf.b : bqf.a;
         if ($$1 && !this.di) {
            this.c($$2);
         } else if (!$$1 && this.di) {
            this.fy();
         }
      }

      if (ap.equals($$0) && this.fB() && !this.dn) {
         this.cD.aj().a((gtc)(new gss(this)));
      }
   }

   @Nullable
   public btm u() {
      if (this.de() instanceof btm $$0 && $$0.a()) {
         return $$0;
      }

      return null;
   }

   public float v() {
      return this.dh;
   }

   @Override
   public boolean Y() {
      return this.cD.aS();
   }

   @Override
   public void a(dra $$0, boolean $$1) {
      if ($$0 instanceof dqn $$2) {
         this.cD.a(new fow($$2, $$1, this.cD.aS()));
      } else {
         this.cD.a(new fpj($$0, $$1, this.cD.aS()));
      }
   }

   @Override
   public void a(dbg $$0) {
      this.cD.a(new fpg($$0));
   }

   @Override
   public void a(dpz $$0) {
      this.cD.a(new foi($$0));
   }

   @Override
   public void a(drf $$0) {
      this.cD.a(new fpn($$0));
   }

   @Override
   public void a(dqq $$0) {
      this.cD.a(new fpb($$0));
   }

   @Override
   public void a(cuc $$0, bqf $$1) {
      if ($$0.a(cuf.tZ)) {
         this.cD.a(new foe(this, $$0, $$1));
      }
   }

   @Override
   public void b(bsg $$0) {
      this.cD.g.a($$0, lj.f);
   }

   @Override
   public void c(bsg $$0) {
      this.cD.g.a($$0, lj.r);
   }

   @Override
   public boolean bW() {
      return this.cC != null && this.cC.h;
   }

   @Override
   public boolean cb() {
      return this.db;
   }

   @Override
   public boolean w() {
      return this.cb() || this.cf();
   }

   @Override
   public void fn() {
      super.fn();
      if (this.z()) {
         this.bo = this.cC.a;
         this.bq = this.cC.b;
         this.bn = this.cC.g;
         this.cH = this.cF;
         this.cI = this.cG;
         this.cG = this.cG + (this.dI() - this.cG) * 0.5F;
         this.cF = this.cF + (this.dG() - this.cF) * 0.5F;
      }
   }

   protected boolean z() {
      return this.cD.an() == this;
   }

   @Override
   public void A() {
      this.b(btn.a);
      if (this.dQ() != null) {
         for (double $$0 = this.dx(); $$0 > (double)this.dQ().I_() && $$0 < (double)this.dQ().am(); $$0++) {
            this.a_(this.dv(), $$0, this.dB());
            if (this.dQ().g(this)) {
               break;
            }
         }

         this.i(ewf.b);
         this.t(0.0F);
      }

      this.u(this.eO());
      this.aQ = 0;
   }

   @Override
   public void n_() {
      if (this.cE > 0) {
         this.cE--;
      }

      if (!(this.cD.y instanceof fnh)) {
         this.H();
      }

      boolean $$0 = this.cC.g;
      boolean $$1 = this.cC.h;
      boolean $$2 = this.N();
      cmh $$3 = this.ga();
      this.db = !$$3.b && !this.cd() && !this.bS() && this.h(btn.f) && (this.bW() || !this.fI() && !this.h(btn.a));
      float $$4 = (float)this.g(buj.z);
      this.cC.a(this.w(), $$4);
      this.cD.ay().a(this.cC);
      if (this.fs() && !this.bS()) {
         this.cC.a *= 0.2F;
         this.cC.b *= 0.2F;
         this.cE = 0;
      }

      boolean $$5 = false;
      if (this.dm > 0) {
         this.dm--;
         $$5 = true;
         this.cC.g = true;
      }

      if (!this.ag) {
         this.c(this.dv() - (double)this.dk() * 0.35, this.dB() + (double)this.dk() * 0.35);
         this.c(this.dv() - (double)this.dk() * 0.35, this.dB() - (double)this.dk() * 0.35);
         this.c(this.dv() + (double)this.dk() * 0.35, this.dB() - (double)this.dk() * 0.35);
         this.c(this.dv() + (double)this.dk() * 0.35, this.dB() + (double)this.dk() * 0.35);
      }

      if ($$1) {
         this.cE = 0;
      }

      boolean $$6 = this.M();
      boolean $$7 = this.bS() ? this.dd().aF() : this.aF();
      boolean $$8 = !$$1 && !$$2;
      if (($$7 || this.bk()) && $$8 && $$6) {
         if (this.cE <= 0 && !this.cD.m.C.e()) {
            this.cE = 7;
         } else {
            this.h(true);
         }
      }

      if ((!this.bf() || this.bk()) && $$6 && this.cD.m.C.e()) {
         this.h(true);
      }

      if (this.cc()) {
         boolean $$9 = !this.cC.b() || !this.O();
         boolean $$10 = $$9 || this.Q && !this.T || this.bf() && !this.bk();
         if (this.cd()) {
            if (!this.aF() && !this.cC.h && $$9 || !this.bf()) {
               this.h(false);
            }
         } else if ($$10) {
            this.h(false);
         }
      }

      boolean $$11 = false;
      if ($$3.c) {
         if (this.cD.q.h()) {
            if (!$$3.b) {
               $$3.b = true;
               $$11 = true;
               this.y();
            }
         } else if (!$$0 && this.cC.g && !$$5) {
            if (this.cf == 0) {
               this.cf = 7;
            } else if (!this.cd()) {
               $$3.b = !$$3.b;
               if ($$3.b && this.aF()) {
                  this.fg();
               }

               $$11 = true;
               this.y();
               this.cf = 0;
            }
         }
      }

      if (this.cC.g && !$$11 && !$$0 && !$$3.b && !this.bS() && !this.q_()) {
         cuc $$12 = this.a(bsn.e);
         if ($$12.a(cuf.nT) && csy.i($$12) && this.ge()) {
            this.cB.b(new ahg(this, ahg.a.i));
         }
      }

      this.dn = this.fB();
      if (this.bf() && this.cC.h && this.ed()) {
         this.fh();
      }

      if (this.a(awc.a)) {
         int $$13 = this.N_() ? 10 : 1;
         this.do = ayg.a(this.do + $$13, 0, 600);
      } else if (this.do > 0) {
         this.a(awc.a);
         this.do = ayg.a(this.do - 10, 0, 600);
      }

      if ($$3.b && this.z()) {
         int $$14 = 0;
         if (this.cC.h) {
            $$14--;
         }

         if (this.cC.g) {
            $$14++;
         }

         if ($$14 != 0) {
            this.i(this.dt().b(0.0, (double)((float)$$14 * $$3.a() * 3.0F), 0.0));
         }
      }

      btm $$15 = this.u();
      if ($$15 != null && $$15.c() == 0) {
         if (this.dg < 0) {
            this.dg++;
            if (this.dg == 0) {
               this.dh = 0.0F;
            }
         }

         if ($$0 && !this.cC.g) {
            this.dg = -10;
            $$15.b(ayg.d(this.v() * 100.0F));
            this.h();
         } else if (!$$0 && this.cC.g) {
            this.dg = 0;
            this.dh = 0.0F;
         } else if ($$0) {
            this.dg++;
            if (this.dg < 10) {
               this.dh = (float)this.dg * 0.1F;
            } else {
               this.dh = 0.8F + 2.0F / (float)(this.dg - 9) * 0.1F;
            }
         }
      } else {
         this.dh = 0.0F;
      }

      super.n_();
      if (this.aF() && $$3.b && !this.cD.q.h()) {
         $$3.b = false;
         this.y();
      }
   }

   @Override
   protected void ee() {
      this.aQ++;
      if (this.aQ == 20) {
         this.a(bsg.c.a);
      }
   }

   private void H() {
      this.cK = this.cJ;
      float $$0 = 0.0F;
      if (this.aw) {
         if (this.cD.y != null && !this.cD.y.k() && !(this.cD.y instanceof fmn)) {
            if (this.cD.y instanceof fny) {
               this.r();
            }

            this.cD.a(null);
         }

         if (this.cJ == 0.0F) {
            this.cD.aj().a(gsx.b(avh.uJ, this.ah.i() * 0.4F + 0.8F, 0.25F));
         }

         $$0 = 0.0125F;
         this.aw = false;
      } else if (this.b(brq.i) && !this.c(brq.i).a(60)) {
         $$0 = 0.006666667F;
      } else if (this.cJ > 0.0F) {
         $$0 = -0.05F;
      }

      this.cJ = ayg.a(this.cJ + $$0, 0.0F, 1.0F);
      this.L();
   }

   @Override
   public void t() {
      super.t();
      this.dk = false;
      if (this.de() instanceof coh $$0) {
         $$0.a(this.cC.e, this.cC.f, this.cC.c, this.cC.d);
         this.dk = this.dk | (this.cC.e || this.cC.f || this.cC.c || this.cC.d);
      }
   }

   public boolean B() {
      return this.dk;
   }

   @Nullable
   @Override
   public bro d(jj<brm> $$0) {
      if ($$0.a(brq.i)) {
         this.cK = 0.0F;
         this.cJ = 0.0F;
      }

      return super.d($$0);
   }

   @Override
   public void a(btg $$0, ewf $$1) {
      double $$2 = this.dv();
      double $$3 = this.dB();
      super.a($$0, $$1);
      this.f((float)(this.dv() - $$2), (float)(this.dB() - $$3));
   }

   public boolean C() {
      return this.dl;
   }

   protected void f(float $$0, float $$1) {
      if (this.I()) {
         ewf $$2 = this.do();
         ewf $$3 = $$2.b((double)$$0, 0.0, (double)$$1);
         ewf $$4 = new ewf((double)$$0, 0.0, (double)$$1);
         float $$5 = this.fk();
         float $$6 = (float)$$4.g();
         if ($$6 <= 0.001F) {
            ewe $$7 = this.cC.a();
            float $$8 = $$5 * $$7.i;
            float $$9 = $$5 * $$7.j;
            float $$10 = ayg.a(this.dG() * (float) (Math.PI / 180.0));
            float $$11 = ayg.b(this.dG() * (float) (Math.PI / 180.0));
            $$4 = new ewf((double)($$8 * $$11 - $$9 * $$10), $$4.d, (double)($$9 * $$11 + $$8 * $$10));
            $$6 = (float)$$4.g();
            if ($$6 <= 0.001F) {
               return;
            }
         }

         float $$12 = ayg.i($$6);
         ewf $$13 = $$4.a((double)$$12);
         ewf $$14 = this.bO();
         float $$15 = (float)($$14.c * $$13.c + $$14.e * $$13.e);
         if (!($$15 < -0.15F)) {
            ewk $$16 = ewk.a(this);
            ja $$17 = ja.a(this.dv(), this.cL().e, this.dB());
            dsk $$18 = this.dQ().a_($$17);
            if ($$18.b(this.dQ(), $$17, $$16).c()) {
               $$17 = $$17.c();
               dsk $$19 = this.dQ().a_($$17);
               if ($$19.b(this.dQ(), $$17, $$16).c()) {
                  float $$20 = 7.0F;
                  float $$21 = 1.2F;
                  if (this.b(brq.h)) {
                     $$21 += (float)(this.c(brq.h).e() + 1) * 0.75F;
                  }

                  float $$22 = Math.max($$5 * 7.0F, 1.0F / $$12);
                  ewf $$24 = $$3.e($$13.a((double)$$22));
                  float $$25 = this.dk();
                  float $$26 = this.dl();
                  ewa $$27 = new ewa($$2, $$24.b(0.0, (double)$$26, 0.0)).c((double)$$25, 0.0, (double)$$25);
                  ewf $$23 = $$2.b(0.0, 0.51F, 0.0);
                  $$24 = $$24.b(0.0, 0.51F, 0.0);
                  ewf $$28 = $$13.c(new ewf(0.0, 1.0, 0.0));
                  ewf $$29 = $$28.a((double)($$25 * 0.5F));
                  ewf $$30 = $$23.d($$29);
                  ewf $$31 = $$24.d($$29);
                  ewf $$32 = $$23.e($$29);
                  ewf $$33 = $$24.e($$29);
                  Iterable<ewy> $$34 = this.dQ().d(this, $$27);
                  Iterator<ewa> $$35 = StreamSupport.stream($$34.spliterator(), false).flatMap($$0x -> $$0x.e().stream()).iterator();
                  float $$36 = Float.MIN_VALUE;

                  while ($$35.hasNext()) {
                     ewa $$37 = $$35.next();
                     if ($$37.a($$30, $$31) || $$37.a($$32, $$33)) {
                        $$36 = (float)$$37.e;
                        ewf $$38 = $$37.f();
                        ja $$39 = ja.a($$38);

                        for (int $$40 = 1; (float)$$40 < $$21; $$40++) {
                           ja $$41 = $$39.b($$40);
                           dsk $$42 = this.dQ().a_($$41);
                           ewy $$43;
                           if (!($$43 = $$42.b(this.dQ(), $$41, $$16)).c()) {
                              $$36 = (float)$$43.c(jf.a.b) + (float)$$41.v();
                              if ((double)$$36 - this.dx() > (double)$$21) {
                                 return;
                              }
                           }

                           if ($$40 > 1) {
                              $$17 = $$17.c();
                              dsk $$44 = this.dQ().a_($$17);
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
                        this.dm = 1;
                     }
                  }
               }
            }
         }
      }
   }

   @Override
   protected boolean c(ewf $$0) {
      float $$1 = this.dG() * (float) (Math.PI / 180.0);
      double $$2 = (double)ayg.a($$1);
      double $$3 = (double)ayg.b($$1);
      double $$4 = (double)this.bo * $$3 - (double)this.bq * $$2;
      double $$5 = (double)this.bq * $$3 + (double)this.bo * $$2;
      double $$6 = ayg.k($$4) + ayg.k($$5);
      double $$7 = ayg.k($$0.c) + ayg.k($$0.e);
      if (!($$6 < 1.0E-5F) && !($$7 < 1.0E-5F)) {
         double $$8 = $$4 * $$0.c + $$5 * $$0.e;
         double $$9 = Math.acos($$8 / Math.sqrt($$6 * $$7));
         return $$9 < 0.13962634F;
      } else {
         return false;
      }
   }

   private boolean I() {
      return this.C() && this.dm <= 0 && this.aF() && !this.fQ() && !this.bS() && this.K() && (double)this.aN() >= 1.0;
   }

   private boolean K() {
      ewe $$0 = this.cC.a();
      return $$0.i != 0.0F || $$0.j != 0.0F;
   }

   private boolean M() {
      return !this.cc() && this.N() && this.O() && !this.fs() && !this.b(brq.o) && (!this.bS() || this.d(this.dd())) && !this.fB();
   }

   private boolean d(bsg $$0) {
      return $$0.dJ() && $$0.db();
   }

   private boolean N() {
      double $$0 = 0.8;
      return this.bk() ? this.cC.b() : (double)this.cC.b >= 0.8;
   }

   private boolean O() {
      return this.bS() || (float)this.gj().a() > 6.0F || this.ga().c;
   }

   public float D() {
      if (!this.a(awc.a)) {
         return 0.0F;
      } else {
         float $$0 = 600.0F;
         float $$1 = 100.0F;
         if ((float)this.do >= 600.0F) {
            return 1.0F;
         } else {
            float $$2 = ayg.a((float)this.do / 100.0F, 0.0F, 1.0F);
            float $$3 = (float)this.do < 100.0F ? 0.0F : ayg.a(((float)this.do - 100.0F) / 500.0F, 0.0F, 1.0F);
            return $$2 * 0.6F + $$3 * 0.39999998F;
         }
      }
   }

   public void a(dcc $$0) {
      if ($$0 == dcc.d) {
         this.i(this.dt().a(jf.a.b, 0.0));
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
            this.dQ().a(this.dv(), this.dx(), this.dB(), avh.x, avi.i, 1.0F, 1.0F, false);
            this.cD.aj().a((gtc)(new gtf.b(this)));
         }

         if ($$0 && !$$1) {
            this.dQ().a(this.dv(), this.dx(), this.dB(), avh.y, avi.i, 1.0F, 1.0F, false);
         }

         return this.cp;
      }
   }

   @Override
   public ewf r(float $$0) {
      if (this.cD.m.aA().a()) {
         float $$1 = ayg.i($$0 * 0.5F, this.dG(), this.O) * (float) (Math.PI / 180.0);
         float $$2 = ayg.i($$0 * 0.5F, this.dI(), this.P) * (float) (Math.PI / 180.0);
         double $$3 = this.fr() == bsv.b ? -1.0 : 1.0;
         ewf $$4 = new ewf(0.39 * $$3, -0.6, 0.3);
         return $$4.a(-$$2).b(-$$1).e(this.k($$0));
      } else {
         return super.r($$0);
      }
   }

   @Override
   public void a(cuc $$0, cuc $$1, cpq $$2) {
      this.cD.ay().a($$0, $$1, $$2);
   }

   @Override
   public float dH() {
      return this.dG();
   }
}
