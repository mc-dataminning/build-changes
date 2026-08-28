import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ggc extends gfz {
   public static final Logger cv = LogUtils.getLogger();
   private static final int cH = 20;
   private static final int cI = 600;
   private static final int cJ = 100;
   private static final float cK = 0.6F;
   private static final double cL = 0.35;
   private static final double cM = 0.13962634F;
   public final gbi cw;
   private final awp cN;
   private final fhw cO;
   private final List<haf> cP = Lists.newArrayList();
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
   private boolean da;
   private int db;
   private boolean dc;
   public gga cx;
   protected final fil cy;
   protected int cA;
   public float cB;
   public float cC;
   public float cD;
   public float cE;
   private int dd;
   private float de;
   public float cF;
   public float cG;
   private boolean df;
   @Nullable
   private bro dg;
   private boolean dh;
   private boolean di = true;
   private int dj;
   private boolean dk;
   private int dl;
   private boolean dm = true;
   private boolean dn = false;

   public ggc(fil $$0, gbh $$1, gbi $$2, awp $$3, fhw $$4, boolean $$5, boolean $$6) {
      super($$1, $$2.o());
      this.cy = $$0;
      this.cw = $$2;
      this.cN = $$3;
      this.cO = $$4;
      this.cZ = $$5;
      this.da = $$6;
      this.cP.add(new hax(this, $$0.ak()));
      this.cP.add(new hak(this));
      this.cP.add(new haj(this, $$0.ak(), $$1.D_()));
   }

   @Override
   public boolean a(bsg $$0, float $$1) {
      return false;
   }

   @Override
   public void c(float $$0) {
   }

   @Override
   public boolean a(bto $$0, boolean $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         if ($$0 instanceof cps) {
            this.cy.ak().a((hav)(new hap(this, (cps)$$0, true)));
            this.cy.ak().a((hav)(new hap(this, (cps)$$0, false)));
         }

         return true;
      }
   }

   @Override
   public void bN() {
      super.bN();
      this.dh = false;
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
            this.cw.b(new ahp.c(this.dI(), this.dK(), this.aH(), this.Q));
            this.cw.b(new ahx(this.bk, this.bm, this.cx.g, this.cx.h));
            bto $$0 = this.dd();
            if ($$0 != this && $$0.de()) {
               this.cw.b(new ahq($$0));
               this.I();
            }
         } else {
            this.F();
         }

         for (haf $$1 : this.cP) {
            $$1.a();
         }
      }
   }

   public float c() {
      for (haf $$0 : this.cP) {
         if ($$0 instanceof haj) {
            return ((haj)$$0).b();
         }
      }

      return 0.0F;
   }

   private void F() {
      this.I();
      if (this.x()) {
         double $$0 = this.dx() - this.cR;
         double $$1 = this.dz() - this.cS;
         double $$2 = this.dD() - this.cT;
         double $$3 = (double)(this.dI() - this.cU);
         double $$4 = (double)(this.dK() - this.cV);
         this.db++;
         boolean $$5 = azd.f($$0, $$1, $$2) > azd.k(2.0E-4) || this.db >= 20;
         boolean $$6 = $$3 != 0.0 || $$4 != 0.0;
         if ($$5 && $$6) {
            this.cw.b(new ahp.b(this.dx(), this.dz(), this.dD(), this.dI(), this.dK(), this.aH(), this.Q));
         } else if ($$5) {
            this.cw.b(new ahp.a(this.dx(), this.dz(), this.dD(), this.aH(), this.Q));
         } else if ($$6) {
            this.cw.b(new ahp.c(this.dI(), this.dK(), this.aH(), this.Q));
         } else if (this.cW != this.aH() || this.cX != this.Q) {
            this.cw.b(new ahp.d(this.aH(), this.Q));
         }

         if ($$5) {
            this.cR = this.dx();
            this.cS = this.dz();
            this.cT = this.dD();
            this.db = 0;
         }

         if ($$6) {
            this.cU = this.dI();
            this.cV = this.dK();
         }

         this.cW = this.aH();
         this.cX = this.Q;
         this.di = this.cy.n.I().c();
      }
   }

   private void G() {
      boolean $$0 = this.ca();
      if ($$0 != this.cZ) {
         ahw.a $$1 = $$0 ? ahw.a.a : ahw.a.b;
         this.cw.b(new ahw(this, $$1));
         this.cZ = $$0;
      }
   }

   private void I() {
      boolean $$0 = this.cg();
      if ($$0 != this.da) {
         ahw.a $$1 = $$0 ? ahw.a.d : ahw.a.e;
         this.cw.b(new ahw(this, $$1));
         this.da = $$0;
      }
   }

   public boolean a(boolean $$0) {
      ahv.a $$1 = $$0 ? ahv.a.d : ahv.a.e;
      cvp $$2 = this.gc().a($$0);
      this.cw.b(new ahv($$1, je.c, jj.a));
      return !$$2.f();
   }

   @Override
   public void a(bro $$0) {
      super.a($$0);
      this.cw.b(new aim($$0));
   }

   @Override
   public void ga() {
      this.cw.b(new ahb(ahb.a.a));
      fij.c();
   }

   @Override
   protected void f(bsg $$0, float $$1) {
      if (!this.b($$0)) {
         this.x(this.eA() - $$1);
      }
   }

   @Override
   public void s() {
      this.cw.b(new ahh(this.bZ.l));
      this.d();
   }

   public void d() {
      super.s();
      this.cy.a(null);
   }

   public void J(float $$0) {
      if (this.dc) {
         float $$1 = this.eA() - $$0;
         if ($$1 <= 0.0F) {
            this.x($$0);
            if ($$1 < 0.0F) {
               this.ak = 10;
            }
         } else {
            this.bi = $$1;
            this.ak = 20;
            this.x($$0);
            this.aK = 10;
            this.aJ = this.aK;
         }
      } else {
         this.x($$0);
         this.dc = true;
      }
   }

   @Override
   public void A() {
      this.cw.b(new ahu(this.gd()));
   }

   @Override
   public boolean g() {
      return true;
   }

   @Override
   public boolean fE() {
      return !this.gd().b && super.fE();
   }

   @Override
   public boolean bu() {
      return !this.gd().b && super.bu();
   }

   protected void e() {
      this.cw.b(new ahw(this, ahw.a.f, azd.d(this.q() * 100.0F)));
   }

   public void h() {
      this.cw.b(new ahw(this, ahw.a.h));
   }

   public awp i() {
      return this.cN;
   }

   public fhw j() {
      return this.cO;
   }

   public void a(daj<?> $$0) {
      if (this.cO.d($$0)) {
         this.cO.e($$0);
         this.cw.b(new ahz($$0));
      }
   }

   @Override
   protected int H() {
      return this.cQ;
   }

   public void a(int $$0) {
      this.cQ = $$0;
   }

   @Override
   public void a(xd $$0, boolean $$1) {
      this.cy.ba().a($$0, $$1);
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
            eys $$11 = this.dv();
            if ($$5.o() == jj.a.a) {
               this.n(0.1 * (double)$$5.j(), $$11.e, $$11.f);
            } else {
               this.n($$11.d, $$11.e, 0.1 * (double)$$5.l());
            }
         }
      }
   }

   private boolean c(je $$0) {
      eyn $$1 = this.cO();
      eyn $$2 = new eyn((double)$$0.u(), $$1.b, (double)$$0.w(), (double)$$0.u() + 1.0, $$1.e, (double)$$0.w() + 1.0).h(1.0E-7);
      return this.dS().g(this, $$2);
   }

   public void a(float $$0, int $$1, int $$2) {
      this.co = $$0;
      this.cn = $$1;
      this.cm = $$2;
   }

   @Override
   public void a(xd $$0) {
      this.cy.m.d().a($$0);
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
      this.dm = $$0;
   }

   public boolean m() {
      return this.dm;
   }

   public void x(boolean $$0) {
      this.dn = $$0;
   }

   public boolean o() {
      return this.dn;
   }

   @Override
   public void a(awd $$0, float $$1, float $$2) {
      this.dS().a(this.dx(), this.dz(), this.dD(), $$0, this.di(), $$1, $$2, false);
   }

   @Override
   public void a(awd $$0, awf $$1, float $$2, float $$3) {
      this.dS().a(this.dx(), this.dz(), this.dD(), $$0, $$1, $$2, $$3, false);
   }

   @Override
   public boolean df() {
      return true;
   }

   @Override
   public void c(bro $$0) {
      cvp $$1 = this.b($$0);
      if (!$$1.f() && !this.fv()) {
         super.c($$0);
         this.df = true;
         this.dg = $$0;
      }
   }

   @Override
   public boolean fv() {
      return this.df;
   }

   @Override
   public void fB() {
      super.fB();
      this.df = false;
   }

   @Override
   public bro fw() {
      return Objects.requireNonNullElse(this.dg, bro.a);
   }

   @Override
   public void a(akg<?> $$0) {
      super.a($$0);
      if (az.equals($$0)) {
         boolean $$1 = (this.am.a(az) & 1) > 0;
         bro $$2 = (this.am.a(az) & 2) > 0 ? bro.b : bro.a;
         if ($$1 && !this.df) {
            this.c($$2);
         } else if (!$$1 && this.df) {
            this.fB();
         }
      }

      if (an.equals($$0) && this.fF() && !this.dk) {
         this.cy.ak().a((hav)(new hal(this)));
      }
   }

   @Nullable
   public buu p() {
      if (this.dh() instanceof buu $$0 && $$0.a()) {
         return $$0;
      }

      return null;
   }

   public float q() {
      return this.de;
   }

   @Override
   public boolean ab() {
      return this.cy.aU();
   }

   @Override
   public void a(dte $$0, boolean $$1) {
      if ($$0 instanceof dsr $$2) {
         this.cy.a(new frp($$2, $$1, this.cy.aU()));
      } else {
         this.cy.a(new fsc($$0, $$1, this.cy.aU()));
      }
   }

   @Override
   public void a(ddg $$0) {
      this.cy.a(new frz($$0));
   }

   @Override
   public void a(dsc $$0) {
      this.cy.a(new frc($$0));
   }

   @Override
   public void a(dtj $$0) {
      this.cy.a(new fsg($$0));
   }

   @Override
   public void a(dsu $$0) {
      this.cy.a(new fru($$0));
   }

   @Override
   public void a(cvp $$0, bro $$1) {
      if ($$0.a(cvt.ua)) {
         this.cy.a(new fqy(this, $$0, $$1));
      }
   }

   @Override
   public void b(bto $$0) {
      this.cy.g.a($$0, ln.f);
   }

   @Override
   public void c(bto $$0) {
      this.cy.g.a($$0, ln.r);
   }

   @Override
   public boolean ca() {
      return this.cx != null && this.cx.h;
   }

   @Override
   public boolean cf() {
      return this.cY;
   }

   public boolean w() {
      return this.cf() || this.cj();
   }

   @Override
   public void fq() {
      super.fq();
      if (this.x()) {
         this.bk = this.cx.a;
         this.bm = this.cx.b;
         this.bj = this.cx.g;
         this.cD = this.cB;
         this.cE = this.cC;
         this.cC = this.cC + (this.dK() - this.cC) * 0.5F;
         this.cB = this.cB + (this.dI() - this.cB) * 0.5F;
      }
   }

   protected boolean x() {
      return this.cy.ao() == this;
   }

   public void y() {
      this.b(buw.a);
      if (this.dS() != null) {
         for (double $$0 = this.dz(); $$0 > (double)this.dS().G_() && $$0 <= (double)this.dS().an(); $$0++) {
            this.a_(this.dx(), $$0, this.dD());
            if (this.dS().g(this)) {
               break;
            }
         }

         this.h(eys.c);
         this.w(0.0F);
      }

      this.x(this.eQ());
      this.aL = 0;
   }

   @Override
   public void m_() {
      if (this.cA > 0) {
         this.cA--;
      }

      if (!(this.cy.z instanceof fqb)) {
         this.y(this.B() == dnc.a.a);
         this.N();
      }

      boolean $$0 = this.cx.g;
      boolean $$1 = this.cx.h;
      boolean $$2 = this.O();
      cnr $$3 = this.gd();
      this.cY = !$$3.b && !this.ch() && !this.bW() && this.h(buw.f) && (this.ca() || !this.fM() && !this.h(buw.a));
      float $$4 = (float)this.h(bvr.z);
      this.cx.a(this.w(), $$4);
      this.cy.aB().a(this.cx);
      if (this.fv() && !this.bW()) {
         this.cx.a *= 0.2F;
         this.cx.b *= 0.2F;
         this.cA = 0;
      }

      boolean $$5 = false;
      if (this.dj > 0) {
         this.dj--;
         $$5 = true;
         this.cx.g = true;
      }

      if (!this.ae) {
         this.c(this.dx() - (double)this.dn() * 0.35, this.dD() + (double)this.dn() * 0.35);
         this.c(this.dx() - (double)this.dn() * 0.35, this.dD() - (double)this.dn() * 0.35);
         this.c(this.dx() + (double)this.dn() * 0.35, this.dD() - (double)this.dn() * 0.35);
         this.c(this.dx() + (double)this.dn() * 0.35, this.dD() + (double)this.dn() * 0.35);
      }

      if ($$1) {
         this.cA = 0;
      }

      boolean $$6 = this.M();
      boolean $$7 = this.bW() ? this.dg().aH() : this.aH();
      boolean $$8 = !$$1 && !$$2;
      if (($$7 || this.bn()) && $$8 && $$6) {
         if (this.cA <= 0 && !this.cy.n.B.e()) {
            this.cA = 7;
         } else {
            this.h(true);
         }
      }

      if ((!this.bi() || this.bn()) && $$6 && this.cy.n.B.e()) {
         this.h(true);
      }

      if (this.cg()) {
         boolean $$9 = !this.cx.b() || !this.P();
         boolean $$10 = $$9 || this.Q && !this.T || this.bi() && !this.bn();
         if (this.ch()) {
            if (!this.aH() && !this.cx.h && $$9 || !this.bi()) {
               this.h(false);
            }
         } else if ($$10) {
            this.h(false);
         }
      }

      boolean $$11 = false;
      if ($$3.c) {
         if (this.cy.r.h()) {
            if (!$$3.b) {
               $$3.b = true;
               $$11 = true;
               this.A();
            }
         } else if (!$$0 && this.cx.g && !$$5) {
            if (this.cb == 0) {
               this.cb = 7;
            } else if (!this.ch()) {
               $$3.b = !$$3.b;
               if ($$3.b && this.aH()) {
                  this.v();
               }

               $$11 = true;
               this.A();
               this.cb = 0;
            }
         }
      }

      if (this.cx.g && !$$11 && !$$0 && !$$3.b && !this.bW() && !this.p_()) {
         cvp $$12 = this.a(btw.e);
         if ($$12.a(cvt.nU) && cun.g($$12) && this.gh()) {
            this.cw.b(new ahw(this, ahw.a.i));
         }
      }

      this.dk = this.fF();
      if (this.bi() && this.cx.h && this.eg()) {
         this.fi();
      }

      if (this.a(awz.a)) {
         int $$13 = this.P_() ? 10 : 1;
         this.dl = azd.a(this.dl + $$13, 0, 600);
      } else if (this.dl > 0) {
         this.a(awz.a);
         this.dl = azd.a(this.dl - 10, 0, 600);
      }

      if ($$3.b && this.x()) {
         int $$14 = 0;
         if (this.cx.h) {
            $$14--;
         }

         if (this.cx.g) {
            $$14++;
         }

         if ($$14 != 0) {
            this.h(this.dv().b(0.0, (double)((float)$$14 * $$3.a() * 3.0F), 0.0));
         }
      }

      buu $$15 = this.p();
      if ($$15 != null && $$15.c() == 0) {
         if (this.dd < 0) {
            this.dd++;
            if (this.dd == 0) {
               this.de = 0.0F;
            }
         }

         if ($$0 && !this.cx.g) {
            this.dd = -10;
            $$15.b(azd.d(this.q() * 100.0F));
            this.e();
         } else if (!$$0 && this.cx.g) {
            this.dd = 0;
            this.de = 0.0F;
         } else if ($$0) {
            this.dd++;
            if (this.dd < 10) {
               this.de = (float)this.dd * 0.1F;
            } else {
               this.de = 0.8F + 2.0F / (float)(this.dd - 9) * 0.1F;
            }
         }
      } else {
         this.de = 0.0F;
      }

      super.m_();
      if (this.aH() && $$3.b && !this.cy.r.h()) {
         $$3.b = false;
         this.A();
      }
   }

   public dnc.a B() {
      return this.at == null ? dnc.a.b : this.at.a();
   }

   @Override
   protected void eh() {
      this.aL++;
      if (this.aL == 20) {
         this.a(bto.c.a);
      }
   }

   private void y(boolean $$0) {
      this.cG = this.cF;
      float $$1 = 0.0F;
      if ($$0 && this.at != null && this.at.e()) {
         if (this.cy.z != null && !this.cy.z.k() && !(this.cy.z instanceof fph) && !(this.cy.z instanceof fqg)) {
            if (this.cy.z instanceof fqs) {
               this.s();
            }

            this.cy.a(null);
         }

         if (this.cF == 0.0F) {
            this.cy.ak().a(haq.b(awe.uK, this.af.i() * 0.4F + 0.8F, 0.25F));
         }

         $$1 = 0.0125F;
         this.at.a(false);
      } else if (this.b(bsx.i) && !this.c(bsx.i).a(60)) {
         $$1 = 0.006666667F;
      } else if (this.cF > 0.0F) {
         $$1 = -0.05F;
      }

      this.cF = azd.a(this.cF + $$1, 0.0F, 1.0F);
   }

   @Override
   public void u() {
      super.u();
      this.dh = false;
      if (this.dh() instanceof cpu $$0) {
         $$0.a(this.cx.e, this.cx.f, this.cx.c, this.cx.d);
         this.dh = this.dh | (this.cx.e || this.cx.f || this.cx.c || this.cx.d);
      }
   }

   public boolean C() {
      return this.dh;
   }

   @Nullable
   @Override
   public bsv d(jn<bst> $$0) {
      if ($$0.a(bsx.i)) {
         this.cG = 0.0F;
         this.cF = 0.0F;
      }

      return super.d($$0);
   }

   @Override
   public void a(buo $$0, eys $$1) {
      double $$2 = this.dx();
      double $$3 = this.dD();
      super.a($$0, $$1);
      float $$4 = (float)(this.dx() - $$2);
      float $$5 = (float)(this.dD() - $$3);
      this.g($$4, $$5);
      this.h = this.h + azd.f($$4, $$5) * 0.6F;
   }

   public boolean D() {
      return this.di;
   }

   @Override
   public boolean gH() {
      return this.cy.n.J().c();
   }

   protected void g(float $$0, float $$1) {
      if (this.J()) {
         eys $$2 = this.dq();
         eys $$3 = $$2.b((double)$$0, 0.0, (double)$$1);
         eys $$4 = new eys((double)$$0, 0.0, (double)$$1);
         float $$5 = this.fm();
         float $$6 = (float)$$4.h();
         if ($$6 <= 0.001F) {
            eyr $$7 = this.cx.a();
            float $$8 = $$5 * $$7.i;
            float $$9 = $$5 * $$7.j;
            float $$10 = azd.a(this.dI() * (float) (Math.PI / 180.0));
            float $$11 = azd.b(this.dI() * (float) (Math.PI / 180.0));
            $$4 = new eys((double)($$8 * $$11 - $$9 * $$10), $$4.e, (double)($$9 * $$11 + $$8 * $$10));
            $$6 = (float)$$4.h();
            if ($$6 <= 0.001F) {
               return;
            }
         }

         float $$12 = azd.i($$6);
         eys $$13 = $$4.c((double)$$12);
         eys $$14 = this.bS();
         float $$15 = (float)($$14.d * $$13.d + $$14.f * $$13.f);
         if (!($$15 < -0.15F)) {
            eyx $$16 = eyx.a(this);
            je $$17 = je.a(this.dx(), this.cO().e, this.dD());
            duo $$18 = this.dS().a_($$17);
            if ($$18.b(this.dS(), $$17, $$16).c()) {
               $$17 = $$17.d();
               duo $$19 = this.dS().a_($$17);
               if ($$19.b(this.dS(), $$17, $$16).c()) {
                  float $$20 = 7.0F;
                  float $$21 = 1.2F;
                  if (this.b(bsx.h)) {
                     $$21 += (float)(this.c(bsx.h).e() + 1) * 0.75F;
                  }

                  float $$22 = Math.max($$5 * 7.0F, 1.0F / $$12);
                  eys $$24 = $$3.e($$13.c((double)$$22));
                  float $$25 = this.dn();
                  float $$26 = this.do();
                  eyn $$27 = new eyn($$2, $$24.b(0.0, (double)$$26, 0.0)).c((double)$$25, 0.0, (double)$$25);
                  eys $$23 = $$2.b(0.0, 0.51F, 0.0);
                  $$24 = $$24.b(0.0, 0.51F, 0.0);
                  eys $$28 = $$13.c(new eys(0.0, 1.0, 0.0));
                  eys $$29 = $$28.c((double)($$25 * 0.5F));
                  eys $$30 = $$23.d($$29);
                  eys $$31 = $$24.d($$29);
                  eys $$32 = $$23.e($$29);
                  eys $$33 = $$24.e($$29);
                  Iterable<ezm> $$34 = this.dS().d(this, $$27);
                  Iterator<eyn> $$35 = StreamSupport.stream($$34.spliterator(), false).flatMap($$0x -> $$0x.e().stream()).iterator();
                  float $$36 = Float.MIN_VALUE;

                  while ($$35.hasNext()) {
                     eyn $$37 = $$35.next();
                     if ($$37.a($$30, $$31) || $$37.a($$32, $$33)) {
                        $$36 = (float)$$37.e;
                        eys $$38 = $$37.f();
                        je $$39 = je.a((jx)$$38);

                        for (int $$40 = 1; (float)$$40 < $$21; $$40++) {
                           je $$41 = $$39.b($$40);
                           duo $$42 = this.dS().a_($$41);
                           ezm $$43;
                           if (!($$43 = $$42.b(this.dS(), $$41, $$16)).c()) {
                              $$36 = (float)$$43.c(jj.a.b) + (float)$$41.v();
                              if ((double)$$36 - this.dz() > (double)$$21) {
                                 return;
                              }
                           }

                           if ($$40 > 1) {
                              $$17 = $$17.d();
                              duo $$44 = this.dS().a_($$17);
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
                        this.dj = 1;
                     }
                  }
               }
            }
         }
      }
   }

   @Override
   protected boolean c(eys $$0) {
      float $$1 = this.dI() * (float) (Math.PI / 180.0);
      double $$2 = (double)azd.a($$1);
      double $$3 = (double)azd.b($$1);
      double $$4 = (double)this.bk * $$3 - (double)this.bm * $$2;
      double $$5 = (double)this.bm * $$3 + (double)this.bk * $$2;
      double $$6 = azd.k($$4) + azd.k($$5);
      double $$7 = azd.k($$0.d) + azd.k($$0.f);
      if (!($$6 < 1.0E-5F) && !($$7 < 1.0E-5F)) {
         double $$8 = $$4 * $$0.d + $$5 * $$0.f;
         double $$9 = Math.acos($$8 / Math.sqrt($$6 * $$7));
         return $$9 < 0.13962634F;
      } else {
         return false;
      }
   }

   private boolean J() {
      return this.D() && this.dj <= 0 && this.aH() && !this.fU() && !this.bW() && this.K() && (double)this.aQ() >= 1.0;
   }

   private boolean K() {
      eyr $$0 = this.cx.a();
      return $$0.i != 0.0F || $$0.j != 0.0F;
   }

   private boolean M() {
      return !this.cg() && this.O() && this.P() && !this.fv() && !this.b(bsx.o) && (!this.bW() || this.d(this.dg())) && !this.fF();
   }

   private boolean d(bto $$0) {
      return $$0.dL() && $$0.de();
   }

   private boolean O() {
      double $$0 = 0.8;
      return this.bn() ? this.cx.b() : (double)this.cx.b >= 0.8;
   }

   private boolean P() {
      return this.bW() || (float)this.gm().a() > 6.0F || this.gd().c;
   }

   public float E() {
      if (!this.a(awz.a)) {
         return 0.0F;
      } else {
         float $$0 = 600.0F;
         float $$1 = 100.0F;
         if ((float)this.dl >= 600.0F) {
            return 1.0F;
         } else {
            float $$2 = azd.a((float)this.dl / 100.0F, 0.0F, 1.0F);
            float $$3 = (float)this.dl < 100.0F ? 0.0F : azd.a(((float)this.dl - 100.0F) / 500.0F, 0.0F, 1.0F);
            return $$2 * 0.6F + $$3 * 0.39999998F;
         }
      }
   }

   public void a(ded $$0) {
      if ($$0 == ded.d) {
         this.h(this.dv().a(jj.a.b, 0.0));
      }
   }

   @Override
   public boolean bn() {
      return this.cl;
   }

   @Override
   protected boolean fV() {
      boolean $$0 = this.cl;
      boolean $$1 = super.fV();
      if (this.P_()) {
         return this.cl;
      } else {
         if (!$$0 && $$1) {
            this.dS().a(this.dx(), this.dz(), this.dD(), awe.x, awf.i, 1.0F, 1.0F, false);
            this.cy.ak().a((hav)(new hay.b(this)));
         }

         if ($$0 && !$$1) {
            this.dS().a(this.dx(), this.dz(), this.dD(), awe.y, awf.i, 1.0F, 1.0F, false);
         }

         return this.cl;
      }
   }

   @Override
   public eys u(float $$0) {
      if (this.cy.n.aD().a()) {
         float $$1 = azd.h($$0 * 0.5F, this.dI(), this.O) * (float) (Math.PI / 180.0);
         float $$2 = azd.h($$0 * 0.5F, this.dK(), this.P) * (float) (Math.PI / 180.0);
         double $$3 = this.fu() == bue.b ? -1.0 : 1.0;
         eys $$4 = new eys(0.39 * $$3, -0.6, 0.3);
         return $$4.a(-$$2).b(-$$1).e(this.m($$0));
      } else {
         return super.u($$0);
      }
   }

   @Override
   public void a(cvp $$0, cvp $$1, crg $$2) {
      this.cy.aB().a($$0, $$1, $$2);
   }

   @Override
   public float dJ() {
      return this.dI();
   }

   @Override
   public void h(cvp $$0) {
      this.cy.r.a($$0);
   }
}
