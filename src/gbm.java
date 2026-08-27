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
   public final fws h;
   private final avs cQ;
   private final fdm cR;
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
   protected final fdz cB;
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
   private bpt di;
   private boolean dj;
   private boolean dk = true;
   private int dl;
   private boolean dm;
   private int dn;
   private boolean do = true;
   private boolean dp = false;

   public gbm(fdz $$0, fwr $$1, fws $$2, avs $$3, fdm $$4, boolean $$5, boolean $$6) {
      super($$1, $$2.p());
      this.cB = $$0;
      this.h = $$2;
      this.cQ = $$3;
      this.cR = $$4;
      this.db = $$5;
      this.dc = $$6;
      this.cS.add(new grl(this, $$0.ak()));
      this.cS.add(new gqy(this));
      this.cS.add(new gqx(this, $$0.ak(), $$1.F_()));
   }

   @Override
   public boolean a(bqn $$0, float $$1) {
      return false;
   }

   @Override
   public void c(float $$0) {
   }

   @Override
   public boolean a(bru $$0, boolean $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         if ($$0 instanceof cnr) {
            this.cB.ak().a((grj)(new grd(this, (cnr)$$0, true)));
            this.cB.ak().a((grj)(new grd(this, (cnr)$$0, false)));
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
            this.h.b(new ahb.c(this.dF(), this.dH(), this.aE()));
            this.h.b(new ahj(this.bp, this.br, this.cA.g, this.cA.h));
            bru $$0 = this.cZ();
            if ($$0 != this && $$0.da()) {
               this.h.b(new ahc($$0));
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
         ahi.a $$1 = $$0 ? ahi.a.a : ahi.a.b;
         this.h.b(new ahi(this, $$1));
         this.db = $$0;
      }

      if (this.z()) {
         double $$2 = this.du() - this.cU;
         double $$3 = this.dw() - this.cV;
         double $$4 = this.dA() - this.cW;
         double $$5 = (double)(this.dF() - this.cX);
         double $$6 = (double)(this.dH() - this.cY);
         this.dd++;
         boolean $$7 = ayd.f($$2, $$3, $$4) > ayd.k(2.0E-4) || this.dd >= 20;
         boolean $$8 = $$5 != 0.0 || $$6 != 0.0;
         if (this.bR()) {
            euk $$9 = this.ds();
            this.h.b(new ahb.b($$9.c, -999.0, $$9.e, this.dF(), this.dH(), this.aE()));
            $$7 = false;
         } else if ($$7 && $$8) {
            this.h.b(new ahb.b(this.du(), this.dw(), this.dA(), this.dF(), this.dH(), this.aE()));
         } else if ($$7) {
            this.h.b(new ahb.a(this.du(), this.dw(), this.dA(), this.aE()));
         } else if ($$8) {
            this.h.b(new ahb.c(this.dF(), this.dH(), this.aE()));
         } else if (this.cZ != this.aE()) {
            this.h.b(new ahb.d(this.aE()));
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
         ahi.a $$1 = $$0 ? ahi.a.d : ahi.a.e;
         this.h.b(new ahi(this, $$1));
         this.dc = $$0;
      }
   }

   public boolean a(boolean $$0) {
      ahh.a $$1 = $$0 ? ahh.a.d : ahh.a.e;
      cto $$2 = this.gc().a($$0);
      this.h.b(new ahh($$1, io.c, it.a));
      return !$$2.e();
   }

   @Override
   public void a(bpt $$0) {
      super.a($$0);
      this.h.b(new ahx($$0));
   }

   @Override
   public void ga() {
      this.h.b(new ago(ago.a.a));
      fdx.c();
   }

   @Override
   protected void f(bqn $$0, float $$1) {
      if (!this.b($$0)) {
         this.t(this.eA() - $$1);
      }
   }

   @Override
   public void r() {
      this.h.b(new agt(this.cc.j));
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
            this.bn = $$1;
            this.am = 20;
            this.t($$0);
            this.aQ = 10;
            this.aP = this.aQ;
         }
      } else {
         this.t($$0);
         this.de = true;
      }
   }

   @Override
   public void y() {
      this.h.b(new ahg(this.gd()));
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
      this.h.b(new ahi(this, ahi.a.f, ayd.d(this.v() * 100.0F)));
   }

   public void i() {
      this.h.b(new ahi(this, ahi.a.h));
   }

   public avs j() {
      return this.cQ;
   }

   public fdm m() {
      return this.cR;
   }

   public void a(cxw<?> $$0) {
      if (this.cR.d($$0)) {
         this.cR.e($$0);
         this.h.b(new ahl($$0));
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
      this.cB.ba().a($$0, $$1);
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
            euk $$11 = this.ds();
            if ($$5.o() == it.a.a) {
               this.o(0.1 * (double)$$5.j(), $$11.d, $$11.e);
            } else {
               this.o($$11.c, $$11.d, 0.1 * (double)$$5.l());
            }
         }
      }
   }

   private boolean d(io $$0) {
      euf $$1 = this.cK();
      euf $$2 = new euf((double)$$0.u(), $$1.b, (double)$$0.w(), (double)$$0.u() + 1.0, $$1.e, (double)$$0.w() + 1.0).h(1.0E-7);
      return this.dP().f(this, $$2);
   }

   public void a(float $$0, int $$1, int $$2) {
      this.cr = $$0;
      this.cq = $$1;
      this.cp = $$2;
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
   public void a(avg $$0, float $$1, float $$2) {
      this.dP().a(this.du(), this.dw(), this.dA(), $$0, this.de(), $$1, $$2, false);
   }

   @Override
   public void a(avg $$0, avi $$1, float $$2, float $$3) {
      this.dP().a(this.du(), this.dw(), this.dA(), $$0, $$1, $$2, $$3, false);
   }

   @Override
   public boolean db() {
      return true;
   }

   @Override
   public void c(bpt $$0) {
      cto $$1 = this.b($$0);
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
   public bpt fw() {
      return Objects.requireNonNullElse(this.di, bpt.a);
   }

   @Override
   public void a(ajr<?> $$0) {
      super.a($$0);
      if (aG.equals($$0)) {
         boolean $$1 = (this.ao.a(aG) & 1) > 0;
         bpt $$2 = (this.ao.a(aG) & 2) > 0 ? bpt.b : bpt.a;
         if ($$1 && !this.dh) {
            this.c($$2);
         } else if (!$$1 && this.dh) {
            this.fB();
         }
      }

      if (ap.equals($$0) && this.fE() && !this.dm) {
         this.cB.ak().a((grj)(new gqz(this)));
      }
   }

   @Nullable
   public bsz u() {
      if (this.dd() instanceof bsz $$0 && $$0.a()) {
         return $$0;
      }

      return null;
   }

   public float v() {
      return this.dg;
   }

   @Override
   public boolean Y() {
      return this.cB.aT();
   }

   @Override
   public void a(dpq $$0, boolean $$1) {
      if ($$0 instanceof dpd $$2) {
         this.cB.a(new fnt($$2, $$1, this.cB.aT()));
      } else {
         this.cB.a(new fog($$0, $$1, this.cB.aT()));
      }
   }

   @Override
   public void a(czy $$0) {
      this.cB.a(new fod($$0));
   }

   @Override
   public void a(doq $$0) {
      this.cB.a(new fng($$0));
   }

   @Override
   public void a(dpv $$0) {
      this.cB.a(new fok($$0));
   }

   @Override
   public void a(dpg $$0) {
      this.cB.a(new fny($$0));
   }

   @Override
   public void a(cto $$0, bpt $$1) {
      if ($$0.a(ctr.tZ)) {
         this.cB.a(new fnc(this, $$0, $$1));
      }
   }

   @Override
   public void b(bru $$0) {
      this.cB.g.a($$0, ky.f);
   }

   @Override
   public void c(bru $$0) {
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
         this.bp = this.cA.a;
         this.br = this.cA.b;
         this.bo = this.cA.g;
         this.cF = this.cD;
         this.cG = this.cE;
         this.cE = this.cE + (this.dH() - this.cE) * 0.5F;
         this.cD = this.cD + (this.dF() - this.cD) * 0.5F;
      }
   }

   @Override
   protected boolean z() {
      return this.cB.ao() == this;
   }

   @Override
   public void A() {
      this.b(bta.a);
      if (this.dP() != null) {
         for (double $$0 = this.dw(); $$0 > (double)this.dP().I_() && $$0 < (double)this.dP().al(); $$0++) {
            this.a_(this.du(), $$0, this.dA());
            if (this.dP().g(this)) {
               break;
            }
         }

         this.g(euk.b);
         this.s(0.0F);
      }

      this.t(this.eR());
      this.aR = 0;
   }

   @Override
   public void n_() {
      if (this.cC > 0) {
         this.cC--;
      }

      if (!(this.cB.y instanceof flw)) {
         this.H();
      }

      boolean $$0 = this.cA.g;
      boolean $$1 = this.cA.h;
      boolean $$2 = this.N();
      this.da = !this.gd().b && !this.cc() && !this.bR() && this.h(bta.f) && (this.bV() || !this.fL() && !this.h(bta.a));
      float $$3 = ayd.a(0.3F + cza.b(this), 0.0F, 1.0F);
      this.cA.a(this.w(), $$3);
      this.cB.aB().a(this.cA);
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
         if (this.cC <= 0 && !this.cB.m.D.e()) {
            this.cC = 7;
         } else {
            this.h(true);
         }
      }

      if ((!this.be() || this.bj()) && $$5 && this.cB.m.D.e()) {
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
            if (this.ce == 0) {
               this.ce = 7;
            } else if (!this.cc()) {
               this.gd().b = !this.gd().b;
               $$10 = true;
               this.y();
               this.ce = 0;
            }
         }
      }

      if (this.cA.g && !$$10 && !$$0 && !this.gd().b && !this.bR() && !this.q_()) {
         cto $$11 = this.a(bsb.e);
         if ($$11.a(ctr.nT) && csk.j($$11) && this.gh()) {
            this.h.b(new ahi(this, ahi.a.i));
         }
      }

      this.dm = this.fE();
      if (this.be() && this.cA.h && this.ef()) {
         this.fk();
      }

      if (this.a(awb.a)) {
         int $$12 = this.N_() ? 10 : 1;
         this.dn = ayd.a(this.dn + $$12, 0, 600);
      } else if (this.dn > 0) {
         this.a(awb.a);
         this.dn = ayd.a(this.dn - 10, 0, 600);
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

      bsz $$14 = this.u();
      if ($$14 != null && $$14.c() == 0) {
         if (this.df < 0) {
            this.df++;
            if (this.df == 0) {
               this.dg = 0.0F;
            }
         }

         if ($$0 && !this.cA.g) {
            this.df = -10;
            $$14.b(ayd.d(this.v() * 100.0F));
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
      this.aR++;
      if (this.aR == 20) {
         this.a(bru.c.a);
      }
   }

   private void H() {
      this.cI = this.cH;
      float $$0 = 0.0F;
      if (this.aw) {
         if (this.cB.y != null && !this.cB.y.k() && !(this.cB.y instanceof fkw)) {
            if (this.cB.y instanceof fmw) {
               this.r();
            }

            this.cB.a(null);
         }

         if (this.cH == 0.0F) {
            this.cB.ak().a(gre.b(avh.uG, this.ah.i() * 0.4F + 0.8F, 0.25F));
         }

         $$0 = 0.0125F;
         this.aw = false;
      } else if (this.b(bre.i) && !this.c(bre.i).a(60)) {
         $$0 = 0.006666667F;
      } else if (this.cH > 0.0F) {
         $$0 = -0.05F;
      }

      this.cH = ayd.a(this.cH + $$0, 0.0F, 1.0F);
      this.L();
   }

   @Override
   public void t() {
      super.t();
      this.dj = false;
      if (this.dd() instanceof cnt $$0) {
         $$0.a(this.cA.e, this.cA.f, this.cA.c, this.cA.d);
         this.dj = this.dj | (this.cA.e || this.cA.f || this.cA.c || this.cA.d);
      }
   }

   public boolean B() {
      return this.dj;
   }

   @Nullable
   @Override
   public brc d(ix<bra> $$0) {
      if ($$0.a(bre.i)) {
         this.cI = 0.0F;
         this.cH = 0.0F;
      }

      return super.d($$0);
   }

   @Override
   public void a(bst $$0, euk $$1) {
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
         euk $$2 = this.dn();
         euk $$3 = $$2.b((double)$$0, 0.0, (double)$$1);
         euk $$4 = new euk((double)$$0, 0.0, (double)$$1);
         float $$5 = this.fn();
         float $$6 = (float)$$4.g();
         if ($$6 <= 0.001F) {
            euj $$7 = this.cA.a();
            float $$8 = $$5 * $$7.i;
            float $$9 = $$5 * $$7.j;
            float $$10 = ayd.a(this.dF() * (float) (Math.PI / 180.0));
            float $$11 = ayd.b(this.dF() * (float) (Math.PI / 180.0));
            $$4 = new euk((double)($$8 * $$11 - $$9 * $$10), $$4.d, (double)($$9 * $$11 + $$8 * $$10));
            $$6 = (float)$$4.g();
            if ($$6 <= 0.001F) {
               return;
            }
         }

         float $$12 = ayd.i($$6);
         euk $$13 = $$4.a((double)$$12);
         euk $$14 = this.bN();
         float $$15 = (float)($$14.c * $$13.c + $$14.e * $$13.e);
         if (!($$15 < -0.15F)) {
            eup $$16 = eup.a(this);
            io $$17 = io.a(this.du(), this.cK().e, this.dA());
            drb $$18 = this.dP().a_($$17);
            if ($$18.b(this.dP(), $$17, $$16).c()) {
               $$17 = $$17.c();
               drb $$19 = this.dP().a_($$17);
               if ($$19.b(this.dP(), $$17, $$16).c()) {
                  float $$20 = 7.0F;
                  float $$21 = 1.2F;
                  if (this.b(bre.h)) {
                     $$21 += (float)(this.c(bre.h).e() + 1) * 0.75F;
                  }

                  float $$22 = Math.max($$5 * 7.0F, 1.0F / $$12);
                  euk $$24 = $$3.e($$13.a((double)$$22));
                  float $$25 = this.dj();
                  float $$26 = this.dk();
                  euf $$27 = new euf($$2, $$24.b(0.0, (double)$$26, 0.0)).c((double)$$25, 0.0, (double)$$25);
                  euk $$23 = $$2.b(0.0, 0.51F, 0.0);
                  $$24 = $$24.b(0.0, 0.51F, 0.0);
                  euk $$28 = $$13.c(new euk(0.0, 1.0, 0.0));
                  euk $$29 = $$28.a((double)($$25 * 0.5F));
                  euk $$30 = $$23.d($$29);
                  euk $$31 = $$24.d($$29);
                  euk $$32 = $$23.e($$29);
                  euk $$33 = $$24.e($$29);
                  Iterable<evd> $$34 = this.dP().d(this, $$27);
                  Iterator<euf> $$35 = StreamSupport.stream($$34.spliterator(), false).flatMap($$0x -> $$0x.e().stream()).iterator();
                  float $$36 = Float.MIN_VALUE;

                  while ($$35.hasNext()) {
                     euf $$37 = $$35.next();
                     if ($$37.a($$30, $$31) || $$37.a($$32, $$33)) {
                        $$36 = (float)$$37.e;
                        euk $$38 = $$37.f();
                        io $$39 = io.a($$38);

                        for (int $$40 = 1; (float)$$40 < $$21; $$40++) {
                           io $$41 = $$39.b($$40);
                           drb $$42 = this.dP().a_($$41);
                           evd $$43;
                           if (!($$43 = $$42.b(this.dP(), $$41, $$16)).c()) {
                              $$36 = (float)$$43.c(it.a.b) + (float)$$41.v();
                              if ((double)$$36 - this.dw() > (double)$$21) {
                                 return;
                              }
                           }

                           if ($$40 > 1) {
                              $$17 = $$17.c();
                              drb $$44 = this.dP().a_($$17);
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
   protected boolean c(euk $$0) {
      float $$1 = this.dF() * (float) (Math.PI / 180.0);
      double $$2 = (double)ayd.a($$1);
      double $$3 = (double)ayd.b($$1);
      double $$4 = (double)this.bp * $$3 - (double)this.br * $$2;
      double $$5 = (double)this.br * $$3 + (double)this.bp * $$2;
      double $$6 = ayd.k($$4) + ayd.k($$5);
      double $$7 = ayd.k($$0.c) + ayd.k($$0.e);
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
      euj $$0 = this.cA.a();
      return $$0.i != 0.0F || $$0.j != 0.0F;
   }

   private boolean M() {
      return !this.cb() && this.N() && this.O() && !this.fv() && !this.b(bre.o) && (!this.bR() || this.d(this.dc())) && !this.fE();
   }

   private boolean d(bru $$0) {
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
      if (!this.a(awb.a)) {
         return 0.0F;
      } else {
         float $$0 = 600.0F;
         float $$1 = 100.0F;
         if ((float)this.dn >= 600.0F) {
            return 1.0F;
         } else {
            float $$2 = ayd.a((float)this.dn / 100.0F, 0.0F, 1.0F);
            float $$3 = (float)this.dn < 100.0F ? 0.0F : ayd.a(((float)this.dn - 100.0F) / 500.0F, 0.0F, 1.0F);
            return $$2 * 0.6F + $$3 * 0.39999998F;
         }
      }
   }

   public void a(dau $$0) {
      if ($$0 == dau.d) {
         this.g(this.ds().a(it.a.b, 0.0));
      }
   }

   @Override
   public boolean bj() {
      return this.co;
   }

   @Override
   protected boolean fU() {
      boolean $$0 = this.co;
      boolean $$1 = super.fU();
      if (this.N_()) {
         return this.co;
      } else {
         if (!$$0 && $$1) {
            this.dP().a(this.du(), this.dw(), this.dA(), avh.x, avi.i, 1.0F, 1.0F, false);
            this.cB.ak().a((grj)(new grm.b(this)));
         }

         if ($$0 && !$$1) {
            this.dP().a(this.du(), this.dw(), this.dA(), avh.y, avi.i, 1.0F, 1.0F, false);
         }

         return this.co;
      }
   }

   @Override
   public euk q(float $$0) {
      if (this.cB.m.aA().a()) {
         float $$1 = ayd.i($$0 * 0.5F, this.dF(), this.O) * (float) (Math.PI / 180.0);
         float $$2 = ayd.i($$0 * 0.5F, this.dH(), this.P) * (float) (Math.PI / 180.0);
         double $$3 = this.fu() == bsi.b ? -1.0 : 1.0;
         euk $$4 = new euk(0.39 * $$3, -0.6, 0.3);
         return $$4.a(-$$2).b(-$$1).e(this.j($$0));
      } else {
         return super.q($$0);
      }
   }

   @Override
   public void a(cto $$0, cto $$1, cpb $$2) {
      this.cB.aB().a($$0, $$1, $$2);
   }

   @Override
   public float dG() {
      return this.dF();
   }
}
