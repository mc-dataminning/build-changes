import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gkh extends gke {
   public static final Logger h = LogUtils.getLogger();
   private static final int cI = 20;
   private static final int cJ = 600;
   private static final int cK = 100;
   private static final float cL = 0.6F;
   private static final double cM = 0.35;
   private static final double cN = 0.13962634F;
   public final gfl i;
   private final axq cO;
   private final flr cP;
   private final bbe cQ = new bbe(20, 1280);
   private final List<hes> cR = Lists.newArrayList();
   private int cS = 0;
   private double cT;
   private double cU;
   private double cV;
   private float cW;
   private float cX;
   private boolean cY;
   private boolean cZ;
   private boolean da;
   private boolean db;
   private boolean dc;
   private int dd;
   private boolean de;
   public gkf j = new gkf();
   private cpv df = cpv.b;
   protected final fmg k;
   protected int cz;
   public float cC;
   public float cD;
   public float cE;
   public float cF;
   private int dg;
   private float dh;
   public float cG;
   public float cH;
   private boolean di;
   @Nullable
   private bti dj;
   private boolean dk;
   private boolean dl = true;
   private int dm;
   private boolean dn;
   private int do;
   private boolean dp = true;
   private boolean dq = false;

   public gkh(fmg $$0, gfk $$1, gfl $$2, axq $$3, flr $$4, boolean $$5, boolean $$6) {
      super($$1, $$2.o());
      this.k = $$0;
      this.i = $$2;
      this.cO = $$3;
      this.cP = $$4;
      this.db = $$5;
      this.dc = $$6;
      this.cR.add(new hfk(this, $$0.ak()));
      this.cR.add(new hex(this));
      this.cR.add(new hew(this, $$0.ak(), $$1.I_()));
   }

   @Override
   public void c(float $$0) {
   }

   @Override
   public boolean a(bvk $$0, boolean $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         if ($$0 instanceof crw) {
            this.k.ak().a((hfi)(new hfc(this, (crw)$$0, true)));
            this.k.ak().a((hfi)(new hfc(this, (crw)$$0, false)));
         }

         return true;
      }
   }

   @Override
   public void bQ() {
      super.bQ();
      this.dk = false;
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
      this.cQ.b();
      super.h();
      this.J();
      if (!this.df.equals(this.j.a)) {
         this.i.b(new ait(this.j.a));
         this.df = this.j.a;
      }

      if (this.bZ()) {
         this.i.b(new ail.c(this.dM(), this.dO(), this.aJ(), this.P));
         bvk $$0 = this.dg();
         if ($$0 != this && $$0.di()) {
            this.i.b(new aim($$0));
            this.L();
         }
      } else {
         this.I();
      }

      for (hes $$1 : this.cR) {
         $$1.a();
      }
   }

   public float e() {
      for (hes $$0 : this.cR) {
         if ($$0 instanceof hew) {
            return ((hew)$$0).b();
         }
      }

      return 0.0F;
   }

   private void I() {
      this.L();
      if (this.A()) {
         double $$0 = this.dB() - this.cT;
         double $$1 = this.dD() - this.cU;
         double $$2 = this.dH() - this.cV;
         double $$3 = (double)(this.dM() - this.cW);
         double $$4 = (double)(this.dO() - this.cX);
         this.dd++;
         boolean $$5 = bae.f($$0, $$1, $$2) > bae.k(2.0E-4) || this.dd >= 20;
         boolean $$6 = $$3 != 0.0 || $$4 != 0.0;
         if ($$5 && $$6) {
            this.i.b(new ail.b(this.dB(), this.dD(), this.dH(), this.dM(), this.dO(), this.aJ(), this.P));
         } else if ($$5) {
            this.i.b(new ail.a(this.dB(), this.dD(), this.dH(), this.aJ(), this.P));
         } else if ($$6) {
            this.i.b(new ail.c(this.dM(), this.dO(), this.aJ(), this.P));
         } else if (this.cY != this.aJ() || this.cZ != this.P) {
            this.i.b(new ail.d(this.aJ(), this.P));
         }

         if ($$5) {
            this.cT = this.dB();
            this.cU = this.dD();
            this.cV = this.dH();
            this.dd = 0;
         }

         if ($$6) {
            this.cW = this.dM();
            this.cX = this.dO();
         }

         this.cY = this.aJ();
         this.cZ = this.P;
         this.dl = this.k.n.J().c();
      }
   }

   private void J() {
      boolean $$0 = this.cd();
      if ($$0 != this.db) {
         ais.a $$1 = $$0 ? ais.a.a : ais.a.b;
         this.i.b(new ais(this, $$1));
         this.db = $$0;
      }
   }

   private void L() {
      boolean $$0 = this.cj();
      if ($$0 != this.dc) {
         ais.a $$1 = $$0 ? ais.a.d : ais.a.e;
         this.i.b(new ais(this, $$1));
         this.dc = $$0;
      }
   }

   public boolean a(boolean $$0) {
      air.a $$1 = $$0 ? air.a.d : air.a.e;
      cxp $$2 = this.gi().a($$0);
      this.i.b(new air($$1, jh.c, jm.a));
      return !$$2.f();
   }

   @Override
   public void a(bti $$0) {
      super.a($$0);
      this.i.b(new aji($$0));
   }

   @Override
   public void gg() {
      this.i.b(new ahx(ahx.a.a));
      fme.c();
   }

   @Override
   public void p() {
      this.i.b(new aid(this.cd.l));
      this.f();
   }

   public void f() {
      super.p();
      this.k.a(null);
   }

   public void J(float $$0) {
      if (this.de) {
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
         this.de = true;
      }
   }

   @Override
   public void x() {
      this.i.b(new aiq(this.gj()));
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
      this.i.b(new ais(this, ais.a.f, bae.d(this.y() * 100.0F)));
   }

   public void l() {
      this.i.b(new ais(this, ais.a.h));
   }

   public axq m() {
      return this.cO;
   }

   public flr n() {
      return this.cP;
   }

   public void a(ddl $$0) {
      if (this.cP.b($$0)) {
         this.cP.c($$0);
         this.i.b(new aiv($$0));
      }
   }

   @Override
   protected int G() {
      return this.cS;
   }

   public void a(int $$0) {
      this.cS = $$0;
   }

   @Override
   public void a(xv $$0, boolean $$1) {
      this.k.ba().a($$0, $$1);
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
            fby $$11 = this.dz();
            if ($$5.o() == jm.a.a) {
               this.n(0.1 * (double)$$5.j(), $$11.e, $$11.f);
            } else {
               this.n($$11.d, $$11.e, 0.1 * (double)$$5.l());
            }
         }
      }
   }

   private boolean c(jh $$0) {
      fbt $$1 = this.cR();
      fbt $$2 = new fbt((double)$$0.u(), $$1.b, (double)$$0.w(), (double)$$0.u() + 1.0, $$1.e, (double)$$0.w() + 1.0).h(1.0E-7);
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
      this.dp = $$0;
   }

   public boolean t() {
      return this.dp;
   }

   public void x(boolean $$0) {
      this.dq = $$0;
   }

   @Override
   public boolean u() {
      return this.dq;
   }

   @Override
   public void a(axe $$0, float $$1, float $$2) {
      this.dW().a(this.dB(), this.dD(), this.dH(), $$0, this.dn(), $$1, $$2, false);
   }

   @Override
   public void a(axe $$0, axg $$1, float $$2, float $$3) {
      this.dW().a(this.dB(), this.dD(), this.dH(), $$0, $$1, $$2, $$3, false);
   }

   @Override
   public boolean dk() {
      return true;
   }

   @Override
   public void c(bti $$0) {
      cxp $$1 = this.b($$0);
      if (!$$1.f() && !this.fz()) {
         super.c($$0);
         this.di = true;
         this.dj = $$0;
      }
   }

   @Override
   public boolean fz() {
      return this.di;
   }

   @Override
   public void fF() {
      super.fF();
      this.di = false;
   }

   @Override
   public bti fA() {
      return Objects.requireNonNullElse(this.dj, bti.a);
   }

   @Override
   public void a(alc<?> $$0) {
      super.a($$0);
      if (aC.equals($$0)) {
         boolean $$1 = (this.al.a(aC) & 1) > 0;
         bti $$2 = (this.al.a(aC) & 2) > 0 ? bti.b : bti.a;
         if ($$1 && !this.di) {
            this.c($$2);
         } else if (!$$1 && this.di) {
            this.fF();
         }
      }

      if (am.equals($$0) && this.fJ() && !this.dn) {
         this.k.ak().a((hfi)(new hey(this)));
      }
   }

   @Nullable
   public bwq v() {
      if (this.dm() instanceof bwq $$0 && $$0.a()) {
         return $$0;
      }

      return null;
   }

   public float y() {
      return this.dh;
   }

   @Override
   public boolean aa() {
      return this.k.aU();
   }

   @Override
   public void a(dwk $$0, boolean $$1) {
      if ($$0 instanceof dvx $$2) {
         this.k.a(new fvl($$2, $$1, this.k.aU()));
      } else {
         this.k.a(new fvy($$0, $$1, this.k.aU()));
      }
   }

   @Override
   public void a(dgi $$0) {
      this.k.a(new fvv($$0));
   }

   @Override
   public void a(dvh $$0) {
      this.k.a(new fuy($$0));
   }

   @Override
   public void a(dwp $$0) {
      this.k.a(new fwc($$0));
   }

   @Override
   public void a(dwa $$0) {
      this.k.a(new fvq($$0));
   }

   @Override
   public void a(cxp $$0, bti $$1) {
      daw $$2 = $$0.a(ku.S);
      if ($$2 != null) {
         this.k.a(new fuu(this, $$0, $$1, $$2));
      }
   }

   @Override
   public void b(bvk $$0) {
      this.k.g.a($$0, ls.f);
   }

   @Override
   public void c(bvk $$0) {
      this.k.g.a($$0, ls.r);
   }

   @Override
   public boolean cd() {
      return this.j.a.f();
   }

   @Override
   public boolean ci() {
      return this.da;
   }

   public boolean z() {
      return this.ci() || this.cm();
   }

   @Override
   public void fu() {
      super.fu();
      if (this.A()) {
         this.bo = this.j.b;
         this.bq = this.j.c;
         this.bn = this.j.a.e();
         this.cE = this.cC;
         this.cF = this.cD;
         this.cD = this.cD + (this.dO() - this.cD) * 0.5F;
         this.cC = this.cC + (this.dM() - this.cC) * 0.5F;
      }
   }

   protected boolean A() {
      return this.k.ao() == this;
   }

   @Override
   public void B() {
      this.b(bws.a);
      if (this.dW() != null) {
         for (double $$0 = this.dD(); $$0 > (double)this.dW().L_() && $$0 <= (double)this.dW().am(); $$0++) {
            this.a_(this.dB(), $$0, this.dH());
            if (this.dW().g(this)) {
               break;
            }
         }

         this.h(fby.c);
         this.w(0.0F);
      }

      this.x(this.eS());
      this.aP = 0;
   }

   @Override
   public void d_() {
      if (this.cz > 0) {
         this.cz--;
      }

      if (!(this.k.z instanceof ftw)) {
         this.y(this.C() == dqh.a.a);
         this.M();
      }

      boolean $$0 = this.j.a.e();
      boolean $$1 = this.j.a.f();
      boolean $$2 = this.Q();
      cpt $$3 = this.gj();
      this.da = !$$3.b && !this.ck() && !this.bZ() && this.h(bws.f) && (this.cd() || !this.fR() && !this.h(bws.a));
      float $$4 = (float)this.h(bxo.z);
      this.j.a(this.z(), $$4);
      this.k.aB().a(this.j);
      if (this.fz() && !this.bZ()) {
         this.j.b *= 0.2F;
         this.j.c *= 0.2F;
         this.cz = 0;
      }

      boolean $$5 = false;
      if (this.dm > 0) {
         this.dm--;
         $$5 = true;
         this.j.c();
      }

      if (!this.ad) {
         this.c(this.dB() - (double)this.dr() * 0.35, this.dH() + (double)this.dr() * 0.35);
         this.c(this.dB() - (double)this.dr() * 0.35, this.dH() - (double)this.dr() * 0.35);
         this.c(this.dB() + (double)this.dr() * 0.35, this.dH() - (double)this.dr() * 0.35);
         this.c(this.dB() + (double)this.dr() * 0.35, this.dH() + (double)this.dr() * 0.35);
      }

      if ($$1) {
         this.cz = 0;
      }

      boolean $$6 = this.P();
      boolean $$7 = this.bZ() ? this.dl().aJ() : this.aJ();
      boolean $$8 = !$$1 && !$$2;
      if (($$7 || this.bo()) && $$8 && $$6) {
         if (this.cz <= 0 && !this.k.n.B.e()) {
            this.cz = 7;
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

      if (this.j.a.e() && !$$11 && !$$0 && !this.q_() && this.go()) {
         this.i.b(new ais(this, ais.a.i));
      }

      this.dn = this.fJ();
      if (this.bj() && this.j.a.f() && this.el()) {
         this.fl();
      }

      if (this.a(aya.a)) {
         int $$12 = this.aa_() ? 10 : 1;
         this.do = bae.a(this.do + $$12, 0, 600);
      } else if (this.do > 0) {
         this.a(aya.a);
         this.do = bae.a(this.do - 10, 0, 600);
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
            this.h(this.dz().b(0.0, (double)((float)$$13 * $$3.a() * 3.0F), 0.0));
         }
      }

      bwq $$14 = this.v();
      if ($$14 != null && $$14.c() == 0) {
         if (this.dg < 0) {
            this.dg++;
            if (this.dg == 0) {
               this.dh = 0.0F;
            }
         }

         if ($$0 && !this.j.a.e()) {
            this.dg = -10;
            $$14.b(bae.d(this.y() * 100.0F));
            this.i();
         } else if (!$$0 && this.j.a.e()) {
            this.dg = 0;
            this.dh = 0.0F;
         } else if ($$0) {
            this.dg++;
            if (this.dg < 10) {
               this.dh = (float)this.dg * 0.1F;
            } else {
               this.dh = 0.8F + 2.0F / (float)(this.dg - 9) * 0.1F;
            }
         }
      } else {
         this.dh = 0.0F;
      }

      super.d_();
      if (this.aJ() && $$3.b && !this.k.r.h()) {
         $$3.b = false;
         this.x();
      }
   }

   public dqh.a C() {
      return this.as == null ? dqh.a.b : this.as.a();
   }

   @Override
   protected void em() {
      this.aP++;
      if (this.aP == 20) {
         this.a(bvk.d.a);
      }
   }

   private void y(boolean $$0) {
      this.cH = this.cG;
      float $$1 = 0.0F;
      if ($$0 && this.as != null && this.as.e()) {
         if (this.k.z != null && !this.k.z.j() && !(this.k.z instanceof ftc) && !(this.k.z instanceof fub)) {
            if (this.k.z instanceof fun) {
               this.p();
            }

            this.k.a(null);
         }

         if (this.cG == 0.0F) {
            this.k.ak().a(hfd.b(axf.vd, this.ae.i() * 0.4F + 0.8F, 0.25F));
         }

         $$1 = 0.0125F;
         this.as.a(false);
      } else if (this.b(bur.i) && !this.c(bur.i).a(60)) {
         $$1 = 0.006666667F;
      } else if (this.cG > 0.0F) {
         $$1 = -0.05F;
      }

      this.cG = bae.a(this.cG + $$1, 0.0F, 1.0F);
   }

   @Override
   public void r() {
      super.r();
      this.dk = false;
      if (this.dm() instanceof cru $$0) {
         $$0.a(this.j.a.c(), this.j.a.d(), this.j.a.a(), this.j.a.b());
         this.dk = this.dk | (this.j.a.c() || this.j.a.d() || this.j.a.a() || this.j.a.b());
      }
   }

   public boolean D() {
      return this.dk;
   }

   @Nullable
   @Override
   public bup d(jq<bun> $$0) {
      if ($$0.a(bur.i)) {
         this.cH = 0.0F;
         this.cG = 0.0F;
      }

      return super.d($$0);
   }

   @Override
   public void a(bwk $$0, fby $$1) {
      double $$2 = this.dB();
      double $$3 = this.dH();
      super.a($$0, $$1);
      float $$4 = (float)(this.dB() - $$2);
      float $$5 = (float)(this.dH() - $$3);
      this.h($$4, $$5);
      this.g = this.g + bae.f($$4, $$5) * 0.6F;
   }

   public boolean E() {
      return this.dl;
   }

   @Override
   public boolean gO() {
      return this.k.n.K().c();
   }

   protected void h(float $$0, float $$1) {
      if (this.N()) {
         fby $$2 = this.du();
         fby $$3 = $$2.b((double)$$0, 0.0, (double)$$1);
         fby $$4 = new fby((double)$$0, 0.0, (double)$$1);
         float $$5 = this.fp();
         float $$6 = (float)$$4.h();
         if ($$6 <= 0.001F) {
            fbx $$7 = this.j.a();
            float $$8 = $$5 * $$7.i;
            float $$9 = $$5 * $$7.j;
            float $$10 = bae.a(this.dM() * (float) (Math.PI / 180.0));
            float $$11 = bae.b(this.dM() * (float) (Math.PI / 180.0));
            $$4 = new fby((double)($$8 * $$11 - $$9 * $$10), $$4.e, (double)($$9 * $$11 + $$8 * $$10));
            $$6 = (float)$$4.h();
            if ($$6 <= 0.001F) {
               return;
            }
         }

         float $$12 = bae.j($$6);
         fby $$13 = $$4.c((double)$$12);
         fby $$14 = this.bV();
         float $$15 = (float)($$14.d * $$13.d + $$14.f * $$13.f);
         if (!($$15 < -0.15F)) {
            fcd $$16 = fcd.a(this);
            jh $$17 = jh.a(this.dB(), this.cR().e, this.dH());
            dxv $$18 = this.dW().a_($$17);
            if ($$18.b(this.dW(), $$17, $$16).c()) {
               $$17 = $$17.d();
               dxv $$19 = this.dW().a_($$17);
               if ($$19.b(this.dW(), $$17, $$16).c()) {
                  float $$20 = 7.0F;
                  float $$21 = 1.2F;
                  if (this.b(bur.h)) {
                     $$21 += (float)(this.c(bur.h).e() + 1) * 0.75F;
                  }

                  float $$22 = Math.max($$5 * 7.0F, 1.0F / $$12);
                  fby $$24 = $$3.e($$13.c((double)$$22));
                  float $$25 = this.dr();
                  float $$26 = this.ds();
                  fbt $$27 = new fbt($$2, $$24.b(0.0, (double)$$26, 0.0)).c((double)$$25, 0.0, (double)$$25);
                  fby $$23 = $$2.b(0.0, 0.51F, 0.0);
                  $$24 = $$24.b(0.0, 0.51F, 0.0);
                  fby $$28 = $$13.c(new fby(0.0, 1.0, 0.0));
                  fby $$29 = $$28.c((double)($$25 * 0.5F));
                  fby $$30 = $$23.d($$29);
                  fby $$31 = $$24.d($$29);
                  fby $$32 = $$23.e($$29);
                  fby $$33 = $$24.e($$29);
                  Iterable<fcs> $$34 = this.dW().d(this, $$27);
                  Iterator<fbt> $$35 = StreamSupport.stream($$34.spliterator(), false).flatMap($$0x -> $$0x.e().stream()).iterator();
                  float $$36 = Float.MIN_VALUE;

                  while ($$35.hasNext()) {
                     fbt $$37 = $$35.next();
                     if ($$37.a($$30, $$31) || $$37.a($$32, $$33)) {
                        $$36 = (float)$$37.e;
                        fby $$38 = $$37.f();
                        jh $$39 = jh.a((ka)$$38);

                        for (int $$40 = 1; (float)$$40 < $$21; $$40++) {
                           jh $$41 = $$39.b($$40);
                           dxv $$42 = this.dW().a_($$41);
                           fcs $$43;
                           if (!($$43 = $$42.b(this.dW(), $$41, $$16)).c()) {
                              $$36 = (float)$$43.c(jm.a.b) + (float)$$41.v();
                              if ((double)$$36 - this.dD() > (double)$$21) {
                                 return;
                              }
                           }

                           if ($$40 > 1) {
                              $$17 = $$17.d();
                              dxv $$44 = this.dW().a_($$17);
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
                        this.dm = 1;
                     }
                  }
               }
            }
         }
      }
   }

   @Override
   protected boolean c(fby $$0) {
      float $$1 = this.dM() * (float) (Math.PI / 180.0);
      double $$2 = (double)bae.a($$1);
      double $$3 = (double)bae.b($$1);
      double $$4 = (double)this.bo * $$3 - (double)this.bq * $$2;
      double $$5 = (double)this.bq * $$3 + (double)this.bo * $$2;
      double $$6 = bae.k($$4) + bae.k($$5);
      double $$7 = bae.k($$0.d) + bae.k($$0.f);
      if (!($$6 < 1.0E-5F) && !($$7 < 1.0E-5F)) {
         double $$8 = $$4 * $$0.d + $$5 * $$0.f;
         double $$9 = Math.acos($$8 / Math.sqrt($$6 * $$7));
         return $$9 < 0.13962634F;
      } else {
         return false;
      }
   }

   private boolean N() {
      return this.E() && this.dm <= 0 && this.aJ() && !this.ga() && !this.bZ() && this.O() && (double)this.aS() >= 1.0;
   }

   private boolean O() {
      fbx $$0 = this.j.a();
      return $$0.i != 0.0F || $$0.j != 0.0F;
   }

   private boolean P() {
      return !this.cj() && this.Q() && this.R() && !this.fz() && !this.b(bur.o) && (!this.bZ() || this.a(this.dl())) && !this.fJ();
   }

   private boolean a(bvk $$0) {
      return $$0.dP() && $$0.di();
   }

   private boolean Q() {
      double $$0 = 0.8;
      return this.bo() ? this.j.b() : (double)this.j.c >= 0.8;
   }

   private boolean R() {
      return this.bZ() || (float)this.gt().a() > 6.0F || this.gj().c;
   }

   public float F() {
      if (!this.a(aya.a)) {
         return 0.0F;
      } else {
         float $$0 = 600.0F;
         float $$1 = 100.0F;
         if ((float)this.do >= 600.0F) {
            return 1.0F;
         } else {
            float $$2 = bae.a((float)this.do / 100.0F, 0.0F, 1.0F);
            float $$3 = (float)this.do < 100.0F ? 0.0F : bae.a(((float)this.do - 100.0F) / 500.0F, 0.0F, 1.0F);
            return $$2 * 0.6F + $$3 * 0.39999998F;
         }
      }
   }

   public void a(dhf $$0) {
      if ($$0 == dhf.d) {
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
            this.dW().a(this.dB(), this.dD(), this.dH(), axf.x, axg.i, 1.0F, 1.0F, false);
            this.k.ak().a((hfi)(new hfl.b(this)));
         }

         if ($$0 && !$$1) {
            this.dW().a(this.dB(), this.dD(), this.dH(), axf.y, axg.i, 1.0F, 1.0F, false);
         }

         return this.cp;
      }
   }

   @Override
   public fby u(float $$0) {
      if (this.k.n.aE().a()) {
         float $$1 = bae.h($$0 * 0.5F, this.dM(), this.N) * (float) (Math.PI / 180.0);
         float $$2 = bae.h($$0 * 0.5F, this.dO(), this.O) * (float) (Math.PI / 180.0);
         double $$3 = this.fy() == bwa.b ? -1.0 : 1.0;
         fby $$4 = new fby(0.39 * $$3, -0.6, 0.3);
         return $$4.a(-$$2).b(-$$1).e(this.m($$0));
      } else {
         return super.u($$0);
      }
   }

   @Override
   public void a(cxp $$0, cxp $$1, ctm $$2) {
      this.k.aB().a($$0, $$1, $$2);
   }

   @Override
   public float dN() {
      return this.dM();
   }

   @Override
   public void g(cxp $$0) {
      this.k.r.a($$0);
   }

   @Override
   public boolean gl() {
      return this.cQ.c();
   }

   public bbe H() {
      return this.cQ;
   }
}
