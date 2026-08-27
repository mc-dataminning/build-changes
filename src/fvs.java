import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fvs extends fvp {
   public static final Logger g = LogUtils.getLogger();
   private static final int cC = 20;
   private static final int cD = 600;
   private static final int cE = 100;
   private static final float cF = 0.6F;
   private static final double cG = 0.35;
   private static final double cH = 0.13962634F;
   private static final float cI = 0.3F;
   public final frb cr;
   private final aua cJ;
   private final exx cK;
   private final List<gkw> cL = Lists.newArrayList();
   private int cM = 0;
   private double cN;
   private double cO;
   private double cP;
   private float cQ;
   private float cR;
   private boolean cS;
   private boolean cT;
   private boolean cU;
   private boolean cV;
   private int cW;
   private boolean cX;
   public fvq cs;
   protected final eyk ct;
   protected int cu;
   public float cv;
   public float cx;
   public float cy;
   public float cz;
   private int cY;
   private float cZ;
   public float cA;
   public float cB;
   private boolean da;
   @Nullable
   private bmk db;
   private boolean dc;
   private boolean dd = true;
   private int de;
   private boolean df;
   private int dg;
   private boolean dh = true;
   private boolean di = false;

   public fvs(eyk $$0, fra $$1, frb $$2, aua $$3, exx $$4, boolean $$5, boolean $$6) {
      super($$1, $$2.p());
      this.ct = $$0;
      this.cr = $$2;
      this.cJ = $$3;
      this.cK = $$4;
      this.cU = $$5;
      this.cV = $$6;
      this.cL.add(new glo(this, $$0.aj()));
      this.cL.add(new glb(this));
      this.cL.add(new gla(this, $$0.aj(), $$1.G_()));
   }

   @Override
   public boolean a(bne $$0, float $$1) {
      return false;
   }

   @Override
   public void c(float $$0) {
   }

   @Override
   public boolean a(bof $$0, boolean $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         if ($$0 instanceof cjt) {
            this.ct.aj().a((glm)(new glg(this, (cjt)$$0, true)));
            this.ct.aj().a((glm)(new glg(this, (cjt)$$0, false)));
         }

         return true;
      }
   }

   @Override
   public void bC() {
      super.bC();
      this.dc = false;
   }

   @Override
   public float g(float $$0) {
      return this.dB();
   }

   @Override
   public float h(float $$0) {
      return this.bL() ? super.h($$0) : this.dz();
   }

   @Override
   public void l() {
      if (this.dJ().f(this.dn(), this.dt())) {
         super.l();
         if (this.bL()) {
            this.cr.b(new afs.c(this.dz(), this.dB(), this.aC()));
            this.cr.b(new aga(this.bl, this.bn, this.cs.g, this.cs.h));
            bof $$0 = this.cT();
            if ($$0 != this && $$0.cU()) {
               this.cr.b(new aft($$0));
               this.E();
            }
         } else {
            this.D();
         }

         for (gkw $$1 : this.cL) {
            $$1.a();
         }
      }
   }

   public float d() {
      for (gkw $$0 : this.cL) {
         if ($$0 instanceof gla) {
            return ((gla)$$0).b();
         }
      }

      return 0.0F;
   }

   private void D() {
      this.E();
      boolean $$0 = this.bP();
      if ($$0 != this.cU) {
         afz.a $$1 = $$0 ? afz.a.a : afz.a.b;
         this.cr.b(new afz(this, $$1));
         this.cU = $$0;
      }

      if (this.w()) {
         double $$2 = this.do() - this.cN;
         double $$3 = this.dq() - this.cO;
         double $$4 = this.du() - this.cP;
         double $$5 = (double)(this.dz() - this.cQ);
         double $$6 = (double)(this.dB() - this.cR);
         this.cW++;
         boolean $$7 = awm.f($$2, $$3, $$4) > awm.k(2.0E-4) || this.cW >= 20;
         boolean $$8 = $$5 != 0.0 || $$6 != 0.0;
         if (this.bL()) {
            eov $$9 = this.dm();
            this.cr.b(new afs.b($$9.c, -999.0, $$9.e, this.dz(), this.dB(), this.aC()));
            $$7 = false;
         } else if ($$7 && $$8) {
            this.cr.b(new afs.b(this.do(), this.dq(), this.du(), this.dz(), this.dB(), this.aC()));
         } else if ($$7) {
            this.cr.b(new afs.a(this.do(), this.dq(), this.du(), this.aC()));
         } else if ($$8) {
            this.cr.b(new afs.c(this.dz(), this.dB(), this.aC()));
         } else if (this.cS != this.aC()) {
            this.cr.b(new afs.d(this.aC()));
         }

         if ($$7) {
            this.cN = this.do();
            this.cO = this.dq();
            this.cP = this.du();
            this.cW = 0;
         }

         if ($$8) {
            this.cQ = this.dz();
            this.cR = this.dB();
         }

         this.cS = this.aC();
         this.dd = this.ct.m.F().c();
      }
   }

   private void E() {
      boolean $$0 = this.bV();
      if ($$0 != this.cV) {
         afz.a $$1 = $$0 ? afz.a.d : afz.a.e;
         this.cr.b(new afz(this, $$1));
         this.cV = $$0;
      }
   }

   public boolean a(boolean $$0) {
      afy.a $$1 = $$0 ? afy.a.d : afy.a.e;
      cpq $$2 = this.fV().a($$0);
      this.cr.b(new afy($$1, ib.c, ih.a));
      return !$$2.b();
   }

   @Override
   public void a(bmk $$0) {
      super.a($$0);
      this.cr.b(new ago($$0));
   }

   @Override
   public void fT() {
      this.cr.b(new aff(aff.a.a));
      eyi.c();
   }

   @Override
   protected void f(bne $$0, float $$1) {
      if (!this.b($$0)) {
         this.t(this.eu() - $$1);
      }
   }

   @Override
   public void r() {
      this.cr.b(new afk(this.bX.j));
      this.e();
   }

   public void e() {
      super.r();
      this.ct.a(null);
   }

   public void D(float $$0) {
      if (this.cX) {
         float $$1 = this.eu() - $$0;
         if ($$1 <= 0.0F) {
            this.t($$0);
            if ($$1 < 0.0F) {
               this.ak = 10;
            }
         } else {
            this.bj = $$1;
            this.ak = 20;
            this.t($$0);
            this.aM = 10;
            this.aL = this.aM;
         }
      } else {
         this.t($$0);
         this.cX = true;
      }
   }

   @Override
   public void y() {
      this.cr.b(new afx(this.fW()));
   }

   @Override
   public boolean g() {
      return true;
   }

   @Override
   public boolean fx() {
      return !this.fW().b && super.fx();
   }

   @Override
   public boolean bl() {
      return !this.fW().b && super.bl();
   }

   @Override
   public boolean dQ() {
      return !this.fW().b && super.dQ();
   }

   protected void h() {
      this.cr.b(new afz(this, afz.a.f, awm.d(this.u() * 100.0F)));
   }

   public void i() {
      this.cr.b(new afz(this, afz.a.h));
   }

   public aua j() {
      return this.cJ;
   }

   public exx m() {
      return this.cK;
   }

   public void a(csu<?> $$0) {
      if (this.cK.d($$0)) {
         this.cK.e($$0);
         this.cr.b(new agc($$0));
      }
   }

   @Override
   protected int F() {
      return this.cM;
   }

   public void a(int $$0) {
      this.cM = $$0;
   }

   @Override
   public void a(vs $$0, boolean $$1) {
      this.ct.aY().a($$0, $$1);
   }

   private void c(double $$0, double $$1) {
      ib $$2 = ib.a($$0, this.dq(), $$1);
      if (this.i($$2)) {
         double $$3 = $$0 - (double)$$2.u();
         double $$4 = $$1 - (double)$$2.w();
         ih $$5 = null;
         double $$6 = Double.MAX_VALUE;
         ih[] $$7 = new ih[]{ih.e, ih.f, ih.c, ih.d};

         for (ih $$8 : $$7) {
            double $$9 = $$8.o().a($$3, 0.0, $$4);
            double $$10 = $$8.f() == ih.b.a ? 1.0 - $$9 : $$9;
            if ($$10 < $$6 && !this.i($$2.a($$8))) {
               $$6 = $$10;
               $$5 = $$8;
            }
         }

         if ($$5 != null) {
            eov $$11 = this.dm();
            if ($$5.o() == ih.a.a) {
               this.o(0.1 * (double)$$5.j(), $$11.d, $$11.e);
            } else {
               this.o($$11.c, $$11.d, 0.1 * (double)$$5.l());
            }
         }
      }
   }

   private boolean i(ib $$0) {
      eoq $$1 = this.cE();
      eoq $$2 = new eoq((double)$$0.u(), $$1.b, (double)$$0.w(), (double)$$0.u() + 1.0, $$1.e, (double)$$0.w() + 1.0).h(1.0E-7);
      return this.dJ().f(this, $$2);
   }

   public void a(float $$0, int $$1, int $$2) {
      this.cm = $$0;
      this.cl = $$1;
      this.ck = $$2;
   }

   @Override
   public void a(vs $$0) {
      this.ct.l.d().a($$0);
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
      this.dh = $$0;
   }

   public boolean o() {
      return this.dh;
   }

   public void u(boolean $$0) {
      this.di = $$0;
   }

   public boolean p() {
      return this.di;
   }

   @Override
   public void a(ato $$0, float $$1, float $$2) {
      this.dJ().a(this.do(), this.dq(), this.du(), $$0, this.cY(), $$1, $$2, false);
   }

   @Override
   public void a(ato $$0, atq $$1, float $$2, float $$3) {
      this.dJ().a(this.do(), this.dq(), this.du(), $$0, $$1, $$2, $$3, false);
   }

   @Override
   public boolean cV() {
      return true;
   }

   @Override
   public void c(bmk $$0) {
      cpq $$1 = this.b($$0);
      if (!$$1.b() && !this.fp()) {
         super.c($$0);
         this.da = true;
         this.db = $$0;
      }
   }

   @Override
   public boolean fp() {
      return this.da;
   }

   @Override
   public void fv() {
      super.fv();
      this.da = false;
   }

   @Override
   public bmk fq() {
      return Objects.requireNonNullElse(this.db, bmk.a);
   }

   @Override
   public void a(aii<?> $$0) {
      super.a($$0);
      if (v.equals($$0)) {
         boolean $$1 = (this.am.b(v) & 1) > 0;
         bmk $$2 = (this.am.b(v) & 2) > 0 ? bmk.b : bmk.a;
         if ($$1 && !this.da) {
            this.c($$2);
         } else if (!$$1 && this.da) {
            this.fv();
         }
      }

      if (an.equals($$0) && this.fy() && !this.df) {
         this.ct.aj().a((glm)(new glc(this)));
      }
   }

   @Nullable
   public bph q() {
      if (this.cX() instanceof bph $$0 && $$0.a()) {
         return $$0;
      }

      return null;
   }

   public float u() {
      return this.cZ;
   }

   @Override
   public boolean Y() {
      return this.ct.aR();
   }

   @Override
   public void a(dku $$0, boolean $$1) {
      if ($$0 instanceof dki $$2) {
         this.ct.a(new fid($$2, $$1, this.ct.aR()));
      } else {
         this.ct.a(new fiq($$0, $$1, this.ct.aR()));
      }
   }

   @Override
   public void a(cvf $$0) {
      this.ct.a(new fin($$0));
   }

   @Override
   public void a(djv $$0) {
      this.ct.a(new fhq($$0));
   }

   @Override
   public void a(dkz $$0) {
      this.ct.a(new fiu($$0));
   }

   @Override
   public void a(dkl $$0) {
      this.ct.a(new fii($$0));
   }

   @Override
   public void a(cpq $$0, bmk $$1) {
      if ($$0.a(cpt.tW)) {
         this.ct.a(new fhm(this, $$0, $$1));
      }
   }

   @Override
   public void a(bof $$0) {
      this.ct.g.a($$0, kb.g);
   }

   @Override
   public void b(bof $$0) {
      this.ct.g.a($$0, kb.s);
   }

   @Override
   public boolean bP() {
      return this.cs != null && this.cs.h;
   }

   @Override
   public boolean bU() {
      return this.cT;
   }

   public boolean v() {
      return this.bU() || this.bY();
   }

   @Override
   public void fk() {
      super.fk();
      if (this.w()) {
         this.bl = this.cs.a;
         this.bn = this.cs.b;
         this.bk = this.cs.g;
         this.cy = this.cv;
         this.cz = this.cx;
         this.cx = this.cx + (this.dB() - this.cx) * 0.5F;
         this.cv = this.cv + (this.dz() - this.cv) * 0.5F;
      }
   }

   protected boolean w() {
      return this.ct.an() == this;
   }

   @Override
   public void z() {
      this.b(bpi.a);
      if (this.dJ() != null) {
         for (double $$0 = this.dq(); $$0 > (double)this.dJ().J_() && $$0 < (double)this.dJ().ak(); $$0++) {
            this.a_(this.do(), $$0, this.du());
            if (this.dJ().g(this)) {
               break;
            }
         }

         this.g(eov.b);
         this.s(0.0F);
      }

      this.t(this.eL());
      this.aN = 0;
   }

   @Override
   public void d_() {
      if (this.cu > 0) {
         this.cu--;
      }

      if (!(this.ct.y instanceof fgf)) {
         this.G();
      }

      boolean $$0 = this.cs.g;
      boolean $$1 = this.cs.h;
      boolean $$2 = this.M();
      this.cT = !this.fW().b && !this.bW() && !this.bL() && this.h(bpi.f) && (this.bP() || !this.fF() && !this.h(bpi.a));
      float $$3 = awm.a(0.3F + cua.b(this), 0.0F, 1.0F);
      this.cs.a(this.v(), $$3);
      this.ct.aA().a(this.cs);
      if (this.fp() && !this.bL()) {
         this.cs.a *= 0.2F;
         this.cs.b *= 0.2F;
         this.cu = 0;
      }

      boolean $$4 = false;
      if (this.de > 0) {
         this.de--;
         $$4 = true;
         this.cs.g = true;
      }

      if (!this.ae) {
         this.c(this.do() - (double)this.dd() * 0.35, this.du() + (double)this.dd() * 0.35);
         this.c(this.do() - (double)this.dd() * 0.35, this.du() - (double)this.dd() * 0.35);
         this.c(this.do() + (double)this.dd() * 0.35, this.du() - (double)this.dd() * 0.35);
         this.c(this.do() + (double)this.dd() * 0.35, this.du() + (double)this.dd() * 0.35);
      }

      if ($$1) {
         this.cu = 0;
      }

      boolean $$5 = this.K();
      boolean $$6 = this.bL() ? this.cW().aC() : this.aC();
      boolean $$7 = !$$1 && !$$2;
      if (($$6 || this.be()) && $$7 && $$5) {
         if (this.cu <= 0 && !this.ct.m.D.e()) {
            this.cu = 7;
         } else {
            this.g(true);
         }
      }

      if ((!this.aZ() || this.be()) && $$5 && this.ct.m.D.e()) {
         this.g(true);
      }

      if (this.bV()) {
         boolean $$8 = !this.cs.b() || !this.N();
         boolean $$9 = $$8 || this.O && !this.R || this.aZ() && !this.be();
         if (this.bW()) {
            if (!this.aC() && !this.cs.h && $$8 || !this.aZ()) {
               this.g(false);
            }
         } else if ($$9) {
            this.g(false);
         }
      }

      boolean $$10 = false;
      if (this.fW().c) {
         if (this.ct.q.h()) {
            if (!this.fW().b) {
               this.fW().b = true;
               $$10 = true;
               this.y();
            }
         } else if (!$$0 && this.cs.g && !$$4) {
            if (this.bZ == 0) {
               this.bZ = 7;
            } else if (!this.bW()) {
               this.fW().b = !this.fW().b;
               $$10 = true;
               this.y();
               this.bZ = 0;
            }
         }
      }

      if (this.cs.g && !$$10 && !$$0 && !this.fW().b && !this.bL() && !this.e_()) {
         cpq $$11 = this.c(bom.e);
         if ($$11.a(cpt.nS) && cok.d($$11) && this.ga()) {
            this.cr.b(new afz(this, afz.a.i));
         }
      }

      this.df = this.fy();
      if (this.aZ() && this.cs.h && this.dZ()) {
         this.fe();
      }

      if (this.a(auj.a)) {
         int $$12 = this.P_() ? 10 : 1;
         this.dg = awm.a(this.dg + $$12, 0, 600);
      } else if (this.dg > 0) {
         this.a(auj.a);
         this.dg = awm.a(this.dg - 10, 0, 600);
      }

      if (this.fW().b && this.w()) {
         int $$13 = 0;
         if (this.cs.h) {
            $$13--;
         }

         if (this.cs.g) {
            $$13++;
         }

         if ($$13 != 0) {
            this.g(this.dm().b(0.0, (double)((float)$$13 * this.fW().a() * 3.0F), 0.0));
         }
      }

      bph $$14 = this.q();
      if ($$14 != null && $$14.ad_() == 0) {
         if (this.cY < 0) {
            this.cY++;
            if (this.cY == 0) {
               this.cZ = 0.0F;
            }
         }

         if ($$0 && !this.cs.g) {
            this.cY = -10;
            $$14.b(awm.d(this.u() * 100.0F));
            this.h();
         } else if (!$$0 && this.cs.g) {
            this.cY = 0;
            this.cZ = 0.0F;
         } else if ($$0) {
            this.cY++;
            if (this.cY < 10) {
               this.cZ = (float)this.cY * 0.1F;
            } else {
               this.cZ = 0.8F + 2.0F / (float)(this.cY - 9) * 0.1F;
            }
         }
      } else {
         this.cZ = 0.0F;
      }

      super.d_();
      if (this.aC() && this.fW().b && !this.ct.q.h()) {
         this.fW().b = false;
         this.y();
      }
   }

   @Override
   protected void ea() {
      this.aN++;
      if (this.aN == 20) {
         this.a(bof.c.a);
      }
   }

   private void G() {
      this.cB = this.cA;
      float $$0 = 0.0F;
      if (this.au) {
         if (this.ct.y != null && !this.ct.y.m() && !(this.ct.y instanceof ffg)) {
            if (this.ct.y instanceof fhg) {
               this.r();
            }

            this.ct.a(null);
         }

         if (this.cA == 0.0F) {
            this.ct.aj().a(glh.b(atp.uc, this.af.i() * 0.4F + 0.8F, 0.25F));
         }

         $$0 = 0.0125F;
         this.au = false;
      } else if (this.a(bnu.i) && !this.c(bnu.i).a(60)) {
         $$0 = 0.006666667F;
      } else if (this.cA > 0.0F) {
         $$0 = -0.05F;
      }

      this.cA = awm.a(this.cA + $$0, 0.0F, 1.0F);
      this.L();
   }

   @Override
   public void t() {
      super.t();
      this.dc = false;
      if (this.cX() instanceof cjv $$0) {
         $$0.a(this.cs.e, this.cs.f, this.cs.c, this.cs.d);
         this.dc = this.dc | (this.cs.e || this.cs.f || this.cs.c || this.cs.d);
      }
   }

   @Override
   public boolean A() {
      return this.dc;
   }

   @Nullable
   @Override
   public bns d(il<bnq> $$0) {
      if ($$0.a(bnu.i)) {
         this.cB = 0.0F;
         this.cA = 0.0F;
      }

      return super.d($$0);
   }

   @Override
   public void a(bpc $$0, eov $$1) {
      double $$2 = this.do();
      double $$3 = this.du();
      super.a($$0, $$1);
      this.f((float)(this.do() - $$2), (float)(this.du() - $$3));
   }

   public boolean B() {
      return this.dd;
   }

   protected void f(float $$0, float $$1) {
      if (this.H()) {
         eov $$2 = this.dh();
         eov $$3 = $$2.b((double)$$0, 0.0, (double)$$1);
         eov $$4 = new eov((double)$$0, 0.0, (double)$$1);
         float $$5 = this.fh();
         float $$6 = (float)$$4.g();
         if ($$6 <= 0.001F) {
            eou $$7 = this.cs.a();
            float $$8 = $$5 * $$7.i;
            float $$9 = $$5 * $$7.j;
            float $$10 = awm.a(this.dz() * (float) (Math.PI / 180.0));
            float $$11 = awm.b(this.dz() * (float) (Math.PI / 180.0));
            $$4 = new eov((double)($$8 * $$11 - $$9 * $$10), $$4.d, (double)($$9 * $$11 + $$8 * $$10));
            $$6 = (float)$$4.g();
            if ($$6 <= 0.001F) {
               return;
            }
         }

         float $$12 = awm.i($$6);
         eov $$13 = $$4.a((double)$$12);
         eov $$14 = this.bH();
         float $$15 = (float)($$14.c * $$13.c + $$14.e * $$13.e);
         if (!($$15 < -0.15F)) {
            epa $$16 = epa.a(this);
            ib $$17 = ib.a(this.do(), this.cE().e, this.du());
            dme $$18 = this.dJ().a_($$17);
            if ($$18.b(this.dJ(), $$17, $$16).c()) {
               $$17 = $$17.c();
               dme $$19 = this.dJ().a_($$17);
               if ($$19.b(this.dJ(), $$17, $$16).c()) {
                  float $$20 = 7.0F;
                  float $$21 = 1.2F;
                  if (this.a(bnu.h)) {
                     $$21 += (float)(this.c(bnu.h).d() + 1) * 0.75F;
                  }

                  float $$22 = Math.max($$5 * 7.0F, 1.0F / $$12);
                  eov $$24 = $$3.e($$13.a((double)$$22));
                  float $$25 = this.dd();
                  float $$26 = this.de();
                  eoq $$27 = new eoq($$2, $$24.b(0.0, (double)$$26, 0.0)).c((double)$$25, 0.0, (double)$$25);
                  eov $$23 = $$2.b(0.0, 0.51F, 0.0);
                  $$24 = $$24.b(0.0, 0.51F, 0.0);
                  eov $$28 = $$13.c(new eov(0.0, 1.0, 0.0));
                  eov $$29 = $$28.a((double)($$25 * 0.5F));
                  eov $$30 = $$23.d($$29);
                  eov $$31 = $$24.d($$29);
                  eov $$32 = $$23.e($$29);
                  eov $$33 = $$24.e($$29);
                  Iterable<epo> $$34 = this.dJ().d(this, $$27);
                  Iterator<eoq> $$35 = StreamSupport.stream($$34.spliterator(), false).flatMap($$0x -> $$0x.e().stream()).iterator();
                  float $$36 = Float.MIN_VALUE;

                  while ($$35.hasNext()) {
                     eoq $$37 = $$35.next();
                     if ($$37.a($$30, $$31) || $$37.a($$32, $$33)) {
                        $$36 = (float)$$37.e;
                        eov $$38 = $$37.f();
                        ib $$39 = ib.a($$38);

                        for (int $$40 = 1; (float)$$40 < $$21; $$40++) {
                           ib $$41 = $$39.b($$40);
                           dme $$42 = this.dJ().a_($$41);
                           epo $$43;
                           if (!($$43 = $$42.b(this.dJ(), $$41, $$16)).c()) {
                              $$36 = (float)$$43.c(ih.a.b) + (float)$$41.v();
                              if ((double)$$36 - this.dq() > (double)$$21) {
                                 return;
                              }
                           }

                           if ($$40 > 1) {
                              $$17 = $$17.c();
                              dme $$44 = this.dJ().a_($$17);
                              if (!$$44.b(this.dJ(), $$17, $$16).c()) {
                                 return;
                              }
                           }
                        }
                        break;
                     }
                  }

                  if ($$36 != Float.MIN_VALUE) {
                     float $$45 = (float)((double)$$36 - this.dq());
                     if (!($$45 <= 0.5F) && !($$45 > $$21)) {
                        this.de = 1;
                     }
                  }
               }
            }
         }
      }
   }

   @Override
   protected boolean c(eov $$0) {
      float $$1 = this.dz() * (float) (Math.PI / 180.0);
      double $$2 = (double)awm.a($$1);
      double $$3 = (double)awm.b($$1);
      double $$4 = (double)this.bl * $$3 - (double)this.bn * $$2;
      double $$5 = (double)this.bn * $$3 + (double)this.bl * $$2;
      double $$6 = awm.k($$4) + awm.k($$5);
      double $$7 = awm.k($$0.c) + awm.k($$0.e);
      if (!($$6 < 1.0E-5F) && !($$7 < 1.0E-5F)) {
         double $$8 = $$4 * $$0.c + $$5 * $$0.e;
         double $$9 = Math.acos($$8 / Math.sqrt($$6 * $$7));
         return $$9 < 0.13962634F;
      } else {
         return false;
      }
   }

   private boolean H() {
      return this.B() && this.de <= 0 && this.aC() && !this.fM() && !this.bL() && this.I() && (double)this.aK() >= 1.0;
   }

   private boolean I() {
      eou $$0 = this.cs.a();
      return $$0.i != 0.0F || $$0.j != 0.0F;
   }

   private boolean K() {
      return !this.bV() && this.M() && this.N() && !this.fp() && !this.a(bnu.o) && (!this.bL() || this.c(this.cW())) && !this.fy();
   }

   private boolean c(bof $$0) {
      return $$0.dC() && $$0.cU();
   }

   private boolean M() {
      double $$0 = 0.8;
      return this.be() ? this.cs.b() : (double)this.cs.b >= 0.8;
   }

   private boolean N() {
      return this.bL() || (float)this.gf().a() > 6.0F || this.fW().c;
   }

   public float C() {
      if (!this.a(auj.a)) {
         return 0.0F;
      } else {
         float $$0 = 600.0F;
         float $$1 = 100.0F;
         if ((float)this.dg >= 600.0F) {
            return 1.0F;
         } else {
            float $$2 = awm.a((float)this.dg / 100.0F, 0.0F, 1.0F);
            float $$3 = (float)this.dg < 100.0F ? 0.0F : awm.a(((float)this.dg - 100.0F) / 500.0F, 0.0F, 1.0F);
            return $$2 * 0.6F + $$3 * 0.39999998F;
         }
      }
   }

   public void a(cwb $$0) {
      if ($$0 == cwb.d) {
         this.g(this.dm().a(ih.a.b, 0.0));
      }
   }

   @Override
   public boolean be() {
      return this.cj;
   }

   @Override
   protected boolean fN() {
      boolean $$0 = this.cj;
      boolean $$1 = super.fN();
      if (this.P_()) {
         return this.cj;
      } else {
         if (!$$0 && $$1) {
            this.dJ().a(this.do(), this.dq(), this.du(), atp.x, atq.i, 1.0F, 1.0F, false);
            this.ct.aj().a((glm)(new glp.b(this)));
         }

         if ($$0 && !$$1) {
            this.dJ().a(this.do(), this.dq(), this.du(), atp.y, atq.i, 1.0F, 1.0F, false);
         }

         return this.cj;
      }
   }

   @Override
   public eov q(float $$0) {
      if (this.ct.m.ax().a()) {
         float $$1 = awm.i($$0 * 0.5F, this.dz(), this.M) * (float) (Math.PI / 180.0);
         float $$2 = awm.i($$0 * 0.5F, this.dB(), this.N) * (float) (Math.PI / 180.0);
         double $$3 = this.fo() == bor.b ? -1.0 : 1.0;
         eov $$4 = new eov(0.39 * $$3, -0.6, 0.3);
         return $$4.a(-$$2).b(-$$1).e(this.j($$0));
      } else {
         return super.q($$0);
      }
   }

   @Override
   public void a(cpq $$0, cpq $$1, clc $$2) {
      this.ct.aA().a($$0, $$1, $$2);
   }

   @Override
   public float dA() {
      return this.dz();
   }
}
