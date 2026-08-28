import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gcl extends gci {
   public static final Logger g = LogUtils.getLogger();
   private static final int cJ = 20;
   private static final int cK = 600;
   private static final int cL = 100;
   private static final float cM = 0.6F;
   private static final double cN = 0.35;
   private static final double cO = 0.13962634F;
   private static final float cP = 0.3F;
   public final fxr cz;
   private final awh cQ;
   private final fen cR;
   private final List<grs> cS = Lists.newArrayList();
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
   public gcj cA;
   protected final ffa cB;
   protected int cC;
   public float cD;
   public float cE;
   public float cF;
   public float cG;
   private int df;
   private float dg;
   public float cH;
   public float cI;
   private boolean dh;
   @Nullable
   private bqo di;
   private boolean dj;
   private boolean dk = true;
   private int dl;
   private boolean dm;
   private int dn;
   private boolean do = true;
   private boolean dp = false;

   public gcl(ffa $$0, fxq $$1, fxr $$2, awh $$3, fen $$4, boolean $$5, boolean $$6) {
      super($$1, $$2.p());
      this.cB = $$0;
      this.cz = $$2;
      this.cQ = $$3;
      this.cR = $$4;
      this.db = $$5;
      this.dc = $$6;
      this.cS.add(new gsk(this, $$0.aj()));
      this.cS.add(new grx(this));
      this.cS.add(new grw(this, $$0.aj(), $$1.F_()));
   }

   @Override
   public boolean a(bri $$0, float $$1) {
      return false;
   }

   @Override
   public void c(float $$0) {
   }

   @Override
   public boolean a(bsp $$0, boolean $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         if ($$0 instanceof coo) {
            this.cB.aj().a((gsi)(new gsc(this, (coo)$$0, true)));
            this.cB.aj().a((gsi)(new gsc(this, (coo)$$0, false)));
         }

         return true;
      }
   }

   @Override
   public void bI() {
      super.bI();
      this.dj = false;
   }

   @Override
   public float g(float $$0) {
      return this.dH();
   }

   @Override
   public float h(float $$0) {
      return this.bR() ? super.h($$0) : this.dF();
   }

   @Override
   public void l() {
      if (this.dP().f(this.dt(), this.dz())) {
         super.l();
         if (this.bR()) {
            this.cz.b(new ahq.c(this.dF(), this.dH(), this.aE()));
            this.cz.b(new ahy(this.bo, this.bq, this.cA.g, this.cA.h));
            bsp $$0 = this.cZ();
            if ($$0 != this && $$0.da()) {
               this.cz.b(new ahr($$0));
               this.G();
            }
         } else {
            this.E();
         }

         for (grs $$1 : this.cS) {
            $$1.a();
         }
      }
   }

   public float d() {
      for (grs $$0 : this.cS) {
         if ($$0 instanceof grw) {
            return ((grw)$$0).b();
         }
      }

      return 0.0F;
   }

   private void E() {
      this.G();
      boolean $$0 = this.bV();
      if ($$0 != this.db) {
         ahx.a $$1 = $$0 ? ahx.a.a : ahx.a.b;
         this.cz.b(new ahx(this, $$1));
         this.db = $$0;
      }

      if (this.z()) {
         double $$2 = this.du() - this.cU;
         double $$3 = this.dw() - this.cV;
         double $$4 = this.dA() - this.cW;
         double $$5 = (double)(this.dF() - this.cX);
         double $$6 = (double)(this.dH() - this.cY);
         this.dd++;
         boolean $$7 = ayu.f($$2, $$3, $$4) > ayu.k(2.0E-4) || this.dd >= 20;
         boolean $$8 = $$5 != 0.0 || $$6 != 0.0;
         if (this.bR()) {
            evm $$9 = this.ds();
            this.cz.b(new ahq.b($$9.c, -999.0, $$9.e, this.dF(), this.dH(), this.aE()));
            $$7 = false;
         } else if ($$7 && $$8) {
            this.cz.b(new ahq.b(this.du(), this.dw(), this.dA(), this.dF(), this.dH(), this.aE()));
         } else if ($$7) {
            this.cz.b(new ahq.a(this.du(), this.dw(), this.dA(), this.aE()));
         } else if ($$8) {
            this.cz.b(new ahq.c(this.dF(), this.dH(), this.aE()));
         } else if (this.cZ != this.aE()) {
            this.cz.b(new ahq.d(this.aE()));
         }

         if ($$7) {
            this.cU = this.du();
            this.cV = this.dw();
            this.cW = this.dA();
            this.dd = 0;
         }

         if ($$8) {
            this.cX = this.dF();
            this.cY = this.dH();
         }

         this.cZ = this.aE();
         this.dk = this.cB.m.H().c();
      }
   }

   private void G() {
      boolean $$0 = this.cb();
      if ($$0 != this.dc) {
         ahx.a $$1 = $$0 ? ahx.a.d : ahx.a.e;
         this.cz.b(new ahx(this, $$1));
         this.dc = $$0;
      }
   }

   public boolean a(boolean $$0) {
      ahw.a $$1 = $$0 ? ahw.a.d : ahw.a.e;
      cuk $$2 = this.gc().a($$0);
      this.cz.b(new ahw($$1, iz.c, je.a));
      return !$$2.e();
   }

   @Override
   public void a(bqo $$0) {
      super.a($$0);
      this.cz.b(new aim($$0));
   }

   @Override
   public void ga() {
      this.cz.b(new ahd(ahd.a.a));
      fey.c();
   }

   @Override
   protected void f(bri $$0, float $$1) {
      if (!this.b($$0)) {
         this.t(this.eA() - $$1);
      }
   }

   @Override
   public void r() {
      this.cz.b(new ahi(this.cb.j));
      this.e();
   }

   public void e() {
      super.r();
      this.cB.a(null);
   }

   public void F(float $$0) {
      if (this.de) {
         float $$1 = this.eA() - $$0;
         if ($$1 <= 0.0F) {
            this.t($$0);
            if ($$1 < 0.0F) {
               this.am = 10;
            }
         } else {
            this.bm = $$1;
            this.am = 20;
            this.t($$0);
            this.aP = 10;
            this.aO = this.aP;
         }
      } else {
         this.t($$0);
         this.de = true;
      }
   }

   @Override
   public void y() {
      this.cz.b(new ahv(this.gd()));
   }

   @Override
   public boolean g() {
      return true;
   }

   @Override
   public boolean fD() {
      return !this.gd().b && super.fD();
   }

   @Override
   public boolean bq() {
      return !this.gd().b && super.bq();
   }

   @Override
   public boolean dW() {
      return !this.gd().b && super.dW();
   }

   protected void h() {
      this.cz.b(new ahx(this, ahx.a.f, ayu.d(this.v() * 100.0F)));
   }

   public void i() {
      this.cz.b(new ahx(this, ahx.a.h));
   }

   public awh j() {
      return this.cQ;
   }

   public fen m() {
      return this.cR;
   }

   public void a(cys<?> $$0) {
      if (this.cR.d($$0)) {
         this.cR.e($$0);
         this.cz.b(new aia($$0));
      }
   }

   @Override
   protected int F() {
      return this.cT;
   }

   public void a(int $$0) {
      this.cT = $$0;
   }

   @Override
   public void a(xl $$0, boolean $$1) {
      this.cB.aY().a($$0, $$1);
   }

   private void c(double $$0, double $$1) {
      iz $$2 = iz.a($$0, this.dw(), $$1);
      if (this.d($$2)) {
         double $$3 = $$0 - (double)$$2.u();
         double $$4 = $$1 - (double)$$2.w();
         je $$5 = null;
         double $$6 = Double.MAX_VALUE;
         je[] $$7 = new je[]{je.e, je.f, je.c, je.d};

         for (je $$8 : $$7) {
            double $$9 = $$8.o().a($$3, 0.0, $$4);
            double $$10 = $$8.f() == je.b.a ? 1.0 - $$9 : $$9;
            if ($$10 < $$6 && !this.d($$2.a($$8))) {
               $$6 = $$10;
               $$5 = $$8;
            }
         }

         if ($$5 != null) {
            evm $$11 = this.ds();
            if ($$5.o() == je.a.a) {
               this.o(0.1 * (double)$$5.j(), $$11.d, $$11.e);
            } else {
               this.o($$11.c, $$11.d, 0.1 * (double)$$5.l());
            }
         }
      }
   }

   private boolean d(iz $$0) {
      evh $$1 = this.cK();
      evh $$2 = new evh((double)$$0.u(), $$1.b, (double)$$0.w(), (double)$$0.u() + 1.0, $$1.e, (double)$$0.w() + 1.0).h(1.0E-7);
      return this.dP().f(this, $$2);
   }

   public void a(float $$0, int $$1, int $$2) {
      this.cq = $$0;
      this.cp = $$1;
      this.co = $$2;
   }

   @Override
   public void a(xl $$0) {
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
      this.do = $$0;
   }

   public boolean o() {
      return this.do;
   }

   public void v(boolean $$0) {
      this.dp = $$0;
   }

   public boolean p() {
      return this.dp;
   }

   @Override
   public void a(avv $$0, float $$1, float $$2) {
      this.dP().a(this.du(), this.dw(), this.dA(), $$0, this.de(), $$1, $$2, false);
   }

   @Override
   public void a(avv $$0, avx $$1, float $$2, float $$3) {
      this.dP().a(this.du(), this.dw(), this.dA(), $$0, $$1, $$2, $$3, false);
   }

   @Override
   public boolean db() {
      return true;
   }

   @Override
   public void c(bqo $$0) {
      cuk $$1 = this.b($$0);
      if (!$$1.e() && !this.fv()) {
         super.c($$0);
         this.dh = true;
         this.di = $$0;
      }
   }

   @Override
   public boolean fv() {
      return this.dh;
   }

   @Override
   public void fB() {
      super.fB();
      this.dh = false;
   }

   @Override
   public bqo fw() {
      return Objects.requireNonNullElse(this.di, bqo.a);
   }

   @Override
   public void a(akg<?> $$0) {
      super.a($$0);
      if (aF.equals($$0)) {
         boolean $$1 = (this.ao.a(aF) & 1) > 0;
         bqo $$2 = (this.ao.a(aF) & 2) > 0 ? bqo.b : bqo.a;
         if ($$1 && !this.dh) {
            this.c($$2);
         } else if (!$$1 && this.dh) {
            this.fB();
         }
      }

      if (ap.equals($$0) && this.fE() && !this.dm) {
         this.cB.aj().a((gsi)(new gry(this)));
      }
   }

   @Nullable
   public btv u() {
      if (this.dd() instanceof btv $$0 && $$0.a()) {
         return $$0;
      }

      return null;
   }

   public float v() {
      return this.dg;
   }

   @Override
   public boolean Y() {
      return this.cB.aS();
   }

   @Override
   public void a(dqm $$0, boolean $$1) {
      if ($$0 instanceof dpz $$2) {
         this.cB.a(new fou($$2, $$1, this.cB.aS()));
      } else {
         this.cB.a(new fph($$0, $$1, this.cB.aS()));
      }
   }

   @Override
   public void a(dau $$0) {
      this.cB.a(new fpe($$0));
   }

   @Override
   public void a(dpm $$0) {
      this.cB.a(new fog($$0));
   }

   @Override
   public void a(dqr $$0) {
      this.cB.a(new fpl($$0));
   }

   @Override
   public void a(dqc $$0) {
      this.cB.a(new foz($$0));
   }

   @Override
   public void a(cuk $$0, bqo $$1) {
      if ($$0.a(cun.tZ)) {
         this.cB.a(new foc(this, $$0, $$1));
      }
   }

   @Override
   public void b(bsp $$0) {
      this.cB.g.a($$0, lj.f);
   }

   @Override
   public void c(bsp $$0) {
      this.cB.g.a($$0, lj.r);
   }

   @Override
   public boolean bV() {
      return this.cA != null && this.cA.h;
   }

   @Override
   public boolean ca() {
      return this.da;
   }

   @Override
   public boolean w() {
      return this.ca() || this.ce();
   }

   @Override
   public void fq() {
      super.fq();
      if (this.z()) {
         this.bo = this.cA.a;
         this.bq = this.cA.b;
         this.bn = this.cA.g;
         this.cF = this.cD;
         this.cG = this.cE;
         this.cE = this.cE + (this.dH() - this.cE) * 0.5F;
         this.cD = this.cD + (this.dF() - this.cD) * 0.5F;
      }
   }

   @Override
   protected boolean z() {
      return this.cB.an() == this;
   }

   @Override
   public void A() {
      this.b(btw.a);
      if (this.dP() != null) {
         for (double $$0 = this.dw(); $$0 > (double)this.dP().I_() && $$0 < (double)this.dP().am(); $$0++) {
            this.a_(this.du(), $$0, this.dA());
            if (this.dP().g(this)) {
               break;
            }
         }

         this.h(evm.b);
         this.s(0.0F);
      }

      this.t(this.eR());
      this.aQ = 0;
   }

   @Override
   public void n_() {
      if (this.cC > 0) {
         this.cC--;
      }

      if (!(this.cB.y instanceof fmw)) {
         this.H();
      }

      boolean $$0 = this.cA.g;
      boolean $$1 = this.cA.h;
      boolean $$2 = this.N();
      cmp $$3 = this.gd();
      this.da = !$$3.b && !this.cc() && !this.bR() && this.h(btw.f) && (this.bV() || !this.fL() && !this.h(btw.a));
      float $$4 = ayu.a(0.3F + czw.b(this), 0.0F, 1.0F);
      this.cA.a(this.w(), $$4);
      this.cB.aA().a(this.cA);
      if (this.fv() && !this.bR()) {
         this.cA.a *= 0.2F;
         this.cA.b *= 0.2F;
         this.cC = 0;
      }

      boolean $$5 = false;
      if (this.dl > 0) {
         this.dl--;
         $$5 = true;
         this.cA.g = true;
      }

      if (!this.ag) {
         this.c(this.du() - (double)this.dj() * 0.35, this.dA() + (double)this.dj() * 0.35);
         this.c(this.du() - (double)this.dj() * 0.35, this.dA() - (double)this.dj() * 0.35);
         this.c(this.du() + (double)this.dj() * 0.35, this.dA() - (double)this.dj() * 0.35);
         this.c(this.du() + (double)this.dj() * 0.35, this.dA() + (double)this.dj() * 0.35);
      }

      if ($$1) {
         this.cC = 0;
      }

      boolean $$6 = this.M();
      boolean $$7 = this.bR() ? this.dc().aE() : this.aE();
      boolean $$8 = !$$1 && !$$2;
      if (($$7 || this.bj()) && $$8 && $$6) {
         if (this.cC <= 0 && !this.cB.m.C.e()) {
            this.cC = 7;
         } else {
            this.h(true);
         }
      }

      if ((!this.be() || this.bj()) && $$6 && this.cB.m.C.e()) {
         this.h(true);
      }

      if (this.cb()) {
         boolean $$9 = !this.cA.b() || !this.O();
         boolean $$10 = $$9 || this.Q && !this.T || this.be() && !this.bj();
         if (this.cc()) {
            if (!this.aE() && !this.cA.h && $$9 || !this.be()) {
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
               this.y();
            }
         } else if (!$$0 && this.cA.g && !$$5) {
            if (this.cd == 0) {
               this.cd = 7;
            } else if (!this.cc()) {
               $$3.b = !$$3.b;
               if ($$3.b && this.aE()) {
                  this.fj();
               }

               $$11 = true;
               this.y();
               this.cd = 0;
            }
         }
      }

      if (this.cA.g && !$$11 && !$$0 && !$$3.b && !this.bR() && !this.q_()) {
         cuk $$12 = this.a(bsw.e);
         if ($$12.a(cun.nT) && ctg.j($$12) && this.gh()) {
            this.cz.b(new ahx(this, ahx.a.i));
         }
      }

      this.dm = this.fE();
      if (this.be() && this.cA.h && this.ef()) {
         this.fk();
      }

      if (this.a(awr.a)) {
         int $$13 = this.N_() ? 10 : 1;
         this.dn = ayu.a(this.dn + $$13, 0, 600);
      } else if (this.dn > 0) {
         this.a(awr.a);
         this.dn = ayu.a(this.dn - 10, 0, 600);
      }

      if ($$3.b && this.z()) {
         int $$14 = 0;
         if (this.cA.h) {
            $$14--;
         }

         if (this.cA.g) {
            $$14++;
         }

         if ($$14 != 0) {
            this.h(this.ds().b(0.0, (double)((float)$$14 * $$3.a() * 3.0F), 0.0));
         }
      }

      btv $$15 = this.u();
      if ($$15 != null && $$15.c() == 0) {
         if (this.df < 0) {
            this.df++;
            if (this.df == 0) {
               this.dg = 0.0F;
            }
         }

         if ($$0 && !this.cA.g) {
            this.df = -10;
            $$15.b(ayu.d(this.v() * 100.0F));
            this.h();
         } else if (!$$0 && this.cA.g) {
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

      super.n_();
      if (this.aE() && $$3.b && !this.cB.q.h()) {
         $$3.b = false;
         this.y();
      }
   }

   @Override
   protected void eg() {
      this.aQ++;
      if (this.aQ == 20) {
         this.a(bsp.c.a);
      }
   }

   private void H() {
      this.cI = this.cH;
      float $$0 = 0.0F;
      if (this.aw) {
         if (this.cB.y != null && !this.cB.y.k() && !(this.cB.y instanceof flw)) {
            if (this.cB.y instanceof fnw) {
               this.r();
            }

            this.cB.a(null);
         }

         if (this.cH == 0.0F) {
            this.cB.aj().a(gsd.b(avw.uG, this.ah.i() * 0.4F + 0.8F, 0.25F));
         }

         $$0 = 0.0125F;
         this.aw = false;
      } else if (this.b(brz.i) && !this.c(brz.i).a(60)) {
         $$0 = 0.006666667F;
      } else if (this.cH > 0.0F) {
         $$0 = -0.05F;
      }

      this.cH = ayu.a(this.cH + $$0, 0.0F, 1.0F);
      this.L();
   }

   @Override
   public void t() {
      super.t();
      this.dj = false;
      if (this.dd() instanceof coq $$0) {
         $$0.a(this.cA.e, this.cA.f, this.cA.c, this.cA.d);
         this.dj = this.dj | (this.cA.e || this.cA.f || this.cA.c || this.cA.d);
      }
   }

   public boolean B() {
      return this.dj;
   }

   @Nullable
   @Override
   public brx d(ji<brv> $$0) {
      if ($$0.a(brz.i)) {
         this.cI = 0.0F;
         this.cH = 0.0F;
      }

      return super.d($$0);
   }

   @Override
   public void a(btp $$0, evm $$1) {
      double $$2 = this.du();
      double $$3 = this.dA();
      super.a($$0, $$1);
      this.f((float)(this.du() - $$2), (float)(this.dA() - $$3));
   }

   public boolean C() {
      return this.dk;
   }

   protected void f(float $$0, float $$1) {
      if (this.I()) {
         evm $$2 = this.dn();
         evm $$3 = $$2.b((double)$$0, 0.0, (double)$$1);
         evm $$4 = new evm((double)$$0, 0.0, (double)$$1);
         float $$5 = this.fn();
         float $$6 = (float)$$4.g();
         if ($$6 <= 0.001F) {
            evl $$7 = this.cA.a();
            float $$8 = $$5 * $$7.i;
            float $$9 = $$5 * $$7.j;
            float $$10 = ayu.a(this.dF() * (float) (Math.PI / 180.0));
            float $$11 = ayu.b(this.dF() * (float) (Math.PI / 180.0));
            $$4 = new evm((double)($$8 * $$11 - $$9 * $$10), $$4.d, (double)($$9 * $$11 + $$8 * $$10));
            $$6 = (float)$$4.g();
            if ($$6 <= 0.001F) {
               return;
            }
         }

         float $$12 = ayu.i($$6);
         evm $$13 = $$4.a((double)$$12);
         evm $$14 = this.bN();
         float $$15 = (float)($$14.c * $$13.c + $$14.e * $$13.e);
         if (!($$15 < -0.15F)) {
            evr $$16 = evr.a(this);
            iz $$17 = iz.a(this.du(), this.cK().e, this.dA());
            drx $$18 = this.dP().a_($$17);
            if ($$18.b(this.dP(), $$17, $$16).c()) {
               $$17 = $$17.c();
               drx $$19 = this.dP().a_($$17);
               if ($$19.b(this.dP(), $$17, $$16).c()) {
                  float $$20 = 7.0F;
                  float $$21 = 1.2F;
                  if (this.b(brz.h)) {
                     $$21 += (float)(this.c(brz.h).e() + 1) * 0.75F;
                  }

                  float $$22 = Math.max($$5 * 7.0F, 1.0F / $$12);
                  evm $$24 = $$3.e($$13.a((double)$$22));
                  float $$25 = this.dj();
                  float $$26 = this.dk();
                  evh $$27 = new evh($$2, $$24.b(0.0, (double)$$26, 0.0)).c((double)$$25, 0.0, (double)$$25);
                  evm $$23 = $$2.b(0.0, 0.51F, 0.0);
                  $$24 = $$24.b(0.0, 0.51F, 0.0);
                  evm $$28 = $$13.c(new evm(0.0, 1.0, 0.0));
                  evm $$29 = $$28.a((double)($$25 * 0.5F));
                  evm $$30 = $$23.d($$29);
                  evm $$31 = $$24.d($$29);
                  evm $$32 = $$23.e($$29);
                  evm $$33 = $$24.e($$29);
                  Iterable<ewf> $$34 = this.dP().d(this, $$27);
                  Iterator<evh> $$35 = StreamSupport.stream($$34.spliterator(), false).flatMap($$0x -> $$0x.e().stream()).iterator();
                  float $$36 = Float.MIN_VALUE;

                  while ($$35.hasNext()) {
                     evh $$37 = $$35.next();
                     if ($$37.a($$30, $$31) || $$37.a($$32, $$33)) {
                        $$36 = (float)$$37.e;
                        evm $$38 = $$37.f();
                        iz $$39 = iz.a($$38);

                        for (int $$40 = 1; (float)$$40 < $$21; $$40++) {
                           iz $$41 = $$39.b($$40);
                           drx $$42 = this.dP().a_($$41);
                           ewf $$43;
                           if (!($$43 = $$42.b(this.dP(), $$41, $$16)).c()) {
                              $$36 = (float)$$43.c(je.a.b) + (float)$$41.v();
                              if ((double)$$36 - this.dw() > (double)$$21) {
                                 return;
                              }
                           }

                           if ($$40 > 1) {
                              $$17 = $$17.c();
                              drx $$44 = this.dP().a_($$17);
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
                        this.dl = 1;
                     }
                  }
               }
            }
         }
      }
   }

   @Override
   protected boolean c(evm $$0) {
      float $$1 = this.dF() * (float) (Math.PI / 180.0);
      double $$2 = (double)ayu.a($$1);
      double $$3 = (double)ayu.b($$1);
      double $$4 = (double)this.bo * $$3 - (double)this.bq * $$2;
      double $$5 = (double)this.bq * $$3 + (double)this.bo * $$2;
      double $$6 = ayu.k($$4) + ayu.k($$5);
      double $$7 = ayu.k($$0.c) + ayu.k($$0.e);
      if (!($$6 < 1.0E-5F) && !($$7 < 1.0E-5F)) {
         double $$8 = $$4 * $$0.c + $$5 * $$0.e;
         double $$9 = Math.acos($$8 / Math.sqrt($$6 * $$7));
         return $$9 < 0.13962634F;
      } else {
         return false;
      }
   }

   private boolean I() {
      return this.C() && this.dl <= 0 && this.aE() && !this.fT() && !this.bR() && this.K() && (double)this.aM() >= 1.0;
   }

   private boolean K() {
      evl $$0 = this.cA.a();
      return $$0.i != 0.0F || $$0.j != 0.0F;
   }

   private boolean M() {
      return !this.cb() && this.N() && this.O() && !this.fv() && !this.b(brz.o) && (!this.bR() || this.d(this.dc())) && !this.fE();
   }

   private boolean d(bsp $$0) {
      return $$0.dI() && $$0.da();
   }

   private boolean N() {
      double $$0 = 0.8;
      return this.bj() ? this.cA.b() : (double)this.cA.b >= 0.8;
   }

   private boolean O() {
      return this.bR() || (float)this.gm().a() > 6.0F || this.gd().c;
   }

   public float D() {
      if (!this.a(awr.a)) {
         return 0.0F;
      } else {
         float $$0 = 600.0F;
         float $$1 = 100.0F;
         if ((float)this.dn >= 600.0F) {
            return 1.0F;
         } else {
            float $$2 = ayu.a((float)this.dn / 100.0F, 0.0F, 1.0F);
            float $$3 = (float)this.dn < 100.0F ? 0.0F : ayu.a(((float)this.dn - 100.0F) / 500.0F, 0.0F, 1.0F);
            return $$2 * 0.6F + $$3 * 0.39999998F;
         }
      }
   }

   public void a(dbq $$0) {
      if ($$0 == dbq.d) {
         this.h(this.ds().a(je.a.b, 0.0));
      }
   }

   @Override
   public boolean bj() {
      return this.cn;
   }

   @Override
   protected boolean fU() {
      boolean $$0 = this.cn;
      boolean $$1 = super.fU();
      if (this.N_()) {
         return this.cn;
      } else {
         if (!$$0 && $$1) {
            this.dP().a(this.du(), this.dw(), this.dA(), avw.x, avx.i, 1.0F, 1.0F, false);
            this.cB.aj().a((gsi)(new gsl.b(this)));
         }

         if ($$0 && !$$1) {
            this.dP().a(this.du(), this.dw(), this.dA(), avw.y, avx.i, 1.0F, 1.0F, false);
         }

         return this.cn;
      }
   }

   @Override
   public evm q(float $$0) {
      if (this.cB.m.aA().a()) {
         float $$1 = ayu.i($$0 * 0.5F, this.dF(), this.O) * (float) (Math.PI / 180.0);
         float $$2 = ayu.i($$0 * 0.5F, this.dH(), this.P) * (float) (Math.PI / 180.0);
         double $$3 = this.fu() == bte.b ? -1.0 : 1.0;
         evm $$4 = new evm(0.39 * $$3, -0.6, 0.3);
         return $$4.a(-$$2).b(-$$1).e(this.j($$0));
      } else {
         return super.q($$0);
      }
   }

   @Override
   public void a(cuk $$0, cuk $$1, cpx $$2) {
      this.cB.aA().a($$0, $$1, $$2);
   }

   @Override
   public float dG() {
      return this.dF();
   }
}
