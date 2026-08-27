import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fws extends fwp {
   public static final Logger g = LogUtils.getLogger();
   private static final int cF = 20;
   private static final int cG = 600;
   private static final int cH = 100;
   private static final float cI = 0.6F;
   private static final double cJ = 0.35;
   private static final double cK = 0.13962634F;
   private static final float cL = 0.3F;
   public final frz cu;
   private final auj cM;
   private final eyt cN;
   private final List<glw> cO = Lists.newArrayList();
   private int cP = 0;
   private double cQ;
   private double cR;
   private double cS;
   private float cT;
   private float cU;
   private boolean cV;
   private boolean cW;
   private boolean cX;
   private boolean cY;
   private int cZ;
   private boolean da;
   public fwq cv;
   protected final ezg cw;
   protected int cx;
   public float cz;
   public float cA;
   public float cB;
   public float cC;
   private int db;
   private float dc;
   public float cD;
   public float cE;
   private boolean dd;
   @Nullable
   private bnb de;
   private boolean df;
   private boolean dg = true;
   private int dh;
   private boolean di;
   private int dj;
   private boolean dk = true;
   private boolean dl = false;

   public fws(ezg $$0, fry $$1, frz $$2, auj $$3, eyt $$4, boolean $$5, boolean $$6) {
      super($$1, $$2.p());
      this.cw = $$0;
      this.cu = $$2;
      this.cM = $$3;
      this.cN = $$4;
      this.cX = $$5;
      this.cY = $$6;
      this.cO.add(new gmo(this, $$0.ak()));
      this.cO.add(new gmb(this));
      this.cO.add(new gma(this, $$0.ak(), $$1.F_()));
   }

   @Override
   public boolean a(bnv $$0, float $$1) {
      return false;
   }

   @Override
   public void c(float $$0) {
   }

   @Override
   public boolean a(bow $$0, boolean $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         if ($$0 instanceof ckn) {
            this.cw.ak().a((gmm)(new gmg(this, (ckn)$$0, true)));
            this.cw.ak().a((gmm)(new gmg(this, (ckn)$$0, false)));
         }

         return true;
      }
   }

   @Override
   public void bF() {
      super.bF();
      this.df = false;
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
            this.cu.b(new afw.c(this.dC(), this.dE(), this.aC()));
            this.cu.b(new age(this.bn, this.bp, this.cv.g, this.cv.h));
            bow $$0 = this.cW();
            if ($$0 != this && $$0.cX()) {
               this.cu.b(new afx($$0));
               this.G();
            }
         } else {
            this.E();
         }

         for (glw $$1 : this.cO) {
            $$1.a();
         }
      }
   }

   public float d() {
      for (glw $$0 : this.cO) {
         if ($$0 instanceof gma) {
            return ((gma)$$0).b();
         }
      }

      return 0.0F;
   }

   private void E() {
      this.G();
      boolean $$0 = this.bS();
      if ($$0 != this.cX) {
         agd.a $$1 = $$0 ? agd.a.a : agd.a.b;
         this.cu.b(new agd(this, $$1));
         this.cX = $$0;
      }

      if (this.z()) {
         double $$2 = this.dr() - this.cQ;
         double $$3 = this.dt() - this.cR;
         double $$4 = this.dx() - this.cS;
         double $$5 = (double)(this.dC() - this.cT);
         double $$6 = (double)(this.dE() - this.cU);
         this.cZ++;
         boolean $$7 = aww.f($$2, $$3, $$4) > aww.k(2.0E-4) || this.cZ >= 20;
         boolean $$8 = $$5 != 0.0 || $$6 != 0.0;
         if (this.bO()) {
            epr $$9 = this.dp();
            this.cu.b(new afw.b($$9.c, -999.0, $$9.e, this.dC(), this.dE(), this.aC()));
            $$7 = false;
         } else if ($$7 && $$8) {
            this.cu.b(new afw.b(this.dr(), this.dt(), this.dx(), this.dC(), this.dE(), this.aC()));
         } else if ($$7) {
            this.cu.b(new afw.a(this.dr(), this.dt(), this.dx(), this.aC()));
         } else if ($$8) {
            this.cu.b(new afw.c(this.dC(), this.dE(), this.aC()));
         } else if (this.cV != this.aC()) {
            this.cu.b(new afw.d(this.aC()));
         }

         if ($$7) {
            this.cQ = this.dr();
            this.cR = this.dt();
            this.cS = this.dx();
            this.cZ = 0;
         }

         if ($$8) {
            this.cT = this.dC();
            this.cU = this.dE();
         }

         this.cV = this.aC();
         this.dg = this.cw.m.F().c();
      }
   }

   private void G() {
      boolean $$0 = this.bY();
      if ($$0 != this.cY) {
         agd.a $$1 = $$0 ? agd.a.d : agd.a.e;
         this.cu.b(new agd(this, $$1));
         this.cY = $$0;
      }
   }

   public boolean a(boolean $$0) {
      agc.a $$1 = $$0 ? agc.a.d : agc.a.e;
      cqk $$2 = this.fZ().a($$0);
      this.cu.b(new agc($$1, ib.c, ih.a));
      return !$$2.b();
   }

   @Override
   public void a(bnb $$0) {
      super.a($$0);
      this.cu.b(new ags($$0));
   }

   @Override
   public void fX() {
      this.cu.b(new afj(afj.a.a));
      eze.c();
   }

   @Override
   protected void f(bnv $$0, float $$1) {
      if (!this.b($$0)) {
         this.t(this.ex() - $$1);
      }
   }

   @Override
   public void r() {
      this.cu.b(new afo(this.bZ.j));
      this.e();
   }

   public void e() {
      super.r();
      this.cw.a(null);
   }

   public void F(float $$0) {
      if (this.da) {
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
         this.da = true;
      }
   }

   @Override
   public void y() {
      this.cu.b(new agb(this.ga()));
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
      this.cu.b(new agd(this, agd.a.f, aww.d(this.v() * 100.0F)));
   }

   public void i() {
      this.cu.b(new agd(this, agd.a.h));
   }

   public auj j() {
      return this.cM;
   }

   public eyt m() {
      return this.cN;
   }

   public void a(ctp<?> $$0) {
      if (this.cN.d($$0)) {
         this.cN.e($$0);
         this.cu.b(new agg($$0));
      }
   }

   @Override
   protected int F() {
      return this.cP;
   }

   public void a(int $$0) {
      this.cP = $$0;
   }

   @Override
   public void a(vu $$0, boolean $$1) {
      this.cw.aZ().a($$0, $$1);
   }

   private void c(double $$0, double $$1) {
      ib $$2 = ib.a($$0, this.dt(), $$1);
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
            epr $$11 = this.dp();
            if ($$5.o() == ih.a.a) {
               this.o(0.1 * (double)$$5.j(), $$11.d, $$11.e);
            } else {
               this.o($$11.c, $$11.d, 0.1 * (double)$$5.l());
            }
         }
      }
   }

   private boolean i(ib $$0) {
      epm $$1 = this.cH();
      epm $$2 = new epm((double)$$0.u(), $$1.b, (double)$$0.w(), (double)$$0.u() + 1.0, $$1.e, (double)$$0.w() + 1.0).h(1.0E-7);
      return this.dM().f(this, $$2);
   }

   public void a(float $$0, int $$1, int $$2) {
      this.co = $$0;
      this.cn = $$1;
      this.cm = $$2;
   }

   @Override
   public void a(vu $$0) {
      this.cw.l.d().a($$0);
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
      this.dk = $$0;
   }

   public boolean o() {
      return this.dk;
   }

   public void u(boolean $$0) {
      this.dl = $$0;
   }

   public boolean p() {
      return this.dl;
   }

   @Override
   public void a(atx $$0, float $$1, float $$2) {
      this.dM().a(this.dr(), this.dt(), this.dx(), $$0, this.db(), $$1, $$2, false);
   }

   @Override
   public void a(atx $$0, atz $$1, float $$2, float $$3) {
      this.dM().a(this.dr(), this.dt(), this.dx(), $$0, $$1, $$2, $$3, false);
   }

   @Override
   public boolean cY() {
      return true;
   }

   @Override
   public void c(bnb $$0) {
      cqk $$1 = this.b($$0);
      if (!$$1.b() && !this.fs()) {
         super.c($$0);
         this.dd = true;
         this.de = $$0;
      }
   }

   @Override
   public boolean fs() {
      return this.dd;
   }

   @Override
   public void fy() {
      super.fy();
      this.dd = false;
   }

   @Override
   public bnb ft() {
      return Objects.requireNonNullElse(this.de, bnb.a);
   }

   @Override
   public void a(aim<?> $$0) {
      super.a($$0);
      if (aE.equals($$0)) {
         boolean $$1 = (this.an.a(aE) & 1) > 0;
         bnb $$2 = (this.an.a(aE) & 2) > 0 ? bnb.b : bnb.a;
         if ($$1 && !this.dd) {
            this.c($$2);
         } else if (!$$1 && this.dd) {
            this.fy();
         }
      }

      if (ao.equals($$0) && this.fB() && !this.di) {
         this.cw.ak().a((gmm)(new gmc(this)));
      }
   }

   @Nullable
   public bpy u() {
      if (this.da() instanceof bpy $$0 && $$0.a()) {
         return $$0;
      }

      return null;
   }

   public float v() {
      return this.dc;
   }

   @Override
   public boolean Y() {
      return this.cw.aS();
   }

   @Override
   public void a(dlp $$0, boolean $$1) {
      if ($$0 instanceof dld $$2) {
         this.cw.a(new fjb($$2, $$1, this.cw.aS()));
      } else {
         this.cw.a(new fjo($$0, $$1, this.cw.aS()));
      }
   }

   @Override
   public void a(cwa $$0) {
      this.cw.a(new fjl($$0));
   }

   @Override
   public void a(dkq $$0) {
      this.cw.a(new fio($$0));
   }

   @Override
   public void a(dlu $$0) {
      this.cw.a(new fjs($$0));
   }

   @Override
   public void a(dlg $$0) {
      this.cw.a(new fjg($$0));
   }

   @Override
   public void a(cqk $$0, bnb $$1) {
      if ($$0.a(cqn.tX)) {
         this.cw.a(new fik(this, $$0, $$1));
      }
   }

   @Override
   public void b(bow $$0) {
      this.cw.g.a($$0, kc.g);
   }

   @Override
   public void c(bow $$0) {
      this.cw.g.a($$0, kc.s);
   }

   @Override
   public boolean bS() {
      return this.cv != null && this.cv.h;
   }

   @Override
   public boolean bX() {
      return this.cW;
   }

   @Override
   public boolean w() {
      return this.bX() || this.cb();
   }

   @Override
   public void fn() {
      super.fn();
      if (this.z()) {
         this.bn = this.cv.a;
         this.bp = this.cv.b;
         this.bm = this.cv.g;
         this.cB = this.cz;
         this.cC = this.cA;
         this.cA = this.cA + (this.dE() - this.cA) * 0.5F;
         this.cz = this.cz + (this.dC() - this.cz) * 0.5F;
      }
   }

   protected boolean z() {
      return this.cw.ao() == this;
   }

   @Override
   public void A() {
      this.b(bpz.a);
      if (this.dM() != null) {
         for (double $$0 = this.dt(); $$0 > (double)this.dM().I_() && $$0 < (double)this.dM().ak(); $$0++) {
            this.a_(this.dr(), $$0, this.dx());
            if (this.dM().g(this)) {
               break;
            }
         }

         this.g(epr.b);
         this.s(0.0F);
      }

      this.t(this.eO());
      this.aP = 0;
   }

   @Override
   public void m_() {
      if (this.cx > 0) {
         this.cx--;
      }

      if (!(this.cw.y instanceof fhd)) {
         this.H();
      }

      boolean $$0 = this.cv.g;
      boolean $$1 = this.cv.h;
      boolean $$2 = this.N();
      this.cW = !this.ga().b && !this.bZ() && !this.bO() && this.h(bpz.f) && (this.bS() || !this.fI() && !this.h(bpz.a));
      float $$3 = aww.a(0.3F + cuv.b(this), 0.0F, 1.0F);
      this.cv.a(this.w(), $$3);
      this.cw.aB().a(this.cv);
      if (this.fs() && !this.bO()) {
         this.cv.a *= 0.2F;
         this.cv.b *= 0.2F;
         this.cx = 0;
      }

      boolean $$4 = false;
      if (this.dh > 0) {
         this.dh--;
         $$4 = true;
         this.cv.g = true;
      }

      if (!this.af) {
         this.c(this.dr() - (double)this.dg() * 0.35, this.dx() + (double)this.dg() * 0.35);
         this.c(this.dr() - (double)this.dg() * 0.35, this.dx() - (double)this.dg() * 0.35);
         this.c(this.dr() + (double)this.dg() * 0.35, this.dx() - (double)this.dg() * 0.35);
         this.c(this.dr() + (double)this.dg() * 0.35, this.dx() + (double)this.dg() * 0.35);
      }

      if ($$1) {
         this.cx = 0;
      }

      boolean $$5 = this.M();
      boolean $$6 = this.bO() ? this.cZ().aC() : this.aC();
      boolean $$7 = !$$1 && !$$2;
      if (($$6 || this.bh()) && $$7 && $$5) {
         if (this.cx <= 0 && !this.cw.m.D.e()) {
            this.cx = 7;
         } else {
            this.g(true);
         }
      }

      if ((!this.bc() || this.bh()) && $$5 && this.cw.m.D.e()) {
         this.g(true);
      }

      if (this.bY()) {
         boolean $$8 = !this.cv.b() || !this.O();
         boolean $$9 = $$8 || this.P && !this.S || this.bc() && !this.bh();
         if (this.bZ()) {
            if (!this.aC() && !this.cv.h && $$8 || !this.bc()) {
               this.g(false);
            }
         } else if ($$9) {
            this.g(false);
         }
      }

      boolean $$10 = false;
      if (this.ga().c) {
         if (this.cw.q.h()) {
            if (!this.ga().b) {
               this.ga().b = true;
               $$10 = true;
               this.y();
            }
         } else if (!$$0 && this.cv.g && !$$4) {
            if (this.cb == 0) {
               this.cb = 7;
            } else if (!this.bZ()) {
               this.ga().b = !this.ga().b;
               $$10 = true;
               this.y();
               this.cb = 0;
            }
         }
      }

      if (this.cv.g && !$$10 && !$$0 && !this.ga().b && !this.bO() && !this.p_()) {
         cqk $$11 = this.d(bpd.e);
         if ($$11.a(cqn.nS) && cpf.d($$11) && this.ge()) {
            this.cu.b(new agd(this, agd.a.i));
         }
      }

      this.di = this.fB();
      if (this.bc() && this.cv.h && this.ec()) {
         this.fh();
      }

      if (this.a(aus.a)) {
         int $$12 = this.N_() ? 10 : 1;
         this.dj = aww.a(this.dj + $$12, 0, 600);
      } else if (this.dj > 0) {
         this.a(aus.a);
         this.dj = aww.a(this.dj - 10, 0, 600);
      }

      if (this.ga().b && this.z()) {
         int $$13 = 0;
         if (this.cv.h) {
            $$13--;
         }

         if (this.cv.g) {
            $$13++;
         }

         if ($$13 != 0) {
            this.g(this.dp().b(0.0, (double)((float)$$13 * this.ga().a() * 3.0F), 0.0));
         }
      }

      bpy $$14 = this.u();
      if ($$14 != null && $$14.ab_() == 0) {
         if (this.db < 0) {
            this.db++;
            if (this.db == 0) {
               this.dc = 0.0F;
            }
         }

         if ($$0 && !this.cv.g) {
            this.db = -10;
            $$14.b(aww.d(this.v() * 100.0F));
            this.h();
         } else if (!$$0 && this.cv.g) {
            this.db = 0;
            this.dc = 0.0F;
         } else if ($$0) {
            this.db++;
            if (this.db < 10) {
               this.dc = (float)this.db * 0.1F;
            } else {
               this.dc = 0.8F + 2.0F / (float)(this.db - 9) * 0.1F;
            }
         }
      } else {
         this.dc = 0.0F;
      }

      super.m_();
      if (this.aC() && this.ga().b && !this.cw.q.h()) {
         this.ga().b = false;
         this.y();
      }
   }

   @Override
   protected void ed() {
      this.aP++;
      if (this.aP == 20) {
         this.a(bow.c.a);
      }
   }

   private void H() {
      this.cE = this.cD;
      float $$0 = 0.0F;
      if (this.av) {
         if (this.cw.y != null && !this.cw.y.m() && !(this.cw.y instanceof fgd)) {
            if (this.cw.y instanceof fie) {
               this.r();
            }

            this.cw.a(null);
         }

         if (this.cD == 0.0F) {
            this.cw.ak().a(gmh.b(aty.uf, this.ag.i() * 0.4F + 0.8F, 0.25F));
         }

         $$0 = 0.0125F;
         this.av = false;
      } else if (this.a(bol.i) && !this.c(bol.i).a(60)) {
         $$0 = 0.006666667F;
      } else if (this.cD > 0.0F) {
         $$0 = -0.05F;
      }

      this.cD = aww.a(this.cD + $$0, 0.0F, 1.0F);
      this.L();
   }

   @Override
   public void t() {
      super.t();
      this.df = false;
      if (this.da() instanceof ckp $$0) {
         $$0.a(this.cv.e, this.cv.f, this.cv.c, this.cv.d);
         this.df = this.df | (this.cv.e || this.cv.f || this.cv.c || this.cv.d);
      }
   }

   public boolean B() {
      return this.df;
   }

   @Nullable
   @Override
   public boj d(il<boh> $$0) {
      if ($$0.a(bol.i)) {
         this.cE = 0.0F;
         this.cD = 0.0F;
      }

      return super.d($$0);
   }

   @Override
   public void a(bpt $$0, epr $$1) {
      double $$2 = this.dr();
      double $$3 = this.dx();
      super.a($$0, $$1);
      this.f((float)(this.dr() - $$2), (float)(this.dx() - $$3));
   }

   public boolean C() {
      return this.dg;
   }

   protected void f(float $$0, float $$1) {
      if (this.I()) {
         epr $$2 = this.dk();
         epr $$3 = $$2.b((double)$$0, 0.0, (double)$$1);
         epr $$4 = new epr((double)$$0, 0.0, (double)$$1);
         float $$5 = this.fk();
         float $$6 = (float)$$4.g();
         if ($$6 <= 0.001F) {
            epq $$7 = this.cv.a();
            float $$8 = $$5 * $$7.i;
            float $$9 = $$5 * $$7.j;
            float $$10 = aww.a(this.dC() * (float) (Math.PI / 180.0));
            float $$11 = aww.b(this.dC() * (float) (Math.PI / 180.0));
            $$4 = new epr((double)($$8 * $$11 - $$9 * $$10), $$4.d, (double)($$9 * $$11 + $$8 * $$10));
            $$6 = (float)$$4.g();
            if ($$6 <= 0.001F) {
               return;
            }
         }

         float $$12 = aww.i($$6);
         epr $$13 = $$4.a((double)$$12);
         epr $$14 = this.bK();
         float $$15 = (float)($$14.c * $$13.c + $$14.e * $$13.e);
         if (!($$15 < -0.15F)) {
            epw $$16 = epw.a(this);
            ib $$17 = ib.a(this.dr(), this.cH().e, this.dx());
            dmz $$18 = this.dM().a_($$17);
            if ($$18.b(this.dM(), $$17, $$16).c()) {
               $$17 = $$17.c();
               dmz $$19 = this.dM().a_($$17);
               if ($$19.b(this.dM(), $$17, $$16).c()) {
                  float $$20 = 7.0F;
                  float $$21 = 1.2F;
                  if (this.a(bol.h)) {
                     $$21 += (float)(this.c(bol.h).d() + 1) * 0.75F;
                  }

                  float $$22 = Math.max($$5 * 7.0F, 1.0F / $$12);
                  epr $$24 = $$3.e($$13.a((double)$$22));
                  float $$25 = this.dg();
                  float $$26 = this.dh();
                  epm $$27 = new epm($$2, $$24.b(0.0, (double)$$26, 0.0)).c((double)$$25, 0.0, (double)$$25);
                  epr $$23 = $$2.b(0.0, 0.51F, 0.0);
                  $$24 = $$24.b(0.0, 0.51F, 0.0);
                  epr $$28 = $$13.c(new epr(0.0, 1.0, 0.0));
                  epr $$29 = $$28.a((double)($$25 * 0.5F));
                  epr $$30 = $$23.d($$29);
                  epr $$31 = $$24.d($$29);
                  epr $$32 = $$23.e($$29);
                  epr $$33 = $$24.e($$29);
                  Iterable<eqk> $$34 = this.dM().d(this, $$27);
                  Iterator<epm> $$35 = StreamSupport.stream($$34.spliterator(), false).flatMap($$0x -> $$0x.e().stream()).iterator();
                  float $$36 = Float.MIN_VALUE;

                  while ($$35.hasNext()) {
                     epm $$37 = $$35.next();
                     if ($$37.a($$30, $$31) || $$37.a($$32, $$33)) {
                        $$36 = (float)$$37.e;
                        epr $$38 = $$37.f();
                        ib $$39 = ib.a($$38);

                        for (int $$40 = 1; (float)$$40 < $$21; $$40++) {
                           ib $$41 = $$39.b($$40);
                           dmz $$42 = this.dM().a_($$41);
                           eqk $$43;
                           if (!($$43 = $$42.b(this.dM(), $$41, $$16)).c()) {
                              $$36 = (float)$$43.c(ih.a.b) + (float)$$41.v();
                              if ((double)$$36 - this.dt() > (double)$$21) {
                                 return;
                              }
                           }

                           if ($$40 > 1) {
                              $$17 = $$17.c();
                              dmz $$44 = this.dM().a_($$17);
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
                        this.dh = 1;
                     }
                  }
               }
            }
         }
      }
   }

   @Override
   protected boolean c(epr $$0) {
      float $$1 = this.dC() * (float) (Math.PI / 180.0);
      double $$2 = (double)aww.a($$1);
      double $$3 = (double)aww.b($$1);
      double $$4 = (double)this.bn * $$3 - (double)this.bp * $$2;
      double $$5 = (double)this.bp * $$3 + (double)this.bn * $$2;
      double $$6 = aww.k($$4) + aww.k($$5);
      double $$7 = aww.k($$0.c) + aww.k($$0.e);
      if (!($$6 < 1.0E-5F) && !($$7 < 1.0E-5F)) {
         double $$8 = $$4 * $$0.c + $$5 * $$0.e;
         double $$9 = Math.acos($$8 / Math.sqrt($$6 * $$7));
         return $$9 < 0.13962634F;
      } else {
         return false;
      }
   }

   private boolean I() {
      return this.C() && this.dh <= 0 && this.aC() && !this.fQ() && !this.bO() && this.K() && (double)this.aK() >= 1.0;
   }

   private boolean K() {
      epq $$0 = this.cv.a();
      return $$0.i != 0.0F || $$0.j != 0.0F;
   }

   private boolean M() {
      return !this.bY() && this.N() && this.O() && !this.fs() && !this.a(bol.o) && (!this.bO() || this.d(this.cZ())) && !this.fB();
   }

   private boolean d(bow $$0) {
      return $$0.dF() && $$0.cX();
   }

   private boolean N() {
      double $$0 = 0.8;
      return this.bh() ? this.cv.b() : (double)this.cv.b >= 0.8;
   }

   private boolean O() {
      return this.bO() || (float)this.gj().a() > 6.0F || this.ga().c;
   }

   public float D() {
      if (!this.a(aus.a)) {
         return 0.0F;
      } else {
         float $$0 = 600.0F;
         float $$1 = 100.0F;
         if ((float)this.dj >= 600.0F) {
            return 1.0F;
         } else {
            float $$2 = aww.a((float)this.dj / 100.0F, 0.0F, 1.0F);
            float $$3 = (float)this.dj < 100.0F ? 0.0F : aww.a(((float)this.dj - 100.0F) / 500.0F, 0.0F, 1.0F);
            return $$2 * 0.6F + $$3 * 0.39999998F;
         }
      }
   }

   public void a(cww $$0) {
      if ($$0 == cww.d) {
         this.g(this.dp().a(ih.a.b, 0.0));
      }
   }

   @Override
   public boolean bh() {
      return this.cl;
   }

   @Override
   protected boolean fR() {
      boolean $$0 = this.cl;
      boolean $$1 = super.fR();
      if (this.N_()) {
         return this.cl;
      } else {
         if (!$$0 && $$1) {
            this.dM().a(this.dr(), this.dt(), this.dx(), aty.x, atz.i, 1.0F, 1.0F, false);
            this.cw.ak().a((gmm)(new gmp.b(this)));
         }

         if ($$0 && !$$1) {
            this.dM().a(this.dr(), this.dt(), this.dx(), aty.y, atz.i, 1.0F, 1.0F, false);
         }

         return this.cl;
      }
   }

   @Override
   public epr q(float $$0) {
      if (this.cw.m.ay().a()) {
         float $$1 = aww.i($$0 * 0.5F, this.dC(), this.N) * (float) (Math.PI / 180.0);
         float $$2 = aww.i($$0 * 0.5F, this.dE(), this.O) * (float) (Math.PI / 180.0);
         double $$3 = this.fr() == bpi.b ? -1.0 : 1.0;
         epr $$4 = new epr(0.39 * $$3, -0.6, 0.3);
         return $$4.a(-$$2).b(-$$1).e(this.j($$0));
      } else {
         return super.q($$0);
      }
   }

   @Override
   public void a(cqk $$0, cqk $$1, clw $$2) {
      this.cw.aB().a($$0, $$1, $$2);
   }

   @Override
   public float dD() {
      return this.dC();
   }
}
