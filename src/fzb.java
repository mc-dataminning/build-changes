import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fzb extends fyy {
   public static final Logger g = LogUtils.getLogger();
   private static final int cE = 20;
   private static final int cF = 600;
   private static final int cG = 100;
   private static final float cH = 0.6F;
   private static final double cI = 0.35;
   private static final double cJ = 0.13962634F;
   private static final float cK = 0.3F;
   public final fui ct;
   private final auy cL;
   private final fbc cM;
   private final List<gog> cN = Lists.newArrayList();
   private int cO = 0;
   private double cP;
   private double cQ;
   private double cR;
   private float cS;
   private float cT;
   private boolean cU;
   private boolean cV;
   private boolean cW;
   private boolean cX;
   private int cY;
   private boolean cZ;
   public fyz cu;
   protected final fbp cv;
   protected int cw;
   public float cx;
   public float cz;
   public float cA;
   public float cB;
   private int da;
   private float db;
   public float cC;
   public float cD;
   private boolean dc;
   @Nullable
   private bnz dd;
   private boolean de;
   private boolean df = true;
   private int dg;
   private boolean dh;
   private int di;
   private boolean dj = true;
   private boolean dk = false;

   public fzb(fbp $$0, fuh $$1, fui $$2, auy $$3, fbc $$4, boolean $$5, boolean $$6) {
      super($$1, $$2.p());
      this.cv = $$0;
      this.ct = $$2;
      this.cL = $$3;
      this.cM = $$4;
      this.cW = $$5;
      this.cX = $$6;
      this.cN.add(new goy(this, $$0.ak()));
      this.cN.add(new gol(this));
      this.cN.add(new gok(this, $$0.ak(), $$1.F_()));
   }

   @Override
   public boolean a(bot $$0, float $$1) {
      return false;
   }

   @Override
   public void c(float $$0) {
   }

   @Override
   public boolean a(bpv $$0, boolean $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         if ($$0 instanceof clo) {
            this.cv.ak().a((gow)(new goq(this, (clo)$$0, true)));
            this.cv.ak().a((gow)(new goq(this, (clo)$$0, false)));
         }

         return true;
      }
   }

   @Override
   public void bF() {
      super.bF();
      this.de = false;
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
            this.ct.b(new agi.c(this.dC(), this.dE(), this.aC()));
            this.ct.b(new agq(this.bn, this.bp, this.cu.g, this.cu.h));
            bpv $$0 = this.cW();
            if ($$0 != this && $$0.cX()) {
               this.ct.b(new agj($$0));
               this.G();
            }
         } else {
            this.E();
         }

         for (gog $$1 : this.cN) {
            $$1.a();
         }
      }
   }

   public float d() {
      for (gog $$0 : this.cN) {
         if ($$0 instanceof gok) {
            return ((gok)$$0).b();
         }
      }

      return 0.0F;
   }

   private void E() {
      this.G();
      boolean $$0 = this.bS();
      if ($$0 != this.cW) {
         agp.a $$1 = $$0 ? agp.a.a : agp.a.b;
         this.ct.b(new agp(this, $$1));
         this.cW = $$0;
      }

      if (this.z()) {
         double $$2 = this.dr() - this.cP;
         double $$3 = this.dt() - this.cQ;
         double $$4 = this.dx() - this.cR;
         double $$5 = (double)(this.dC() - this.cS);
         double $$6 = (double)(this.dE() - this.cT);
         this.cY++;
         boolean $$7 = axk.f($$2, $$3, $$4) > axk.k(2.0E-4) || this.cY >= 20;
         boolean $$8 = $$5 != 0.0 || $$6 != 0.0;
         if (this.bO()) {
            esa $$9 = this.dp();
            this.ct.b(new agi.b($$9.c, -999.0, $$9.e, this.dC(), this.dE(), this.aC()));
            $$7 = false;
         } else if ($$7 && $$8) {
            this.ct.b(new agi.b(this.dr(), this.dt(), this.dx(), this.dC(), this.dE(), this.aC()));
         } else if ($$7) {
            this.ct.b(new agi.a(this.dr(), this.dt(), this.dx(), this.aC()));
         } else if ($$8) {
            this.ct.b(new agi.c(this.dC(), this.dE(), this.aC()));
         } else if (this.cU != this.aC()) {
            this.ct.b(new agi.d(this.aC()));
         }

         if ($$7) {
            this.cP = this.dr();
            this.cQ = this.dt();
            this.cR = this.dx();
            this.cY = 0;
         }

         if ($$8) {
            this.cS = this.dC();
            this.cT = this.dE();
         }

         this.cU = this.aC();
         this.df = this.cv.m.H().c();
      }
   }

   private void G() {
      boolean $$0 = this.bY();
      if ($$0 != this.cX) {
         agp.a $$1 = $$0 ? agp.a.d : agp.a.e;
         this.ct.b(new agp(this, $$1));
         this.cX = $$0;
      }
   }

   public boolean a(boolean $$0) {
      ago.a $$1 = $$0 ? ago.a.d : ago.a.e;
      crj $$2 = this.fZ().a($$0);
      this.ct.b(new ago($$1, ib.c, ih.a));
      return !$$2.d();
   }

   @Override
   public void a(bnz $$0) {
      super.a($$0);
      this.ct.b(new ahe($$0));
   }

   @Override
   public void fX() {
      this.ct.b(new afv(afv.a.a));
      fbn.c();
   }

   @Override
   protected void f(bot $$0, float $$1) {
      if (!this.b($$0)) {
         this.t(this.ex() - $$1);
      }
   }

   @Override
   public void r() {
      this.ct.b(new aga(this.bY.j));
      this.e();
   }

   public void e() {
      super.r();
      this.cv.a(null);
   }

   public void F(float $$0) {
      if (this.cZ) {
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
         this.cZ = true;
      }
   }

   @Override
   public void y() {
      this.ct.b(new agn(this.ga()));
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
      this.ct.b(new agp(this, agp.a.f, axk.d(this.v() * 100.0F)));
   }

   public void i() {
      this.ct.b(new agp(this, agp.a.h));
   }

   public auy j() {
      return this.cL;
   }

   public fbc m() {
      return this.cM;
   }

   public void a(cvl<?> $$0) {
      if (this.cM.d($$0)) {
         this.cM.e($$0);
         this.ct.b(new ags($$0));
      }
   }

   @Override
   protected int F() {
      return this.cO;
   }

   public void a(int $$0) {
      this.cO = $$0;
   }

   @Override
   public void a(wg $$0, boolean $$1) {
      this.cv.aZ().a($$0, $$1);
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
            esa $$11 = this.dp();
            if ($$5.o() == ih.a.a) {
               this.o(0.1 * (double)$$5.j(), $$11.d, $$11.e);
            } else {
               this.o($$11.c, $$11.d, 0.1 * (double)$$5.l());
            }
         }
      }
   }

   private boolean i(ib $$0) {
      erv $$1 = this.cH();
      erv $$2 = new erv((double)$$0.u(), $$1.b, (double)$$0.w(), (double)$$0.u() + 1.0, $$1.e, (double)$$0.w() + 1.0).h(1.0E-7);
      return this.dM().f(this, $$2);
   }

   public void a(float $$0, int $$1, int $$2) {
      this.cn = $$0;
      this.cm = $$1;
      this.cl = $$2;
   }

   @Override
   public void a(wg $$0) {
      this.cv.l.d().a($$0);
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
      this.dj = $$0;
   }

   public boolean o() {
      return this.dj;
   }

   public void u(boolean $$0) {
      this.dk = $$0;
   }

   public boolean p() {
      return this.dk;
   }

   @Override
   public void a(aul $$0, float $$1, float $$2) {
      this.dM().a(this.dr(), this.dt(), this.dx(), $$0, this.db(), $$1, $$2, false);
   }

   @Override
   public void a(aul $$0, aun $$1, float $$2, float $$3) {
      this.dM().a(this.dr(), this.dt(), this.dx(), $$0, $$1, $$2, $$3, false);
   }

   @Override
   public boolean cY() {
      return true;
   }

   @Override
   public void c(bnz $$0) {
      crj $$1 = this.b($$0);
      if (!$$1.d() && !this.fs()) {
         super.c($$0);
         this.dc = true;
         this.dd = $$0;
      }
   }

   @Override
   public boolean fs() {
      return this.dc;
   }

   @Override
   public void fy() {
      super.fy();
      this.dc = false;
   }

   @Override
   public bnz ft() {
      return Objects.requireNonNullElse(this.dd, bnz.a);
   }

   @Override
   public void a(aiy<?> $$0) {
      super.a($$0);
      if (aE.equals($$0)) {
         boolean $$1 = (this.an.a(aE) & 1) > 0;
         bnz $$2 = (this.an.a(aE) & 2) > 0 ? bnz.b : bnz.a;
         if ($$1 && !this.dc) {
            this.c($$2);
         } else if (!$$1 && this.dc) {
            this.fy();
         }
      }

      if (ao.equals($$0) && this.fB() && !this.dh) {
         this.cv.ak().a((gow)(new gom(this)));
      }
   }

   @Nullable
   public bqy u() {
      if (this.da() instanceof bqy $$0 && $$0.a()) {
         return $$0;
      }

      return null;
   }

   public float v() {
      return this.db;
   }

   @Override
   public boolean Y() {
      return this.cv.aS();
   }

   @Override
   public void a(dnp $$0, boolean $$1) {
      if ($$0 instanceof dnc $$2) {
         this.cv.a(new flj($$2, $$1, this.cv.aS()));
      } else {
         this.cv.a(new flw($$0, $$1, this.cv.aS()));
      }
   }

   @Override
   public void a(cxy $$0) {
      this.cv.a(new flt($$0));
   }

   @Override
   public void a(dmp $$0) {
      this.cv.a(new fkw($$0));
   }

   @Override
   public void a(dnu $$0) {
      this.cv.a(new fma($$0));
   }

   @Override
   public void a(dnf $$0) {
      this.cv.a(new flo($$0));
   }

   @Override
   public void a(crj $$0, bnz $$1) {
      if ($$0.a(crm.tY)) {
         this.cv.a(new fks(this, $$0, $$1));
      }
   }

   @Override
   public void b(bpv $$0) {
      this.cv.g.a($$0, kl.g);
   }

   @Override
   public void c(bpv $$0) {
      this.cv.g.a($$0, kl.s);
   }

   @Override
   public boolean bS() {
      return this.cu != null && this.cu.h;
   }

   @Override
   public boolean bX() {
      return this.cV;
   }

   @Override
   public boolean w() {
      return this.bX() || this.cb();
   }

   @Override
   public void fn() {
      super.fn();
      if (this.z()) {
         this.bn = this.cu.a;
         this.bp = this.cu.b;
         this.bm = this.cu.g;
         this.cA = this.cx;
         this.cB = this.cz;
         this.cz = this.cz + (this.dE() - this.cz) * 0.5F;
         this.cx = this.cx + (this.dC() - this.cx) * 0.5F;
      }
   }

   @Override
   protected boolean z() {
      return this.cv.ao() == this;
   }

   @Override
   public void A() {
      this.b(bqz.a);
      if (this.dM() != null) {
         for (double $$0 = this.dt(); $$0 > (double)this.dM().I_() && $$0 < (double)this.dM().al(); $$0++) {
            this.a_(this.dr(), $$0, this.dx());
            if (this.dM().g(this)) {
               break;
            }
         }

         this.g(esa.b);
         this.s(0.0F);
      }

      this.t(this.eO());
      this.aP = 0;
   }

   @Override
   public void n_() {
      if (this.cw > 0) {
         this.cw--;
      }

      if (!(this.cv.y instanceof fjm)) {
         this.H();
      }

      boolean $$0 = this.cu.g;
      boolean $$1 = this.cu.h;
      boolean $$2 = this.N();
      this.cV = !this.ga().b && !this.bZ() && !this.bO() && this.h(bqz.f) && (this.bS() || !this.fI() && !this.h(bqz.a));
      float $$3 = axk.a(0.3F + cwr.b(this), 0.0F, 1.0F);
      this.cu.a(this.w(), $$3);
      this.cv.aB().a(this.cu);
      if (this.fs() && !this.bO()) {
         this.cu.a *= 0.2F;
         this.cu.b *= 0.2F;
         this.cw = 0;
      }

      boolean $$4 = false;
      if (this.dg > 0) {
         this.dg--;
         $$4 = true;
         this.cu.g = true;
      }

      if (!this.af) {
         this.c(this.dr() - (double)this.dg() * 0.35, this.dx() + (double)this.dg() * 0.35);
         this.c(this.dr() - (double)this.dg() * 0.35, this.dx() - (double)this.dg() * 0.35);
         this.c(this.dr() + (double)this.dg() * 0.35, this.dx() - (double)this.dg() * 0.35);
         this.c(this.dr() + (double)this.dg() * 0.35, this.dx() + (double)this.dg() * 0.35);
      }

      if ($$1) {
         this.cw = 0;
      }

      boolean $$5 = this.M();
      boolean $$6 = this.bO() ? this.cZ().aC() : this.aC();
      boolean $$7 = !$$1 && !$$2;
      if (($$6 || this.bh()) && $$7 && $$5) {
         if (this.cw <= 0 && !this.cv.m.D.e()) {
            this.cw = 7;
         } else {
            this.g(true);
         }
      }

      if ((!this.bc() || this.bh()) && $$5 && this.cv.m.D.e()) {
         this.g(true);
      }

      if (this.bY()) {
         boolean $$8 = !this.cu.b() || !this.O();
         boolean $$9 = $$8 || this.P && !this.S || this.bc() && !this.bh();
         if (this.bZ()) {
            if (!this.aC() && !this.cu.h && $$8 || !this.bc()) {
               this.g(false);
            }
         } else if ($$9) {
            this.g(false);
         }
      }

      boolean $$10 = false;
      if (this.ga().c) {
         if (this.cv.q.h()) {
            if (!this.ga().b) {
               this.ga().b = true;
               $$10 = true;
               this.y();
            }
         } else if (!$$0 && this.cu.g && !$$4) {
            if (this.ca == 0) {
               this.ca = 7;
            } else if (!this.bZ()) {
               this.ga().b = !this.ga().b;
               $$10 = true;
               this.y();
               this.ca = 0;
            }
         }
      }

      if (this.cu.g && !$$10 && !$$0 && !this.ga().b && !this.bO() && !this.q_()) {
         crj $$11 = this.d(bqc.e);
         if ($$11.a(crm.nS) && cqf.j($$11) && this.ge()) {
            this.ct.b(new agp(this, agp.a.i));
         }
      }

      this.dh = this.fB();
      if (this.bc() && this.cu.h && this.ec()) {
         this.fh();
      }

      if (this.a(avh.a)) {
         int $$12 = this.N_() ? 10 : 1;
         this.di = axk.a(this.di + $$12, 0, 600);
      } else if (this.di > 0) {
         this.a(avh.a);
         this.di = axk.a(this.di - 10, 0, 600);
      }

      if (this.ga().b && this.z()) {
         int $$13 = 0;
         if (this.cu.h) {
            $$13--;
         }

         if (this.cu.g) {
            $$13++;
         }

         if ($$13 != 0) {
            this.g(this.dp().b(0.0, (double)((float)$$13 * this.ga().a() * 3.0F), 0.0));
         }
      }

      bqy $$14 = this.u();
      if ($$14 != null && $$14.ab_() == 0) {
         if (this.da < 0) {
            this.da++;
            if (this.da == 0) {
               this.db = 0.0F;
            }
         }

         if ($$0 && !this.cu.g) {
            this.da = -10;
            $$14.b(axk.d(this.v() * 100.0F));
            this.h();
         } else if (!$$0 && this.cu.g) {
            this.da = 0;
            this.db = 0.0F;
         } else if ($$0) {
            this.da++;
            if (this.da < 10) {
               this.db = (float)this.da * 0.1F;
            } else {
               this.db = 0.8F + 2.0F / (float)(this.da - 9) * 0.1F;
            }
         }
      } else {
         this.db = 0.0F;
      }

      super.n_();
      if (this.aC() && this.ga().b && !this.cv.q.h()) {
         this.ga().b = false;
         this.y();
      }
   }

   @Override
   protected void ed() {
      this.aP++;
      if (this.aP == 20) {
         this.a(bpv.c.a);
      }
   }

   private void H() {
      this.cD = this.cC;
      float $$0 = 0.0F;
      if (this.av) {
         if (this.cv.y != null && !this.cv.y.k() && !(this.cv.y instanceof fim)) {
            if (this.cv.y instanceof fkm) {
               this.r();
            }

            this.cv.a(null);
         }

         if (this.cC == 0.0F) {
            this.cv.ak().a(gor.b(aum.un, this.ag.i() * 0.4F + 0.8F, 0.25F));
         }

         $$0 = 0.0125F;
         this.av = false;
      } else if (this.b(bpj.i) && !this.c(bpj.i).a(60)) {
         $$0 = 0.006666667F;
      } else if (this.cC > 0.0F) {
         $$0 = -0.05F;
      }

      this.cC = axk.a(this.cC + $$0, 0.0F, 1.0F);
      this.L();
   }

   @Override
   public void t() {
      super.t();
      this.de = false;
      if (this.da() instanceof clq $$0) {
         $$0.a(this.cu.e, this.cu.f, this.cu.c, this.cu.d);
         this.de = this.de | (this.cu.e || this.cu.f || this.cu.c || this.cu.d);
      }
   }

   public boolean B() {
      return this.de;
   }

   @Nullable
   @Override
   public bph d(il<bpf> $$0) {
      if ($$0.a(bpj.i)) {
         this.cD = 0.0F;
         this.cC = 0.0F;
      }

      return super.d($$0);
   }

   @Override
   public void a(bqt $$0, esa $$1) {
      double $$2 = this.dr();
      double $$3 = this.dx();
      super.a($$0, $$1);
      this.f((float)(this.dr() - $$2), (float)(this.dx() - $$3));
   }

   public boolean C() {
      return this.df;
   }

   protected void f(float $$0, float $$1) {
      if (this.I()) {
         esa $$2 = this.dk();
         esa $$3 = $$2.b((double)$$0, 0.0, (double)$$1);
         esa $$4 = new esa((double)$$0, 0.0, (double)$$1);
         float $$5 = this.fk();
         float $$6 = (float)$$4.g();
         if ($$6 <= 0.001F) {
            erz $$7 = this.cu.a();
            float $$8 = $$5 * $$7.i;
            float $$9 = $$5 * $$7.j;
            float $$10 = axk.a(this.dC() * (float) (Math.PI / 180.0));
            float $$11 = axk.b(this.dC() * (float) (Math.PI / 180.0));
            $$4 = new esa((double)($$8 * $$11 - $$9 * $$10), $$4.d, (double)($$9 * $$11 + $$8 * $$10));
            $$6 = (float)$$4.g();
            if ($$6 <= 0.001F) {
               return;
            }
         }

         float $$12 = axk.i($$6);
         esa $$13 = $$4.a((double)$$12);
         esa $$14 = this.bK();
         float $$15 = (float)($$14.c * $$13.c + $$14.e * $$13.e);
         if (!($$15 < -0.15F)) {
            esf $$16 = esf.a(this);
            ib $$17 = ib.a(this.dr(), this.cH().e, this.dx());
            doz $$18 = this.dM().a_($$17);
            if ($$18.b(this.dM(), $$17, $$16).c()) {
               $$17 = $$17.c();
               doz $$19 = this.dM().a_($$17);
               if ($$19.b(this.dM(), $$17, $$16).c()) {
                  float $$20 = 7.0F;
                  float $$21 = 1.2F;
                  if (this.b(bpj.h)) {
                     $$21 += (float)(this.c(bpj.h).d() + 1) * 0.75F;
                  }

                  float $$22 = Math.max($$5 * 7.0F, 1.0F / $$12);
                  esa $$24 = $$3.e($$13.a((double)$$22));
                  float $$25 = this.dg();
                  float $$26 = this.dh();
                  erv $$27 = new erv($$2, $$24.b(0.0, (double)$$26, 0.0)).c((double)$$25, 0.0, (double)$$25);
                  esa $$23 = $$2.b(0.0, 0.51F, 0.0);
                  $$24 = $$24.b(0.0, 0.51F, 0.0);
                  esa $$28 = $$13.c(new esa(0.0, 1.0, 0.0));
                  esa $$29 = $$28.a((double)($$25 * 0.5F));
                  esa $$30 = $$23.d($$29);
                  esa $$31 = $$24.d($$29);
                  esa $$32 = $$23.e($$29);
                  esa $$33 = $$24.e($$29);
                  Iterable<est> $$34 = this.dM().d(this, $$27);
                  Iterator<erv> $$35 = StreamSupport.stream($$34.spliterator(), false).flatMap($$0x -> $$0x.e().stream()).iterator();
                  float $$36 = Float.MIN_VALUE;

                  while ($$35.hasNext()) {
                     erv $$37 = $$35.next();
                     if ($$37.a($$30, $$31) || $$37.a($$32, $$33)) {
                        $$36 = (float)$$37.e;
                        esa $$38 = $$37.f();
                        ib $$39 = ib.a($$38);

                        for (int $$40 = 1; (float)$$40 < $$21; $$40++) {
                           ib $$41 = $$39.b($$40);
                           doz $$42 = this.dM().a_($$41);
                           est $$43;
                           if (!($$43 = $$42.b(this.dM(), $$41, $$16)).c()) {
                              $$36 = (float)$$43.c(ih.a.b) + (float)$$41.v();
                              if ((double)$$36 - this.dt() > (double)$$21) {
                                 return;
                              }
                           }

                           if ($$40 > 1) {
                              $$17 = $$17.c();
                              doz $$44 = this.dM().a_($$17);
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
                        this.dg = 1;
                     }
                  }
               }
            }
         }
      }
   }

   @Override
   protected boolean c(esa $$0) {
      float $$1 = this.dC() * (float) (Math.PI / 180.0);
      double $$2 = (double)axk.a($$1);
      double $$3 = (double)axk.b($$1);
      double $$4 = (double)this.bn * $$3 - (double)this.bp * $$2;
      double $$5 = (double)this.bp * $$3 + (double)this.bn * $$2;
      double $$6 = axk.k($$4) + axk.k($$5);
      double $$7 = axk.k($$0.c) + axk.k($$0.e);
      if (!($$6 < 1.0E-5F) && !($$7 < 1.0E-5F)) {
         double $$8 = $$4 * $$0.c + $$5 * $$0.e;
         double $$9 = Math.acos($$8 / Math.sqrt($$6 * $$7));
         return $$9 < 0.13962634F;
      } else {
         return false;
      }
   }

   private boolean I() {
      return this.C() && this.dg <= 0 && this.aC() && !this.fQ() && !this.bO() && this.K() && (double)this.aK() >= 1.0;
   }

   private boolean K() {
      erz $$0 = this.cu.a();
      return $$0.i != 0.0F || $$0.j != 0.0F;
   }

   private boolean M() {
      return !this.bY() && this.N() && this.O() && !this.fs() && !this.b(bpj.o) && (!this.bO() || this.d(this.cZ())) && !this.fB();
   }

   private boolean d(bpv $$0) {
      return $$0.dF() && $$0.cX();
   }

   private boolean N() {
      double $$0 = 0.8;
      return this.bh() ? this.cu.b() : (double)this.cu.b >= 0.8;
   }

   private boolean O() {
      return this.bO() || (float)this.gj().a() > 6.0F || this.ga().c;
   }

   public float D() {
      if (!this.a(avh.a)) {
         return 0.0F;
      } else {
         float $$0 = 600.0F;
         float $$1 = 100.0F;
         if ((float)this.di >= 600.0F) {
            return 1.0F;
         } else {
            float $$2 = axk.a((float)this.di / 100.0F, 0.0F, 1.0F);
            float $$3 = (float)this.di < 100.0F ? 0.0F : axk.a(((float)this.di - 100.0F) / 500.0F, 0.0F, 1.0F);
            return $$2 * 0.6F + $$3 * 0.39999998F;
         }
      }
   }

   public void a(cyu $$0) {
      if ($$0 == cyu.d) {
         this.g(this.dp().a(ih.a.b, 0.0));
      }
   }

   @Override
   public boolean bh() {
      return this.ck;
   }

   @Override
   protected boolean fR() {
      boolean $$0 = this.ck;
      boolean $$1 = super.fR();
      if (this.N_()) {
         return this.ck;
      } else {
         if (!$$0 && $$1) {
            this.dM().a(this.dr(), this.dt(), this.dx(), aum.x, aun.i, 1.0F, 1.0F, false);
            this.cv.ak().a((gow)(new goz.b(this)));
         }

         if ($$0 && !$$1) {
            this.dM().a(this.dr(), this.dt(), this.dx(), aum.y, aun.i, 1.0F, 1.0F, false);
         }

         return this.ck;
      }
   }

   @Override
   public esa q(float $$0) {
      if (this.cv.m.aA().a()) {
         float $$1 = axk.i($$0 * 0.5F, this.dC(), this.N) * (float) (Math.PI / 180.0);
         float $$2 = axk.i($$0 * 0.5F, this.dE(), this.O) * (float) (Math.PI / 180.0);
         double $$3 = this.fr() == bqi.b ? -1.0 : 1.0;
         esa $$4 = new esa(0.39 * $$3, -0.6, 0.3);
         return $$4.a(-$$2).b(-$$1).e(this.j($$0));
      } else {
         return super.q($$0);
      }
   }

   @Override
   public void a(crj $$0, crj $$1, cmx $$2) {
      this.cv.aB().a($$0, $$1, $$2);
   }

   @Override
   public float dD() {
      return this.dC();
   }
}
