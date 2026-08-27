import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gei extends gef {
   public static final Logger g = LogUtils.getLogger();
   private static final int cY = 20;
   private static final int cZ = 600;
   private static final int da = 100;
   private static final float db = 0.6F;
   private static final double dc = 0.35;
   private static final double dd = 0.13962634F;
   private static final float de = 0.3F;
   public final fzo h;
   private final awa df;
   private final ffw dg;
   private final List<gtw> dh = Lists.newArrayList();
   private int di = 0;
   private double dj;
   private double dk;
   private double dl;
   private float dm;
   private float dn;
   private boolean do;
   private boolean dp;
   private boolean dq;
   private boolean dr;
   private int ds;
   private boolean dt;
   public geg i;
   protected final fgj cQ;
   protected int cR;
   public float cS;
   public float cT;
   public float cU;
   public float cV;
   private int du;
   private float dv;
   public float cW;
   public float cX;
   private boolean dw;
   @Nullable
   private bpz dx;
   private boolean dy;
   private boolean dz = true;
   private int dA;
   private boolean dB;
   private int dC;
   private boolean dD = true;
   private boolean dE = false;

   public gei(fgj $$0, fzn $$1, fzo $$2, awa $$3, ffw $$4, boolean $$5, boolean $$6) {
      super($$1, $$2.p());
      this.cQ = $$0;
      this.h = $$2;
      this.df = $$3;
      this.dg = $$4;
      this.dq = $$5;
      this.dr = $$6;
      this.dh.add(new guo(this, $$0.ak()));
      this.dh.add(new gub(this));
      this.dh.add(new gua(this, $$0.ak(), $$1.G_()));
   }

   @Override
   public boolean a(bqt $$0, float $$1) {
      return false;
   }

   @Override
   public void c(float $$0) {
   }

   @Override
   public boolean a(brv $$0, boolean $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         if ($$0 instanceof cnw) {
            this.cQ.ak().a((gum)(new gug(this, (cnw)$$0, true)));
            this.cQ.ak().a((gum)(new gug(this, (cnw)$$0, false)));
         }

         return true;
      }
   }

   @Override
   public void bN() {
      super.bN();
      this.dy = false;
   }

   @Override
   public float g(float $$0) {
      return this.dM();
   }

   @Override
   public float h(float $$0) {
      return this.bW() ? super.h($$0) : this.dK();
   }

   @Override
   public void l() {
      if (this.dU().e(this.dy(), this.dE())) {
         super.l();
         if (this.bW()) {
            this.h.b(new ahi.c(this.dK(), this.dM(), this.aE()));
            this.h.b(new ahq(this.bz, this.bB, this.i.g, this.i.h));
            brv $$0 = this.de();
            if ($$0 != this && $$0.df()) {
               this.h.b(new ahj($$0));
               this.G();
            }
         } else {
            this.F();
         }

         for (gtw $$1 : this.dh) {
            $$1.a();
         }
      }
   }

   public float d() {
      for (gtw $$0 : this.dh) {
         if ($$0 instanceof gua) {
            return ((gua)$$0).b();
         }
      }

      return 0.0F;
   }

   private void F() {
      this.G();
      boolean $$0 = this.ca();
      if ($$0 != this.dq) {
         ahp.a $$1 = $$0 ? ahp.a.a : ahp.a.b;
         this.h.b(new ahp(this, $$1));
         this.dq = $$0;
      }

      if (this.x()) {
         double $$2 = this.dz() - this.dj;
         double $$3 = this.dB() - this.dk;
         double $$4 = this.dF() - this.dl;
         double $$5 = (double)(this.dK() - this.dm);
         double $$6 = (double)(this.dM() - this.dn);
         this.ds++;
         boolean $$7 = aym.f($$2, $$3, $$4) > aym.k(2.0E-4) || this.ds >= 20;
         boolean $$8 = $$5 != 0.0 || $$6 != 0.0;
         if (this.bW()) {
            ewu $$9 = this.dx();
            this.h.b(new ahi.b($$9.c, -999.0, $$9.e, this.dK(), this.dM(), this.aE()));
            $$7 = false;
         } else if ($$7 && $$8) {
            this.h.b(new ahi.b(this.dz(), this.dB(), this.dF(), this.dK(), this.dM(), this.aE()));
         } else if ($$7) {
            this.h.b(new ahi.a(this.dz(), this.dB(), this.dF(), this.aE()));
         } else if ($$8) {
            this.h.b(new ahi.c(this.dK(), this.dM(), this.aE()));
         } else if (this.do != this.aE()) {
            this.h.b(new ahi.d(this.aE()));
         }

         if ($$7) {
            this.dj = this.dz();
            this.dk = this.dB();
            this.dl = this.dF();
            this.ds = 0;
         }

         if ($$8) {
            this.dm = this.dK();
            this.dn = this.dM();
         }

         this.do = this.aE();
         this.dz = this.cQ.m.H().c();
      }
   }

   private void G() {
      boolean $$0 = this.cg();
      if ($$0 != this.dr) {
         ahp.a $$1 = $$0 ? ahp.a.d : ahp.a.e;
         this.h.b(new ahp(this, $$1));
         this.dr = $$0;
      }
   }

   public boolean a(boolean $$0) {
      aho.a $$1 = $$0 ? aho.a.d : aho.a.e;
      cuh $$2 = this.gl().a($$0);
      this.h.b(new aho($$1, ir.c, iw.a));
      return !$$2.d();
   }

   @Override
   public void a(bpz $$0) {
      super.a($$0);
      this.h.b(new aie($$0));
   }

   @Override
   public void gj() {
      this.h.b(new agv(agv.a.a));
      fgh.c();
   }

   @Override
   protected void f(bqt $$0, float $$1) {
      if (!this.b($$0)) {
         this.t(this.eI() - $$1);
      }
   }

   @Override
   public void t() {
      this.h.b(new aha(this.cq.j));
      this.e();
   }

   public void e() {
      super.t();
      this.cQ.a(null);
   }

   public void F(float $$0) {
      if (this.dt) {
         float $$1 = this.eI() - $$0;
         if ($$1 <= 0.0F) {
            this.t($$0);
            if ($$1 < 0.0F) {
               this.aq = 10;
            }
         } else {
            this.bx = $$1;
            this.aq = 20;
            this.t($$0);
            this.ba = 10;
            this.aZ = this.ba;
         }
      } else {
         this.t($$0);
         this.dt = true;
      }
   }

   @Override
   public void A() {
      this.h.b(new ahn(this.gm()));
   }

   @Override
   public boolean g() {
      return true;
   }

   @Override
   public boolean fM() {
      return !this.gm().b && super.fM();
   }

   @Override
   public boolean bu() {
      return !this.gm().b && super.bu();
   }

   @Override
   public boolean ee() {
      return !this.gm().b && super.ee();
   }

   protected void h() {
      this.h.b(new ahp(this, ahp.a.f, aym.d(this.r() * 100.0F)));
   }

   public void i() {
      this.h.b(new ahp(this, ahp.a.h));
   }

   public awa j() {
      return this.df;
   }

   public ffw m() {
      return this.dg;
   }

   public void a(czc<?> $$0) {
      if (this.dg.d($$0)) {
         this.dg.e($$0);
         this.h.b(new ahs($$0));
      }
   }

   @Override
   protected int H() {
      return this.di;
   }

   public void a(int $$0) {
      this.di = $$0;
   }

   @Override
   public void a(xe $$0, boolean $$1) {
      this.cQ.ba().a($$0, $$1);
   }

   private void c(double $$0, double $$1) {
      ir $$2 = ir.a($$0, this.dB(), $$1);
      if (this.d($$2)) {
         double $$3 = $$0 - (double)$$2.u();
         double $$4 = $$1 - (double)$$2.w();
         iw $$5 = null;
         double $$6 = Double.MAX_VALUE;
         iw[] $$7 = new iw[]{iw.e, iw.f, iw.c, iw.d};

         for (iw $$8 : $$7) {
            double $$9 = $$8.o().a($$3, 0.0, $$4);
            double $$10 = $$8.f() == iw.b.a ? 1.0 - $$9 : $$9;
            if ($$10 < $$6 && !this.d($$2.a($$8))) {
               $$6 = $$10;
               $$5 = $$8;
            }
         }

         if ($$5 != null) {
            ewu $$11 = this.dx();
            if ($$5.o() == iw.a.a) {
               this.o(0.1 * (double)$$5.j(), $$11.d, $$11.e);
            } else {
               this.o($$11.c, $$11.d, 0.1 * (double)$$5.l());
            }
         }
      }
   }

   private boolean d(ir $$0) {
      ewp $$1 = this.cP();
      ewp $$2 = new ewp((double)$$0.u(), $$1.b, (double)$$0.w(), (double)$$0.u() + 1.0, $$1.e, (double)$$0.w() + 1.0).h(1.0E-7);
      return this.dU().f(this, $$2);
   }

   public void a(float $$0, int $$1, int $$2) {
      this.cG = $$0;
      this.cF = $$1;
      this.cE = $$2;
   }

   @Override
   public void a(xe $$0) {
      this.cQ.l.d().a($$0);
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
      this.dD = $$0;
   }

   public boolean o() {
      return this.dD;
   }

   public void v(boolean $$0) {
      this.dE = $$0;
   }

   public boolean p() {
      return this.dE;
   }

   @Override
   public void a(avn $$0, float $$1, float $$2) {
      this.dU().a(this.dz(), this.dB(), this.dF(), $$0, this.dj(), $$1, $$2, false);
   }

   @Override
   public void a(avn $$0, avq $$1, float $$2, float $$3) {
      this.dU().a(this.dz(), this.dB(), this.dF(), $$0, $$1, $$2, $$3, false);
   }

   @Override
   public boolean dg() {
      return true;
   }

   @Override
   public void c(bpz $$0) {
      cuh $$1 = this.b($$0);
      if (!$$1.d() && !this.fE()) {
         super.c($$0);
         this.dw = true;
         this.dx = $$0;
      }
   }

   @Override
   public boolean fE() {
      return this.dw;
   }

   @Override
   public void fK() {
      super.fK();
      this.dw = false;
   }

   @Override
   public bpz fF() {
      return Objects.requireNonNullElse(this.dx, bpz.a);
   }

   @Override
   public void a(ajy<?> $$0) {
      super.a($$0);
      if (aP.equals($$0)) {
         boolean $$1 = (this.as.a(aP) & 1) > 0;
         bpz $$2 = (this.as.a(aP) & 2) > 0 ? bpz.b : bpz.a;
         if ($$1 && !this.dw) {
            this.c($$2);
         } else if (!$$1 && this.dw) {
            this.fK();
         }
      }

      if (at.equals($$0) && this.fN() && !this.dB) {
         this.cQ.ak().a((gum)(new guc(this)));
      }
   }

   @Nullable
   public bsy q() {
      if (this.di() instanceof bsy $$0 && $$0.a()) {
         return $$0;
      }

      return null;
   }

   public float r() {
      return this.dv;
   }

   @Override
   public boolean aa() {
      return this.cQ.aT();
   }

   @Override
   public void a(drr $$0, boolean $$1) {
      if ($$0 instanceof dra $$2) {
         this.cQ.a(new fql($$2, $$1, this.cQ.aT()));
      } else {
         this.cQ.a(new fra($$0, $$1, this.cQ.aT()));
      }
   }

   @Override
   public void a(dbb $$0) {
      this.cQ.a(new fqv($$0));
   }

   @Override
   public void a(dqm $$0) {
      this.cQ.a(new fpx($$0));
   }

   @Override
   public void a(drw $$0) {
      this.cQ.a(new fre($$0));
   }

   @Override
   public void a(dre $$0) {
      this.cQ.a(new fqq($$0));
   }

   @Override
   public void a(cuh $$0, bpz $$1) {
      if ($$0.a(cuk.vB)) {
         this.cQ.a(new fpt(this, $$0, $$1));
      }
   }

   @Override
   public void b(brv $$0) {
      this.cQ.g.a($$0, lb.f);
   }

   @Override
   public void c(brv $$0) {
      this.cQ.g.a($$0, lb.r);
   }

   @Override
   public boolean ca() {
      return this.i != null && this.i.h;
   }

   @Override
   public boolean cf() {
      return this.dp;
   }

   @Override
   public boolean w() {
      return this.cf() || this.cj();
   }

   @Override
   public void fz() {
      super.fz();
      if (this.x()) {
         this.bz = this.i.a;
         this.bB = this.i.b;
         this.by = this.i.g;
         this.cU = this.cS;
         this.cV = this.cT;
         this.cT = this.cT + (this.dM() - this.cT) * 0.5F;
         this.cS = this.cS + (this.dK() - this.cS) * 0.5F;
      }
   }

   protected boolean x() {
      return this.cQ.ao() == this;
   }

   @Override
   public void y() {
      this.b(bsz.a);
      if (this.dU() != null) {
         for (double $$0 = this.dB(); $$0 > (double)this.dU().J_() && $$0 < (double)this.dU().am(); $$0++) {
            this.a_(this.dz(), $$0, this.dF());
            if (this.dU().g(this)) {
               break;
            }
         }

         this.g(ewu.b);
         this.s(0.0F);
      }

      this.t(this.eZ());
      this.bb = 0;
   }

   @Override
   public void m_() {
      if (this.cR > 0) {
         this.cR--;
      }

      if (!(this.cQ.y instanceof fol)) {
         this.I();
      }

      boolean $$0 = this.i.g;
      boolean $$1 = this.i.h;
      boolean $$2 = this.O();
      this.dp = !this.gm().b && !this.ch() && !this.bW() && this.h(bsz.f) && (this.ca() || !this.fU() && !this.h(bsz.a));
      float $$3 = aym.a(0.3F + dae.b(this), 0.0F, 1.0F);
      this.i.a(this.w(), $$3);
      this.cQ.aB().a(this.i);
      if (this.fE() && !this.bW()) {
         this.i.a *= 0.2F;
         this.i.b *= 0.2F;
         this.cR = 0;
      }

      boolean $$4 = false;
      if (this.dA > 0) {
         this.dA--;
         $$4 = true;
         this.i.g = true;
      }

      if (!this.ah) {
         this.c(this.dz() - (double)this.do() * 0.35, this.dF() + (double)this.do() * 0.35);
         this.c(this.dz() - (double)this.do() * 0.35, this.dF() - (double)this.do() * 0.35);
         this.c(this.dz() + (double)this.do() * 0.35, this.dF() - (double)this.do() * 0.35);
         this.c(this.dz() + (double)this.do() * 0.35, this.dF() + (double)this.do() * 0.35);
      }

      if ($$1) {
         this.cR = 0;
      }

      boolean $$5 = this.M();
      boolean $$6 = this.bW() ? this.dh().aE() : this.aE();
      boolean $$7 = !$$1 && !$$2;
      if (($$6 || this.bn()) && $$7 && $$5) {
         if (this.cR <= 0 && !this.cQ.m.D.e()) {
            this.cR = 7;
         } else {
            this.h(true);
         }
      }

      if ((!this.bi() || this.bn()) && $$5 && this.cQ.m.D.e()) {
         this.h(true);
      }

      if (this.cg()) {
         boolean $$8 = !this.i.b() || !this.P();
         boolean $$9 = $$8 || this.R && !this.U || this.bi() && !this.bn();
         if (this.ch()) {
            if (!this.aE() && !this.i.h && $$8 || !this.bi()) {
               this.h(false);
            }
         } else if ($$9) {
            this.h(false);
         }
      }

      boolean $$10 = false;
      if (this.gm().c) {
         if (this.cQ.q.h()) {
            if (!this.gm().b) {
               this.gm().b = true;
               $$10 = true;
               this.A();
            }
         } else if (!$$0 && this.i.g && !$$4) {
            if (this.cs == 0) {
               this.cs = 7;
            } else if (!this.ch()) {
               this.gm().b = !this.gm().b;
               $$10 = true;
               this.A();
               this.cs = 0;
            }
         }
      }

      if (this.i.g && !$$10 && !$$0 && !this.gm().b && !this.bW() && !this.p_()) {
         cuh $$11 = this.d(bsc.e);
         if (($$11.a(cuk.pj) || $$11.a(cuk.At)) && ctb.j($$11) && this.gs()) {
            this.h.b(new ahp(this, ahp.a.i));
         }
      }

      this.dB = this.fN();
      if (this.bi() && this.i.h && this.en()) {
         this.ft();
      }

      if (this.a(awj.a)) {
         int $$12 = this.O_() ? 10 : 1;
         this.dC = aym.a(this.dC + $$12, 0, 600);
      } else if (this.dC > 0) {
         this.a(awj.a);
         this.dC = aym.a(this.dC - 10, 0, 600);
      }

      if (this.gm().b && this.x()) {
         int $$13 = 0;
         if (this.i.h) {
            $$13--;
         }

         if (this.i.g) {
            $$13++;
         }

         if ($$13 != 0) {
            this.g(this.dx().b(0.0, (double)((float)$$13 * this.gm().a() * 3.0F), 0.0));
         }
      }

      bsy $$14 = this.q();
      if ($$14 != null && $$14.c() == 0) {
         if (this.du < 0) {
            this.du++;
            if (this.du == 0) {
               this.dv = 0.0F;
            }
         }

         if ($$0 && !this.i.g) {
            this.du = -10;
            $$14.b(aym.d(this.r() * 100.0F));
            this.h();
         } else if (!$$0 && this.i.g) {
            this.du = 0;
            this.dv = 0.0F;
         } else if ($$0) {
            this.du++;
            if (this.du < 10) {
               this.dv = (float)this.du * 0.1F;
            } else {
               this.dv = 0.8F + 2.0F / (float)(this.du - 9) * 0.1F;
            }
         }
      } else {
         this.dv = 0.0F;
      }

      super.m_();
      if (this.aE() && this.gm().b && !this.cQ.q.h()) {
         this.gm().b = false;
         this.A();
      }
   }

   @Override
   protected void eo() {
      this.bb++;
      if (this.bb == 20) {
         this.a(brv.d.a);
      }
   }

   private void I() {
      this.cX = this.cW;
      float $$0 = 0.0F;
      if (this.aA) {
         if (this.cQ.y != null && !this.cQ.y.k() && !(this.cQ.y instanceof fnk)) {
            if (this.cQ.y instanceof fpn) {
               this.t();
            }

            this.cQ.a(null);
         }

         if (this.cW == 0.0F) {
            this.cQ.ak().a(guh.b(avo.ve, this.al.i() * 0.4F + 0.8F, 0.25F));
         }

         $$0 = 0.0125F;
         this.aA = false;
      } else if (this.b(brj.i) && !this.c(brj.i).a(60)) {
         $$0 = 0.006666667F;
      } else if (this.cW > 0.0F) {
         $$0 = -0.05F;
      }

      this.cW = aym.a(this.cW + $$0, 0.0F, 1.0F);
      this.N();
   }

   @Override
   public void v() {
      super.v();
      this.dy = false;
      if (this.di() instanceof cny $$0) {
         $$0.a(this.i.e, this.i.f, this.i.c, this.i.d);
         this.dy = this.dy | (this.i.e || this.i.f || this.i.c || this.i.d);
      }
   }

   public boolean B() {
      return this.dy;
   }

   @Nullable
   @Override
   public brh d(ja<brf> $$0) {
      if ($$0.a(brj.i)) {
         this.cX = 0.0F;
         this.cW = 0.0F;
      }

      return super.d($$0);
   }

   @Override
   public void a(bst $$0, ewu $$1) {
      double $$2 = this.dz();
      double $$3 = this.dF();
      super.a($$0, $$1);
      this.f((float)(this.dz() - $$2), (float)(this.dF() - $$3));
   }

   public boolean C() {
      return this.dz;
   }

   protected void f(float $$0, float $$1) {
      if (this.J()) {
         ewu $$2 = this.ds();
         ewu $$3 = $$2.b((double)$$0, 0.0, (double)$$1);
         ewu $$4 = new ewu((double)$$0, 0.0, (double)$$1);
         float $$5 = this.fw();
         float $$6 = (float)$$4.g();
         if ($$6 <= 0.001F) {
            ewt $$7 = this.i.a();
            float $$8 = $$5 * $$7.i;
            float $$9 = $$5 * $$7.j;
            float $$10 = aym.a(this.dK() * (float) (Math.PI / 180.0));
            float $$11 = aym.b(this.dK() * (float) (Math.PI / 180.0));
            $$4 = new ewu((double)($$8 * $$11 - $$9 * $$10), $$4.d, (double)($$9 * $$11 + $$8 * $$10));
            $$6 = (float)$$4.g();
            if ($$6 <= 0.001F) {
               return;
            }
         }

         float $$12 = aym.i($$6);
         ewu $$13 = $$4.a((double)$$12);
         ewu $$14 = this.bS();
         float $$15 = (float)($$14.c * $$13.c + $$14.e * $$13.e);
         if (!($$15 < -0.15F)) {
            ewz $$16 = ewz.a(this);
            ir $$17 = ir.a(this.dz(), this.cP().e, this.dF());
            dtc $$18 = this.dU().a_($$17);
            if ($$18.b(this.dU(), $$17, $$16).c()) {
               $$17 = $$17.c();
               dtc $$19 = this.dU().a_($$17);
               if ($$19.b(this.dU(), $$17, $$16).c()) {
                  float $$20 = 7.0F;
                  float $$21 = 1.2F;
                  if (this.b(brj.h)) {
                     $$21 += (float)(this.c(brj.h).e() + 1) * 0.75F;
                  }

                  float $$22 = Math.max($$5 * 7.0F, 1.0F / $$12);
                  ewu $$24 = $$3.e($$13.a((double)$$22));
                  float $$25 = this.do();
                  float $$26 = this.dp();
                  ewp $$27 = new ewp($$2, $$24.b(0.0, (double)$$26, 0.0)).c((double)$$25, 0.0, (double)$$25);
                  ewu $$23 = $$2.b(0.0, 0.51F, 0.0);
                  $$24 = $$24.b(0.0, 0.51F, 0.0);
                  ewu $$28 = $$13.c(new ewu(0.0, 1.0, 0.0));
                  ewu $$29 = $$28.a((double)($$25 * 0.5F));
                  ewu $$30 = $$23.d($$29);
                  ewu $$31 = $$24.d($$29);
                  ewu $$32 = $$23.e($$29);
                  ewu $$33 = $$24.e($$29);
                  Iterable<exn> $$34 = this.dU().d(this, $$27);
                  Iterator<ewp> $$35 = StreamSupport.stream($$34.spliterator(), false).flatMap($$0x -> $$0x.e().stream()).iterator();
                  float $$36 = Float.MIN_VALUE;

                  while ($$35.hasNext()) {
                     ewp $$37 = $$35.next();
                     if ($$37.a($$30, $$31) || $$37.a($$32, $$33)) {
                        $$36 = (float)$$37.e;
                        ewu $$38 = $$37.f();
                        ir $$39 = ir.a($$38);

                        for (int $$40 = 1; (float)$$40 < $$21; $$40++) {
                           ir $$41 = $$39.b($$40);
                           dtc $$42 = this.dU().a_($$41);
                           exn $$43;
                           if (!($$43 = $$42.b(this.dU(), $$41, $$16)).c()) {
                              $$36 = (float)$$43.c(iw.a.b) + (float)$$41.v();
                              if ((double)$$36 - this.dB() > (double)$$21) {
                                 return;
                              }
                           }

                           if ($$40 > 1) {
                              $$17 = $$17.c();
                              dtc $$44 = this.dU().a_($$17);
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
                        this.dA = 1;
                     }
                  }
               }
            }
         }
      }
   }

   @Override
   protected boolean c(ewu $$0) {
      float $$1 = this.dK() * (float) (Math.PI / 180.0);
      double $$2 = (double)aym.a($$1);
      double $$3 = (double)aym.b($$1);
      double $$4 = (double)this.bz * $$3 - (double)this.bB * $$2;
      double $$5 = (double)this.bB * $$3 + (double)this.bz * $$2;
      double $$6 = aym.k($$4) + aym.k($$5);
      double $$7 = aym.k($$0.c) + aym.k($$0.e);
      if (!($$6 < 1.0E-5F) && !($$7 < 1.0E-5F)) {
         double $$8 = $$4 * $$0.c + $$5 * $$0.e;
         double $$9 = Math.acos($$8 / Math.sqrt($$6 * $$7));
         return $$9 < 0.13962634F;
      } else {
         return false;
      }
   }

   private boolean J() {
      return this.C() && this.dA <= 0 && this.aE() && !this.gc() && !this.bW() && this.K() && (double)this.aP() >= 1.0;
   }

   private boolean K() {
      ewt $$0 = this.i.a();
      return $$0.i != 0.0F || $$0.j != 0.0F;
   }

   private boolean M() {
      return !this.cg() && this.O() && this.P() && !this.fE() && !this.b(brj.o) && (!this.bW() || this.d(this.dh())) && !this.fN();
   }

   private boolean d(brv $$0) {
      return $$0.dN() && $$0.df();
   }

   private boolean O() {
      double $$0 = 0.8;
      return this.bn() ? this.i.b() : (double)this.i.b >= 0.8;
   }

   private boolean P() {
      return this.bW() || (float)this.gx().a() > 6.0F || this.gm().c;
   }

   public float D() {
      if (!this.a(awj.a)) {
         return 0.0F;
      } else {
         float $$0 = 600.0F;
         float $$1 = 100.0F;
         if ((float)this.dC >= 600.0F) {
            return 1.0F;
         } else {
            float $$2 = aym.a((float)this.dC / 100.0F, 0.0F, 1.0F);
            float $$3 = (float)this.dC < 100.0F ? 0.0F : aym.a(((float)this.dC - 100.0F) / 500.0F, 0.0F, 1.0F);
            return $$2 * 0.6F + $$3 * 0.39999998F;
         }
      }
   }

   public void a(dbx $$0) {
      if ($$0 == dbx.d) {
         this.g(this.dx().a(iw.a.b, 0.0));
      }
   }

   @Override
   public boolean bn() {
      return this.cD;
   }

   @Override
   protected boolean gd() {
      boolean $$0 = this.cD;
      boolean $$1 = super.gd();
      if (this.O_()) {
         return this.cD;
      } else {
         if (!$$0 && $$1) {
            this.dU().a(this.dz(), this.dB(), this.dF(), avo.C, avq.i, 1.0F, 1.0F, false);
            this.cQ.ak().a((gum)(new gup.b(this)));
         }

         if ($$0 && !$$1) {
            this.dU().a(this.dz(), this.dB(), this.dF(), avo.D, avq.i, 1.0F, 1.0F, false);
         }

         return this.cD;
      }
   }

   @Override
   public ewu q(float $$0) {
      if (this.cQ.m.aA().a()) {
         float $$1 = aym.i($$0 * 0.5F, this.dK(), this.P) * (float) (Math.PI / 180.0);
         float $$2 = aym.i($$0 * 0.5F, this.dM(), this.Q) * (float) (Math.PI / 180.0);
         double $$3 = this.fD() == bsi.b ? -1.0 : 1.0;
         ewu $$4 = new ewu(0.39 * $$3, -0.6, 0.3);
         return $$4.a(-$$2).b(-$$1).e(this.j($$0));
      } else {
         return super.q($$0);
      }
   }

   @Override
   public void a(cuh $$0, cuh $$1, cpo $$2) {
      this.cQ.aB().a($$0, $$1, $$2);
   }

   @Override
   public float dL() {
      return this.dK();
   }

   public String E() {
      return this.as.a(ck);
   }
}
