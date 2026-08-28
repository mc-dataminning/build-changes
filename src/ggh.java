import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ggh extends gge {
   public static final Logger cv = LogUtils.getLogger();
   private static final int cH = 20;
   private static final int cI = 600;
   private static final int cJ = 100;
   private static final float cK = 0.6F;
   private static final double cL = 0.35;
   private static final double cM = 0.13962634F;
   public final gbn cw;
   private final awr cN;
   private final fia cO;
   private final List<hak> cP = Lists.newArrayList();
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
   public ggf cx;
   protected final fip cy;
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
   private brr dg;
   private boolean dh;
   private boolean di = true;
   private int dj;
   private boolean dk;
   private int dl;
   private boolean dm = true;
   private boolean dn = false;

   public ggh(fip $$0, gbm $$1, gbn $$2, awr $$3, fia $$4, boolean $$5, boolean $$6) {
      super($$1, $$2.o());
      this.cy = $$0;
      this.cw = $$2;
      this.cN = $$3;
      this.cO = $$4;
      this.cZ = $$5;
      this.da = $$6;
      this.cP.add(new hbc(this, $$0.ak()));
      this.cP.add(new hap(this));
      this.cP.add(new hao(this, $$0.ak(), $$1.E_()));
   }

   @Override
   public boolean a(bsj $$0, float $$1) {
      return false;
   }

   @Override
   public void c(float $$0) {
   }

   @Override
   public boolean a(btr $$0, boolean $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         if ($$0 instanceof cpv) {
            this.cy.ak().a((hba)(new hau(this, (cpv)$$0, true)));
            this.cy.ak().a((hba)(new hau(this, (cpv)$$0, false)));
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
            this.cw.b(new ahq.c(this.dI(), this.dK(), this.aH(), this.Q));
            this.cw.b(new ahy(this.bk, this.bm, this.cx.g, this.cx.h));
            btr $$0 = this.dd();
            if ($$0 != this && $$0.de()) {
               this.cw.b(new ahr($$0));
               this.I();
            }
         } else {
            this.F();
         }

         for (hak $$1 : this.cP) {
            $$1.a();
         }
      }
   }

   public float c() {
      for (hak $$0 : this.cP) {
         if ($$0 instanceof hao) {
            return ((hao)$$0).b();
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
         boolean $$5 = azf.f($$0, $$1, $$2) > azf.k(2.0E-4) || this.db >= 20;
         boolean $$6 = $$3 != 0.0 || $$4 != 0.0;
         if ($$5 && $$6) {
            this.cw.b(new ahq.b(this.dx(), this.dz(), this.dD(), this.dI(), this.dK(), this.aH(), this.Q));
         } else if ($$5) {
            this.cw.b(new ahq.a(this.dx(), this.dz(), this.dD(), this.aH(), this.Q));
         } else if ($$6) {
            this.cw.b(new ahq.c(this.dI(), this.dK(), this.aH(), this.Q));
         } else if (this.cW != this.aH() || this.cX != this.Q) {
            this.cw.b(new ahq.d(this.aH(), this.Q));
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
         ahx.a $$1 = $$0 ? ahx.a.a : ahx.a.b;
         this.cw.b(new ahx(this, $$1));
         this.cZ = $$0;
      }
   }

   private void I() {
      boolean $$0 = this.cg();
      if ($$0 != this.da) {
         ahx.a $$1 = $$0 ? ahx.a.d : ahx.a.e;
         this.cw.b(new ahx(this, $$1));
         this.da = $$0;
      }
   }

   public boolean a(boolean $$0) {
      ahw.a $$1 = $$0 ? ahw.a.d : ahw.a.e;
      cvs $$2 = this.gd().a($$0);
      this.cw.b(new ahw($$1, jf.c, jk.a));
      return !$$2.f();
   }

   @Override
   public void a(brr $$0) {
      super.a($$0);
      this.cw.b(new ain($$0));
   }

   @Override
   public void gb() {
      this.cw.b(new ahc(ahc.a.a));
      fin.c();
   }

   @Override
   protected void f(bsj $$0, float $$1) {
      if (!this.b($$0)) {
         this.x(this.eB() - $$1);
      }
   }

   @Override
   public void s() {
      this.cw.b(new ahi(this.bZ.l));
      this.d();
   }

   public void d() {
      super.s();
      this.cy.a(null);
   }

   public void J(float $$0) {
      if (this.dc) {
         float $$1 = this.eB() - $$0;
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
      this.cw.b(new ahv(this.ge()));
   }

   @Override
   public boolean g() {
      return true;
   }

   @Override
   public boolean fE() {
      return !this.ge().b && super.fE();
   }

   @Override
   public boolean bu() {
      return !this.ge().b && super.bu();
   }

   protected void e() {
      this.cw.b(new ahx(this, ahx.a.f, azf.d(this.q() * 100.0F)));
   }

   public void h() {
      this.cw.b(new ahx(this, ahx.a.h));
   }

   public awr i() {
      return this.cN;
   }

   public fia j() {
      return this.cO;
   }

   public void a(dam<?> $$0) {
      if (this.cO.d($$0)) {
         this.cO.e($$0);
         this.cw.b(new aia($$0));
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
   public void a(xe $$0, boolean $$1) {
      this.cy.ba().a($$0, $$1);
   }

   private void c(double $$0, double $$1) {
      jf $$2 = jf.a($$0, this.dz(), $$1);
      if (this.c($$2)) {
         double $$3 = $$0 - (double)$$2.u();
         double $$4 = $$1 - (double)$$2.w();
         jk $$5 = null;
         double $$6 = Double.MAX_VALUE;
         jk[] $$7 = new jk[]{jk.e, jk.f, jk.c, jk.d};

         for (jk $$8 : $$7) {
            double $$9 = $$8.o().a($$3, 0.0, $$4);
            double $$10 = $$8.f() == jk.b.a ? 1.0 - $$9 : $$9;
            if ($$10 < $$6 && !this.c($$2.a($$8))) {
               $$6 = $$10;
               $$5 = $$8;
            }
         }

         if ($$5 != null) {
            eyw $$11 = this.dv();
            if ($$5.o() == jk.a.a) {
               this.n(0.1 * (double)$$5.j(), $$11.e, $$11.f);
            } else {
               this.n($$11.d, $$11.e, 0.1 * (double)$$5.l());
            }
         }
      }
   }

   private boolean c(jf $$0) {
      eyr $$1 = this.cO();
      eyr $$2 = new eyr((double)$$0.u(), $$1.b, (double)$$0.w(), (double)$$0.u() + 1.0, $$1.e, (double)$$0.w() + 1.0).h(1.0E-7);
      return this.dS().g(this, $$2);
   }

   public void a(float $$0, int $$1, int $$2) {
      this.co = $$0;
      this.cn = $$1;
      this.cm = $$2;
   }

   @Override
   public void a(xe $$0) {
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
   public void a(awf $$0, float $$1, float $$2) {
      this.dS().a(this.dx(), this.dz(), this.dD(), $$0, this.di(), $$1, $$2, false);
   }

   @Override
   public void a(awf $$0, awh $$1, float $$2, float $$3) {
      this.dS().a(this.dx(), this.dz(), this.dD(), $$0, $$1, $$2, $$3, false);
   }

   @Override
   public boolean df() {
      return true;
   }

   @Override
   public void c(brr $$0) {
      cvs $$1 = this.b($$0);
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
   public brr fw() {
      return Objects.requireNonNullElse(this.dg, brr.a);
   }

   @Override
   public void a(akh<?> $$0) {
      super.a($$0);
      if (az.equals($$0)) {
         boolean $$1 = (this.am.a(az) & 1) > 0;
         brr $$2 = (this.am.a(az) & 2) > 0 ? brr.b : brr.a;
         if ($$1 && !this.df) {
            this.c($$2);
         } else if (!$$1 && this.df) {
            this.fB();
         }
      }

      if (an.equals($$0) && this.fF() && !this.dk) {
         this.cy.ak().a((hba)(new haq(this)));
      }
   }

   @Nullable
   public bux p() {
      if (this.dh() instanceof bux $$0 && $$0.a()) {
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
   public void a(dth $$0, boolean $$1) {
      if ($$0 instanceof dsu $$2) {
         this.cy.a(new frt($$2, $$1, this.cy.aU()));
      } else {
         this.cy.a(new fsg($$0, $$1, this.cy.aU()));
      }
   }

   @Override
   public void a(ddj $$0) {
      this.cy.a(new fsd($$0));
   }

   @Override
   public void a(dsf $$0) {
      this.cy.a(new frg($$0));
   }

   @Override
   public void a(dtm $$0) {
      this.cy.a(new fsk($$0));
   }

   @Override
   public void a(dsx $$0) {
      this.cy.a(new fry($$0));
   }

   @Override
   public void a(cvs $$0, brr $$1) {
      if ($$0.a(cvw.ua)) {
         this.cy.a(new frc(this, $$0, $$1));
      }
   }

   @Override
   public void b(btr $$0) {
      this.cy.g.a($$0, lo.f);
   }

   @Override
   public void c(btr $$0) {
      this.cy.g.a($$0, lo.r);
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
      this.b(buz.a);
      if (this.dS() != null) {
         for (double $$0 = this.dz(); $$0 > (double)this.dS().H_() && $$0 <= (double)this.dS().an(); $$0++) {
            this.a_(this.dx(), $$0, this.dD());
            if (this.dS().g(this)) {
               break;
            }
         }

         this.h(eyw.c);
         this.w(0.0F);
      }

      this.x(this.eQ());
      this.aL = 0;
   }

   @Override
   public void n_() {
      if (this.cA > 0) {
         this.cA--;
      }

      if (!(this.cy.z instanceof fqf)) {
         this.y(this.B() == dnf.a.a);
         this.N();
      }

      boolean $$0 = this.cx.g;
      boolean $$1 = this.cx.h;
      boolean $$2 = this.O();
      cnu $$3 = this.ge();
      this.cY = !$$3.b && !this.ch() && !this.bW() && this.h(buz.f) && (this.ca() || !this.fN() && !this.h(buz.a));
      float $$4 = (float)this.h(bvu.z);
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

      if (this.cx.g && !$$11 && !$$0 && !$$3.b && !this.bW() && !this.q_()) {
         cvs $$12 = this.a(btz.e);
         if ($$12.a(cvw.nU) && cuq.g($$12) && this.gi()) {
            this.cw.b(new ahx(this, ahx.a.i));
         }
      }

      this.dk = this.fF();
      if (this.bi() && this.cx.h && this.eh()) {
         this.fi();
      }

      if (this.a(axb.a)) {
         int $$13 = this.Q_() ? 10 : 1;
         this.dl = azf.a(this.dl + $$13, 0, 600);
      } else if (this.dl > 0) {
         this.a(axb.a);
         this.dl = azf.a(this.dl - 10, 0, 600);
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

      bux $$15 = this.p();
      if ($$15 != null && $$15.c() == 0) {
         if (this.dd < 0) {
            this.dd++;
            if (this.dd == 0) {
               this.de = 0.0F;
            }
         }

         if ($$0 && !this.cx.g) {
            this.dd = -10;
            $$15.b(azf.d(this.q() * 100.0F));
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

      super.n_();
      if (this.aH() && $$3.b && !this.cy.r.h()) {
         $$3.b = false;
         this.A();
      }
   }

   public dnf.a B() {
      return this.at == null ? dnf.a.b : this.at.a();
   }

   @Override
   protected void ei() {
      this.aL++;
      if (this.aL == 20) {
         this.a(btr.c.a);
      }
   }

   private void y(boolean $$0) {
      this.cG = this.cF;
      float $$1 = 0.0F;
      if ($$0 && this.at != null && this.at.e()) {
         if (this.cy.z != null && !this.cy.z.k() && !(this.cy.z instanceof fpl) && !(this.cy.z instanceof fqk)) {
            if (this.cy.z instanceof fqw) {
               this.s();
            }

            this.cy.a(null);
         }

         if (this.cF == 0.0F) {
            this.cy.ak().a(hav.b(awg.uK, this.af.i() * 0.4F + 0.8F, 0.25F));
         }

         $$1 = 0.0125F;
         this.at.a(false);
      } else if (this.b(bta.i) && !this.c(bta.i).a(60)) {
         $$1 = 0.006666667F;
      } else if (this.cF > 0.0F) {
         $$1 = -0.05F;
      }

      this.cF = azf.a(this.cF + $$1, 0.0F, 1.0F);
   }

   @Override
   public void u() {
      super.u();
      this.dh = false;
      if (this.dh() instanceof cpx $$0) {
         $$0.a(this.cx.e, this.cx.f, this.cx.c, this.cx.d);
         this.dh = this.dh | (this.cx.e || this.cx.f || this.cx.c || this.cx.d);
      }
   }

   public boolean C() {
      return this.dh;
   }

   @Nullable
   @Override
   public bsy d(jo<bsw> $$0) {
      if ($$0.a(bta.i)) {
         this.cG = 0.0F;
         this.cF = 0.0F;
      }

      return super.d($$0);
   }

   @Override
   public void a(bur $$0, eyw $$1) {
      double $$2 = this.dx();
      double $$3 = this.dD();
      super.a($$0, $$1);
      float $$4 = (float)(this.dx() - $$2);
      float $$5 = (float)(this.dD() - $$3);
      this.g($$4, $$5);
      this.h = this.h + azf.f($$4, $$5) * 0.6F;
   }

   public boolean D() {
      return this.di;
   }

   @Override
   public boolean gI() {
      return this.cy.n.J().c();
   }

   protected void g(float $$0, float $$1) {
      if (this.J()) {
         eyw $$2 = this.dq();
         eyw $$3 = $$2.b((double)$$0, 0.0, (double)$$1);
         eyw $$4 = new eyw((double)$$0, 0.0, (double)$$1);
         float $$5 = this.fm();
         float $$6 = (float)$$4.h();
         if ($$6 <= 0.001F) {
            eyv $$7 = this.cx.a();
            float $$8 = $$5 * $$7.i;
            float $$9 = $$5 * $$7.j;
            float $$10 = azf.a(this.dI() * (float) (Math.PI / 180.0));
            float $$11 = azf.b(this.dI() * (float) (Math.PI / 180.0));
            $$4 = new eyw((double)($$8 * $$11 - $$9 * $$10), $$4.e, (double)($$9 * $$11 + $$8 * $$10));
            $$6 = (float)$$4.h();
            if ($$6 <= 0.001F) {
               return;
            }
         }

         float $$12 = azf.j($$6);
         eyw $$13 = $$4.c((double)$$12);
         eyw $$14 = this.bS();
         float $$15 = (float)($$14.d * $$13.d + $$14.f * $$13.f);
         if (!($$15 < -0.15F)) {
            ezb $$16 = ezb.a(this);
            jf $$17 = jf.a(this.dx(), this.cO().e, this.dD());
            dus $$18 = this.dS().a_($$17);
            if ($$18.b(this.dS(), $$17, $$16).c()) {
               $$17 = $$17.d();
               dus $$19 = this.dS().a_($$17);
               if ($$19.b(this.dS(), $$17, $$16).c()) {
                  float $$20 = 7.0F;
                  float $$21 = 1.2F;
                  if (this.b(bta.h)) {
                     $$21 += (float)(this.c(bta.h).e() + 1) * 0.75F;
                  }

                  float $$22 = Math.max($$5 * 7.0F, 1.0F / $$12);
                  eyw $$24 = $$3.e($$13.c((double)$$22));
                  float $$25 = this.dn();
                  float $$26 = this.do();
                  eyr $$27 = new eyr($$2, $$24.b(0.0, (double)$$26, 0.0)).c((double)$$25, 0.0, (double)$$25);
                  eyw $$23 = $$2.b(0.0, 0.51F, 0.0);
                  $$24 = $$24.b(0.0, 0.51F, 0.0);
                  eyw $$28 = $$13.c(new eyw(0.0, 1.0, 0.0));
                  eyw $$29 = $$28.c((double)($$25 * 0.5F));
                  eyw $$30 = $$23.d($$29);
                  eyw $$31 = $$24.d($$29);
                  eyw $$32 = $$23.e($$29);
                  eyw $$33 = $$24.e($$29);
                  Iterable<ezq> $$34 = this.dS().d(this, $$27);
                  Iterator<eyr> $$35 = StreamSupport.stream($$34.spliterator(), false).flatMap($$0x -> $$0x.e().stream()).iterator();
                  float $$36 = Float.MIN_VALUE;

                  while ($$35.hasNext()) {
                     eyr $$37 = $$35.next();
                     if ($$37.a($$30, $$31) || $$37.a($$32, $$33)) {
                        $$36 = (float)$$37.e;
                        eyw $$38 = $$37.f();
                        jf $$39 = jf.a((jy)$$38);

                        for (int $$40 = 1; (float)$$40 < $$21; $$40++) {
                           jf $$41 = $$39.b($$40);
                           dus $$42 = this.dS().a_($$41);
                           ezq $$43;
                           if (!($$43 = $$42.b(this.dS(), $$41, $$16)).c()) {
                              $$36 = (float)$$43.c(jk.a.b) + (float)$$41.v();
                              if ((double)$$36 - this.dz() > (double)$$21) {
                                 return;
                              }
                           }

                           if ($$40 > 1) {
                              $$17 = $$17.d();
                              dus $$44 = this.dS().a_($$17);
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
   protected boolean c(eyw $$0) {
      float $$1 = this.dI() * (float) (Math.PI / 180.0);
      double $$2 = (double)azf.a($$1);
      double $$3 = (double)azf.b($$1);
      double $$4 = (double)this.bk * $$3 - (double)this.bm * $$2;
      double $$5 = (double)this.bm * $$3 + (double)this.bk * $$2;
      double $$6 = azf.k($$4) + azf.k($$5);
      double $$7 = azf.k($$0.d) + azf.k($$0.f);
      if (!($$6 < 1.0E-5F) && !($$7 < 1.0E-5F)) {
         double $$8 = $$4 * $$0.d + $$5 * $$0.f;
         double $$9 = Math.acos($$8 / Math.sqrt($$6 * $$7));
         return $$9 < 0.13962634F;
      } else {
         return false;
      }
   }

   private boolean J() {
      return this.D() && this.dj <= 0 && this.aH() && !this.fV() && !this.bW() && this.K() && (double)this.aQ() >= 1.0;
   }

   private boolean K() {
      eyv $$0 = this.cx.a();
      return $$0.i != 0.0F || $$0.j != 0.0F;
   }

   private boolean M() {
      return !this.cg() && this.O() && this.P() && !this.fv() && !this.b(bta.o) && (!this.bW() || this.d(this.dg())) && !this.fF();
   }

   private boolean d(btr $$0) {
      return $$0.dL() && $$0.de();
   }

   private boolean O() {
      double $$0 = 0.8;
      return this.bn() ? this.cx.b() : (double)this.cx.b >= 0.8;
   }

   private boolean P() {
      return this.bW() || (float)this.gn().a() > 6.0F || this.ge().c;
   }

   public float E() {
      if (!this.a(axb.a)) {
         return 0.0F;
      } else {
         float $$0 = 600.0F;
         float $$1 = 100.0F;
         if ((float)this.dl >= 600.0F) {
            return 1.0F;
         } else {
            float $$2 = azf.a((float)this.dl / 100.0F, 0.0F, 1.0F);
            float $$3 = (float)this.dl < 100.0F ? 0.0F : azf.a(((float)this.dl - 100.0F) / 500.0F, 0.0F, 1.0F);
            return $$2 * 0.6F + $$3 * 0.39999998F;
         }
      }
   }

   public void a(deg $$0) {
      if ($$0 == deg.d) {
         this.h(this.dv().a(jk.a.b, 0.0));
      }
   }

   @Override
   public boolean bn() {
      return this.cl;
   }

   @Override
   protected boolean fW() {
      boolean $$0 = this.cl;
      boolean $$1 = super.fW();
      if (this.Q_()) {
         return this.cl;
      } else {
         if (!$$0 && $$1) {
            this.dS().a(this.dx(), this.dz(), this.dD(), awg.x, awh.i, 1.0F, 1.0F, false);
            this.cy.ak().a((hba)(new hbd.b(this)));
         }

         if ($$0 && !$$1) {
            this.dS().a(this.dx(), this.dz(), this.dD(), awg.y, awh.i, 1.0F, 1.0F, false);
         }

         return this.cl;
      }
   }

   @Override
   public eyw u(float $$0) {
      if (this.cy.n.aD().a()) {
         float $$1 = azf.h($$0 * 0.5F, this.dI(), this.O) * (float) (Math.PI / 180.0);
         float $$2 = azf.h($$0 * 0.5F, this.dK(), this.P) * (float) (Math.PI / 180.0);
         double $$3 = this.fu() == buh.b ? -1.0 : 1.0;
         eyw $$4 = new eyw(0.39 * $$3, -0.6, 0.3);
         return $$4.a(-$$2).b(-$$1).e(this.m($$0));
      } else {
         return super.u($$0);
      }
   }

   @Override
   public void a(cvs $$0, cvs $$1, crj $$2) {
      this.cy.aB().a($$0, $$1, $$2);
   }

   @Override
   public float dJ() {
      return this.dI();
   }

   @Override
   public void h(cvs $$0) {
      this.cy.r.a($$0);
   }
}
