import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gic extends ghz {
   public static final Logger h = LogUtils.getLogger();
   private static final int cH = 20;
   private static final int cI = 600;
   private static final int cJ = 100;
   private static final float cK = 0.6F;
   private static final double cL = 0.35;
   private static final double cM = 0.13962634F;
   public final gdi i;
   private final awy cN;
   private final fjp cO;
   private final bam cP = new bam(20, 1280);
   private final List<hcl> cQ = Lists.newArrayList();
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
   public gia j = new gia();
   private cos de = cos.b;
   protected final fke k;
   protected int cy;
   public float cB;
   public float cC;
   public float cD;
   public float cE;
   private int df;
   private float dg;
   public float cF;
   public float cG;
   private boolean dh;
   @Nullable
   private bsj di;
   private boolean dj;
   private boolean dk = true;
   private int dl;
   private boolean dm;
   private int dn;
   private boolean do = true;
   private boolean dp = false;

   public gic(fke $$0, gdh $$1, gdi $$2, awy $$3, fjp $$4, boolean $$5, boolean $$6) {
      super($$1, $$2.o());
      this.k = $$0;
      this.i = $$2;
      this.cN = $$3;
      this.cO = $$4;
      this.da = $$5;
      this.db = $$6;
      this.cQ.add(new hdd(this, $$0.ak()));
      this.cQ.add(new hcq(this));
      this.cQ.add(new hcp(this, $$0.ak(), $$1.H_()));
   }

   @Override
   public void c(float $$0) {
   }

   @Override
   public boolean a(bul $$0, boolean $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         if ($$0 instanceof cqt) {
            this.k.ak().a((hdb)(new hcv(this, (cqt)$$0, true)));
            this.k.ak().a((hdb)(new hcv(this, (cqt)$$0, false)));
         }

         return true;
      }
   }

   @Override
   public void bQ() {
      super.bQ();
      this.dj = false;
   }

   @Override
   public float h(float $$0) {
      return this.dN();
   }

   @Override
   public float i(float $$0) {
      return this.bZ() ? super.i($$0) : this.dL();
   }

   @Override
   public void h() {
      this.cP.b();
      if (this.dV().f(this.dz(), this.dF())) {
         super.h();
         this.J();
         if (!this.de.equals(this.j.a)) {
            this.i.b(new aid(this.j.a));
            this.de = this.j.a;
         }

         if (this.bZ()) {
            this.i.b(new ahv.c(this.dL(), this.dN(), this.aJ(), this.P));
            bul $$0 = this.dg();
            if ($$0 != this && $$0.di()) {
               this.i.b(new ahw($$0));
               this.L();
            }
         } else {
            this.I();
         }

         for (hcl $$1 : this.cQ) {
            $$1.a();
         }
      }
   }

   public float e() {
      for (hcl $$0 : this.cQ) {
         if ($$0 instanceof hcp) {
            return ((hcp)$$0).b();
         }
      }

      return 0.0F;
   }

   private void I() {
      this.L();
      if (this.A()) {
         double $$0 = this.dA() - this.cS;
         double $$1 = this.dC() - this.cT;
         double $$2 = this.dG() - this.cU;
         double $$3 = (double)(this.dL() - this.cV);
         double $$4 = (double)(this.dN() - this.cW);
         this.dc++;
         boolean $$5 = azm.f($$0, $$1, $$2) > azm.k(2.0E-4) || this.dc >= 20;
         boolean $$6 = $$3 != 0.0 || $$4 != 0.0;
         if ($$5 && $$6) {
            this.i.b(new ahv.b(this.dA(), this.dC(), this.dG(), this.dL(), this.dN(), this.aJ(), this.P));
         } else if ($$5) {
            this.i.b(new ahv.a(this.dA(), this.dC(), this.dG(), this.aJ(), this.P));
         } else if ($$6) {
            this.i.b(new ahv.c(this.dL(), this.dN(), this.aJ(), this.P));
         } else if (this.cX != this.aJ() || this.cY != this.P) {
            this.i.b(new ahv.d(this.aJ(), this.P));
         }

         if ($$5) {
            this.cS = this.dA();
            this.cT = this.dC();
            this.cU = this.dG();
            this.dc = 0;
         }

         if ($$6) {
            this.cV = this.dL();
            this.cW = this.dN();
         }

         this.cX = this.aJ();
         this.cY = this.P;
         this.dk = this.k.n.I().c();
      }
   }

   private void J() {
      boolean $$0 = this.cd();
      if ($$0 != this.da) {
         aic.a $$1 = $$0 ? aic.a.a : aic.a.b;
         this.i.b(new aic(this, $$1));
         this.da = $$0;
      }
   }

   private void L() {
      boolean $$0 = this.cj();
      if ($$0 != this.db) {
         aic.a $$1 = $$0 ? aic.a.d : aic.a.e;
         this.i.b(new aic(this, $$1));
         this.db = $$0;
      }
   }

   public boolean a(boolean $$0) {
      aib.a $$1 = $$0 ? aib.a.d : aib.a.e;
      cwm $$2 = this.gg().a($$0);
      this.i.b(new aib($$1, jh.c, jm.a));
      return !$$2.f();
   }

   @Override
   public void a(bsj $$0) {
      super.a($$0);
      this.i.b(new ais($$0));
   }

   @Override
   public void ge() {
      this.i.b(new ahh(ahh.a.a));
      fkc.c();
   }

   @Override
   public void p() {
      this.i.b(new ahn(this.cc.l));
      this.f();
   }

   public void f() {
      super.p();
      this.k.a(null);
   }

   public void J(float $$0) {
      if (this.dd) {
         float $$1 = this.eD() - $$0;
         if ($$1 <= 0.0F) {
            this.x($$0);
            if ($$1 < 0.0F) {
               this.aj = 10;
            }
         } else {
            this.bl = $$1;
            this.aj = 20;
            this.x($$0);
            this.aN = 10;
            this.aM = this.aN;
         }
      } else {
         this.x($$0);
         this.dd = true;
      }
   }

   @Override
   public void x() {
      this.i.b(new aia(this.gh()));
   }

   @Override
   public boolean c() {
      return true;
   }

   @Override
   public boolean fG() {
      return !this.gh().b && super.fG();
   }

   @Override
   public boolean bv() {
      return !this.gh().b && super.bv();
   }

   protected void i() {
      this.i.b(new aic(this, aic.a.f, azm.d(this.y() * 100.0F)));
   }

   @Override
   public void l() {
      this.i.b(new aic(this, aic.a.h));
   }

   public awy m() {
      return this.cN;
   }

   public fjp n() {
      return this.cO;
   }

   public void a(dbc<?> $$0) {
      if (this.cO.d($$0)) {
         this.cO.e($$0);
         this.i.b(new aif($$0));
      }
   }

   @Override
   protected int G() {
      return this.cR;
   }

   public void a(int $$0) {
      this.cR = $$0;
   }

   @Override
   public void a(xj $$0, boolean $$1) {
      this.k.ba().a($$0, $$1);
   }

   private void c(double $$0, double $$1) {
      jh $$2 = jh.a($$0, this.dC(), $$1);
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
            ezy $$11 = this.dy();
            if ($$5.o() == jm.a.a) {
               this.n(0.1 * (double)$$5.j(), $$11.e, $$11.f);
            } else {
               this.n($$11.d, $$11.e, 0.1 * (double)$$5.l());
            }
         }
      }
   }

   private boolean c(jh $$0) {
      ezt $$1 = this.cR();
      ezt $$2 = new ezt((double)$$0.u(), $$1.b, (double)$$0.w(), (double)$$0.u() + 1.0, $$1.e, (double)$$0.w() + 1.0).h(1.0E-7);
      return this.dV().g(this, $$2);
   }

   public void a(float $$0, int $$1, int $$2) {
      this.cr = $$0;
      this.cq = $$1;
      this.cp = $$2;
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

   public boolean t() {
      return this.do;
   }

   public void x(boolean $$0) {
      this.dp = $$0;
   }

   public boolean u() {
      return this.dp;
   }

   @Override
   public void a(awm $$0, float $$1, float $$2) {
      this.dV().a(this.dA(), this.dC(), this.dG(), $$0, this.dm(), $$1, $$2, false);
   }

   @Override
   public void a(awm $$0, awo $$1, float $$2, float $$3) {
      this.dV().a(this.dA(), this.dC(), this.dG(), $$0, $$1, $$2, $$3, false);
   }

   @Override
   public boolean dj() {
      return true;
   }

   @Override
   public void c(bsj $$0) {
      cwm $$1 = this.b($$0);
      if (!$$1.f() && !this.fx()) {
         super.c($$0);
         this.dh = true;
         this.di = $$0;
      }
   }

   @Override
   public boolean fx() {
      return this.dh;
   }

   @Override
   public void fD() {
      super.fD();
      this.dh = false;
   }

   @Override
   public bsj fy() {
      return Objects.requireNonNullElse(this.di, bsj.a);
   }

   @Override
   public void a(akm<?> $$0) {
      super.a($$0);
      if (aC.equals($$0)) {
         boolean $$1 = (this.al.a(aC) & 1) > 0;
         bsj $$2 = (this.al.a(aC) & 2) > 0 ? bsj.b : bsj.a;
         if ($$1 && !this.dh) {
            this.c($$2);
         } else if (!$$1 && this.dh) {
            this.fD();
         }
      }

      if (am.equals($$0) && this.fH() && !this.dm) {
         this.k.ak().a((hdb)(new hcr(this)));
      }
   }

   @Nullable
   public bvr v() {
      if (this.dl() instanceof bvr $$0 && $$0.a()) {
         return $$0;
      }

      return null;
   }

   public float y() {
      return this.dg;
   }

   @Override
   public boolean aa() {
      return this.k.aU();
   }

   @Override
   public void a(duk $$0, boolean $$1) {
      if ($$0 instanceof dtx $$2) {
         this.k.a(new ftj($$2, $$1, this.k.aU()));
      } else {
         this.k.a(new ftw($$0, $$1, this.k.aU()));
      }
   }

   @Override
   public void a(dem $$0) {
      this.k.a(new ftt($$0));
   }

   @Override
   public void a(dti $$0) {
      this.k.a(new fsw($$0));
   }

   @Override
   public void a(dup $$0) {
      this.k.a(new fua($$0));
   }

   @Override
   public void a(dua $$0) {
      this.k.a(new fto($$0));
   }

   @Override
   public void a(cwm $$0, bsj $$1) {
      czt $$2 = $$0.a(ku.S);
      if ($$2 != null) {
         this.k.a(new fss(this, $$0, $$1, $$2));
      }
   }

   @Override
   public void b(bul $$0) {
      this.k.g.a($$0, ls.f);
   }

   @Override
   public void c(bul $$0) {
      this.k.g.a($$0, ls.r);
   }

   @Override
   public boolean cd() {
      return this.j.a.f();
   }

   @Override
   public boolean ci() {
      return this.cZ;
   }

   public boolean z() {
      return this.ci() || this.cm();
   }

   @Override
   public void fs() {
      super.fs();
      if (this.A()) {
         this.bn = this.j.b;
         this.bp = this.j.c;
         this.bm = this.j.a.e();
         this.cD = this.cB;
         this.cE = this.cC;
         this.cC = this.cC + (this.dN() - this.cC) * 0.5F;
         this.cB = this.cB + (this.dL() - this.cB) * 0.5F;
      }
   }

   protected boolean A() {
      return this.k.ao() == this;
   }

   @Override
   public void B() {
      this.b(bvt.a);
      if (this.dV() != null) {
         for (double $$0 = this.dC(); $$0 > (double)this.dV().K_() && $$0 <= (double)this.dV().al(); $$0++) {
            this.a_(this.dA(), $$0, this.dG());
            if (this.dV().g(this)) {
               break;
            }
         }

         this.h(ezy.c);
         this.w(0.0F);
      }

      this.x(this.eR());
      this.aO = 0;
   }

   @Override
   public void d_() {
      if (this.cy > 0) {
         this.cy--;
      }

      if (!(this.k.z instanceof fru)) {
         this.y(this.C() == doi.a.a);
         this.M();
      }

      boolean $$0 = this.j.a.e();
      boolean $$1 = this.j.a.f();
      boolean $$2 = this.Q();
      coq $$3 = this.gh();
      this.cZ = !$$3.b && !this.ck() && !this.bZ() && this.h(bvt.f) && (this.cd() || !this.fP() && !this.h(bvt.a));
      float $$4 = (float)this.h(bwp.z);
      this.j.a(this.z(), $$4);
      this.k.aB().a(this.j);
      if (this.fx() && !this.bZ()) {
         this.j.b *= 0.2F;
         this.j.c *= 0.2F;
         this.cy = 0;
      }

      boolean $$5 = false;
      if (this.dl > 0) {
         this.dl--;
         $$5 = true;
         this.j.c();
      }

      if (!this.ad) {
         this.c(this.dA() - (double)this.dq() * 0.35, this.dG() + (double)this.dq() * 0.35);
         this.c(this.dA() - (double)this.dq() * 0.35, this.dG() - (double)this.dq() * 0.35);
         this.c(this.dA() + (double)this.dq() * 0.35, this.dG() - (double)this.dq() * 0.35);
         this.c(this.dA() + (double)this.dq() * 0.35, this.dG() + (double)this.dq() * 0.35);
      }

      if ($$1) {
         this.cy = 0;
      }

      boolean $$6 = this.P();
      boolean $$7 = this.bZ() ? this.dk().aJ() : this.aJ();
      boolean $$8 = !$$1 && !$$2;
      if (($$7 || this.bo()) && $$8 && $$6) {
         if (this.cy <= 0 && !this.k.n.B.e()) {
            this.cy = 7;
         } else {
            this.h(true);
         }
      }

      if ((!this.bj() || this.bo()) && $$6 && this.k.n.B.e()) {
         this.h(true);
      }

      if (this.cj()) {
         boolean $$9 = !this.j.b() || !this.R();
         boolean $$10 = $$9 || this.P && !this.S || this.bj() && !this.bo();
         if (this.ck()) {
            if (!this.aJ() && !this.j.a.f() && $$9 || !this.bj()) {
               this.h(false);
            }
         } else if ($$10) {
            this.h(false);
         }
      }

      boolean $$11 = false;
      if ($$3.c) {
         if (this.k.r.h()) {
            if (!$$3.b) {
               $$3.b = true;
               $$11 = true;
               this.x();
            }
         } else if (!$$0 && this.j.a.e() && !$$5) {
            if (this.ce == 0) {
               this.ce = 7;
            } else if (!this.ck()) {
               $$3.b = !$$3.b;
               if ($$3.b && this.aJ()) {
                  this.s();
               }

               $$11 = true;
               this.x();
               this.ce = 0;
            }
         }
      }

      if (this.j.a.e() && !$$11 && !$$0 && !this.p_() && this.gm()) {
         this.i.b(new aic(this, aic.a.i));
      }

      this.dm = this.fH();
      if (this.bj() && this.j.a.f() && this.ek()) {
         this.fj();
      }

      if (this.a(axi.a)) {
         int $$12 = this.Y_() ? 10 : 1;
         this.dn = azm.a(this.dn + $$12, 0, 600);
      } else if (this.dn > 0) {
         this.a(axi.a);
         this.dn = azm.a(this.dn - 10, 0, 600);
      }

      if ($$3.b && this.A()) {
         int $$13 = 0;
         if (this.j.a.f()) {
            $$13--;
         }

         if (this.j.a.e()) {
            $$13++;
         }

         if ($$13 != 0) {
            this.h(this.dy().b(0.0, (double)((float)$$13 * $$3.a() * 3.0F), 0.0));
         }
      }

      bvr $$14 = this.v();
      if ($$14 != null && $$14.c() == 0) {
         if (this.df < 0) {
            this.df++;
            if (this.df == 0) {
               this.dg = 0.0F;
            }
         }

         if ($$0 && !this.j.a.e()) {
            this.df = -10;
            $$14.b(azm.d(this.y() * 100.0F));
            this.i();
         } else if (!$$0 && this.j.a.e()) {
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

      super.d_();
      if (this.aJ() && $$3.b && !this.k.r.h()) {
         $$3.b = false;
         this.x();
      }
   }

   public doi.a C() {
      return this.as == null ? doi.a.b : this.as.a();
   }

   @Override
   protected void el() {
      this.aO++;
      if (this.aO == 20) {
         this.a(bul.c.a);
      }
   }

   private void y(boolean $$0) {
      this.cG = this.cF;
      float $$1 = 0.0F;
      if ($$0 && this.as != null && this.as.e()) {
         if (this.k.z != null && !this.k.z.k() && !(this.k.z instanceof fra) && !(this.k.z instanceof frz)) {
            if (this.k.z instanceof fsl) {
               this.p();
            }

            this.k.a(null);
         }

         if (this.cF == 0.0F) {
            this.k.ak().a(hcw.b(awn.uI, this.ae.i() * 0.4F + 0.8F, 0.25F));
         }

         $$1 = 0.0125F;
         this.as.a(false);
      } else if (this.b(bts.i) && !this.c(bts.i).a(60)) {
         $$1 = 0.006666667F;
      } else if (this.cF > 0.0F) {
         $$1 = -0.05F;
      }

      this.cF = azm.a(this.cF + $$1, 0.0F, 1.0F);
   }

   @Override
   public void r() {
      super.r();
      this.dj = false;
      if (this.dl() instanceof cqr $$0) {
         $$0.a(this.j.a.c(), this.j.a.d(), this.j.a.a(), this.j.a.b());
         this.dj = this.dj | (this.j.a.c() || this.j.a.d() || this.j.a.a() || this.j.a.b());
      }
   }

   public boolean D() {
      return this.dj;
   }

   @Nullable
   @Override
   public btq d(jq<bto> $$0) {
      if ($$0.a(bts.i)) {
         this.cG = 0.0F;
         this.cF = 0.0F;
      }

      return super.d($$0);
   }

   @Override
   public void a(bvl $$0, ezy $$1) {
      double $$2 = this.dA();
      double $$3 = this.dG();
      super.a($$0, $$1);
      float $$4 = (float)(this.dA() - $$2);
      float $$5 = (float)(this.dG() - $$3);
      this.g($$4, $$5);
      this.g = this.g + azm.f($$4, $$5) * 0.6F;
   }

   public boolean E() {
      return this.dk;
   }

   @Override
   public boolean gM() {
      return this.k.n.J().c();
   }

   protected void g(float $$0, float $$1) {
      if (this.N()) {
         ezy $$2 = this.dt();
         ezy $$3 = $$2.b((double)$$0, 0.0, (double)$$1);
         ezy $$4 = new ezy((double)$$0, 0.0, (double)$$1);
         float $$5 = this.fn();
         float $$6 = (float)$$4.h();
         if ($$6 <= 0.001F) {
            ezx $$7 = this.j.a();
            float $$8 = $$5 * $$7.i;
            float $$9 = $$5 * $$7.j;
            float $$10 = azm.a(this.dL() * (float) (Math.PI / 180.0));
            float $$11 = azm.b(this.dL() * (float) (Math.PI / 180.0));
            $$4 = new ezy((double)($$8 * $$11 - $$9 * $$10), $$4.e, (double)($$9 * $$11 + $$8 * $$10));
            $$6 = (float)$$4.h();
            if ($$6 <= 0.001F) {
               return;
            }
         }

         float $$12 = azm.j($$6);
         ezy $$13 = $$4.c((double)$$12);
         ezy $$14 = this.bV();
         float $$15 = (float)($$14.d * $$13.d + $$14.f * $$13.f);
         if (!($$15 < -0.15F)) {
            fad $$16 = fad.a(this);
            jh $$17 = jh.a(this.dA(), this.cR().e, this.dG());
            dvv $$18 = this.dV().a_($$17);
            if ($$18.b(this.dV(), $$17, $$16).c()) {
               $$17 = $$17.d();
               dvv $$19 = this.dV().a_($$17);
               if ($$19.b(this.dV(), $$17, $$16).c()) {
                  float $$20 = 7.0F;
                  float $$21 = 1.2F;
                  if (this.b(bts.h)) {
                     $$21 += (float)(this.c(bts.h).e() + 1) * 0.75F;
                  }

                  float $$22 = Math.max($$5 * 7.0F, 1.0F / $$12);
                  ezy $$24 = $$3.e($$13.c((double)$$22));
                  float $$25 = this.dq();
                  float $$26 = this.dr();
                  ezt $$27 = new ezt($$2, $$24.b(0.0, (double)$$26, 0.0)).c((double)$$25, 0.0, (double)$$25);
                  ezy $$23 = $$2.b(0.0, 0.51F, 0.0);
                  $$24 = $$24.b(0.0, 0.51F, 0.0);
                  ezy $$28 = $$13.c(new ezy(0.0, 1.0, 0.0));
                  ezy $$29 = $$28.c((double)($$25 * 0.5F));
                  ezy $$30 = $$23.d($$29);
                  ezy $$31 = $$24.d($$29);
                  ezy $$32 = $$23.e($$29);
                  ezy $$33 = $$24.e($$29);
                  Iterable<fas> $$34 = this.dV().d(this, $$27);
                  Iterator<ezt> $$35 = StreamSupport.stream($$34.spliterator(), false).flatMap($$0x -> $$0x.e().stream()).iterator();
                  float $$36 = Float.MIN_VALUE;

                  while ($$35.hasNext()) {
                     ezt $$37 = $$35.next();
                     if ($$37.a($$30, $$31) || $$37.a($$32, $$33)) {
                        $$36 = (float)$$37.e;
                        ezy $$38 = $$37.f();
                        jh $$39 = jh.a((ka)$$38);

                        for (int $$40 = 1; (float)$$40 < $$21; $$40++) {
                           jh $$41 = $$39.b($$40);
                           dvv $$42 = this.dV().a_($$41);
                           fas $$43;
                           if (!($$43 = $$42.b(this.dV(), $$41, $$16)).c()) {
                              $$36 = (float)$$43.c(jm.a.b) + (float)$$41.v();
                              if ((double)$$36 - this.dC() > (double)$$21) {
                                 return;
                              }
                           }

                           if ($$40 > 1) {
                              $$17 = $$17.d();
                              dvv $$44 = this.dV().a_($$17);
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
                        this.dl = 1;
                     }
                  }
               }
            }
         }
      }
   }

   @Override
   protected boolean c(ezy $$0) {
      float $$1 = this.dL() * (float) (Math.PI / 180.0);
      double $$2 = (double)azm.a($$1);
      double $$3 = (double)azm.b($$1);
      double $$4 = (double)this.bn * $$3 - (double)this.bp * $$2;
      double $$5 = (double)this.bp * $$3 + (double)this.bn * $$2;
      double $$6 = azm.k($$4) + azm.k($$5);
      double $$7 = azm.k($$0.d) + azm.k($$0.f);
      if (!($$6 < 1.0E-5F) && !($$7 < 1.0E-5F)) {
         double $$8 = $$4 * $$0.d + $$5 * $$0.f;
         double $$9 = Math.acos($$8 / Math.sqrt($$6 * $$7));
         return $$9 < 0.13962634F;
      } else {
         return false;
      }
   }

   private boolean N() {
      return this.E() && this.dl <= 0 && this.aJ() && !this.fY() && !this.bZ() && this.O() && (double)this.aS() >= 1.0;
   }

   private boolean O() {
      ezx $$0 = this.j.a();
      return $$0.i != 0.0F || $$0.j != 0.0F;
   }

   private boolean P() {
      return !this.cj() && this.Q() && this.R() && !this.fx() && !this.b(bts.o) && (!this.bZ() || this.a(this.dk())) && !this.fH();
   }

   private boolean a(bul $$0) {
      return $$0.dO() && $$0.di();
   }

   private boolean Q() {
      double $$0 = 0.8;
      return this.bo() ? this.j.b() : (double)this.j.c >= 0.8;
   }

   private boolean R() {
      return this.bZ() || (float)this.gr().a() > 6.0F || this.gh().c;
   }

   public float F() {
      if (!this.a(axi.a)) {
         return 0.0F;
      } else {
         float $$0 = 600.0F;
         float $$1 = 100.0F;
         if ((float)this.dn >= 600.0F) {
            return 1.0F;
         } else {
            float $$2 = azm.a((float)this.dn / 100.0F, 0.0F, 1.0F);
            float $$3 = (float)this.dn < 100.0F ? 0.0F : azm.a(((float)this.dn - 100.0F) / 500.0F, 0.0F, 1.0F);
            return $$2 * 0.6F + $$3 * 0.39999998F;
         }
      }
   }

   public void a(dfj $$0) {
      if ($$0 == dfj.d) {
         this.h(this.dy().a(jm.a.b, 0.0));
      }
   }

   @Override
   public boolean bo() {
      return this.co;
   }

   @Override
   protected boolean fZ() {
      boolean $$0 = this.co;
      boolean $$1 = super.fZ();
      if (this.Y_()) {
         return this.co;
      } else {
         if (!$$0 && $$1) {
            this.dV().a(this.dA(), this.dC(), this.dG(), awn.x, awo.i, 1.0F, 1.0F, false);
            this.k.ak().a((hdb)(new hde.b(this)));
         }

         if ($$0 && !$$1) {
            this.dV().a(this.dA(), this.dC(), this.dG(), awn.y, awo.i, 1.0F, 1.0F, false);
         }

         return this.co;
      }
   }

   @Override
   public ezy u(float $$0) {
      if (this.k.n.aD().a()) {
         float $$1 = azm.h($$0 * 0.5F, this.dL(), this.N) * (float) (Math.PI / 180.0);
         float $$2 = azm.h($$0 * 0.5F, this.dN(), this.O) * (float) (Math.PI / 180.0);
         double $$3 = this.fw() == bvb.b ? -1.0 : 1.0;
         ezy $$4 = new ezy(0.39 * $$3, -0.6, 0.3);
         return $$4.a(-$$2).b(-$$1).e(this.m($$0));
      } else {
         return super.u($$0);
      }
   }

   @Override
   public void a(cwm $$0, cwm $$1, csj $$2) {
      this.k.aB().a($$0, $$1, $$2);
   }

   @Override
   public float dM() {
      return this.dL();
   }

   @Override
   public void g(cwm $$0) {
      this.k.r.a($$0);
   }

   @Override
   public boolean gj() {
      return this.cP.c();
   }

   public bam H() {
      return this.cP;
   }
}
