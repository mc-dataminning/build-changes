import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gkt extends gkq {
   public static final Logger h = LogUtils.getLogger();
   private static final int cK = 20;
   private static final int cL = 600;
   private static final int cM = 100;
   private static final float cN = 0.6F;
   private static final double cO = 0.35;
   private static final double cP = 0.13962634F;
   public static final float i = 0.2F;
   public final gfx j;
   private final awk cQ;
   private final fks cR;
   private final azy cS = new azy(20, 1280);
   private final List<hht> cT = Lists.newArrayList();
   private int cU = 0;
   private double cV;
   private double cW;
   private double cX;
   private float cY;
   private float cZ;
   private boolean da;
   private boolean db;
   private boolean dc;
   private boolean dd;
   private boolean de;
   private int df;
   private boolean dg;
   public gkr k = new gkr();
   private cot dh = cot.b;
   protected final flh cC;
   protected int cD;
   public float cE;
   public float cF;
   public float cG;
   public float cH;
   private int di;
   private float dj;
   public float cI;
   public float cJ;
   private boolean dk;
   @Nullable
   private bsh dl;
   private boolean dm;
   private boolean dn = true;
   private int do;
   private boolean dp;
   private int dq;
   private boolean dr = true;
   private boolean ds = false;

   public gkt(flh $$0, gfw $$1, gfx $$2, awk $$3, fks $$4, boolean $$5, boolean $$6) {
      super($$1, $$2.o());
      this.cC = $$0;
      this.j = $$2;
      this.cQ = $$3;
      this.cR = $$4;
      this.dd = $$5;
      this.de = $$6;
      this.cT.add(new hil(this, $$0.ak()));
      this.cT.add(new hhy(this));
      this.cT.add(new hhx(this, $$0.ak(), $$1.I_()));
   }

   @Override
   public void c(float $$0) {
   }

   @Override
   public boolean a(buj $$0, boolean $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         if ($$0 instanceof cqu) {
            this.cC.ak().a((hij)(new hid(this, (cqu)$$0, true)));
            this.cC.ak().a((hij)(new hid(this, (cqu)$$0, false)));
         }

         return true;
      }
   }

   @Override
   public void bQ() {
      super.bQ();
      this.dm = false;
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
      this.gK();
      if (this.gJ()) {
         this.cS.b();
         super.h();
         this.J();
         if (!this.dh.equals(this.k.a)) {
            this.j.b(new ahn(this.k.a));
            this.dh = this.k.a;
         }

         if (this.bZ()) {
            this.j.b(new ahe.c(this.dM(), this.dO(), this.aJ(), this.P));
            buj $$0 = this.dg();
            if ($$0 != this && $$0.di()) {
               this.j.b(ahf.a($$0));
               this.L();
            }
         } else {
            this.I();
         }

         for (hht $$1 : this.cT) {
            $$1.a();
         }
      }
   }

   public float e() {
      for (hht $$0 : this.cT) {
         if ($$0 instanceof hhx) {
            return ((hhx)$$0).b();
         }
      }

      return 0.0F;
   }

   private void I() {
      this.L();
      if (this.A()) {
         double $$0 = this.dB() - this.cV;
         double $$1 = this.dD() - this.cW;
         double $$2 = this.dH() - this.cX;
         double $$3 = (double)(this.dM() - this.cY);
         double $$4 = (double)(this.dO() - this.cZ);
         this.df++;
         boolean $$5 = ayy.f($$0, $$1, $$2) > ayy.k(2.0E-4) || this.df >= 20;
         boolean $$6 = $$3 != 0.0 || $$4 != 0.0;
         if ($$5 && $$6) {
            this.j.b(new ahe.b(this.dB(), this.dD(), this.dH(), this.dM(), this.dO(), this.aJ(), this.P));
         } else if ($$5) {
            this.j.b(new ahe.a(this.dB(), this.dD(), this.dH(), this.aJ(), this.P));
         } else if ($$6) {
            this.j.b(new ahe.c(this.dM(), this.dO(), this.aJ(), this.P));
         } else if (this.da != this.aJ() || this.db != this.P) {
            this.j.b(new ahe.d(this.aJ(), this.P));
         }

         if ($$5) {
            this.cV = this.dB();
            this.cW = this.dD();
            this.cX = this.dH();
            this.df = 0;
         }

         if ($$6) {
            this.cY = this.dM();
            this.cZ = this.dO();
         }

         this.da = this.aJ();
         this.db = this.P;
         this.dn = this.cC.n.J().c();
      }
   }

   private void J() {
      boolean $$0 = this.cd();
      if ($$0 != this.dd) {
         ahm.a $$1 = $$0 ? ahm.a.a : ahm.a.b;
         this.j.b(new ahm(this, $$1));
         this.dd = $$0;
      }
   }

   private void L() {
      boolean $$0 = this.cj();
      if ($$0 != this.de) {
         ahm.a $$1 = $$0 ? ahm.a.d : ahm.a.e;
         this.j.b(new ahm(this, $$1));
         this.de = $$0;
      }
   }

   public boolean a(boolean $$0) {
      ahl.a $$1 = $$0 ? ahl.a.d : ahl.a.e;
      cwn $$2 = this.gi().a($$0);
      this.j.b(new ahl($$1, ji.c, jn.a));
      return !$$2.f();
   }

   @Override
   public void a(bsh $$0) {
      super.a($$0);
      this.j.b(new aid($$0));
   }

   @Override
   public void gg() {
      this.j.b(new agq(agq.a.a));
      flf.c();
   }

   @Override
   public void p() {
      this.j.b(new agw(this.cd.l));
      this.f();
   }

   public void f() {
      super.p();
      this.cC.a(null);
   }

   public void J(float $$0) {
      if (this.dg) {
         float $$1 = this.eE() - $$0;
         if ($$1 <= 0.0F) {
            this.x($$0);
            if ($$1 < 0.0F) {
               this.aj = 10;
            }
         } else {
            this.bl = $$1;
            this.aj = 20;
            this.x($$0);
            this.aO = 10;
            this.aN = this.aO;
         }
      } else {
         this.x($$0);
         this.dg = true;
      }
   }

   @Override
   public void x() {
      this.j.b(new ahk(this.gj()));
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
      this.j.b(new ahm(this, ahm.a.f, ayy.d(this.y() * 100.0F)));
   }

   public void l() {
      this.j.b(new ahm(this, ahm.a.h));
   }

   public awk m() {
      return this.cQ;
   }

   public fks n() {
      return this.cR;
   }

   public void a(dcj $$0) {
      if (this.cR.b($$0)) {
         this.cR.c($$0);
         this.j.b(new ahq($$0));
      }
   }

   @Override
   public int G() {
      return this.cU;
   }

   public void a(int $$0) {
      this.cU = $$0;
   }

   @Override
   public void a(wo $$0, boolean $$1) {
      this.cC.aZ().a($$0, $$1);
   }

   private void c(double $$0, double $$1) {
      ji $$2 = ji.a($$0, this.dD(), $$1);
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
            fay $$11 = this.dz();
            if ($$5.o() == jn.a.a) {
               this.n(0.1 * (double)$$5.j(), $$11.e, $$11.f);
            } else {
               this.n($$11.d, $$11.e, 0.1 * (double)$$5.l());
            }
         }
      }
   }

   private boolean c(ji $$0) {
      fat $$1 = this.cR();
      fat $$2 = new fat((double)$$0.u(), $$1.b, (double)$$0.w(), (double)$$0.u() + 1.0, $$1.e, (double)$$0.w() + 1.0).h(1.0E-7);
      return this.dW().g(this, $$2);
   }

   public void a(float $$0, int $$1, int $$2) {
      this.ct = $$0;
      this.cs = $$1;
      this.cr = $$2;
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
      this.dr = $$0;
   }

   public boolean t() {
      return this.dr;
   }

   public void y(boolean $$0) {
      this.ds = $$0;
   }

   @Override
   public boolean u() {
      return this.ds;
   }

   @Override
   public void a(avy $$0, float $$1, float $$2) {
      this.dW().a(this.dB(), this.dD(), this.dH(), $$0, this.dn(), $$1, $$2, false);
   }

   @Override
   public void a(avy $$0, awa $$1, float $$2, float $$3) {
      this.dW().a(this.dB(), this.dD(), this.dH(), $$0, $$1, $$2, $$3, false);
   }

   @Override
   public boolean dk() {
      return true;
   }

   @Override
   public void c(bsh $$0) {
      cwn $$1 = this.b($$0);
      if (!$$1.f() && !this.fz()) {
         super.c($$0);
         this.dk = true;
         this.dl = $$0;
      }
   }

   @Override
   public boolean fz() {
      return this.dk;
   }

   @Override
   public void fF() {
      super.fF();
      this.dk = false;
   }

   @Override
   public bsh fA() {
      return Objects.requireNonNullElse(this.dl, bsh.a);
   }

   @Override
   public void a(ajx<?> $$0) {
      super.a($$0);
      if (aC.equals($$0)) {
         boolean $$1 = (this.al.a(aC) & 1) > 0;
         bsh $$2 = (this.al.a(aC) & 2) > 0 ? bsh.b : bsh.a;
         if ($$1 && !this.dk) {
            this.c($$2);
         } else if (!$$1 && this.dk) {
            this.fF();
         }
      }

      if (am.equals($$0) && this.fJ() && !this.dp) {
         this.cC.ak().a((hij)(new hhz(this)));
      }
   }

   @Nullable
   public bvp v() {
      if (this.dm() instanceof bvp $$0 && $$0.a()) {
         return $$0;
      }

      return null;
   }

   public float y() {
      return this.dj;
   }

   @Override
   public boolean aa() {
      return this.cC.aT();
   }

   @Override
   public void a(dvk $$0, boolean $$1) {
      if ($$0 instanceof dux $$2) {
         this.cC.a(new fvv($$2, $$1, this.cC.aT()));
      } else {
         this.cC.a(new fwi($$0, $$1, this.cC.aT()));
      }
   }

   @Override
   public void a(dfg $$0) {
      this.cC.a(new fwf($$0));
   }

   @Override
   public void a(duh $$0) {
      this.cC.a(new fvi($$0));
   }

   @Override
   public void a(dvp $$0) {
      this.cC.a(new fwm($$0));
   }

   @Override
   public void a(dva $$0) {
      this.cC.a(new fwa($$0));
   }

   @Override
   public void a(cwn $$0, bsh $$1) {
      czu $$2 = $$0.a(kv.S);
      if ($$2 != null) {
         this.cC.a(new fve(this, $$0, $$1, $$2));
      }
   }

   @Override
   public void b(buj $$0) {
      this.cC.g.a($$0, lt.f);
   }

   @Override
   public void c(buj $$0) {
      this.cC.g.a($$0, lt.r);
   }

   @Override
   public boolean cd() {
      return this.k.a.f();
   }

   @Override
   public boolean ci() {
      return this.dc;
   }

   public boolean z() {
      return this.ci() || this.cm();
   }

   @Override
   public void fu() {
      super.fu();
      if (this.A()) {
         this.bn = this.k.b;
         this.bp = this.k.c;
         this.bm = this.k.a.e();
         this.cG = this.cE;
         this.cH = this.cF;
         this.cF = this.cF + (this.dO() - this.cF) * 0.5F;
         this.cE = this.cE + (this.dM() - this.cE) * 0.5F;
      }
   }

   protected boolean A() {
      return this.cC.ao() == this;
   }

   @Override
   public void B() {
      this.b(bvr.a);
      if (this.dW() != null) {
         for (double $$0 = this.dD(); $$0 > (double)this.dW().L_() && $$0 <= (double)this.dW().an(); $$0++) {
            this.a_(this.dB(), $$0, this.dH());
            if (this.dW().g(this)) {
               break;
            }
         }

         this.h(fay.c);
         this.w(0.0F);
      }

      this.x(this.eS());
      this.aP = 0;
   }

   @Override
   public void d_() {
      if (this.cD > 0) {
         this.cD--;
      }

      if (!(this.cC.z instanceof fug)) {
         this.z(this.C() == dph.a.a);
         this.M();
      }

      boolean $$0 = this.k.a.e();
      boolean $$1 = this.k.a.f();
      boolean $$2 = this.S();
      cor $$3 = this.gj();
      this.dc = !$$3.b && !this.ck() && !this.bZ() && this.h(bvr.f) && (this.cd() || !this.fR() && !this.h(bvr.a));
      this.k.a();
      this.cC.aB().a(this.k);
      if (this.fz() && !this.bZ() && !this.bo()) {
         this.h(false);
         this.k.b *= 0.2F;
         this.k.c *= 0.2F;
         this.cD = 0;
      } else if (this.z()) {
         this.h(false);
         float $$4 = (float)this.h(bwn.z);
         this.k.b *= $$4;
         this.k.c *= $$4;
      } else if (this.fJ() || this.bZ() && !this.N() || this.O()) {
         this.h(false);
      }

      boolean $$5 = false;
      if (this.do > 0) {
         this.do--;
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
         this.cD = 0;
      }

      boolean $$6 = this.R();
      boolean $$7 = this.bZ() ? this.dl().aJ() : this.aJ();
      boolean $$8 = !$$1 && !$$2;
      if (($$7 || this.bo()) && $$8 && $$6) {
         if (this.cD <= 0 && !this.cC.n.B.e()) {
            this.cD = 7;
         } else {
            this.h(true);
         }
      }

      if ((!this.bj() || this.bo()) && $$6 && this.cC.n.B.e()) {
         this.h(true);
      }

      if (this.cj()) {
         boolean $$9 = !this.k.c() || !this.T();
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
         if (this.cC.r.h()) {
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
         this.j.b(new ahm(this, ahm.a.i));
      }

      this.dp = this.fJ();
      if (this.bj() && this.k.a.f() && this.el()) {
         this.fl();
      }

      if (this.a(awu.a)) {
         int $$12 = this.Z_() ? 10 : 1;
         this.dq = ayy.a(this.dq + $$12, 0, 600);
      } else if (this.dq > 0) {
         this.a(awu.a);
         this.dq = ayy.a(this.dq - 10, 0, 600);
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

      bvp $$14 = this.v();
      if ($$14 != null && $$14.c() == 0) {
         if (this.di < 0) {
            this.di++;
            if (this.di == 0) {
               this.dj = 0.0F;
            }
         }

         if ($$0 && !this.k.a.e()) {
            this.di = -10;
            $$14.b(ayy.d(this.y() * 100.0F));
            this.i();
         } else if (!$$0 && this.k.a.e()) {
            this.di = 0;
            this.dj = 0.0F;
         } else if ($$0) {
            this.di++;
            if (this.di < 10) {
               this.dj = (float)this.di * 0.1F;
            } else {
               this.dj = 0.8F + 2.0F / (float)(this.di - 9) * 0.1F;
            }
         }
      } else {
         this.dj = 0.0F;
      }

      super.d_();
      if (this.aJ() && $$3.b && !this.cC.r.h()) {
         $$3.b = false;
         this.x();
      }
   }

   private boolean N() {
      return this.dl() != null && this.dl().aq() == buq.t;
   }

   private boolean O() {
      return this.b(btq.o);
   }

   public dph.a C() {
      return this.as == null ? dph.a.b : this.as.a();
   }

   @Override
   protected void em() {
      this.aP++;
      if (this.aP == 20) {
         this.a(buj.d.a);
      }
   }

   private void z(boolean $$0) {
      this.cJ = this.cI;
      float $$1 = 0.0F;
      if ($$0 && this.as != null && this.as.e()) {
         if (this.cC.z != null && !this.cC.z.k() && !(this.cC.z instanceof ftm) && !(this.cC.z instanceof ful)) {
            if (this.cC.z instanceof fux) {
               this.p();
            }

            this.cC.a(null);
         }

         if (this.cI == 0.0F) {
            this.cC.ak().a(hie.b(avz.vj, this.ae.i() * 0.4F + 0.8F, 0.25F));
         }

         $$1 = 0.0125F;
         this.as.a(false);
      } else if (this.b(btq.i) && !this.c(btq.i).a(60)) {
         $$1 = 0.006666667F;
      } else if (this.cI > 0.0F) {
         $$1 = -0.05F;
      }

      this.cI = ayy.a(this.cI + $$1, 0.0F, 1.0F);
   }

   @Override
   public void r() {
      super.r();
      this.dm = false;
      if (this.dm() instanceof cqs $$0) {
         $$0.a(this.k.a.c(), this.k.a.d(), this.k.a.a(), this.k.a.b());
         this.dm = this.dm | (this.k.a.c() || this.k.a.d() || this.k.a.a() || this.k.a.b());
      }
   }

   public boolean D() {
      return this.dm;
   }

   @Nullable
   @Override
   public bto d(jr<btm> $$0) {
      if ($$0.a(btq.i)) {
         this.cJ = 0.0F;
         this.cI = 0.0F;
      }

      return super.d($$0);
   }

   @Override
   public void a(bvj $$0, fay $$1) {
      double $$2 = this.dB();
      double $$3 = this.dH();
      super.a($$0, $$1);
      float $$4 = (float)(this.dB() - $$2);
      float $$5 = (float)(this.dH() - $$3);
      this.h($$4, $$5);
      this.g = this.g + ayy.f($$4, $$5) * 0.6F;
   }

   public boolean E() {
      return this.dn;
   }

   @Override
   public boolean gQ() {
      return this.cC.n.K().c();
   }

   protected void h(float $$0, float $$1) {
      if (this.P()) {
         fay $$2 = this.du();
         fay $$3 = $$2.b((double)$$0, 0.0, (double)$$1);
         fay $$4 = new fay((double)$$0, 0.0, (double)$$1);
         float $$5 = this.fp();
         float $$6 = (float)$$4.h();
         if ($$6 <= 0.001F) {
            fax $$7 = this.k.b();
            float $$8 = $$5 * $$7.i;
            float $$9 = $$5 * $$7.j;
            float $$10 = ayy.a(this.dM() * (float) (Math.PI / 180.0));
            float $$11 = ayy.b(this.dM() * (float) (Math.PI / 180.0));
            $$4 = new fay((double)($$8 * $$11 - $$9 * $$10), $$4.e, (double)($$9 * $$11 + $$8 * $$10));
            $$6 = (float)$$4.h();
            if ($$6 <= 0.001F) {
               return;
            }
         }

         float $$12 = ayy.j($$6);
         fay $$13 = $$4.c((double)$$12);
         fay $$14 = this.bV();
         float $$15 = (float)($$14.d * $$13.d + $$14.f * $$13.f);
         if (!($$15 < -0.15F)) {
            fbd $$16 = fbd.a(this);
            ji $$17 = ji.a(this.dB(), this.cR().e, this.dH());
            dwv $$18 = this.dW().a_($$17);
            if ($$18.b(this.dW(), $$17, $$16).c()) {
               $$17 = $$17.d();
               dwv $$19 = this.dW().a_($$17);
               if ($$19.b(this.dW(), $$17, $$16).c()) {
                  float $$20 = 7.0F;
                  float $$21 = 1.2F;
                  if (this.b(btq.h)) {
                     $$21 += (float)(this.c(btq.h).e() + 1) * 0.75F;
                  }

                  float $$22 = Math.max($$5 * 7.0F, 1.0F / $$12);
                  fay $$24 = $$3.e($$13.c((double)$$22));
                  float $$25 = this.dr();
                  float $$26 = this.ds();
                  fat $$27 = new fat($$2, $$24.b(0.0, (double)$$26, 0.0)).c((double)$$25, 0.0, (double)$$25);
                  fay $$23 = $$2.b(0.0, 0.51F, 0.0);
                  $$24 = $$24.b(0.0, 0.51F, 0.0);
                  fay $$28 = $$13.c(new fay(0.0, 1.0, 0.0));
                  fay $$29 = $$28.c((double)($$25 * 0.5F));
                  fay $$30 = $$23.d($$29);
                  fay $$31 = $$24.d($$29);
                  fay $$32 = $$23.e($$29);
                  fay $$33 = $$24.e($$29);
                  Iterable<fbs> $$34 = this.dW().d(this, $$27);
                  Iterator<fat> $$35 = StreamSupport.stream($$34.spliterator(), false).flatMap($$0x -> $$0x.e().stream()).iterator();
                  float $$36 = Float.MIN_VALUE;

                  while ($$35.hasNext()) {
                     fat $$37 = $$35.next();
                     if ($$37.a($$30, $$31) || $$37.a($$32, $$33)) {
                        $$36 = (float)$$37.e;
                        fay $$38 = $$37.f();
                        ji $$39 = ji.a((kb)$$38);

                        for (int $$40 = 1; (float)$$40 < $$21; $$40++) {
                           ji $$41 = $$39.b($$40);
                           dwv $$42 = this.dW().a_($$41);
                           fbs $$43;
                           if (!($$43 = $$42.b(this.dW(), $$41, $$16)).c()) {
                              $$36 = (float)$$43.c(jn.a.b) + (float)$$41.v();
                              if ((double)$$36 - this.dD() > (double)$$21) {
                                 return;
                              }
                           }

                           if ($$40 > 1) {
                              $$17 = $$17.d();
                              dwv $$44 = this.dW().a_($$17);
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
                        this.do = 1;
                     }
                  }
               }
            }
         }
      }
   }

   @Override
   protected boolean c(fay $$0) {
      float $$1 = this.dM() * (float) (Math.PI / 180.0);
      double $$2 = (double)ayy.a($$1);
      double $$3 = (double)ayy.b($$1);
      double $$4 = (double)this.bn * $$3 - (double)this.bp * $$2;
      double $$5 = (double)this.bp * $$3 + (double)this.bn * $$2;
      double $$6 = ayy.k($$4) + ayy.k($$5);
      double $$7 = ayy.k($$0.d) + ayy.k($$0.f);
      if (!($$6 < 1.0E-5F) && !($$7 < 1.0E-5F)) {
         double $$8 = $$4 * $$0.d + $$5 * $$0.f;
         double $$9 = Math.acos($$8 / Math.sqrt($$6 * $$7));
         return $$9 < 0.13962634F;
      } else {
         return false;
      }
   }

   private boolean P() {
      return this.E() && this.do <= 0 && this.aJ() && !this.ga() && !this.bZ() && this.Q() && (double)this.aS() >= 1.0;
   }

   private boolean Q() {
      fax $$0 = this.k.b();
      return $$0.i != 0.0F || $$0.j != 0.0F;
   }

   private boolean R() {
      return !this.cj() && this.S() && this.T() && !this.fz() && !this.O() && (!this.bZ() || this.a(this.dl())) && !this.fJ() && (!this.z() || this.bo());
   }

   private boolean a(buj $$0) {
      return $$0.dP() && $$0.di();
   }

   private boolean S() {
      double $$0 = 0.8;
      return this.bo() ? this.k.c() : (double)this.k.c >= 0.8;
   }

   private boolean T() {
      return this.bZ() || (float)this.gt().a() > 6.0F || this.gj().c;
   }

   public float F() {
      if (!this.a(awu.a)) {
         return 0.0F;
      } else {
         float $$0 = 600.0F;
         float $$1 = 100.0F;
         if ((float)this.dq >= 600.0F) {
            return 1.0F;
         } else {
            float $$2 = ayy.a((float)this.dq / 100.0F, 0.0F, 1.0F);
            float $$3 = (float)this.dq < 100.0F ? 0.0F : ayy.a(((float)this.dq - 100.0F) / 500.0F, 0.0F, 1.0F);
            return $$2 * 0.6F + $$3 * 0.39999998F;
         }
      }
   }

   public void a(dgd $$0) {
      if ($$0 == dgd.d) {
         this.h(this.dz().a(jn.a.b, 0.0));
      }
   }

   @Override
   public boolean bo() {
      return this.cq;
   }

   @Override
   protected boolean gb() {
      boolean $$0 = this.cq;
      boolean $$1 = super.gb();
      if (this.Z_()) {
         return this.cq;
      } else {
         if (!$$0 && $$1) {
            this.dW().a(this.dB(), this.dD(), this.dH(), avz.x, awa.i, 1.0F, 1.0F, false);
            this.cC.ak().a((hij)(new him.b(this)));
         }

         if ($$0 && !$$1) {
            this.dW().a(this.dB(), this.dD(), this.dH(), avz.y, awa.i, 1.0F, 1.0F, false);
         }

         return this.cq;
      }
   }

   @Override
   public fay u(float $$0) {
      if (this.cC.n.aE().a()) {
         float $$1 = ayy.h($$0 * 0.5F, this.dM(), this.N) * (float) (Math.PI / 180.0);
         float $$2 = ayy.h($$0 * 0.5F, this.dO(), this.O) * (float) (Math.PI / 180.0);
         double $$3 = this.fy() == buz.b ? -1.0 : 1.0;
         fay $$4 = new fay(0.39 * $$3, -0.6, 0.3);
         return $$4.a(-$$2).b(-$$1).e(this.m($$0));
      } else {
         return super.u($$0);
      }
   }

   @Override
   public void a(cwn $$0, cwn $$1, csk $$2) {
      this.cC.aB().a($$0, $$1, $$2);
   }

   @Override
   public float dN() {
      return this.dM();
   }

   @Override
   public void g(cwn $$0) {
      this.cC.r.a($$0);
   }

   @Override
   public boolean gl() {
      return this.cS.c();
   }

   public azy H() {
      return this.cS;
   }
}
