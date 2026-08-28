import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class glv extends gls {
   public static final Logger h = LogUtils.getLogger();
   private static final int cx = 20;
   private static final int cy = 600;
   private static final int cz = 100;
   private static final float cA = 0.6F;
   private static final double cB = 0.35;
   private static final double cC = 0.13962634F;
   public static final float i = 0.2F;
   public final ggz j;
   private final awl cD;
   private final flr cE;
   private final azz cF = new azz(20, 1280);
   private final List<hiy> cG = Lists.newArrayList();
   private int cH = 0;
   private double cI;
   private double cJ;
   private double cK;
   private float cL;
   private float cM;
   private boolean cN;
   private boolean cO;
   private boolean cP;
   private boolean cQ;
   private boolean cR;
   private int cS;
   private boolean cT;
   public glt k = new glt();
   private cpp cU = cpp.b;
   protected final fmg cp;
   protected int cq;
   public float cr;
   public float cs;
   public float ct;
   public float cu;
   private int cV;
   private float cW;
   public float cv;
   public float cw;
   private boolean cX;
   @Nullable
   private bsx cY;
   private boolean cZ;
   private boolean da = true;
   private int db;
   private boolean dc;
   private int dd;
   private boolean de = true;
   private boolean df = false;

   public glv(fmg $$0, ggy $$1, ggz $$2, awl $$3, flr $$4, boolean $$5, boolean $$6) {
      super($$1, $$2.o());
      this.cp = $$0;
      this.j = $$2;
      this.cD = $$3;
      this.cE = $$4;
      this.cQ = $$5;
      this.cR = $$6;
      this.cG.add(new hjq(this, $$0.ak()));
      this.cG.add(new hjd(this));
      this.cG.add(new hjc(this, $$0.ak(), $$1.D_()));
   }

   @Override
   public void c(float $$0) {
   }

   @Override
   public boolean a(bva $$0, boolean $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         if ($$0 instanceof crq) {
            this.cp.ak().a((hjo)(new hji(this, (crq)$$0, true)));
            this.cp.ak().a((hjo)(new hji(this, (crq)$$0, false)));
         }

         return true;
      }
   }

   @Override
   public void ae() {
      super.ae();
      this.cZ = false;
   }

   @Override
   public float i(float $$0) {
      return this.dM();
   }

   @Override
   public float j(float $$0) {
      return this.bY() ? super.j($$0) : this.dK();
   }

   @Override
   public void h() {
      this.gM();
      if (this.gL()) {
         this.cF.b();
         super.h();
         this.H();
         if (!this.cU.equals(this.k.a)) {
            this.j.b(new ahn(this.k.a));
            this.cU = this.k.a;
         }

         if (this.bY()) {
            this.j.b(new ahe.c(this.dK(), this.dM(), this.aJ(), this.P));
            bva $$0 = this.de();
            if ($$0 != this && $$0.df()) {
               this.j.b(ahf.a($$0));
               this.I();
            }
         } else {
            this.F();
         }

         for (hiy $$1 : this.cG) {
            $$1.a();
         }
      }
   }

   public float d() {
      for (hiy $$0 : this.cG) {
         if ($$0 instanceof hjc) {
            return ((hjc)$$0).b();
         }
      }

      return 0.0F;
   }

   private void F() {
      this.I();
      if (this.y()) {
         double $$0 = this.dz() - this.cI;
         double $$1 = this.dB() - this.cJ;
         double $$2 = this.dF() - this.cK;
         double $$3 = (double)(this.dK() - this.cL);
         double $$4 = (double)(this.dM() - this.cM);
         this.cS++;
         boolean $$5 = ayz.f($$0, $$1, $$2) > ayz.k(2.0E-4) || this.cS >= 20;
         boolean $$6 = $$3 != 0.0 || $$4 != 0.0;
         if ($$5 && $$6) {
            this.j.b(new ahe.b(this.dz(), this.dB(), this.dF(), this.dK(), this.dM(), this.aJ(), this.P));
         } else if ($$5) {
            this.j.b(new ahe.a(this.dz(), this.dB(), this.dF(), this.aJ(), this.P));
         } else if ($$6) {
            this.j.b(new ahe.c(this.dK(), this.dM(), this.aJ(), this.P));
         } else if (this.cN != this.aJ() || this.cO != this.P) {
            this.j.b(new ahe.d(this.aJ(), this.P));
         }

         if ($$5) {
            this.cI = this.dz();
            this.cJ = this.dB();
            this.cK = this.dF();
            this.cS = 0;
         }

         if ($$6) {
            this.cL = this.dK();
            this.cM = this.dM();
         }

         this.cN = this.aJ();
         this.cO = this.P;
         this.da = this.cp.n.J().c();
      }
   }

   private void H() {
      boolean $$0 = this.cc();
      if ($$0 != this.cQ) {
         ahm.a $$1 = $$0 ? ahm.a.a : ahm.a.b;
         this.j.b(new ahm(this, $$1));
         this.cQ = $$0;
      }
   }

   private void I() {
      boolean $$0 = this.ci();
      if ($$0 != this.cR) {
         ahm.a $$1 = $$0 ? ahm.a.d : ahm.a.e;
         this.j.b(new ahm(this, $$1));
         this.cR = $$0;
      }
   }

   public boolean a(boolean $$0) {
      ahl.a $$1 = $$0 ? ahl.a.d : ahl.a.e;
      cxh $$2 = this.gl().a($$0);
      this.j.b(new ahl($$1, ji.c, jn.a));
      return !$$2.f();
   }

   @Override
   public void a(bsx $$0) {
      super.a($$0);
      this.j.b(new aid($$0));
   }

   @Override
   public void gi() {
      this.j.b(new agq(agq.a.a));
      fme.c();
   }

   @Override
   public void p() {
      this.j.b(new agw(this.bQ.l));
      this.e();
   }

   public void e() {
      super.p();
      this.cp.a(null);
   }

   public void K(float $$0) {
      if (this.cT) {
         float $$1 = this.eE() - $$0;
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
         this.cT = true;
      }
   }

   @Override
   public void x() {
      this.j.b(new ahk(this.gm()));
   }

   @Override
   public boolean gj() {
      return true;
   }

   @Override
   public boolean fK() {
      return !this.gm().b && super.fK();
   }

   @Override
   public boolean bt() {
      return !this.gm().b && super.bt();
   }

   protected void f() {
      this.j.b(new ahm(this, ahm.a.f, ayz.d(this.v() * 100.0F)));
   }

   public void i() {
      this.j.b(new ahm(this, ahm.a.h));
   }

   public awl l() {
      return this.cD;
   }

   public flr m() {
      return this.cE;
   }

   public void a(ddd $$0) {
      if (this.cE.b($$0)) {
         this.cE.c($$0);
         this.j.b(new ahq($$0));
      }
   }

   @Override
   public int G() {
      return this.cH;
   }

   public void a(int $$0) {
      this.cH = $$0;
   }

   @Override
   public void a(wp $$0, boolean $$1) {
      this.cp.aZ().a($$0, $$1);
   }

   private void c(double $$0, double $$1) {
      ji $$2 = ji.a($$0, this.dB(), $$1);
      if (this.c($$2)) {
         double $$3 = $$0 - (double)$$2.u();
         double $$4 = $$1 - (double)$$2.w();
         jn $$5 = null;
         double $$6 = Double.MAX_VALUE;
         jn[] $$7 = new jn[]{jn.e, jn.f, jn.c, jn.d};

         for (jn $$8 : $$7) {
            double $$9 = $$8.o().a($$3, 0.0, $$4);
            double $$10 = $$8.f() == jn.b.a ? 1.0 - $$9 : $$9;
            if ($$10 < $$6 && !this.c($$2.a($$8))) {
               $$6 = $$10;
               $$5 = $$8;
            }
         }

         if ($$5 != null) {
            fbx $$11 = this.dx();
            if ($$5.o() == jn.a.a) {
               this.n(0.1 * (double)$$5.j(), $$11.e, $$11.f);
            } else {
               this.n($$11.d, $$11.e, 0.1 * (double)$$5.l());
            }
         }
      }
   }

   private boolean c(ji $$0) {
      fbs $$1 = this.cQ();
      fbs $$2 = new fbs((double)$$0.u(), $$1.b, (double)$$0.w(), (double)$$0.u() + 1.0, $$1.e, (double)$$0.w() + 1.0).h(1.0E-7);
      return this.dU().g(this, $$2);
   }

   public void a(float $$0, int $$1, int $$2) {
      this.cg = $$0;
      this.cf = $$1;
      this.ce = $$2;
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
      this.de = $$0;
   }

   public boolean n() {
      return this.de;
   }

   public void x(boolean $$0) {
      this.df = $$0;
   }

   public boolean t() {
      return this.df;
   }

   @Override
   public void a(avz $$0, float $$1, float $$2) {
      this.dU().a(this.dz(), this.dB(), this.dF(), $$0, this.dl(), $$1, $$2, false);
   }

   @Override
   public void a(avz $$0, awb $$1, float $$2, float $$3) {
      this.dU().a(this.dz(), this.dB(), this.dF(), $$0, $$1, $$2, $$3, false);
   }

   @Override
   public void c(bsx $$0) {
      cxh $$1 = this.b($$0);
      if (!$$1.f() && !this.fB()) {
         super.c($$0);
         this.cX = true;
         this.cY = $$0;
      }
   }

   @Override
   public boolean fB() {
      return this.cX;
   }

   @Override
   public void fH() {
      super.fH();
      this.cX = false;
   }

   @Override
   public bsx fC() {
      return Objects.requireNonNullElse(this.cY, bsx.a);
   }

   @Override
   public void a(ajx<?> $$0) {
      super.a($$0);
      if (aC.equals($$0)) {
         boolean $$1 = (this.al.a(aC) & 1) > 0;
         bsx $$2 = (this.al.a(aC) & 2) > 0 ? bsx.b : bsx.a;
         if ($$1 && !this.cX) {
            this.c($$2);
         } else if (!$$1 && this.cX) {
            this.fH();
         }
      }

      if (am.equals($$0) && this.fL() && !this.dc) {
         this.cp.ak().a((hjo)(new hje(this)));
      }
   }

   @Nullable
   public bwi u() {
      if (this.dk() instanceof bwi $$0 && $$0.a()) {
         return $$0;
      }

      return null;
   }

   public float v() {
      return this.cW;
   }

   @Override
   public boolean aa() {
      return this.cp.aT();
   }

   @Override
   public void a(dwf $$0, boolean $$1) {
      if ($$0 instanceof dvs $$2) {
         this.cp.a(new fwv($$2, $$1, this.cp.aT()));
      } else {
         this.cp.a(new fxi($$0, $$1, this.cp.aT()));
      }
   }

   @Override
   public void a(dga $$0) {
      this.cp.a(new fxf($$0));
   }

   @Override
   public void a(dvc $$0) {
      this.cp.a(new fwi($$0));
   }

   @Override
   public void a(dwk $$0) {
      this.cp.a(new fxm($$0));
   }

   @Override
   public void a(dvv $$0) {
      this.cp.a(new fxa($$0));
   }

   @Override
   public void a(cxh $$0, bsx $$1) {
      dan $$2 = $$0.a(kv.U);
      if ($$2 != null) {
         this.cp.a(new fwe(this, $$0, $$1, $$2));
      }
   }

   @Override
   public void b(bva $$0) {
      this.cp.g.a($$0, lt.f);
   }

   @Override
   public void c(bva $$0) {
      this.cp.g.a($$0, lt.r);
   }

   @Override
   public boolean cc() {
      return this.k.a.f();
   }

   @Override
   public boolean ch() {
      return this.cP;
   }

   public boolean w() {
      return this.ch() || this.cl();
   }

   @Override
   public void fs() {
      if (this.y()) {
         this.bg = this.k.b().i;
         this.bi = this.k.b().j;
         this.bf = this.k.a.e();
         this.ct = this.cr;
         this.cu = this.cs;
         this.cs = this.cs + (this.dM() - this.cs) * 0.5F;
         this.cr = this.cr + (this.dK() - this.cr) * 0.5F;
      }
   }

   protected boolean y() {
      return this.cp.ao() == this;
   }

   public void z() {
      this.b(bwk.a);
      if (this.dU() != null) {
         for (double $$0 = this.dB(); $$0 > (double)this.dU().G_() && $$0 <= (double)this.dU().ao(); $$0++) {
            this.a_(this.dz(), $$0, this.dF());
            if (this.dU().g(this)) {
               break;
            }
         }

         this.i(fbx.c);
         this.x(0.0F);
      }

      this.d(this.eS());
      this.aP = 0;
   }

   @Override
   public void k_() {
      if (this.cq > 0) {
         this.cq--;
      }

      if (!(this.cp.z instanceof fvg)) {
         this.y(this.A() == dqb.a.a);
         this.M();
      }

      boolean $$0 = this.k.a.e();
      boolean $$1 = this.k.a.f();
      boolean $$2 = this.Q();
      cpn $$3 = this.gm();
      this.cP = !$$3.b && !this.cj() && !this.bY() && this.h(bwk.f) && (this.cc() || !this.fT() && !this.h(bwk.a));
      this.k.a();
      this.cp.aB().a(this.k);
      if (this.J()) {
         this.h(false);
      }

      if (this.fB() && !this.bY()) {
         this.k.a(0.2F);
         this.cq = 0;
      }

      if (this.w()) {
         float $$4 = (float)this.h(bxg.z);
         this.k.a($$4);
      }

      boolean $$5 = false;
      if (this.db > 0) {
         this.db--;
         $$5 = true;
         this.k.d();
      }

      if (!this.ad) {
         this.c(this.dz() - (double)this.dp() * 0.35, this.dF() + (double)this.dp() * 0.35);
         this.c(this.dz() - (double)this.dp() * 0.35, this.dF() - (double)this.dp() * 0.35);
         this.c(this.dz() + (double)this.dp() * 0.35, this.dF() - (double)this.dp() * 0.35);
         this.c(this.dz() + (double)this.dp() * 0.35, this.dF() + (double)this.dp() * 0.35);
      }

      if ($$1) {
         this.cq = 0;
      }

      boolean $$6 = this.P();
      boolean $$7 = this.bY() ? this.dj().aJ() : this.aJ();
      boolean $$8 = !$$1 && !$$2;
      if (($$7 || this.bm()) && $$8 && $$6) {
         if (this.cq <= 0 && !this.cp.n.B.e()) {
            this.cq = 7;
         } else {
            this.h(true);
         }
      }

      if ((!this.bj() || this.bm()) && $$6 && this.cp.n.B.e()) {
         this.h(true);
      }

      if (this.ci()) {
         boolean $$9 = !this.k.c() || !this.R();
         boolean $$10 = $$9 || this.P && !this.S || this.bj() && !this.bm();
         if (this.cj()) {
            if (!this.aJ() && !this.k.a.f() && $$9 || !this.bj()) {
               this.h(false);
            }
         } else if ($$10) {
            this.h(false);
         }
      }

      boolean $$11 = false;
      if ($$3.c) {
         if (this.cp.r.g()) {
            if (!$$3.b) {
               $$3.b = true;
               $$11 = true;
               this.x();
            }
         } else if (!$$0 && this.k.a.e() && !$$5) {
            if (this.bS == 0) {
               this.bS = 7;
            } else if (!this.cj()) {
               $$3.b = !$$3.b;
               if ($$3.b && this.aJ()) {
                  this.s();
               }

               $$11 = true;
               this.x();
               this.bS = 0;
            }
         }
      }

      if (this.k.a.e() && !$$11 && !$$0 && !this.d_() && this.gs()) {
         this.j.b(new ahm(this, ahm.a.i));
      }

      this.dc = this.fL();
      if (this.bj() && this.k.a.f() && this.ek()) {
         this.fl();
      }

      if (this.a(awv.a)) {
         int $$12 = this.U_() ? 10 : 1;
         this.dd = ayz.a(this.dd + $$12, 0, 600);
      } else if (this.dd > 0) {
         this.a(awv.a);
         this.dd = ayz.a(this.dd - 10, 0, 600);
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
            this.i(this.dx().b(0.0, (double)((float)$$13 * $$3.a() * 3.0F), 0.0));
         }
      }

      bwi $$14 = this.u();
      if ($$14 != null && $$14.c() == 0) {
         if (this.cV < 0) {
            this.cV++;
            if (this.cV == 0) {
               this.cW = 0.0F;
            }
         }

         if ($$0 && !this.k.a.e()) {
            this.cV = -10;
            $$14.b(ayz.d(this.v() * 100.0F));
            this.f();
         } else if (!$$0 && this.k.a.e()) {
            this.cV = 0;
            this.cW = 0.0F;
         } else if ($$0) {
            this.cV++;
            if (this.cV < 10) {
               this.cW = (float)this.cV * 0.1F;
            } else {
               this.cW = 0.8F + 2.0F / (float)(this.cV - 9) * 0.1F;
            }
         }
      } else {
         this.cW = 0.0F;
      }

      super.k_();
      if (this.aJ() && $$3.b && !this.cp.r.g()) {
         $$3.b = false;
         this.x();
      }
   }

   private boolean J() {
      return this.L() || this.w() || this.fL() && !this.bm() || this.bY() && !this.a(this.dj()) || this.fB() && !this.bY() && !this.bm();
   }

   private boolean L() {
      return this.b(bug.o);
   }

   public dqb.a A() {
      return this.as == null ? dqb.a.b : this.as.a();
   }

   @Override
   protected void el() {
      this.aP++;
      if (this.aP == 20) {
         this.a(bva.d.a);
      }
   }

   private void y(boolean $$0) {
      this.cw = this.cv;
      float $$1 = 0.0F;
      if ($$0 && this.as != null && this.as.e()) {
         if (this.cp.z != null && !this.cp.z.k() && !(this.cp.z instanceof fum) && !(this.cp.z instanceof fvl)) {
            if (this.cp.z instanceof fvx) {
               this.p();
            }

            this.cp.a(null);
         }

         if (this.cv == 0.0F) {
            this.cp.ak().a(hjj.b(awa.vt, this.ae.i() * 0.4F + 0.8F, 0.25F));
         }

         $$1 = 0.0125F;
         this.as.a(false);
      } else if (this.cv > 0.0F) {
         $$1 = -0.05F;
      }

      this.cv = ayz.a(this.cv + $$1, 0.0F, 1.0F);
   }

   @Override
   public void r() {
      super.r();
      this.cZ = false;
      if (this.dk() instanceof cro $$0) {
         $$0.a(this.k.a.c(), this.k.a.d(), this.k.a.a(), this.k.a.b());
         this.cZ = this.cZ | (this.k.a.c() || this.k.a.d() || this.k.a.a() || this.k.a.b());
      }
   }

   public boolean B() {
      return this.cZ;
   }

   @Override
   public void a(bwc $$0, fbx $$1) {
      double $$2 = this.dz();
      double $$3 = this.dF();
      super.a($$0, $$1);
      float $$4 = (float)(this.dz() - $$2);
      float $$5 = (float)(this.dF() - $$3);
      this.g($$4, $$5);
      this.g = this.g + ayz.f($$4, $$5) * 0.6F;
   }

   public boolean C() {
      return this.da;
   }

   @Override
   public boolean gS() {
      return this.cp.n.K().c();
   }

   protected void g(float $$0, float $$1) {
      if (this.N()) {
         fbx $$2 = this.ds();
         fbx $$3 = $$2.b((double)$$0, 0.0, (double)$$1);
         fbx $$4 = new fbx((double)$$0, 0.0, (double)$$1);
         float $$5 = this.fq();
         float $$6 = (float)$$4.h();
         if ($$6 <= 0.001F) {
            fbw $$7 = this.k.b();
            float $$8 = $$5 * $$7.i;
            float $$9 = $$5 * $$7.j;
            float $$10 = ayz.a(this.dK() * (float) (Math.PI / 180.0));
            float $$11 = ayz.b(this.dK() * (float) (Math.PI / 180.0));
            $$4 = new fbx((double)($$8 * $$11 - $$9 * $$10), $$4.e, (double)($$9 * $$11 + $$8 * $$10));
            $$6 = (float)$$4.h();
            if ($$6 <= 0.001F) {
               return;
            }
         }

         float $$12 = ayz.j($$6);
         fbx $$13 = $$4.c((double)$$12);
         fbx $$14 = this.bU();
         float $$15 = (float)($$14.d * $$13.d + $$14.f * $$13.f);
         if (!($$15 < -0.15F)) {
            fcc $$16 = fcc.a(this);
            ji $$17 = ji.a(this.dz(), this.cQ().e, this.dF());
            dxq $$18 = this.dU().a_($$17);
            if ($$18.b(this.dU(), $$17, $$16).c()) {
               $$17 = $$17.d();
               dxq $$19 = this.dU().a_($$17);
               if ($$19.b(this.dU(), $$17, $$16).c()) {
                  float $$20 = 7.0F;
                  float $$21 = 1.2F;
                  if (this.b(bug.h)) {
                     $$21 += (float)(this.c(bug.h).e() + 1) * 0.75F;
                  }

                  float $$22 = Math.max($$5 * 7.0F, 1.0F / $$12);
                  fbx $$24 = $$3.e($$13.c((double)$$22));
                  float $$25 = this.dp();
                  float $$26 = this.dq();
                  fbs $$27 = new fbs($$2, $$24.b(0.0, (double)$$26, 0.0)).c((double)$$25, 0.0, (double)$$25);
                  fbx $$23 = $$2.b(0.0, 0.51F, 0.0);
                  $$24 = $$24.b(0.0, 0.51F, 0.0);
                  fbx $$28 = $$13.c(new fbx(0.0, 1.0, 0.0));
                  fbx $$29 = $$28.c((double)($$25 * 0.5F));
                  fbx $$30 = $$23.d($$29);
                  fbx $$31 = $$24.d($$29);
                  fbx $$32 = $$23.e($$29);
                  fbx $$33 = $$24.e($$29);
                  Iterable<fcr> $$34 = this.dU().d(this, $$27);
                  Iterator<fbs> $$35 = StreamSupport.stream($$34.spliterator(), false).flatMap($$0x -> $$0x.e().stream()).iterator();
                  float $$36 = Float.MIN_VALUE;

                  while ($$35.hasNext()) {
                     fbs $$37 = $$35.next();
                     if ($$37.a($$30, $$31) || $$37.a($$32, $$33)) {
                        $$36 = (float)$$37.e;
                        fbx $$38 = $$37.f();
                        ji $$39 = ji.a((kb)$$38);

                        for (int $$40 = 1; (float)$$40 < $$21; $$40++) {
                           ji $$41 = $$39.b($$40);
                           dxq $$42 = this.dU().a_($$41);
                           fcr $$43;
                           if (!($$43 = $$42.b(this.dU(), $$41, $$16)).c()) {
                              $$36 = (float)$$43.c(jn.a.b) + (float)$$41.v();
                              if ((double)$$36 - this.dB() > (double)$$21) {
                                 return;
                              }
                           }

                           if ($$40 > 1) {
                              $$17 = $$17.d();
                              dxq $$44 = this.dU().a_($$17);
                              if (!$$44.b(this.dU(), $$17, $$16).c()) {
                                 return;
                              }
                           }
                        }
                        break;
                     }
                  }

                  if ($$36 != Float.MIN_VALUE) {
                     float $$45 = (float)((double)$$36 - this.dB());
                     if (!($$45 <= 0.5F) && !($$45 > $$21)) {
                        this.db = 1;
                     }
                  }
               }
            }
         }
      }
   }

   @Override
   protected boolean d(fbx $$0) {
      float $$1 = this.dK() * (float) (Math.PI / 180.0);
      double $$2 = (double)ayz.a($$1);
      double $$3 = (double)ayz.b($$1);
      double $$4 = (double)this.bg * $$3 - (double)this.bi * $$2;
      double $$5 = (double)this.bi * $$3 + (double)this.bg * $$2;
      double $$6 = ayz.k($$4) + ayz.k($$5);
      double $$7 = ayz.k($$0.d) + ayz.k($$0.f);
      if (!($$6 < 1.0E-5F) && !($$7 < 1.0E-5F)) {
         double $$8 = $$4 * $$0.d + $$5 * $$0.f;
         double $$9 = Math.acos($$8 / Math.sqrt($$6 * $$7));
         return $$9 < 0.13962634F;
      } else {
         return false;
      }
   }

   private boolean N() {
      return this.C() && this.db <= 0 && this.aJ() && !this.gc() && !this.bY() && this.O() && (double)this.aS() >= 1.0;
   }

   private boolean O() {
      return this.k.b().c() > 0.0F;
   }

   private boolean P() {
      return !this.ci()
         && this.Q()
         && this.R()
         && !this.fB()
         && !this.L()
         && (!this.bY() || this.a(this.dj()))
         && (!this.fL() || this.bm())
         && (!this.w() || this.bm());
   }

   private boolean a(bva $$0) {
      return $$0.dN() && $$0.df();
   }

   private boolean Q() {
      double $$0 = 0.8;
      return this.bm() ? this.k.c() : (double)this.k.b().j >= 0.8;
   }

   private boolean R() {
      return this.bY() || (float)this.gw().a() > 6.0F || this.gm().c;
   }

   public float D() {
      if (!this.a(awv.a)) {
         return 0.0F;
      } else {
         float $$0 = 600.0F;
         float $$1 = 100.0F;
         if ((float)this.dd >= 600.0F) {
            return 1.0F;
         } else {
            float $$2 = ayz.a((float)this.dd / 100.0F, 0.0F, 1.0F);
            float $$3 = (float)this.dd < 100.0F ? 0.0F : ayz.a(((float)this.dd - 100.0F) / 500.0F, 0.0F, 1.0F);
            return $$2 * 0.6F + $$3 * 0.39999998F;
         }
      }
   }

   public void a(dgw $$0) {
      if ($$0 == dgw.d) {
         this.i(this.dx().a(jn.a.b, 0.0));
      }
   }

   @Override
   public boolean bm() {
      return this.cd;
   }

   @Override
   protected boolean gd() {
      boolean $$0 = this.cd;
      boolean $$1 = super.gd();
      if (this.U_()) {
         return this.cd;
      } else {
         if (!$$0 && $$1) {
            this.dU().a(this.dz(), this.dB(), this.dF(), awa.x, awb.i, 1.0F, 1.0F, false);
            this.cp.ak().a((hjo)(new hjr.b(this)));
         }

         if ($$0 && !$$1) {
            this.dU().a(this.dz(), this.dB(), this.dF(), awa.y, awb.i, 1.0F, 1.0F, false);
         }

         return this.cd;
      }
   }

   @Override
   public fbx v(float $$0) {
      if (this.cp.n.aE().a()) {
         float $$1 = ayz.h($$0 * 0.5F, this.dK(), this.N) * (float) (Math.PI / 180.0);
         float $$2 = ayz.h($$0 * 0.5F, this.dM(), this.O) * (float) (Math.PI / 180.0);
         double $$3 = this.fA() == bvr.b ? -1.0 : 1.0;
         fbx $$4 = new fbx(0.39 * $$3, -0.6, 0.3);
         return $$4.a(-$$2).b(-$$1).e(this.n($$0));
      } else {
         return super.v($$0);
      }
   }

   @Override
   public void a(cxh $$0, cxh $$1, ctg $$2) {
      this.cp.aB().a($$0, $$1, $$2);
   }

   @Override
   public float dL() {
      return this.dK();
   }

   @Override
   public void g(cxh $$0) {
      this.cp.r.a($$0);
   }

   @Override
   public boolean gp() {
      return this.cF.c();
   }

   public azz E() {
      return this.cF;
   }
}
