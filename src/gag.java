import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gag extends gad {
   public static final Logger g = LogUtils.getLogger();
   private static final int cH = 20;
   private static final int cI = 600;
   private static final int cJ = 100;
   private static final float cK = 0.6F;
   private static final double cL = 0.35;
   private static final double cM = 0.13962634F;
   private static final float cN = 0.3F;
   public final fvn h;
   private final avk cO;
   private final fch cP;
   private final List<gpl> cQ = Lists.newArrayList();
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
   private int db;
   private boolean dc;
   public gae cx;
   protected final fcu cy;
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
   private bop dg;
   private boolean dh;
   private boolean di = true;
   private int dj;
   private boolean dk;
   private int dl;
   private boolean dm = true;
   private boolean dn = false;

   public gag(fcu $$0, fvm $$1, fvn $$2, avk $$3, fch $$4, boolean $$5, boolean $$6) {
      super($$1, $$2.p());
      this.cy = $$0;
      this.h = $$2;
      this.cO = $$3;
      this.cP = $$4;
      this.cZ = $$5;
      this.da = $$6;
      this.cQ.add(new gqd(this, $$0.ak()));
      this.cQ.add(new gpq(this));
      this.cQ.add(new gpp(this, $$0.ak(), $$1.F_()));
   }

   @Override
   public boolean a(bpj $$0, float $$1) {
      return false;
   }

   @Override
   public void c(float $$0) {
   }

   @Override
   public boolean a(bql $$0, boolean $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         if ($$0 instanceof cmg) {
            this.cy.ak().a((gqb)(new gpv(this, (cmg)$$0, true)));
            this.cy.ak().a((gqb)(new gpv(this, (cmg)$$0, false)));
         }

         return true;
      }
   }

   @Override
   public void bG() {
      super.bG();
      this.dh = false;
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
            this.h.b(new agu.c(this.dD(), this.dF(), this.aC()));
            this.h.b(new ahc(this.bp, this.br, this.cx.g, this.cx.h));
            bql $$0 = this.cX();
            if ($$0 != this && $$0.cY()) {
               this.h.b(new agv($$0));
               this.G();
            }
         } else {
            this.E();
         }

         for (gpl $$1 : this.cQ) {
            $$1.a();
         }
      }
   }

   public float d() {
      for (gpl $$0 : this.cQ) {
         if ($$0 instanceof gpp) {
            return ((gpp)$$0).b();
         }
      }

      return 0.0F;
   }

   private void E() {
      this.G();
      boolean $$0 = this.bT();
      if ($$0 != this.cZ) {
         ahb.a $$1 = $$0 ? ahb.a.a : ahb.a.b;
         this.h.b(new ahb(this, $$1));
         this.cZ = $$0;
      }

      if (this.z()) {
         double $$2 = this.ds() - this.cS;
         double $$3 = this.du() - this.cT;
         double $$4 = this.dy() - this.cU;
         double $$5 = (double)(this.dD() - this.cV);
         double $$6 = (double)(this.dF() - this.cW);
         this.db++;
         boolean $$7 = axw.f($$2, $$3, $$4) > axw.k(2.0E-4) || this.db >= 20;
         boolean $$8 = $$5 != 0.0 || $$6 != 0.0;
         if (this.bP()) {
            etf $$9 = this.dq();
            this.h.b(new agu.b($$9.c, -999.0, $$9.e, this.dD(), this.dF(), this.aC()));
            $$7 = false;
         } else if ($$7 && $$8) {
            this.h.b(new agu.b(this.ds(), this.du(), this.dy(), this.dD(), this.dF(), this.aC()));
         } else if ($$7) {
            this.h.b(new agu.a(this.ds(), this.du(), this.dy(), this.aC()));
         } else if ($$8) {
            this.h.b(new agu.c(this.dD(), this.dF(), this.aC()));
         } else if (this.cX != this.aC()) {
            this.h.b(new agu.d(this.aC()));
         }

         if ($$7) {
            this.cS = this.ds();
            this.cT = this.du();
            this.cU = this.dy();
            this.db = 0;
         }

         if ($$8) {
            this.cV = this.dD();
            this.cW = this.dF();
         }

         this.cX = this.aC();
         this.di = this.cy.m.H().c();
      }
   }

   private void G() {
      boolean $$0 = this.bZ();
      if ($$0 != this.da) {
         ahb.a $$1 = $$0 ? ahb.a.d : ahb.a.e;
         this.h.b(new ahb(this, $$1));
         this.da = $$0;
      }
   }

   public boolean a(boolean $$0) {
      aha.a $$1 = $$0 ? aha.a.d : aha.a.e;
      csd $$2 = this.ga().a($$0);
      this.h.b(new aha($$1, im.c, ir.a));
      return !$$2.d();
   }

   @Override
   public void a(bop $$0) {
      super.a($$0);
      this.h.b(new ahq($$0));
   }

   @Override
   public void fY() {
      this.h.b(new agh(agh.a.a));
      fcs.c();
   }

   @Override
   protected void f(bpj $$0, float $$1) {
      if (!this.b($$0)) {
         this.t(this.ey() - $$1);
      }
   }

   @Override
   public void r() {
      this.h.b(new agm(this.cc.j));
      this.e();
   }

   public void e() {
      super.r();
      this.cy.a(null);
   }

   public void F(float $$0) {
      if (this.dc) {
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
         this.dc = true;
      }
   }

   @Override
   public void y() {
      this.h.b(new agz(this.gb()));
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
      this.h.b(new ahb(this, ahb.a.f, axw.d(this.v() * 100.0F)));
   }

   public void i() {
      this.h.b(new ahb(this, ahb.a.h));
   }

   public avk j() {
      return this.cO;
   }

   public fch m() {
      return this.cP;
   }

   public void a(cwi<?> $$0) {
      if (this.cP.d($$0)) {
         this.cP.e($$0);
         this.h.b(new ahe($$0));
      }
   }

   @Override
   protected int F() {
      return this.cR;
   }

   public void a(int $$0) {
      this.cR = $$0;
   }

   @Override
   public void a(ws $$0, boolean $$1) {
      this.cy.aZ().a($$0, $$1);
   }

   private void c(double $$0, double $$1) {
      im $$2 = im.a($$0, this.du(), $$1);
      if (this.i($$2)) {
         double $$3 = $$0 - (double)$$2.u();
         double $$4 = $$1 - (double)$$2.w();
         ir $$5 = null;
         double $$6 = Double.MAX_VALUE;
         ir[] $$7 = new ir[]{ir.e, ir.f, ir.c, ir.d};

         for (ir $$8 : $$7) {
            double $$9 = $$8.o().a($$3, 0.0, $$4);
            double $$10 = $$8.f() == ir.b.a ? 1.0 - $$9 : $$9;
            if ($$10 < $$6 && !this.i($$2.a($$8))) {
               $$6 = $$10;
               $$5 = $$8;
            }
         }

         if ($$5 != null) {
            etf $$11 = this.dq();
            if ($$5.o() == ir.a.a) {
               this.o(0.1 * (double)$$5.j(), $$11.d, $$11.e);
            } else {
               this.o($$11.c, $$11.d, 0.1 * (double)$$5.l());
            }
         }
      }
   }

   private boolean i(im $$0) {
      eta $$1 = this.cI();
      eta $$2 = new eta((double)$$0.u(), $$1.b, (double)$$0.w(), (double)$$0.u() + 1.0, $$1.e, (double)$$0.w() + 1.0).h(1.0E-7);
      return this.dN().f(this, $$2);
   }

   public void a(float $$0, int $$1, int $$2) {
      this.cr = $$0;
      this.cq = $$1;
      this.cp = $$2;
   }

   @Override
   public void a(ws $$0) {
      this.cy.l.d().a($$0);
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

   public boolean o() {
      return this.dm;
   }

   public void v(boolean $$0) {
      this.dn = $$0;
   }

   public boolean p() {
      return this.dn;
   }

   @Override
   public void a(auy $$0, float $$1, float $$2) {
      this.dN().a(this.ds(), this.du(), this.dy(), $$0, this.dc(), $$1, $$2, false);
   }

   @Override
   public void a(auy $$0, ava $$1, float $$2, float $$3) {
      this.dN().a(this.ds(), this.du(), this.dy(), $$0, $$1, $$2, $$3, false);
   }

   @Override
   public boolean cZ() {
      return true;
   }

   @Override
   public void c(bop $$0) {
      csd $$1 = this.b($$0);
      if (!$$1.d() && !this.ft()) {
         super.c($$0);
         this.df = true;
         this.dg = $$0;
      }
   }

   @Override
   public boolean ft() {
      return this.df;
   }

   @Override
   public void fz() {
      super.fz();
      this.df = false;
   }

   @Override
   public bop fu() {
      return Objects.requireNonNullElse(this.dg, bop.a);
   }

   @Override
   public void a(ajk<?> $$0) {
      super.a($$0);
      if (aG.equals($$0)) {
         boolean $$1 = (this.ao.a(aG) & 1) > 0;
         bop $$2 = (this.ao.a(aG) & 2) > 0 ? bop.b : bop.a;
         if ($$1 && !this.df) {
            this.c($$2);
         } else if (!$$1 && this.df) {
            this.fz();
         }
      }

      if (ap.equals($$0) && this.fC() && !this.dk) {
         this.cy.ak().a((gqb)(new gpr(this)));
      }
   }

   @Nullable
   public bro u() {
      if (this.db() instanceof bro $$0 && $$0.a()) {
         return $$0;
      }

      return null;
   }

   public float v() {
      return this.de;
   }

   @Override
   public boolean Y() {
      return this.cy.aS();
   }

   @Override
   public void a(don $$0, boolean $$1) {
      if ($$0 instanceof doa $$2) {
         this.cy.a(new fmo($$2, $$1, this.cy.aS()));
      } else {
         this.cy.a(new fnb($$0, $$1, this.cy.aS()));
      }
   }

   @Override
   public void a(cyv $$0) {
      this.cy.a(new fmy($$0));
   }

   @Override
   public void a(dnn $$0) {
      this.cy.a(new fmb($$0));
   }

   @Override
   public void a(dos $$0) {
      this.cy.a(new fnf($$0));
   }

   @Override
   public void a(dod $$0) {
      this.cy.a(new fmt($$0));
   }

   @Override
   public void a(csd $$0, bop $$1) {
      if ($$0.a(csg.tZ)) {
         this.cy.a(new flx(this, $$0, $$1));
      }
   }

   @Override
   public void b(bql $$0) {
      this.cy.g.a($$0, kw.f);
   }

   @Override
   public void c(bql $$0) {
      this.cy.g.a($$0, kw.r);
   }

   @Override
   public boolean bT() {
      return this.cx != null && this.cx.h;
   }

   @Override
   public boolean bY() {
      return this.cY;
   }

   @Override
   public boolean w() {
      return this.bY() || this.cc();
   }

   @Override
   public void fo() {
      super.fo();
      if (this.z()) {
         this.bp = this.cx.a;
         this.br = this.cx.b;
         this.bo = this.cx.g;
         this.cD = this.cB;
         this.cE = this.cC;
         this.cC = this.cC + (this.dF() - this.cC) * 0.5F;
         this.cB = this.cB + (this.dD() - this.cB) * 0.5F;
      }
   }

   @Override
   protected boolean z() {
      return this.cy.ao() == this;
   }

   public void A() {
      this.b(brp.a);
      if (this.dN() != null) {
         for (double $$0 = this.du(); $$0 > (double)this.dN().I_() && $$0 < (double)this.dN().al(); $$0++) {
            this.a_(this.ds(), $$0, this.dy());
            if (this.dN().g(this)) {
               break;
            }
         }

         this.g(etf.b);
         this.s(0.0F);
      }

      this.t(this.eP());
      this.aR = 0;
   }

   @Override
   public void n_() {
      if (this.cA > 0) {
         this.cA--;
      }

      if (!(this.cy.y instanceof fkr)) {
         this.H();
      }

      boolean $$0 = this.cx.g;
      boolean $$1 = this.cx.h;
      boolean $$2 = this.N();
      this.cY = !this.gb().b && !this.ca() && !this.bP() && this.h(brp.f) && (this.bT() || !this.fJ() && !this.h(brp.a));
      float $$3 = axw.a(0.3F + cxo.b(this), 0.0F, 1.0F);
      this.cx.a(this.w(), $$3);
      this.cy.aB().a(this.cx);
      if (this.ft() && !this.bP()) {
         this.cx.a *= 0.2F;
         this.cx.b *= 0.2F;
         this.cA = 0;
      }

      boolean $$4 = false;
      if (this.dj > 0) {
         this.dj--;
         $$4 = true;
         this.cx.g = true;
      }

      if (!this.ag) {
         this.c(this.ds() - (double)this.dh() * 0.35, this.dy() + (double)this.dh() * 0.35);
         this.c(this.ds() - (double)this.dh() * 0.35, this.dy() - (double)this.dh() * 0.35);
         this.c(this.ds() + (double)this.dh() * 0.35, this.dy() - (double)this.dh() * 0.35);
         this.c(this.ds() + (double)this.dh() * 0.35, this.dy() + (double)this.dh() * 0.35);
      }

      if ($$1) {
         this.cA = 0;
      }

      boolean $$5 = this.M();
      boolean $$6 = this.bP() ? this.da().aC() : this.aC();
      boolean $$7 = !$$1 && !$$2;
      if (($$6 || this.bh()) && $$7 && $$5) {
         if (this.cA <= 0 && !this.cy.m.D.e()) {
            this.cA = 7;
         } else {
            this.h(true);
         }
      }

      if ((!this.bc() || this.bh()) && $$5 && this.cy.m.D.e()) {
         this.h(true);
      }

      if (this.bZ()) {
         boolean $$8 = !this.cx.b() || !this.O();
         boolean $$9 = $$8 || this.Q && !this.T || this.bc() && !this.bh();
         if (this.ca()) {
            if (!this.aC() && !this.cx.h && $$8 || !this.bc()) {
               this.h(false);
            }
         } else if ($$9) {
            this.h(false);
         }
      }

      boolean $$10 = false;
      if (this.gb().c) {
         if (this.cy.q.h()) {
            if (!this.gb().b) {
               this.gb().b = true;
               $$10 = true;
               this.y();
            }
         } else if (!$$0 && this.cx.g && !$$4) {
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

      if (this.cx.g && !$$10 && !$$0 && !this.gb().b && !this.bP() && !this.q_()) {
         csd $$11 = this.d(bqs.e);
         if ($$11.a(csg.nT) && cqz.j($$11) && this.gf()) {
            this.h.b(new ahb(this, ahb.a.i));
         }
      }

      this.dk = this.fC();
      if (this.bc() && this.cx.h && this.ed()) {
         this.fi();
      }

      if (this.a(avt.a)) {
         int $$12 = this.N_() ? 10 : 1;
         this.dl = axw.a(this.dl + $$12, 0, 600);
      } else if (this.dl > 0) {
         this.a(avt.a);
         this.dl = axw.a(this.dl - 10, 0, 600);
      }

      if (this.gb().b && this.z()) {
         int $$13 = 0;
         if (this.cx.h) {
            $$13--;
         }

         if (this.cx.g) {
            $$13++;
         }

         if ($$13 != 0) {
            this.g(this.dq().b(0.0, (double)((float)$$13 * this.gb().a() * 3.0F), 0.0));
         }
      }

      bro $$14 = this.u();
      if ($$14 != null && $$14.c() == 0) {
         if (this.dd < 0) {
            this.dd++;
            if (this.dd == 0) {
               this.de = 0.0F;
            }
         }

         if ($$0 && !this.cx.g) {
            this.dd = -10;
            $$14.b(axw.d(this.v() * 100.0F));
            this.h();
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
      if (this.aC() && this.gb().b && !this.cy.q.h()) {
         this.gb().b = false;
         this.y();
      }
   }

   @Override
   protected void ee() {
      this.aR++;
      if (this.aR == 20) {
         this.a(bql.c.a);
      }
   }

   private void H() {
      this.cG = this.cF;
      float $$0 = 0.0F;
      if (this.aw) {
         if (this.cy.y != null && !this.cy.y.k() && !(this.cy.y instanceof fjr)) {
            if (this.cy.y instanceof flr) {
               this.r();
            }

            this.cy.a(null);
         }

         if (this.cF == 0.0F) {
            this.cy.ak().a(gpw.b(auz.uu, this.ah.i() * 0.4F + 0.8F, 0.25F));
         }

         $$0 = 0.0125F;
         this.aw = false;
      } else if (this.b(bpz.i) && !this.c(bpz.i).a(60)) {
         $$0 = 0.006666667F;
      } else if (this.cF > 0.0F) {
         $$0 = -0.05F;
      }

      this.cF = axw.a(this.cF + $$0, 0.0F, 1.0F);
      this.L();
   }

   @Override
   public void t() {
      super.t();
      this.dh = false;
      if (this.db() instanceof cmi $$0) {
         $$0.a(this.cx.e, this.cx.f, this.cx.c, this.cx.d);
         this.dh = this.dh | (this.cx.e || this.cx.f || this.cx.c || this.cx.d);
      }
   }

   public boolean B() {
      return this.dh;
   }

   @Nullable
   @Override
   public bpx d(iv<bpv> $$0) {
      if ($$0.a(bpz.i)) {
         this.cG = 0.0F;
         this.cF = 0.0F;
      }

      return super.d($$0);
   }

   @Override
   public void a(brj $$0, etf $$1) {
      double $$2 = this.ds();
      double $$3 = this.dy();
      super.a($$0, $$1);
      this.f((float)(this.ds() - $$2), (float)(this.dy() - $$3));
   }

   public boolean C() {
      return this.di;
   }

   protected void f(float $$0, float $$1) {
      if (this.I()) {
         etf $$2 = this.dl();
         etf $$3 = $$2.b((double)$$0, 0.0, (double)$$1);
         etf $$4 = new etf((double)$$0, 0.0, (double)$$1);
         float $$5 = this.fl();
         float $$6 = (float)$$4.g();
         if ($$6 <= 0.001F) {
            ete $$7 = this.cx.a();
            float $$8 = $$5 * $$7.i;
            float $$9 = $$5 * $$7.j;
            float $$10 = axw.a(this.dD() * (float) (Math.PI / 180.0));
            float $$11 = axw.b(this.dD() * (float) (Math.PI / 180.0));
            $$4 = new etf((double)($$8 * $$11 - $$9 * $$10), $$4.d, (double)($$9 * $$11 + $$8 * $$10));
            $$6 = (float)$$4.g();
            if ($$6 <= 0.001F) {
               return;
            }
         }

         float $$12 = axw.i($$6);
         etf $$13 = $$4.a((double)$$12);
         etf $$14 = this.bL();
         float $$15 = (float)($$14.c * $$13.c + $$14.e * $$13.e);
         if (!($$15 < -0.15F)) {
            etk $$16 = etk.a(this);
            im $$17 = im.a(this.ds(), this.cI().e, this.dy());
            dpy $$18 = this.dN().a_($$17);
            if ($$18.b(this.dN(), $$17, $$16).c()) {
               $$17 = $$17.c();
               dpy $$19 = this.dN().a_($$17);
               if ($$19.b(this.dN(), $$17, $$16).c()) {
                  float $$20 = 7.0F;
                  float $$21 = 1.2F;
                  if (this.b(bpz.h)) {
                     $$21 += (float)(this.c(bpz.h).e() + 1) * 0.75F;
                  }

                  float $$22 = Math.max($$5 * 7.0F, 1.0F / $$12);
                  etf $$24 = $$3.e($$13.a((double)$$22));
                  float $$25 = this.dh();
                  float $$26 = this.di();
                  eta $$27 = new eta($$2, $$24.b(0.0, (double)$$26, 0.0)).c((double)$$25, 0.0, (double)$$25);
                  etf $$23 = $$2.b(0.0, 0.51F, 0.0);
                  $$24 = $$24.b(0.0, 0.51F, 0.0);
                  etf $$28 = $$13.c(new etf(0.0, 1.0, 0.0));
                  etf $$29 = $$28.a((double)($$25 * 0.5F));
                  etf $$30 = $$23.d($$29);
                  etf $$31 = $$24.d($$29);
                  etf $$32 = $$23.e($$29);
                  etf $$33 = $$24.e($$29);
                  Iterable<ety> $$34 = this.dN().d(this, $$27);
                  Iterator<eta> $$35 = StreamSupport.stream($$34.spliterator(), false).flatMap($$0x -> $$0x.e().stream()).iterator();
                  float $$36 = Float.MIN_VALUE;

                  while ($$35.hasNext()) {
                     eta $$37 = $$35.next();
                     if ($$37.a($$30, $$31) || $$37.a($$32, $$33)) {
                        $$36 = (float)$$37.e;
                        etf $$38 = $$37.f();
                        im $$39 = im.a($$38);

                        for (int $$40 = 1; (float)$$40 < $$21; $$40++) {
                           im $$41 = $$39.b($$40);
                           dpy $$42 = this.dN().a_($$41);
                           ety $$43;
                           if (!($$43 = $$42.b(this.dN(), $$41, $$16)).c()) {
                              $$36 = (float)$$43.c(ir.a.b) + (float)$$41.v();
                              if ((double)$$36 - this.du() > (double)$$21) {
                                 return;
                              }
                           }

                           if ($$40 > 1) {
                              $$17 = $$17.c();
                              dpy $$44 = this.dN().a_($$17);
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
                        this.dj = 1;
                     }
                  }
               }
            }
         }
      }
   }

   @Override
   protected boolean c(etf $$0) {
      float $$1 = this.dD() * (float) (Math.PI / 180.0);
      double $$2 = (double)axw.a($$1);
      double $$3 = (double)axw.b($$1);
      double $$4 = (double)this.bp * $$3 - (double)this.br * $$2;
      double $$5 = (double)this.br * $$3 + (double)this.bp * $$2;
      double $$6 = axw.k($$4) + axw.k($$5);
      double $$7 = axw.k($$0.c) + axw.k($$0.e);
      if (!($$6 < 1.0E-5F) && !($$7 < 1.0E-5F)) {
         double $$8 = $$4 * $$0.c + $$5 * $$0.e;
         double $$9 = Math.acos($$8 / Math.sqrt($$6 * $$7));
         return $$9 < 0.13962634F;
      } else {
         return false;
      }
   }

   private boolean I() {
      return this.C() && this.dj <= 0 && this.aC() && !this.fR() && !this.bP() && this.K() && (double)this.aK() >= 1.0;
   }

   private boolean K() {
      ete $$0 = this.cx.a();
      return $$0.i != 0.0F || $$0.j != 0.0F;
   }

   private boolean M() {
      return !this.bZ() && this.N() && this.O() && !this.ft() && !this.b(bpz.o) && (!this.bP() || this.d(this.da())) && !this.fC();
   }

   private boolean d(bql $$0) {
      return $$0.dG() && $$0.cY();
   }

   private boolean N() {
      double $$0 = 0.8;
      return this.bh() ? this.cx.b() : (double)this.cx.b >= 0.8;
   }

   private boolean O() {
      return this.bP() || (float)this.gk().a() > 6.0F || this.gb().c;
   }

   public float D() {
      if (!this.a(avt.a)) {
         return 0.0F;
      } else {
         float $$0 = 600.0F;
         float $$1 = 100.0F;
         if ((float)this.dl >= 600.0F) {
            return 1.0F;
         } else {
            float $$2 = axw.a((float)this.dl / 100.0F, 0.0F, 1.0F);
            float $$3 = (float)this.dl < 100.0F ? 0.0F : axw.a(((float)this.dl - 100.0F) / 500.0F, 0.0F, 1.0F);
            return $$2 * 0.6F + $$3 * 0.39999998F;
         }
      }
   }

   public void a(czr $$0) {
      if ($$0 == czr.d) {
         this.g(this.dq().a(ir.a.b, 0.0));
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
            this.dN().a(this.ds(), this.du(), this.dy(), auz.x, ava.i, 1.0F, 1.0F, false);
            this.cy.ak().a((gqb)(new gqe.b(this)));
         }

         if ($$0 && !$$1) {
            this.dN().a(this.ds(), this.du(), this.dy(), auz.y, ava.i, 1.0F, 1.0F, false);
         }

         return this.co;
      }
   }

   @Override
   public etf q(float $$0) {
      if (this.cy.m.aA().a()) {
         float $$1 = axw.i($$0 * 0.5F, this.dD(), this.O) * (float) (Math.PI / 180.0);
         float $$2 = axw.i($$0 * 0.5F, this.dF(), this.P) * (float) (Math.PI / 180.0);
         double $$3 = this.fs() == bqy.b ? -1.0 : 1.0;
         etf $$4 = new etf(0.39 * $$3, -0.6, 0.3);
         return $$4.a(-$$2).b(-$$1).e(this.j($$0));
      } else {
         return super.q($$0);
      }
   }

   @Override
   public void a(csd $$0, csd $$1, cnp $$2) {
      this.cy.aB().a($$0, $$1, $$2);
   }

   @Override
   public float dE() {
      return this.dD();
   }
}
