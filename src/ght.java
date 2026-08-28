import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ght extends ghq {
   public static final Logger i = LogUtils.getLogger();
   private static final int cH = 20;
   private static final int cI = 600;
   private static final int cJ = 100;
   private static final float cK = 0.6F;
   private static final double cL = 0.35;
   private static final double cM = 0.13962634F;
   public final gcz j;
   private final awz cN;
   private final fji cO;
   private final ban cP = new ban(20, 1280);
   private final List<hca> cQ = Lists.newArrayList();
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
   public ghr k = new ghr();
   private cop de = cop.b;
   protected final fjx l;
   protected int cA;
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
   private bsg di;
   private boolean dj;
   private boolean dk = true;
   private int dl;
   private boolean dm;
   private int dn;
   private boolean do = true;
   private boolean dp = false;

   public ght(fjx $$0, gcy $$1, gcz $$2, awz $$3, fji $$4, boolean $$5, boolean $$6) {
      super($$1, $$2.o());
      this.l = $$0;
      this.j = $$2;
      this.cN = $$3;
      this.cO = $$4;
      this.da = $$5;
      this.db = $$6;
      this.cQ.add(new hcs(this, $$0.ak()));
      this.cQ.add(new hcf(this));
      this.cQ.add(new hce(this, $$0.ak(), $$1.F_()));
   }

   @Override
   public boolean a(bsy $$0, float $$1) {
      return false;
   }

   @Override
   public void c(float $$0) {
   }

   @Override
   public boolean a(bui $$0, boolean $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         if ($$0 instanceof cqo) {
            this.l.ak().a((hcq)(new hck(this, (cqo)$$0, true)));
            this.l.ak().a((hcq)(new hck(this, (cqo)$$0, false)));
         }

         return true;
      }
   }

   @Override
   public void bS() {
      super.bS();
      this.dj = false;
   }

   @Override
   public float h(float $$0) {
      return this.dQ();
   }

   @Override
   public float i(float $$0) {
      return this.cb() ? super.i($$0) : this.dO();
   }

   @Override
   public void l() {
      this.cP.b();
      if (this.dY().f(this.dC(), this.dI())) {
         super.l();
         this.I();
         if (!this.de.equals(this.k.a)) {
            this.j.b(new aif(this.k.a));
            this.de = this.k.a;
         }

         if (this.cb()) {
            this.j.b(new ahx.c(this.dO(), this.dQ(), this.aL(), this.Q));
            bui $$0 = this.di();
            if ($$0 != this && $$0.dk()) {
               this.j.b(new ahy($$0));
               this.J();
            }
         } else {
            this.G();
         }

         for (hca $$1 : this.cQ) {
            $$1.a();
         }
      }
   }

   public float c() {
      for (hca $$0 : this.cQ) {
         if ($$0 instanceof hce) {
            return ((hce)$$0).b();
         }
      }

      return 0.0F;
   }

   private void G() {
      this.J();
      if (this.x()) {
         double $$0 = this.dD() - this.cS;
         double $$1 = this.dF() - this.cT;
         double $$2 = this.dJ() - this.cU;
         double $$3 = (double)(this.dO() - this.cV);
         double $$4 = (double)(this.dQ() - this.cW);
         this.dc++;
         boolean $$5 = azn.f($$0, $$1, $$2) > azn.k(2.0E-4) || this.dc >= 20;
         boolean $$6 = $$3 != 0.0 || $$4 != 0.0;
         if ($$5 && $$6) {
            this.j.b(new ahx.b(this.dD(), this.dF(), this.dJ(), this.dO(), this.dQ(), this.aL(), this.Q));
         } else if ($$5) {
            this.j.b(new ahx.a(this.dD(), this.dF(), this.dJ(), this.aL(), this.Q));
         } else if ($$6) {
            this.j.b(new ahx.c(this.dO(), this.dQ(), this.aL(), this.Q));
         } else if (this.cX != this.aL() || this.cY != this.Q) {
            this.j.b(new ahx.d(this.aL(), this.Q));
         }

         if ($$5) {
            this.cS = this.dD();
            this.cT = this.dF();
            this.cU = this.dJ();
            this.dc = 0;
         }

         if ($$6) {
            this.cV = this.dO();
            this.cW = this.dQ();
         }

         this.cX = this.aL();
         this.cY = this.Q;
         this.dk = this.l.n.I().c();
      }
   }

   private void I() {
      boolean $$0 = this.cf();
      if ($$0 != this.da) {
         aie.a $$1 = $$0 ? aie.a.a : aie.a.b;
         this.j.b(new aie(this, $$1));
         this.da = $$0;
      }
   }

   private void J() {
      boolean $$0 = this.cl();
      if ($$0 != this.db) {
         aie.a $$1 = $$0 ? aie.a.d : aie.a.e;
         this.j.b(new aie(this, $$1));
         this.db = $$0;
      }
   }

   public boolean a(boolean $$0) {
      aid.a $$1 = $$0 ? aid.a.d : aid.a.e;
      cwf $$2 = this.gl().a($$0);
      this.j.b(new aid($$1, jh.c, jm.a));
      return !$$2.f();
   }

   @Override
   public void a(bsg $$0) {
      super.a($$0);
      this.j.b(new aiu($$0));
   }

   @Override
   public void gj() {
      this.j.b(new ahj(ahj.a.a));
      fjv.c();
   }

   @Override
   protected void f(bsy $$0, float $$1) {
      if (!this.b($$0)) {
         this.x(this.eH() - $$1);
      }
   }

   @Override
   public void s() {
      this.j.b(new ahp(this.cd.l));
      this.d();
   }

   public void d() {
      super.s();
      this.l.a(null);
   }

   public void J(float $$0) {
      if (this.dd) {
         float $$1 = this.eH() - $$0;
         if ($$1 <= 0.0F) {
            this.x($$0);
            if ($$1 < 0.0F) {
               this.ak = 10;
            }
         } else {
            this.bm = $$1;
            this.ak = 20;
            this.x($$0);
            this.aO = 10;
            this.aN = this.aO;
         }
      } else {
         this.x($$0);
         this.dd = true;
      }
   }

   @Override
   public void A() {
      this.j.b(new aic(this.gm()));
   }

   @Override
   public boolean g() {
      return true;
   }

   @Override
   public boolean fL() {
      return !this.gm().b && super.fL();
   }

   @Override
   public boolean bx() {
      return !this.gm().b && super.bx();
   }

   protected void e() {
      this.j.b(new aie(this, aie.a.f, azn.d(this.q() * 100.0F)));
   }

   public void h() {
      this.j.b(new aie(this, aie.a.h));
   }

   public awz i() {
      return this.cN;
   }

   public fji j() {
      return this.cO;
   }

   public void a(dav<?> $$0) {
      if (this.cO.d($$0)) {
         this.cO.e($$0);
         this.j.b(new aih($$0));
      }
   }

   @Override
   protected int H() {
      return this.cR;
   }

   public void a(int $$0) {
      this.cR = $$0;
   }

   @Override
   public void a(xl $$0, boolean $$1) {
      this.l.ba().a($$0, $$1);
   }

   private void c(double $$0, double $$1) {
      jh $$2 = jh.a($$0, this.dF(), $$1);
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
            ezr $$11 = this.dB();
            if ($$5.o() == jm.a.a) {
               this.n(0.1 * (double)$$5.j(), $$11.e, $$11.f);
            } else {
               this.n($$11.d, $$11.e, 0.1 * (double)$$5.l());
            }
         }
      }
   }

   private boolean c(jh $$0) {
      ezm $$1 = this.cT();
      ezm $$2 = new ezm((double)$$0.u(), $$1.b, (double)$$0.w(), (double)$$0.u() + 1.0, $$1.e, (double)$$0.w() + 1.0).h(1.0E-7);
      return this.dY().g(this, $$2);
   }

   public void a(float $$0, int $$1, int $$2) {
      this.cs = $$0;
      this.cr = $$1;
      this.cq = $$2;
   }

   @Override
   public void a(xl $$0) {
      this.l.m.d().a($$0);
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

   public boolean m() {
      return this.do;
   }

   public void x(boolean $$0) {
      this.dp = $$0;
   }

   public boolean o() {
      return this.dp;
   }

   @Override
   public void a(awn $$0, float $$1, float $$2) {
      this.dY().a(this.dD(), this.dF(), this.dJ(), $$0, this.do(), $$1, $$2, false);
   }

   @Override
   public void a(awn $$0, awp $$1, float $$2, float $$3) {
      this.dY().a(this.dD(), this.dF(), this.dJ(), $$0, $$1, $$2, $$3, false);
   }

   @Override
   public boolean dl() {
      return true;
   }

   @Override
   public void c(bsg $$0) {
      cwf $$1 = this.b($$0);
      if (!$$1.f() && !this.fC()) {
         super.c($$0);
         this.dh = true;
         this.di = $$0;
      }
   }

   @Override
   public boolean fC() {
      return this.dh;
   }

   @Override
   public void fI() {
      super.fI();
      this.dh = false;
   }

   @Override
   public bsg fD() {
      return Objects.requireNonNullElse(this.di, bsg.a);
   }

   @Override
   public void a(ako<?> $$0) {
      super.a($$0);
      if (aD.equals($$0)) {
         boolean $$1 = (this.am.a(aD) & 1) > 0;
         bsg $$2 = (this.am.a(aD) & 2) > 0 ? bsg.b : bsg.a;
         if ($$1 && !this.dh) {
            this.c($$2);
         } else if (!$$1 && this.dh) {
            this.fI();
         }
      }

      if (an.equals($$0) && this.fM() && !this.dm) {
         this.l.ak().a((hcq)(new hcg(this)));
      }
   }

   @Nullable
   public bvo p() {
      if (this.dn() instanceof bvo $$0 && $$0.a()) {
         return $$0;
      }

      return null;
   }

   public float q() {
      return this.dg;
   }

   @Override
   public boolean ab() {
      return this.l.aU();
   }

   @Override
   public void a(dud $$0, boolean $$1) {
      if ($$0 instanceof dtq $$2) {
         this.l.a(new ftb($$2, $$1, this.l.aU()));
      } else {
         this.l.a(new fto($$0, $$1, this.l.aU()));
      }
   }

   @Override
   public void a(def $$0) {
      this.l.a(new ftl($$0));
   }

   @Override
   public void a(dtb $$0) {
      this.l.a(new fso($$0));
   }

   @Override
   public void a(dui $$0) {
      this.l.a(new fts($$0));
   }

   @Override
   public void a(dtt $$0) {
      this.l.a(new ftg($$0));
   }

   @Override
   public void a(cwf $$0, bsg $$1) {
      czm $$2 = $$0.a(ku.S);
      if ($$2 != null) {
         this.l.a(new fsk(this, $$0, $$1, $$2));
      }
   }

   @Override
   public void b(bui $$0) {
      this.l.g.a($$0, ls.f);
   }

   @Override
   public void c(bui $$0) {
      this.l.g.a($$0, ls.r);
   }

   @Override
   public boolean cf() {
      return this.k.a.f();
   }

   @Override
   public boolean ck() {
      return this.cZ;
   }

   public boolean w() {
      return this.ck() || this.co();
   }

   @Override
   public void fx() {
      super.fx();
      if (this.x()) {
         this.bo = this.k.b;
         this.bq = this.k.c;
         this.bn = this.k.a.e();
         this.cD = this.cB;
         this.cE = this.cC;
         this.cC = this.cC + (this.dQ() - this.cC) * 0.5F;
         this.cB = this.cB + (this.dO() - this.cB) * 0.5F;
      }
   }

   protected boolean x() {
      return this.l.ao() == this;
   }

   public void y() {
      this.b(bvq.a);
      if (this.dY() != null) {
         for (double $$0 = this.dF(); $$0 > (double)this.dY().I_() && $$0 <= (double)this.dY().al(); $$0++) {
            this.a_(this.dD(), $$0, this.dJ());
            if (this.dY().g(this)) {
               break;
            }
         }

         this.h(ezr.c);
         this.w(0.0F);
      }

      this.x(this.eW());
      this.aP = 0;
   }

   @Override
   public void n_() {
      if (this.cA > 0) {
         this.cA--;
      }

      if (!(this.l.z instanceof frn)) {
         this.y(this.B() == dob.a.a);
         this.N();
      }

      boolean $$0 = this.k.a.e();
      boolean $$1 = this.k.a.f();
      boolean $$2 = this.P();
      com $$3 = this.gm();
      this.cZ = !$$3.b && !this.cm() && !this.cb() && this.h(bvq.f) && (this.cf() || !this.fU() && !this.h(bvq.a));
      float $$4 = (float)this.h(bwm.z);
      this.k.a(this.w(), $$4);
      this.l.aB().a(this.k);
      if (this.fC() && !this.cb()) {
         this.k.b *= 0.2F;
         this.k.c *= 0.2F;
         this.cA = 0;
      }

      boolean $$5 = false;
      if (this.dl > 0) {
         this.dl--;
         $$5 = true;
         this.k.c();
      }

      if (!this.ae) {
         this.c(this.dD() - (double)this.dt() * 0.35, this.dJ() + (double)this.dt() * 0.35);
         this.c(this.dD() - (double)this.dt() * 0.35, this.dJ() - (double)this.dt() * 0.35);
         this.c(this.dD() + (double)this.dt() * 0.35, this.dJ() - (double)this.dt() * 0.35);
         this.c(this.dD() + (double)this.dt() * 0.35, this.dJ() + (double)this.dt() * 0.35);
      }

      if ($$1) {
         this.cA = 0;
      }

      boolean $$6 = this.O();
      boolean $$7 = this.cb() ? this.dm().aL() : this.aL();
      boolean $$8 = !$$1 && !$$2;
      if (($$7 || this.bq()) && $$8 && $$6) {
         if (this.cA <= 0 && !this.l.n.B.e()) {
            this.cA = 7;
         } else {
            this.h(true);
         }
      }

      if ((!this.bl() || this.bq()) && $$6 && this.l.n.B.e()) {
         this.h(true);
      }

      if (this.cl()) {
         boolean $$9 = !this.k.b() || !this.Q();
         boolean $$10 = $$9 || this.Q && !this.T || this.bl() && !this.bq();
         if (this.cm()) {
            if (!this.aL() && !this.k.a.f() && $$9 || !this.bl()) {
               this.h(false);
            }
         } else if ($$10) {
            this.h(false);
         }
      }

      boolean $$11 = false;
      if ($$3.c) {
         if (this.l.r.h()) {
            if (!$$3.b) {
               $$3.b = true;
               $$11 = true;
               this.A();
            }
         } else if (!$$0 && this.k.a.e() && !$$5) {
            if (this.cf == 0) {
               this.cf = 7;
            } else if (!this.cm()) {
               $$3.b = !$$3.b;
               if ($$3.b && this.aL()) {
                  this.v();
               }

               $$11 = true;
               this.A();
               this.cf = 0;
            }
         }
      }

      if (this.k.a.e() && !$$11 && !$$0 && !this.q_() && this.gr()) {
         this.j.b(new aie(this, aie.a.i));
      }

      this.dm = this.fM();
      if (this.bl() && this.k.a.f() && this.en()) {
         this.fo();
      }

      if (this.a(axj.a)) {
         int $$12 = this.R_() ? 10 : 1;
         this.dn = azn.a(this.dn + $$12, 0, 600);
      } else if (this.dn > 0) {
         this.a(axj.a);
         this.dn = azn.a(this.dn - 10, 0, 600);
      }

      if ($$3.b && this.x()) {
         int $$13 = 0;
         if (this.k.a.f()) {
            $$13--;
         }

         if (this.k.a.e()) {
            $$13++;
         }

         if ($$13 != 0) {
            this.h(this.dB().b(0.0, (double)((float)$$13 * $$3.a() * 3.0F), 0.0));
         }
      }

      bvo $$14 = this.p();
      if ($$14 != null && $$14.c() == 0) {
         if (this.df < 0) {
            this.df++;
            if (this.df == 0) {
               this.dg = 0.0F;
            }
         }

         if ($$0 && !this.k.a.e()) {
            this.df = -10;
            $$14.b(azn.d(this.q() * 100.0F));
            this.e();
         } else if (!$$0 && this.k.a.e()) {
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

      super.n_();
      if (this.aL() && $$3.b && !this.l.r.h()) {
         $$3.b = false;
         this.A();
      }
   }

   public dob.a B() {
      return this.at == null ? dob.a.b : this.at.a();
   }

   @Override
   protected void eo() {
      this.aP++;
      if (this.aP == 20) {
         this.a(bui.c.a);
      }
   }

   private void y(boolean $$0) {
      this.cG = this.cF;
      float $$1 = 0.0F;
      if ($$0 && this.at != null && this.at.e()) {
         if (this.l.z != null && !this.l.z.k() && !(this.l.z instanceof fqt) && !(this.l.z instanceof frs)) {
            if (this.l.z instanceof fse) {
               this.s();
            }

            this.l.a(null);
         }

         if (this.cF == 0.0F) {
            this.l.ak().a(hcl.b(awo.uI, this.af.i() * 0.4F + 0.8F, 0.25F));
         }

         $$1 = 0.0125F;
         this.at.a(false);
      } else if (this.b(btp.i) && !this.c(btp.i).a(60)) {
         $$1 = 0.006666667F;
      } else if (this.cF > 0.0F) {
         $$1 = -0.05F;
      }

      this.cF = azn.a(this.cF + $$1, 0.0F, 1.0F);
   }

   @Override
   public void u() {
      super.u();
      this.dj = false;
      if (this.dn() instanceof cqq $$0) {
         $$0.a(this.k.a.c(), this.k.a.d(), this.k.a.a(), this.k.a.b());
         this.dj = this.dj | (this.k.a.c() || this.k.a.d() || this.k.a.a() || this.k.a.b());
      }
   }

   public boolean C() {
      return this.dj;
   }

   @Nullable
   @Override
   public btn d(jq<btl> $$0) {
      if ($$0.a(btp.i)) {
         this.cG = 0.0F;
         this.cF = 0.0F;
      }

      return super.d($$0);
   }

   @Override
   public void a(bvi $$0, ezr $$1) {
      double $$2 = this.dD();
      double $$3 = this.dJ();
      super.a($$0, $$1);
      float $$4 = (float)(this.dD() - $$2);
      float $$5 = (float)(this.dJ() - $$3);
      this.g($$4, $$5);
      this.h = this.h + azn.f($$4, $$5) * 0.6F;
   }

   public boolean D() {
      return this.dk;
   }

   @Override
   public boolean gR() {
      return this.l.n.J().c();
   }

   protected void g(float $$0, float $$1) {
      if (this.K()) {
         ezr $$2 = this.dw();
         ezr $$3 = $$2.b((double)$$0, 0.0, (double)$$1);
         ezr $$4 = new ezr((double)$$0, 0.0, (double)$$1);
         float $$5 = this.fs();
         float $$6 = (float)$$4.h();
         if ($$6 <= 0.001F) {
            ezq $$7 = this.k.a();
            float $$8 = $$5 * $$7.i;
            float $$9 = $$5 * $$7.j;
            float $$10 = azn.a(this.dO() * (float) (Math.PI / 180.0));
            float $$11 = azn.b(this.dO() * (float) (Math.PI / 180.0));
            $$4 = new ezr((double)($$8 * $$11 - $$9 * $$10), $$4.e, (double)($$9 * $$11 + $$8 * $$10));
            $$6 = (float)$$4.h();
            if ($$6 <= 0.001F) {
               return;
            }
         }

         float $$12 = azn.j($$6);
         ezr $$13 = $$4.c((double)$$12);
         ezr $$14 = this.bX();
         float $$15 = (float)($$14.d * $$13.d + $$14.f * $$13.f);
         if (!($$15 < -0.15F)) {
            ezw $$16 = ezw.a(this);
            jh $$17 = jh.a(this.dD(), this.cT().e, this.dJ());
            dvo $$18 = this.dY().a_($$17);
            if ($$18.b(this.dY(), $$17, $$16).c()) {
               $$17 = $$17.d();
               dvo $$19 = this.dY().a_($$17);
               if ($$19.b(this.dY(), $$17, $$16).c()) {
                  float $$20 = 7.0F;
                  float $$21 = 1.2F;
                  if (this.b(btp.h)) {
                     $$21 += (float)(this.c(btp.h).e() + 1) * 0.75F;
                  }

                  float $$22 = Math.max($$5 * 7.0F, 1.0F / $$12);
                  ezr $$24 = $$3.e($$13.c((double)$$22));
                  float $$25 = this.dt();
                  float $$26 = this.du();
                  ezm $$27 = new ezm($$2, $$24.b(0.0, (double)$$26, 0.0)).c((double)$$25, 0.0, (double)$$25);
                  ezr $$23 = $$2.b(0.0, 0.51F, 0.0);
                  $$24 = $$24.b(0.0, 0.51F, 0.0);
                  ezr $$28 = $$13.c(new ezr(0.0, 1.0, 0.0));
                  ezr $$29 = $$28.c((double)($$25 * 0.5F));
                  ezr $$30 = $$23.d($$29);
                  ezr $$31 = $$24.d($$29);
                  ezr $$32 = $$23.e($$29);
                  ezr $$33 = $$24.e($$29);
                  Iterable<fal> $$34 = this.dY().d(this, $$27);
                  Iterator<ezm> $$35 = StreamSupport.stream($$34.spliterator(), false).flatMap($$0x -> $$0x.e().stream()).iterator();
                  float $$36 = Float.MIN_VALUE;

                  while ($$35.hasNext()) {
                     ezm $$37 = $$35.next();
                     if ($$37.a($$30, $$31) || $$37.a($$32, $$33)) {
                        $$36 = (float)$$37.e;
                        ezr $$38 = $$37.f();
                        jh $$39 = jh.a((ka)$$38);

                        for (int $$40 = 1; (float)$$40 < $$21; $$40++) {
                           jh $$41 = $$39.b($$40);
                           dvo $$42 = this.dY().a_($$41);
                           fal $$43;
                           if (!($$43 = $$42.b(this.dY(), $$41, $$16)).c()) {
                              $$36 = (float)$$43.c(jm.a.b) + (float)$$41.v();
                              if ((double)$$36 - this.dF() > (double)$$21) {
                                 return;
                              }
                           }

                           if ($$40 > 1) {
                              $$17 = $$17.d();
                              dvo $$44 = this.dY().a_($$17);
                              if (!$$44.b(this.dY(), $$17, $$16).c()) {
                                 return;
                              }
                           }
                        }
                        break;
                     }
                  }

                  if ($$36 != Float.MIN_VALUE) {
                     float $$45 = (float)((double)$$36 - this.dF());
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
   protected boolean c(ezr $$0) {
      float $$1 = this.dO() * (float) (Math.PI / 180.0);
      double $$2 = (double)azn.a($$1);
      double $$3 = (double)azn.b($$1);
      double $$4 = (double)this.bo * $$3 - (double)this.bq * $$2;
      double $$5 = (double)this.bq * $$3 + (double)this.bo * $$2;
      double $$6 = azn.k($$4) + azn.k($$5);
      double $$7 = azn.k($$0.d) + azn.k($$0.f);
      if (!($$6 < 1.0E-5F) && !($$7 < 1.0E-5F)) {
         double $$8 = $$4 * $$0.d + $$5 * $$0.f;
         double $$9 = Math.acos($$8 / Math.sqrt($$6 * $$7));
         return $$9 < 0.13962634F;
      } else {
         return false;
      }
   }

   private boolean K() {
      return this.D() && this.dl <= 0 && this.aL() && !this.gd() && !this.cb() && this.M() && (double)this.aU() >= 1.0;
   }

   private boolean M() {
      ezq $$0 = this.k.a();
      return $$0.i != 0.0F || $$0.j != 0.0F;
   }

   private boolean O() {
      return !this.cl() && this.P() && this.Q() && !this.fC() && !this.b(btp.o) && (!this.cb() || this.d(this.dm())) && !this.fM();
   }

   private boolean d(bui $$0) {
      return $$0.dR() && $$0.dk();
   }

   private boolean P() {
      double $$0 = 0.8;
      return this.bq() ? this.k.b() : (double)this.k.c >= 0.8;
   }

   private boolean Q() {
      return this.cb() || (float)this.gw().a() > 6.0F || this.gm().c;
   }

   public float E() {
      if (!this.a(axj.a)) {
         return 0.0F;
      } else {
         float $$0 = 600.0F;
         float $$1 = 100.0F;
         if ((float)this.dn >= 600.0F) {
            return 1.0F;
         } else {
            float $$2 = azn.a((float)this.dn / 100.0F, 0.0F, 1.0F);
            float $$3 = (float)this.dn < 100.0F ? 0.0F : azn.a(((float)this.dn - 100.0F) / 500.0F, 0.0F, 1.0F);
            return $$2 * 0.6F + $$3 * 0.39999998F;
         }
      }
   }

   public void a(dfc $$0) {
      if ($$0 == dfc.d) {
         this.h(this.dB().a(jm.a.b, 0.0));
      }
   }

   @Override
   public boolean bq() {
      return this.cp;
   }

   @Override
   protected boolean ge() {
      boolean $$0 = this.cp;
      boolean $$1 = super.ge();
      if (this.R_()) {
         return this.cp;
      } else {
         if (!$$0 && $$1) {
            this.dY().a(this.dD(), this.dF(), this.dJ(), awo.x, awp.i, 1.0F, 1.0F, false);
            this.l.ak().a((hcq)(new hct.b(this)));
         }

         if ($$0 && !$$1) {
            this.dY().a(this.dD(), this.dF(), this.dJ(), awo.y, awp.i, 1.0F, 1.0F, false);
         }

         return this.cp;
      }
   }

   @Override
   public ezr u(float $$0) {
      if (this.l.n.aD().a()) {
         float $$1 = azn.h($$0 * 0.5F, this.dO(), this.O) * (float) (Math.PI / 180.0);
         float $$2 = azn.h($$0 * 0.5F, this.dQ(), this.P) * (float) (Math.PI / 180.0);
         double $$3 = this.fB() == buy.b ? -1.0 : 1.0;
         ezr $$4 = new ezr(0.39 * $$3, -0.6, 0.3);
         return $$4.a(-$$2).b(-$$1).e(this.m($$0));
      } else {
         return super.u($$0);
      }
   }

   @Override
   public void a(cwf $$0, cwf $$1, csc $$2) {
      this.l.aB().a($$0, $$1, $$2);
   }

   @Override
   public float dP() {
      return this.dO();
   }

   @Override
   public void g(cwf $$0) {
      this.l.r.a($$0);
   }

   @Override
   public boolean go() {
      return this.cP.c();
   }

   public ban F() {
      return this.cP;
   }
}
