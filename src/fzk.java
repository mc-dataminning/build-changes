import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fzk extends fzh {
   public static final Logger g = LogUtils.getLogger();
   private static final int cG = 20;
   private static final int cH = 600;
   private static final int cI = 100;
   private static final float cJ = 0.6F;
   private static final double cK = 0.35;
   private static final double cL = 0.13962634F;
   private static final float cM = 0.3F;
   public final fur cv;
   private final ava cN;
   private final fbl cO;
   private final List<gop> cP = Lists.newArrayList();
   private int cQ = 0;
   private double cR;
   private double cS;
   private double cT;
   private float cU;
   private float cV;
   private boolean cW;
   private boolean cX;
   private boolean cY;
   private boolean cZ;
   private int da;
   private boolean db;
   public fzi cw;
   protected final fby cx;
   protected int cz;
   public float cA;
   public float cB;
   public float cC;
   public float cD;
   private int dc;
   private float dd;
   public float cE;
   public float cF;
   private boolean de;
   @Nullable
   private boe df;
   private boolean dg;
   private boolean dh = true;
   private int di;
   private boolean dj;
   private int dk;
   private boolean dl = true;
   private boolean dm = false;

   public fzk(fby $$0, fuq $$1, fur $$2, ava $$3, fbl $$4, boolean $$5, boolean $$6) {
      super($$1, $$2.p());
      this.cx = $$0;
      this.cv = $$2;
      this.cN = $$3;
      this.cO = $$4;
      this.cY = $$5;
      this.cZ = $$6;
      this.cP.add(new gph(this, $$0.ak()));
      this.cP.add(new gou(this));
      this.cP.add(new got(this, $$0.ak(), $$1.F_()));
   }

   @Override
   public boolean a(boy $$0, float $$1) {
      return false;
   }

   @Override
   public void c(float $$0) {
   }

   @Override
   public boolean a(bqa $$0, boolean $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         if ($$0 instanceof clv) {
            this.cx.ak().a((gpf)(new goz(this, (clv)$$0, true)));
            this.cx.ak().a((gpf)(new goz(this, (clv)$$0, false)));
         }

         return true;
      }
   }

   @Override
   public void bF() {
      super.bF();
      this.dg = false;
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
            this.cv.b(new agk.c(this.dC(), this.dE(), this.aC()));
            this.cv.b(new ags(this.bn, this.bp, this.cw.g, this.cw.h));
            bqa $$0 = this.cW();
            if ($$0 != this && $$0.cX()) {
               this.cv.b(new agl($$0));
               this.G();
            }
         } else {
            this.E();
         }

         for (gop $$1 : this.cP) {
            $$1.a();
         }
      }
   }

   public float d() {
      for (gop $$0 : this.cP) {
         if ($$0 instanceof got) {
            return ((got)$$0).b();
         }
      }

      return 0.0F;
   }

   private void E() {
      this.G();
      boolean $$0 = this.bS();
      if ($$0 != this.cY) {
         agr.a $$1 = $$0 ? agr.a.a : agr.a.b;
         this.cv.b(new agr(this, $$1));
         this.cY = $$0;
      }

      if (this.z()) {
         double $$2 = this.dr() - this.cR;
         double $$3 = this.dt() - this.cS;
         double $$4 = this.dx() - this.cT;
         double $$5 = (double)(this.dC() - this.cU);
         double $$6 = (double)(this.dE() - this.cV);
         this.da++;
         boolean $$7 = axm.f($$2, $$3, $$4) > axm.k(2.0E-4) || this.da >= 20;
         boolean $$8 = $$5 != 0.0 || $$6 != 0.0;
         if (this.bO()) {
            esj $$9 = this.dp();
            this.cv.b(new agk.b($$9.c, -999.0, $$9.e, this.dC(), this.dE(), this.aC()));
            $$7 = false;
         } else if ($$7 && $$8) {
            this.cv.b(new agk.b(this.dr(), this.dt(), this.dx(), this.dC(), this.dE(), this.aC()));
         } else if ($$7) {
            this.cv.b(new agk.a(this.dr(), this.dt(), this.dx(), this.aC()));
         } else if ($$8) {
            this.cv.b(new agk.c(this.dC(), this.dE(), this.aC()));
         } else if (this.cW != this.aC()) {
            this.cv.b(new agk.d(this.aC()));
         }

         if ($$7) {
            this.cR = this.dr();
            this.cS = this.dt();
            this.cT = this.dx();
            this.da = 0;
         }

         if ($$8) {
            this.cU = this.dC();
            this.cV = this.dE();
         }

         this.cW = this.aC();
         this.dh = this.cx.m.H().c();
      }
   }

   private void G() {
      boolean $$0 = this.bY();
      if ($$0 != this.cZ) {
         agr.a $$1 = $$0 ? agr.a.d : agr.a.e;
         this.cv.b(new agr(this, $$1));
         this.cZ = $$0;
      }
   }

   public boolean a(boolean $$0) {
      agq.a $$1 = $$0 ? agq.a.d : agq.a.e;
      crs $$2 = this.fZ().a($$0);
      this.cv.b(new agq($$1, id.c, ij.a));
      return !$$2.d();
   }

   @Override
   public void a(boe $$0) {
      super.a($$0);
      this.cv.b(new ahg($$0));
   }

   @Override
   public void fX() {
      this.cv.b(new afx(afx.a.a));
      fbw.c();
   }

   @Override
   protected void f(boy $$0, float $$1) {
      if (!this.b($$0)) {
         this.t(this.ex() - $$1);
      }
   }

   @Override
   public void r() {
      this.cv.b(new agc(this.ca.j));
      this.e();
   }

   public void e() {
      super.r();
      this.cx.a(null);
   }

   public void F(float $$0) {
      if (this.db) {
         float $$1 = this.ex() - $$0;
         if ($$1 <= 0.0F) {
            this.t($$0);
            if ($$1 < 0.0F) {
               this.al = 10;
            }
         } else {
            this.bl = $$1;
            this.al = 20;
            this.t($$0);
            this.aO = 10;
            this.aN = this.aO;
         }
      } else {
         this.t($$0);
         this.db = true;
      }
   }

   @Override
   public void y() {
      this.cv.b(new agp(this.ga()));
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
   public boolean bo() {
      return !this.ga().b && super.bo();
   }

   @Override
   public boolean dT() {
      return !this.ga().b && super.dT();
   }

   protected void h() {
      this.cv.b(new agr(this, agr.a.f, axm.d(this.v() * 100.0F)));
   }

   public void i() {
      this.cv.b(new agr(this, agr.a.h));
   }

   public ava j() {
      return this.cN;
   }

   public fbl m() {
      return this.cO;
   }

   public void a(cvu<?> $$0) {
      if (this.cO.d($$0)) {
         this.cO.e($$0);
         this.cv.b(new agu($$0));
      }
   }

   @Override
   protected int F() {
      return this.cQ;
   }

   public void a(int $$0) {
      this.cQ = $$0;
   }

   @Override
   public void a(wi $$0, boolean $$1) {
      this.cx.aZ().a($$0, $$1);
   }

   private void c(double $$0, double $$1) {
      id $$2 = id.a($$0, this.dt(), $$1);
      if (this.i($$2)) {
         double $$3 = $$0 - (double)$$2.u();
         double $$4 = $$1 - (double)$$2.w();
         ij $$5 = null;
         double $$6 = Double.MAX_VALUE;
         ij[] $$7 = new ij[]{ij.e, ij.f, ij.c, ij.d};

         for (ij $$8 : $$7) {
            double $$9 = $$8.o().a($$3, 0.0, $$4);
            double $$10 = $$8.f() == ij.b.a ? 1.0 - $$9 : $$9;
            if ($$10 < $$6 && !this.i($$2.a($$8))) {
               $$6 = $$10;
               $$5 = $$8;
            }
         }

         if ($$5 != null) {
            esj $$11 = this.dp();
            if ($$5.o() == ij.a.a) {
               this.o(0.1 * (double)$$5.j(), $$11.d, $$11.e);
            } else {
               this.o($$11.c, $$11.d, 0.1 * (double)$$5.l());
            }
         }
      }
   }

   private boolean i(id $$0) {
      ese $$1 = this.cH();
      ese $$2 = new ese((double)$$0.u(), $$1.b, (double)$$0.w(), (double)$$0.u() + 1.0, $$1.e, (double)$$0.w() + 1.0).h(1.0E-7);
      return this.dM().f(this, $$2);
   }

   public void a(float $$0, int $$1, int $$2) {
      this.cp = $$0;
      this.co = $$1;
      this.cn = $$2;
   }

   @Override
   public void a(wi $$0) {
      this.cx.l.d().a($$0);
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
      this.dl = $$0;
   }

   public boolean o() {
      return this.dl;
   }

   public void u(boolean $$0) {
      this.dm = $$0;
   }

   public boolean p() {
      return this.dm;
   }

   @Override
   public void a(aun $$0, float $$1, float $$2) {
      this.dM().a(this.dr(), this.dt(), this.dx(), $$0, this.db(), $$1, $$2, false);
   }

   @Override
   public void a(aun $$0, aup $$1, float $$2, float $$3) {
      this.dM().a(this.dr(), this.dt(), this.dx(), $$0, $$1, $$2, $$3, false);
   }

   @Override
   public boolean cY() {
      return true;
   }

   @Override
   public void c(boe $$0) {
      crs $$1 = this.b($$0);
      if (!$$1.d() && !this.fs()) {
         super.c($$0);
         this.de = true;
         this.df = $$0;
      }
   }

   @Override
   public boolean fs() {
      return this.de;
   }

   @Override
   public void fy() {
      super.fy();
      this.de = false;
   }

   @Override
   public boe ft() {
      return Objects.requireNonNullElse(this.df, boe.a);
   }

   @Override
   public void a(aja<?> $$0) {
      super.a($$0);
      if (aE.equals($$0)) {
         boolean $$1 = (this.an.a(aE) & 1) > 0;
         boe $$2 = (this.an.a(aE) & 2) > 0 ? boe.b : boe.a;
         if ($$1 && !this.de) {
            this.c($$2);
         } else if (!$$1 && this.de) {
            this.fy();
         }
      }

      if (ao.equals($$0) && this.fB() && !this.dj) {
         this.cx.ak().a((gpf)(new gov(this)));
      }
   }

   @Nullable
   public brd u() {
      if (this.da() instanceof brd $$0 && $$0.a()) {
         return $$0;
      }

      return null;
   }

   public float v() {
      return this.dd;
   }

   @Override
   public boolean Y() {
      return this.cx.aS();
   }

   @Override
   public void a(dny $$0, boolean $$1) {
      if ($$0 instanceof dnl $$2) {
         this.cx.a(new fls($$2, $$1, this.cx.aS()));
      } else {
         this.cx.a(new fmf($$0, $$1, this.cx.aS()));
      }
   }

   @Override
   public void a(cyh $$0) {
      this.cx.a(new fmc($$0));
   }

   @Override
   public void a(dmy $$0) {
      this.cx.a(new flf($$0));
   }

   @Override
   public void a(dod $$0) {
      this.cx.a(new fmj($$0));
   }

   @Override
   public void a(dno $$0) {
      this.cx.a(new flx($$0));
   }

   @Override
   public void a(crs $$0, boe $$1) {
      if ($$0.a(crv.tY)) {
         this.cx.a(new flb(this, $$0, $$1));
      }
   }

   @Override
   public void b(bqa $$0) {
      this.cx.g.a($$0, kn.g);
   }

   @Override
   public void c(bqa $$0) {
      this.cx.g.a($$0, kn.s);
   }

   @Override
   public boolean bS() {
      return this.cw != null && this.cw.h;
   }

   @Override
   public boolean bX() {
      return this.cX;
   }

   @Override
   public boolean w() {
      return this.bX() || this.cb();
   }

   @Override
   public void fn() {
      super.fn();
      if (this.z()) {
         this.bn = this.cw.a;
         this.bp = this.cw.b;
         this.bm = this.cw.g;
         this.cC = this.cA;
         this.cD = this.cB;
         this.cB = this.cB + (this.dE() - this.cB) * 0.5F;
         this.cA = this.cA + (this.dC() - this.cA) * 0.5F;
      }
   }

   @Override
   protected boolean z() {
      return this.cx.ao() == this;
   }

   @Override
   public void A() {
      this.b(bre.a);
      if (this.dM() != null) {
         for (double $$0 = this.dt(); $$0 > (double)this.dM().I_() && $$0 < (double)this.dM().al(); $$0++) {
            this.a_(this.dr(), $$0, this.dx());
            if (this.dM().g(this)) {
               break;
            }
         }

         this.g(esj.b);
         this.s(0.0F);
      }

      this.t(this.eO());
      this.aP = 0;
   }

   @Override
   public void n_() {
      if (this.cz > 0) {
         this.cz--;
      }

      if (!(this.cx.y instanceof fjv)) {
         this.H();
      }

      boolean $$0 = this.cw.g;
      boolean $$1 = this.cw.h;
      boolean $$2 = this.N();
      this.cX = !this.ga().b && !this.bZ() && !this.bO() && this.h(bre.f) && (this.bS() || !this.fI() && !this.h(bre.a));
      float $$3 = axm.a(0.3F + cxa.b(this), 0.0F, 1.0F);
      this.cw.a(this.w(), $$3);
      this.cx.aB().a(this.cw);
      if (this.fs() && !this.bO()) {
         this.cw.a *= 0.2F;
         this.cw.b *= 0.2F;
         this.cz = 0;
      }

      boolean $$4 = false;
      if (this.di > 0) {
         this.di--;
         $$4 = true;
         this.cw.g = true;
      }

      if (!this.af) {
         this.c(this.dr() - (double)this.dg() * 0.35, this.dx() + (double)this.dg() * 0.35);
         this.c(this.dr() - (double)this.dg() * 0.35, this.dx() - (double)this.dg() * 0.35);
         this.c(this.dr() + (double)this.dg() * 0.35, this.dx() - (double)this.dg() * 0.35);
         this.c(this.dr() + (double)this.dg() * 0.35, this.dx() + (double)this.dg() * 0.35);
      }

      if ($$1) {
         this.cz = 0;
      }

      boolean $$5 = this.M();
      boolean $$6 = this.bO() ? this.cZ().aC() : this.aC();
      boolean $$7 = !$$1 && !$$2;
      if (($$6 || this.bh()) && $$7 && $$5) {
         if (this.cz <= 0 && !this.cx.m.D.e()) {
            this.cz = 7;
         } else {
            this.g(true);
         }
      }

      if ((!this.bc() || this.bh()) && $$5 && this.cx.m.D.e()) {
         this.g(true);
      }

      if (this.bY()) {
         boolean $$8 = !this.cw.b() || !this.O();
         boolean $$9 = $$8 || this.P && !this.S || this.bc() && !this.bh();
         if (this.bZ()) {
            if (!this.aC() && !this.cw.h && $$8 || !this.bc()) {
               this.g(false);
            }
         } else if ($$9) {
            this.g(false);
         }
      }

      boolean $$10 = false;
      if (this.ga().c) {
         if (this.cx.q.h()) {
            if (!this.ga().b) {
               this.ga().b = true;
               $$10 = true;
               this.y();
            }
         } else if (!$$0 && this.cw.g && !$$4) {
            if (this.cc == 0) {
               this.cc = 7;
            } else if (!this.bZ()) {
               this.ga().b = !this.ga().b;
               $$10 = true;
               this.y();
               this.cc = 0;
            }
         }
      }

      if (this.cw.g && !$$10 && !$$0 && !this.ga().b && !this.bO() && !this.q_()) {
         crs $$11 = this.d(bqh.e);
         if ($$11.a(crv.nS) && cqo.j($$11) && this.ge()) {
            this.cv.b(new agr(this, agr.a.i));
         }
      }

      this.dj = this.fB();
      if (this.bc() && this.cw.h && this.ec()) {
         this.fh();
      }

      if (this.a(avj.a)) {
         int $$12 = this.N_() ? 10 : 1;
         this.dk = axm.a(this.dk + $$12, 0, 600);
      } else if (this.dk > 0) {
         this.a(avj.a);
         this.dk = axm.a(this.dk - 10, 0, 600);
      }

      if (this.ga().b && this.z()) {
         int $$13 = 0;
         if (this.cw.h) {
            $$13--;
         }

         if (this.cw.g) {
            $$13++;
         }

         if ($$13 != 0) {
            this.g(this.dp().b(0.0, (double)((float)$$13 * this.ga().a() * 3.0F), 0.0));
         }
      }

      brd $$14 = this.u();
      if ($$14 != null && $$14.c() == 0) {
         if (this.dc < 0) {
            this.dc++;
            if (this.dc == 0) {
               this.dd = 0.0F;
            }
         }

         if ($$0 && !this.cw.g) {
            this.dc = -10;
            $$14.b(axm.d(this.v() * 100.0F));
            this.h();
         } else if (!$$0 && this.cw.g) {
            this.dc = 0;
            this.dd = 0.0F;
         } else if ($$0) {
            this.dc++;
            if (this.dc < 10) {
               this.dd = (float)this.dc * 0.1F;
            } else {
               this.dd = 0.8F + 2.0F / (float)(this.dc - 9) * 0.1F;
            }
         }
      } else {
         this.dd = 0.0F;
      }

      super.n_();
      if (this.aC() && this.ga().b && !this.cx.q.h()) {
         this.ga().b = false;
         this.y();
      }
   }

   @Override
   protected void ed() {
      this.aP++;
      if (this.aP == 20) {
         this.a(bqa.c.a);
      }
   }

   private void H() {
      this.cF = this.cE;
      float $$0 = 0.0F;
      if (this.av) {
         if (this.cx.y != null && !this.cx.y.k() && !(this.cx.y instanceof fiv)) {
            if (this.cx.y instanceof fkv) {
               this.r();
            }

            this.cx.a(null);
         }

         if (this.cE == 0.0F) {
            this.cx.ak().a(gpa.b(auo.un, this.ag.i() * 0.4F + 0.8F, 0.25F));
         }

         $$0 = 0.0125F;
         this.av = false;
      } else if (this.b(bpo.i) && !this.c(bpo.i).a(60)) {
         $$0 = 0.006666667F;
      } else if (this.cE > 0.0F) {
         $$0 = -0.05F;
      }

      this.cE = axm.a(this.cE + $$0, 0.0F, 1.0F);
      this.L();
   }

   @Override
   public void t() {
      super.t();
      this.dg = false;
      if (this.da() instanceof clx $$0) {
         $$0.a(this.cw.e, this.cw.f, this.cw.c, this.cw.d);
         this.dg = this.dg | (this.cw.e || this.cw.f || this.cw.c || this.cw.d);
      }
   }

   public boolean B() {
      return this.dg;
   }

   @Nullable
   @Override
   public bpm d(in<bpk> $$0) {
      if ($$0.a(bpo.i)) {
         this.cF = 0.0F;
         this.cE = 0.0F;
      }

      return super.d($$0);
   }

   @Override
   public void a(bqy $$0, esj $$1) {
      double $$2 = this.dr();
      double $$3 = this.dx();
      super.a($$0, $$1);
      this.f((float)(this.dr() - $$2), (float)(this.dx() - $$3));
   }

   public boolean C() {
      return this.dh;
   }

   protected void f(float $$0, float $$1) {
      if (this.I()) {
         esj $$2 = this.dk();
         esj $$3 = $$2.b((double)$$0, 0.0, (double)$$1);
         esj $$4 = new esj((double)$$0, 0.0, (double)$$1);
         float $$5 = this.fk();
         float $$6 = (float)$$4.g();
         if ($$6 <= 0.001F) {
            esi $$7 = this.cw.a();
            float $$8 = $$5 * $$7.i;
            float $$9 = $$5 * $$7.j;
            float $$10 = axm.a(this.dC() * (float) (Math.PI / 180.0));
            float $$11 = axm.b(this.dC() * (float) (Math.PI / 180.0));
            $$4 = new esj((double)($$8 * $$11 - $$9 * $$10), $$4.d, (double)($$9 * $$11 + $$8 * $$10));
            $$6 = (float)$$4.g();
            if ($$6 <= 0.001F) {
               return;
            }
         }

         float $$12 = axm.i($$6);
         esj $$13 = $$4.a((double)$$12);
         esj $$14 = this.bK();
         float $$15 = (float)($$14.c * $$13.c + $$14.e * $$13.e);
         if (!($$15 < -0.15F)) {
            eso $$16 = eso.a(this);
            id $$17 = id.a(this.dr(), this.cH().e, this.dx());
            dpi $$18 = this.dM().a_($$17);
            if ($$18.b(this.dM(), $$17, $$16).c()) {
               $$17 = $$17.c();
               dpi $$19 = this.dM().a_($$17);
               if ($$19.b(this.dM(), $$17, $$16).c()) {
                  float $$20 = 7.0F;
                  float $$21 = 1.2F;
                  if (this.b(bpo.h)) {
                     $$21 += (float)(this.c(bpo.h).d() + 1) * 0.75F;
                  }

                  float $$22 = Math.max($$5 * 7.0F, 1.0F / $$12);
                  esj $$24 = $$3.e($$13.a((double)$$22));
                  float $$25 = this.dg();
                  float $$26 = this.dh();
                  ese $$27 = new ese($$2, $$24.b(0.0, (double)$$26, 0.0)).c((double)$$25, 0.0, (double)$$25);
                  esj $$23 = $$2.b(0.0, 0.51F, 0.0);
                  $$24 = $$24.b(0.0, 0.51F, 0.0);
                  esj $$28 = $$13.c(new esj(0.0, 1.0, 0.0));
                  esj $$29 = $$28.a((double)($$25 * 0.5F));
                  esj $$30 = $$23.d($$29);
                  esj $$31 = $$24.d($$29);
                  esj $$32 = $$23.e($$29);
                  esj $$33 = $$24.e($$29);
                  Iterable<etc> $$34 = this.dM().d(this, $$27);
                  Iterator<ese> $$35 = StreamSupport.stream($$34.spliterator(), false).flatMap($$0x -> $$0x.e().stream()).iterator();
                  float $$36 = Float.MIN_VALUE;

                  while ($$35.hasNext()) {
                     ese $$37 = $$35.next();
                     if ($$37.a($$30, $$31) || $$37.a($$32, $$33)) {
                        $$36 = (float)$$37.e;
                        esj $$38 = $$37.f();
                        id $$39 = id.a($$38);

                        for (int $$40 = 1; (float)$$40 < $$21; $$40++) {
                           id $$41 = $$39.b($$40);
                           dpi $$42 = this.dM().a_($$41);
                           etc $$43;
                           if (!($$43 = $$42.b(this.dM(), $$41, $$16)).c()) {
                              $$36 = (float)$$43.c(ij.a.b) + (float)$$41.v();
                              if ((double)$$36 - this.dt() > (double)$$21) {
                                 return;
                              }
                           }

                           if ($$40 > 1) {
                              $$17 = $$17.c();
                              dpi $$44 = this.dM().a_($$17);
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
                        this.di = 1;
                     }
                  }
               }
            }
         }
      }
   }

   @Override
   protected boolean c(esj $$0) {
      float $$1 = this.dC() * (float) (Math.PI / 180.0);
      double $$2 = (double)axm.a($$1);
      double $$3 = (double)axm.b($$1);
      double $$4 = (double)this.bn * $$3 - (double)this.bp * $$2;
      double $$5 = (double)this.bp * $$3 + (double)this.bn * $$2;
      double $$6 = axm.k($$4) + axm.k($$5);
      double $$7 = axm.k($$0.c) + axm.k($$0.e);
      if (!($$6 < 1.0E-5F) && !($$7 < 1.0E-5F)) {
         double $$8 = $$4 * $$0.c + $$5 * $$0.e;
         double $$9 = Math.acos($$8 / Math.sqrt($$6 * $$7));
         return $$9 < 0.13962634F;
      } else {
         return false;
      }
   }

   private boolean I() {
      return this.C() && this.di <= 0 && this.aC() && !this.fQ() && !this.bO() && this.K() && (double)this.aK() >= 1.0;
   }

   private boolean K() {
      esi $$0 = this.cw.a();
      return $$0.i != 0.0F || $$0.j != 0.0F;
   }

   private boolean M() {
      return !this.bY() && this.N() && this.O() && !this.fs() && !this.b(bpo.o) && (!this.bO() || this.d(this.cZ())) && !this.fB();
   }

   private boolean d(bqa $$0) {
      return $$0.dF() && $$0.cX();
   }

   private boolean N() {
      double $$0 = 0.8;
      return this.bh() ? this.cw.b() : (double)this.cw.b >= 0.8;
   }

   private boolean O() {
      return this.bO() || (float)this.gj().a() > 6.0F || this.ga().c;
   }

   public float D() {
      if (!this.a(avj.a)) {
         return 0.0F;
      } else {
         float $$0 = 600.0F;
         float $$1 = 100.0F;
         if ((float)this.dk >= 600.0F) {
            return 1.0F;
         } else {
            float $$2 = axm.a((float)this.dk / 100.0F, 0.0F, 1.0F);
            float $$3 = (float)this.dk < 100.0F ? 0.0F : axm.a(((float)this.dk - 100.0F) / 500.0F, 0.0F, 1.0F);
            return $$2 * 0.6F + $$3 * 0.39999998F;
         }
      }
   }

   public void a(czd $$0) {
      if ($$0 == czd.d) {
         this.g(this.dp().a(ij.a.b, 0.0));
      }
   }

   @Override
   public boolean bh() {
      return this.cm;
   }

   @Override
   protected boolean fR() {
      boolean $$0 = this.cm;
      boolean $$1 = super.fR();
      if (this.N_()) {
         return this.cm;
      } else {
         if (!$$0 && $$1) {
            this.dM().a(this.dr(), this.dt(), this.dx(), auo.x, aup.i, 1.0F, 1.0F, false);
            this.cx.ak().a((gpf)(new gpi.b(this)));
         }

         if ($$0 && !$$1) {
            this.dM().a(this.dr(), this.dt(), this.dx(), auo.y, aup.i, 1.0F, 1.0F, false);
         }

         return this.cm;
      }
   }

   @Override
   public esj q(float $$0) {
      if (this.cx.m.aA().a()) {
         float $$1 = axm.i($$0 * 0.5F, this.dC(), this.N) * (float) (Math.PI / 180.0);
         float $$2 = axm.i($$0 * 0.5F, this.dE(), this.O) * (float) (Math.PI / 180.0);
         double $$3 = this.fr() == bqn.b ? -1.0 : 1.0;
         esj $$4 = new esj(0.39 * $$3, -0.6, 0.3);
         return $$4.a(-$$2).b(-$$1).e(this.j($$0));
      } else {
         return super.q($$0);
      }
   }

   @Override
   public void a(crs $$0, crs $$1, cne $$2) {
      this.cx.aB().a($$0, $$1, $$2);
   }

   @Override
   public float dD() {
      return this.dC();
   }
}
