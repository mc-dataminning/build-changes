import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gbm extends gbj {
   public static final Logger g = LogUtils.getLogger();
   private static final int cJ = 20;
   private static final int cK = 600;
   private static final int cL = 100;
   private static final float cM = 0.6F;
   private static final double cN = 0.35;
   private static final double cO = 0.13962634F;
   private static final float cP = 0.3F;
   public final fws cz;
   private final avt cQ;
   private final fdo cR;
   private final List<gqt> cS = Lists.newArrayList();
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
   public gbk cA;
   protected final feb cB;
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
   private bpv di;
   private boolean dj;
   private boolean dk = true;
   private int dl;
   private boolean dm;
   private int dn;
   private boolean do = true;
   private boolean dp = false;

   public gbm(feb $$0, fwr $$1, fws $$2, avt $$3, fdo $$4, boolean $$5, boolean $$6) {
      super($$1, $$2.p());
      this.cB = $$0;
      this.cz = $$2;
      this.cQ = $$3;
      this.cR = $$4;
      this.db = $$5;
      this.dc = $$6;
      this.cS.add(new grl(this, $$0.aj()));
      this.cS.add(new gqy(this));
      this.cS.add(new gqx(this, $$0.aj(), $$1.F_()));
   }

   @Override
   public boolean a(bqp $$0, float $$1) {
      return false;
   }

   @Override
   public void c(float $$0) {
   }

   @Override
   public boolean a(brw $$0, boolean $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         if ($$0 instanceof cnt) {
            this.cB.aj().a((grj)(new grd(this, (cnt)$$0, true)));
            this.cB.aj().a((grj)(new grd(this, (cnt)$$0, false)));
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
            this.cz.b(new ahc.c(this.dF(), this.dH(), this.aE()));
            this.cz.b(new ahk(this.bo, this.bq, this.cA.g, this.cA.h));
            brw $$0 = this.cZ();
            if ($$0 != this && $$0.da()) {
               this.cz.b(new ahd($$0));
               this.G();
            }
         } else {
            this.E();
         }

         for (gqt $$1 : this.cS) {
            $$1.a();
         }
      }
   }

   public float d() {
      for (gqt $$0 : this.cS) {
         if ($$0 instanceof gqx) {
            return ((gqx)$$0).b();
         }
      }

      return 0.0F;
   }

   private void E() {
      this.G();
      boolean $$0 = this.bV();
      if ($$0 != this.db) {
         ahj.a $$1 = $$0 ? ahj.a.a : ahj.a.b;
         this.cz.b(new ahj(this, $$1));
         this.db = $$0;
      }

      if (this.z()) {
         double $$2 = this.du() - this.cU;
         double $$3 = this.dw() - this.cV;
         double $$4 = this.dA() - this.cW;
         double $$5 = (double)(this.dF() - this.cX);
         double $$6 = (double)(this.dH() - this.cY);
         this.dd++;
         boolean $$7 = ayf.f($$2, $$3, $$4) > ayf.k(2.0E-4) || this.dd >= 20;
         boolean $$8 = $$5 != 0.0 || $$6 != 0.0;
         if (this.bR()) {
            eum $$9 = this.ds();
            this.cz.b(new ahc.b($$9.c, -999.0, $$9.e, this.dF(), this.dH(), this.aE()));
            $$7 = false;
         } else if ($$7 && $$8) {
            this.cz.b(new ahc.b(this.du(), this.dw(), this.dA(), this.dF(), this.dH(), this.aE()));
         } else if ($$7) {
            this.cz.b(new ahc.a(this.du(), this.dw(), this.dA(), this.aE()));
         } else if ($$8) {
            this.cz.b(new ahc.c(this.dF(), this.dH(), this.aE()));
         } else if (this.cZ != this.aE()) {
            this.cz.b(new ahc.d(this.aE()));
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
         ahj.a $$1 = $$0 ? ahj.a.d : ahj.a.e;
         this.cz.b(new ahj(this, $$1));
         this.dc = $$0;
      }
   }

   public boolean a(boolean $$0) {
      ahi.a $$1 = $$0 ? ahi.a.d : ahi.a.e;
      ctq $$2 = this.gc().a($$0);
      this.cz.b(new ahi($$1, io.c, it.a));
      return !$$2.e();
   }

   @Override
   public void a(bpv $$0) {
      super.a($$0);
      this.cz.b(new ahy($$0));
   }

   @Override
   public void ga() {
      this.cz.b(new agp(agp.a.a));
      fdz.c();
   }

   @Override
   protected void f(bqp $$0, float $$1) {
      if (!this.b($$0)) {
         this.t(this.eA() - $$1);
      }
   }

   @Override
   public void r() {
      this.cz.b(new agu(this.cb.j));
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
      this.cz.b(new ahh(this.gd()));
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
      this.cz.b(new ahj(this, ahj.a.f, ayf.d(this.v() * 100.0F)));
   }

   public void i() {
      this.cz.b(new ahj(this, ahj.a.h));
   }

   public avt j() {
      return this.cQ;
   }

   public fdo m() {
      return this.cR;
   }

   public void a(cxy<?> $$0) {
      if (this.cR.d($$0)) {
         this.cR.e($$0);
         this.cz.b(new ahm($$0));
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
   public void a(wx $$0, boolean $$1) {
      this.cB.aY().a($$0, $$1);
   }

   private void c(double $$0, double $$1) {
      io $$2 = io.a($$0, this.dw(), $$1);
      if (this.d($$2)) {
         double $$3 = $$0 - (double)$$2.u();
         double $$4 = $$1 - (double)$$2.w();
         it $$5 = null;
         double $$6 = Double.MAX_VALUE;
         it[] $$7 = new it[]{it.e, it.f, it.c, it.d};

         for (it $$8 : $$7) {
            double $$9 = $$8.o().a($$3, 0.0, $$4);
            double $$10 = $$8.f() == it.b.a ? 1.0 - $$9 : $$9;
            if ($$10 < $$6 && !this.d($$2.a($$8))) {
               $$6 = $$10;
               $$5 = $$8;
            }
         }

         if ($$5 != null) {
            eum $$11 = this.ds();
            if ($$5.o() == it.a.a) {
               this.o(0.1 * (double)$$5.j(), $$11.d, $$11.e);
            } else {
               this.o($$11.c, $$11.d, 0.1 * (double)$$5.l());
            }
         }
      }
   }

   private boolean d(io $$0) {
      euh $$1 = this.cK();
      euh $$2 = new euh((double)$$0.u(), $$1.b, (double)$$0.w(), (double)$$0.u() + 1.0, $$1.e, (double)$$0.w() + 1.0).h(1.0E-7);
      return this.dP().f(this, $$2);
   }

   public void a(float $$0, int $$1, int $$2) {
      this.cq = $$0;
      this.cp = $$1;
      this.co = $$2;
   }

   @Override
   public void a(wx $$0) {
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
   public void a(avh $$0, float $$1, float $$2) {
      this.dP().a(this.du(), this.dw(), this.dA(), $$0, this.de(), $$1, $$2, false);
   }

   @Override
   public void a(avh $$0, avj $$1, float $$2, float $$3) {
      this.dP().a(this.du(), this.dw(), this.dA(), $$0, $$1, $$2, $$3, false);
   }

   @Override
   public boolean db() {
      return true;
   }

   @Override
   public void c(bpv $$0) {
      ctq $$1 = this.b($$0);
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
   public bpv fw() {
      return Objects.requireNonNullElse(this.di, bpv.a);
   }

   @Override
   public void a(ajs<?> $$0) {
      super.a($$0);
      if (aF.equals($$0)) {
         boolean $$1 = (this.ao.a(aF) & 1) > 0;
         bpv $$2 = (this.ao.a(aF) & 2) > 0 ? bpv.b : bpv.a;
         if ($$1 && !this.dh) {
            this.c($$2);
         } else if (!$$1 && this.dh) {
            this.fB();
         }
      }

      if (ap.equals($$0) && this.fE() && !this.dm) {
         this.cB.aj().a((grj)(new gqz(this)));
      }
   }

   @Nullable
   public btb u() {
      if (this.dd() instanceof btb $$0 && $$0.a()) {
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
   public void a(dps $$0, boolean $$1) {
      if ($$0 instanceof dpf $$2) {
         this.cB.a(new fnu($$2, $$1, this.cB.aS()));
      } else {
         this.cB.a(new foh($$0, $$1, this.cB.aS()));
      }
   }

   @Override
   public void a(daa $$0) {
      this.cB.a(new foe($$0));
   }

   @Override
   public void a(dos $$0) {
      this.cB.a(new fnh($$0));
   }

   @Override
   public void a(dpx $$0) {
      this.cB.a(new fol($$0));
   }

   @Override
   public void a(dpi $$0) {
      this.cB.a(new fnz($$0));
   }

   @Override
   public void a(ctq $$0, bpv $$1) {
      if ($$0.a(ctt.tZ)) {
         this.cB.a(new fnd(this, $$0, $$1));
      }
   }

   @Override
   public void b(brw $$0) {
      this.cB.g.a($$0, ky.f);
   }

   @Override
   public void c(brw $$0) {
      this.cB.g.a($$0, ky.r);
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
      this.b(btc.a);
      if (this.dP() != null) {
         for (double $$0 = this.dw(); $$0 > (double)this.dP().I_() && $$0 < (double)this.dP().al(); $$0++) {
            this.a_(this.du(), $$0, this.dA());
            if (this.dP().g(this)) {
               break;
            }
         }

         this.g(eum.b);
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

      if (!(this.cB.y instanceof flx)) {
         this.H();
      }

      boolean $$0 = this.cA.g;
      boolean $$1 = this.cA.h;
      boolean $$2 = this.N();
      this.da = !this.gd().b && !this.cc() && !this.bR() && this.h(btc.f) && (this.bV() || !this.fL() && !this.h(btc.a));
      float $$3 = ayf.a(0.3F + czc.b(this), 0.0F, 1.0F);
      this.cA.a(this.w(), $$3);
      this.cB.aA().a(this.cA);
      if (this.fv() && !this.bR()) {
         this.cA.a *= 0.2F;
         this.cA.b *= 0.2F;
         this.cC = 0;
      }

      boolean $$4 = false;
      if (this.dl > 0) {
         this.dl--;
         $$4 = true;
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

      boolean $$5 = this.M();
      boolean $$6 = this.bR() ? this.dc().aE() : this.aE();
      boolean $$7 = !$$1 && !$$2;
      if (($$6 || this.bj()) && $$7 && $$5) {
         if (this.cC <= 0 && !this.cB.m.C.e()) {
            this.cC = 7;
         } else {
            this.h(true);
         }
      }

      if ((!this.be() || this.bj()) && $$5 && this.cB.m.C.e()) {
         this.h(true);
      }

      if (this.cb()) {
         boolean $$8 = !this.cA.b() || !this.O();
         boolean $$9 = $$8 || this.Q && !this.T || this.be() && !this.bj();
         if (this.cc()) {
            if (!this.aE() && !this.cA.h && $$8 || !this.be()) {
               this.h(false);
            }
         } else if ($$9) {
            this.h(false);
         }
      }

      boolean $$10 = false;
      if (this.gd().c) {
         if (this.cB.q.h()) {
            if (!this.gd().b) {
               this.gd().b = true;
               $$10 = true;
               this.y();
            }
         } else if (!$$0 && this.cA.g && !$$4) {
            if (this.cd == 0) {
               this.cd = 7;
            } else if (!this.cc()) {
               this.gd().b = !this.gd().b;
               $$10 = true;
               this.y();
               this.cd = 0;
            }
         }
      }

      if (this.cA.g && !$$10 && !$$0 && !this.gd().b && !this.bR() && !this.q_()) {
         ctq $$11 = this.a(bsd.e);
         if ($$11.a(ctt.nT) && csm.j($$11) && this.gh()) {
            this.cz.b(new ahj(this, ahj.a.i));
         }
      }

      this.dm = this.fE();
      if (this.be() && this.cA.h && this.ef()) {
         this.fk();
      }

      if (this.a(awc.a)) {
         int $$12 = this.N_() ? 10 : 1;
         this.dn = ayf.a(this.dn + $$12, 0, 600);
      } else if (this.dn > 0) {
         this.a(awc.a);
         this.dn = ayf.a(this.dn - 10, 0, 600);
      }

      if (this.gd().b && this.z()) {
         int $$13 = 0;
         if (this.cA.h) {
            $$13--;
         }

         if (this.cA.g) {
            $$13++;
         }

         if ($$13 != 0) {
            this.g(this.ds().b(0.0, (double)((float)$$13 * this.gd().a() * 3.0F), 0.0));
         }
      }

      btb $$14 = this.u();
      if ($$14 != null && $$14.c() == 0) {
         if (this.df < 0) {
            this.df++;
            if (this.df == 0) {
               this.dg = 0.0F;
            }
         }

         if ($$0 && !this.cA.g) {
            this.df = -10;
            $$14.b(ayf.d(this.v() * 100.0F));
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
      if (this.aE() && this.gd().b && !this.cB.q.h()) {
         this.gd().b = false;
         this.y();
      }
   }

   @Override
   protected void eg() {
      this.aQ++;
      if (this.aQ == 20) {
         this.a(brw.c.a);
      }
   }

   private void H() {
      this.cI = this.cH;
      float $$0 = 0.0F;
      if (this.aw) {
         if (this.cB.y != null && !this.cB.y.k() && !(this.cB.y instanceof fkx)) {
            if (this.cB.y instanceof fmx) {
               this.r();
            }

            this.cB.a(null);
         }

         if (this.cH == 0.0F) {
            this.cB.aj().a(gre.b(avi.uG, this.ah.i() * 0.4F + 0.8F, 0.25F));
         }

         $$0 = 0.0125F;
         this.aw = false;
      } else if (this.b(brg.i) && !this.c(brg.i).a(60)) {
         $$0 = 0.006666667F;
      } else if (this.cH > 0.0F) {
         $$0 = -0.05F;
      }

      this.cH = ayf.a(this.cH + $$0, 0.0F, 1.0F);
      this.L();
   }

   @Override
   public void t() {
      super.t();
      this.dj = false;
      if (this.dd() instanceof cnv $$0) {
         $$0.a(this.cA.e, this.cA.f, this.cA.c, this.cA.d);
         this.dj = this.dj | (this.cA.e || this.cA.f || this.cA.c || this.cA.d);
      }
   }

   public boolean B() {
      return this.dj;
   }

   @Nullable
   @Override
   public bre d(ix<brc> $$0) {
      if ($$0.a(brg.i)) {
         this.cI = 0.0F;
         this.cH = 0.0F;
      }

      return super.d($$0);
   }

   @Override
   public void a(bsv $$0, eum $$1) {
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
         eum $$2 = this.dn();
         eum $$3 = $$2.b((double)$$0, 0.0, (double)$$1);
         eum $$4 = new eum((double)$$0, 0.0, (double)$$1);
         float $$5 = this.fn();
         float $$6 = (float)$$4.g();
         if ($$6 <= 0.001F) {
            eul $$7 = this.cA.a();
            float $$8 = $$5 * $$7.i;
            float $$9 = $$5 * $$7.j;
            float $$10 = ayf.a(this.dF() * (float) (Math.PI / 180.0));
            float $$11 = ayf.b(this.dF() * (float) (Math.PI / 180.0));
            $$4 = new eum((double)($$8 * $$11 - $$9 * $$10), $$4.d, (double)($$9 * $$11 + $$8 * $$10));
            $$6 = (float)$$4.g();
            if ($$6 <= 0.001F) {
               return;
            }
         }

         float $$12 = ayf.i($$6);
         eum $$13 = $$4.a((double)$$12);
         eum $$14 = this.bN();
         float $$15 = (float)($$14.c * $$13.c + $$14.e * $$13.e);
         if (!($$15 < -0.15F)) {
            eur $$16 = eur.a(this);
            io $$17 = io.a(this.du(), this.cK().e, this.dA());
            drd $$18 = this.dP().a_($$17);
            if ($$18.b(this.dP(), $$17, $$16).c()) {
               $$17 = $$17.c();
               drd $$19 = this.dP().a_($$17);
               if ($$19.b(this.dP(), $$17, $$16).c()) {
                  float $$20 = 7.0F;
                  float $$21 = 1.2F;
                  if (this.b(brg.h)) {
                     $$21 += (float)(this.c(brg.h).e() + 1) * 0.75F;
                  }

                  float $$22 = Math.max($$5 * 7.0F, 1.0F / $$12);
                  eum $$24 = $$3.e($$13.a((double)$$22));
                  float $$25 = this.dj();
                  float $$26 = this.dk();
                  euh $$27 = new euh($$2, $$24.b(0.0, (double)$$26, 0.0)).c((double)$$25, 0.0, (double)$$25);
                  eum $$23 = $$2.b(0.0, 0.51F, 0.0);
                  $$24 = $$24.b(0.0, 0.51F, 0.0);
                  eum $$28 = $$13.c(new eum(0.0, 1.0, 0.0));
                  eum $$29 = $$28.a((double)($$25 * 0.5F));
                  eum $$30 = $$23.d($$29);
                  eum $$31 = $$24.d($$29);
                  eum $$32 = $$23.e($$29);
                  eum $$33 = $$24.e($$29);
                  Iterable<evf> $$34 = this.dP().d(this, $$27);
                  Iterator<euh> $$35 = StreamSupport.stream($$34.spliterator(), false).flatMap($$0x -> $$0x.e().stream()).iterator();
                  float $$36 = Float.MIN_VALUE;

                  while ($$35.hasNext()) {
                     euh $$37 = $$35.next();
                     if ($$37.a($$30, $$31) || $$37.a($$32, $$33)) {
                        $$36 = (float)$$37.e;
                        eum $$38 = $$37.f();
                        io $$39 = io.a($$38);

                        for (int $$40 = 1; (float)$$40 < $$21; $$40++) {
                           io $$41 = $$39.b($$40);
                           drd $$42 = this.dP().a_($$41);
                           evf $$43;
                           if (!($$43 = $$42.b(this.dP(), $$41, $$16)).c()) {
                              $$36 = (float)$$43.c(it.a.b) + (float)$$41.v();
                              if ((double)$$36 - this.dw() > (double)$$21) {
                                 return;
                              }
                           }

                           if ($$40 > 1) {
                              $$17 = $$17.c();
                              drd $$44 = this.dP().a_($$17);
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
   protected boolean c(eum $$0) {
      float $$1 = this.dF() * (float) (Math.PI / 180.0);
      double $$2 = (double)ayf.a($$1);
      double $$3 = (double)ayf.b($$1);
      double $$4 = (double)this.bo * $$3 - (double)this.bq * $$2;
      double $$5 = (double)this.bq * $$3 + (double)this.bo * $$2;
      double $$6 = ayf.k($$4) + ayf.k($$5);
      double $$7 = ayf.k($$0.c) + ayf.k($$0.e);
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
      eul $$0 = this.cA.a();
      return $$0.i != 0.0F || $$0.j != 0.0F;
   }

   private boolean M() {
      return !this.cb() && this.N() && this.O() && !this.fv() && !this.b(brg.o) && (!this.bR() || this.d(this.dc())) && !this.fE();
   }

   private boolean d(brw $$0) {
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
      if (!this.a(awc.a)) {
         return 0.0F;
      } else {
         float $$0 = 600.0F;
         float $$1 = 100.0F;
         if ((float)this.dn >= 600.0F) {
            return 1.0F;
         } else {
            float $$2 = ayf.a((float)this.dn / 100.0F, 0.0F, 1.0F);
            float $$3 = (float)this.dn < 100.0F ? 0.0F : ayf.a(((float)this.dn - 100.0F) / 500.0F, 0.0F, 1.0F);
            return $$2 * 0.6F + $$3 * 0.39999998F;
         }
      }
   }

   public void a(daw $$0) {
      if ($$0 == daw.d) {
         this.g(this.ds().a(it.a.b, 0.0));
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
            this.dP().a(this.du(), this.dw(), this.dA(), avi.x, avj.i, 1.0F, 1.0F, false);
            this.cB.aj().a((grj)(new grm.b(this)));
         }

         if ($$0 && !$$1) {
            this.dP().a(this.du(), this.dw(), this.dA(), avi.y, avj.i, 1.0F, 1.0F, false);
         }

         return this.cn;
      }
   }

   @Override
   public eum q(float $$0) {
      if (this.cB.m.aA().a()) {
         float $$1 = ayf.i($$0 * 0.5F, this.dF(), this.O) * (float) (Math.PI / 180.0);
         float $$2 = ayf.i($$0 * 0.5F, this.dH(), this.P) * (float) (Math.PI / 180.0);
         double $$3 = this.fu() == bsk.b ? -1.0 : 1.0;
         eum $$4 = new eum(0.39 * $$3, -0.6, 0.3);
         return $$4.a(-$$2).b(-$$1).e(this.j($$0));
      } else {
         return super.q($$0);
      }
   }

   @Override
   public void a(ctq $$0, ctq $$1, cpd $$2) {
      this.cB.aA().a($$0, $$1, $$2);
   }

   @Override
   public float dG() {
      return this.dF();
   }
}
