import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gaq extends gan {
   public static final Logger g = LogUtils.getLogger();
   private static final int cJ = 20;
   private static final int cK = 600;
   private static final int cL = 100;
   private static final float cM = 0.6F;
   private static final double cN = 0.35;
   private static final double cO = 0.13962634F;
   private static final float cP = 0.3F;
   public final fvx h;
   private final avn cQ;
   private final fcr cR;
   private final List<gpw> cS = Lists.newArrayList();
   private int cT = 0;
   private double cU;
   private double cV;
   private double cW;
   private float cX;
   private float cY;
   private boolean cZ;
   private boolean da;
   private boolean db;
   private boolean dc;
   private int dd;
   private boolean de;
   public gao cA;
   protected final fde cB;
   protected int cC;
   public float cD;
   public float cE;
   public float cF;
   public float cG;
   private int df;
   private float dg;
   public float cH;
   public float cI;
   private boolean dh;
   @Nullable
   private bpl di;
   private boolean dj;
   private boolean dk = true;
   private int dl;
   private boolean dm;
   private int dn;
   private boolean do = true;
   private boolean dp = false;

   public gaq(fde $$0, fvw $$1, fvx $$2, avn $$3, fcr $$4, boolean $$5, boolean $$6) {
      super($$1, $$2.p());
      this.cB = $$0;
      this.h = $$2;
      this.cQ = $$3;
      this.cR = $$4;
      this.db = $$5;
      this.dc = $$6;
      this.cS.add(new gqo(this, $$0.ak()));
      this.cS.add(new gqb(this));
      this.cS.add(new gqa(this, $$0.ak(), $$1.F_()));
   }

   @Override
   public boolean a(bqf $$0, float $$1) {
      return false;
   }

   @Override
   public void c(float $$0) {
   }

   @Override
   public boolean a(brh $$0, boolean $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         if ($$0 instanceof cnc) {
            this.cB.ak().a((gqm)(new gqg(this, (cnc)$$0, true)));
            this.cB.ak().a((gqm)(new gqg(this, (cnc)$$0, false)));
         }

         return true;
      }
   }

   @Override
   public void bG() {
      super.bG();
      this.dj = false;
   }

   @Override
   public float g(float $$0) {
      return this.dF();
   }

   @Override
   public float h(float $$0) {
      return this.bP() ? super.h($$0) : this.dD();
   }

   @Override
   public void l() {
      if (this.dN().f(this.dr(), this.dx())) {
         super.l();
         if (this.bP()) {
            this.h.b(new agw.c(this.dD(), this.dF(), this.aC()));
            this.h.b(new ahe(this.bp, this.br, this.cA.g, this.cA.h));
            brh $$0 = this.cX();
            if ($$0 != this && $$0.cY()) {
               this.h.b(new agx($$0));
               this.G();
            }
         } else {
            this.E();
         }

         for (gpw $$1 : this.cS) {
            $$1.a();
         }
      }
   }

   public float d() {
      for (gpw $$0 : this.cS) {
         if ($$0 instanceof gqa) {
            return ((gqa)$$0).b();
         }
      }

      return 0.0F;
   }

   private void E() {
      this.G();
      boolean $$0 = this.bT();
      if ($$0 != this.db) {
         ahd.a $$1 = $$0 ? ahd.a.a : ahd.a.b;
         this.h.b(new ahd(this, $$1));
         this.db = $$0;
      }

      if (this.z()) {
         double $$2 = this.ds() - this.cU;
         double $$3 = this.du() - this.cV;
         double $$4 = this.dy() - this.cW;
         double $$5 = (double)(this.dD() - this.cX);
         double $$6 = (double)(this.dF() - this.cY);
         this.dd++;
         boolean $$7 = axz.f($$2, $$3, $$4) > axz.k(2.0E-4) || this.dd >= 20;
         boolean $$8 = $$5 != 0.0 || $$6 != 0.0;
         if (this.bP()) {
            etp $$9 = this.dq();
            this.h.b(new agw.b($$9.c, -999.0, $$9.e, this.dD(), this.dF(), this.aC()));
            $$7 = false;
         } else if ($$7 && $$8) {
            this.h.b(new agw.b(this.ds(), this.du(), this.dy(), this.dD(), this.dF(), this.aC()));
         } else if ($$7) {
            this.h.b(new agw.a(this.ds(), this.du(), this.dy(), this.aC()));
         } else if ($$8) {
            this.h.b(new agw.c(this.dD(), this.dF(), this.aC()));
         } else if (this.cZ != this.aC()) {
            this.h.b(new agw.d(this.aC()));
         }

         if ($$7) {
            this.cU = this.ds();
            this.cV = this.du();
            this.cW = this.dy();
            this.dd = 0;
         }

         if ($$8) {
            this.cX = this.dD();
            this.cY = this.dF();
         }

         this.cZ = this.aC();
         this.dk = this.cB.m.H().c();
      }
   }

   private void G() {
      boolean $$0 = this.bZ();
      if ($$0 != this.dc) {
         ahd.a $$1 = $$0 ? ahd.a.d : ahd.a.e;
         this.h.b(new ahd(this, $$1));
         this.dc = $$0;
      }
   }

   public boolean a(boolean $$0) {
      ahc.a $$1 = $$0 ? ahc.a.d : ahc.a.e;
      csz $$2 = this.ga().a($$0);
      this.h.b(new ahc($$1, in.c, is.a));
      return !$$2.d();
   }

   @Override
   public void a(bpl $$0) {
      super.a($$0);
      this.h.b(new ahs($$0));
   }

   @Override
   public void fY() {
      this.h.b(new agj(agj.a.a));
      fdc.c();
   }

   @Override
   protected void f(bqf $$0, float $$1) {
      if (!this.b($$0)) {
         this.t(this.ey() - $$1);
      }
   }

   @Override
   public void r() {
      this.h.b(new ago(this.cc.j));
      this.e();
   }

   public void e() {
      super.r();
      this.cB.a(null);
   }

   public void F(float $$0) {
      if (this.de) {
         float $$1 = this.ey() - $$0;
         if ($$1 <= 0.0F) {
            this.t($$0);
            if ($$1 < 0.0F) {
               this.am = 10;
            }
         } else {
            this.bn = $$1;
            this.am = 20;
            this.t($$0);
            this.aQ = 10;
            this.aP = this.aQ;
         }
      } else {
         this.t($$0);
         this.de = true;
      }
   }

   @Override
   public void y() {
      this.h.b(new ahb(this.gb()));
   }

   @Override
   public boolean g() {
      return true;
   }

   @Override
   public boolean fB() {
      return !this.gb().b && super.fB();
   }

   @Override
   public boolean bo() {
      return !this.gb().b && super.bo();
   }

   @Override
   public boolean dU() {
      return !this.gb().b && super.dU();
   }

   protected void h() {
      this.h.b(new ahd(this, ahd.a.f, axz.d(this.v() * 100.0F)));
   }

   public void i() {
      this.h.b(new ahd(this, ahd.a.h));
   }

   public avn j() {
      return this.cQ;
   }

   public fcr m() {
      return this.cR;
   }

   public void a(cxf<?> $$0) {
      if (this.cR.d($$0)) {
         this.cR.e($$0);
         this.h.b(new ahg($$0));
      }
   }

   @Override
   protected int F() {
      return this.cT;
   }

   public void a(int $$0) {
      this.cT = $$0;
   }

   @Override
   public void a(wu $$0, boolean $$1) {
      this.cB.ba().a($$0, $$1);
   }

   private void c(double $$0, double $$1) {
      in $$2 = in.a($$0, this.du(), $$1);
      if (this.i($$2)) {
         double $$3 = $$0 - (double)$$2.u();
         double $$4 = $$1 - (double)$$2.w();
         is $$5 = null;
         double $$6 = Double.MAX_VALUE;
         is[] $$7 = new is[]{is.e, is.f, is.c, is.d};

         for (is $$8 : $$7) {
            double $$9 = $$8.o().a($$3, 0.0, $$4);
            double $$10 = $$8.f() == is.b.a ? 1.0 - $$9 : $$9;
            if ($$10 < $$6 && !this.i($$2.a($$8))) {
               $$6 = $$10;
               $$5 = $$8;
            }
         }

         if ($$5 != null) {
            etp $$11 = this.dq();
            if ($$5.o() == is.a.a) {
               this.o(0.1 * (double)$$5.j(), $$11.d, $$11.e);
            } else {
               this.o($$11.c, $$11.d, 0.1 * (double)$$5.l());
            }
         }
      }
   }

   private boolean i(in $$0) {
      etk $$1 = this.cI();
      etk $$2 = new etk((double)$$0.u(), $$1.b, (double)$$0.w(), (double)$$0.u() + 1.0, $$1.e, (double)$$0.w() + 1.0).h(1.0E-7);
      return this.dN().f(this, $$2);
   }

   public void a(float $$0, int $$1, int $$2) {
      this.cr = $$0;
      this.cq = $$1;
      this.cp = $$2;
   }

   @Override
   public void a(wu $$0) {
      this.cB.l.d().a($$0);
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
      this.do = $$0;
   }

   public boolean o() {
      return this.do;
   }

   public void v(boolean $$0) {
      this.dp = $$0;
   }

   public boolean p() {
      return this.dp;
   }

   @Override
   public void a(avb $$0, float $$1, float $$2) {
      this.dN().a(this.ds(), this.du(), this.dy(), $$0, this.dc(), $$1, $$2, false);
   }

   @Override
   public void a(avb $$0, avd $$1, float $$2, float $$3) {
      this.dN().a(this.ds(), this.du(), this.dy(), $$0, $$1, $$2, $$3, false);
   }

   @Override
   public boolean cZ() {
      return true;
   }

   @Override
   public void c(bpl $$0) {
      csz $$1 = this.b($$0);
      if (!$$1.d() && !this.ft()) {
         super.c($$0);
         this.dh = true;
         this.di = $$0;
      }
   }

   @Override
   public boolean ft() {
      return this.dh;
   }

   @Override
   public void fz() {
      super.fz();
      this.dh = false;
   }

   @Override
   public bpl fu() {
      return Objects.requireNonNullElse(this.di, bpl.a);
   }

   @Override
   public void a(ajm<?> $$0) {
      super.a($$0);
      if (aG.equals($$0)) {
         boolean $$1 = (this.ao.a(aG) & 1) > 0;
         bpl $$2 = (this.ao.a(aG) & 2) > 0 ? bpl.b : bpl.a;
         if ($$1 && !this.dh) {
            this.c($$2);
         } else if (!$$1 && this.dh) {
            this.fz();
         }
      }

      if (ap.equals($$0) && this.fC() && !this.dm) {
         this.cB.ak().a((gqm)(new gqc(this)));
      }
   }

   @Nullable
   public bsk u() {
      if (this.db() instanceof bsk $$0 && $$0.a()) {
         return $$0;
      }

      return null;
   }

   public float v() {
      return this.dg;
   }

   @Override
   public boolean Y() {
      return this.cB.aT();
   }

   @Override
   public void a(dow $$0, boolean $$1) {
      if ($$0 instanceof doj $$2) {
         this.cB.a(new fmy($$2, $$1, this.cB.aT()));
      } else {
         this.cB.a(new fnl($$0, $$1, this.cB.aT()));
      }
   }

   @Override
   public void a(cze $$0) {
      this.cB.a(new fni($$0));
   }

   @Override
   public void a(dnw $$0) {
      this.cB.a(new fml($$0));
   }

   @Override
   public void a(dpb $$0) {
      this.cB.a(new fnp($$0));
   }

   @Override
   public void a(dom $$0) {
      this.cB.a(new fnd($$0));
   }

   @Override
   public void a(csz $$0, bpl $$1) {
      if ($$0.a(ctc.tZ)) {
         this.cB.a(new fmh(this, $$0, $$1));
      }
   }

   @Override
   public void b(brh $$0) {
      this.cB.g.a($$0, kx.f);
   }

   @Override
   public void c(brh $$0) {
      this.cB.g.a($$0, kx.r);
   }

   @Override
   public boolean bT() {
      return this.cA != null && this.cA.h;
   }

   @Override
   public boolean bY() {
      return this.da;
   }

   @Override
   public boolean w() {
      return this.bY() || this.cc();
   }

   @Override
   public void fo() {
      super.fo();
      if (this.z()) {
         this.bp = this.cA.a;
         this.br = this.cA.b;
         this.bo = this.cA.g;
         this.cF = this.cD;
         this.cG = this.cE;
         this.cE = this.cE + (this.dF() - this.cE) * 0.5F;
         this.cD = this.cD + (this.dD() - this.cD) * 0.5F;
      }
   }

   @Override
   protected boolean z() {
      return this.cB.ao() == this;
   }

   public void A() {
      this.b(bsl.a);
      if (this.dN() != null) {
         for (double $$0 = this.du(); $$0 > (double)this.dN().I_() && $$0 < (double)this.dN().al(); $$0++) {
            this.a_(this.ds(), $$0, this.dy());
            if (this.dN().g(this)) {
               break;
            }
         }

         this.g(etp.b);
         this.s(0.0F);
      }

      this.t(this.eP());
      this.aR = 0;
   }

   @Override
   public void n_() {
      if (this.cC > 0) {
         this.cC--;
      }

      if (!(this.cB.y instanceof flb)) {
         this.H();
      }

      boolean $$0 = this.cA.g;
      boolean $$1 = this.cA.h;
      boolean $$2 = this.N();
      this.da = !this.gb().b && !this.ca() && !this.bP() && this.h(bsl.f) && (this.bT() || !this.fJ() && !this.h(bsl.a));
      float $$3 = axz.a(0.3F + cyh.b(this), 0.0F, 1.0F);
      this.cA.a(this.w(), $$3);
      this.cB.aB().a(this.cA);
      if (this.ft() && !this.bP()) {
         this.cA.a *= 0.2F;
         this.cA.b *= 0.2F;
         this.cC = 0;
      }

      boolean $$4 = false;
      if (this.dl > 0) {
         this.dl--;
         $$4 = true;
         this.cA.g = true;
      }

      if (!this.ag) {
         this.c(this.ds() - (double)this.dh() * 0.35, this.dy() + (double)this.dh() * 0.35);
         this.c(this.ds() - (double)this.dh() * 0.35, this.dy() - (double)this.dh() * 0.35);
         this.c(this.ds() + (double)this.dh() * 0.35, this.dy() - (double)this.dh() * 0.35);
         this.c(this.ds() + (double)this.dh() * 0.35, this.dy() + (double)this.dh() * 0.35);
      }

      if ($$1) {
         this.cC = 0;
      }

      boolean $$5 = this.M();
      boolean $$6 = this.bP() ? this.da().aC() : this.aC();
      boolean $$7 = !$$1 && !$$2;
      if (($$6 || this.bh()) && $$7 && $$5) {
         if (this.cC <= 0 && !this.cB.m.D.e()) {
            this.cC = 7;
         } else {
            this.h(true);
         }
      }

      if ((!this.bc() || this.bh()) && $$5 && this.cB.m.D.e()) {
         this.h(true);
      }

      if (this.bZ()) {
         boolean $$8 = !this.cA.b() || !this.O();
         boolean $$9 = $$8 || this.Q && !this.T || this.bc() && !this.bh();
         if (this.ca()) {
            if (!this.aC() && !this.cA.h && $$8 || !this.bc()) {
               this.h(false);
            }
         } else if ($$9) {
            this.h(false);
         }
      }

      boolean $$10 = false;
      if (this.gb().c) {
         if (this.cB.q.h()) {
            if (!this.gb().b) {
               this.gb().b = true;
               $$10 = true;
               this.y();
            }
         } else if (!$$0 && this.cA.g && !$$4) {
            if (this.ce == 0) {
               this.ce = 7;
            } else if (!this.ca()) {
               this.gb().b = !this.gb().b;
               $$10 = true;
               this.y();
               this.ce = 0;
            }
         }
      }

      if (this.cA.g && !$$10 && !$$0 && !this.gb().b && !this.bP() && !this.q_()) {
         csz $$11 = this.d(bro.e);
         if ($$11.a(ctc.nT) && crv.j($$11) && this.gf()) {
            this.h.b(new ahd(this, ahd.a.i));
         }
      }

      this.dm = this.fC();
      if (this.bc() && this.cA.h && this.ed()) {
         this.fi();
      }

      if (this.a(avw.a)) {
         int $$12 = this.N_() ? 10 : 1;
         this.dn = axz.a(this.dn + $$12, 0, 600);
      } else if (this.dn > 0) {
         this.a(avw.a);
         this.dn = axz.a(this.dn - 10, 0, 600);
      }

      if (this.gb().b && this.z()) {
         int $$13 = 0;
         if (this.cA.h) {
            $$13--;
         }

         if (this.cA.g) {
            $$13++;
         }

         if ($$13 != 0) {
            this.g(this.dq().b(0.0, (double)((float)$$13 * this.gb().a() * 3.0F), 0.0));
         }
      }

      bsk $$14 = this.u();
      if ($$14 != null && $$14.c() == 0) {
         if (this.df < 0) {
            this.df++;
            if (this.df == 0) {
               this.dg = 0.0F;
            }
         }

         if ($$0 && !this.cA.g) {
            this.df = -10;
            $$14.b(axz.d(this.v() * 100.0F));
            this.h();
         } else if (!$$0 && this.cA.g) {
            this.df = 0;
            this.dg = 0.0F;
         } else if ($$0) {
            this.df++;
            if (this.df < 10) {
               this.dg = (float)this.df * 0.1F;
            } else {
               this.dg = 0.8F + 2.0F / (float)(this.df - 9) * 0.1F;
            }
         }
      } else {
         this.dg = 0.0F;
      }

      super.n_();
      if (this.aC() && this.gb().b && !this.cB.q.h()) {
         this.gb().b = false;
         this.y();
      }
   }

   @Override
   protected void ee() {
      this.aR++;
      if (this.aR == 20) {
         this.a(brh.c.a);
      }
   }

   private void H() {
      this.cI = this.cH;
      float $$0 = 0.0F;
      if (this.aw) {
         if (this.cB.y != null && !this.cB.y.k() && !(this.cB.y instanceof fkb)) {
            if (this.cB.y instanceof fmb) {
               this.r();
            }

            this.cB.a(null);
         }

         if (this.cH == 0.0F) {
            this.cB.ak().a(gqh.b(avc.uv, this.ah.i() * 0.4F + 0.8F, 0.25F));
         }

         $$0 = 0.0125F;
         this.aw = false;
      } else if (this.b(bqv.i) && !this.c(bqv.i).a(60)) {
         $$0 = 0.006666667F;
      } else if (this.cH > 0.0F) {
         $$0 = -0.05F;
      }

      this.cH = axz.a(this.cH + $$0, 0.0F, 1.0F);
      this.L();
   }

   @Override
   public void t() {
      super.t();
      this.dj = false;
      if (this.db() instanceof cne $$0) {
         $$0.a(this.cA.e, this.cA.f, this.cA.c, this.cA.d);
         this.dj = this.dj | (this.cA.e || this.cA.f || this.cA.c || this.cA.d);
      }
   }

   public boolean B() {
      return this.dj;
   }

   @Nullable
   @Override
   public bqt d(iw<bqr> $$0) {
      if ($$0.a(bqv.i)) {
         this.cI = 0.0F;
         this.cH = 0.0F;
      }

      return super.d($$0);
   }

   @Override
   public void a(bsf $$0, etp $$1) {
      double $$2 = this.ds();
      double $$3 = this.dy();
      super.a($$0, $$1);
      this.f((float)(this.ds() - $$2), (float)(this.dy() - $$3));
   }

   public boolean C() {
      return this.dk;
   }

   protected void f(float $$0, float $$1) {
      if (this.I()) {
         etp $$2 = this.dl();
         etp $$3 = $$2.b((double)$$0, 0.0, (double)$$1);
         etp $$4 = new etp((double)$$0, 0.0, (double)$$1);
         float $$5 = this.fl();
         float $$6 = (float)$$4.g();
         if ($$6 <= 0.001F) {
            eto $$7 = this.cA.a();
            float $$8 = $$5 * $$7.i;
            float $$9 = $$5 * $$7.j;
            float $$10 = axz.a(this.dD() * (float) (Math.PI / 180.0));
            float $$11 = axz.b(this.dD() * (float) (Math.PI / 180.0));
            $$4 = new etp((double)($$8 * $$11 - $$9 * $$10), $$4.d, (double)($$9 * $$11 + $$8 * $$10));
            $$6 = (float)$$4.g();
            if ($$6 <= 0.001F) {
               return;
            }
         }

         float $$12 = axz.i($$6);
         etp $$13 = $$4.a((double)$$12);
         etp $$14 = this.bL();
         float $$15 = (float)($$14.c * $$13.c + $$14.e * $$13.e);
         if (!($$15 < -0.15F)) {
            etu $$16 = etu.a(this);
            in $$17 = in.a(this.ds(), this.cI().e, this.dy());
            dqh $$18 = this.dN().a_($$17);
            if ($$18.b(this.dN(), $$17, $$16).c()) {
               $$17 = $$17.c();
               dqh $$19 = this.dN().a_($$17);
               if ($$19.b(this.dN(), $$17, $$16).c()) {
                  float $$20 = 7.0F;
                  float $$21 = 1.2F;
                  if (this.b(bqv.h)) {
                     $$21 += (float)(this.c(bqv.h).e() + 1) * 0.75F;
                  }

                  float $$22 = Math.max($$5 * 7.0F, 1.0F / $$12);
                  etp $$24 = $$3.e($$13.a((double)$$22));
                  float $$25 = this.dh();
                  float $$26 = this.di();
                  etk $$27 = new etk($$2, $$24.b(0.0, (double)$$26, 0.0)).c((double)$$25, 0.0, (double)$$25);
                  etp $$23 = $$2.b(0.0, 0.51F, 0.0);
                  $$24 = $$24.b(0.0, 0.51F, 0.0);
                  etp $$28 = $$13.c(new etp(0.0, 1.0, 0.0));
                  etp $$29 = $$28.a((double)($$25 * 0.5F));
                  etp $$30 = $$23.d($$29);
                  etp $$31 = $$24.d($$29);
                  etp $$32 = $$23.e($$29);
                  etp $$33 = $$24.e($$29);
                  Iterable<eui> $$34 = this.dN().d(this, $$27);
                  Iterator<etk> $$35 = StreamSupport.stream($$34.spliterator(), false).flatMap($$0x -> $$0x.e().stream()).iterator();
                  float $$36 = Float.MIN_VALUE;

                  while ($$35.hasNext()) {
                     etk $$37 = $$35.next();
                     if ($$37.a($$30, $$31) || $$37.a($$32, $$33)) {
                        $$36 = (float)$$37.e;
                        etp $$38 = $$37.f();
                        in $$39 = in.a($$38);

                        for (int $$40 = 1; (float)$$40 < $$21; $$40++) {
                           in $$41 = $$39.b($$40);
                           dqh $$42 = this.dN().a_($$41);
                           eui $$43;
                           if (!($$43 = $$42.b(this.dN(), $$41, $$16)).c()) {
                              $$36 = (float)$$43.c(is.a.b) + (float)$$41.v();
                              if ((double)$$36 - this.du() > (double)$$21) {
                                 return;
                              }
                           }

                           if ($$40 > 1) {
                              $$17 = $$17.c();
                              dqh $$44 = this.dN().a_($$17);
                              if (!$$44.b(this.dN(), $$17, $$16).c()) {
                                 return;
                              }
                           }
                        }
                        break;
                     }
                  }

                  if ($$36 != Float.MIN_VALUE) {
                     float $$45 = (float)((double)$$36 - this.du());
                     if (!($$45 <= 0.5F) && !($$45 > $$21)) {
                        this.dl = 1;
                     }
                  }
               }
            }
         }
      }
   }

   @Override
   protected boolean c(etp $$0) {
      float $$1 = this.dD() * (float) (Math.PI / 180.0);
      double $$2 = (double)axz.a($$1);
      double $$3 = (double)axz.b($$1);
      double $$4 = (double)this.bp * $$3 - (double)this.br * $$2;
      double $$5 = (double)this.br * $$3 + (double)this.bp * $$2;
      double $$6 = axz.k($$4) + axz.k($$5);
      double $$7 = axz.k($$0.c) + axz.k($$0.e);
      if (!($$6 < 1.0E-5F) && !($$7 < 1.0E-5F)) {
         double $$8 = $$4 * $$0.c + $$5 * $$0.e;
         double $$9 = Math.acos($$8 / Math.sqrt($$6 * $$7));
         return $$9 < 0.13962634F;
      } else {
         return false;
      }
   }

   private boolean I() {
      return this.C() && this.dl <= 0 && this.aC() && !this.fR() && !this.bP() && this.K() && (double)this.aK() >= 1.0;
   }

   private boolean K() {
      eto $$0 = this.cA.a();
      return $$0.i != 0.0F || $$0.j != 0.0F;
   }

   private boolean M() {
      return !this.bZ() && this.N() && this.O() && !this.ft() && !this.b(bqv.o) && (!this.bP() || this.d(this.da())) && !this.fC();
   }

   private boolean d(brh $$0) {
      return $$0.dG() && $$0.cY();
   }

   private boolean N() {
      double $$0 = 0.8;
      return this.bh() ? this.cA.b() : (double)this.cA.b >= 0.8;
   }

   private boolean O() {
      return this.bP() || (float)this.gk().a() > 6.0F || this.gb().c;
   }

   public float D() {
      if (!this.a(avw.a)) {
         return 0.0F;
      } else {
         float $$0 = 600.0F;
         float $$1 = 100.0F;
         if ((float)this.dn >= 600.0F) {
            return 1.0F;
         } else {
            float $$2 = axz.a((float)this.dn / 100.0F, 0.0F, 1.0F);
            float $$3 = (float)this.dn < 100.0F ? 0.0F : axz.a(((float)this.dn - 100.0F) / 500.0F, 0.0F, 1.0F);
            return $$2 * 0.6F + $$3 * 0.39999998F;
         }
      }
   }

   public void a(daa $$0) {
      if ($$0 == daa.d) {
         this.g(this.dq().a(is.a.b, 0.0));
      }
   }

   @Override
   public boolean bh() {
      return this.co;
   }

   @Override
   protected boolean fS() {
      boolean $$0 = this.co;
      boolean $$1 = super.fS();
      if (this.N_()) {
         return this.co;
      } else {
         if (!$$0 && $$1) {
            this.dN().a(this.ds(), this.du(), this.dy(), avc.x, avd.i, 1.0F, 1.0F, false);
            this.cB.ak().a((gqm)(new gqp.b(this)));
         }

         if ($$0 && !$$1) {
            this.dN().a(this.ds(), this.du(), this.dy(), avc.y, avd.i, 1.0F, 1.0F, false);
         }

         return this.co;
      }
   }

   @Override
   public etp q(float $$0) {
      if (this.cB.m.aA().a()) {
         float $$1 = axz.i($$0 * 0.5F, this.dD(), this.O) * (float) (Math.PI / 180.0);
         float $$2 = axz.i($$0 * 0.5F, this.dF(), this.P) * (float) (Math.PI / 180.0);
         double $$3 = this.fs() == bru.b ? -1.0 : 1.0;
         etp $$4 = new etp(0.39 * $$3, -0.6, 0.3);
         return $$4.a(-$$2).b(-$$1).e(this.j($$0));
      } else {
         return super.q($$0);
      }
   }

   @Override
   public void a(csz $$0, csz $$1, col $$2) {
      this.cB.aB().a($$0, $$1, $$2);
   }

   @Override
   public float dE() {
      return this.dD();
   }
}
