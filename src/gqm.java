import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gqm extends gqj {
   public static final Logger h = LogUtils.getLogger();
   private static final int cy = 20;
   private static final int cz = 600;
   private static final int cA = 100;
   private static final float cB = 0.6F;
   private static final double cC = 0.35;
   private static final double cD = 0.13962634F;
   public static final float i = 0.2F;
   public final glp j;
   private final axj cE;
   private final fqb cF;
   private final bbb cG = new bbb(20, 1280);
   private final List<hnx> cH = Lists.newArrayList();
   private int cI = 0;
   private double cJ;
   private double cK;
   private double cL;
   private float cM;
   private float cN;
   private boolean cO;
   private boolean cP;
   private boolean cQ;
   private boolean cR;
   private boolean cS;
   private int cT;
   private boolean cU;
   public gqk k = new gqk();
   private csg cV = csg.b;
   protected final fqq cq;
   protected int cr;
   public float cs;
   public float ct;
   public float cu;
   public float cv;
   private int cW;
   private float cX;
   public float cw;
   public float cx;
   private boolean cY;
   @Nullable
   private bvb cZ;
   private boolean da;
   private boolean db = true;
   private int dc;
   private boolean dd;
   private int de;
   private boolean df = true;
   private boolean dg = false;

   public gqm(fqq $$0, glo $$1, glp $$2, axj $$3, fqb $$4, boolean $$5, boolean $$6) {
      super($$1, $$2.n());
      this.cq = $$0;
      this.j = $$2;
      this.cE = $$3;
      this.cF = $$4;
      this.cR = $$5;
      this.cS = $$6;
      this.cH.add(new hop(this, $$0.ak()));
      this.cH.add(new hoc(this));
      this.cH.add(new hob(this, $$0.ak(), $$1.H_()));
   }

   @Override
   public void c(float $$0) {
   }

   @Override
   public boolean a(bxe $$0, boolean $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         if ($$0 instanceof cuv) {
            this.cq.ak().a((hon)(new hoh(this, (cuv)$$0, true)));
            this.cq.ak().a((hon)(new hoh(this, (cuv)$$0, false)));
         }

         return true;
      }
   }

   @Override
   public void aa() {
      super.aa();
      this.da = false;
   }

   @Override
   public float i(float $$0) {
      return this.dN();
   }

   @Override
   public float j(float $$0) {
      return this.bY() ? super.j($$0) : this.dL();
   }

   @Override
   public void g() {
      this.gL();
      if (this.gK()) {
         this.cG.b();
         super.g();
         this.I();
         if (!this.cV.equals(this.k.a)) {
            this.j.b(new aii(this.k.a));
            this.cV = this.k.a;
         }

         if (this.bY()) {
            this.j.b(new ahz.c(this.dL(), this.dN(), this.aH(), this.P));
            bxe $$0 = this.df();
            if ($$0 != this && $$0.dg()) {
               this.j.b(aia.a($$0));
               this.K();
            }
         } else {
            this.H();
         }

         for (hnx $$1 : this.cH) {
            $$1.a();
         }
      }
   }

   public float d() {
      for (hnx $$0 : this.cH) {
         if ($$0 instanceof hob) {
            return ((hob)$$0).b();
         }
      }

      return 0.0F;
   }

   private void H() {
      this.K();
      if (this.z()) {
         double $$0 = this.dA() - this.cJ;
         double $$1 = this.dC() - this.cK;
         double $$2 = this.dG() - this.cL;
         double $$3 = (double)(this.dL() - this.cM);
         double $$4 = (double)(this.dN() - this.cN);
         this.cT++;
         boolean $$5 = azz.f($$0, $$1, $$2) > azz.k(2.0E-4) || this.cT >= 20;
         boolean $$6 = $$3 != 0.0 || $$4 != 0.0;
         if ($$5 && $$6) {
            this.j.b(new ahz.b(this.dt(), this.dL(), this.dN(), this.aH(), this.P));
         } else if ($$5) {
            this.j.b(new ahz.a(this.dt(), this.aH(), this.P));
         } else if ($$6) {
            this.j.b(new ahz.c(this.dL(), this.dN(), this.aH(), this.P));
         } else if (this.cO != this.aH() || this.cP != this.P) {
            this.j.b(new ahz.d(this.aH(), this.P));
         }

         if ($$5) {
            this.cJ = this.dA();
            this.cK = this.dC();
            this.cL = this.dG();
            this.cT = 0;
         }

         if ($$6) {
            this.cM = this.dL();
            this.cN = this.dN();
         }

         this.cO = this.aH();
         this.cP = this.P;
         this.db = this.cq.n.J().c();
      }
   }

   private void I() {
      boolean $$0 = this.cc();
      if ($$0 != this.cR) {
         aih.a $$1 = $$0 ? aih.a.a : aih.a.b;
         this.j.b(new aih(this, $$1));
         this.cR = $$0;
      }
   }

   private void K() {
      boolean $$0 = this.ci();
      if ($$0 != this.cS) {
         aih.a $$1 = $$0 ? aih.a.d : aih.a.e;
         this.j.b(new aih(this, $$1));
         this.cS = $$0;
      }
   }

   public boolean a(boolean $$0) {
      aig.a $$1 = $$0 ? aig.a.d : aig.a.e;
      dak $$2 = this.gj().a($$0);
      this.j.b(new aig($$1, iw.c, jc.a));
      return !$$2.f();
   }

   @Override
   public void a(bvb $$0) {
      super.a($$0);
      this.j.b(new aiz($$0));
   }

   @Override
   public void gg() {
      this.j.b(new ahl(ahl.a.a));
      fqo.c();
   }

   @Override
   public void o() {
      this.j.b(new ahr(this.bR.l));
      this.e();
   }

   public void e() {
      super.o();
      this.cq.a(null);
   }

   public void J(float $$0) {
      if (this.cU) {
         float $$1 = this.eG() - $$0;
         if ($$1 <= 0.0F) {
            this.d($$0);
            if ($$1 < 0.0F) {
               this.aj = 10;
            }
         } else {
            this.be = $$1;
            this.aj = 20;
            this.d($$0);
            this.aO = 10;
            this.aN = this.aO;
         }
      } else {
         this.d($$0);
         this.cU = true;
      }
   }

   @Override
   public void w() {
      this.j.b(new aif(this.gk()));
   }

   @Override
   public boolean gh() {
      return true;
   }

   @Override
   public boolean fI() {
      return !this.gk().b && super.fI();
   }

   @Override
   public boolean bt() {
      return !this.gk().b && super.bt();
   }

   protected void h() {
      this.j.b(new aih(this, aih.a.f, azz.d(this.x() * 100.0F)));
   }

   public void k() {
      this.j.b(new aih(this, aih.a.h));
   }

   public axj l() {
      return this.cE;
   }

   public fqb m() {
      return this.cF;
   }

   public void a(dgj $$0) {
      if (this.cF.b($$0)) {
         this.cF.c($$0);
         this.j.b(new ail($$0));
      }
   }

   @Override
   public int F() {
      return this.cI;
   }

   public void a(int $$0) {
      this.cI = $$0;
   }

   @Override
   public void a(xg $$0, boolean $$1) {
      this.cq.aZ().a($$0, $$1);
   }

   private void c(double $$0, double $$1) {
      iw $$2 = iw.a($$0, this.dC(), $$1);
      if (this.c($$2)) {
         double $$3 = $$0 - (double)$$2.u();
         double $$4 = $$1 - (double)$$2.w();
         jc $$5 = null;
         double $$6 = Double.MAX_VALUE;
         jc[] $$7 = new jc[]{jc.e, jc.f, jc.c, jc.d};

         for (jc $$8 : $$7) {
            double $$9 = $$8.o().a($$3, 0.0, $$4);
            double $$10 = $$8.f() == jc.b.a ? 1.0 - $$9 : $$9;
            if ($$10 < $$6 && !this.c($$2.a($$8))) {
               $$6 = $$10;
               $$5 = $$8;
            }
         }

         if ($$5 != null) {
            fgc $$11 = this.dy();
            if ($$5.o() == jc.a.a) {
               this.n(0.1 * (double)$$5.j(), $$11.e, $$11.f);
            } else {
               this.n($$11.d, $$11.e, 0.1 * (double)$$5.l());
            }
         }
      }
   }

   private boolean c(iw $$0) {
      ffx $$1 = this.cR();
      ffx $$2 = new ffx((double)$$0.u(), $$1.b, (double)$$0.w(), (double)$$0.u() + 1.0, $$1.e, (double)$$0.w() + 1.0).h(1.0E-7);
      return this.dV().g(this, $$2);
   }

   public void a(float $$0, int $$1, int $$2) {
      this.ch = $$0;
      this.cg = $$1;
      this.cf = $$2;
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
      this.df = $$0;
   }

   public boolean s() {
      return this.df;
   }

   public void x(boolean $$0) {
      this.dg = $$0;
   }

   public boolean t() {
      return this.dg;
   }

   @Override
   public void a(awx $$0, float $$1, float $$2) {
      this.dV().a(this.dA(), this.dC(), this.dG(), $$0, this.dm(), $$1, $$2, false);
   }

   @Override
   public void a(awx $$0, awz $$1, float $$2, float $$3) {
      this.dV().a(this.dA(), this.dC(), this.dG(), $$0, $$1, $$2, $$3, false);
   }

   @Override
   public void c(bvb $$0) {
      dak $$1 = this.b($$0);
      if (!$$1.f() && !this.fz()) {
         super.c($$0);
         this.cY = true;
         this.cZ = $$0;
      }
   }

   @Override
   public boolean fz() {
      return this.cY;
   }

   @Override
   public void fF() {
      super.fF();
      this.cY = false;
   }

   @Override
   public bvb fA() {
      return Objects.requireNonNullElse(this.cZ, bvb.a);
   }

   @Override
   public void a(aku<?> $$0) {
      super.a($$0);
      if (aC.equals($$0)) {
         boolean $$1 = (this.al.a(aC) & 1) > 0;
         bvb $$2 = (this.al.a(aC) & 2) > 0 ? bvb.b : bvb.a;
         if ($$1 && !this.cY) {
            this.c($$2);
         } else if (!$$1 && this.cY) {
            this.fF();
         }
      }

      if (am.equals($$0) && this.fJ() && !this.dd) {
         this.cq.ak().a((hon)(new hod(this)));
      }
   }

   @Nullable
   public byp u() {
      if (this.dl() instanceof byp $$0 && $$0.a()) {
         return $$0;
      }

      return null;
   }

   public float x() {
      return this.cX;
   }

   @Override
   public boolean W() {
      return this.cq.aT();
   }

   @Override
   public void a(eac $$0, boolean $$1) {
      if ($$0 instanceof dzp $$2) {
         this.cq.a(new gbd($$2, $$1, this.cq.aT()));
      } else {
         this.cq.a(new gbq($$0, $$1, this.cq.aT()));
      }
   }

   @Override
   public void a(dji $$0) {
      this.cq.a(new gbn($$0));
   }

   @Override
   public void a(dyz $$0) {
      this.cq.a(new gaq($$0));
   }

   @Override
   public void a(eah $$0) {
      this.cq.a(new gbu($$0));
   }

   @Override
   public void a(eai $$0) {
      this.cq.a(new gbv($$0));
   }

   @Override
   public void a(eaj $$0) {
      this.cq.a(new gbw($$0));
   }

   @Override
   public void a(dzs $$0) {
      this.cq.a(new gbi($$0));
   }

   @Override
   public void a(dak $$0, bvb $$1) {
      ddt $$2 = $$0.a(kl.U);
      if ($$2 != null) {
         this.cq.a(new gam(this, $$0, $$1, $$2));
      }
   }

   @Override
   public void b(bxe $$0) {
      this.cq.g.a($$0, lz.f);
   }

   @Override
   public void c(bxe $$0) {
      this.cq.g.a($$0, lz.r);
   }

   @Override
   public boolean cc() {
      return this.k.a.f();
   }

   @Override
   public boolean ch() {
      return this.cQ;
   }

   public boolean y() {
      return this.ch() || this.cl();
   }

   @Override
   public void fq() {
      if (this.z()) {
         fgb $$0 = this.a(this.k.b());
         this.bg = $$0.j;
         this.bi = $$0.k;
         this.bf = this.k.a.e();
         this.cu = this.cs;
         this.cv = this.ct;
         this.ct = this.ct + (this.dN() - this.ct) * 0.5F;
         this.cs = this.cs + (this.dL() - this.cs) * 0.5F;
      } else {
         super.fq();
      }
   }

   private fgb a(fgb $$0) {
      if ($$0.c() == 0.0F) {
         return $$0;
      } else {
         fgb $$1 = $$0.a(0.98F);
         if (this.fz() && !this.bY()) {
            $$1 = $$1.a(0.2F);
         }

         if (this.y()) {
            float $$2 = (float)this.h(bzl.z);
            $$1 = $$1.a($$2);
         }

         return b($$1);
      }
   }

   private static fgb b(fgb $$0) {
      float $$1 = $$0.b();
      if ($$1 <= 0.0F) {
         return $$0;
      } else {
         fgb $$2 = $$0.a(1.0F / $$1);
         float $$3 = c($$2);
         float $$4 = Math.min($$1 * $$3, 1.0F);
         return $$2.a($$4);
      }
   }

   private static float c(fgb $$0) {
      float $$1 = Math.abs($$0.j);
      float $$2 = Math.abs($$0.k);
      float $$3 = $$2 > $$1 ? $$1 / $$2 : $$2 / $$1;
      return azz.c(1.0F + azz.l($$3));
   }

   protected boolean z() {
      return this.cq.ao() == this;
   }

   public void A() {
      this.b(byr.a);
      if (this.dV() != null) {
         for (double $$0 = this.dC(); $$0 > (double)this.dV().K_() && $$0 <= (double)this.dV().ao(); $$0++) {
            this.a_(this.dA(), $$0, this.dG());
            if (this.dV().g(this)) {
               break;
            }
         }

         this.i(fgc.c);
         this.x(0.0F);
      }

      this.d(this.eU());
      this.aP = 0;
   }

   @Override
   public void d_() {
      if (this.cr > 0) {
         this.cr--;
      }

      if (!(this.cq.z instanceof fzo)) {
         this.y(this.B() == dtn.a.a);
         this.L();
      }

      boolean $$0 = this.k.a.e();
      boolean $$1 = this.k.a.f();
      boolean $$2 = this.k.c();
      cse $$3 = this.gk();
      this.cQ = !$$3.b && !this.cj() && !this.bY() && this.h(byr.f) && (this.cc() || !this.fR() && !this.h(byr.a));
      this.k.a();
      this.cq.aB().a(this.k);
      boolean $$4 = false;
      if (this.dc > 0) {
         this.dc--;
         $$4 = true;
         this.k.d();
      }

      if (!this.ad) {
         this.c(this.dA() - (double)this.dq() * 0.35, this.dG() + (double)this.dq() * 0.35);
         this.c(this.dA() - (double)this.dq() * 0.35, this.dG() - (double)this.dq() * 0.35);
         this.c(this.dA() + (double)this.dq() * 0.35, this.dG() - (double)this.dq() * 0.35);
         this.c(this.dA() + (double)this.dq() * 0.35, this.dG() + (double)this.dq() * 0.35);
      }

      if ($$1 || this.fz() && !this.bY() || this.k.a.b()) {
         this.cr = 0;
      }

      if (this.R()) {
         if (!$$2) {
            if (this.cr > 0) {
               this.h(true);
            } else {
               this.cr = 7;
            }
         }

         if (this.k.a.g()) {
            this.h(true);
         }
      }

      if (this.ci()) {
         if (this.cj()) {
            if (this.N()) {
               this.h(false);
            }
         } else if (this.M()) {
            this.h(false);
         }
      }

      boolean $$5 = false;
      if ($$3.c) {
         if (this.cq.r.g()) {
            if (!$$3.b) {
               $$3.b = true;
               $$5 = true;
               this.w();
            }
         } else if (!$$0 && this.k.a.e() && !$$4) {
            if (this.bT == 0) {
               this.bT = 7;
            } else if (!this.cj()) {
               $$3.b = !$$3.b;
               if ($$3.b && this.aH()) {
                  this.r();
               }

               $$5 = true;
               this.w();
               this.bT = 0;
            }
         }
      }

      if (this.k.a.e() && !$$5 && !$$0 && !this.k_() && this.gq()) {
         this.j.b(new aih(this, aih.a.i));
      }

      this.dd = this.fJ();
      if (this.bi() && this.k.a.f() && this.em()) {
         this.fj();
      }

      if (this.a(axs.a)) {
         int $$6 = this.ak() ? 10 : 1;
         this.de = azz.a(this.de + $$6, 0, 600);
      } else if (this.de > 0) {
         this.a(axs.a);
         this.de = azz.a(this.de - 10, 0, 600);
      }

      if ($$3.b && this.z()) {
         int $$7 = 0;
         if (this.k.a.f()) {
            $$7--;
         }

         if (this.k.a.e()) {
            $$7++;
         }

         if ($$7 != 0) {
            this.i(this.dy().b(0.0, (double)((float)$$7 * $$3.a() * 3.0F), 0.0));
         }
      }

      byp $$8 = this.u();
      if ($$8 != null && $$8.c() == 0) {
         if (this.cW < 0) {
            this.cW++;
            if (this.cW == 0) {
               this.cX = 0.0F;
            }
         }

         if ($$0 && !this.k.a.e()) {
            this.cW = -10;
            $$8.b(azz.d(this.x() * 100.0F));
            this.h();
         } else if (!$$0 && this.k.a.e()) {
            this.cW = 0;
            this.cX = 0.0F;
         } else if ($$0) {
            this.cW++;
            if (this.cW < 10) {
               this.cX = (float)this.cW * 0.1F;
            } else {
               this.cX = 0.8F + 2.0F / (float)(this.cW - 9) * 0.1F;
            }
         }
      } else {
         this.cX = 0.0F;
      }

      super.d_();
      if (this.aH() && $$3.b && !this.cq.r.g()) {
         $$3.b = false;
         this.w();
      }
   }

   private boolean M() {
      return this.O() || this.bY() && !this.a(this.dk()) || !this.k.c() || !this.S() || this.P && !this.S || this.bi() && !this.bm();
   }

   private boolean N() {
      return this.O() || this.bY() && !this.a(this.dk()) || !this.bi() || !this.k.c() && !this.aH() && !this.k.a.f() || !this.S();
   }

   private boolean O() {
      return this.b(bwk.o);
   }

   public dtn.a B() {
      return this.as == null ? dtn.a.b : this.as.a();
   }

   @Override
   protected void en() {
      this.aP++;
      if (this.aP == 20) {
         this.a(bxe.d.a);
      }
   }

   private void y(boolean $$0) {
      this.cx = this.cw;
      float $$1 = 0.0F;
      if ($$0 && this.as != null && this.as.e()) {
         if (this.cq.z != null && !this.cq.z.k() && !(this.cq.z instanceof fyu) && !(this.cq.z instanceof fzt)) {
            if (this.cq.z instanceof gaf) {
               this.o();
            }

            this.cq.a(null);
         }

         if (this.cw == 0.0F) {
            this.cq.ak().a(hoi.b(awy.vx, this.ae.i() * 0.4F + 0.8F, 0.25F));
         }

         $$1 = 0.0125F;
         this.as.a(false);
      } else if (this.cw > 0.0F) {
         $$1 = -0.05F;
      }

      this.cw = azz.a(this.cw + $$1, 0.0F, 1.0F);
   }

   @Override
   public void q() {
      super.q();
      this.da = false;
      if (this.dl() instanceof cut $$0) {
         $$0.a(this.k.a.c(), this.k.a.d(), this.k.a.a(), this.k.a.b());
         this.da = this.da | (this.k.a.c() || this.k.a.d() || this.k.a.a() || this.k.a.b());
      }
   }

   public boolean C() {
      return this.da;
   }

   @Override
   public void a(byj $$0, fgc $$1) {
      double $$2 = this.dA();
      double $$3 = this.dG();
      super.a($$0, $$1);
      float $$4 = (float)(this.dA() - $$2);
      float $$5 = (float)(this.dG() - $$3);
      this.f($$4, $$5);
      this.g = this.g + azz.f($$4, $$5) * 0.6F;
   }

   public boolean D() {
      return this.db;
   }

   @Override
   public boolean gR() {
      return this.cq.n.K().c();
   }

   @Override
   protected void f(float $$0, float $$1) {
      if (this.P()) {
         fgc $$2 = this.dt();
         fgc $$3 = $$2.b((double)$$0, 0.0, (double)$$1);
         fgc $$4 = new fgc((double)$$0, 0.0, (double)$$1);
         float $$5 = this.fo();
         float $$6 = (float)$$4.h();
         if ($$6 <= 0.001F) {
            fgb $$7 = this.k.b();
            float $$8 = $$5 * $$7.j;
            float $$9 = $$5 * $$7.k;
            float $$10 = azz.a(this.dL() * (float) (Math.PI / 180.0));
            float $$11 = azz.b(this.dL() * (float) (Math.PI / 180.0));
            $$4 = new fgc((double)($$8 * $$11 - $$9 * $$10), $$4.e, (double)($$9 * $$11 + $$8 * $$10));
            $$6 = (float)$$4.h();
            if ($$6 <= 0.001F) {
               return;
            }
         }

         float $$12 = azz.j($$6);
         fgc $$13 = $$4.c((double)$$12);
         fgc $$14 = this.bU();
         float $$15 = (float)($$14.d * $$13.d + $$14.f * $$13.f);
         if (!($$15 < -0.15F)) {
            fgh $$16 = fgh.a(this);
            iw $$17 = iw.a(this.dA(), this.cR().e, this.dG());
            ebq $$18 = this.dV().a_($$17);
            if ($$18.b(this.dV(), $$17, $$16).c()) {
               $$17 = $$17.d();
               ebq $$19 = this.dV().a_($$17);
               if ($$19.b(this.dV(), $$17, $$16).c()) {
                  float $$20 = 7.0F;
                  float $$21 = 1.2F;
                  if (this.b(bwk.h)) {
                     $$21 += (float)(this.c(bwk.h).e() + 1) * 0.75F;
                  }

                  float $$22 = Math.max($$5 * 7.0F, 1.0F / $$12);
                  fgc $$24 = $$3.e($$13.c((double)$$22));
                  float $$25 = this.dq();
                  float $$26 = this.dr();
                  ffx $$27 = new ffx($$2, $$24.b(0.0, (double)$$26, 0.0)).c((double)$$25, 0.0, (double)$$25);
                  fgc $$23 = $$2.b(0.0, 0.51F, 0.0);
                  $$24 = $$24.b(0.0, 0.51F, 0.0);
                  fgc $$28 = $$13.c(new fgc(0.0, 1.0, 0.0));
                  fgc $$29 = $$28.c((double)($$25 * 0.5F));
                  fgc $$30 = $$23.d($$29);
                  fgc $$31 = $$24.d($$29);
                  fgc $$32 = $$23.e($$29);
                  fgc $$33 = $$24.e($$29);
                  Iterable<fgw> $$34 = this.dV().d(this, $$27);
                  Iterator<ffx> $$35 = StreamSupport.stream($$34.spliterator(), false).flatMap($$0x -> $$0x.e().stream()).iterator();
                  float $$36 = Float.MIN_VALUE;

                  while ($$35.hasNext()) {
                     ffx $$37 = $$35.next();
                     if ($$37.a($$30, $$31) || $$37.a($$32, $$33)) {
                        $$36 = (float)$$37.e;
                        fgc $$38 = $$37.f();
                        iw $$39 = iw.a((jq)$$38);

                        for (int $$40 = 1; (float)$$40 < $$21; $$40++) {
                           iw $$41 = $$39.b($$40);
                           ebq $$42 = this.dV().a_($$41);
                           fgw $$43;
                           if (!($$43 = $$42.b(this.dV(), $$41, $$16)).c()) {
                              $$36 = (float)$$43.c(jc.a.b) + (float)$$41.v();
                              if ((double)$$36 - this.dC() > (double)$$21) {
                                 return;
                              }
                           }

                           if ($$40 > 1) {
                              $$17 = $$17.d();
                              ebq $$44 = this.dV().a_($$17);
                              if (!$$44.b(this.dV(), $$17, $$16).c()) {
                                 return;
                              }
                           }
                        }
                        break;
                     }
                  }

                  if ($$36 != Float.MIN_VALUE) {
                     float $$45 = (float)((double)$$36 - this.dC());
                     if (!($$45 <= 0.5F) && !($$45 > $$21)) {
                        this.dc = 1;
                     }
                  }
               }
            }
         }
      }
   }

   @Override
   protected boolean d(fgc $$0) {
      float $$1 = this.dL() * (float) (Math.PI / 180.0);
      double $$2 = (double)azz.a($$1);
      double $$3 = (double)azz.b($$1);
      double $$4 = (double)this.bg * $$3 - (double)this.bi * $$2;
      double $$5 = (double)this.bi * $$3 + (double)this.bg * $$2;
      double $$6 = azz.k($$4) + azz.k($$5);
      double $$7 = azz.k($$0.d) + azz.k($$0.f);
      if (!($$6 < 1.0E-5F) && !($$7 < 1.0E-5F)) {
         double $$8 = $$4 * $$0.d + $$5 * $$0.f;
         double $$9 = Math.acos($$8 / Math.sqrt($$6 * $$7));
         return $$9 < 0.13962634F;
      } else {
         return false;
      }
   }

   private boolean P() {
      return this.D() && this.dc <= 0 && this.aH() && !this.ga() && !this.bY() && this.Q() && (double)this.aR() >= 1.0;
   }

   private boolean Q() {
      return this.k.b().c() > 0.0F;
   }

   private boolean R() {
      return !this.ci()
         && this.k.c()
         && this.S()
         && !this.fz()
         && !this.O()
         && (!this.bY() || this.a(this.dk()))
         && (!this.fJ() || this.bm())
         && (!this.y() || this.bm())
         && (!this.bi() || this.bm());
   }

   private boolean a(bxe $$0) {
      return $$0.dO() && $$0.dg();
   }

   private boolean S() {
      return this.bY() || (float)this.gu().a() > 6.0F || this.gk().c;
   }

   public float E() {
      if (!this.a(axs.a)) {
         return 0.0F;
      } else {
         float $$0 = 600.0F;
         float $$1 = 100.0F;
         if ((float)this.de >= 600.0F) {
            return 1.0F;
         } else {
            float $$2 = azz.a((float)this.de / 100.0F, 0.0F, 1.0F);
            float $$3 = (float)this.de < 100.0F ? 0.0F : azz.a(((float)this.de - 100.0F) / 500.0F, 0.0F, 1.0F);
            return $$2 * 0.6F + $$3 * 0.39999998F;
         }
      }
   }

   public void a(dkg $$0) {
      if ($$0 == dkg.d) {
         this.i(this.dy().a(jc.a.b, 0.0));
      }
   }

   @Override
   public boolean bm() {
      return this.ce;
   }

   @Override
   protected boolean gb() {
      boolean $$0 = this.ce;
      boolean $$1 = super.gb();
      if (this.ak()) {
         return this.ce;
      } else {
         if (!$$0 && $$1) {
            this.dV().a(this.dA(), this.dC(), this.dG(), awy.x, awz.i, 1.0F, 1.0F, false);
            this.cq.ak().a((hon)(new hoq.b(this)));
         }

         if ($$0 && !$$1) {
            this.dV().a(this.dA(), this.dC(), this.dG(), awy.y, awz.i, 1.0F, 1.0F, false);
         }

         return this.ce;
      }
   }

   @Override
   public fgc v(float $$0) {
      if (this.cq.n.aE().a()) {
         float $$1 = azz.h($$0 * 0.5F, this.dL(), this.N) * (float) (Math.PI / 180.0);
         float $$2 = azz.h($$0 * 0.5F, this.dN(), this.O) * (float) (Math.PI / 180.0);
         double $$3 = this.fy() == bxw.b ? -1.0 : 1.0;
         fgc $$4 = new fgc(0.39 * $$3, -0.6, 0.3);
         return $$4.a(-$$2).b(-$$1).e(this.n($$0));
      } else {
         return super.v($$0);
      }
   }

   @Override
   public void a(dak $$0, dak $$1, cwl $$2) {
      this.cq.aB().a($$0, $$1, $$2);
   }

   @Override
   public float dM() {
      return this.dL();
   }

   @Override
   public void g(dak $$0) {
      this.cq.r.a($$0);
   }

   @Override
   public boolean gn() {
      return this.cG.c();
   }

   public bbb G() {
      return this.cG;
   }
}
