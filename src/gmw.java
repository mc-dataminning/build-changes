import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gmw extends gmt {
   public static final Logger h = LogUtils.getLogger();
   private static final int cw = 20;
   private static final int cx = 600;
   private static final int cy = 100;
   private static final float cz = 0.6F;
   private static final double cA = 0.35;
   private static final double cB = 0.13962634F;
   public static final float i = 0.2F;
   public final gia j;
   private final awv cC;
   private final fmo cD;
   private final bak cE = new bak(20, 1280);
   private final List<hjz> cF = Lists.newArrayList();
   private int cG = 0;
   private double cH;
   private double cI;
   private double cJ;
   private float cK;
   private float cL;
   private boolean cM;
   private boolean cN;
   private boolean cO;
   private boolean cP;
   private boolean cQ;
   private int cR;
   private boolean cS;
   public gmu k = new gmu();
   private cqg cT = cqg.b;
   protected final fnd co;
   protected int cp;
   public float cq;
   public float cr;
   public float cs;
   public float ct;
   private int cU;
   private float cV;
   public float cu;
   public float cv;
   private boolean cW;
   @Nullable
   private btp cX;
   private boolean cY;
   private boolean cZ = true;
   private int da;
   private boolean db;
   private int dc;
   private boolean dd = true;
   private boolean de = false;

   public gmw(fnd $$0, ghz $$1, gia $$2, awv $$3, fmo $$4, boolean $$5, boolean $$6) {
      super($$1, $$2.o());
      this.co = $$0;
      this.j = $$2;
      this.cC = $$3;
      this.cD = $$4;
      this.cP = $$5;
      this.cQ = $$6;
      this.cF.add(new hkr(this, $$0.ak()));
      this.cF.add(new hke(this));
      this.cF.add(new hkd(this, $$0.ak(), $$1.D_()));
   }

   @Override
   public void c(float $$0) {
   }

   @Override
   public boolean a(bvs $$0, boolean $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         if ($$0 instanceof csh) {
            this.co.ak().a((hkp)(new hkj(this, (csh)$$0, true)));
            this.co.ak().a((hkp)(new hkj(this, (csh)$$0, false)));
         }

         return true;
      }
   }

   @Override
   public void ae() {
      super.ae();
      this.cY = false;
   }

   @Override
   public float i(float $$0) {
      return this.dN();
   }

   @Override
   public float j(float $$0) {
      return this.bZ() ? super.j($$0) : this.dL();
   }

   @Override
   public void h() {
      this.gJ();
      if (this.gI()) {
         this.cE.b();
         super.h();
         this.H();
         if (!this.cT.equals(this.k.a)) {
            this.j.b(new ahu(this.k.a));
            this.cT = this.k.a;
         }

         if (this.bZ()) {
            this.j.b(new ahl.c(this.dL(), this.dN(), this.aJ(), this.P));
            bvs $$0 = this.df();
            if ($$0 != this && $$0.dg()) {
               this.j.b(ahm.a($$0));
               this.I();
            }
         } else {
            this.F();
         }

         for (hjz $$1 : this.cF) {
            $$1.a();
         }
      }
   }

   public float d() {
      for (hjz $$0 : this.cF) {
         if ($$0 instanceof hkd) {
            return ((hkd)$$0).b();
         }
      }

      return 0.0F;
   }

   private void F() {
      this.I();
      if (this.y()) {
         double $$0 = this.dA() - this.cH;
         double $$1 = this.dC() - this.cI;
         double $$2 = this.dG() - this.cJ;
         double $$3 = (double)(this.dL() - this.cK);
         double $$4 = (double)(this.dN() - this.cL);
         this.cR++;
         boolean $$5 = azk.f($$0, $$1, $$2) > azk.k(2.0E-4) || this.cR >= 20;
         boolean $$6 = $$3 != 0.0 || $$4 != 0.0;
         if ($$5 && $$6) {
            this.j.b(new ahl.b(this.dA(), this.dC(), this.dG(), this.dL(), this.dN(), this.aJ(), this.P));
         } else if ($$5) {
            this.j.b(new ahl.a(this.dA(), this.dC(), this.dG(), this.aJ(), this.P));
         } else if ($$6) {
            this.j.b(new ahl.c(this.dL(), this.dN(), this.aJ(), this.P));
         } else if (this.cM != this.aJ() || this.cN != this.P) {
            this.j.b(new ahl.d(this.aJ(), this.P));
         }

         if ($$5) {
            this.cH = this.dA();
            this.cI = this.dC();
            this.cJ = this.dG();
            this.cR = 0;
         }

         if ($$6) {
            this.cK = this.dL();
            this.cL = this.dN();
         }

         this.cM = this.aJ();
         this.cN = this.P;
         this.cZ = this.co.n.J().c();
      }
   }

   private void H() {
      boolean $$0 = this.cd();
      if ($$0 != this.cP) {
         aht.a $$1 = $$0 ? aht.a.a : aht.a.b;
         this.j.b(new aht(this, $$1));
         this.cP = $$0;
      }
   }

   private void I() {
      boolean $$0 = this.cj();
      if ($$0 != this.cQ) {
         aht.a $$1 = $$0 ? aht.a.d : aht.a.e;
         this.j.b(new aht(this, $$1));
         this.cQ = $$0;
      }
   }

   public boolean a(boolean $$0) {
      ahs.a $$1 = $$0 ? ahs.a.d : ahs.a.e;
      cxy $$2 = this.gi().a($$0);
      this.j.b(new ahs($$1, jj.c, jo.a));
      return !$$2.f();
   }

   @Override
   public void a(btp $$0) {
      super.a($$0);
      this.j.b(new ail($$0));
   }

   @Override
   public void gf() {
      this.j.b(new agx(agx.a.a));
      fnb.c();
   }

   @Override
   public void p() {
      this.j.b(new ahd(this.bP.l));
      this.e();
   }

   public void e() {
      super.p();
      this.co.a(null);
   }

   public void K(float $$0) {
      if (this.cS) {
         float $$1 = this.eF() - $$0;
         if ($$1 <= 0.0F) {
            this.d($$0);
            if ($$1 < 0.0F) {
               this.aj = 10;
            }
         } else {
            this.bd = $$1;
            this.aj = 20;
            this.d($$0);
            this.aN = 10;
            this.aM = this.aN;
         }
      } else {
         this.d($$0);
         this.cS = true;
      }
   }

   @Override
   public void x() {
      this.j.b(new ahr(this.gj()));
   }

   @Override
   public boolean gg() {
      return true;
   }

   @Override
   public boolean fH() {
      return !this.gj().b && super.fH();
   }

   @Override
   public boolean bu() {
      return !this.gj().b && super.bu();
   }

   protected void f() {
      this.j.b(new aht(this, aht.a.f, azk.d(this.v() * 100.0F)));
   }

   public void i() {
      this.j.b(new aht(this, aht.a.h));
   }

   public awv l() {
      return this.cC;
   }

   public fmo m() {
      return this.cD;
   }

   public void a(ddt $$0) {
      if (this.cD.b($$0)) {
         this.cD.c($$0);
         this.j.b(new ahx($$0));
      }
   }

   @Override
   public int G() {
      return this.cG;
   }

   public void a(int $$0) {
      this.cG = $$0;
   }

   @Override
   public void a(wv $$0, boolean $$1) {
      this.co.aZ().a($$0, $$1);
   }

   private void c(double $$0, double $$1) {
      jj $$2 = jj.a($$0, this.dC(), $$1);
      if (this.c($$2)) {
         double $$3 = $$0 - (double)$$2.u();
         double $$4 = $$1 - (double)$$2.w();
         jo $$5 = null;
         double $$6 = Double.MAX_VALUE;
         jo[] $$7 = new jo[]{jo.e, jo.f, jo.c, jo.d};

         for (jo $$8 : $$7) {
            double $$9 = $$8.o().a($$3, 0.0, $$4);
            double $$10 = $$8.f() == jo.b.a ? 1.0 - $$9 : $$9;
            if ($$10 < $$6 && !this.c($$2.a($$8))) {
               $$6 = $$10;
               $$5 = $$8;
            }
         }

         if ($$5 != null) {
            fcu $$11 = this.dy();
            if ($$5.o() == jo.a.a) {
               this.n(0.1 * (double)$$5.j(), $$11.e, $$11.f);
            } else {
               this.n($$11.d, $$11.e, 0.1 * (double)$$5.l());
            }
         }
      }
   }

   private boolean c(jj $$0) {
      fcp $$1 = this.cR();
      fcp $$2 = new fcp((double)$$0.u(), $$1.b, (double)$$0.w(), (double)$$0.u() + 1.0, $$1.e, (double)$$0.w() + 1.0).h(1.0E-7);
      return this.dV().g(this, $$2);
   }

   public void a(float $$0, int $$1, int $$2) {
      this.cf = $$0;
      this.ce = $$1;
      this.cd = $$2;
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
      this.dd = $$0;
   }

   public boolean n() {
      return this.dd;
   }

   public void x(boolean $$0) {
      this.de = $$0;
   }

   public boolean t() {
      return this.de;
   }

   @Override
   public void a(awj $$0, float $$1, float $$2) {
      this.dV().a(this.dA(), this.dC(), this.dG(), $$0, this.dm(), $$1, $$2, false);
   }

   @Override
   public void a(awj $$0, awl $$1, float $$2, float $$3) {
      this.dV().a(this.dA(), this.dC(), this.dG(), $$0, $$1, $$2, $$3, false);
   }

   @Override
   public void c(btp $$0) {
      cxy $$1 = this.b($$0);
      if (!$$1.f() && !this.fy()) {
         super.c($$0);
         this.cW = true;
         this.cX = $$0;
      }
   }

   @Override
   public boolean fy() {
      return this.cW;
   }

   @Override
   public void fE() {
      super.fE();
      this.cW = false;
   }

   @Override
   public btp fz() {
      return Objects.requireNonNullElse(this.cX, btp.a);
   }

   @Override
   public void a(akg<?> $$0) {
      super.a($$0);
      if (aB.equals($$0)) {
         boolean $$1 = (this.al.a(aB) & 1) > 0;
         btp $$2 = (this.al.a(aB) & 2) > 0 ? btp.b : btp.a;
         if ($$1 && !this.cW) {
            this.c($$2);
         } else if (!$$1 && this.cW) {
            this.fE();
         }
      }

      if (am.equals($$0) && this.fI() && !this.db) {
         this.co.ak().a((hkp)(new hkf(this)));
      }
   }

   @Nullable
   public bxb u() {
      if (this.dl() instanceof bxb $$0 && $$0.a()) {
         return $$0;
      }

      return null;
   }

   public float v() {
      return this.cV;
   }

   @Override
   public boolean aa() {
      return this.co.aT();
   }

   @Override
   public void a(dwz $$0, boolean $$1) {
      if ($$0 instanceof dwm $$2) {
         this.co.a(new fxs($$2, $$1, this.co.aT()));
      } else {
         this.co.a(new fyf($$0, $$1, this.co.aT()));
      }
   }

   @Override
   public void a(dgq $$0) {
      this.co.a(new fyc($$0));
   }

   @Override
   public void a(dvw $$0) {
      this.co.a(new fxf($$0));
   }

   @Override
   public void a(dxe $$0) {
      this.co.a(new fyj($$0));
   }

   @Override
   public void a(dxf $$0) {
      this.co.a(new fyk($$0));
   }

   @Override
   public void a(dxg $$0) {
      this.co.a(new fyl($$0));
   }

   @Override
   public void a(dwp $$0) {
      this.co.a(new fxx($$0));
   }

   @Override
   public void a(cxy $$0, btp $$1) {
      dbd $$2 = $$0.a(kx.U);
      if ($$2 != null) {
         this.co.a(new fxb(this, $$0, $$1, $$2));
      }
   }

   @Override
   public void b(bvs $$0) {
      this.co.g.a($$0, lv.f);
   }

   @Override
   public void c(bvs $$0) {
      this.co.g.a($$0, lv.r);
   }

   @Override
   public boolean cd() {
      return this.k.a.f();
   }

   @Override
   public boolean ci() {
      return this.cO;
   }

   public boolean w() {
      return this.ci() || this.cm();
   }

   @Override
   public void fp() {
      if (this.y()) {
         this.bf = this.k.b().i;
         this.bh = this.k.b().j;
         this.be = this.k.a.e();
         this.cs = this.cq;
         this.ct = this.cr;
         this.cr = this.cr + (this.dN() - this.cr) * 0.5F;
         this.cq = this.cq + (this.dL() - this.cq) * 0.5F;
      }
   }

   protected boolean y() {
      return this.co.ao() == this;
   }

   public void z() {
      this.b(bxd.a);
      if (this.dV() != null) {
         for (double $$0 = this.dC(); $$0 > (double)this.dV().G_() && $$0 <= (double)this.dV().ao(); $$0++) {
            this.a_(this.dA(), $$0, this.dG());
            if (this.dV().g(this)) {
               break;
            }
         }

         this.i(fcu.c);
         this.x(0.0F);
      }

      this.d(this.eT());
      this.aO = 0;
   }

   @Override
   public void k_() {
      if (this.cp > 0) {
         this.cp--;
      }

      if (!(this.co.z instanceof fwd)) {
         this.y(this.A() == dqr.a.a);
         this.M();
      }

      boolean $$0 = this.k.a.e();
      boolean $$1 = this.k.a.f();
      boolean $$2 = this.Q();
      cqe $$3 = this.gj();
      this.cO = !$$3.b && !this.ck() && !this.bZ() && this.h(bxd.f) && (this.cd() || !this.fQ() && !this.h(bxd.a));
      this.k.a();
      this.co.aB().a(this.k);
      if (this.J()) {
         this.h(false);
      }

      if (this.fy() && !this.bZ()) {
         this.k.a(0.2F);
         this.cp = 0;
      }

      if (this.w()) {
         float $$4 = (float)this.h(bxx.z);
         this.k.a($$4);
      }

      boolean $$5 = false;
      if (this.da > 0) {
         this.da--;
         $$5 = true;
         this.k.d();
      }

      if (!this.ad) {
         this.c(this.dA() - (double)this.dq() * 0.35, this.dG() + (double)this.dq() * 0.35);
         this.c(this.dA() - (double)this.dq() * 0.35, this.dG() - (double)this.dq() * 0.35);
         this.c(this.dA() + (double)this.dq() * 0.35, this.dG() - (double)this.dq() * 0.35);
         this.c(this.dA() + (double)this.dq() * 0.35, this.dG() + (double)this.dq() * 0.35);
      }

      if ($$1) {
         this.cp = 0;
      }

      boolean $$6 = this.P();
      boolean $$7 = this.bZ() ? this.dk().aJ() : this.aJ();
      boolean $$8 = !$$1 && !$$2;
      if (($$7 || this.bn()) && $$8 && $$6) {
         if (this.cp <= 0 && !this.co.n.B.e()) {
            this.cp = 7;
         } else {
            this.h(true);
         }
      }

      if ((!this.bj() || this.bn()) && $$6 && this.co.n.B.e()) {
         this.h(true);
      }

      if (this.cj()) {
         boolean $$9 = !this.k.c() || !this.R();
         boolean $$10 = $$9 || this.P && !this.S || this.bj() && !this.bn();
         if (this.ck()) {
            if (!this.aJ() && !this.k.a.f() && $$9 || !this.bj()) {
               this.h(false);
            }
         } else if ($$10) {
            this.h(false);
         }
      }

      boolean $$11 = false;
      if ($$3.c) {
         if (this.co.r.g()) {
            if (!$$3.b) {
               $$3.b = true;
               $$11 = true;
               this.x();
            }
         } else if (!$$0 && this.k.a.e() && !$$5) {
            if (this.bR == 0) {
               this.bR = 7;
            } else if (!this.ck()) {
               $$3.b = !$$3.b;
               if ($$3.b && this.aJ()) {
                  this.s();
               }

               $$11 = true;
               this.x();
               this.bR = 0;
            }
         }
      }

      if (this.k.a.e() && !$$11 && !$$0 && !this.d_() && this.gp()) {
         this.j.b(new aht(this, aht.a.i));
      }

      this.db = this.fI();
      if (this.bj() && this.k.a.f() && this.el()) {
         this.fi();
      }

      if (this.a(axf.a)) {
         int $$12 = this.U_() ? 10 : 1;
         this.dc = azk.a(this.dc + $$12, 0, 600);
      } else if (this.dc > 0) {
         this.a(axf.a);
         this.dc = azk.a(this.dc - 10, 0, 600);
      }

      if ($$3.b && this.y()) {
         int $$13 = 0;
         if (this.k.a.f()) {
            $$13--;
         }

         if (this.k.a.e()) {
            $$13++;
         }

         if ($$13 != 0) {
            this.i(this.dy().b(0.0, (double)((float)$$13 * $$3.a() * 3.0F), 0.0));
         }
      }

      bxb $$14 = this.u();
      if ($$14 != null && $$14.c() == 0) {
         if (this.cU < 0) {
            this.cU++;
            if (this.cU == 0) {
               this.cV = 0.0F;
            }
         }

         if ($$0 && !this.k.a.e()) {
            this.cU = -10;
            $$14.b(azk.d(this.v() * 100.0F));
            this.f();
         } else if (!$$0 && this.k.a.e()) {
            this.cU = 0;
            this.cV = 0.0F;
         } else if ($$0) {
            this.cU++;
            if (this.cU < 10) {
               this.cV = (float)this.cU * 0.1F;
            } else {
               this.cV = 0.8F + 2.0F / (float)(this.cU - 9) * 0.1F;
            }
         }
      } else {
         this.cV = 0.0F;
      }

      super.k_();
      if (this.aJ() && $$3.b && !this.co.r.g()) {
         $$3.b = false;
         this.x();
      }
   }

   private boolean J() {
      return this.L() || this.w() || this.fI() && !this.bn() || this.bZ() && !this.a(this.dk()) || this.fy() && !this.bZ() && !this.bn();
   }

   private boolean L() {
      return this.b(buy.o);
   }

   public dqr.a A() {
      return this.as == null ? dqr.a.b : this.as.a();
   }

   @Override
   protected void em() {
      this.aO++;
      if (this.aO == 20) {
         this.a(bvs.e.a);
      }
   }

   private void y(boolean $$0) {
      this.cv = this.cu;
      float $$1 = 0.0F;
      if ($$0 && this.as != null && this.as.e()) {
         if (this.co.z != null && !this.co.z.k() && !(this.co.z instanceof fvj) && !(this.co.z instanceof fwi)) {
            if (this.co.z instanceof fwu) {
               this.p();
            }

            this.co.a(null);
         }

         if (this.cu == 0.0F) {
            this.co.ak().a(hkk.b(awk.vt, this.ae.i() * 0.4F + 0.8F, 0.25F));
         }

         $$1 = 0.0125F;
         this.as.a(false);
      } else if (this.cu > 0.0F) {
         $$1 = -0.05F;
      }

      this.cu = azk.a(this.cu + $$1, 0.0F, 1.0F);
   }

   @Override
   public void r() {
      super.r();
      this.cY = false;
      if (this.dl() instanceof csf $$0) {
         $$0.a(this.k.a.c(), this.k.a.d(), this.k.a.a(), this.k.a.b());
         this.cY = this.cY | (this.k.a.c() || this.k.a.d() || this.k.a.a() || this.k.a.b());
      }
   }

   public boolean B() {
      return this.cY;
   }

   @Override
   public void a(bwv $$0, fcu $$1) {
      double $$2 = this.dA();
      double $$3 = this.dG();
      super.a($$0, $$1);
      float $$4 = (float)(this.dA() - $$2);
      float $$5 = (float)(this.dG() - $$3);
      this.f($$4, $$5);
      this.g = this.g + azk.f($$4, $$5) * 0.6F;
   }

   public boolean C() {
      return this.cZ;
   }

   @Override
   public boolean gP() {
      return this.co.n.K().c();
   }

   @Override
   protected void f(float $$0, float $$1) {
      if (this.N()) {
         fcu $$2 = this.dt();
         fcu $$3 = $$2.b((double)$$0, 0.0, (double)$$1);
         fcu $$4 = new fcu((double)$$0, 0.0, (double)$$1);
         float $$5 = this.fn();
         float $$6 = (float)$$4.h();
         if ($$6 <= 0.001F) {
            fct $$7 = this.k.b();
            float $$8 = $$5 * $$7.i;
            float $$9 = $$5 * $$7.j;
            float $$10 = azk.a(this.dL() * (float) (Math.PI / 180.0));
            float $$11 = azk.b(this.dL() * (float) (Math.PI / 180.0));
            $$4 = new fcu((double)($$8 * $$11 - $$9 * $$10), $$4.e, (double)($$9 * $$11 + $$8 * $$10));
            $$6 = (float)$$4.h();
            if ($$6 <= 0.001F) {
               return;
            }
         }

         float $$12 = azk.j($$6);
         fcu $$13 = $$4.c((double)$$12);
         fcu $$14 = this.bV();
         float $$15 = (float)($$14.d * $$13.d + $$14.f * $$13.f);
         if (!($$15 < -0.15F)) {
            fcz $$16 = fcz.a(this);
            jj $$17 = jj.a(this.dA(), this.cR().e, this.dG());
            dym $$18 = this.dV().a_($$17);
            if ($$18.b(this.dV(), $$17, $$16).c()) {
               $$17 = $$17.d();
               dym $$19 = this.dV().a_($$17);
               if ($$19.b(this.dV(), $$17, $$16).c()) {
                  float $$20 = 7.0F;
                  float $$21 = 1.2F;
                  if (this.b(buy.h)) {
                     $$21 += (float)(this.c(buy.h).e() + 1) * 0.75F;
                  }

                  float $$22 = Math.max($$5 * 7.0F, 1.0F / $$12);
                  fcu $$24 = $$3.e($$13.c((double)$$22));
                  float $$25 = this.dq();
                  float $$26 = this.dr();
                  fcp $$27 = new fcp($$2, $$24.b(0.0, (double)$$26, 0.0)).c((double)$$25, 0.0, (double)$$25);
                  fcu $$23 = $$2.b(0.0, 0.51F, 0.0);
                  $$24 = $$24.b(0.0, 0.51F, 0.0);
                  fcu $$28 = $$13.c(new fcu(0.0, 1.0, 0.0));
                  fcu $$29 = $$28.c((double)($$25 * 0.5F));
                  fcu $$30 = $$23.d($$29);
                  fcu $$31 = $$24.d($$29);
                  fcu $$32 = $$23.e($$29);
                  fcu $$33 = $$24.e($$29);
                  Iterable<fdo> $$34 = this.dV().d(this, $$27);
                  Iterator<fcp> $$35 = StreamSupport.stream($$34.spliterator(), false).flatMap($$0x -> $$0x.e().stream()).iterator();
                  float $$36 = Float.MIN_VALUE;

                  while ($$35.hasNext()) {
                     fcp $$37 = $$35.next();
                     if ($$37.a($$30, $$31) || $$37.a($$32, $$33)) {
                        $$36 = (float)$$37.e;
                        fcu $$38 = $$37.f();
                        jj $$39 = jj.a((kc)$$38);

                        for (int $$40 = 1; (float)$$40 < $$21; $$40++) {
                           jj $$41 = $$39.b($$40);
                           dym $$42 = this.dV().a_($$41);
                           fdo $$43;
                           if (!($$43 = $$42.b(this.dV(), $$41, $$16)).c()) {
                              $$36 = (float)$$43.c(jo.a.b) + (float)$$41.v();
                              if ((double)$$36 - this.dC() > (double)$$21) {
                                 return;
                              }
                           }

                           if ($$40 > 1) {
                              $$17 = $$17.d();
                              dym $$44 = this.dV().a_($$17);
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
                        this.da = 1;
                     }
                  }
               }
            }
         }
      }
   }

   @Override
   protected boolean d(fcu $$0) {
      float $$1 = this.dL() * (float) (Math.PI / 180.0);
      double $$2 = (double)azk.a($$1);
      double $$3 = (double)azk.b($$1);
      double $$4 = (double)this.bf * $$3 - (double)this.bh * $$2;
      double $$5 = (double)this.bh * $$3 + (double)this.bf * $$2;
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

   private boolean N() {
      return this.C() && this.da <= 0 && this.aJ() && !this.fZ() && !this.bZ() && this.O() && (double)this.aS() >= 1.0;
   }

   private boolean O() {
      return this.k.b().c() > 0.0F;
   }

   private boolean P() {
      return !this.cj()
         && this.Q()
         && this.R()
         && !this.fy()
         && !this.L()
         && (!this.bZ() || this.a(this.dk()))
         && (!this.fI() || this.bn())
         && (!this.w() || this.bn());
   }

   private boolean a(bvs $$0) {
      return $$0.dO() && $$0.dg();
   }

   private boolean Q() {
      double $$0 = 0.8;
      return this.k.c() && (this.bn() || (double)this.k.b().b() >= 0.8);
   }

   private boolean R() {
      return this.bZ() || (float)this.gt().a() > 6.0F || this.gj().c;
   }

   public float D() {
      if (!this.a(axf.a)) {
         return 0.0F;
      } else {
         float $$0 = 600.0F;
         float $$1 = 100.0F;
         if ((float)this.dc >= 600.0F) {
            return 1.0F;
         } else {
            float $$2 = azk.a((float)this.dc / 100.0F, 0.0F, 1.0F);
            float $$3 = (float)this.dc < 100.0F ? 0.0F : azk.a(((float)this.dc - 100.0F) / 500.0F, 0.0F, 1.0F);
            return $$2 * 0.6F + $$3 * 0.39999998F;
         }
      }
   }

   public void a(dhm $$0) {
      if ($$0 == dhm.d) {
         this.i(this.dy().a(jo.a.b, 0.0));
      }
   }

   @Override
   public boolean bn() {
      return this.cc;
   }

   @Override
   protected boolean ga() {
      boolean $$0 = this.cc;
      boolean $$1 = super.ga();
      if (this.U_()) {
         return this.cc;
      } else {
         if (!$$0 && $$1) {
            this.dV().a(this.dA(), this.dC(), this.dG(), awk.x, awl.i, 1.0F, 1.0F, false);
            this.co.ak().a((hkp)(new hks.b(this)));
         }

         if ($$0 && !$$1) {
            this.dV().a(this.dA(), this.dC(), this.dG(), awk.y, awl.i, 1.0F, 1.0F, false);
         }

         return this.cc;
      }
   }

   @Override
   public fcu v(float $$0) {
      if (this.co.n.aE().a()) {
         float $$1 = azk.h($$0 * 0.5F, this.dL(), this.N) * (float) (Math.PI / 180.0);
         float $$2 = azk.h($$0 * 0.5F, this.dN(), this.O) * (float) (Math.PI / 180.0);
         double $$3 = this.fx() == bwk.b ? -1.0 : 1.0;
         fcu $$4 = new fcu(0.39 * $$3, -0.6, 0.3);
         return $$4.a(-$$2).b(-$$1).e(this.n($$0));
      } else {
         return super.v($$0);
      }
   }

   @Override
   public void a(cxy $$0, cxy $$1, ctx $$2) {
      this.co.aB().a($$0, $$1, $$2);
   }

   @Override
   public float dM() {
      return this.dL();
   }

   @Override
   public void h(cxy $$0) {
      this.co.r.a($$0);
   }

   @Override
   public boolean gm() {
      return this.cE.c();
   }

   public bak E() {
      return this.cE;
   }
}
