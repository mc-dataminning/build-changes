import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fuv extends fus {
   public static final Logger g = LogUtils.getLogger();
   private static final int cB = 20;
   private static final int cC = 600;
   private static final int cD = 100;
   private static final float cE = 0.6F;
   private static final double cF = 0.35;
   private static final double cG = 0.13962634F;
   private static final float cH = 0.3F;
   public final fqf cq;
   private final atw cI;
   private final exb cJ;
   private final List<gjy> cK = Lists.newArrayList();
   private int cL = 0;
   private double cM;
   private double cN;
   private double cO;
   private float cP;
   private float cQ;
   private boolean cR;
   private boolean cS;
   private boolean cT;
   private boolean cU;
   private int cV;
   private boolean cW;
   public fut cr;
   protected final exo cs;
   protected int ct;
   public float cu;
   public float cw;
   public float cx;
   public float cy;
   private int cX;
   private float cY;
   public float cz;
   public float cA;
   private boolean cZ;
   @Nullable
   private blv da;
   private boolean db;
   private boolean dc = true;
   private int dd;
   private boolean de;
   private int df;
   private boolean dg = true;
   private boolean dh = false;

   public fuv(exo $$0, fqe $$1, fqf $$2, atw $$3, exb $$4, boolean $$5, boolean $$6) {
      super($$1, $$2.p());
      this.cs = $$0;
      this.cq = $$2;
      this.cI = $$3;
      this.cJ = $$4;
      this.cT = $$5;
      this.cU = $$6;
      this.cK.add(new gkq(this, $$0.aj()));
      this.cK.add(new gkd(this));
      this.cK.add(new gkc(this, $$0.aj(), $$1.G_()));
   }

   @Override
   public boolean a(bmp $$0, float $$1) {
      return false;
   }

   @Override
   public void c(float $$0) {
   }

   @Override
   public boolean a(bnq $$0, boolean $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         if ($$0 instanceof cje) {
            this.cs.aj().a((gko)(new gki(this, (cje)$$0, true)));
            this.cs.aj().a((gko)(new gki(this, (cje)$$0, false)));
         }

         return true;
      }
   }

   @Override
   public void bC() {
      super.bC();
      this.db = false;
   }

   @Override
   public float g(float $$0) {
      return this.dE();
   }

   @Override
   public float h(float $$0) {
      return this.bO() ? super.h($$0) : this.dC();
   }

   @Override
   public void l() {
      if (this.dM().f(this.dq(), this.dw())) {
         super.l();
         if (this.bO()) {
            this.cq.b(new afo.c(this.dC(), this.dE(), this.aC()));
            this.cq.b(new afw(this.bk, this.bm, this.cr.g, this.cr.h));
            bnq $$0 = this.cW();
            if ($$0 != this && $$0.cX()) {
               this.cq.b(new afp($$0));
               this.E();
            }
         } else {
            this.D();
         }

         for (gjy $$1 : this.cK) {
            $$1.a();
         }
      }
   }

   public float d() {
      for (gjy $$0 : this.cK) {
         if ($$0 instanceof gkc) {
            return ((gkc)$$0).b();
         }
      }

      return 0.0F;
   }

   private void D() {
      this.E();
      boolean $$0 = this.bS();
      if ($$0 != this.cT) {
         afv.a $$1 = $$0 ? afv.a.a : afv.a.b;
         this.cq.b(new afv(this, $$1));
         this.cT = $$0;
      }

      if (this.w()) {
         double $$2 = this.dr() - this.cM;
         double $$3 = this.dt() - this.cN;
         double $$4 = this.dx() - this.cO;
         double $$5 = (double)(this.dC() - this.cP);
         double $$6 = (double)(this.dE() - this.cQ);
         this.cV++;
         boolean $$7 = awi.f($$2, $$3, $$4) > awi.k(2.0E-4) || this.cV >= 20;
         boolean $$8 = $$5 != 0.0 || $$6 != 0.0;
         if (this.bO()) {
            enz $$9 = this.dp();
            this.cq.b(new afo.b($$9.c, -999.0, $$9.e, this.dC(), this.dE(), this.aC()));
            $$7 = false;
         } else if ($$7 && $$8) {
            this.cq.b(new afo.b(this.dr(), this.dt(), this.dx(), this.dC(), this.dE(), this.aC()));
         } else if ($$7) {
            this.cq.b(new afo.a(this.dr(), this.dt(), this.dx(), this.aC()));
         } else if ($$8) {
            this.cq.b(new afo.c(this.dC(), this.dE(), this.aC()));
         } else if (this.cR != this.aC()) {
            this.cq.b(new afo.d(this.aC()));
         }

         if ($$7) {
            this.cM = this.dr();
            this.cN = this.dt();
            this.cO = this.dx();
            this.cV = 0;
         }

         if ($$8) {
            this.cP = this.dC();
            this.cQ = this.dE();
         }

         this.cR = this.aC();
         this.dc = this.cs.m.F().c();
      }
   }

   private void E() {
      boolean $$0 = this.bY();
      if ($$0 != this.cU) {
         afv.a $$1 = $$0 ? afv.a.d : afv.a.e;
         this.cq.b(new afv(this, $$1));
         this.cU = $$0;
      }
   }

   public boolean a(boolean $$0) {
      afu.a $$1 = $$0 ? afu.a.d : afu.a.e;
      cpd $$2 = this.fT().a($$0);
      this.cq.b(new afu($$1, hz.c, ie.a));
      return !$$2.b();
   }

   @Override
   public void a(blv $$0) {
      super.a($$0);
      this.cq.b(new agk($$0));
   }

   @Override
   public void fR() {
      this.cq.b(new afc(afc.a.a));
      exm.c();
   }

   @Override
   protected void f(bmp $$0, float $$1) {
      if (!this.b($$0)) {
         this.t(this.ew() - $$1);
      }
   }

   @Override
   public void r() {
      this.cq.b(new afh(this.bW.j));
      this.e();
   }

   public void e() {
      super.r();
      this.cs.a(null);
   }

   public void D(float $$0) {
      if (this.cW) {
         float $$1 = this.ew() - $$0;
         if ($$1 <= 0.0F) {
            this.t($$0);
            if ($$1 < 0.0F) {
               this.ak = 10;
            }
         } else {
            this.bi = $$1;
            this.ak = 20;
            this.t($$0);
            this.aL = 10;
            this.aK = this.aL;
         }
      } else {
         this.t($$0);
         this.cW = true;
      }
   }

   @Override
   public void y() {
      this.cq.b(new aft(this.fU()));
   }

   @Override
   public boolean g() {
      return true;
   }

   @Override
   public boolean fv() {
      return !this.fU().b && super.fv();
   }

   @Override
   public boolean bl() {
      return !this.fU().b && super.bl();
   }

   @Override
   public boolean dS() {
      return !this.fU().b && super.dS();
   }

   protected void h() {
      this.cq.b(new afv(this, afv.a.f, awi.d(this.u() * 100.0F)));
   }

   public void i() {
      this.cq.b(new afv(this, afv.a.h));
   }

   public atw j() {
      return this.cI;
   }

   public exb m() {
      return this.cJ;
   }

   public void a(csh<?> $$0) {
      if (this.cJ.d($$0)) {
         this.cJ.e($$0);
         this.cq.b(new afy($$0));
      }
   }

   @Override
   protected int F() {
      return this.cL;
   }

   public void a(int $$0) {
      this.cL = $$0;
   }

   @Override
   public void a(vq $$0, boolean $$1) {
      this.cs.aY().a($$0, $$1);
   }

   private void c(double $$0, double $$1) {
      hz $$2 = hz.a($$0, this.dt(), $$1);
      if (this.i($$2)) {
         double $$3 = $$0 - (double)$$2.u();
         double $$4 = $$1 - (double)$$2.w();
         ie $$5 = null;
         double $$6 = Double.MAX_VALUE;
         ie[] $$7 = new ie[]{ie.e, ie.f, ie.c, ie.d};

         for (ie $$8 : $$7) {
            double $$9 = $$8.o().a($$3, 0.0, $$4);
            double $$10 = $$8.f() == ie.b.a ? 1.0 - $$9 : $$9;
            if ($$10 < $$6 && !this.i($$2.a($$8))) {
               $$6 = $$10;
               $$5 = $$8;
            }
         }

         if ($$5 != null) {
            enz $$11 = this.dp();
            if ($$5.o() == ie.a.a) {
               this.o(0.1 * (double)$$5.j(), $$11.d, $$11.e);
            } else {
               this.o($$11.c, $$11.d, 0.1 * (double)$$5.l());
            }
         }
      }
   }

   private boolean i(hz $$0) {
      enu $$1 = this.cH();
      enu $$2 = new enu((double)$$0.u(), $$1.b, (double)$$0.w(), (double)$$0.u() + 1.0, $$1.e, (double)$$0.w() + 1.0).h(1.0E-7);
      return this.dM().f(this, $$2);
   }

   public void a(float $$0, int $$1, int $$2) {
      this.cl = $$0;
      this.ck = $$1;
      this.cj = $$2;
   }

   @Override
   public void a(vq $$0) {
      this.cs.l.d().a($$0);
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
      this.dg = $$0;
   }

   public boolean o() {
      return this.dg;
   }

   public void u(boolean $$0) {
      this.dh = $$0;
   }

   public boolean p() {
      return this.dh;
   }

   @Override
   public void a(atk $$0, float $$1, float $$2) {
      this.dM().a(this.dr(), this.dt(), this.dx(), $$0, this.db(), $$1, $$2, false);
   }

   @Override
   public void a(atk $$0, atm $$1, float $$2, float $$3) {
      this.dM().a(this.dr(), this.dt(), this.dx(), $$0, $$1, $$2, $$3, false);
   }

   @Override
   public boolean cY() {
      return true;
   }

   @Override
   public void c(blv $$0) {
      cpd $$1 = this.b($$0);
      if (!$$1.b() && !this.fn()) {
         super.c($$0);
         this.cZ = true;
         this.da = $$0;
      }
   }

   @Override
   public boolean fn() {
      return this.cZ;
   }

   @Override
   public void ft() {
      super.ft();
      this.cZ = false;
   }

   @Override
   public blv fo() {
      return Objects.requireNonNullElse(this.da, blv.a);
   }

   @Override
   public void a(aie<?> $$0) {
      super.a($$0);
      if (u.equals($$0)) {
         boolean $$1 = (this.am.b(u) & 1) > 0;
         blv $$2 = (this.am.b(u) & 2) > 0 ? blv.b : blv.a;
         if ($$1 && !this.cZ) {
            this.c($$2);
         } else if (!$$1 && this.cZ) {
            this.ft();
         }
      }

      if (an.equals($$0) && this.fw() && !this.de) {
         this.cs.aj().a((gko)(new gke(this)));
      }
   }

   @Nullable
   public bos q() {
      if (this.da() instanceof bos $$0 && $$0.a()) {
         return $$0;
      }

      return null;
   }

   public float u() {
      return this.cY;
   }

   @Override
   public boolean Y() {
      return this.cs.aR();
   }

   @Override
   public void a(dkg $$0, boolean $$1) {
      if ($$0 instanceof dju $$2) {
         this.cs.a(new fhh($$2, $$1, this.cs.aR()));
      } else {
         this.cs.a(new fhu($$0, $$1, this.cs.aR()));
      }
   }

   @Override
   public void a(cus $$0) {
      this.cs.a(new fhr($$0));
   }

   @Override
   public void a(djh $$0) {
      this.cs.a(new fgu($$0));
   }

   @Override
   public void a(dkl $$0) {
      this.cs.a(new fhy($$0));
   }

   @Override
   public void a(djx $$0) {
      this.cs.a(new fhm($$0));
   }

   @Override
   public void a(cpd $$0, blv $$1) {
      if ($$0.a(cpg.tW)) {
         this.cs.a(new fgq(this, $$0, $$1));
      }
   }

   @Override
   public void a(bnq $$0) {
      this.cs.g.a($$0, jz.g);
   }

   @Override
   public void b(bnq $$0) {
      this.cs.g.a($$0, jz.s);
   }

   @Override
   public boolean bS() {
      return this.cr != null && this.cr.h;
   }

   @Override
   public boolean bX() {
      return this.cS;
   }

   public boolean v() {
      return this.bX() || this.cb();
   }

   @Override
   public void fi() {
      super.fi();
      if (this.w()) {
         this.bk = this.cr.a;
         this.bm = this.cr.b;
         this.bj = this.cr.g;
         this.cx = this.cu;
         this.cy = this.cw;
         this.cw = this.cw + (this.dE() - this.cw) * 0.5F;
         this.cu = this.cu + (this.dC() - this.cu) * 0.5F;
      }
   }

   protected boolean w() {
      return this.cs.an() == this;
   }

   @Override
   public void z() {
      this.b(bot.a);
      if (this.dM() != null) {
         for (double $$0 = this.dt(); $$0 > (double)this.dM().J_() && $$0 < (double)this.dM().ak(); $$0++) {
            this.a_(this.dr(), $$0, this.dx());
            if (this.dM().g(this)) {
               break;
            }
         }

         this.g(enz.b);
         this.s(0.0F);
      }

      this.t(this.eN());
      this.aM = 0;
   }

   @Override
   public void d_() {
      if (this.ct > 0) {
         this.ct--;
      }

      if (!(this.cs.y instanceof ffj)) {
         this.G();
      }

      boolean $$0 = this.cr.g;
      boolean $$1 = this.cr.h;
      boolean $$2 = this.M();
      this.cS = !this.fU().b && !this.bZ() && !this.bO() && this.h(bot.f) && (this.bS() || !this.fD() && !this.h(bot.a));
      float $$3 = awi.a(0.3F + ctn.b(this), 0.0F, 1.0F);
      this.cr.a(this.v(), $$3);
      this.cs.aA().a(this.cr);
      if (this.fn() && !this.bO()) {
         this.cr.a *= 0.2F;
         this.cr.b *= 0.2F;
         this.ct = 0;
      }

      boolean $$4 = false;
      if (this.dd > 0) {
         this.dd--;
         $$4 = true;
         this.cr.g = true;
      }

      if (!this.ae) {
         this.c(this.dr() - (double)this.dg() * 0.35, this.dx() + (double)this.dg() * 0.35);
         this.c(this.dr() - (double)this.dg() * 0.35, this.dx() - (double)this.dg() * 0.35);
         this.c(this.dr() + (double)this.dg() * 0.35, this.dx() - (double)this.dg() * 0.35);
         this.c(this.dr() + (double)this.dg() * 0.35, this.dx() + (double)this.dg() * 0.35);
      }

      if ($$1) {
         this.ct = 0;
      }

      boolean $$5 = this.K();
      boolean $$6 = this.bO() ? this.cZ().aC() : this.aC();
      boolean $$7 = !$$1 && !$$2;
      if (($$6 || this.be()) && $$7 && $$5) {
         if (this.ct <= 0 && !this.cs.m.D.e()) {
            this.ct = 7;
         } else {
            this.g(true);
         }
      }

      if ((!this.aZ() || this.be()) && $$5 && this.cs.m.D.e()) {
         this.g(true);
      }

      if (this.bY()) {
         boolean $$8 = !this.cr.b() || !this.N();
         boolean $$9 = $$8 || this.O && !this.R || this.aZ() && !this.be();
         if (this.bZ()) {
            if (!this.aC() && !this.cr.h && $$8 || !this.aZ()) {
               this.g(false);
            }
         } else if ($$9) {
            this.g(false);
         }
      }

      boolean $$10 = false;
      if (this.fU().c) {
         if (this.cs.q.h()) {
            if (!this.fU().b) {
               this.fU().b = true;
               $$10 = true;
               this.y();
            }
         } else if (!$$0 && this.cr.g && !$$4) {
            if (this.bY == 0) {
               this.bY = 7;
            } else if (!this.bZ()) {
               this.fU().b = !this.fU().b;
               $$10 = true;
               this.y();
               this.bY = 0;
            }
         }
      }

      if (this.cr.g && !$$10 && !$$0 && !this.fU().b && !this.bO() && !this.e_()) {
         cpd $$11 = this.c(bnx.e);
         if ($$11.a(cpg.nS) && cnx.d($$11) && this.fY()) {
            this.cq.b(new afv(this, afv.a.i));
         }
      }

      this.de = this.fw();
      if (this.aZ() && this.cr.h && this.eb()) {
         this.fc();
      }

      if (this.a(auf.a)) {
         int $$12 = this.P_() ? 10 : 1;
         this.df = awi.a(this.df + $$12, 0, 600);
      } else if (this.df > 0) {
         this.a(auf.a);
         this.df = awi.a(this.df - 10, 0, 600);
      }

      if (this.fU().b && this.w()) {
         int $$13 = 0;
         if (this.cr.h) {
            $$13--;
         }

         if (this.cr.g) {
            $$13++;
         }

         if ($$13 != 0) {
            this.g(this.dp().b(0.0, (double)((float)$$13 * this.fU().a() * 3.0F), 0.0));
         }
      }

      bos $$14 = this.q();
      if ($$14 != null && $$14.ad_() == 0) {
         if (this.cX < 0) {
            this.cX++;
            if (this.cX == 0) {
               this.cY = 0.0F;
            }
         }

         if ($$0 && !this.cr.g) {
            this.cX = -10;
            $$14.b(awi.d(this.u() * 100.0F));
            this.h();
         } else if (!$$0 && this.cr.g) {
            this.cX = 0;
            this.cY = 0.0F;
         } else if ($$0) {
            this.cX++;
            if (this.cX < 10) {
               this.cY = (float)this.cX * 0.1F;
            } else {
               this.cY = 0.8F + 2.0F / (float)(this.cX - 9) * 0.1F;
            }
         }
      } else {
         this.cY = 0.0F;
      }

      super.d_();
      if (this.aC() && this.fU().b && !this.cs.q.h()) {
         this.fU().b = false;
         this.y();
      }
   }

   @Override
   protected void ec() {
      this.aM++;
      if (this.aM == 20) {
         this.a(bnq.c.a);
      }
   }

   private void G() {
      this.cA = this.cz;
      float $$0 = 0.0F;
      if (this.au) {
         if (this.cs.y != null && !this.cs.y.m() && !(this.cs.y instanceof fek)) {
            if (this.cs.y instanceof fgk) {
               this.r();
            }

            this.cs.a(null);
         }

         if (this.cz == 0.0F) {
            this.cs.aj().a(gkj.b(atl.uc, this.af.i() * 0.4F + 0.8F, 0.25F));
         }

         $$0 = 0.0125F;
         this.au = false;
      } else if (this.a(bnf.i) && !this.c(bnf.i).a(60)) {
         $$0 = 0.006666667F;
      } else if (this.cz > 0.0F) {
         $$0 = -0.05F;
      }

      this.cz = awi.a(this.cz + $$0, 0.0F, 1.0F);
      this.L();
   }

   @Override
   public void t() {
      super.t();
      this.db = false;
      if (this.da() instanceof cjg $$0) {
         $$0.a(this.cr.e, this.cr.f, this.cr.c, this.cr.d);
         this.db = this.db | (this.cr.e || this.cr.f || this.cr.c || this.cr.d);
      }
   }

   @Override
   public boolean A() {
      return this.db;
   }

   @Nullable
   @Override
   public bnd d(ij<bnb> $$0) {
      if ($$0.a(bnf.i)) {
         this.cA = 0.0F;
         this.cz = 0.0F;
      }

      return super.d($$0);
   }

   @Override
   public void a(bon $$0, enz $$1) {
      double $$2 = this.dr();
      double $$3 = this.dx();
      super.a($$0, $$1);
      this.f((float)(this.dr() - $$2), (float)(this.dx() - $$3));
   }

   public boolean B() {
      return this.dc;
   }

   protected void f(float $$0, float $$1) {
      if (this.H()) {
         enz $$2 = this.dk();
         enz $$3 = $$2.b((double)$$0, 0.0, (double)$$1);
         enz $$4 = new enz((double)$$0, 0.0, (double)$$1);
         float $$5 = this.ff();
         float $$6 = (float)$$4.g();
         if ($$6 <= 0.001F) {
            eny $$7 = this.cr.a();
            float $$8 = $$5 * $$7.i;
            float $$9 = $$5 * $$7.j;
            float $$10 = awi.a(this.dC() * (float) (Math.PI / 180.0));
            float $$11 = awi.b(this.dC() * (float) (Math.PI / 180.0));
            $$4 = new enz((double)($$8 * $$11 - $$9 * $$10), $$4.d, (double)($$9 * $$11 + $$8 * $$10));
            $$6 = (float)$$4.g();
            if ($$6 <= 0.001F) {
               return;
            }
         }

         float $$12 = awi.i($$6);
         enz $$13 = $$4.a((double)$$12);
         enz $$14 = this.bH();
         float $$15 = (float)($$14.c * $$13.c + $$14.e * $$13.e);
         if (!($$15 < -0.15F)) {
            eoe $$16 = eoe.a(this);
            hz $$17 = hz.a(this.dr(), this.cH().e, this.dx());
            dlj $$18 = this.dM().a_($$17);
            if ($$18.b(this.dM(), $$17, $$16).c()) {
               $$17 = $$17.c();
               dlj $$19 = this.dM().a_($$17);
               if ($$19.b(this.dM(), $$17, $$16).c()) {
                  float $$20 = 7.0F;
                  float $$21 = 1.2F;
                  if (this.a(bnf.h)) {
                     $$21 += (float)(this.c(bnf.h).d() + 1) * 0.75F;
                  }

                  float $$22 = Math.max($$5 * 7.0F, 1.0F / $$12);
                  enz $$24 = $$3.e($$13.a((double)$$22));
                  float $$25 = this.dg();
                  float $$26 = this.dh();
                  enu $$27 = new enu($$2, $$24.b(0.0, (double)$$26, 0.0)).c((double)$$25, 0.0, (double)$$25);
                  enz $$23 = $$2.b(0.0, 0.51F, 0.0);
                  $$24 = $$24.b(0.0, 0.51F, 0.0);
                  enz $$28 = $$13.c(new enz(0.0, 1.0, 0.0));
                  enz $$29 = $$28.a((double)($$25 * 0.5F));
                  enz $$30 = $$23.d($$29);
                  enz $$31 = $$24.d($$29);
                  enz $$32 = $$23.e($$29);
                  enz $$33 = $$24.e($$29);
                  Iterable<eos> $$34 = this.dM().d(this, $$27);
                  Iterator<enu> $$35 = StreamSupport.stream($$34.spliterator(), false).flatMap($$0x -> $$0x.e().stream()).iterator();
                  float $$36 = Float.MIN_VALUE;

                  while ($$35.hasNext()) {
                     enu $$37 = $$35.next();
                     if ($$37.a($$30, $$31) || $$37.a($$32, $$33)) {
                        $$36 = (float)$$37.e;
                        enz $$38 = $$37.f();
                        hz $$39 = hz.a($$38);

                        for (int $$40 = 1; (float)$$40 < $$21; $$40++) {
                           hz $$41 = $$39.b($$40);
                           dlj $$42 = this.dM().a_($$41);
                           eos $$43;
                           if (!($$43 = $$42.b(this.dM(), $$41, $$16)).c()) {
                              $$36 = (float)$$43.c(ie.a.b) + (float)$$41.v();
                              if ((double)$$36 - this.dt() > (double)$$21) {
                                 return;
                              }
                           }

                           if ($$40 > 1) {
                              $$17 = $$17.c();
                              dlj $$44 = this.dM().a_($$17);
                              if (!$$44.b(this.dM(), $$17, $$16).c()) {
                                 return;
                              }
                           }
                        }
                        break;
                     }
                  }

                  if ($$36 != Float.MIN_VALUE) {
                     float $$45 = (float)((double)$$36 - this.dt());
                     if (!($$45 <= 0.5F) && !($$45 > $$21)) {
                        this.dd = 1;
                     }
                  }
               }
            }
         }
      }
   }

   @Override
   protected boolean c(enz $$0) {
      float $$1 = this.dC() * (float) (Math.PI / 180.0);
      double $$2 = (double)awi.a($$1);
      double $$3 = (double)awi.b($$1);
      double $$4 = (double)this.bk * $$3 - (double)this.bm * $$2;
      double $$5 = (double)this.bm * $$3 + (double)this.bk * $$2;
      double $$6 = awi.k($$4) + awi.k($$5);
      double $$7 = awi.k($$0.c) + awi.k($$0.e);
      if (!($$6 < 1.0E-5F) && !($$7 < 1.0E-5F)) {
         double $$8 = $$4 * $$0.c + $$5 * $$0.e;
         double $$9 = Math.acos($$8 / Math.sqrt($$6 * $$7));
         return $$9 < 0.13962634F;
      } else {
         return false;
      }
   }

   private boolean H() {
      return this.B() && this.dd <= 0 && this.aC() && !this.fK() && !this.bO() && this.I() && (double)this.aK() >= 1.0;
   }

   private boolean I() {
      eny $$0 = this.cr.a();
      return $$0.i != 0.0F || $$0.j != 0.0F;
   }

   private boolean K() {
      return !this.bY() && this.M() && this.N() && !this.fn() && !this.a(bnf.o) && (!this.bO() || this.c(this.cZ())) && !this.fw();
   }

   private boolean c(bnq $$0) {
      return $$0.dF() && $$0.cX();
   }

   private boolean M() {
      double $$0 = 0.8;
      return this.be() ? this.cr.b() : (double)this.cr.b >= 0.8;
   }

   private boolean N() {
      return this.bO() || (float)this.gd().a() > 6.0F || this.fU().c;
   }

   public float C() {
      if (!this.a(auf.a)) {
         return 0.0F;
      } else {
         float $$0 = 600.0F;
         float $$1 = 100.0F;
         if ((float)this.df >= 600.0F) {
            return 1.0F;
         } else {
            float $$2 = awi.a((float)this.df / 100.0F, 0.0F, 1.0F);
            float $$3 = (float)this.df < 100.0F ? 0.0F : awi.a(((float)this.df - 100.0F) / 500.0F, 0.0F, 1.0F);
            return $$2 * 0.6F + $$3 * 0.39999998F;
         }
      }
   }

   public void a(cvo $$0) {
      if ($$0 == cvo.d) {
         this.g(this.dp().a(ie.a.b, 0.0));
      }
   }

   @Override
   public boolean be() {
      return this.ci;
   }

   @Override
   protected boolean fL() {
      boolean $$0 = this.ci;
      boolean $$1 = super.fL();
      if (this.P_()) {
         return this.ci;
      } else {
         if (!$$0 && $$1) {
            this.dM().a(this.dr(), this.dt(), this.dx(), atl.x, atm.i, 1.0F, 1.0F, false);
            this.cs.aj().a((gko)(new gkr.b(this)));
         }

         if ($$0 && !$$1) {
            this.dM().a(this.dr(), this.dt(), this.dx(), atl.y, atm.i, 1.0F, 1.0F, false);
         }

         return this.ci;
      }
   }

   @Override
   public enz q(float $$0) {
      if (this.cs.m.ax().a()) {
         float $$1 = awi.i($$0 * 0.5F, this.dC(), this.M) * (float) (Math.PI / 180.0);
         float $$2 = awi.i($$0 * 0.5F, this.dE(), this.N) * (float) (Math.PI / 180.0);
         double $$3 = this.fm() == boc.b ? -1.0 : 1.0;
         enz $$4 = new enz(0.39 * $$3, -0.6, 0.3);
         return $$4.a(-$$2).b(-$$1).e(this.j($$0));
      } else {
         return super.q($$0);
      }
   }

   @Override
   public void a(cpd $$0, cpd $$1, ckn $$2) {
      this.cs.aA().a($$0, $$1, $$2);
   }

   @Override
   public float dD() {
      return this.dC();
   }
}
