import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ghd extends gha {
   public static final Logger i = LogUtils.getLogger();
   private static final int cH = 20;
   private static final int cI = 600;
   private static final int cJ = 100;
   private static final float cK = 0.6F;
   private static final double cL = 0.35;
   private static final double cM = 0.13962634F;
   public final gcj j;
   private final aww cN;
   private final fit cO;
   private final List<hbk> cP = Lists.newArrayList();
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
   public ghb k = new ghb();
   private cok dd = cok.b;
   protected final fji l;
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
   private bsc dh;
   private boolean di;
   private boolean dj = true;
   private int dk;
   private boolean dl;
   private int dm;
   private boolean dn = true;
   private boolean do = false;

   public ghd(fji $$0, gci $$1, gcj $$2, aww $$3, fit $$4, boolean $$5, boolean $$6) {
      super($$1, $$2.o());
      this.l = $$0;
      this.j = $$2;
      this.cN = $$3;
      this.cO = $$4;
      this.cZ = $$5;
      this.da = $$6;
      this.cP.add(new hcc(this, $$0.ak()));
      this.cP.add(new hbp(this));
      this.cP.add(new hbo(this, $$0.ak(), $$1.F_()));
   }

   @Override
   public boolean a(bsu $$0, float $$1) {
      return false;
   }

   @Override
   public void c(float $$0) {
   }

   @Override
   public boolean a(bue $$0, boolean $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         if ($$0 instanceof cqk) {
            this.l.ak().a((hca)(new hbu(this, (cqk)$$0, true)));
            this.l.ak().a((hca)(new hbu(this, (cqk)$$0, false)));
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
         if (!this.dd.equals(this.k.a)) {
            this.j.b(new aic(this.k.a));
            this.dd = this.k.a;
         }

         if (this.ca()) {
            this.j.b(new ahu.c(this.dN(), this.dP(), this.aK(), this.Q));
            bue $$0 = this.dh();
            if ($$0 != this && $$0.dj()) {
               this.j.b(new ahv($$0));
               this.I();
            }
         } else {
            this.F();
         }

         for (hbk $$1 : this.cP) {
            $$1.a();
         }
      }
   }

   public float c() {
      for (hbk $$0 : this.cP) {
         if ($$0 instanceof hbo) {
            return ((hbo)$$0).b();
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
         boolean $$5 = azk.f($$0, $$1, $$2) > azk.k(2.0E-4) || this.db >= 20;
         boolean $$6 = $$3 != 0.0 || $$4 != 0.0;
         if ($$5 && $$6) {
            this.j.b(new ahu.b(this.dC(), this.dE(), this.dI(), this.dN(), this.dP(), this.aK(), this.Q));
         } else if ($$5) {
            this.j.b(new ahu.a(this.dC(), this.dE(), this.dI(), this.aK(), this.Q));
         } else if ($$6) {
            this.j.b(new ahu.c(this.dN(), this.dP(), this.aK(), this.Q));
         } else if (this.cW != this.aK() || this.cX != this.Q) {
            this.j.b(new ahu.d(this.aK(), this.Q));
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

         this.cW = this.aK();
         this.cX = this.Q;
         this.dj = this.l.n.I().c();
      }
   }

   private void G() {
      boolean $$0 = this.ce();
      if ($$0 != this.cZ) {
         aib.a $$1 = $$0 ? aib.a.a : aib.a.b;
         this.j.b(new aib(this, $$1));
         this.cZ = $$0;
      }
   }

   private void I() {
      boolean $$0 = this.ck();
      if ($$0 != this.da) {
         aib.a $$1 = $$0 ? aib.a.d : aib.a.e;
         this.j.b(new aib(this, $$1));
         this.da = $$0;
      }
   }

   public boolean a(boolean $$0) {
      aia.a $$1 = $$0 ? aia.a.d : aia.a.e;
      cwb $$2 = this.gk().a($$0);
      this.j.b(new aia($$1, jh.c, jm.a));
      return !$$2.f();
   }

   @Override
   public void a(bsc $$0) {
      super.a($$0);
      this.j.b(new air($$0));
   }

   @Override
   public void gi() {
      this.j.b(new ahg(ahg.a.a));
      fjg.c();
   }

   @Override
   protected void f(bsu $$0, float $$1) {
      if (!this.b($$0)) {
         this.x(this.eG() - $$1);
      }
   }

   @Override
   public void s() {
      this.j.b(new ahm(this.cd.l));
      this.d();
   }

   public void d() {
      super.s();
      this.l.a(null);
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
            this.bm = $$1;
            this.ak = 20;
            this.x($$0);
            this.aO = 10;
            this.aN = this.aO;
         }
      } else {
         this.x($$0);
         this.dc = true;
      }
   }

   @Override
   public void A() {
      this.j.b(new ahz(this.gl()));
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
      this.j.b(new aib(this, aib.a.f, azk.d(this.q() * 100.0F)));
   }

   public void h() {
      this.j.b(new aib(this, aib.a.h));
   }

   public aww i() {
      return this.cN;
   }

   public fit j() {
      return this.cO;
   }

   public void a(dar<?> $$0) {
      if (this.cO.d($$0)) {
         this.cO.e($$0);
         this.j.b(new aie($$0));
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
   public void a(xi $$0, boolean $$1) {
      this.l.ba().a($$0, $$1);
   }

   private void c(double $$0, double $$1) {
      jh $$2 = jh.a($$0, this.dE(), $$1);
      if (this.c($$2)) {
         double $$3 = $$0 - (double)$$2.u();
         double $$4 = $$1 - (double)$$2.w();
         jm $$5 = null;
         double $$6 = Double.MAX_VALUE;
         jm[] $$7 = new jm[]{jm.e, jm.f, jm.c, jm.d};

         for (jm $$8 : $$7) {
            double $$9 = $$8.o().a($$3, 0.0, $$4);
            double $$10 = $$8.f() == jm.b.a ? 1.0 - $$9 : $$9;
            if ($$10 < $$6 && !this.c($$2.a($$8))) {
               $$6 = $$10;
               $$5 = $$8;
            }
         }

         if ($$5 != null) {
            ezn $$11 = this.dA();
            if ($$5.o() == jm.a.a) {
               this.n(0.1 * (double)$$5.j(), $$11.e, $$11.f);
            } else {
               this.n($$11.d, $$11.e, 0.1 * (double)$$5.l());
            }
         }
      }
   }

   private boolean c(jh $$0) {
      ezi $$1 = this.cS();
      ezi $$2 = new ezi((double)$$0.u(), $$1.b, (double)$$0.w(), (double)$$0.u() + 1.0, $$1.e, (double)$$0.w() + 1.0).h(1.0E-7);
      return this.dX().g(this, $$2);
   }

   public void a(float $$0, int $$1, int $$2) {
      this.cs = $$0;
      this.cr = $$1;
      this.cq = $$2;
   }

   @Override
   public void a(xi $$0) {
      this.l.m.d().a($$0);
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
   public void a(awk $$0, float $$1, float $$2) {
      this.dX().a(this.dC(), this.dE(), this.dI(), $$0, this.dn(), $$1, $$2, false);
   }

   @Override
   public void a(awk $$0, awm $$1, float $$2, float $$3) {
      this.dX().a(this.dC(), this.dE(), this.dI(), $$0, $$1, $$2, $$3, false);
   }

   @Override
   public boolean dk() {
      return true;
   }

   @Override
   public void c(bsc $$0) {
      cwb $$1 = this.b($$0);
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
   public bsc fC() {
      return Objects.requireNonNullElse(this.dh, bsc.a);
   }

   @Override
   public void a(akl<?> $$0) {
      super.a($$0);
      if (aD.equals($$0)) {
         boolean $$1 = (this.am.a(aD) & 1) > 0;
         bsc $$2 = (this.am.a(aD) & 2) > 0 ? bsc.b : bsc.a;
         if ($$1 && !this.dg) {
            this.c($$2);
         } else if (!$$1 && this.dg) {
            this.fH();
         }
      }

      if (an.equals($$0) && this.fL() && !this.dl) {
         this.l.ak().a((hca)(new hbq(this)));
      }
   }

   @Nullable
   public bvk p() {
      if (this.dm() instanceof bvk $$0 && $$0.a()) {
         return $$0;
      }

      return null;
   }

   public float q() {
      return this.df;
   }

   @Override
   public boolean ab() {
      return this.l.aU();
   }

   @Override
   public void a(dty $$0, boolean $$1) {
      if ($$0 instanceof dtl $$2) {
         this.l.a(new fsm($$2, $$1, this.l.aU()));
      } else {
         this.l.a(new fsz($$0, $$1, this.l.aU()));
      }
   }

   @Override
   public void a(deb $$0) {
      this.l.a(new fsw($$0));
   }

   @Override
   public void a(dsw $$0) {
      this.l.a(new frz($$0));
   }

   @Override
   public void a(dud $$0) {
      this.l.a(new ftd($$0));
   }

   @Override
   public void a(dto $$0) {
      this.l.a(new fsr($$0));
   }

   @Override
   public void a(cwb $$0, bsc $$1) {
      czi $$2 = $$0.a(ku.S);
      if ($$2 != null) {
         this.l.a(new frv(this, $$0, $$1, $$2));
      }
   }

   @Override
   public void b(bue $$0) {
      this.l.g.a($$0, lr.f);
   }

   @Override
   public void c(bue $$0) {
      this.l.g.a($$0, lr.r);
   }

   @Override
   public boolean ce() {
      return this.k.a.f();
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
         this.bo = this.k.b;
         this.bq = this.k.c;
         this.bn = this.k.a.e();
         this.cD = this.cB;
         this.cE = this.cC;
         this.cC = this.cC + (this.dP() - this.cC) * 0.5F;
         this.cB = this.cB + (this.dN() - this.cB) * 0.5F;
      }
   }

   protected boolean x() {
      return this.l.ao() == this;
   }

   public void y() {
      this.b(bvm.a);
      if (this.dX() != null) {
         for (double $$0 = this.dE(); $$0 > (double)this.dX().I_() && $$0 <= (double)this.dX().al(); $$0++) {
            this.a_(this.dC(), $$0, this.dI());
            if (this.dX().g(this)) {
               break;
            }
         }

         this.h(ezn.c);
         this.w(0.0F);
      }

      this.x(this.eV());
      this.aP = 0;
   }

   @Override
   public void n_() {
      if (this.cA > 0) {
         this.cA--;
      }

      if (!(this.l.z instanceof fqy)) {
         this.y(this.B() == dnw.a.a);
         this.N();
      }

      boolean $$0 = this.k.a.e();
      boolean $$1 = this.k.a.f();
      boolean $$2 = this.O();
      coi $$3 = this.gl();
      this.cY = !$$3.b && !this.cl() && !this.ca() && this.h(bvm.f) && (this.ce() || !this.fT() && !this.h(bvm.a));
      float $$4 = (float)this.h(bwi.z);
      this.k.a(this.w(), $$4);
      this.l.aB().a(this.k);
      if (this.fB() && !this.ca()) {
         this.k.b *= 0.2F;
         this.k.c *= 0.2F;
         this.cA = 0;
      }

      boolean $$5 = false;
      if (this.dk > 0) {
         this.dk--;
         $$5 = true;
         this.k.c();
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
      boolean $$7 = this.ca() ? this.dl().aK() : this.aK();
      boolean $$8 = !$$1 && !$$2;
      if (($$7 || this.bp()) && $$8 && $$6) {
         if (this.cA <= 0 && !this.l.n.B.e()) {
            this.cA = 7;
         } else {
            this.h(true);
         }
      }

      if ((!this.bk() || this.bp()) && $$6 && this.l.n.B.e()) {
         this.h(true);
      }

      if (this.ck()) {
         boolean $$9 = !this.k.b() || !this.P();
         boolean $$10 = $$9 || this.Q && !this.T || this.bk() && !this.bp();
         if (this.cl()) {
            if (!this.aK() && !this.k.a.f() && $$9 || !this.bk()) {
               this.h(false);
            }
         } else if ($$10) {
            this.h(false);
         }
      }

      boolean $$11 = false;
      if ($$3.c) {
         if (this.l.r.h()) {
            if (!$$3.b) {
               $$3.b = true;
               $$11 = true;
               this.A();
            }
         } else if (!$$0 && this.k.a.e() && !$$5) {
            if (this.cf == 0) {
               this.cf = 7;
            } else if (!this.cl()) {
               $$3.b = !$$3.b;
               if ($$3.b && this.aK()) {
                  this.v();
               }

               $$11 = true;
               this.A();
               this.cf = 0;
            }
         }
      }

      if (this.k.a.e() && !$$11 && !$$0 && !this.q_() && this.gp()) {
         this.j.b(new aib(this, aib.a.i));
      }

      this.dl = this.fL();
      if (this.bk() && this.k.a.f() && this.em()) {
         this.fn();
      }

      if (this.a(axg.a)) {
         int $$12 = this.R_() ? 10 : 1;
         this.dm = azk.a(this.dm + $$12, 0, 600);
      } else if (this.dm > 0) {
         this.a(axg.a);
         this.dm = azk.a(this.dm - 10, 0, 600);
      }

      if ($$3.b && this.x()) {
         int $$13 = 0;
         if (this.k.a.f()) {
            $$13--;
         }

         if (this.k.a.e()) {
            $$13++;
         }

         if ($$13 != 0) {
            this.h(this.dA().b(0.0, (double)((float)$$13 * $$3.a() * 3.0F), 0.0));
         }
      }

      bvk $$14 = this.p();
      if ($$14 != null && $$14.c() == 0) {
         if (this.de < 0) {
            this.de++;
            if (this.de == 0) {
               this.df = 0.0F;
            }
         }

         if ($$0 && !this.k.a.e()) {
            this.de = -10;
            $$14.b(azk.d(this.q() * 100.0F));
            this.e();
         } else if (!$$0 && this.k.a.e()) {
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
      if (this.aK() && $$3.b && !this.l.r.h()) {
         $$3.b = false;
         this.A();
      }
   }

   public dnw.a B() {
      return this.at == null ? dnw.a.b : this.at.a();
   }

   @Override
   protected void en() {
      this.aP++;
      if (this.aP == 20) {
         this.a(bue.c.a);
      }
   }

   private void y(boolean $$0) {
      this.cG = this.cF;
      float $$1 = 0.0F;
      if ($$0 && this.at != null && this.at.e()) {
         if (this.l.z != null && !this.l.z.k() && !(this.l.z instanceof fqe) && !(this.l.z instanceof frd)) {
            if (this.l.z instanceof frp) {
               this.s();
            }

            this.l.a(null);
         }

         if (this.cF == 0.0F) {
            this.l.ak().a(hbv.b(awl.uI, this.af.i() * 0.4F + 0.8F, 0.25F));
         }

         $$1 = 0.0125F;
         this.at.a(false);
      } else if (this.b(btl.i) && !this.c(btl.i).a(60)) {
         $$1 = 0.006666667F;
      } else if (this.cF > 0.0F) {
         $$1 = -0.05F;
      }

      this.cF = azk.a(this.cF + $$1, 0.0F, 1.0F);
   }

   @Override
   public void u() {
      super.u();
      this.di = false;
      if (this.dm() instanceof cqm $$0) {
         $$0.a(this.k.a.c(), this.k.a.d(), this.k.a.a(), this.k.a.b());
         this.di = this.di | (this.k.a.c() || this.k.a.d() || this.k.a.a() || this.k.a.b());
      }
   }

   public boolean C() {
      return this.di;
   }

   @Nullable
   @Override
   public btj d(jq<bth> $$0) {
      if ($$0.a(btl.i)) {
         this.cG = 0.0F;
         this.cF = 0.0F;
      }

      return super.d($$0);
   }

   @Override
   public void a(bve $$0, ezn $$1) {
      double $$2 = this.dC();
      double $$3 = this.dI();
      super.a($$0, $$1);
      float $$4 = (float)(this.dC() - $$2);
      float $$5 = (float)(this.dI() - $$3);
      this.g($$4, $$5);
      this.h = this.h + azk.f($$4, $$5) * 0.6F;
   }

   public boolean D() {
      return this.dj;
   }

   @Override
   public boolean gP() {
      return this.l.n.J().c();
   }

   protected void g(float $$0, float $$1) {
      if (this.J()) {
         ezn $$2 = this.dv();
         ezn $$3 = $$2.b((double)$$0, 0.0, (double)$$1);
         ezn $$4 = new ezn((double)$$0, 0.0, (double)$$1);
         float $$5 = this.fr();
         float $$6 = (float)$$4.h();
         if ($$6 <= 0.001F) {
            ezm $$7 = this.k.a();
            float $$8 = $$5 * $$7.i;
            float $$9 = $$5 * $$7.j;
            float $$10 = azk.a(this.dN() * (float) (Math.PI / 180.0));
            float $$11 = azk.b(this.dN() * (float) (Math.PI / 180.0));
            $$4 = new ezn((double)($$8 * $$11 - $$9 * $$10), $$4.e, (double)($$9 * $$11 + $$8 * $$10));
            $$6 = (float)$$4.h();
            if ($$6 <= 0.001F) {
               return;
            }
         }

         float $$12 = azk.j($$6);
         ezn $$13 = $$4.c((double)$$12);
         ezn $$14 = this.bW();
         float $$15 = (float)($$14.d * $$13.d + $$14.f * $$13.f);
         if (!($$15 < -0.15F)) {
            ezs $$16 = ezs.a(this);
            jh $$17 = jh.a(this.dC(), this.cS().e, this.dI());
            dvj $$18 = this.dX().a_($$17);
            if ($$18.b(this.dX(), $$17, $$16).c()) {
               $$17 = $$17.d();
               dvj $$19 = this.dX().a_($$17);
               if ($$19.b(this.dX(), $$17, $$16).c()) {
                  float $$20 = 7.0F;
                  float $$21 = 1.2F;
                  if (this.b(btl.h)) {
                     $$21 += (float)(this.c(btl.h).e() + 1) * 0.75F;
                  }

                  float $$22 = Math.max($$5 * 7.0F, 1.0F / $$12);
                  ezn $$24 = $$3.e($$13.c((double)$$22));
                  float $$25 = this.ds();
                  float $$26 = this.dt();
                  ezi $$27 = new ezi($$2, $$24.b(0.0, (double)$$26, 0.0)).c((double)$$25, 0.0, (double)$$25);
                  ezn $$23 = $$2.b(0.0, 0.51F, 0.0);
                  $$24 = $$24.b(0.0, 0.51F, 0.0);
                  ezn $$28 = $$13.c(new ezn(0.0, 1.0, 0.0));
                  ezn $$29 = $$28.c((double)($$25 * 0.5F));
                  ezn $$30 = $$23.d($$29);
                  ezn $$31 = $$24.d($$29);
                  ezn $$32 = $$23.e($$29);
                  ezn $$33 = $$24.e($$29);
                  Iterable<fah> $$34 = this.dX().d(this, $$27);
                  Iterator<ezi> $$35 = StreamSupport.stream($$34.spliterator(), false).flatMap($$0x -> $$0x.e().stream()).iterator();
                  float $$36 = Float.MIN_VALUE;

                  while ($$35.hasNext()) {
                     ezi $$37 = $$35.next();
                     if ($$37.a($$30, $$31) || $$37.a($$32, $$33)) {
                        $$36 = (float)$$37.e;
                        ezn $$38 = $$37.f();
                        jh $$39 = jh.a((ka)$$38);

                        for (int $$40 = 1; (float)$$40 < $$21; $$40++) {
                           jh $$41 = $$39.b($$40);
                           dvj $$42 = this.dX().a_($$41);
                           fah $$43;
                           if (!($$43 = $$42.b(this.dX(), $$41, $$16)).c()) {
                              $$36 = (float)$$43.c(jm.a.b) + (float)$$41.v();
                              if ((double)$$36 - this.dE() > (double)$$21) {
                                 return;
                              }
                           }

                           if ($$40 > 1) {
                              $$17 = $$17.d();
                              dvj $$44 = this.dX().a_($$17);
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
   protected boolean c(ezn $$0) {
      float $$1 = this.dN() * (float) (Math.PI / 180.0);
      double $$2 = (double)azk.a($$1);
      double $$3 = (double)azk.b($$1);
      double $$4 = (double)this.bo * $$3 - (double)this.bq * $$2;
      double $$5 = (double)this.bq * $$3 + (double)this.bo * $$2;
      double $$6 = azk.k($$4) + azk.k($$5);
      double $$7 = azk.k($$0.d) + azk.k($$0.f);
      if (!($$6 < 1.0E-5F) && !($$7 < 1.0E-5F)) {
         double $$8 = $$4 * $$0.d + $$5 * $$0.f;
         double $$9 = Math.acos($$8 / Math.sqrt($$6 * $$7));
         return $$9 < 0.13962634F;
      } else {
         return false;
      }
   }

   private boolean J() {
      return this.D() && this.dk <= 0 && this.aK() && !this.gc() && !this.ca() && this.K() && (double)this.aT() >= 1.0;
   }

   private boolean K() {
      ezm $$0 = this.k.a();
      return $$0.i != 0.0F || $$0.j != 0.0F;
   }

   private boolean M() {
      return !this.ck() && this.O() && this.P() && !this.fB() && !this.b(btl.o) && (!this.ca() || this.d(this.dl())) && !this.fL();
   }

   private boolean d(bue $$0) {
      return $$0.dQ() && $$0.dj();
   }

   private boolean O() {
      double $$0 = 0.8;
      return this.bp() ? this.k.b() : (double)this.k.c >= 0.8;
   }

   private boolean P() {
      return this.ca() || (float)this.gu().a() > 6.0F || this.gl().c;
   }

   public float E() {
      if (!this.a(axg.a)) {
         return 0.0F;
      } else {
         float $$0 = 600.0F;
         float $$1 = 100.0F;
         if ((float)this.dm >= 600.0F) {
            return 1.0F;
         } else {
            float $$2 = azk.a((float)this.dm / 100.0F, 0.0F, 1.0F);
            float $$3 = (float)this.dm < 100.0F ? 0.0F : azk.a(((float)this.dm - 100.0F) / 500.0F, 0.0F, 1.0F);
            return $$2 * 0.6F + $$3 * 0.39999998F;
         }
      }
   }

   public void a(dey $$0) {
      if ($$0 == dey.d) {
         this.h(this.dA().a(jm.a.b, 0.0));
      }
   }

   @Override
   public boolean bp() {
      return this.cp;
   }

   @Override
   protected boolean gd() {
      boolean $$0 = this.cp;
      boolean $$1 = super.gd();
      if (this.R_()) {
         return this.cp;
      } else {
         if (!$$0 && $$1) {
            this.dX().a(this.dC(), this.dE(), this.dI(), awl.x, awm.i, 1.0F, 1.0F, false);
            this.l.ak().a((hca)(new hcd.b(this)));
         }

         if ($$0 && !$$1) {
            this.dX().a(this.dC(), this.dE(), this.dI(), awl.y, awm.i, 1.0F, 1.0F, false);
         }

         return this.cp;
      }
   }

   @Override
   public ezn u(float $$0) {
      if (this.l.n.aD().a()) {
         float $$1 = azk.h($$0 * 0.5F, this.dN(), this.O) * (float) (Math.PI / 180.0);
         float $$2 = azk.h($$0 * 0.5F, this.dP(), this.P) * (float) (Math.PI / 180.0);
         double $$3 = this.fA() == buu.b ? -1.0 : 1.0;
         ezn $$4 = new ezn(0.39 * $$3, -0.6, 0.3);
         return $$4.a(-$$2).b(-$$1).e(this.m($$0));
      } else {
         return super.u($$0);
      }
   }

   @Override
   public void a(cwb $$0, cwb $$1, cry $$2) {
      this.l.aB().a($$0, $$1, $$2);
   }

   @Override
   public float dO() {
      return this.dN();
   }

   @Override
   public void g(cwb $$0) {
      this.l.r.a($$0);
   }
}
