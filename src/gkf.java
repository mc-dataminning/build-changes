import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gkf extends gkc {
   public static final Logger h = LogUtils.getLogger();
   private static final int cI = 20;
   private static final int cJ = 600;
   private static final int cK = 100;
   private static final float cL = 0.6F;
   private static final double cM = 0.35;
   private static final double cN = 0.13962634F;
   public final gfj i;
   private final axq cO;
   private final flp cP;
   private final bbe cQ = new bbe(20, 1280);
   private final List<heq> cR = Lists.newArrayList();
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
   public gkd j = new gkd();
   private cpu df = cpu.b;
   protected final fme k;
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
   private bth dj;
   private boolean dk;
   private boolean dl = true;
   private int dm;
   private boolean dn;
   private int do;
   private boolean dp = true;
   private boolean dq = false;

   public gkf(fme $$0, gfi $$1, gfj $$2, axq $$3, flp $$4, boolean $$5, boolean $$6) {
      super($$1, $$2.o());
      this.k = $$0;
      this.i = $$2;
      this.cO = $$3;
      this.cP = $$4;
      this.db = $$5;
      this.dc = $$6;
      this.cR.add(new hfi(this, $$0.ak()));
      this.cR.add(new hev(this));
      this.cR.add(new heu(this, $$0.ak(), $$1.I_()));
   }

   @Override
   public void c(float $$0) {
   }

   @Override
   public boolean a(bvj $$0, boolean $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         if ($$0 instanceof crv) {
            this.k.ak().a((hfg)(new hfa(this, (crv)$$0, true)));
            this.k.ak().a((hfg)(new hfa(this, (crv)$$0, false)));
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
      return this.dN();
   }

   @Override
   public float i(float $$0) {
      return this.bZ() ? super.i($$0) : this.dL();
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
         this.i.b(new ail.c(this.dL(), this.dN(), this.aJ(), this.P));
         bvj $$0 = this.dg();
         if ($$0 != this && $$0.di()) {
            this.i.b(new aim($$0));
            this.L();
         }
      } else {
         this.I();
      }

      for (heq $$1 : this.cR) {
         $$1.a();
      }
   }

   public float e() {
      for (heq $$0 : this.cR) {
         if ($$0 instanceof heu) {
            return ((heu)$$0).b();
         }
      }

      return 0.0F;
   }

   private void I() {
      this.L();
      if (this.A()) {
         double $$0 = this.dA() - this.cT;
         double $$1 = this.dC() - this.cU;
         double $$2 = this.dG() - this.cV;
         double $$3 = (double)(this.dL() - this.cW);
         double $$4 = (double)(this.dN() - this.cX);
         this.dd++;
         boolean $$5 = bae.f($$0, $$1, $$2) > bae.k(2.0E-4) || this.dd >= 20;
         boolean $$6 = $$3 != 0.0 || $$4 != 0.0;
         if ($$5 && $$6) {
            this.i.b(new ail.b(this.dA(), this.dC(), this.dG(), this.dL(), this.dN(), this.aJ(), this.P));
         } else if ($$5) {
            this.i.b(new ail.a(this.dA(), this.dC(), this.dG(), this.aJ(), this.P));
         } else if ($$6) {
            this.i.b(new ail.c(this.dL(), this.dN(), this.aJ(), this.P));
         } else if (this.cY != this.aJ() || this.cZ != this.P) {
            this.i.b(new ail.d(this.aJ(), this.P));
         }

         if ($$5) {
            this.cT = this.dA();
            this.cU = this.dC();
            this.cV = this.dG();
            this.dd = 0;
         }

         if ($$6) {
            this.cW = this.dL();
            this.cX = this.dN();
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
      cxo $$2 = this.gg().a($$0);
      this.i.b(new air($$1, jh.c, jm.a));
      return !$$2.f();
   }

   @Override
   public void a(bth $$0) {
      super.a($$0);
      this.i.b(new aji($$0));
   }

   @Override
   public void ge() {
      this.i.b(new ahx(ahx.a.a));
      fmc.c();
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
         float $$1 = this.eD() - $$0;
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
      this.i.b(new aiq(this.gh()));
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
      this.i.b(new ais(this, ais.a.f, bae.d(this.y() * 100.0F)));
   }

   public void l() {
      this.i.b(new ais(this, ais.a.h));
   }

   public axq m() {
      return this.cO;
   }

   public flp n() {
      return this.cP;
   }

   public void a(ddk $$0) {
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
            fbx $$11 = this.dy();
            if ($$5.o() == jm.a.a) {
               this.n(0.1 * (double)$$5.j(), $$11.e, $$11.f);
            } else {
               this.n($$11.d, $$11.e, 0.1 * (double)$$5.l());
            }
         }
      }
   }

   private boolean c(jh $$0) {
      fbs $$1 = this.cR();
      fbs $$2 = new fbs((double)$$0.u(), $$1.b, (double)$$0.w(), (double)$$0.u() + 1.0, $$1.e, (double)$$0.w() + 1.0).h(1.0E-7);
      return this.dV().g(this, $$2);
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
      this.dV().a(this.dA(), this.dC(), this.dG(), $$0, this.dm(), $$1, $$2, false);
   }

   @Override
   public void a(axe $$0, axg $$1, float $$2, float $$3) {
      this.dV().a(this.dA(), this.dC(), this.dG(), $$0, $$1, $$2, $$3, false);
   }

   @Override
   public boolean dj() {
      return true;
   }

   @Override
   public void c(bth $$0) {
      cxo $$1 = this.b($$0);
      if (!$$1.f() && !this.fx()) {
         super.c($$0);
         this.di = true;
         this.dj = $$0;
      }
   }

   @Override
   public boolean fx() {
      return this.di;
   }

   @Override
   public void fD() {
      super.fD();
      this.di = false;
   }

   @Override
   public bth fy() {
      return Objects.requireNonNullElse(this.dj, bth.a);
   }

   @Override
   public void a(alc<?> $$0) {
      super.a($$0);
      if (aC.equals($$0)) {
         boolean $$1 = (this.al.a(aC) & 1) > 0;
         bth $$2 = (this.al.a(aC) & 2) > 0 ? bth.b : bth.a;
         if ($$1 && !this.di) {
            this.c($$2);
         } else if (!$$1 && this.di) {
            this.fD();
         }
      }

      if (am.equals($$0) && this.fH() && !this.dn) {
         this.k.ak().a((hfg)(new hew(this)));
      }
   }

   @Nullable
   public bwp v() {
      if (this.dl() instanceof bwp $$0 && $$0.a()) {
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
   public void a(dwj $$0, boolean $$1) {
      if ($$0 instanceof dvw $$2) {
         this.k.a(new fvj($$2, $$1, this.k.aU()));
      } else {
         this.k.a(new fvw($$0, $$1, this.k.aU()));
      }
   }

   @Override
   public void a(dgh $$0) {
      this.k.a(new fvt($$0));
   }

   @Override
   public void a(dvg $$0) {
      this.k.a(new fuw($$0));
   }

   @Override
   public void a(dwo $$0) {
      this.k.a(new fwa($$0));
   }

   @Override
   public void a(dvz $$0) {
      this.k.a(new fvo($$0));
   }

   @Override
   public void a(cxo $$0, bth $$1) {
      dav $$2 = $$0.a(ku.S);
      if ($$2 != null) {
         this.k.a(new fus(this, $$0, $$1, $$2));
      }
   }

   @Override
   public void b(bvj $$0) {
      this.k.g.a($$0, ls.f);
   }

   @Override
   public void c(bvj $$0) {
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
   public void fs() {
      super.fs();
      if (this.A()) {
         this.bo = this.j.b;
         this.bq = this.j.c;
         this.bn = this.j.a.e();
         this.cE = this.cC;
         this.cF = this.cD;
         this.cD = this.cD + (this.dN() - this.cD) * 0.5F;
         this.cC = this.cC + (this.dL() - this.cC) * 0.5F;
      }
   }

   protected boolean A() {
      return this.k.ao() == this;
   }

   @Override
   public void B() {
      this.b(bwr.a);
      if (this.dV() != null) {
         for (double $$0 = this.dC(); $$0 > (double)this.dV().L_() && $$0 <= (double)this.dV().am(); $$0++) {
            this.a_(this.dA(), $$0, this.dG());
            if (this.dV().g(this)) {
               break;
            }
         }

         this.h(fbx.c);
         this.w(0.0F);
      }

      this.x(this.eR());
      this.aP = 0;
   }

   @Override
   public void d_() {
      if (this.cz > 0) {
         this.cz--;
      }

      if (!(this.k.z instanceof ftu)) {
         this.y(this.C() == dqg.a.a);
         this.M();
      }

      boolean $$0 = this.j.a.e();
      boolean $$1 = this.j.a.f();
      boolean $$2 = this.Q();
      cps $$3 = this.gh();
      this.da = !$$3.b && !this.ck() && !this.bZ() && this.h(bwr.f) && (this.cd() || !this.fP() && !this.h(bwr.a));
      float $$4 = (float)this.h(bxn.z);
      this.j.a(this.z(), $$4);
      this.k.aB().a(this.j);
      if (this.fx() && !this.bZ()) {
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
         this.c(this.dA() - (double)this.dq() * 0.35, this.dG() + (double)this.dq() * 0.35);
         this.c(this.dA() - (double)this.dq() * 0.35, this.dG() - (double)this.dq() * 0.35);
         this.c(this.dA() + (double)this.dq() * 0.35, this.dG() - (double)this.dq() * 0.35);
         this.c(this.dA() + (double)this.dq() * 0.35, this.dG() + (double)this.dq() * 0.35);
      }

      if ($$1) {
         this.cz = 0;
      }

      boolean $$6 = this.P();
      boolean $$7 = this.bZ() ? this.dk().aJ() : this.aJ();
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

      if (this.j.a.e() && !$$11 && !$$0 && !this.q_() && this.gm()) {
         this.i.b(new ais(this, ais.a.i));
      }

      this.dn = this.fH();
      if (this.bj() && this.j.a.f() && this.ek()) {
         this.fj();
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
            this.h(this.dy().b(0.0, (double)((float)$$13 * $$3.a() * 3.0F), 0.0));
         }
      }

      bwp $$14 = this.v();
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

   public dqg.a C() {
      return this.as == null ? dqg.a.b : this.as.a();
   }

   @Override
   protected void el() {
      this.aP++;
      if (this.aP == 20) {
         this.a(bvj.c.a);
      }
   }

   private void y(boolean $$0) {
      this.cH = this.cG;
      float $$1 = 0.0F;
      if ($$0 && this.as != null && this.as.e()) {
         if (this.k.z != null && !this.k.z.j() && !(this.k.z instanceof fta) && !(this.k.z instanceof ftz)) {
            if (this.k.z instanceof ful) {
               this.p();
            }

            this.k.a(null);
         }

         if (this.cG == 0.0F) {
            this.k.ak().a(hfb.b(axf.vd, this.ae.i() * 0.4F + 0.8F, 0.25F));
         }

         $$1 = 0.0125F;
         this.as.a(false);
      } else if (this.b(buq.i) && !this.c(buq.i).a(60)) {
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
      if (this.dl() instanceof crt $$0) {
         $$0.a(this.j.a.c(), this.j.a.d(), this.j.a.a(), this.j.a.b());
         this.dk = this.dk | (this.j.a.c() || this.j.a.d() || this.j.a.a() || this.j.a.b());
      }
   }

   public boolean D() {
      return this.dk;
   }

   @Nullable
   @Override
   public buo d(jq<bum> $$0) {
      if ($$0.a(buq.i)) {
         this.cH = 0.0F;
         this.cG = 0.0F;
      }

      return super.d($$0);
   }

   @Override
   public void a(bwj $$0, fbx $$1) {
      double $$2 = this.dA();
      double $$3 = this.dG();
      super.a($$0, $$1);
      float $$4 = (float)(this.dA() - $$2);
      float $$5 = (float)(this.dG() - $$3);
      this.h($$4, $$5);
      this.g = this.g + bae.f($$4, $$5) * 0.6F;
   }

   public boolean E() {
      return this.dl;
   }

   @Override
   public boolean gM() {
      return this.k.n.K().c();
   }

   protected void h(float $$0, float $$1) {
      if (this.N()) {
         fbx $$2 = this.dt();
         fbx $$3 = $$2.b((double)$$0, 0.0, (double)$$1);
         fbx $$4 = new fbx((double)$$0, 0.0, (double)$$1);
         float $$5 = this.fn();
         float $$6 = (float)$$4.h();
         if ($$6 <= 0.001F) {
            fbw $$7 = this.j.a();
            float $$8 = $$5 * $$7.i;
            float $$9 = $$5 * $$7.j;
            float $$10 = bae.a(this.dL() * (float) (Math.PI / 180.0));
            float $$11 = bae.b(this.dL() * (float) (Math.PI / 180.0));
            $$4 = new fbx((double)($$8 * $$11 - $$9 * $$10), $$4.e, (double)($$9 * $$11 + $$8 * $$10));
            $$6 = (float)$$4.h();
            if ($$6 <= 0.001F) {
               return;
            }
         }

         float $$12 = bae.j($$6);
         fbx $$13 = $$4.c((double)$$12);
         fbx $$14 = this.bV();
         float $$15 = (float)($$14.d * $$13.d + $$14.f * $$13.f);
         if (!($$15 < -0.15F)) {
            fcc $$16 = fcc.a(this);
            jh $$17 = jh.a(this.dA(), this.cR().e, this.dG());
            dxu $$18 = this.dV().a_($$17);
            if ($$18.b(this.dV(), $$17, $$16).c()) {
               $$17 = $$17.d();
               dxu $$19 = this.dV().a_($$17);
               if ($$19.b(this.dV(), $$17, $$16).c()) {
                  float $$20 = 7.0F;
                  float $$21 = 1.2F;
                  if (this.b(buq.h)) {
                     $$21 += (float)(this.c(buq.h).e() + 1) * 0.75F;
                  }

                  float $$22 = Math.max($$5 * 7.0F, 1.0F / $$12);
                  fbx $$24 = $$3.e($$13.c((double)$$22));
                  float $$25 = this.dq();
                  float $$26 = this.dr();
                  fbs $$27 = new fbs($$2, $$24.b(0.0, (double)$$26, 0.0)).c((double)$$25, 0.0, (double)$$25);
                  fbx $$23 = $$2.b(0.0, 0.51F, 0.0);
                  $$24 = $$24.b(0.0, 0.51F, 0.0);
                  fbx $$28 = $$13.c(new fbx(0.0, 1.0, 0.0));
                  fbx $$29 = $$28.c((double)($$25 * 0.5F));
                  fbx $$30 = $$23.d($$29);
                  fbx $$31 = $$24.d($$29);
                  fbx $$32 = $$23.e($$29);
                  fbx $$33 = $$24.e($$29);
                  Iterable<fcr> $$34 = this.dV().d(this, $$27);
                  Iterator<fbs> $$35 = StreamSupport.stream($$34.spliterator(), false).flatMap($$0x -> $$0x.e().stream()).iterator();
                  float $$36 = Float.MIN_VALUE;

                  while ($$35.hasNext()) {
                     fbs $$37 = $$35.next();
                     if ($$37.a($$30, $$31) || $$37.a($$32, $$33)) {
                        $$36 = (float)$$37.e;
                        fbx $$38 = $$37.f();
                        jh $$39 = jh.a((ka)$$38);

                        for (int $$40 = 1; (float)$$40 < $$21; $$40++) {
                           jh $$41 = $$39.b($$40);
                           dxu $$42 = this.dV().a_($$41);
                           fcr $$43;
                           if (!($$43 = $$42.b(this.dV(), $$41, $$16)).c()) {
                              $$36 = (float)$$43.c(jm.a.b) + (float)$$41.v();
                              if ((double)$$36 - this.dC() > (double)$$21) {
                                 return;
                              }
                           }

                           if ($$40 > 1) {
                              $$17 = $$17.d();
                              dxu $$44 = this.dV().a_($$17);
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
                        this.dm = 1;
                     }
                  }
               }
            }
         }
      }
   }

   @Override
   protected boolean c(fbx $$0) {
      float $$1 = this.dL() * (float) (Math.PI / 180.0);
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
      return this.E() && this.dm <= 0 && this.aJ() && !this.fY() && !this.bZ() && this.O() && (double)this.aS() >= 1.0;
   }

   private boolean O() {
      fbw $$0 = this.j.a();
      return $$0.i != 0.0F || $$0.j != 0.0F;
   }

   private boolean P() {
      return !this.cj() && this.Q() && this.R() && !this.fx() && !this.b(buq.o) && (!this.bZ() || this.a(this.dk())) && !this.fH();
   }

   private boolean a(bvj $$0) {
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

   public void a(dhe $$0) {
      if ($$0 == dhe.d) {
         this.h(this.dy().a(jm.a.b, 0.0));
      }
   }

   @Override
   public boolean bo() {
      return this.cp;
   }

   @Override
   protected boolean fZ() {
      boolean $$0 = this.cp;
      boolean $$1 = super.fZ();
      if (this.aa_()) {
         return this.cp;
      } else {
         if (!$$0 && $$1) {
            this.dV().a(this.dA(), this.dC(), this.dG(), axf.x, axg.i, 1.0F, 1.0F, false);
            this.k.ak().a((hfg)(new hfj.b(this)));
         }

         if ($$0 && !$$1) {
            this.dV().a(this.dA(), this.dC(), this.dG(), axf.y, axg.i, 1.0F, 1.0F, false);
         }

         return this.cp;
      }
   }

   @Override
   public fbx u(float $$0) {
      if (this.k.n.aE().a()) {
         float $$1 = bae.h($$0 * 0.5F, this.dL(), this.N) * (float) (Math.PI / 180.0);
         float $$2 = bae.h($$0 * 0.5F, this.dN(), this.O) * (float) (Math.PI / 180.0);
         double $$3 = this.fw() == bvz.b ? -1.0 : 1.0;
         fbx $$4 = new fbx(0.39 * $$3, -0.6, 0.3);
         return $$4.a(-$$2).b(-$$1).e(this.m($$0));
      } else {
         return super.u($$0);
      }
   }

   @Override
   public void a(cxo $$0, cxo $$1, ctl $$2) {
      this.k.aB().a($$0, $$1, $$2);
   }

   @Override
   public float dM() {
      return this.dL();
   }

   @Override
   public void g(cxo $$0) {
      this.k.r.a($$0);
   }

   @Override
   public boolean gj() {
      return this.cQ.c();
   }

   public bbe H() {
      return this.cQ;
   }
}
