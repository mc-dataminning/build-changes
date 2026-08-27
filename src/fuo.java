import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fuo extends ful {
   public static final Logger g = LogUtils.getLogger();
   private static final int cB = 20;
   private static final int cC = 600;
   private static final int cD = 100;
   private static final float cE = 0.6F;
   private static final double cF = 0.35;
   private static final double cG = 0.13962634F;
   private static final float cH = 0.3F;
   public final fpy cq;
   private final atv cI;
   private final ewu cJ;
   private final List<gjr> cK = Lists.newArrayList();
   private int cL = 0;
   private double cM;
   private double cN;
   private double cO;
   private float cP;
   private float cQ;
   private boolean cR;
   private boolean cS;
   private boolean cT;
   private boolean cU;
   private int cV;
   private boolean cW;
   public fum cr;
   protected final exh cs;
   protected int ct;
   public float cu;
   public float cw;
   public float cx;
   public float cy;
   private int cX;
   private float cY;
   public float cz;
   public float cA;
   private boolean cZ;
   @Nullable
   private blt da;
   private boolean db;
   private boolean dc = true;
   private int dd;
   private boolean de;
   private int df;
   private boolean dg = true;
   private boolean dh = false;

   public fuo(exh $$0, fpx $$1, fpy $$2, atv $$3, ewu $$4, boolean $$5, boolean $$6) {
      super($$1, $$2.q());
      this.cs = $$0;
      this.cq = $$2;
      this.cI = $$3;
      this.cJ = $$4;
      this.cT = $$5;
      this.cU = $$6;
      this.cK.add(new gkj(this, $$0.ai()));
      this.cK.add(new gjw(this));
      this.cK.add(new gjv(this, $$0.ai(), $$1.G_()));
   }

   @Override
   public boolean a(bmn $$0, float $$1) {
      return false;
   }

   @Override
   public void c(float $$0) {
   }

   @Override
   public boolean a(bno $$0, boolean $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         if ($$0 instanceof cja) {
            this.cs.ai().a((gkh)(new gkb(this, (cja)$$0, true)));
            this.cs.ai().a((gkh)(new gkb(this, (cja)$$0, false)));
         }

         return true;
      }
   }

   @Override
   public void bC() {
      super.bC();
      this.db = false;
   }

   @Override
   public float g(float $$0) {
      return this.dE();
   }

   @Override
   public float h(float $$0) {
      return this.bO() ? super.h($$0) : this.dC();
   }

   @Override
   public void l() {
      if (this.dM().f(this.dq(), this.dw())) {
         super.l();
         if (this.bO()) {
            this.cq.b(new afo.c(this.dC(), this.dE(), this.aC()));
            this.cq.b(new afw(this.bk, this.bm, this.cr.g, this.cr.h));
            bno $$0 = this.cW();
            if ($$0 != this && $$0.cX()) {
               this.cq.b(new afp($$0));
               this.E();
            }
         } else {
            this.D();
         }

         for (gjr $$1 : this.cK) {
            $$1.a();
         }
      }
   }

   public float d() {
      for (gjr $$0 : this.cK) {
         if ($$0 instanceof gjv) {
            return ((gjv)$$0).b();
         }
      }

      return 0.0F;
   }

   private void D() {
      this.E();
      boolean $$0 = this.bS();
      if ($$0 != this.cT) {
         afv.a $$1 = $$0 ? afv.a.a : afv.a.b;
         this.cq.b(new afv(this, $$1));
         this.cT = $$0;
      }

      if (this.w()) {
         double $$2 = this.dr() - this.cM;
         double $$3 = this.dt() - this.cN;
         double $$4 = this.dx() - this.cO;
         double $$5 = (double)(this.dC() - this.cP);
         double $$6 = (double)(this.dE() - this.cQ);
         this.cV++;
         boolean $$7 = awh.f($$2, $$3, $$4) > awh.k(2.0E-4) || this.cV >= 20;
         boolean $$8 = $$5 != 0.0 || $$6 != 0.0;
         if (this.bO()) {
            ens $$9 = this.dp();
            this.cq.b(new afo.b($$9.c, -999.0, $$9.e, this.dC(), this.dE(), this.aC()));
            $$7 = false;
         } else if ($$7 && $$8) {
            this.cq.b(new afo.b(this.dr(), this.dt(), this.dx(), this.dC(), this.dE(), this.aC()));
         } else if ($$7) {
            this.cq.b(new afo.a(this.dr(), this.dt(), this.dx(), this.aC()));
         } else if ($$8) {
            this.cq.b(new afo.c(this.dC(), this.dE(), this.aC()));
         } else if (this.cR != this.aC()) {
            this.cq.b(new afo.d(this.aC()));
         }

         if ($$7) {
            this.cM = this.dr();
            this.cN = this.dt();
            this.cO = this.dx();
            this.cV = 0;
         }

         if ($$8) {
            this.cP = this.dC();
            this.cQ = this.dE();
         }

         this.cR = this.aC();
         this.dc = this.cs.m.F().c();
      }
   }

   private void E() {
      boolean $$0 = this.bY();
      if ($$0 != this.cU) {
         afv.a $$1 = $$0 ? afv.a.d : afv.a.e;
         this.cq.b(new afv(this, $$1));
         this.cU = $$0;
      }
   }

   public boolean a(boolean $$0) {
      afu.a $$1 = $$0 ? afu.a.d : afu.a.e;
      coz $$2 = this.fT().a($$0);
      this.cq.b(new afu($$1, hz.c, ie.a));
      return !$$2.b();
   }

   @Override
   public void a(blt $$0) {
      super.a($$0);
      this.cq.b(new agk($$0));
   }

   @Override
   public void fR() {
      this.cq.b(new afc(afc.a.a));
      exf.c();
   }

   @Override
   protected void f(bmn $$0, float $$1) {
      if (!this.b($$0)) {
         this.t(this.ew() - $$1);
      }
   }

   @Override
   public void r() {
      this.cq.b(new afh(this.bW.j));
      this.e();
   }

   public void e() {
      super.r();
      this.cs.a(null);
   }

   public void D(float $$0) {
      if (this.cW) {
         float $$1 = this.ew() - $$0;
         if ($$1 <= 0.0F) {
            this.t($$0);
            if ($$1 < 0.0F) {
               this.ak = 10;
            }
         } else {
            this.bi = $$1;
            this.ak = 20;
            this.t($$0);
            this.aL = 10;
            this.aK = this.aL;
         }
      } else {
         this.t($$0);
         this.cW = true;
      }
   }

   @Override
   public void y() {
      this.cq.b(new aft(this.fU()));
   }

   @Override
   public boolean g() {
      return true;
   }

   @Override
   public boolean fv() {
      return !this.fU().b && super.fv();
   }

   @Override
   public boolean bl() {
      return !this.fU().b && super.bl();
   }

   @Override
   public boolean dS() {
      return !this.fU().b && super.dS();
   }

   protected void h() {
      this.cq.b(new afv(this, afv.a.f, awh.d(this.u() * 100.0F)));
   }

   public void i() {
      this.cq.b(new afv(this, afv.a.h));
   }

   public atv j() {
      return this.cI;
   }

   public ewu m() {
      return this.cJ;
   }

   public void a(csd<?> $$0) {
      if (this.cJ.d($$0)) {
         this.cJ.e($$0);
         this.cq.b(new afy($$0));
      }
   }

   @Override
   protected int F() {
      return this.cL;
   }

   public void a(int $$0) {
      this.cL = $$0;
   }

   @Override
   public void a(vq $$0, boolean $$1) {
      this.cs.aX().a($$0, $$1);
   }

   private void c(double $$0, double $$1) {
      hz $$2 = hz.a($$0, this.dt(), $$1);
      if (this.i($$2)) {
         double $$3 = $$0 - (double)$$2.u();
         double $$4 = $$1 - (double)$$2.w();
         ie $$5 = null;
         double $$6 = Double.MAX_VALUE;
         ie[] $$7 = new ie[]{ie.e, ie.f, ie.c, ie.d};

         for (ie $$8 : $$7) {
            double $$9 = $$8.o().a($$3, 0.0, $$4);
            double $$10 = $$8.f() == ie.b.a ? 1.0 - $$9 : $$9;
            if ($$10 < $$6 && !this.i($$2.a($$8))) {
               $$6 = $$10;
               $$5 = $$8;
            }
         }

         if ($$5 != null) {
            ens $$11 = this.dp();
            if ($$5.o() == ie.a.a) {
               this.o(0.1 * (double)$$5.j(), $$11.d, $$11.e);
            } else {
               this.o($$11.c, $$11.d, 0.1 * (double)$$5.l());
            }
         }
      }
   }

   private boolean i(hz $$0) {
      enn $$1 = this.cH();
      enn $$2 = new enn((double)$$0.u(), $$1.b, (double)$$0.w(), (double)$$0.u() + 1.0, $$1.e, (double)$$0.w() + 1.0).h(1.0E-7);
      return this.dM().f(this, $$2);
   }

   public void a(float $$0, int $$1, int $$2) {
      this.cl = $$0;
      this.ck = $$1;
      this.cj = $$2;
   }

   @Override
   public void a(vq $$0) {
      this.cs.l.d().a($$0);
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
      this.dg = $$0;
   }

   public boolean o() {
      return this.dg;
   }

   public void u(boolean $$0) {
      this.dh = $$0;
   }

   public boolean p() {
      return this.dh;
   }

   @Override
   public void a(atj $$0, float $$1, float $$2) {
      this.dM().a(this.dr(), this.dt(), this.dx(), $$0, this.db(), $$1, $$2, false);
   }

   @Override
   public void a(atj $$0, atl $$1, float $$2, float $$3) {
      this.dM().a(this.dr(), this.dt(), this.dx(), $$0, $$1, $$2, $$3, false);
   }

   @Override
   public boolean cY() {
      return true;
   }

   @Override
   public void c(blt $$0) {
      coz $$1 = this.b($$0);
      if (!$$1.b() && !this.fn()) {
         super.c($$0);
         this.cZ = true;
         this.da = $$0;
      }
   }

   @Override
   public boolean fn() {
      return this.cZ;
   }

   @Override
   public void ft() {
      super.ft();
      this.cZ = false;
   }

   @Override
   public blt fo() {
      return Objects.requireNonNullElse(this.da, blt.a);
   }

   @Override
   public void a(aie<?> $$0) {
      super.a($$0);
      if (u.equals($$0)) {
         boolean $$1 = (this.am.b(u) & 1) > 0;
         blt $$2 = (this.am.b(u) & 2) > 0 ? blt.b : blt.a;
         if ($$1 && !this.cZ) {
            this.c($$2);
         } else if (!$$1 && this.cZ) {
            this.ft();
         }
      }

      if (an.equals($$0) && this.fw() && !this.de) {
         this.cs.ai().a((gkh)(new gjx(this)));
      }
   }

   @Nullable
   public boq q() {
      if (this.da() instanceof boq $$0 && $$0.a()) {
         return $$0;
      }

      return null;
   }

   public float u() {
      return this.cY;
   }

   @Override
   public boolean Y() {
      return this.cs.aQ();
   }

   @Override
   public void a(dkc $$0, boolean $$1) {
      if ($$0 instanceof djq $$2) {
         this.cs.a(new fha($$2, $$1, this.cs.aQ()));
      } else {
         this.cs.a(new fhn($$0, $$1, this.cs.aQ()));
      }
   }

   @Override
   public void a(cuo $$0) {
      this.cs.a(new fhk($$0));
   }

   @Override
   public void a(djd $$0) {
      this.cs.a(new fgn($$0));
   }

   @Override
   public void a(dkh $$0) {
      this.cs.a(new fhr($$0));
   }

   @Override
   public void a(djt $$0) {
      this.cs.a(new fhf($$0));
   }

   @Override
   public void a(coz $$0, blt $$1) {
      if ($$0.a(cpc.tW)) {
         this.cs.a(new fgj(this, $$0, $$1));
      }
   }

   @Override
   public void a(bno $$0) {
      this.cs.g.a($$0, jz.g);
   }

   @Override
   public void b(bno $$0) {
      this.cs.g.a($$0, jz.s);
   }

   @Override
   public boolean bS() {
      return this.cr != null && this.cr.h;
   }

   @Override
   public boolean bX() {
      return this.cS;
   }

   public boolean v() {
      return this.bX() || this.cb();
   }

   @Override
   public void fi() {
      super.fi();
      if (this.w()) {
         this.bk = this.cr.a;
         this.bm = this.cr.b;
         this.bj = this.cr.g;
         this.cx = this.cu;
         this.cy = this.cw;
         this.cw = this.cw + (this.dE() - this.cw) * 0.5F;
         this.cu = this.cu + (this.dC() - this.cu) * 0.5F;
      }
   }

   protected boolean w() {
      return this.cs.am() == this;
   }

   @Override
   public void z() {
      this.b(bor.a);
      if (this.dM() != null) {
         for (double $$0 = this.dt(); $$0 > (double)this.dM().J_() && $$0 < (double)this.dM().al(); $$0++) {
            this.a_(this.dr(), $$0, this.dx());
            if (this.dM().g(this)) {
               break;
            }
         }

         this.g(ens.b);
         this.s(0.0F);
      }

      this.t(this.eN());
      this.aM = 0;
   }

   @Override
   public void d_() {
      if (this.ct > 0) {
         this.ct--;
      }

      if (!(this.cs.y instanceof ffc)) {
         this.G();
      }

      boolean $$0 = this.cr.g;
      boolean $$1 = this.cr.h;
      boolean $$2 = this.M();
      this.cS = !this.fU().b && !this.bZ() && !this.bO() && this.h(bor.f) && (this.bS() || !this.fD() && !this.h(bor.a));
      float $$3 = awh.a(0.3F + ctj.b(this), 0.0F, 1.0F);
      this.cr.a(this.v(), $$3);
      this.cs.az().a(this.cr);
      if (this.fn() && !this.bO()) {
         this.cr.a *= 0.2F;
         this.cr.b *= 0.2F;
         this.ct = 0;
      }

      boolean $$4 = false;
      if (this.dd > 0) {
         this.dd--;
         $$4 = true;
         this.cr.g = true;
      }

      if (!this.ae) {
         this.c(this.dr() - (double)this.dg() * 0.35, this.dx() + (double)this.dg() * 0.35);
         this.c(this.dr() - (double)this.dg() * 0.35, this.dx() - (double)this.dg() * 0.35);
         this.c(this.dr() + (double)this.dg() * 0.35, this.dx() - (double)this.dg() * 0.35);
         this.c(this.dr() + (double)this.dg() * 0.35, this.dx() + (double)this.dg() * 0.35);
      }

      if ($$1) {
         this.ct = 0;
      }

      boolean $$5 = this.K();
      boolean $$6 = this.bO() ? this.cZ().aC() : this.aC();
      boolean $$7 = !$$1 && !$$2;
      if (($$6 || this.be()) && $$7 && $$5) {
         if (this.ct <= 0 && !this.cs.m.D.e()) {
            this.ct = 7;
         } else {
            this.g(true);
         }
      }

      if ((!this.aZ() || this.be()) && $$5 && this.cs.m.D.e()) {
         this.g(true);
      }

      if (this.bY()) {
         boolean $$8 = !this.cr.b() || !this.N();
         boolean $$9 = $$8 || this.O && !this.R || this.aZ() && !this.be();
         if (this.bZ()) {
            if (!this.aC() && !this.cr.h && $$8 || !this.aZ()) {
               this.g(false);
            }
         } else if ($$9) {
            this.g(false);
         }
      }

      boolean $$10 = false;
      if (this.fU().c) {
         if (this.cs.q.h()) {
            if (!this.fU().b) {
               this.fU().b = true;
               $$10 = true;
               this.y();
            }
         } else if (!$$0 && this.cr.g && !$$4) {
            if (this.bY == 0) {
               this.bY = 7;
            } else if (!this.bZ()) {
               this.fU().b = !this.fU().b;
               $$10 = true;
               this.y();
               this.bY = 0;
            }
         }
      }

      if (this.cr.g && !$$10 && !$$0 && !this.fU().b && !this.bO() && !this.e_()) {
         coz $$11 = this.c(bnv.e);
         if ($$11.a(cpc.nS) && cnt.d($$11) && this.fY()) {
            this.cq.b(new afv(this, afv.a.i));
         }
      }

      this.de = this.fw();
      if (this.aZ() && this.cr.h && this.eb()) {
         this.fc();
      }

      if (this.a(aue.a)) {
         int $$12 = this.P_() ? 10 : 1;
         this.df = awh.a(this.df + $$12, 0, 600);
      } else if (this.df > 0) {
         this.a(aue.a);
         this.df = awh.a(this.df - 10, 0, 600);
      }

      if (this.fU().b && this.w()) {
         int $$13 = 0;
         if (this.cr.h) {
            $$13--;
         }

         if (this.cr.g) {
            $$13++;
         }

         if ($$13 != 0) {
            this.g(this.dp().b(0.0, (double)((float)$$13 * this.fU().a() * 3.0F), 0.0));
         }
      }

      boq $$14 = this.q();
      if ($$14 != null && $$14.ad_() == 0) {
         if (this.cX < 0) {
            this.cX++;
            if (this.cX == 0) {
               this.cY = 0.0F;
            }
         }

         if ($$0 && !this.cr.g) {
            this.cX = -10;
            $$14.b(awh.d(this.u() * 100.0F));
            this.h();
         } else if (!$$0 && this.cr.g) {
            this.cX = 0;
            this.cY = 0.0F;
         } else if ($$0) {
            this.cX++;
            if (this.cX < 10) {
               this.cY = (float)this.cX * 0.1F;
            } else {
               this.cY = 0.8F + 2.0F / (float)(this.cX - 9) * 0.1F;
            }
         }
      } else {
         this.cY = 0.0F;
      }

      super.d_();
      if (this.aC() && this.fU().b && !this.cs.q.h()) {
         this.fU().b = false;
         this.y();
      }
   }

   @Override
   protected void ec() {
      this.aM++;
      if (this.aM == 20) {
         this.a(bno.c.a);
      }
   }

   private void G() {
      this.cA = this.cz;
      float $$0 = 0.0F;
      if (this.au) {
         if (this.cs.y != null && !this.cs.y.m() && !(this.cs.y instanceof fed)) {
            if (this.cs.y instanceof fgd) {
               this.r();
            }

            this.cs.a(null);
         }

         if (this.cz == 0.0F) {
            this.cs.ai().a(gkc.b(atk.ub, this.af.i() * 0.4F + 0.8F, 0.25F));
         }

         $$0 = 0.0125F;
         this.au = false;
      } else if (this.a(bnd.i) && !this.c(bnd.i).a(60)) {
         $$0 = 0.006666667F;
      } else if (this.cz > 0.0F) {
         $$0 = -0.05F;
      }

      this.cz = awh.a(this.cz + $$0, 0.0F, 1.0F);
      this.L();
   }

   @Override
   public void t() {
      super.t();
      this.db = false;
      if (this.da() instanceof cjc $$0) {
         $$0.a(this.cr.e, this.cr.f, this.cr.c, this.cr.d);
         this.db = this.db | (this.cr.e || this.cr.f || this.cr.c || this.cr.d);
      }
   }

   @Override
   public boolean A() {
      return this.db;
   }

   @Nullable
   @Override
   public bnb d(ij<bmz> $$0) {
      if ($$0.a(bnd.i)) {
         this.cA = 0.0F;
         this.cz = 0.0F;
      }

      return super.d($$0);
   }

   @Override
   public void a(bol $$0, ens $$1) {
      double $$2 = this.dr();
      double $$3 = this.dx();
      super.a($$0, $$1);
      this.f((float)(this.dr() - $$2), (float)(this.dx() - $$3));
   }

   public boolean B() {
      return this.dc;
   }

   protected void f(float $$0, float $$1) {
      if (this.H()) {
         ens $$2 = this.dk();
         ens $$3 = $$2.b((double)$$0, 0.0, (double)$$1);
         ens $$4 = new ens((double)$$0, 0.0, (double)$$1);
         float $$5 = this.ff();
         float $$6 = (float)$$4.g();
         if ($$6 <= 0.001F) {
            enr $$7 = this.cr.a();
            float $$8 = $$5 * $$7.i;
            float $$9 = $$5 * $$7.j;
            float $$10 = awh.a(this.dC() * (float) (Math.PI / 180.0));
            float $$11 = awh.b(this.dC() * (float) (Math.PI / 180.0));
            $$4 = new ens((double)($$8 * $$11 - $$9 * $$10), $$4.d, (double)($$9 * $$11 + $$8 * $$10));
            $$6 = (float)$$4.g();
            if ($$6 <= 0.001F) {
               return;
            }
         }

         float $$12 = awh.i($$6);
         ens $$13 = $$4.a((double)$$12);
         ens $$14 = this.bH();
         float $$15 = (float)($$14.c * $$13.c + $$14.e * $$13.e);
         if (!($$15 < -0.15F)) {
            enx $$16 = enx.a(this);
            hz $$17 = hz.a(this.dr(), this.cH().e, this.dx());
            dlf $$18 = this.dM().a_($$17);
            if ($$18.b(this.dM(), $$17, $$16).c()) {
               $$17 = $$17.c();
               dlf $$19 = this.dM().a_($$17);
               if ($$19.b(this.dM(), $$17, $$16).c()) {
                  float $$20 = 7.0F;
                  float $$21 = 1.2F;
                  if (this.a(bnd.h)) {
                     $$21 += (float)(this.c(bnd.h).d() + 1) * 0.75F;
                  }

                  float $$22 = Math.max($$5 * 7.0F, 1.0F / $$12);
                  ens $$24 = $$3.e($$13.a((double)$$22));
                  float $$25 = this.dg();
                  float $$26 = this.dh();
                  enn $$27 = new enn($$2, $$24.b(0.0, (double)$$26, 0.0)).c((double)$$25, 0.0, (double)$$25);
                  ens $$23 = $$2.b(0.0, 0.51F, 0.0);
                  $$24 = $$24.b(0.0, 0.51F, 0.0);
                  ens $$28 = $$13.c(new ens(0.0, 1.0, 0.0));
                  ens $$29 = $$28.a((double)($$25 * 0.5F));
                  ens $$30 = $$23.d($$29);
                  ens $$31 = $$24.d($$29);
                  ens $$32 = $$23.e($$29);
                  ens $$33 = $$24.e($$29);
                  Iterable<eol> $$34 = this.dM().d(this, $$27);
                  Iterator<enn> $$35 = StreamSupport.stream($$34.spliterator(), false).flatMap($$0x -> $$0x.e().stream()).iterator();
                  float $$36 = Float.MIN_VALUE;

                  while ($$35.hasNext()) {
                     enn $$37 = $$35.next();
                     if ($$37.a($$30, $$31) || $$37.a($$32, $$33)) {
                        $$36 = (float)$$37.e;
                        ens $$38 = $$37.f();
                        hz $$39 = hz.a($$38);

                        for (int $$40 = 1; (float)$$40 < $$21; $$40++) {
                           hz $$41 = $$39.b($$40);
                           dlf $$42 = this.dM().a_($$41);
                           eol $$43;
                           if (!($$43 = $$42.b(this.dM(), $$41, $$16)).c()) {
                              $$36 = (float)$$43.c(ie.a.b) + (float)$$41.v();
                              if ((double)$$36 - this.dt() > (double)$$21) {
                                 return;
                              }
                           }

                           if ($$40 > 1) {
                              $$17 = $$17.c();
                              dlf $$44 = this.dM().a_($$17);
                              if (!$$44.b(this.dM(), $$17, $$16).c()) {
                                 return;
                              }
                           }
                        }
                        break;
                     }
                  }

                  if ($$36 != Float.MIN_VALUE) {
                     float $$45 = (float)((double)$$36 - this.dt());
                     if (!($$45 <= 0.5F) && !($$45 > $$21)) {
                        this.dd = 1;
                     }
                  }
               }
            }
         }
      }
   }

   @Override
   protected boolean c(ens $$0) {
      float $$1 = this.dC() * (float) (Math.PI / 180.0);
      double $$2 = (double)awh.a($$1);
      double $$3 = (double)awh.b($$1);
      double $$4 = (double)this.bk * $$3 - (double)this.bm * $$2;
      double $$5 = (double)this.bm * $$3 + (double)this.bk * $$2;
      double $$6 = awh.k($$4) + awh.k($$5);
      double $$7 = awh.k($$0.c) + awh.k($$0.e);
      if (!($$6 < 1.0E-5F) && !($$7 < 1.0E-5F)) {
         double $$8 = $$4 * $$0.c + $$5 * $$0.e;
         double $$9 = Math.acos($$8 / Math.sqrt($$6 * $$7));
         return $$9 < 0.13962634F;
      } else {
         return false;
      }
   }

   private boolean H() {
      return this.B() && this.dd <= 0 && this.aC() && !this.fK() && !this.bO() && this.I() && (double)this.aK() >= 1.0;
   }

   private boolean I() {
      enr $$0 = this.cr.a();
      return $$0.i != 0.0F || $$0.j != 0.0F;
   }

   private boolean K() {
      return !this.bY() && this.M() && this.N() && !this.fn() && !this.a(bnd.o) && (!this.bO() || this.c(this.cZ())) && !this.fw();
   }

   private boolean c(bno $$0) {
      return $$0.dF() && $$0.cX();
   }

   private boolean M() {
      double $$0 = 0.8;
      return this.be() ? this.cr.b() : (double)this.cr.b >= 0.8;
   }

   private boolean N() {
      return this.bO() || (float)this.gd().a() > 6.0F || this.fU().c;
   }

   public float C() {
      if (!this.a(aue.a)) {
         return 0.0F;
      } else {
         float $$0 = 600.0F;
         float $$1 = 100.0F;
         if ((float)this.df >= 600.0F) {
            return 1.0F;
         } else {
            float $$2 = awh.a((float)this.df / 100.0F, 0.0F, 1.0F);
            float $$3 = (float)this.df < 100.0F ? 0.0F : awh.a(((float)this.df - 100.0F) / 500.0F, 0.0F, 1.0F);
            return $$2 * 0.6F + $$3 * 0.39999998F;
         }
      }
   }

   public void a(cvk $$0) {
      if ($$0 == cvk.d) {
         this.g(this.dp().a(ie.a.b, 0.0));
      }
   }

   @Override
   public boolean be() {
      return this.ci;
   }

   @Override
   protected boolean fL() {
      boolean $$0 = this.ci;
      boolean $$1 = super.fL();
      if (this.P_()) {
         return this.ci;
      } else {
         if (!$$0 && $$1) {
            this.dM().a(this.dr(), this.dt(), this.dx(), atk.x, atl.i, 1.0F, 1.0F, false);
            this.cs.ai().a((gkh)(new gkk.b(this)));
         }

         if ($$0 && !$$1) {
            this.dM().a(this.dr(), this.dt(), this.dx(), atk.y, atl.i, 1.0F, 1.0F, false);
         }

         return this.ci;
      }
   }

   @Override
   public ens q(float $$0) {
      if (this.cs.m.ax().a()) {
         float $$1 = awh.i($$0 * 0.5F, this.dC(), this.M) * (float) (Math.PI / 180.0);
         float $$2 = awh.i($$0 * 0.5F, this.dE(), this.N) * (float) (Math.PI / 180.0);
         double $$3 = this.fm() == boa.b ? -1.0 : 1.0;
         ens $$4 = new ens(0.39 * $$3, -0.6, 0.3);
         return $$4.a(-$$2).b(-$$1).e(this.j($$0));
      } else {
         return super.q($$0);
      }
   }

   @Override
   public void a(coz $$0, coz $$1, ckj $$2) {
      this.cs.az().a($$0, $$1, $$2);
   }

   @Override
   public float dD() {
      return this.dC();
   }
}
