import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public abstract class fzh<T extends cvf> extends fys implements gan<T> {
   public static final alg a = alg.b("textures/gui/container/inventory.png");
   private static final alg G = alg.b("container/slot_highlight_back");
   private static final alg H = alg.b("container/slot_highlight_front");
   protected static final int b = 256;
   protected static final int c = 256;
   private static final float I = 100.0F;
   private static final int J = 500;
   public static final int d = 100;
   private static final int K = 200;
   protected int s = 176;
   protected int u = 166;
   protected int v;
   protected int w;
   protected int x;
   protected int y;
   private final List<fso> L;
   protected final T z;
   protected final wy A;
   @Nullable
   protected cxc B;
   @Nullable
   private cxc M;
   @Nullable
   private cxc N;
   @Nullable
   private cxc O;
   @Nullable
   private cxc P;
   protected int C;
   protected int D;
   private boolean Q;
   private czn R = czn.k;
   private int S;
   private int T;
   private long U;
   private czn V = czn.k;
   private long W;
   protected final Set<cxc> E = Sets.newHashSet();
   protected boolean F;
   private int X;
   private int Y;
   private boolean Z;
   private int aa;
   private long ab;
   private int ac;
   private boolean ad;
   private czn ae = czn.k;

   public fzh(T $$0, crl $$1, wy $$2) {
      super($$2);
      this.z = $$0;
      this.A = $$1.m_();
      this.Z = true;
      this.v = 8;
      this.w = 6;
      this.x = 8;
      this.y = this.u - 94;
      this.L = new ArrayList<>();
   }

   @Override
   protected void aO_() {
      this.C = (this.n - this.s) / 2;
      this.D = (this.o - this.u) / 2;
      this.L.clear();
      this.a(new fsi(this.m));
   }

   protected void a(fso $$0) {
      this.L.add($$0);
   }

   @Override
   public void a(fsm $$0, int $$1, int $$2, float $$3) {
      int $$4 = this.C;
      int $$5 = this.D;
      super.a($$0, $$1, $$2, $$3);
      $$0.c().a();
      $$0.c().a((float)$$4, (float)$$5, 0.0F);
      cxc $$6 = this.B;
      this.B = this.b((double)$$1, (double)$$2);
      this.d($$0);
      this.c($$0);
      this.e($$0);
      if ($$6 != null && $$6 != this.B) {
         this.a($$6);
      }

      this.b($$0, $$1, $$2);
      czn $$7 = this.R.f() ? this.z.g() : this.R;
      if (!$$7.f()) {
         int $$8 = 8;
         int $$9 = this.R.f() ? 8 : 16;
         String $$10 = null;
         if (!this.R.f() && this.Q) {
            $$7 = $$7.c(azm.f((float)$$7.M() / 2.0F));
         } else if (this.F && this.E.size() > 1) {
            $$7 = $$7.c(this.aa);
            if ($$7.f()) {
               $$10 = o.o + "0";
            }
         }

         this.a($$0, $$7, $$1 - $$4 - 8, $$2 - $$5 - $$9, $$10);
      }

      if (!this.V.f()) {
         float $$11 = (float)(ag.c() - this.U) / 100.0F;
         if ($$11 >= 1.0F) {
            $$11 = 1.0F;
            this.V = czn.k;
         }

         int $$12 = this.N.e - this.S;
         int $$13 = this.N.f - this.T;
         int $$14 = this.S + (int)((float)$$12 * $$11);
         int $$15 = this.T + (int)((float)$$13 * $$11);
         this.a($$0, this.V, $$14, $$15, null);
      }

      $$0.c().b();
   }

   protected void c(fsm $$0) {
      for (cxc $$1 : this.z.k) {
         if ($$1.b()) {
            this.a($$0, $$1);
         }
      }
   }

   @Override
   public void b(fsm $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
      this.a($$0, $$3, $$1, $$2);
   }

   @Override
   public boolean a(double $$0, double $$1, double $$2, double $$3) {
      if (this.B != null && this.B.h()) {
         for (fso $$4 : this.L) {
            if ($$4.a(this.B) && $$4.a($$2, $$3, this.B.d, this.B.g())) {
               return true;
            }
         }
      }

      return false;
   }

   private void d(fsm $$0) {
      if (this.B != null && this.B.e()) {
         $$0.a(grc::H, G, this.B.e - 4, this.B.f - 4, 24, 24);
      }
   }

   private void e(fsm $$0) {
      if (this.B != null && this.B.e()) {
         $$0.a(grc::F, H, this.B.e - 4, this.B.f - 4, 24, 24);
      }
   }

   protected void a(fsm $$0, int $$1, int $$2) {
      if (this.B != null && this.B.h()) {
         czn $$3 = this.B.g();
         if (this.z.g().f() || this.b($$3)) {
            $$0.a(this.p, this.a($$3), $$3.b(), $$1, $$2, $$3.a(kk.G));
         }
      }
   }

   private boolean b(czn $$0) {
      return $$0.b().map(gbe::a).map(gbe::a).orElse(false);
   }

   protected List<wy> a(czn $$0) {
      return a(this.m, $$0);
   }

   private void a(fsm $$0, czn $$1, int $$2, int $$3, @Nullable String $$4) {
      $$0.c().a();
      $$0.c().a(0.0F, 0.0F, 232.0F);
      $$0.a($$1, $$2, $$3);
      $$0.a(this.p, $$1, $$2, $$3 - (this.R.f() ? 0 : 8), $$4);
      $$0.c().b();
   }

   protected void b(fsm $$0, int $$1, int $$2) {
      $$0.a(this.p, this.l, this.v, this.w, 4210752, false);
      $$0.a(this.p, this.A, this.x, this.y, 4210752, false);
   }

   protected abstract void a(fsm var1, float var2, int var3, int var4);

   protected void a(fsm $$0, cxc $$1) {
      int $$2 = $$1.e;
      int $$3 = $$1.f;
      czn $$4 = $$1.g();
      boolean $$5 = false;
      boolean $$6 = $$1 == this.M && !this.R.f() && !this.Q;
      czn $$7 = this.z.g();
      String $$8 = null;
      if ($$1 == this.M && !this.R.f() && this.Q && !$$4.f()) {
         $$4 = $$4.c($$4.M() / 2);
      } else if (this.F && this.E.contains($$1) && !$$7.f()) {
         if (this.E.size() == 1) {
            return;
         }

         if (cvf.a($$1, $$7, true) && this.z.b($$1)) {
            $$5 = true;
            int $$9 = Math.min($$7.k(), $$1.b_($$7));
            int $$10 = $$1.g().f() ? 0 : $$1.g().M();
            int $$11 = cvf.a(this.E, this.X, $$7) + $$10;
            if ($$11 > $$9) {
               $$11 = $$9;
               $$8 = o.o.toString() + $$9;
            }

            $$4 = $$7.c($$11);
         } else {
            this.E.remove($$1);
            this.G();
         }
      }

      $$0.c().a();
      $$0.c().a(0.0F, 0.0F, 100.0F);
      if ($$4.f() && $$1.b()) {
         alg $$12 = $$1.c();
         if ($$12 != null) {
            $$0.a(grc::H, $$12, $$2, $$3, 16, 16);
            $$6 = true;
         }
      }

      if (!$$6) {
         if ($$5) {
            $$0.a($$2, $$3, $$2 + 16, $$3 + 16, -2130706433);
         }

         int $$13 = $$1.e + $$1.f * this.s;
         if ($$1.f()) {
            $$0.b($$4, $$2, $$3, $$13);
         } else {
            $$0.a($$4, $$2, $$3, $$13);
         }

         $$0.a(this.p, $$4, $$2, $$3, $$8);
      }

      $$0.c().b();
   }

   private void G() {
      czn $$0 = this.z.g();
      if (!$$0.f() && this.F) {
         if (this.X == 2) {
            this.aa = $$0.k();
         } else {
            this.aa = $$0.M();

            for (cxc $$1 : this.E) {
               czn $$2 = $$1.g();
               int $$3 = $$2.f() ? 0 : $$2.M();
               int $$4 = Math.min($$0.k(), $$1.b_($$0));
               int $$5 = Math.min(cvf.a(this.E, this.X, $$0) + $$3, $$4);
               this.aa -= $$5 - $$3;
            }
         }
      }
   }

   @Nullable
   private cxc b(double $$0, double $$1) {
      for (cxc $$2 : this.z.k) {
         if ($$2.b() && this.a($$2, $$0, $$1)) {
            return $$2;
         }
      }

      return null;
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (super.a($$0, $$1, $$2)) {
         return true;
      } else {
         boolean $$3 = this.m.n.H.a($$2) && this.m.t.fU();
         cxc $$4 = this.b($$0, $$1);
         long $$5 = ag.c();
         this.ad = this.P == $$4 && $$5 - this.ab < 250L && this.ac == $$2;
         this.Z = false;
         if ($$2 != 0 && $$2 != 1 && !$$3) {
            this.a($$2);
         } else {
            int $$6 = this.C;
            int $$7 = this.D;
            boolean $$8 = this.a($$0, $$1, $$6, $$7, $$2);
            int $$9 = -1;
            if ($$4 != null) {
               $$9 = $$4.d;
            }

            if ($$8) {
               $$9 = -999;
            }

            if (this.m.n.ac().c() && $$8 && this.z.g().f()) {
               this.aL_();
               return true;
            }

            if ($$9 != -1) {
               if (this.m.n.ac().c()) {
                  if ($$4 != null && $$4.h()) {
                     this.M = $$4;
                     this.R = czn.k;
                     this.Q = $$2 == 1;
                  } else {
                     this.M = null;
                  }
               } else if (!this.F) {
                  if (this.z.g().f()) {
                     if ($$3) {
                        this.a($$4, $$9, $$2, cvq.d);
                     } else {
                        boolean $$10 = $$9 != -999 && (fiu.a(fpt.Q().aO().h(), 340) || fiu.a(fpt.Q().aO().h(), 344));
                        cvq $$11 = cvq.a;
                        if ($$10) {
                           this.ae = $$4 != null && $$4.h() ? $$4.g().v() : czn.k;
                           $$11 = cvq.b;
                        } else if ($$9 == -999) {
                           $$11 = cvq.e;
                        }

                        this.a($$4, $$9, $$2, $$11);
                     }

                     this.Z = true;
                  } else {
                     this.F = true;
                     this.Y = $$2;
                     this.E.clear();
                     if ($$2 == 0) {
                        this.X = 0;
                     } else if ($$2 == 1) {
                        this.X = 1;
                     } else if ($$3) {
                        this.X = 2;
                     }
                  }
               }
            }
         }

         this.P = $$4;
         this.ab = $$5;
         this.ac = $$2;
         return true;
      }
   }

   private void a(int $$0) {
      if (this.B != null && this.z.g().f()) {
         if (this.m.n.D.a($$0)) {
            this.a(this.B, this.B.d, 40, cvq.c);
            return;
         }

         for (int $$1 = 0; $$1 < 9; $$1++) {
            if (this.m.n.S[$$1].a($$0)) {
               this.a(this.B, this.B.d, $$1, cvq.c);
            }
         }
      }
   }

   protected boolean a(double $$0, double $$1, int $$2, int $$3, int $$4) {
      return $$0 < (double)$$2 || $$1 < (double)$$3 || $$0 >= (double)($$2 + this.s) || $$1 >= (double)($$3 + this.u);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2, double $$3, double $$4) {
      cxc $$5 = this.b($$0, $$1);
      czn $$6 = this.z.g();
      if (this.M != null && this.m.n.ac().c()) {
         if ($$2 == 0 || $$2 == 1) {
            if (this.R.f()) {
               if ($$5 != this.M && !this.M.g().f()) {
                  this.R = this.M.g().v();
               }
            } else if (this.R.M() > 1 && $$5 != null && cvf.a($$5, this.R, false)) {
               long $$7 = ag.c();
               if (this.O == $$5) {
                  if ($$7 - this.W > 500L) {
                     this.a(this.M, this.M.d, 0, cvq.a);
                     this.a($$5, $$5.d, 1, cvq.a);
                     this.a(this.M, this.M.d, 0, cvq.a);
                     this.W = $$7 + 750L;
                     this.R.h(1);
                  }
               } else {
                  this.O = $$5;
                  this.W = $$7;
               }
            }
         }
      } else if (this.F && $$5 != null && !$$6.f() && ($$6.M() > this.E.size() || this.X == 2) && cvf.a($$5, $$6, true) && $$5.a($$6) && this.z.b($$5)) {
         this.E.add($$5);
         this.G();
      }

      return true;
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      cxc $$3 = this.b($$0, $$1);
      int $$4 = this.C;
      int $$5 = this.D;
      boolean $$6 = this.a($$0, $$1, $$4, $$5, $$2);
      int $$7 = -1;
      if ($$3 != null) {
         $$7 = $$3.d;
      }

      if ($$6) {
         $$7 = -999;
      }

      if (this.ad && $$3 != null && $$2 == 0 && this.z.a(czn.k, $$3)) {
         if (t()) {
            if (!this.ae.f()) {
               for (cxc $$8 : this.z.k) {
                  if ($$8 != null && $$8.a(this.m.t) && $$8.h() && $$8.c == $$3.c && cvf.a($$8, this.ae, true)) {
                     this.a($$8, $$8.d, $$2, cvq.b);
                  }
               }
            }
         } else {
            this.a($$3, $$7, $$2, cvq.g);
         }

         this.ad = false;
         this.ab = 0L;
      } else {
         if (this.F && this.Y != $$2) {
            this.F = false;
            this.E.clear();
            this.Z = true;
            return true;
         }

         if (this.Z) {
            this.Z = false;
            return true;
         }

         if (this.M != null && this.m.n.ac().c()) {
            if ($$2 == 0 || $$2 == 1) {
               if (this.R.f() && $$3 != this.M) {
                  this.R = this.M.g();
               }

               boolean $$9 = cvf.a($$3, this.R, false);
               if ($$7 != -1 && !this.R.f() && $$9) {
                  this.a(this.M, this.M.d, $$2, cvq.a);
                  this.a($$3, $$7, 0, cvq.a);
                  if (this.z.g().f()) {
                     this.V = czn.k;
                  } else {
                     this.a(this.M, this.M.d, $$2, cvq.a);
                     this.S = azm.a($$0 - (double)$$4);
                     this.T = azm.a($$1 - (double)$$5);
                     this.N = this.M;
                     this.V = this.R;
                     this.U = ag.c();
                  }
               } else if (!this.R.f()) {
                  this.S = azm.a($$0 - (double)$$4);
                  this.T = azm.a($$1 - (double)$$5);
                  this.N = this.M;
                  this.V = this.R;
                  this.U = ag.c();
               }

               this.m();
            }
         } else if (this.F && !this.E.isEmpty()) {
            this.a(null, -999, cvf.c(0, this.X), cvq.f);

            for (cxc $$10 : this.E) {
               this.a($$10, $$10.d, cvf.c(1, this.X), cvq.f);
            }

            this.a(null, -999, cvf.c(2, this.X), cvq.f);
         } else if (!this.z.g().f()) {
            if (this.m.n.H.a($$2)) {
               this.a($$3, $$7, $$2, cvq.d);
            } else {
               boolean $$11 = $$7 != -999 && (fiu.a(fpt.Q().aO().h(), 340) || fiu.a(fpt.Q().aO().h(), 344));
               if ($$11) {
                  this.ae = $$3 != null && $$3.h() ? $$3.g().v() : czn.k;
               }

               this.a($$3, $$7, $$2, $$11 ? cvq.b : cvq.a);
            }
         }
      }

      if (this.z.g().f()) {
         this.ab = 0L;
      }

      this.F = false;
      return true;
   }

   public void m() {
      this.R = czn.k;
      this.M = null;
   }

   private boolean a(cxc $$0, double $$1, double $$2) {
      return this.a($$0.e, $$0.f, 16, 16, $$1, $$2);
   }

   protected boolean a(int $$0, int $$1, int $$2, int $$3, double $$4, double $$5) {
      int $$6 = this.C;
      int $$7 = this.D;
      $$4 -= (double)$$6;
      $$5 -= (double)$$7;
      return $$4 >= (double)($$0 - 1) && $$4 < (double)($$0 + $$2 + 1) && $$5 >= (double)($$1 - 1) && $$5 < (double)($$1 + $$3 + 1);
   }

   private void a(cxc $$0) {
      if ($$0.h()) {
         for (fso $$1 : this.L) {
            if ($$1.a($$0)) {
               $$1.b($$0);
            }
         }
      }
   }

   protected void a(cxc $$0, int $$1, int $$2, cvq $$3) {
      if ($$0 != null) {
         $$1 = $$0.d;
      }

      this.a($$0, $$3);
      this.m.r.a(this.z.l, $$1, $$2, $$3, this.m.t);
   }

   void a(@Nullable cxc $$0, cvq $$1) {
      if ($$0 != null && $$0.h()) {
         for (fso $$2 : this.L) {
            if ($$2.a($$0)) {
               $$2.a($$0, $$1);
            }
         }
      }
   }

   protected void a(int $$0, int $$1, boolean $$2) {
      this.m.r.a($$0, $$1, $$2);
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (super.a($$0, $$1, $$2)) {
         return true;
      } else if (this.m.n.C.a($$0, $$1)) {
         this.aL_();
         return true;
      } else {
         this.a($$0, $$1);
         if (this.B != null && this.B.h()) {
            if (this.m.n.H.a($$0, $$1)) {
               this.a(this.B, this.B.d, 0, cvq.d);
            } else if (this.m.n.E.a($$0, $$1)) {
               this.a(this.B, this.B.d, s() ? 1 : 0, cvq.e);
            }
         }

         return true;
      }
   }

   protected boolean a(int $$0, int $$1) {
      if (this.z.g().f() && this.B != null) {
         if (this.m.n.D.a($$0, $$1)) {
            this.a(this.B, this.B.d, 40, cvq.c);
            return true;
         }

         for (int $$2 = 0; $$2 < 9; $$2++) {
            if (this.m.n.S[$$2].a($$0, $$1)) {
               this.a(this.B, this.B.d, $$2, cvq.c);
               return true;
            }
         }
      }

      return false;
   }

   @Override
   public void aF_() {
      if (this.m.t != null) {
         this.z.a(this.m.t);
      }
   }

   @Override
   public boolean k() {
      return false;
   }

   @Override
   public final void e() {
      super.e();
      if (this.m.t.bI() && !this.m.t.dP()) {
         this.E();
      } else {
         this.m.t.p();
      }
   }

   protected void E() {
   }

   @Override
   public T F() {
      return this.z;
   }

   @Override
   public void aL_() {
      this.m.t.p();
      if (this.B != null) {
         this.a(this.B);
      }

      super.aL_();
   }
}
