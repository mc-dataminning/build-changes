import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gkc extends gjz {
   public static final Logger h = LogUtils.getLogger();
   private static final int cJ = 20;
   private static final int cK = 600;
   private static final int cL = 100;
   private static final float cM = 0.6F;
   private static final double cN = 0.35;
   private static final double cO = 0.13962634F;
   public static final float i = 0.2F;
   public final gfg j;
   private final axg cP;
   private final flk cQ;
   private final bau cR = new bau(20, 1280);
   private final List<hen> cS = Lists.newArrayList();
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
   private boolean dd;
   private int de;
   private boolean df;
   public gka k = new gka();
   private cpm dg = cpm.b;
   protected final flz cz;
   protected int cC;
   public float cD;
   public float cE;
   public float cF;
   public float cG;
   private int dh;
   private float di;
   public float cH;
   public float cI;
   private boolean dj;
   @Nullable
   private bsz dk;
   private boolean dl;
   private boolean dm = true;
   private int dn;
   private boolean do;
   private int dp;
   private boolean dq = true;
   private boolean dr = false;

   public gkc(flz $$0, gff $$1, gfg $$2, axg $$3, flk $$4, boolean $$5, boolean $$6) {
      super($$1, $$2.o());
      this.cz = $$0;
      this.j = $$2;
      this.cP = $$3;
      this.cQ = $$4;
      this.dc = $$5;
      this.dd = $$6;
      this.cS.add(new hff(this, $$0.ak()));
      this.cS.add(new hes(this));
      this.cS.add(new her(this, $$0.ak(), $$1.I_()));
   }

   @Override
   public void c(float $$0) {
   }

   @Override
   public boolean a(bvb $$0, boolean $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         if ($$0 instanceof crn) {
            this.cz.ak().a((hfd)(new hex(this, (crn)$$0, true)));
            this.cz.ak().a((hfd)(new hex(this, (crn)$$0, false)));
         }

         return true;
      }
   }

   @Override
   public void bQ() {
      super.bQ();
      this.dl = false;
   }

   @Override
   public float h(float $$0) {
      return this.dO();
   }

   @Override
   public float i(float $$0) {
      return this.bZ() ? super.i($$0) : this.dM();
   }

   @Override
   public void h() {
      this.cR.b();
      super.h();
      this.J();
      if (!this.dg.equals(this.k.a)) {
         this.j.b(new aij(this.k.a));
         this.dg = this.k.a;
      }

      if (this.bZ()) {
         this.j.b(new aia.c(this.dM(), this.dO(), this.aJ(), this.P));
         bvb $$0 = this.dg();
         if ($$0 != this && $$0.di()) {
            this.j.b(new aib($$0));
            this.L();
         }
      } else {
         this.I();
      }

      for (hen $$1 : this.cS) {
         $$1.a();
      }
   }

   public float e() {
      for (hen $$0 : this.cS) {
         if ($$0 instanceof her) {
            return ((her)$$0).b();
         }
      }

      return 0.0F;
   }

   private void I() {
      this.L();
      if (this.A()) {
         double $$0 = this.dB() - this.cU;
         double $$1 = this.dD() - this.cV;
         double $$2 = this.dH() - this.cW;
         double $$3 = (double)(this.dM() - this.cX);
         double $$4 = (double)(this.dO() - this.cY);
         this.de++;
         boolean $$5 = azu.f($$0, $$1, $$2) > azu.k(2.0E-4) || this.de >= 20;
         boolean $$6 = $$3 != 0.0 || $$4 != 0.0;
         if ($$5 && $$6) {
            this.j.b(new aia.b(this.dB(), this.dD(), this.dH(), this.dM(), this.dO(), this.aJ(), this.P));
         } else if ($$5) {
            this.j.b(new aia.a(this.dB(), this.dD(), this.dH(), this.aJ(), this.P));
         } else if ($$6) {
            this.j.b(new aia.c(this.dM(), this.dO(), this.aJ(), this.P));
         } else if (this.cZ != this.aJ() || this.da != this.P) {
            this.j.b(new aia.d(this.aJ(), this.P));
         }

         if ($$5) {
            this.cU = this.dB();
            this.cV = this.dD();
            this.cW = this.dH();
            this.de = 0;
         }

         if ($$6) {
            this.cX = this.dM();
            this.cY = this.dO();
         }

         this.cZ = this.aJ();
         this.da = this.P;
         this.dm = this.cz.n.J().c();
      }
   }

   private void J() {
      boolean $$0 = this.cd();
      if ($$0 != this.dc) {
         aii.a $$1 = $$0 ? aii.a.a : aii.a.b;
         this.j.b(new aii(this, $$1));
         this.dc = $$0;
      }
   }

   private void L() {
      boolean $$0 = this.cj();
      if ($$0 != this.dd) {
         aii.a $$1 = $$0 ? aii.a.d : aii.a.e;
         this.j.b(new aii(this, $$1));
         this.dd = $$0;
      }
   }

   public boolean a(boolean $$0) {
      aih.a $$1 = $$0 ? aih.a.d : aih.a.e;
      cxg $$2 = this.gi().a($$0);
      this.j.b(new aih($$1, jh.c, jm.a));
      return !$$2.f();
   }

   @Override
   public void a(bsz $$0) {
      super.a($$0);
      this.j.b(new aiy($$0));
   }

   @Override
   public void gg() {
      this.j.b(new ahm(ahm.a.a));
      flx.c();
   }

   @Override
   public void p() {
      this.j.b(new ahs(this.cd.l));
      this.f();
   }

   public void f() {
      super.p();
      this.cz.a(null);
   }

   public void J(float $$0) {
      if (this.df) {
         float $$1 = this.eE() - $$0;
         if ($$1 <= 0.0F) {
            this.x($$0);
            if ($$1 < 0.0F) {
               this.aj = 10;
            }
         } else {
            this.bm = $$1;
            this.aj = 20;
            this.x($$0);
            this.aO = 10;
            this.aN = this.aO;
         }
      } else {
         this.x($$0);
         this.df = true;
      }
   }

   @Override
   public void x() {
      this.j.b(new aig(this.gj()));
   }

   @Override
   public boolean c() {
      return true;
   }

   @Override
   public boolean fI() {
      return !this.gj().b && super.fI();
   }

   @Override
   public boolean bv() {
      return !this.gj().b && super.bv();
   }

   protected void i() {
      this.j.b(new aii(this, aii.a.f, azu.d(this.y() * 100.0F)));
   }

   public void l() {
      this.j.b(new aii(this, aii.a.h));
   }

   public axg m() {
      return this.cP;
   }

   public flk n() {
      return this.cQ;
   }

   public void a(ddc $$0) {
      if (this.cQ.b($$0)) {
         this.cQ.c($$0);
         this.j.b(new ail($$0));
      }
   }

   @Override
   public int G() {
      return this.cT;
   }

   public void a(int $$0) {
      this.cT = $$0;
   }

   @Override
   public void a(xk $$0, boolean $$1) {
      this.cz.ba().a($$0, $$1);
   }

   private void c(double $$0, double $$1) {
      jh $$2 = jh.a($$0, this.dD(), $$1);
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
            fbr $$11 = this.dz();
            if ($$5.o() == jm.a.a) {
               this.n(0.1 * (double)$$5.j(), $$11.e, $$11.f);
            } else {
               this.n($$11.d, $$11.e, 0.1 * (double)$$5.l());
            }
         }
      }
   }

   private boolean c(jh $$0) {
      fbm $$1 = this.cR();
      fbm $$2 = new fbm((double)$$0.u(), $$1.b, (double)$$0.w(), (double)$$0.u() + 1.0, $$1.e, (double)$$0.w() + 1.0).h(1.0E-7);
      return this.dW().g(this, $$2);
   }

   public void a(float $$0, int $$1, int $$2) {
      this.cs = $$0;
      this.cr = $$1;
      this.cq = $$2;
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
      this.dq = $$0;
   }

   public boolean t() {
      return this.dq;
   }

   public void x(boolean $$0) {
      this.dr = $$0;
   }

   @Override
   public boolean u() {
      return this.dr;
   }

   @Override
   public void a(awu $$0, float $$1, float $$2) {
      this.dW().a(this.dB(), this.dD(), this.dH(), $$0, this.dn(), $$1, $$2, false);
   }

   @Override
   public void a(awu $$0, aww $$1, float $$2, float $$3) {
      this.dW().a(this.dB(), this.dD(), this.dH(), $$0, $$1, $$2, $$3, false);
   }

   @Override
   public boolean dk() {
      return true;
   }

   @Override
   public void c(bsz $$0) {
      cxg $$1 = this.b($$0);
      if (!$$1.f() && !this.fz()) {
         super.c($$0);
         this.dj = true;
         this.dk = $$0;
      }
   }

   @Override
   public boolean fz() {
      return this.dj;
   }

   @Override
   public void fF() {
      super.fF();
      this.dj = false;
   }

   @Override
   public bsz fA() {
      return Objects.requireNonNullElse(this.dk, bsz.a);
   }

   @Override
   public void a(aks<?> $$0) {
      super.a($$0);
      if (aC.equals($$0)) {
         boolean $$1 = (this.al.a(aC) & 1) > 0;
         bsz $$2 = (this.al.a(aC) & 2) > 0 ? bsz.b : bsz.a;
         if ($$1 && !this.dj) {
            this.c($$2);
         } else if (!$$1 && this.dj) {
            this.fF();
         }
      }

      if (am.equals($$0) && this.fJ() && !this.do) {
         this.cz.ak().a((hfd)(new het(this)));
      }
   }

   @Nullable
   public bwh v() {
      if (this.dm() instanceof bwh $$0 && $$0.a()) {
         return $$0;
      }

      return null;
   }

   public float y() {
      return this.di;
   }

   @Override
   public boolean aa() {
      return this.cz.aU();
   }

   @Override
   public void a(dwd $$0, boolean $$1) {
      if ($$0 instanceof dvq $$2) {
         this.cz.a(new fve($$2, $$1, this.cz.aU()));
      } else {
         this.cz.a(new fvr($$0, $$1, this.cz.aU()));
      }
   }

   @Override
   public void a(dfz $$0) {
      this.cz.a(new fvo($$0));
   }

   @Override
   public void a(dva $$0) {
      this.cz.a(new fur($$0));
   }

   @Override
   public void a(dwi $$0) {
      this.cz.a(new fvv($$0));
   }

   @Override
   public void a(dvt $$0) {
      this.cz.a(new fvj($$0));
   }

   @Override
   public void a(cxg $$0, bsz $$1) {
      dan $$2 = $$0.a(ku.S);
      if ($$2 != null) {
         this.cz.a(new fun(this, $$0, $$1, $$2));
      }
   }

   @Override
   public void b(bvb $$0) {
      this.cz.g.a($$0, ls.f);
   }

   @Override
   public void c(bvb $$0) {
      this.cz.g.a($$0, ls.r);
   }

   @Override
   public boolean cd() {
      return this.k.a.f();
   }

   @Override
   public boolean ci() {
      return this.db;
   }

   public boolean z() {
      return this.ci() || this.cm();
   }

   @Override
   public void fu() {
      super.fu();
      if (this.A()) {
         this.bo = this.k.b;
         this.bq = this.k.c;
         this.bn = this.k.a.e();
         this.cF = this.cD;
         this.cG = this.cE;
         this.cE = this.cE + (this.dO() - this.cE) * 0.5F;
         this.cD = this.cD + (this.dM() - this.cD) * 0.5F;
      }
   }

   protected boolean A() {
      return this.cz.ao() == this;
   }

   @Override
   public void B() {
      this.b(bwj.a);
      if (this.dW() != null) {
         for (double $$0 = this.dD(); $$0 > (double)this.dW().L_() && $$0 <= (double)this.dW().an(); $$0++) {
            this.a_(this.dB(), $$0, this.dH());
            if (this.dW().g(this)) {
               break;
            }
         }

         this.h(fbr.c);
         this.w(0.0F);
      }

      this.x(this.eS());
      this.aP = 0;
   }

   @Override
   public void d_() {
      if (this.cC > 0) {
         this.cC--;
      }

      if (!(this.cz.z instanceof ftp)) {
         this.y(this.C() == dqa.a.a);
         this.M();
      }

      boolean $$0 = this.k.a.e();
      boolean $$1 = this.k.a.f();
      boolean $$2 = this.Q();
      cpk $$3 = this.gj();
      this.db = !$$3.b && !this.ck() && !this.bZ() && this.h(bwj.f) && (this.cd() || !this.fR() && !this.h(bwj.a));
      this.k.a();
      this.cz.aB().a(this.k);
      if (this.fz() && !this.bZ()) {
         this.h(false);
         this.k.b *= 0.2F;
         this.k.c *= 0.2F;
         this.cC = 0;
      } else if (this.z()) {
         this.h(false);
         float $$4 = (float)this.h(bxf.z);
         this.k.b *= $$4;
         this.k.c *= $$4;
      }

      boolean $$5 = false;
      if (this.dn > 0) {
         this.dn--;
         $$5 = true;
         this.k.d();
      }

      if (!this.ad) {
         this.c(this.dB() - (double)this.dr() * 0.35, this.dH() + (double)this.dr() * 0.35);
         this.c(this.dB() - (double)this.dr() * 0.35, this.dH() - (double)this.dr() * 0.35);
         this.c(this.dB() + (double)this.dr() * 0.35, this.dH() - (double)this.dr() * 0.35);
         this.c(this.dB() + (double)this.dr() * 0.35, this.dH() + (double)this.dr() * 0.35);
      }

      if ($$1) {
         this.cC = 0;
      }

      boolean $$6 = this.P();
      boolean $$7 = this.bZ() ? this.dl().aJ() : this.aJ();
      boolean $$8 = !$$1 && !$$2;
      if (($$7 || this.bo()) && $$8 && $$6) {
         if (this.cC <= 0 && !this.cz.n.B.e()) {
            this.cC = 7;
         } else {
            this.h(true);
         }
      }

      if ((!this.bj() || this.bo()) && $$6 && this.cz.n.B.e()) {
         this.h(true);
      }

      if (this.cj()) {
         boolean $$9 = !this.k.c() || !this.R();
         boolean $$10 = $$9 || this.P && !this.S || this.bj() && !this.bo();
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
         if (this.cz.r.h()) {
            if (!$$3.b) {
               $$3.b = true;
               $$11 = true;
               this.x();
            }
         } else if (!$$0 && this.k.a.e() && !$$5) {
            if (this.cf == 0) {
               this.cf = 7;
            } else if (!this.ck()) {
               $$3.b = !$$3.b;
               if ($$3.b && this.aJ()) {
                  this.s();
               }

               $$11 = true;
               this.x();
               this.cf = 0;
            }
         }
      }

      if (this.k.a.e() && !$$11 && !$$0 && !this.q_() && this.go()) {
         this.j.b(new aii(this, aii.a.i));
      }

      this.do = this.fJ();
      if (this.bj() && this.k.a.f() && this.el()) {
         this.fl();
      }

      if (this.a(axq.a)) {
         int $$12 = this.aa_() ? 10 : 1;
         this.dp = azu.a(this.dp + $$12, 0, 600);
      } else if (this.dp > 0) {
         this.a(axq.a);
         this.dp = azu.a(this.dp - 10, 0, 600);
      }

      if ($$3.b && this.A()) {
         int $$13 = 0;
         if (this.k.a.f()) {
            $$13--;
         }

         if (this.k.a.e()) {
            $$13++;
         }

         if ($$13 != 0) {
            this.h(this.dz().b(0.0, (double)((float)$$13 * $$3.a() * 3.0F), 0.0));
         }
      }

      bwh $$14 = this.v();
      if ($$14 != null && $$14.c() == 0) {
         if (this.dh < 0) {
            this.dh++;
            if (this.dh == 0) {
               this.di = 0.0F;
            }
         }

         if ($$0 && !this.k.a.e()) {
            this.dh = -10;
            $$14.b(azu.d(this.y() * 100.0F));
            this.i();
         } else if (!$$0 && this.k.a.e()) {
            this.dh = 0;
            this.di = 0.0F;
         } else if ($$0) {
            this.dh++;
            if (this.dh < 10) {
               this.di = (float)this.dh * 0.1F;
            } else {
               this.di = 0.8F + 2.0F / (float)(this.dh - 9) * 0.1F;
            }
         }
      } else {
         this.di = 0.0F;
      }

      super.d_();
      if (this.aJ() && $$3.b && !this.cz.r.h()) {
         $$3.b = false;
         this.x();
      }
   }

   public dqa.a C() {
      return this.as == null ? dqa.a.b : this.as.a();
   }

   @Override
   protected void em() {
      this.aP++;
      if (this.aP == 20) {
         this.a(bvb.d.a);
      }
   }

   private void y(boolean $$0) {
      this.cI = this.cH;
      float $$1 = 0.0F;
      if ($$0 && this.as != null && this.as.e()) {
         if (this.cz.z != null && !this.cz.z.j() && !(this.cz.z instanceof fsv) && !(this.cz.z instanceof ftu)) {
            if (this.cz.z instanceof fug) {
               this.p();
            }

            this.cz.a(null);
         }

         if (this.cH == 0.0F) {
            this.cz.ak().a(hey.b(awv.vj, this.ae.i() * 0.4F + 0.8F, 0.25F));
         }

         $$1 = 0.0125F;
         this.as.a(false);
      } else if (this.b(bui.i) && !this.c(bui.i).a(60)) {
         $$1 = 0.006666667F;
      } else if (this.cH > 0.0F) {
         $$1 = -0.05F;
      }

      this.cH = azu.a(this.cH + $$1, 0.0F, 1.0F);
   }

   @Override
   public void r() {
      super.r();
      this.dl = false;
      if (this.dm() instanceof crl $$0) {
         $$0.a(this.k.a.c(), this.k.a.d(), this.k.a.a(), this.k.a.b());
         this.dl = this.dl | (this.k.a.c() || this.k.a.d() || this.k.a.a() || this.k.a.b());
      }
   }

   public boolean D() {
      return this.dl;
   }

   @Nullable
   @Override
   public bug d(jq<bue> $$0) {
      if ($$0.a(bui.i)) {
         this.cI = 0.0F;
         this.cH = 0.0F;
      }

      return super.d($$0);
   }

   @Override
   public void a(bwb $$0, fbr $$1) {
      double $$2 = this.dB();
      double $$3 = this.dH();
      super.a($$0, $$1);
      float $$4 = (float)(this.dB() - $$2);
      float $$5 = (float)(this.dH() - $$3);
      this.h($$4, $$5);
      this.g = this.g + azu.f($$4, $$5) * 0.6F;
   }

   public boolean E() {
      return this.dm;
   }

   @Override
   public boolean gO() {
      return this.cz.n.K().c();
   }

   protected void h(float $$0, float $$1) {
      if (this.N()) {
         fbr $$2 = this.du();
         fbr $$3 = $$2.b((double)$$0, 0.0, (double)$$1);
         fbr $$4 = new fbr((double)$$0, 0.0, (double)$$1);
         float $$5 = this.fp();
         float $$6 = (float)$$4.h();
         if ($$6 <= 0.001F) {
            fbq $$7 = this.k.b();
            float $$8 = $$5 * $$7.i;
            float $$9 = $$5 * $$7.j;
            float $$10 = azu.a(this.dM() * (float) (Math.PI / 180.0));
            float $$11 = azu.b(this.dM() * (float) (Math.PI / 180.0));
            $$4 = new fbr((double)($$8 * $$11 - $$9 * $$10), $$4.e, (double)($$9 * $$11 + $$8 * $$10));
            $$6 = (float)$$4.h();
            if ($$6 <= 0.001F) {
               return;
            }
         }

         float $$12 = azu.j($$6);
         fbr $$13 = $$4.c((double)$$12);
         fbr $$14 = this.bV();
         float $$15 = (float)($$14.d * $$13.d + $$14.f * $$13.f);
         if (!($$15 < -0.15F)) {
            fbw $$16 = fbw.a(this);
            jh $$17 = jh.a(this.dB(), this.cR().e, this.dH());
            dxo $$18 = this.dW().a_($$17);
            if ($$18.b(this.dW(), $$17, $$16).c()) {
               $$17 = $$17.d();
               dxo $$19 = this.dW().a_($$17);
               if ($$19.b(this.dW(), $$17, $$16).c()) {
                  float $$20 = 7.0F;
                  float $$21 = 1.2F;
                  if (this.b(bui.h)) {
                     $$21 += (float)(this.c(bui.h).e() + 1) * 0.75F;
                  }

                  float $$22 = Math.max($$5 * 7.0F, 1.0F / $$12);
                  fbr $$24 = $$3.e($$13.c((double)$$22));
                  float $$25 = this.dr();
                  float $$26 = this.ds();
                  fbm $$27 = new fbm($$2, $$24.b(0.0, (double)$$26, 0.0)).c((double)$$25, 0.0, (double)$$25);
                  fbr $$23 = $$2.b(0.0, 0.51F, 0.0);
                  $$24 = $$24.b(0.0, 0.51F, 0.0);
                  fbr $$28 = $$13.c(new fbr(0.0, 1.0, 0.0));
                  fbr $$29 = $$28.c((double)($$25 * 0.5F));
                  fbr $$30 = $$23.d($$29);
                  fbr $$31 = $$24.d($$29);
                  fbr $$32 = $$23.e($$29);
                  fbr $$33 = $$24.e($$29);
                  Iterable<fcl> $$34 = this.dW().d(this, $$27);
                  Iterator<fbm> $$35 = StreamSupport.stream($$34.spliterator(), false).flatMap($$0x -> $$0x.e().stream()).iterator();
                  float $$36 = Float.MIN_VALUE;

                  while ($$35.hasNext()) {
                     fbm $$37 = $$35.next();
                     if ($$37.a($$30, $$31) || $$37.a($$32, $$33)) {
                        $$36 = (float)$$37.e;
                        fbr $$38 = $$37.f();
                        jh $$39 = jh.a((ka)$$38);

                        for (int $$40 = 1; (float)$$40 < $$21; $$40++) {
                           jh $$41 = $$39.b($$40);
                           dxo $$42 = this.dW().a_($$41);
                           fcl $$43;
                           if (!($$43 = $$42.b(this.dW(), $$41, $$16)).c()) {
                              $$36 = (float)$$43.c(jm.a.b) + (float)$$41.v();
                              if ((double)$$36 - this.dD() > (double)$$21) {
                                 return;
                              }
                           }

                           if ($$40 > 1) {
                              $$17 = $$17.d();
                              dxo $$44 = this.dW().a_($$17);
                              if (!$$44.b(this.dW(), $$17, $$16).c()) {
                                 return;
                              }
                           }
                        }
                        break;
                     }
                  }

                  if ($$36 != Float.MIN_VALUE) {
                     float $$45 = (float)((double)$$36 - this.dD());
                     if (!($$45 <= 0.5F) && !($$45 > $$21)) {
                        this.dn = 1;
                     }
                  }
               }
            }
         }
      }
   }

   @Override
   protected boolean c(fbr $$0) {
      float $$1 = this.dM() * (float) (Math.PI / 180.0);
      double $$2 = (double)azu.a($$1);
      double $$3 = (double)azu.b($$1);
      double $$4 = (double)this.bo * $$3 - (double)this.bq * $$2;
      double $$5 = (double)this.bq * $$3 + (double)this.bo * $$2;
      double $$6 = azu.k($$4) + azu.k($$5);
      double $$7 = azu.k($$0.d) + azu.k($$0.f);
      if (!($$6 < 1.0E-5F) && !($$7 < 1.0E-5F)) {
         double $$8 = $$4 * $$0.d + $$5 * $$0.f;
         double $$9 = Math.acos($$8 / Math.sqrt($$6 * $$7));
         return $$9 < 0.13962634F;
      } else {
         return false;
      }
   }

   private boolean N() {
      return this.E() && this.dn <= 0 && this.aJ() && !this.ga() && !this.bZ() && this.O() && (double)this.aS() >= 1.0;
   }

   private boolean O() {
      fbq $$0 = this.k.b();
      return $$0.i != 0.0F || $$0.j != 0.0F;
   }

   private boolean P() {
      return !this.cj() && this.Q() && this.R() && !this.fz() && !this.b(bui.o) && (!this.bZ() || this.a(this.dl())) && !this.fJ() && !this.z();
   }

   private boolean a(bvb $$0) {
      return $$0.dP() && $$0.di();
   }

   private boolean Q() {
      double $$0 = 0.8;
      return this.bo() ? this.k.c() : (double)this.k.c >= 0.8;
   }

   private boolean R() {
      return this.bZ() || (float)this.gt().a() > 6.0F || this.gj().c;
   }

   public float F() {
      if (!this.a(axq.a)) {
         return 0.0F;
      } else {
         float $$0 = 600.0F;
         float $$1 = 100.0F;
         if ((float)this.dp >= 600.0F) {
            return 1.0F;
         } else {
            float $$2 = azu.a((float)this.dp / 100.0F, 0.0F, 1.0F);
            float $$3 = (float)this.dp < 100.0F ? 0.0F : azu.a(((float)this.dp - 100.0F) / 500.0F, 0.0F, 1.0F);
            return $$2 * 0.6F + $$3 * 0.39999998F;
         }
      }
   }

   public void a(dgw $$0) {
      if ($$0 == dgw.d) {
         this.h(this.dz().a(jm.a.b, 0.0));
      }
   }

   @Override
   public boolean bo() {
      return this.cp;
   }

   @Override
   protected boolean gb() {
      boolean $$0 = this.cp;
      boolean $$1 = super.gb();
      if (this.aa_()) {
         return this.cp;
      } else {
         if (!$$0 && $$1) {
            this.dW().a(this.dB(), this.dD(), this.dH(), awv.x, aww.i, 1.0F, 1.0F, false);
            this.cz.ak().a((hfd)(new hfg.b(this)));
         }

         if ($$0 && !$$1) {
            this.dW().a(this.dB(), this.dD(), this.dH(), awv.y, aww.i, 1.0F, 1.0F, false);
         }

         return this.cp;
      }
   }

   @Override
   public fbr u(float $$0) {
      if (this.cz.n.aE().a()) {
         float $$1 = azu.h($$0 * 0.5F, this.dM(), this.N) * (float) (Math.PI / 180.0);
         float $$2 = azu.h($$0 * 0.5F, this.dO(), this.O) * (float) (Math.PI / 180.0);
         double $$3 = this.fy() == bvr.b ? -1.0 : 1.0;
         fbr $$4 = new fbr(0.39 * $$3, -0.6, 0.3);
         return $$4.a(-$$2).b(-$$1).e(this.m($$0));
      } else {
         return super.u($$0);
      }
   }

   @Override
   public void a(cxg $$0, cxg $$1, ctd $$2) {
      this.cz.aB().a($$0, $$1, $$2);
   }

   @Override
   public float dN() {
      return this.dM();
   }

   @Override
   public void g(cxg $$0) {
      this.cz.r.a($$0);
   }

   @Override
   public boolean gl() {
      return this.cR.c();
   }

   public bau H() {
      return this.cR;
   }
}
