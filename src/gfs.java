import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gfs extends gfp {
   public static final Logger cw = LogUtils.getLogger();
   private static final int cI = 20;
   private static final int cJ = 600;
   private static final int cK = 100;
   private static final float cL = 0.6F;
   private static final double cM = 0.35;
   private static final double cN = 0.13962634F;
   public final gay cx;
   private final awo cO;
   private final fhm cP;
   private final List<gzo> cQ = Lists.newArrayList();
   private int cR = 0;
   private double cS;
   private double cT;
   private double cU;
   private float cV;
   private float cW;
   private boolean cX;
   private boolean cY;
   private boolean cZ;
   private boolean da;
   private boolean db;
   private int dc;
   private boolean dd;
   public gfq cy;
   protected final fib cz;
   protected int cB;
   public float cC;
   public float cD;
   public float cE;
   public float cF;
   private int de;
   private float df;
   public float cG;
   public float cH;
   private boolean dg;
   @Nullable
   private brj dh;
   private boolean di;
   private boolean dj = true;
   private int dk;
   private boolean dl;
   private int dm;
   private boolean dn = true;
   private boolean do = false;

   public gfs(fib $$0, gax $$1, gay $$2, awo $$3, fhm $$4, boolean $$5, boolean $$6) {
      super($$1, $$2.o());
      this.cz = $$0;
      this.cx = $$2;
      this.cO = $$3;
      this.cP = $$4;
      this.da = $$5;
      this.db = $$6;
      this.cQ.add(new hag(this, $$0.aj()));
      this.cQ.add(new gzt(this));
      this.cQ.add(new gzs(this, $$0.aj(), $$1.D_()));
   }

   @Override
   public boolean a(bsb $$0, float $$1) {
      return false;
   }

   @Override
   public void c(float $$0) {
   }

   @Override
   public boolean a(btj $$0, boolean $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         if ($$0 instanceof cpm) {
            this.cz.aj().a((hae)(new gzy(this, (cpm)$$0, true)));
            this.cz.aj().a((hae)(new gzy(this, (cpm)$$0, false)));
         }

         return true;
      }
   }

   @Override
   public void bN() {
      super.bN();
      this.di = false;
   }

   @Override
   public float h(float $$0) {
      return this.dK();
   }

   @Override
   public float i(float $$0) {
      return this.bW() ? super.i($$0) : this.dI();
   }

   @Override
   public void l() {
      if (this.dS().f(this.dw(), this.dC())) {
         super.l();
         this.G();
         if (this.bW()) {
            this.cx.b(new ahp.c(this.dI(), this.dK(), this.aH(), this.Q));
            this.cx.b(new ahx(this.bl, this.bn, this.cy.g, this.cy.h));
            btj $$0 = this.dd();
            if ($$0 != this && $$0.de()) {
               this.cx.b(new ahq($$0));
               this.I();
            }
         } else {
            this.F();
         }

         for (gzo $$1 : this.cQ) {
            $$1.a();
         }
      }
   }

   public float c() {
      for (gzo $$0 : this.cQ) {
         if ($$0 instanceof gzs) {
            return ((gzs)$$0).b();
         }
      }

      return 0.0F;
   }

   private void F() {
      this.I();
      if (this.x()) {
         double $$0 = this.dx() - this.cS;
         double $$1 = this.dz() - this.cT;
         double $$2 = this.dD() - this.cU;
         double $$3 = (double)(this.dI() - this.cV);
         double $$4 = (double)(this.dK() - this.cW);
         this.dc++;
         boolean $$5 = azc.f($$0, $$1, $$2) > azc.k(2.0E-4) || this.dc >= 20;
         boolean $$6 = $$3 != 0.0 || $$4 != 0.0;
         if ($$5 && $$6) {
            this.cx.b(new ahp.b(this.dx(), this.dz(), this.dD(), this.dI(), this.dK(), this.aH(), this.Q));
         } else if ($$5) {
            this.cx.b(new ahp.a(this.dx(), this.dz(), this.dD(), this.aH(), this.Q));
         } else if ($$6) {
            this.cx.b(new ahp.c(this.dI(), this.dK(), this.aH(), this.Q));
         } else if (this.cX != this.aH() || this.cY != this.Q) {
            this.cx.b(new ahp.d(this.aH(), this.Q));
         }

         if ($$5) {
            this.cS = this.dx();
            this.cT = this.dz();
            this.cU = this.dD();
            this.dc = 0;
         }

         if ($$6) {
            this.cV = this.dI();
            this.cW = this.dK();
         }

         this.cX = this.aH();
         this.cY = this.Q;
         this.dj = this.cz.n.I().c();
      }
   }

   private void G() {
      boolean $$0 = this.ca();
      if ($$0 != this.da) {
         ahw.a $$1 = $$0 ? ahw.a.a : ahw.a.b;
         this.cx.b(new ahw(this, $$1));
         this.da = $$0;
      }
   }

   private void I() {
      boolean $$0 = this.cg();
      if ($$0 != this.db) {
         ahw.a $$1 = $$0 ? ahw.a.d : ahw.a.e;
         this.cx.b(new ahw(this, $$1));
         this.db = $$0;
      }
   }

   public boolean b(boolean $$0) {
      ahv.a $$1 = $$0 ? ahv.a.d : ahv.a.e;
      cvl $$2 = this.gc().a($$0);
      this.cx.b(new ahv($$1, je.c, jj.a));
      return !$$2.f();
   }

   @Override
   public void a(brj $$0) {
      super.a($$0);
      this.cx.b(new aim($$0));
   }

   @Override
   public void ga() {
      this.cx.b(new ahb(ahb.a.a));
      fhz.c();
   }

   @Override
   protected void f(bsb $$0, float $$1) {
      if (!this.b($$0)) {
         this.x(this.eA() - $$1);
      }
   }

   @Override
   public void s() {
      this.cx.b(new ahh(this.ca.l));
      this.d();
   }

   public void d() {
      super.s();
      this.cz.a(null);
   }

   public void J(float $$0) {
      if (this.dd) {
         float $$1 = this.eA() - $$0;
         if ($$1 <= 0.0F) {
            this.x($$0);
            if ($$1 < 0.0F) {
               this.ak = 10;
            }
         } else {
            this.bj = $$1;
            this.ak = 20;
            this.x($$0);
            this.aL = 10;
            this.aK = this.aL;
         }
      } else {
         this.x($$0);
         this.dd = true;
      }
   }

   @Override
   public void A() {
      this.cx.b(new ahu(this.gd()));
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
   public boolean bu() {
      return !this.gd().b && super.bu();
   }

   protected void e() {
      this.cx.b(new ahw(this, ahw.a.f, azc.d(this.q() * 100.0F)));
   }

   public void h() {
      this.cx.b(new ahw(this, ahw.a.h));
   }

   public awo i() {
      return this.cO;
   }

   public fhm j() {
      return this.cP;
   }

   public void a(czv<?> $$0) {
      if (this.cP.d($$0)) {
         this.cP.e($$0);
         this.cx.b(new ahz($$0));
      }
   }

   @Override
   protected int H() {
      return this.cR;
   }

   public void a(int $$0) {
      this.cR = $$0;
   }

   @Override
   public void a(xd $$0, boolean $$1) {
      this.cz.aZ().a($$0, $$1);
   }

   private void c(double $$0, double $$1) {
      je $$2 = je.a($$0, this.dz(), $$1);
      if (this.c($$2)) {
         double $$3 = $$0 - (double)$$2.u();
         double $$4 = $$1 - (double)$$2.w();
         jj $$5 = null;
         double $$6 = Double.MAX_VALUE;
         jj[] $$7 = new jj[]{jj.e, jj.f, jj.c, jj.d};

         for (jj $$8 : $$7) {
            double $$9 = $$8.o().a($$3, 0.0, $$4);
            double $$10 = $$8.f() == jj.b.a ? 1.0 - $$9 : $$9;
            if ($$10 < $$6 && !this.c($$2.a($$8))) {
               $$6 = $$10;
               $$5 = $$8;
            }
         }

         if ($$5 != null) {
            eye $$11 = this.dv();
            if ($$5.o() == jj.a.a) {
               this.n(0.1 * (double)$$5.j(), $$11.e, $$11.f);
            } else {
               this.n($$11.d, $$11.e, 0.1 * (double)$$5.l());
            }
         }
      }
   }

   private boolean c(je $$0) {
      exz $$1 = this.cO();
      exz $$2 = new exz((double)$$0.u(), $$1.b, (double)$$0.w(), (double)$$0.u() + 1.0, $$1.e, (double)$$0.w() + 1.0).h(1.0E-7);
      return this.dS().g(this, $$2);
   }

   public void a(float $$0, int $$1, int $$2) {
      this.cp = $$0;
      this.co = $$1;
      this.cn = $$2;
   }

   @Override
   public void a(xd $$0) {
      this.cz.m.d().a($$0);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 >= 24 && $$0 <= 28) {
         this.a($$0 - 24);
      } else {
         super.b($$0);
      }
   }

   public void x(boolean $$0) {
      this.dn = $$0;
   }

   public boolean m() {
      return this.dn;
   }

   public void y(boolean $$0) {
      this.do = $$0;
   }

   public boolean o() {
      return this.do;
   }

   @Override
   public void a(awc $$0, float $$1, float $$2) {
      this.dS().a(this.dx(), this.dz(), this.dD(), $$0, this.di(), $$1, $$2, false);
   }

   @Override
   public void a(awc $$0, awe $$1, float $$2, float $$3) {
      this.dS().a(this.dx(), this.dz(), this.dD(), $$0, $$1, $$2, $$3, false);
   }

   @Override
   public boolean df() {
      return true;
   }

   @Override
   public void c(brj $$0) {
      cvl $$1 = this.b($$0);
      if (!$$1.f() && !this.fv()) {
         super.c($$0);
         this.dg = true;
         this.dh = $$0;
      }
   }

   @Override
   public boolean fv() {
      return this.dg;
   }

   @Override
   public void fB() {
      super.fB();
      this.dg = false;
   }

   @Override
   public brj fw() {
      return Objects.requireNonNullElse(this.dh, brj.a);
   }

   @Override
   public void a(akg<?> $$0) {
      super.a($$0);
      if (aA.equals($$0)) {
         boolean $$1 = (this.am.a(aA) & 1) > 0;
         brj $$2 = (this.am.a(aA) & 2) > 0 ? brj.b : brj.a;
         if ($$1 && !this.dg) {
            this.c($$2);
         } else if (!$$1 && this.dg) {
            this.fB();
         }
      }

      if (an.equals($$0) && this.fE() && !this.dl) {
         this.cz.aj().a((hae)(new gzu(this)));
      }
   }

   @Nullable
   public bup p() {
      if (this.dh() instanceof bup $$0 && $$0.a()) {
         return $$0;
      }

      return null;
   }

   public float q() {
      return this.df;
   }

   @Override
   public boolean ab() {
      return this.cz.aT();
   }

   @Override
   public void a(dsq $$0, boolean $$1) {
      if ($$0 instanceof dsd $$2) {
         this.cz.a(new frf($$2, $$1, this.cz.aT()));
      } else {
         this.cz.a(new frs($$0, $$1, this.cz.aT()));
      }
   }

   @Override
   public void a(dcs $$0) {
      this.cz.a(new frp($$0));
   }

   @Override
   public void a(dro $$0) {
      this.cz.a(new fqs($$0));
   }

   @Override
   public void a(dsv $$0) {
      this.cz.a(new frw($$0));
   }

   @Override
   public void a(dsg $$0) {
      this.cz.a(new frk($$0));
   }

   @Override
   public void a(cvl $$0, brj $$1) {
      if ($$0.a(cvo.ua)) {
         this.cz.a(new fqo(this, $$0, $$1));
      }
   }

   @Override
   public void b(btj $$0) {
      this.cz.g.a($$0, ln.f);
   }

   @Override
   public void c(btj $$0) {
      this.cz.g.a($$0, ln.r);
   }

   @Override
   public boolean ca() {
      return this.cy != null && this.cy.h;
   }

   @Override
   public boolean cf() {
      return this.cZ;
   }

   public boolean w() {
      return this.cf() || this.cj();
   }

   @Override
   public void fq() {
      super.fq();
      if (this.x()) {
         this.bl = this.cy.a;
         this.bn = this.cy.b;
         this.bk = this.cy.g;
         this.cE = this.cC;
         this.cF = this.cD;
         this.cD = this.cD + (this.dK() - this.cD) * 0.5F;
         this.cC = this.cC + (this.dI() - this.cC) * 0.5F;
      }
   }

   protected boolean x() {
      return this.cz.an() == this;
   }

   public void y() {
      this.b(bur.a);
      if (this.dS() != null) {
         for (double $$0 = this.dz(); $$0 > (double)this.dS().G_() && $$0 < (double)this.dS().an(); $$0++) {
            this.a_(this.dx(), $$0, this.dD());
            if (this.dS().g(this)) {
               break;
            }
         }

         this.h(eye.c);
         this.w(0.0F);
      }

      this.x(this.eQ());
      this.aM = 0;
   }

   @Override
   public void m_() {
      if (this.cB > 0) {
         this.cB--;
      }

      if (!(this.cz.z instanceof fpr)) {
         this.z(this.B() == dmo.a.a);
         this.N();
      }

      boolean $$0 = this.cy.g;
      boolean $$1 = this.cy.h;
      boolean $$2 = this.O();
      cnm $$3 = this.gd();
      this.cZ = !$$3.b && !this.ch() && !this.bW() && this.h(bur.f) && (this.ca() || !this.fL() && !this.h(bur.a));
      float $$4 = (float)this.h(bvm.z);
      this.cy.a(this.w(), $$4);
      this.cz.aA().a(this.cy);
      if (this.fv() && !this.bW()) {
         this.cy.a *= 0.2F;
         this.cy.b *= 0.2F;
         this.cB = 0;
      }

      boolean $$5 = false;
      if (this.dk > 0) {
         this.dk--;
         $$5 = true;
         this.cy.g = true;
      }

      if (!this.ae) {
         this.c(this.dx() - (double)this.dn() * 0.35, this.dD() + (double)this.dn() * 0.35);
         this.c(this.dx() - (double)this.dn() * 0.35, this.dD() - (double)this.dn() * 0.35);
         this.c(this.dx() + (double)this.dn() * 0.35, this.dD() - (double)this.dn() * 0.35);
         this.c(this.dx() + (double)this.dn() * 0.35, this.dD() + (double)this.dn() * 0.35);
      }

      if ($$1) {
         this.cB = 0;
      }

      boolean $$6 = this.M();
      boolean $$7 = this.bW() ? this.dg().aH() : this.aH();
      boolean $$8 = !$$1 && !$$2;
      if (($$7 || this.bn()) && $$8 && $$6) {
         if (this.cB <= 0 && !this.cz.n.B.e()) {
            this.cB = 7;
         } else {
            this.h(true);
         }
      }

      if ((!this.bi() || this.bn()) && $$6 && this.cz.n.B.e()) {
         this.h(true);
      }

      if (this.cg()) {
         boolean $$9 = !this.cy.b() || !this.P();
         boolean $$10 = $$9 || this.Q && !this.T || this.bi() && !this.bn();
         if (this.ch()) {
            if (!this.aH() && !this.cy.h && $$9 || !this.bi()) {
               this.h(false);
            }
         } else if ($$10) {
            this.h(false);
         }
      }

      boolean $$11 = false;
      if ($$3.c) {
         if (this.cz.r.h()) {
            if (!$$3.b) {
               $$3.b = true;
               $$11 = true;
               this.A();
            }
         } else if (!$$0 && this.cy.g && !$$5) {
            if (this.cc == 0) {
               this.cc = 7;
            } else if (!this.ch()) {
               $$3.b = !$$3.b;
               if ($$3.b && this.aH()) {
                  this.v();
               }

               $$11 = true;
               this.A();
               this.cc = 0;
            }
         }
      }

      if (this.cy.g && !$$11 && !$$0 && !$$3.b && !this.bW() && !this.p_()) {
         cvl $$12 = this.a(btr.e);
         if ($$12.a(cvo.nU) && cui.h($$12) && this.gh()) {
            this.cx.b(new ahw(this, ahw.a.i));
         }
      }

      this.dl = this.fE();
      if (this.bi() && this.cy.h && this.eg()) {
         this.fi();
      }

      if (this.a(awy.a)) {
         int $$13 = this.P_() ? 10 : 1;
         this.dm = azc.a(this.dm + $$13, 0, 600);
      } else if (this.dm > 0) {
         this.a(awy.a);
         this.dm = azc.a(this.dm - 10, 0, 600);
      }

      if ($$3.b && this.x()) {
         int $$14 = 0;
         if (this.cy.h) {
            $$14--;
         }

         if (this.cy.g) {
            $$14++;
         }

         if ($$14 != 0) {
            this.h(this.dv().b(0.0, (double)((float)$$14 * $$3.a() * 3.0F), 0.0));
         }
      }

      bup $$15 = this.p();
      if ($$15 != null && $$15.c() == 0) {
         if (this.de < 0) {
            this.de++;
            if (this.de == 0) {
               this.df = 0.0F;
            }
         }

         if ($$0 && !this.cy.g) {
            this.de = -10;
            $$15.b(azc.d(this.q() * 100.0F));
            this.e();
         } else if (!$$0 && this.cy.g) {
            this.de = 0;
            this.df = 0.0F;
         } else if ($$0) {
            this.de++;
            if (this.de < 10) {
               this.df = (float)this.de * 0.1F;
            } else {
               this.df = 0.8F + 2.0F / (float)(this.de - 9) * 0.1F;
            }
         }
      } else {
         this.df = 0.0F;
      }

      super.m_();
      if (this.aH() && $$3.b && !this.cz.r.h()) {
         $$3.b = false;
         this.A();
      }
   }

   public dmo.a B() {
      return this.at == null ? dmo.a.b : this.at.a();
   }

   @Override
   protected void eh() {
      this.aM++;
      if (this.aM == 20) {
         this.a(btj.c.a);
      }
   }

   private void z(boolean $$0) {
      this.cH = this.cG;
      float $$1 = 0.0F;
      if ($$0 && this.at != null && this.at.e()) {
         if (this.cz.z != null && !this.cz.z.k() && !(this.cz.z instanceof fox) && !(this.cz.z instanceof fpw)) {
            if (this.cz.z instanceof fqi) {
               this.s();
            }

            this.cz.a(null);
         }

         if (this.cG == 0.0F) {
            this.cz.aj().a(gzz.b(awd.uK, this.af.i() * 0.4F + 0.8F, 0.25F));
         }

         $$1 = 0.0125F;
         this.at.a(false);
      } else if (this.b(bss.i) && !this.c(bss.i).a(60)) {
         $$1 = 0.006666667F;
      } else if (this.cG > 0.0F) {
         $$1 = -0.05F;
      }

      this.cG = azc.a(this.cG + $$1, 0.0F, 1.0F);
   }

   @Override
   public void u() {
      super.u();
      this.di = false;
      if (this.dh() instanceof cpo $$0) {
         $$0.a(this.cy.e, this.cy.f, this.cy.c, this.cy.d);
         this.di = this.di | (this.cy.e || this.cy.f || this.cy.c || this.cy.d);
      }
   }

   public boolean C() {
      return this.di;
   }

   @Nullable
   @Override
   public bsq d(jn<bso> $$0) {
      if ($$0.a(bss.i)) {
         this.cH = 0.0F;
         this.cG = 0.0F;
      }

      return super.d($$0);
   }

   @Override
   public void a(buj $$0, eye $$1) {
      double $$2 = this.dx();
      double $$3 = this.dD();
      super.a($$0, $$1);
      float $$4 = (float)(this.dx() - $$2);
      float $$5 = (float)(this.dD() - $$3);
      this.g($$4, $$5);
      this.h = this.h + azc.f($$4, $$5) * 0.6F;
   }

   public boolean D() {
      return this.dj;
   }

   @Override
   public boolean gH() {
      return this.cz.n.J().c();
   }

   protected void g(float $$0, float $$1) {
      if (this.J()) {
         eye $$2 = this.dq();
         eye $$3 = $$2.b((double)$$0, 0.0, (double)$$1);
         eye $$4 = new eye((double)$$0, 0.0, (double)$$1);
         float $$5 = this.fm();
         float $$6 = (float)$$4.h();
         if ($$6 <= 0.001F) {
            eyd $$7 = this.cy.a();
            float $$8 = $$5 * $$7.i;
            float $$9 = $$5 * $$7.j;
            float $$10 = azc.a(this.dI() * (float) (Math.PI / 180.0));
            float $$11 = azc.b(this.dI() * (float) (Math.PI / 180.0));
            $$4 = new eye((double)($$8 * $$11 - $$9 * $$10), $$4.e, (double)($$9 * $$11 + $$8 * $$10));
            $$6 = (float)$$4.h();
            if ($$6 <= 0.001F) {
               return;
            }
         }

         float $$12 = azc.i($$6);
         eye $$13 = $$4.c((double)$$12);
         eye $$14 = this.bS();
         float $$15 = (float)($$14.d * $$13.d + $$14.f * $$13.f);
         if (!($$15 < -0.15F)) {
            eyj $$16 = eyj.a(this);
            je $$17 = je.a(this.dx(), this.cO().e, this.dD());
            dua $$18 = this.dS().a_($$17);
            if ($$18.b(this.dS(), $$17, $$16).c()) {
               $$17 = $$17.d();
               dua $$19 = this.dS().a_($$17);
               if ($$19.b(this.dS(), $$17, $$16).c()) {
                  float $$20 = 7.0F;
                  float $$21 = 1.2F;
                  if (this.b(bss.h)) {
                     $$21 += (float)(this.c(bss.h).e() + 1) * 0.75F;
                  }

                  float $$22 = Math.max($$5 * 7.0F, 1.0F / $$12);
                  eye $$24 = $$3.e($$13.c((double)$$22));
                  float $$25 = this.dn();
                  float $$26 = this.do();
                  exz $$27 = new exz($$2, $$24.b(0.0, (double)$$26, 0.0)).c((double)$$25, 0.0, (double)$$25);
                  eye $$23 = $$2.b(0.0, 0.51F, 0.0);
                  $$24 = $$24.b(0.0, 0.51F, 0.0);
                  eye $$28 = $$13.c(new eye(0.0, 1.0, 0.0));
                  eye $$29 = $$28.c((double)($$25 * 0.5F));
                  eye $$30 = $$23.d($$29);
                  eye $$31 = $$24.d($$29);
                  eye $$32 = $$23.e($$29);
                  eye $$33 = $$24.e($$29);
                  Iterable<eyx> $$34 = this.dS().d(this, $$27);
                  Iterator<exz> $$35 = StreamSupport.stream($$34.spliterator(), false).flatMap($$0x -> $$0x.e().stream()).iterator();
                  float $$36 = Float.MIN_VALUE;

                  while ($$35.hasNext()) {
                     exz $$37 = $$35.next();
                     if ($$37.a($$30, $$31) || $$37.a($$32, $$33)) {
                        $$36 = (float)$$37.e;
                        eye $$38 = $$37.f();
                        je $$39 = je.a((jx)$$38);

                        for (int $$40 = 1; (float)$$40 < $$21; $$40++) {
                           je $$41 = $$39.b($$40);
                           dua $$42 = this.dS().a_($$41);
                           eyx $$43;
                           if (!($$43 = $$42.b(this.dS(), $$41, $$16)).c()) {
                              $$36 = (float)$$43.c(jj.a.b) + (float)$$41.v();
                              if ((double)$$36 - this.dz() > (double)$$21) {
                                 return;
                              }
                           }

                           if ($$40 > 1) {
                              $$17 = $$17.d();
                              dua $$44 = this.dS().a_($$17);
                              if (!$$44.b(this.dS(), $$17, $$16).c()) {
                                 return;
                              }
                           }
                        }
                        break;
                     }
                  }

                  if ($$36 != Float.MIN_VALUE) {
                     float $$45 = (float)((double)$$36 - this.dz());
                     if (!($$45 <= 0.5F) && !($$45 > $$21)) {
                        this.dk = 1;
                     }
                  }
               }
            }
         }
      }
   }

   @Override
   protected boolean c(eye $$0) {
      float $$1 = this.dI() * (float) (Math.PI / 180.0);
      double $$2 = (double)azc.a($$1);
      double $$3 = (double)azc.b($$1);
      double $$4 = (double)this.bl * $$3 - (double)this.bn * $$2;
      double $$5 = (double)this.bn * $$3 + (double)this.bl * $$2;
      double $$6 = azc.k($$4) + azc.k($$5);
      double $$7 = azc.k($$0.d) + azc.k($$0.f);
      if (!($$6 < 1.0E-5F) && !($$7 < 1.0E-5F)) {
         double $$8 = $$4 * $$0.d + $$5 * $$0.f;
         double $$9 = Math.acos($$8 / Math.sqrt($$6 * $$7));
         return $$9 < 0.13962634F;
      } else {
         return false;
      }
   }

   private boolean J() {
      return this.D() && this.dk <= 0 && this.aH() && !this.fT() && !this.bW() && this.K() && (double)this.aQ() >= 1.0;
   }

   private boolean K() {
      eyd $$0 = this.cy.a();
      return $$0.i != 0.0F || $$0.j != 0.0F;
   }

   private boolean M() {
      return !this.cg() && this.O() && this.P() && !this.fv() && !this.b(bss.o) && (!this.bW() || this.d(this.dg())) && !this.fE();
   }

   private boolean d(btj $$0) {
      return $$0.dL() && $$0.de();
   }

   private boolean O() {
      double $$0 = 0.8;
      return this.bn() ? this.cy.b() : (double)this.cy.b >= 0.8;
   }

   private boolean P() {
      return this.bW() || (float)this.gm().a() > 6.0F || this.gd().c;
   }

   public float E() {
      if (!this.a(awy.a)) {
         return 0.0F;
      } else {
         float $$0 = 600.0F;
         float $$1 = 100.0F;
         if ((float)this.dm >= 600.0F) {
            return 1.0F;
         } else {
            float $$2 = azc.a((float)this.dm / 100.0F, 0.0F, 1.0F);
            float $$3 = (float)this.dm < 100.0F ? 0.0F : azc.a(((float)this.dm - 100.0F) / 500.0F, 0.0F, 1.0F);
            return $$2 * 0.6F + $$3 * 0.39999998F;
         }
      }
   }

   public void a(ddp $$0) {
      if ($$0 == ddp.d) {
         this.h(this.dv().a(jj.a.b, 0.0));
      }
   }

   @Override
   public boolean bn() {
      return this.cm;
   }

   @Override
   protected boolean fU() {
      boolean $$0 = this.cm;
      boolean $$1 = super.fU();
      if (this.P_()) {
         return this.cm;
      } else {
         if (!$$0 && $$1) {
            this.dS().a(this.dx(), this.dz(), this.dD(), awd.x, awe.i, 1.0F, 1.0F, false);
            this.cz.aj().a((hae)(new hah.b(this)));
         }

         if ($$0 && !$$1) {
            this.dS().a(this.dx(), this.dz(), this.dD(), awd.y, awe.i, 1.0F, 1.0F, false);
         }

         return this.cm;
      }
   }

   @Override
   public eye u(float $$0) {
      if (this.cz.n.aD().a()) {
         float $$1 = azc.h($$0 * 0.5F, this.dI(), this.O) * (float) (Math.PI / 180.0);
         float $$2 = azc.h($$0 * 0.5F, this.dK(), this.P) * (float) (Math.PI / 180.0);
         double $$3 = this.fu() == btz.b ? -1.0 : 1.0;
         eye $$4 = new eye(0.39 * $$3, -0.6, 0.3);
         return $$4.a(-$$2).b(-$$1).e(this.m($$0));
      } else {
         return super.u($$0);
      }
   }

   @Override
   public void a(cvl $$0, cvl $$1, cra $$2) {
      this.cz.aA().a($$0, $$1, $$2);
   }

   @Override
   public float dJ() {
      return this.dI();
   }

   @Override
   public void j(cvl $$0) {
      this.cz.r.a($$0);
   }
}
