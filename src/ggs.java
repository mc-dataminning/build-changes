import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ggs extends ggp {
   public static final Logger i = LogUtils.getLogger();
   private static final int cH = 20;
   private static final int cI = 600;
   private static final int cJ = 100;
   private static final float cK = 0.6F;
   private static final double cL = 0.35;
   private static final double cM = 0.13962634F;
   public final gby cw;
   private final awv cN;
   private final fil cO;
   private final List<haz> cP = Lists.newArrayList();
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
   public ggq cx = new ggq();
   private cof dd = cof.b;
   protected final fja cy;
   protected int cA;
   public float cB;
   public float cC;
   public float cD;
   public float cE;
   private int de;
   private float df;
   public float cF;
   public float cG;
   private boolean dg;
   @Nullable
   private brx dh;
   private boolean di;
   private boolean dj = true;
   private int dk;
   private boolean dl;
   private int dm;
   private boolean dn = true;
   private boolean do = false;

   public ggs(fja $$0, gbx $$1, gby $$2, awv $$3, fil $$4, boolean $$5, boolean $$6) {
      super($$1, $$2.o());
      this.cy = $$0;
      this.cw = $$2;
      this.cN = $$3;
      this.cO = $$4;
      this.cZ = $$5;
      this.da = $$6;
      this.cP.add(new hbr(this, $$0.ak()));
      this.cP.add(new hbe(this));
      this.cP.add(new hbd(this, $$0.ak(), $$1.F_()));
   }

   @Override
   public boolean a(bsp $$0, float $$1) {
      return false;
   }

   @Override
   public void c(float $$0) {
   }

   @Override
   public boolean a(btz $$0, boolean $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         if ($$0 instanceof cqf) {
            this.cy.ak().a((hbp)(new hbj(this, (cqf)$$0, true)));
            this.cy.ak().a((hbp)(new hbj(this, (cqf)$$0, false)));
         }

         return true;
      }
   }

   @Override
   public void bR() {
      super.bR();
      this.di = false;
   }

   @Override
   public float h(float $$0) {
      return this.dP();
   }

   @Override
   public float i(float $$0) {
      return this.ca() ? super.i($$0) : this.dN();
   }

   @Override
   public void l() {
      if (this.dX().f(this.dB(), this.dH())) {
         super.l();
         this.G();
         if (!this.dd.equals(this.cx.a)) {
            this.cw.b(new aib(this.cx.a));
            this.dd = this.cx.a;
         }

         if (this.ca()) {
            this.cw.b(new aht.c(this.dN(), this.dP(), this.aJ(), this.Q));
            btz $$0 = this.dh();
            if ($$0 != this && $$0.dj()) {
               this.cw.b(new ahu($$0));
               this.I();
            }
         } else {
            this.F();
         }

         for (haz $$1 : this.cP) {
            $$1.a();
         }
      }
   }

   public float c() {
      for (haz $$0 : this.cP) {
         if ($$0 instanceof hbd) {
            return ((hbd)$$0).b();
         }
      }

      return 0.0F;
   }

   private void F() {
      this.I();
      if (this.x()) {
         double $$0 = this.dC() - this.cR;
         double $$1 = this.dE() - this.cS;
         double $$2 = this.dI() - this.cT;
         double $$3 = (double)(this.dN() - this.cU);
         double $$4 = (double)(this.dP() - this.cV);
         this.db++;
         boolean $$5 = azj.f($$0, $$1, $$2) > azj.k(2.0E-4) || this.db >= 20;
         boolean $$6 = $$3 != 0.0 || $$4 != 0.0;
         if ($$5 && $$6) {
            this.cw.b(new aht.b(this.dC(), this.dE(), this.dI(), this.dN(), this.dP(), this.aJ(), this.Q));
         } else if ($$5) {
            this.cw.b(new aht.a(this.dC(), this.dE(), this.dI(), this.aJ(), this.Q));
         } else if ($$6) {
            this.cw.b(new aht.c(this.dN(), this.dP(), this.aJ(), this.Q));
         } else if (this.cW != this.aJ() || this.cX != this.Q) {
            this.cw.b(new aht.d(this.aJ(), this.Q));
         }

         if ($$5) {
            this.cR = this.dC();
            this.cS = this.dE();
            this.cT = this.dI();
            this.db = 0;
         }

         if ($$6) {
            this.cU = this.dN();
            this.cV = this.dP();
         }

         this.cW = this.aJ();
         this.cX = this.Q;
         this.dj = this.cy.n.I().c();
      }
   }

   private void G() {
      boolean $$0 = this.ce();
      if ($$0 != this.cZ) {
         aia.a $$1 = $$0 ? aia.a.a : aia.a.b;
         this.cw.b(new aia(this, $$1));
         this.cZ = $$0;
      }
   }

   private void I() {
      boolean $$0 = this.ck();
      if ($$0 != this.da) {
         aia.a $$1 = $$0 ? aia.a.d : aia.a.e;
         this.cw.b(new aia(this, $$1));
         this.da = $$0;
      }
   }

   public boolean a(boolean $$0) {
      ahz.a $$1 = $$0 ? ahz.a.d : ahz.a.e;
      cvx $$2 = this.gk().a($$0);
      this.cw.b(new ahz($$1, jg.c, jl.a));
      return !$$2.f();
   }

   @Override
   public void a(brx $$0) {
      super.a($$0);
      this.cw.b(new aiq($$0));
   }

   @Override
   public void gi() {
      this.cw.b(new ahf(ahf.a.a));
      fiy.c();
   }

   @Override
   protected void f(bsp $$0, float $$1) {
      if (!this.b($$0)) {
         this.x(this.eG() - $$1);
      }
   }

   @Override
   public void s() {
      this.cw.b(new ahl(this.ca.l));
      this.d();
   }

   public void d() {
      super.s();
      this.cy.a(null);
   }

   public void J(float $$0) {
      if (this.dc) {
         float $$1 = this.eG() - $$0;
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
         this.dc = true;
      }
   }

   @Override
   public void A() {
      this.cw.b(new ahy(this.gl()));
   }

   @Override
   public boolean g() {
      return true;
   }

   @Override
   public boolean fK() {
      return !this.gl().b && super.fK();
   }

   @Override
   public boolean bw() {
      return !this.gl().b && super.bw();
   }

   protected void e() {
      this.cw.b(new aia(this, aia.a.f, azj.d(this.q() * 100.0F)));
   }

   public void h() {
      this.cw.b(new aia(this, aia.a.h));
   }

   public awv i() {
      return this.cN;
   }

   public fil j() {
      return this.cO;
   }

   public void a(dal<?> $$0) {
      if (this.cO.d($$0)) {
         this.cO.e($$0);
         this.cw.b(new aid($$0));
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
   public void a(xh $$0, boolean $$1) {
      this.cy.bb().a($$0, $$1);
   }

   private void c(double $$0, double $$1) {
      jg $$2 = jg.a($$0, this.dE(), $$1);
      if (this.c($$2)) {
         double $$3 = $$0 - (double)$$2.u();
         double $$4 = $$1 - (double)$$2.w();
         jl $$5 = null;
         double $$6 = Double.MAX_VALUE;
         jl[] $$7 = new jl[]{jl.e, jl.f, jl.c, jl.d};

         for (jl $$8 : $$7) {
            double $$9 = $$8.o().a($$3, 0.0, $$4);
            double $$10 = $$8.f() == jl.b.a ? 1.0 - $$9 : $$9;
            if ($$10 < $$6 && !this.c($$2.a($$8))) {
               $$6 = $$10;
               $$5 = $$8;
            }
         }

         if ($$5 != null) {
            ezh $$11 = this.dA();
            if ($$5.o() == jl.a.a) {
               this.n(0.1 * (double)$$5.j(), $$11.e, $$11.f);
            } else {
               this.n($$11.d, $$11.e, 0.1 * (double)$$5.l());
            }
         }
      }
   }

   private boolean c(jg $$0) {
      ezc $$1 = this.cS();
      ezc $$2 = new ezc((double)$$0.u(), $$1.b, (double)$$0.w(), (double)$$0.u() + 1.0, $$1.e, (double)$$0.w() + 1.0).h(1.0E-7);
      return this.dX().g(this, $$2);
   }

   public void a(float $$0, int $$1, int $$2) {
      this.cp = $$0;
      this.co = $$1;
      this.cn = $$2;
   }

   @Override
   public void a(xh $$0) {
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
      this.dn = $$0;
   }

   public boolean m() {
      return this.dn;
   }

   public void x(boolean $$0) {
      this.do = $$0;
   }

   public boolean o() {
      return this.do;
   }

   @Override
   public void a(awj $$0, float $$1, float $$2) {
      this.dX().a(this.dC(), this.dE(), this.dI(), $$0, this.dn(), $$1, $$2, false);
   }

   @Override
   public void a(awj $$0, awl $$1, float $$2, float $$3) {
      this.dX().a(this.dC(), this.dE(), this.dI(), $$0, $$1, $$2, $$3, false);
   }

   @Override
   public boolean dk() {
      return true;
   }

   @Override
   public void c(brx $$0) {
      cvx $$1 = this.b($$0);
      if (!$$1.f() && !this.fB()) {
         super.c($$0);
         this.dg = true;
         this.dh = $$0;
      }
   }

   @Override
   public boolean fB() {
      return this.dg;
   }

   @Override
   public void fH() {
      super.fH();
      this.dg = false;
   }

   @Override
   public brx fC() {
      return Objects.requireNonNullElse(this.dh, brx.a);
   }

   @Override
   public void a(akk<?> $$0) {
      super.a($$0);
      if (aA.equals($$0)) {
         boolean $$1 = (this.am.a(aA) & 1) > 0;
         brx $$2 = (this.am.a(aA) & 2) > 0 ? brx.b : brx.a;
         if ($$1 && !this.dg) {
            this.c($$2);
         } else if (!$$1 && this.dg) {
            this.fH();
         }
      }

      if (an.equals($$0) && this.fL() && !this.dl) {
         this.cy.ak().a((hbp)(new hbf(this)));
      }
   }

   @Nullable
   public bvf p() {
      if (this.dm() instanceof bvf $$0 && $$0.a()) {
         return $$0;
      }

      return null;
   }

   public float q() {
      return this.df;
   }

   @Override
   public boolean ab() {
      return this.cy.aV();
   }

   @Override
   public void a(dts $$0, boolean $$1) {
      if ($$0 instanceof dtf $$2) {
         this.cy.a(new fse($$2, $$1, this.cy.aV()));
      } else {
         this.cy.a(new fsr($$0, $$1, this.cy.aV()));
      }
   }

   @Override
   public void a(ddv $$0) {
      this.cy.a(new fso($$0));
   }

   @Override
   public void a(dsq $$0) {
      this.cy.a(new frr($$0));
   }

   @Override
   public void a(dtx $$0) {
      this.cy.a(new fsv($$0));
   }

   @Override
   public void a(dti $$0) {
      this.cy.a(new fsj($$0));
   }

   @Override
   public void a(cvx $$0, brx $$1) {
      if ($$0.a(cwb.ua)) {
         this.cy.a(new frn(this, $$0, $$1));
      }
   }

   @Override
   public void b(btz $$0) {
      this.cy.g.a($$0, lq.f);
   }

   @Override
   public void c(btz $$0) {
      this.cy.g.a($$0, lq.r);
   }

   @Override
   public boolean ce() {
      return this.cx.a.f();
   }

   @Override
   public boolean cj() {
      return this.cY;
   }

   public boolean w() {
      return this.cj() || this.cn();
   }

   @Override
   public void fw() {
      super.fw();
      if (this.x()) {
         this.bl = this.cx.b;
         this.bn = this.cx.c;
         this.bk = this.cx.a.e();
         this.cD = this.cB;
         this.cE = this.cC;
         this.cC = this.cC + (this.dP() - this.cC) * 0.5F;
         this.cB = this.cB + (this.dN() - this.cB) * 0.5F;
      }
   }

   protected boolean x() {
      return this.cy.ao() == this;
   }

   public void y() {
      this.b(bvh.a);
      if (this.dX() != null) {
         for (double $$0 = this.dE(); $$0 > (double)this.dX().I_() && $$0 <= (double)this.dX().an(); $$0++) {
            this.a_(this.dC(), $$0, this.dI());
            if (this.dX().g(this)) {
               break;
            }
         }

         this.h(ezh.c);
         this.w(0.0F);
      }

      this.x(this.eV());
      this.aM = 0;
   }

   @Override
   public void n_() {
      if (this.cA > 0) {
         this.cA--;
      }

      if (!(this.cy.z instanceof fqq)) {
         this.y(this.B() == dnq.a.a);
         this.N();
      }

      boolean $$0 = this.cx.a.e();
      boolean $$1 = this.cx.a.f();
      boolean $$2 = this.O();
      cod $$3 = this.gl();
      this.cY = !$$3.b && !this.cl() && !this.ca() && this.h(bvh.f) && (this.ce() || !this.fT() && !this.h(bvh.a));
      float $$4 = (float)this.h(bwd.z);
      this.cx.a(this.w(), $$4);
      this.cy.aB().a(this.cx);
      if (this.fB() && !this.ca()) {
         this.cx.b *= 0.2F;
         this.cx.c *= 0.2F;
         this.cA = 0;
      }

      boolean $$5 = false;
      if (this.dk > 0) {
         this.dk--;
         $$5 = true;
         this.cx.c();
      }

      if (!this.ae) {
         this.c(this.dC() - (double)this.ds() * 0.35, this.dI() + (double)this.ds() * 0.35);
         this.c(this.dC() - (double)this.ds() * 0.35, this.dI() - (double)this.ds() * 0.35);
         this.c(this.dC() + (double)this.ds() * 0.35, this.dI() - (double)this.ds() * 0.35);
         this.c(this.dC() + (double)this.ds() * 0.35, this.dI() + (double)this.ds() * 0.35);
      }

      if ($$1) {
         this.cA = 0;
      }

      boolean $$6 = this.M();
      boolean $$7 = this.ca() ? this.dl().aJ() : this.aJ();
      boolean $$8 = !$$1 && !$$2;
      if (($$7 || this.bp()) && $$8 && $$6) {
         if (this.cA <= 0 && !this.cy.n.B.e()) {
            this.cA = 7;
         } else {
            this.h(true);
         }
      }

      if ((!this.bk() || this.bp()) && $$6 && this.cy.n.B.e()) {
         this.h(true);
      }

      if (this.ck()) {
         boolean $$9 = !this.cx.b() || !this.P();
         boolean $$10 = $$9 || this.Q && !this.T || this.bk() && !this.bp();
         if (this.cl()) {
            if (!this.aJ() && !this.cx.a.f() && $$9 || !this.bk()) {
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
         } else if (!$$0 && this.cx.a.e() && !$$5) {
            if (this.cc == 0) {
               this.cc = 7;
            } else if (!this.cl()) {
               $$3.b = !$$3.b;
               if ($$3.b && this.aJ()) {
                  this.v();
               }

               $$11 = true;
               this.A();
               this.cc = 0;
            }
         }
      }

      if (this.cx.a.e() && !$$11 && !$$0 && !this.q_() && this.gp()) {
         this.cw.b(new aia(this, aia.a.i));
      }

      this.dl = this.fL();
      if (this.bk() && this.cx.a.f() && this.em()) {
         this.fn();
      }

      if (this.a(axf.a)) {
         int $$12 = this.R_() ? 10 : 1;
         this.dm = azj.a(this.dm + $$12, 0, 600);
      } else if (this.dm > 0) {
         this.a(axf.a);
         this.dm = azj.a(this.dm - 10, 0, 600);
      }

      if ($$3.b && this.x()) {
         int $$13 = 0;
         if (this.cx.a.f()) {
            $$13--;
         }

         if (this.cx.a.e()) {
            $$13++;
         }

         if ($$13 != 0) {
            this.h(this.dA().b(0.0, (double)((float)$$13 * $$3.a() * 3.0F), 0.0));
         }
      }

      bvf $$14 = this.p();
      if ($$14 != null && $$14.c() == 0) {
         if (this.de < 0) {
            this.de++;
            if (this.de == 0) {
               this.df = 0.0F;
            }
         }

         if ($$0 && !this.cx.a.e()) {
            this.de = -10;
            $$14.b(azj.d(this.q() * 100.0F));
            this.e();
         } else if (!$$0 && this.cx.a.e()) {
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

      super.n_();
      if (this.aJ() && $$3.b && !this.cy.r.h()) {
         $$3.b = false;
         this.A();
      }
   }

   public dnq.a B() {
      return this.at == null ? dnq.a.b : this.at.a();
   }

   @Override
   protected void en() {
      this.aM++;
      if (this.aM == 20) {
         this.a(btz.c.a);
      }
   }

   private void y(boolean $$0) {
      this.cG = this.cF;
      float $$1 = 0.0F;
      if ($$0 && this.at != null && this.at.e()) {
         if (this.cy.z != null && !this.cy.z.k() && !(this.cy.z instanceof fpw) && !(this.cy.z instanceof fqv)) {
            if (this.cy.z instanceof frh) {
               this.s();
            }

            this.cy.a(null);
         }

         if (this.cF == 0.0F) {
            this.cy.ak().a(hbk.b(awk.uI, this.af.i() * 0.4F + 0.8F, 0.25F));
         }

         $$1 = 0.0125F;
         this.at.a(false);
      } else if (this.b(btg.i) && !this.c(btg.i).a(60)) {
         $$1 = 0.006666667F;
      } else if (this.cF > 0.0F) {
         $$1 = -0.05F;
      }

      this.cF = azj.a(this.cF + $$1, 0.0F, 1.0F);
   }

   @Override
   public void u() {
      super.u();
      this.di = false;
      if (this.dm() instanceof cqh $$0) {
         $$0.a(this.cx.a.c(), this.cx.a.d(), this.cx.a.a(), this.cx.a.b());
         this.di = this.di | (this.cx.a.c() || this.cx.a.d() || this.cx.a.a() || this.cx.a.b());
      }
   }

   public boolean C() {
      return this.di;
   }

   @Nullable
   @Override
   public bte d(jp<btc> $$0) {
      if ($$0.a(btg.i)) {
         this.cG = 0.0F;
         this.cF = 0.0F;
      }

      return super.d($$0);
   }

   @Override
   public void a(buz $$0, ezh $$1) {
      double $$2 = this.dC();
      double $$3 = this.dI();
      super.a($$0, $$1);
      float $$4 = (float)(this.dC() - $$2);
      float $$5 = (float)(this.dI() - $$3);
      this.g($$4, $$5);
      this.h = this.h + azj.f($$4, $$5) * 0.6F;
   }

   public boolean D() {
      return this.dj;
   }

   @Override
   public boolean gP() {
      return this.cy.n.J().c();
   }

   protected void g(float $$0, float $$1) {
      if (this.J()) {
         ezh $$2 = this.dv();
         ezh $$3 = $$2.b((double)$$0, 0.0, (double)$$1);
         ezh $$4 = new ezh((double)$$0, 0.0, (double)$$1);
         float $$5 = this.fr();
         float $$6 = (float)$$4.h();
         if ($$6 <= 0.001F) {
            ezg $$7 = this.cx.a();
            float $$8 = $$5 * $$7.i;
            float $$9 = $$5 * $$7.j;
            float $$10 = azj.a(this.dN() * (float) (Math.PI / 180.0));
            float $$11 = azj.b(this.dN() * (float) (Math.PI / 180.0));
            $$4 = new ezh((double)($$8 * $$11 - $$9 * $$10), $$4.e, (double)($$9 * $$11 + $$8 * $$10));
            $$6 = (float)$$4.h();
            if ($$6 <= 0.001F) {
               return;
            }
         }

         float $$12 = azj.j($$6);
         ezh $$13 = $$4.c((double)$$12);
         ezh $$14 = this.bW();
         float $$15 = (float)($$14.d * $$13.d + $$14.f * $$13.f);
         if (!($$15 < -0.15F)) {
            ezm $$16 = ezm.a(this);
            jg $$17 = jg.a(this.dC(), this.cS().e, this.dI());
            dvd $$18 = this.dX().a_($$17);
            if ($$18.b(this.dX(), $$17, $$16).c()) {
               $$17 = $$17.d();
               dvd $$19 = this.dX().a_($$17);
               if ($$19.b(this.dX(), $$17, $$16).c()) {
                  float $$20 = 7.0F;
                  float $$21 = 1.2F;
                  if (this.b(btg.h)) {
                     $$21 += (float)(this.c(btg.h).e() + 1) * 0.75F;
                  }

                  float $$22 = Math.max($$5 * 7.0F, 1.0F / $$12);
                  ezh $$24 = $$3.e($$13.c((double)$$22));
                  float $$25 = this.ds();
                  float $$26 = this.dt();
                  ezc $$27 = new ezc($$2, $$24.b(0.0, (double)$$26, 0.0)).c((double)$$25, 0.0, (double)$$25);
                  ezh $$23 = $$2.b(0.0, 0.51F, 0.0);
                  $$24 = $$24.b(0.0, 0.51F, 0.0);
                  ezh $$28 = $$13.c(new ezh(0.0, 1.0, 0.0));
                  ezh $$29 = $$28.c((double)($$25 * 0.5F));
                  ezh $$30 = $$23.d($$29);
                  ezh $$31 = $$24.d($$29);
                  ezh $$32 = $$23.e($$29);
                  ezh $$33 = $$24.e($$29);
                  Iterable<fab> $$34 = this.dX().d(this, $$27);
                  Iterator<ezc> $$35 = StreamSupport.stream($$34.spliterator(), false).flatMap($$0x -> $$0x.e().stream()).iterator();
                  float $$36 = Float.MIN_VALUE;

                  while ($$35.hasNext()) {
                     ezc $$37 = $$35.next();
                     if ($$37.a($$30, $$31) || $$37.a($$32, $$33)) {
                        $$36 = (float)$$37.e;
                        ezh $$38 = $$37.f();
                        jg $$39 = jg.a((jz)$$38);

                        for (int $$40 = 1; (float)$$40 < $$21; $$40++) {
                           jg $$41 = $$39.b($$40);
                           dvd $$42 = this.dX().a_($$41);
                           fab $$43;
                           if (!($$43 = $$42.b(this.dX(), $$41, $$16)).c()) {
                              $$36 = (float)$$43.c(jl.a.b) + (float)$$41.v();
                              if ((double)$$36 - this.dE() > (double)$$21) {
                                 return;
                              }
                           }

                           if ($$40 > 1) {
                              $$17 = $$17.d();
                              dvd $$44 = this.dX().a_($$17);
                              if (!$$44.b(this.dX(), $$17, $$16).c()) {
                                 return;
                              }
                           }
                        }
                        break;
                     }
                  }

                  if ($$36 != Float.MIN_VALUE) {
                     float $$45 = (float)((double)$$36 - this.dE());
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
   protected boolean c(ezh $$0) {
      float $$1 = this.dN() * (float) (Math.PI / 180.0);
      double $$2 = (double)azj.a($$1);
      double $$3 = (double)azj.b($$1);
      double $$4 = (double)this.bl * $$3 - (double)this.bn * $$2;
      double $$5 = (double)this.bn * $$3 + (double)this.bl * $$2;
      double $$6 = azj.k($$4) + azj.k($$5);
      double $$7 = azj.k($$0.d) + azj.k($$0.f);
      if (!($$6 < 1.0E-5F) && !($$7 < 1.0E-5F)) {
         double $$8 = $$4 * $$0.d + $$5 * $$0.f;
         double $$9 = Math.acos($$8 / Math.sqrt($$6 * $$7));
         return $$9 < 0.13962634F;
      } else {
         return false;
      }
   }

   private boolean J() {
      return this.D() && this.dk <= 0 && this.aJ() && !this.gc() && !this.ca() && this.K() && (double)this.aS() >= 1.0;
   }

   private boolean K() {
      ezg $$0 = this.cx.a();
      return $$0.i != 0.0F || $$0.j != 0.0F;
   }

   private boolean M() {
      return !this.ck() && this.O() && this.P() && !this.fB() && !this.b(btg.o) && (!this.ca() || this.d(this.dl())) && !this.fL();
   }

   private boolean d(btz $$0) {
      return $$0.dQ() && $$0.dj();
   }

   private boolean O() {
      double $$0 = 0.8;
      return this.bp() ? this.cx.b() : (double)this.cx.c >= 0.8;
   }

   private boolean P() {
      return this.ca() || (float)this.gu().a() > 6.0F || this.gl().c;
   }

   public float E() {
      if (!this.a(axf.a)) {
         return 0.0F;
      } else {
         float $$0 = 600.0F;
         float $$1 = 100.0F;
         if ((float)this.dm >= 600.0F) {
            return 1.0F;
         } else {
            float $$2 = azj.a((float)this.dm / 100.0F, 0.0F, 1.0F);
            float $$3 = (float)this.dm < 100.0F ? 0.0F : azj.a(((float)this.dm - 100.0F) / 500.0F, 0.0F, 1.0F);
            return $$2 * 0.6F + $$3 * 0.39999998F;
         }
      }
   }

   public void a(des $$0) {
      if ($$0 == des.d) {
         this.h(this.dA().a(jl.a.b, 0.0));
      }
   }

   @Override
   public boolean bp() {
      return this.cm;
   }

   @Override
   protected boolean gd() {
      boolean $$0 = this.cm;
      boolean $$1 = super.gd();
      if (this.R_()) {
         return this.cm;
      } else {
         if (!$$0 && $$1) {
            this.dX().a(this.dC(), this.dE(), this.dI(), awk.x, awl.i, 1.0F, 1.0F, false);
            this.cy.ak().a((hbp)(new hbs.b(this)));
         }

         if ($$0 && !$$1) {
            this.dX().a(this.dC(), this.dE(), this.dI(), awk.y, awl.i, 1.0F, 1.0F, false);
         }

         return this.cm;
      }
   }

   @Override
   public ezh u(float $$0) {
      if (this.cy.n.aD().a()) {
         float $$1 = azj.h($$0 * 0.5F, this.dN(), this.O) * (float) (Math.PI / 180.0);
         float $$2 = azj.h($$0 * 0.5F, this.dP(), this.P) * (float) (Math.PI / 180.0);
         double $$3 = this.fA() == bup.b ? -1.0 : 1.0;
         ezh $$4 = new ezh(0.39 * $$3, -0.6, 0.3);
         return $$4.a(-$$2).b(-$$1).e(this.m($$0));
      } else {
         return super.u($$0);
      }
   }

   @Override
   public void a(cvx $$0, cvx $$1, crt $$2) {
      this.cy.aB().a($$0, $$1, $$2);
   }

   @Override
   public float dO() {
      return this.dN();
   }

   @Override
   public void g(cvx $$0) {
      this.cy.r.a($$0);
   }
}
