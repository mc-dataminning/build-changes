import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gcz extends gcw {
   public static final Logger g = LogUtils.getLogger();
   private static final int cL = 20;
   private static final int cM = 600;
   private static final int cN = 100;
   private static final float cO = 0.6F;
   private static final double cP = 0.35;
   private static final double cQ = 0.13962634F;
   public final fye cB;
   private final avq cR;
   private final ffa cS;
   private final List<gsg> cT = Lists.newArrayList();
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
   public gcx cC;
   protected final ffn cD;
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
   private bqc dj;
   private boolean dk;
   private boolean dl = true;
   private int dm;
   private boolean dn;
   private int do;
   private boolean dp = true;
   private boolean dq = false;

   public gcz(ffn $$0, fyd $$1, fye $$2, avq $$3, ffa $$4, boolean $$5, boolean $$6) {
      super($$1, $$2.o());
      this.cD = $$0;
      this.cB = $$2;
      this.cR = $$3;
      this.cS = $$4;
      this.dc = $$5;
      this.dd = $$6;
      this.cT.add(new gsy(this, $$0.aj()));
      this.cT.add(new gsl(this));
      this.cT.add(new gsk(this, $$0.aj(), $$1.F_()));
   }

   @Override
   public boolean a(bqw $$0, float $$1) {
      return false;
   }

   @Override
   public void c(float $$0) {
   }

   @Override
   public boolean a(bsd $$0, boolean $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         if ($$0 instanceof coc) {
            this.cD.aj().a((gsw)(new gsq(this, (coc)$$0, true)));
            this.cD.aj().a((gsw)(new gsq(this, (coc)$$0, false)));
         }

         return true;
      }
   }

   @Override
   public void bI() {
      super.bI();
      this.dk = false;
   }

   @Override
   public float h(float $$0) {
      return this.dH();
   }

   @Override
   public float i(float $$0) {
      return this.bR() ? super.i($$0) : this.dF();
   }

   @Override
   public void l() {
      if (this.dP().f(this.dt(), this.dz())) {
         super.l();
         if (this.bR()) {
            this.cB.b(new agz.c(this.dF(), this.dH(), this.aE()));
            this.cB.b(new ahh(this.bo, this.bq, this.cC.g, this.cC.h));
            bsd $$0 = this.cZ();
            if ($$0 != this && $$0.da()) {
               this.cB.b(new aha($$0));
               this.G();
            }
         } else {
            this.E();
         }

         for (gsg $$1 : this.cT) {
            $$1.a();
         }
      }
   }

   public float d() {
      for (gsg $$0 : this.cT) {
         if ($$0 instanceof gsk) {
            return ((gsk)$$0).b();
         }
      }

      return 0.0F;
   }

   private void E() {
      this.G();
      boolean $$0 = this.bV();
      if ($$0 != this.dc) {
         ahg.a $$1 = $$0 ? ahg.a.a : ahg.a.b;
         this.cB.b(new ahg(this, $$1));
         this.dc = $$0;
      }

      if (this.z()) {
         double $$2 = this.du() - this.cV;
         double $$3 = this.dw() - this.cW;
         double $$4 = this.dA() - this.cX;
         double $$5 = (double)(this.dF() - this.cY);
         double $$6 = (double)(this.dH() - this.cZ);
         this.de++;
         boolean $$7 = aye.f($$2, $$3, $$4) > aye.k(2.0E-4) || this.de >= 20;
         boolean $$8 = $$5 != 0.0 || $$6 != 0.0;
         if (this.bR()) {
            evz $$9 = this.ds();
            this.cB.b(new agz.b($$9.c, -999.0, $$9.e, this.dF(), this.dH(), this.aE()));
            $$7 = false;
         } else if ($$7 && $$8) {
            this.cB.b(new agz.b(this.du(), this.dw(), this.dA(), this.dF(), this.dH(), this.aE()));
         } else if ($$7) {
            this.cB.b(new agz.a(this.du(), this.dw(), this.dA(), this.aE()));
         } else if ($$8) {
            this.cB.b(new agz.c(this.dF(), this.dH(), this.aE()));
         } else if (this.da != this.aE()) {
            this.cB.b(new agz.d(this.aE()));
         }

         if ($$7) {
            this.cV = this.du();
            this.cW = this.dw();
            this.cX = this.dA();
            this.de = 0;
         }

         if ($$8) {
            this.cY = this.dF();
            this.cZ = this.dH();
         }

         this.da = this.aE();
         this.dl = this.cD.m.H().c();
      }
   }

   private void G() {
      boolean $$0 = this.cb();
      if ($$0 != this.dd) {
         ahg.a $$1 = $$0 ? ahg.a.d : ahg.a.e;
         this.cB.b(new ahg(this, $$1));
         this.dd = $$0;
      }
   }

   public boolean a(boolean $$0) {
      ahf.a $$1 = $$0 ? ahf.a.d : ahf.a.e;
      cua $$2 = this.fY().a($$0);
      this.cB.b(new ahf($$1, ja.c, jf.a));
      return !$$2.e();
   }

   @Override
   public void a(bqc $$0) {
      super.a($$0);
      this.cB.b(new ahv($$0));
   }

   @Override
   public void fW() {
      this.cB.b(new agm(agm.a.a));
      ffl.c();
   }

   @Override
   protected void f(bqw $$0, float $$1) {
      if (!this.b($$0)) {
         this.u(this.ew() - $$1);
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
         float $$1 = this.ew() - $$0;
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
      this.cB.b(new ahe(this.fZ()));
   }

   @Override
   public boolean g() {
      return true;
   }

   @Override
   public boolean fz() {
      return !this.fZ().b && super.fz();
   }

   @Override
   public boolean bq() {
      return !this.fZ().b && super.bq();
   }

   protected void h() {
      this.cB.b(new ahg(this, ahg.a.f, aye.d(this.v() * 100.0F)));
   }

   public void i() {
      this.cB.b(new ahg(this, ahg.a.h));
   }

   public avq j() {
      return this.cR;
   }

   public ffa m() {
      return this.cS;
   }

   public void a(cyi<?> $$0) {
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
      ja $$2 = ja.a($$0, this.dw(), $$1);
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
            evz $$11 = this.ds();
            if ($$5.o() == jf.a.a) {
               this.o(0.1 * (double)$$5.j(), $$11.d, $$11.e);
            } else {
               this.o($$11.c, $$11.d, 0.1 * (double)$$5.l());
            }
         }
      }
   }

   private boolean c(ja $$0) {
      evu $$1 = this.cK();
      evu $$2 = new evu((double)$$0.u(), $$1.b, (double)$$0.w(), (double)$$0.u() + 1.0, $$1.e, (double)$$0.w() + 1.0).h(1.0E-7);
      return this.dP().f(this, $$2);
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
   public void a(ave $$0, float $$1, float $$2) {
      this.dP().a(this.du(), this.dw(), this.dA(), $$0, this.de(), $$1, $$2, false);
   }

   @Override
   public void a(ave $$0, avg $$1, float $$2, float $$3) {
      this.dP().a(this.du(), this.dw(), this.dA(), $$0, $$1, $$2, $$3, false);
   }

   @Override
   public boolean db() {
      return true;
   }

   @Override
   public void c(bqc $$0) {
      cua $$1 = this.b($$0);
      if (!$$1.e() && !this.fr()) {
         super.c($$0);
         this.di = true;
         this.dj = $$0;
      }
   }

   @Override
   public boolean fr() {
      return this.di;
   }

   @Override
   public void fx() {
      super.fx();
      this.di = false;
   }

   @Override
   public bqc fs() {
      return Objects.requireNonNullElse(this.dj, bqc.a);
   }

   @Override
   public void a(ajp<?> $$0) {
      super.a($$0);
      if (aF.equals($$0)) {
         boolean $$1 = (this.ao.a(aF) & 1) > 0;
         bqc $$2 = (this.ao.a(aF) & 2) > 0 ? bqc.b : bqc.a;
         if ($$1 && !this.di) {
            this.c($$2);
         } else if (!$$1 && this.di) {
            this.fx();
         }
      }

      if (ap.equals($$0) && this.fA() && !this.dn) {
         this.cD.aj().a((gsw)(new gsm(this)));
      }
   }

   @Nullable
   public btj u() {
      if (this.dd() instanceof btj $$0 && $$0.a()) {
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
   public void a(dqx $$0, boolean $$1) {
      if ($$0 instanceof dqk $$2) {
         this.cD.a(new fop($$2, $$1, this.cD.aS()));
      } else {
         this.cD.a(new fpd($$0, $$1, this.cD.aS()));
      }
   }

   @Override
   public void a(dbe $$0) {
      this.cD.a(new fpa($$0));
   }

   @Override
   public void a(dpx $$0) {
      this.cD.a(new foc($$0));
   }

   @Override
   public void a(drc $$0) {
      this.cD.a(new fph($$0));
   }

   @Override
   public void a(dqn $$0) {
      this.cD.a(new fov($$0));
   }

   @Override
   public void a(cua $$0, bqc $$1) {
      if ($$0.a(cud.tZ)) {
         this.cD.a(new fny(this, $$0, $$1));
      }
   }

   @Override
   public void b(bsd $$0) {
      this.cD.g.a($$0, lj.f);
   }

   @Override
   public void c(bsd $$0) {
      this.cD.g.a($$0, lj.r);
   }

   @Override
   public boolean bV() {
      return this.cC != null && this.cC.h;
   }

   @Override
   public boolean ca() {
      return this.db;
   }

   @Override
   public boolean w() {
      return this.ca() || this.ce();
   }

   @Override
   public void fm() {
      super.fm();
      if (this.z()) {
         this.bo = this.cC.a;
         this.bq = this.cC.b;
         this.bn = this.cC.g;
         this.cH = this.cF;
         this.cI = this.cG;
         this.cG = this.cG + (this.dH() - this.cG) * 0.5F;
         this.cF = this.cF + (this.dF() - this.cF) * 0.5F;
      }
   }

   protected boolean z() {
      return this.cD.an() == this;
   }

   @Override
   public void A() {
      this.b(btk.a);
      if (this.dP() != null) {
         for (double $$0 = this.dw(); $$0 > (double)this.dP().I_() && $$0 < (double)this.dP().am(); $$0++) {
            this.a_(this.du(), $$0, this.dA());
            if (this.dP().g(this)) {
               break;
            }
         }

         this.h(evz.b);
         this.t(0.0F);
      }

      this.u(this.eN());
      this.aQ = 0;
   }

   @Override
   public void n_() {
      if (this.cE > 0) {
         this.cE--;
      }

      if (!(this.cD.y instanceof fnb)) {
         this.H();
      }

      boolean $$0 = this.cC.g;
      boolean $$1 = this.cC.h;
      boolean $$2 = this.N();
      cme $$3 = this.fZ();
      this.db = !$$3.b && !this.cc() && !this.bR() && this.h(btk.f) && (this.bV() || !this.fH() && !this.h(btk.a));
      float $$4 = (float)this.g(bug.z);
      this.cC.a(this.w(), $$4);
      this.cD.aA().a(this.cC);
      if (this.fr() && !this.bR()) {
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
         this.c(this.du() - (double)this.dj() * 0.35, this.dA() + (double)this.dj() * 0.35);
         this.c(this.du() - (double)this.dj() * 0.35, this.dA() - (double)this.dj() * 0.35);
         this.c(this.du() + (double)this.dj() * 0.35, this.dA() - (double)this.dj() * 0.35);
         this.c(this.du() + (double)this.dj() * 0.35, this.dA() + (double)this.dj() * 0.35);
      }

      if ($$1) {
         this.cE = 0;
      }

      boolean $$6 = this.M();
      boolean $$7 = this.bR() ? this.dc().aE() : this.aE();
      boolean $$8 = !$$1 && !$$2;
      if (($$7 || this.bj()) && $$8 && $$6) {
         if (this.cE <= 0 && !this.cD.m.C.e()) {
            this.cE = 7;
         } else {
            this.h(true);
         }
      }

      if ((!this.be() || this.bj()) && $$6 && this.cD.m.C.e()) {
         this.h(true);
      }

      if (this.cb()) {
         boolean $$9 = !this.cC.b() || !this.O();
         boolean $$10 = $$9 || this.Q && !this.T || this.be() && !this.bj();
         if (this.cc()) {
            if (!this.aE() && !this.cC.h && $$9 || !this.be()) {
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
            } else if (!this.cc()) {
               $$3.b = !$$3.b;
               if ($$3.b && this.aE()) {
                  this.ff();
               }

               $$11 = true;
               this.y();
               this.cf = 0;
            }
         }
      }

      if (this.cC.g && !$$11 && !$$0 && !$$3.b && !this.bR() && !this.q_()) {
         cua $$12 = this.a(bsk.e);
         if ($$12.a(cud.nT) && csw.i($$12) && this.gd()) {
            this.cB.b(new ahg(this, ahg.a.i));
         }
      }

      this.dn = this.fA();
      if (this.be() && this.cC.h && this.ec()) {
         this.fg();
      }

      if (this.a(awa.a)) {
         int $$13 = this.N_() ? 10 : 1;
         this.do = aye.a(this.do + $$13, 0, 600);
      } else if (this.do > 0) {
         this.a(awa.a);
         this.do = aye.a(this.do - 10, 0, 600);
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
            this.h(this.ds().b(0.0, (double)((float)$$14 * $$3.a() * 3.0F), 0.0));
         }
      }

      btj $$15 = this.u();
      if ($$15 != null && $$15.c() == 0) {
         if (this.dg < 0) {
            this.dg++;
            if (this.dg == 0) {
               this.dh = 0.0F;
            }
         }

         if ($$0 && !this.cC.g) {
            this.dg = -10;
            $$15.b(aye.d(this.v() * 100.0F));
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
      if (this.aE() && $$3.b && !this.cD.q.h()) {
         $$3.b = false;
         this.y();
      }
   }

   @Override
   protected void ed() {
      this.aQ++;
      if (this.aQ == 20) {
         this.a(bsd.c.a);
      }
   }

   private void H() {
      this.cK = this.cJ;
      float $$0 = 0.0F;
      if (this.aw) {
         if (this.cD.y != null && !this.cD.y.k() && !(this.cD.y instanceof fmh)) {
            if (this.cD.y instanceof fns) {
               this.r();
            }

            this.cD.a(null);
         }

         if (this.cJ == 0.0F) {
            this.cD.aj().a(gsr.b(avf.uJ, this.ah.i() * 0.4F + 0.8F, 0.25F));
         }

         $$0 = 0.0125F;
         this.aw = false;
      } else if (this.b(brn.i) && !this.c(brn.i).a(60)) {
         $$0 = 0.006666667F;
      } else if (this.cJ > 0.0F) {
         $$0 = -0.05F;
      }

      this.cJ = aye.a(this.cJ + $$0, 0.0F, 1.0F);
      this.L();
   }

   @Override
   public void t() {
      super.t();
      this.dk = false;
      if (this.dd() instanceof coe $$0) {
         $$0.a(this.cC.e, this.cC.f, this.cC.c, this.cC.d);
         this.dk = this.dk | (this.cC.e || this.cC.f || this.cC.c || this.cC.d);
      }
   }

   public boolean B() {
      return this.dk;
   }

   @Nullable
   @Override
   public brl d(jj<brj> $$0) {
      if ($$0.a(brn.i)) {
         this.cK = 0.0F;
         this.cJ = 0.0F;
      }

      return super.d($$0);
   }

   @Override
   public void a(btd $$0, evz $$1) {
      double $$2 = this.du();
      double $$3 = this.dA();
      super.a($$0, $$1);
      this.f((float)(this.du() - $$2), (float)(this.dA() - $$3));
   }

   public boolean C() {
      return this.dl;
   }

   protected void f(float $$0, float $$1) {
      if (this.I()) {
         evz $$2 = this.dn();
         evz $$3 = $$2.b((double)$$0, 0.0, (double)$$1);
         evz $$4 = new evz((double)$$0, 0.0, (double)$$1);
         float $$5 = this.fj();
         float $$6 = (float)$$4.g();
         if ($$6 <= 0.001F) {
            evy $$7 = this.cC.a();
            float $$8 = $$5 * $$7.i;
            float $$9 = $$5 * $$7.j;
            float $$10 = aye.a(this.dF() * (float) (Math.PI / 180.0));
            float $$11 = aye.b(this.dF() * (float) (Math.PI / 180.0));
            $$4 = new evz((double)($$8 * $$11 - $$9 * $$10), $$4.d, (double)($$9 * $$11 + $$8 * $$10));
            $$6 = (float)$$4.g();
            if ($$6 <= 0.001F) {
               return;
            }
         }

         float $$12 = aye.i($$6);
         evz $$13 = $$4.a((double)$$12);
         evz $$14 = this.bN();
         float $$15 = (float)($$14.c * $$13.c + $$14.e * $$13.e);
         if (!($$15 < -0.15F)) {
            ewe $$16 = ewe.a(this);
            ja $$17 = ja.a(this.du(), this.cK().e, this.dA());
            dsh $$18 = this.dP().a_($$17);
            if ($$18.b(this.dP(), $$17, $$16).c()) {
               $$17 = $$17.c();
               dsh $$19 = this.dP().a_($$17);
               if ($$19.b(this.dP(), $$17, $$16).c()) {
                  float $$20 = 7.0F;
                  float $$21 = 1.2F;
                  if (this.b(brn.h)) {
                     $$21 += (float)(this.c(brn.h).e() + 1) * 0.75F;
                  }

                  float $$22 = Math.max($$5 * 7.0F, 1.0F / $$12);
                  evz $$24 = $$3.e($$13.a((double)$$22));
                  float $$25 = this.dj();
                  float $$26 = this.dk();
                  evu $$27 = new evu($$2, $$24.b(0.0, (double)$$26, 0.0)).c((double)$$25, 0.0, (double)$$25);
                  evz $$23 = $$2.b(0.0, 0.51F, 0.0);
                  $$24 = $$24.b(0.0, 0.51F, 0.0);
                  evz $$28 = $$13.c(new evz(0.0, 1.0, 0.0));
                  evz $$29 = $$28.a((double)($$25 * 0.5F));
                  evz $$30 = $$23.d($$29);
                  evz $$31 = $$24.d($$29);
                  evz $$32 = $$23.e($$29);
                  evz $$33 = $$24.e($$29);
                  Iterable<ews> $$34 = this.dP().d(this, $$27);
                  Iterator<evu> $$35 = StreamSupport.stream($$34.spliterator(), false).flatMap($$0x -> $$0x.e().stream()).iterator();
                  float $$36 = Float.MIN_VALUE;

                  while ($$35.hasNext()) {
                     evu $$37 = $$35.next();
                     if ($$37.a($$30, $$31) || $$37.a($$32, $$33)) {
                        $$36 = (float)$$37.e;
                        evz $$38 = $$37.f();
                        ja $$39 = ja.a($$38);

                        for (int $$40 = 1; (float)$$40 < $$21; $$40++) {
                           ja $$41 = $$39.b($$40);
                           dsh $$42 = this.dP().a_($$41);
                           ews $$43;
                           if (!($$43 = $$42.b(this.dP(), $$41, $$16)).c()) {
                              $$36 = (float)$$43.c(jf.a.b) + (float)$$41.v();
                              if ((double)$$36 - this.dw() > (double)$$21) {
                                 return;
                              }
                           }

                           if ($$40 > 1) {
                              $$17 = $$17.c();
                              dsh $$44 = this.dP().a_($$17);
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
                        this.dm = 1;
                     }
                  }
               }
            }
         }
      }
   }

   @Override
   protected boolean c(evz $$0) {
      float $$1 = this.dF() * (float) (Math.PI / 180.0);
      double $$2 = (double)aye.a($$1);
      double $$3 = (double)aye.b($$1);
      double $$4 = (double)this.bo * $$3 - (double)this.bq * $$2;
      double $$5 = (double)this.bq * $$3 + (double)this.bo * $$2;
      double $$6 = aye.k($$4) + aye.k($$5);
      double $$7 = aye.k($$0.c) + aye.k($$0.e);
      if (!($$6 < 1.0E-5F) && !($$7 < 1.0E-5F)) {
         double $$8 = $$4 * $$0.c + $$5 * $$0.e;
         double $$9 = Math.acos($$8 / Math.sqrt($$6 * $$7));
         return $$9 < 0.13962634F;
      } else {
         return false;
      }
   }

   private boolean I() {
      return this.C() && this.dm <= 0 && this.aE() && !this.fP() && !this.bR() && this.K() && (double)this.aM() >= 1.0;
   }

   private boolean K() {
      evy $$0 = this.cC.a();
      return $$0.i != 0.0F || $$0.j != 0.0F;
   }

   private boolean M() {
      return !this.cb() && this.N() && this.O() && !this.fr() && !this.b(brn.o) && (!this.bR() || this.d(this.dc())) && !this.fA();
   }

   private boolean d(bsd $$0) {
      return $$0.dI() && $$0.da();
   }

   private boolean N() {
      double $$0 = 0.8;
      return this.bj() ? this.cC.b() : (double)this.cC.b >= 0.8;
   }

   private boolean O() {
      return this.bR() || (float)this.gi().a() > 6.0F || this.fZ().c;
   }

   public float D() {
      if (!this.a(awa.a)) {
         return 0.0F;
      } else {
         float $$0 = 600.0F;
         float $$1 = 100.0F;
         if ((float)this.do >= 600.0F) {
            return 1.0F;
         } else {
            float $$2 = aye.a((float)this.do / 100.0F, 0.0F, 1.0F);
            float $$3 = (float)this.do < 100.0F ? 0.0F : aye.a(((float)this.do - 100.0F) / 500.0F, 0.0F, 1.0F);
            return $$2 * 0.6F + $$3 * 0.39999998F;
         }
      }
   }

   public void a(dca $$0) {
      if ($$0 == dca.d) {
         this.h(this.ds().a(jf.a.b, 0.0));
      }
   }

   @Override
   public boolean bj() {
      return this.cp;
   }

   @Override
   protected boolean fQ() {
      boolean $$0 = this.cp;
      boolean $$1 = super.fQ();
      if (this.N_()) {
         return this.cp;
      } else {
         if (!$$0 && $$1) {
            this.dP().a(this.du(), this.dw(), this.dA(), avf.x, avg.i, 1.0F, 1.0F, false);
            this.cD.aj().a((gsw)(new gsz.b(this)));
         }

         if ($$0 && !$$1) {
            this.dP().a(this.du(), this.dw(), this.dA(), avf.y, avg.i, 1.0F, 1.0F, false);
         }

         return this.cp;
      }
   }

   @Override
   public evz r(float $$0) {
      if (this.cD.m.aA().a()) {
         float $$1 = aye.i($$0 * 0.5F, this.dF(), this.O) * (float) (Math.PI / 180.0);
         float $$2 = aye.i($$0 * 0.5F, this.dH(), this.P) * (float) (Math.PI / 180.0);
         double $$3 = this.fq() == bss.b ? -1.0 : 1.0;
         evz $$4 = new evz(0.39 * $$3, -0.6, 0.3);
         return $$4.a(-$$2).b(-$$1).e(this.k($$0));
      } else {
         return super.r($$0);
      }
   }

   @Override
   public void a(cua $$0, cua $$1, cpn $$2) {
      this.cD.aA().a($$0, $$1, $$2);
   }

   @Override
   public float dG() {
      return this.dF();
   }
}
