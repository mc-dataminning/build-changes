import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gdh extends gde {
   public static final Logger g = LogUtils.getLogger();
   private static final int cL = 20;
   private static final int cM = 600;
   private static final int cN = 100;
   private static final float cO = 0.6F;
   private static final double cP = 0.35;
   private static final double cQ = 0.13962634F;
   public final fym h;
   private final avs cR;
   private final ffi cS;
   private final List<gso> cT = Lists.newArrayList();
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
   private int de;
   private boolean df;
   public gdf cC;
   protected final ffw cD;
   protected int cE;
   public float cF;
   public float cG;
   public float cH;
   public float cI;
   private int dg;
   private float dh;
   public float cJ;
   public float cK;
   private boolean di;
   @Nullable
   private bqg dj;
   private boolean dk;
   private boolean dl = true;
   private int dm;
   private boolean dn;
   private int do;
   private boolean dp = true;
   private boolean dq = false;

   public gdh(ffw $$0, fyl $$1, fym $$2, avs $$3, ffi $$4, boolean $$5, boolean $$6) {
      super($$1, $$2.o());
      this.cD = $$0;
      this.h = $$2;
      this.cR = $$3;
      this.cS = $$4;
      this.dc = $$5;
      this.dd = $$6;
      this.cT.add(new gtg(this, $$0.aj()));
      this.cT.add(new gst(this));
      this.cT.add(new gss(this, $$0.aj(), $$1.F_()));
   }

   @Override
   public boolean a(bra $$0, float $$1) {
      return false;
   }

   @Override
   public void c(float $$0) {
   }

   @Override
   public boolean a(bsh $$0, boolean $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         if ($$0 instanceof cog) {
            this.cD.aj().a((gte)(new gsy(this, (cog)$$0, true)));
            this.cD.aj().a((gte)(new gsy(this, (cog)$$0, false)));
         }

         return true;
      }
   }

   @Override
   public void bK() {
      super.bK();
      this.dk = false;
   }

   @Override
   public float h(float $$0) {
      return this.dJ();
   }

   @Override
   public float i(float $$0) {
      return this.bT() ? super.i($$0) : this.dH();
   }

   @Override
   public void l() {
      if (this.dR().f(this.dv(), this.dB())) {
         super.l();
         if (this.bT()) {
            this.h.b(new agz.c(this.dH(), this.dJ(), this.aG()));
            this.h.b(new ahh(this.bp, this.br, this.cC.g, this.cC.h));
            bsh $$0 = this.db();
            if ($$0 != this && $$0.dc()) {
               this.h.b(new aha($$0));
               this.F();
            }
         } else {
            this.E();
         }

         for (gso $$1 : this.cT) {
            $$1.a();
         }
      }
   }

   public float d() {
      for (gso $$0 : this.cT) {
         if ($$0 instanceof gss) {
            return ((gss)$$0).b();
         }
      }

      return 0.0F;
   }

   private void E() {
      this.F();
      boolean $$0 = this.bX();
      if ($$0 != this.dc) {
         ahg.a $$1 = $$0 ? ahg.a.a : ahg.a.b;
         this.h.b(new ahg(this, $$1));
         this.dc = $$0;
      }

      if (this.x()) {
         double $$2 = this.dw() - this.cV;
         double $$3 = this.dy() - this.cW;
         double $$4 = this.dC() - this.cX;
         double $$5 = (double)(this.dH() - this.cY);
         double $$6 = (double)(this.dJ() - this.cZ);
         this.de++;
         boolean $$7 = ayg.f($$2, $$3, $$4) > ayg.k(2.0E-4) || this.de >= 20;
         boolean $$8 = $$5 != 0.0 || $$6 != 0.0;
         if (this.bT()) {
            ewh $$9 = this.du();
            this.h.b(new agz.b($$9.c, -999.0, $$9.e, this.dH(), this.dJ(), this.aG()));
            $$7 = false;
         } else if ($$7 && $$8) {
            this.h.b(new agz.b(this.dw(), this.dy(), this.dC(), this.dH(), this.dJ(), this.aG()));
         } else if ($$7) {
            this.h.b(new agz.a(this.dw(), this.dy(), this.dC(), this.aG()));
         } else if ($$8) {
            this.h.b(new agz.c(this.dH(), this.dJ(), this.aG()));
         } else if (this.da != this.aG()) {
            this.h.b(new agz.d(this.aG()));
         }

         if ($$7) {
            this.cV = this.dw();
            this.cW = this.dy();
            this.cX = this.dC();
            this.de = 0;
         }

         if ($$8) {
            this.cY = this.dH();
            this.cZ = this.dJ();
         }

         this.da = this.aG();
         this.dl = this.cD.m.H().c();
      }
   }

   private void F() {
      boolean $$0 = this.cd();
      if ($$0 != this.dd) {
         ahg.a $$1 = $$0 ? ahg.a.d : ahg.a.e;
         this.h.b(new ahg(this, $$1));
         this.dd = $$0;
      }
   }

   public boolean a(boolean $$0) {
      ahf.a $$1 = $$0 ? ahf.a.d : ahf.a.e;
      cud $$2 = this.ga().a($$0);
      this.h.b(new ahf($$1, ja.c, jf.a));
      return !$$2.e();
   }

   @Override
   public void a(bqg $$0) {
      super.a($$0);
      this.h.b(new ahv($$0));
   }

   @Override
   public void fY() {
      this.h.b(new agm(agm.a.a));
      ffu.c();
   }

   @Override
   protected void f(bra $$0, float $$1) {
      if (!this.b($$0)) {
         this.u(this.ey() - $$1);
      }
   }

   @Override
   public void s() {
      this.h.b(new agr(this.ce.j));
      this.e();
   }

   public void e() {
      super.s();
      this.cD.a(null);
   }

   public void G(float $$0) {
      if (this.df) {
         float $$1 = this.ey() - $$0;
         if ($$1 <= 0.0F) {
            this.u($$0);
            if ($$1 < 0.0F) {
               this.am = 10;
            }
         } else {
            this.bn = $$1;
            this.am = 20;
            this.u($$0);
            this.aQ = 10;
            this.aP = this.aQ;
         }
      } else {
         this.u($$0);
         this.df = true;
      }
   }

   @Override
   public void z() {
      this.h.b(new ahe(this.gb()));
   }

   @Override
   public boolean g() {
      return true;
   }

   @Override
   public boolean fB() {
      return !this.gb().b && super.fB();
   }

   @Override
   public boolean bs() {
      return !this.gb().b && super.bs();
   }

   protected void h() {
      this.h.b(new ahg(this, ahg.a.f, ayg.d(this.v() * 100.0F)));
   }

   public void i() {
      this.h.b(new ahg(this, ahg.a.h));
   }

   public avs j() {
      return this.cR;
   }

   public ffi m() {
      return this.cS;
   }

   public void a(cyl<?> $$0) {
      if (this.cS.d($$0)) {
         this.cS.e($$0);
         this.h.b(new ahj($$0));
      }
   }

   @Override
   protected int G() {
      return this.cU;
   }

   public void a(int $$0) {
      this.cU = $$0;
   }

   @Override
   public void a(wu $$0, boolean $$1) {
      this.cD.aW().a($$0, $$1);
   }

   private void c(double $$0, double $$1) {
      ja $$2 = ja.a($$0, this.dy(), $$1);
      if (this.c($$2)) {
         double $$3 = $$0 - (double)$$2.u();
         double $$4 = $$1 - (double)$$2.w();
         jf $$5 = null;
         double $$6 = Double.MAX_VALUE;
         jf[] $$7 = new jf[]{jf.e, jf.f, jf.c, jf.d};

         for (jf $$8 : $$7) {
            double $$9 = $$8.o().a($$3, 0.0, $$4);
            double $$10 = $$8.f() == jf.b.a ? 1.0 - $$9 : $$9;
            if ($$10 < $$6 && !this.c($$2.a($$8))) {
               $$6 = $$10;
               $$5 = $$8;
            }
         }

         if ($$5 != null) {
            ewh $$11 = this.du();
            if ($$5.o() == jf.a.a) {
               this.o(0.1 * (double)$$5.j(), $$11.d, $$11.e);
            } else {
               this.o($$11.c, $$11.d, 0.1 * (double)$$5.l());
            }
         }
      }
   }

   private boolean c(ja $$0) {
      ewc $$1 = this.cM();
      ewc $$2 = new ewc((double)$$0.u(), $$1.b, (double)$$0.w(), (double)$$0.u() + 1.0, $$1.e, (double)$$0.w() + 1.0).h(1.0E-7);
      return this.dR().f(this, $$2);
   }

   public void a(float $$0, int $$1, int $$2) {
      this.ct = $$0;
      this.cs = $$1;
      this.cr = $$2;
   }

   @Override
   public void a(wu $$0) {
      this.cD.l.d().a($$0);
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

   public boolean o() {
      return this.dp;
   }

   public void c(boolean $$0) {
      this.dq = $$0;
   }

   public boolean p() {
      return this.dq;
   }

   @Override
   public void a(avg $$0, float $$1, float $$2) {
      this.dR().a(this.dw(), this.dy(), this.dC(), $$0, this.dg(), $$1, $$2, false);
   }

   @Override
   public void a(avg $$0, avi $$1, float $$2, float $$3) {
      this.dR().a(this.dw(), this.dy(), this.dC(), $$0, $$1, $$2, $$3, false);
   }

   @Override
   public boolean dd() {
      return true;
   }

   @Override
   public void c(bqg $$0) {
      cud $$1 = this.b($$0);
      if (!$$1.e() && !this.ft()) {
         super.c($$0);
         this.di = true;
         this.dj = $$0;
      }
   }

   @Override
   public boolean ft() {
      return this.di;
   }

   @Override
   public void fz() {
      super.fz();
      this.di = false;
   }

   @Override
   public bqg fu() {
      return Objects.requireNonNullElse(this.dj, bqg.a);
   }

   @Override
   public void a(ajp<?> $$0) {
      super.a($$0);
      if (aG.equals($$0)) {
         boolean $$1 = (this.ao.a(aG) & 1) > 0;
         bqg $$2 = (this.ao.a(aG) & 2) > 0 ? bqg.b : bqg.a;
         if ($$1 && !this.di) {
            this.c($$2);
         } else if (!$$1 && this.di) {
            this.fz();
         }
      }

      if (ap.equals($$0) && this.fC() && !this.dn) {
         this.cD.aj().a((gte)(new gsu(this)));
      }
   }

   @Nullable
   public btn q() {
      if (this.df() instanceof btn $$0 && $$0.a()) {
         return $$0;
      }

      return null;
   }

   public float v() {
      return this.dh;
   }

   @Override
   public boolean Z() {
      return this.cD.aQ();
   }

   @Override
   public void a(drb $$0, boolean $$1) {
      if ($$0 instanceof dqo $$2) {
         this.cD.a(new foy($$2, $$1, this.cD.aQ()));
      } else {
         this.cD.a(new fpl($$0, $$1, this.cD.aQ()));
      }
   }

   @Override
   public void a(dbh $$0) {
      this.cD.a(new fpi($$0));
   }

   @Override
   public void a(dqa $$0) {
      this.cD.a(new fok($$0));
   }

   @Override
   public void a(drg $$0) {
      this.cD.a(new fpp($$0));
   }

   @Override
   public void a(dqr $$0) {
      this.cD.a(new fpd($$0));
   }

   @Override
   public void a(cud $$0, bqg $$1) {
      if ($$0.a(cug.tZ)) {
         this.cD.a(new fog(this, $$0, $$1));
      }
   }

   @Override
   public void b(bsh $$0) {
      this.cD.g.a($$0, lj.f);
   }

   @Override
   public void c(bsh $$0) {
      this.cD.g.a($$0, lj.r);
   }

   @Override
   public boolean bX() {
      return this.cC != null && this.cC.h;
   }

   @Override
   public boolean cc() {
      return this.db;
   }

   @Override
   public boolean w() {
      return this.cc() || this.cg();
   }

   @Override
   public void fo() {
      super.fo();
      if (this.x()) {
         this.bp = this.cC.a;
         this.br = this.cC.b;
         this.bo = this.cC.g;
         this.cH = this.cF;
         this.cI = this.cG;
         this.cG = this.cG + (this.dJ() - this.cG) * 0.5F;
         this.cF = this.cF + (this.dH() - this.cF) * 0.5F;
      }
   }

   protected boolean x() {
      return this.cD.an() == this;
   }

   @Override
   public void A() {
      this.b(bto.a);
      if (this.dR() != null) {
         for (double $$0 = this.dy(); $$0 > (double)this.dR().I_() && $$0 < (double)this.dR().am(); $$0++) {
            this.a_(this.dw(), $$0, this.dC());
            if (this.dR().g(this)) {
               break;
            }
         }

         this.j(ewh.b);
         this.t(0.0F);
      }

      this.u(this.eP());
      this.aR = 0;
   }

   @Override
   public void m_() {
      if (this.cE > 0) {
         this.cE--;
      }

      if (!(this.cD.y instanceof fnj)) {
         this.H();
      }

      boolean $$0 = this.cC.g;
      boolean $$1 = this.cC.h;
      boolean $$2 = this.N();
      cmi $$3 = this.gb();
      this.db = !$$3.b && !this.ce() && !this.bT() && this.h(bto.f) && (this.bX() || !this.fJ() && !this.h(bto.a));
      float $$4 = (float)this.g(buk.z);
      this.cC.a(this.w(), $$4);
      this.cD.ax().a(this.cC);
      if (this.ft() && !this.bT()) {
         this.cC.a *= 0.2F;
         this.cC.b *= 0.2F;
         this.cE = 0;
      }

      boolean $$5 = false;
      if (this.dm > 0) {
         this.dm--;
         $$5 = true;
         this.cC.g = true;
      }

      if (!this.ag) {
         this.c(this.dw() - (double)this.dl() * 0.35, this.dC() + (double)this.dl() * 0.35);
         this.c(this.dw() - (double)this.dl() * 0.35, this.dC() - (double)this.dl() * 0.35);
         this.c(this.dw() + (double)this.dl() * 0.35, this.dC() - (double)this.dl() * 0.35);
         this.c(this.dw() + (double)this.dl() * 0.35, this.dC() + (double)this.dl() * 0.35);
      }

      if ($$1) {
         this.cE = 0;
      }

      boolean $$6 = this.L();
      boolean $$7 = this.bT() ? this.de().aG() : this.aG();
      boolean $$8 = !$$1 && !$$2;
      if (($$7 || this.bl()) && $$8 && $$6) {
         if (this.cE <= 0 && !this.cD.m.C.e()) {
            this.cE = 7;
         } else {
            this.i(true);
         }
      }

      if ((!this.bg() || this.bl()) && $$6 && this.cD.m.C.e()) {
         this.i(true);
      }

      if (this.cd()) {
         boolean $$9 = !this.cC.b() || !this.O();
         boolean $$10 = $$9 || this.Q && !this.T || this.bg() && !this.bl();
         if (this.ce()) {
            if (!this.aG() && !this.cC.h && $$9 || !this.bg()) {
               this.i(false);
            }
         } else if ($$10) {
            this.i(false);
         }
      }

      boolean $$11 = false;
      if ($$3.c) {
         if (this.cD.q.h()) {
            if (!$$3.b) {
               $$3.b = true;
               $$11 = true;
               this.z();
            }
         } else if (!$$0 && this.cC.g && !$$5) {
            if (this.cg == 0) {
               this.cg = 7;
            } else if (!this.ce()) {
               $$3.b = !$$3.b;
               if ($$3.b && this.aG()) {
                  this.fh();
               }

               $$11 = true;
               this.z();
               this.cg = 0;
            }
         }
      }

      if (this.cC.g && !$$11 && !$$0 && !$$3.b && !this.bT() && !this.p_()) {
         cud $$12 = this.a(bso.e);
         if ($$12.a(cug.nT) && csz.i($$12) && this.gf()) {
            this.h.b(new ahg(this, ahg.a.i));
         }
      }

      this.dn = this.fC();
      if (this.bg() && this.cC.h && this.ee()) {
         this.fi();
      }

      if (this.a(awc.a)) {
         int $$13 = this.N_() ? 10 : 1;
         this.do = ayg.a(this.do + $$13, 0, 600);
      } else if (this.do > 0) {
         this.a(awc.a);
         this.do = ayg.a(this.do - 10, 0, 600);
      }

      if ($$3.b && this.x()) {
         int $$14 = 0;
         if (this.cC.h) {
            $$14--;
         }

         if (this.cC.g) {
            $$14++;
         }

         if ($$14 != 0) {
            this.j(this.du().b(0.0, (double)((float)$$14 * $$3.a() * 3.0F), 0.0));
         }
      }

      btn $$15 = this.q();
      if ($$15 != null && $$15.c() == 0) {
         if (this.dg < 0) {
            this.dg++;
            if (this.dg == 0) {
               this.dh = 0.0F;
            }
         }

         if ($$0 && !this.cC.g) {
            this.dg = -10;
            $$15.b(ayg.d(this.v() * 100.0F));
            this.h();
         } else if (!$$0 && this.cC.g) {
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

      super.m_();
      if (this.aG() && $$3.b && !this.cD.q.h()) {
         $$3.b = false;
         this.z();
      }
   }

   @Override
   protected void ef() {
      this.aR++;
      if (this.aR == 20) {
         this.a(bsh.d.a);
      }
   }

   private void H() {
      this.cK = this.cJ;
      float $$0 = 0.0F;
      if (this.aw) {
         if (this.cD.y != null && !this.cD.y.k() && !(this.cD.y instanceof fmp)) {
            if (this.cD.y instanceof foa) {
               this.s();
            }

            this.cD.a(null);
         }

         if (this.cJ == 0.0F) {
            this.cD.aj().a(gsz.b(avh.uJ, this.ah.i() * 0.4F + 0.8F, 0.25F));
         }

         $$0 = 0.0125F;
         this.aw = false;
      } else if (this.b(brr.i) && !this.c(brr.i).a(60)) {
         $$0 = 0.006666667F;
      } else if (this.cJ > 0.0F) {
         $$0 = -0.05F;
      }

      this.cJ = ayg.a(this.cJ + $$0, 0.0F, 1.0F);
      this.M();
   }

   @Override
   public void u() {
      super.u();
      this.dk = false;
      if (this.df() instanceof coi $$0) {
         $$0.a(this.cC.e, this.cC.f, this.cC.c, this.cC.d);
         this.dk = this.dk | (this.cC.e || this.cC.f || this.cC.c || this.cC.d);
      }
   }

   public boolean B() {
      return this.dk;
   }

   @Nullable
   @Override
   public brp d(jj<brn> $$0) {
      if ($$0.a(brr.i)) {
         this.cK = 0.0F;
         this.cJ = 0.0F;
      }

      return super.d($$0);
   }

   @Override
   public void a(bth $$0, ewh $$1) {
      double $$2 = this.dw();
      double $$3 = this.dC();
      super.a($$0, $$1);
      this.g((float)(this.dw() - $$2), (float)(this.dC() - $$3));
   }

   public boolean C() {
      return this.dl;
   }

   protected void g(float $$0, float $$1) {
      if (this.I()) {
         ewh $$2 = this.dp();
         ewh $$3 = $$2.b((double)$$0, 0.0, (double)$$1);
         ewh $$4 = new ewh((double)$$0, 0.0, (double)$$1);
         float $$5 = this.fl();
         float $$6 = (float)$$4.g();
         if ($$6 <= 0.001F) {
            ewg $$7 = this.cC.a();
            float $$8 = $$5 * $$7.i;
            float $$9 = $$5 * $$7.j;
            float $$10 = ayg.a(this.dH() * (float) (Math.PI / 180.0));
            float $$11 = ayg.b(this.dH() * (float) (Math.PI / 180.0));
            $$4 = new ewh((double)($$8 * $$11 - $$9 * $$10), $$4.d, (double)($$9 * $$11 + $$8 * $$10));
            $$6 = (float)$$4.g();
            if ($$6 <= 0.001F) {
               return;
            }
         }

         float $$12 = ayg.i($$6);
         ewh $$13 = $$4.a((double)$$12);
         ewh $$14 = this.bP();
         float $$15 = (float)($$14.c * $$13.c + $$14.e * $$13.e);
         if (!($$15 < -0.15F)) {
            ewm $$16 = ewm.a(this);
            ja $$17 = ja.a(this.dw(), this.cM().e, this.dC());
            dsl $$18 = this.dR().a_($$17);
            if ($$18.b(this.dR(), $$17, $$16).c()) {
               $$17 = $$17.c();
               dsl $$19 = this.dR().a_($$17);
               if ($$19.b(this.dR(), $$17, $$16).c()) {
                  float $$20 = 7.0F;
                  float $$21 = 1.2F;
                  if (this.b(brr.h)) {
                     $$21 += (float)(this.c(brr.h).e() + 1) * 0.75F;
                  }

                  float $$22 = Math.max($$5 * 7.0F, 1.0F / $$12);
                  ewh $$24 = $$3.e($$13.a((double)$$22));
                  float $$25 = this.dl();
                  float $$26 = this.dm();
                  ewc $$27 = new ewc($$2, $$24.b(0.0, (double)$$26, 0.0)).c((double)$$25, 0.0, (double)$$25);
                  ewh $$23 = $$2.b(0.0, 0.51F, 0.0);
                  $$24 = $$24.b(0.0, 0.51F, 0.0);
                  ewh $$28 = $$13.c(new ewh(0.0, 1.0, 0.0));
                  ewh $$29 = $$28.a((double)($$25 * 0.5F));
                  ewh $$30 = $$23.d($$29);
                  ewh $$31 = $$24.d($$29);
                  ewh $$32 = $$23.e($$29);
                  ewh $$33 = $$24.e($$29);
                  Iterable<exa> $$34 = this.dR().d(this, $$27);
                  Iterator<ewc> $$35 = StreamSupport.stream($$34.spliterator(), false).flatMap($$0x -> $$0x.e().stream()).iterator();
                  float $$36 = Float.MIN_VALUE;

                  while ($$35.hasNext()) {
                     ewc $$37 = $$35.next();
                     if ($$37.a($$30, $$31) || $$37.a($$32, $$33)) {
                        $$36 = (float)$$37.e;
                        ewh $$38 = $$37.f();
                        ja $$39 = ja.a($$38);

                        for (int $$40 = 1; (float)$$40 < $$21; $$40++) {
                           ja $$41 = $$39.b($$40);
                           dsl $$42 = this.dR().a_($$41);
                           exa $$43;
                           if (!($$43 = $$42.b(this.dR(), $$41, $$16)).c()) {
                              $$36 = (float)$$43.c(jf.a.b) + (float)$$41.v();
                              if ((double)$$36 - this.dy() > (double)$$21) {
                                 return;
                              }
                           }

                           if ($$40 > 1) {
                              $$17 = $$17.c();
                              dsl $$44 = this.dR().a_($$17);
                              if (!$$44.b(this.dR(), $$17, $$16).c()) {
                                 return;
                              }
                           }
                        }
                        break;
                     }
                  }

                  if ($$36 != Float.MIN_VALUE) {
                     float $$45 = (float)((double)$$36 - this.dy());
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
   protected boolean d(ewh $$0) {
      float $$1 = this.dH() * (float) (Math.PI / 180.0);
      double $$2 = (double)ayg.a($$1);
      double $$3 = (double)ayg.b($$1);
      double $$4 = (double)this.bp * $$3 - (double)this.br * $$2;
      double $$5 = (double)this.br * $$3 + (double)this.bp * $$2;
      double $$6 = ayg.k($$4) + ayg.k($$5);
      double $$7 = ayg.k($$0.c) + ayg.k($$0.e);
      if (!($$6 < 1.0E-5F) && !($$7 < 1.0E-5F)) {
         double $$8 = $$4 * $$0.c + $$5 * $$0.e;
         double $$9 = Math.acos($$8 / Math.sqrt($$6 * $$7));
         return $$9 < 0.13962634F;
      } else {
         return false;
      }
   }

   private boolean I() {
      return this.C() && this.dm <= 0 && this.aG() && !this.fR() && !this.bT() && this.J() && (double)this.aO() >= 1.0;
   }

   private boolean J() {
      ewg $$0 = this.cC.a();
      return $$0.i != 0.0F || $$0.j != 0.0F;
   }

   private boolean L() {
      return !this.cd() && this.N() && this.O() && !this.ft() && !this.b(brr.o) && (!this.bT() || this.d(this.de())) && !this.fC();
   }

   private boolean d(bsh $$0) {
      return $$0.dK() && $$0.dc();
   }

   private boolean N() {
      double $$0 = 0.8;
      return this.bl() ? this.cC.b() : (double)this.cC.b >= 0.8;
   }

   private boolean O() {
      return this.bT() || (float)this.gk().a() > 6.0F || this.gb().c;
   }

   public float D() {
      if (!this.a(awc.a)) {
         return 0.0F;
      } else {
         float $$0 = 600.0F;
         float $$1 = 100.0F;
         if ((float)this.do >= 600.0F) {
            return 1.0F;
         } else {
            float $$2 = ayg.a((float)this.do / 100.0F, 0.0F, 1.0F);
            float $$3 = (float)this.do < 100.0F ? 0.0F : ayg.a(((float)this.do - 100.0F) / 500.0F, 0.0F, 1.0F);
            return $$2 * 0.6F + $$3 * 0.39999998F;
         }
      }
   }

   public void a(dcd $$0) {
      if ($$0 == dcd.d) {
         this.j(this.du().a(jf.a.b, 0.0));
      }
   }

   @Override
   public boolean bl() {
      return this.cq;
   }

   @Override
   protected boolean fS() {
      boolean $$0 = this.cq;
      boolean $$1 = super.fS();
      if (this.N_()) {
         return this.cq;
      } else {
         if (!$$0 && $$1) {
            this.dR().a(this.dw(), this.dy(), this.dC(), avh.x, avi.i, 1.0F, 1.0F, false);
            this.cD.aj().a((gte)(new gth.b(this)));
         }

         if ($$0 && !$$1) {
            this.dR().a(this.dw(), this.dy(), this.dC(), avh.y, avi.i, 1.0F, 1.0F, false);
         }

         return this.cq;
      }
   }

   @Override
   public ewh r(float $$0) {
      if (this.cD.m.aA().a()) {
         float $$1 = ayg.i($$0 * 0.5F, this.dH(), this.O) * (float) (Math.PI / 180.0);
         float $$2 = ayg.i($$0 * 0.5F, this.dJ(), this.P) * (float) (Math.PI / 180.0);
         double $$3 = this.fs() == bsw.b ? -1.0 : 1.0;
         ewh $$4 = new ewh(0.39 * $$3, -0.6, 0.3);
         return $$4.a(-$$2).b(-$$1).e(this.k($$0));
      } else {
         return super.r($$0);
      }
   }

   @Override
   public void a(cud $$0, cud $$1, cpr $$2) {
      this.cD.ax().a($$0, $$1, $$2);
   }

   @Override
   public float dI() {
      return this.dH();
   }
}
