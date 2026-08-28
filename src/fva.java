import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

public abstract class fva<T extends csc> extends ful implements fwg<T> {
   public static final akv a = akv.b("textures/gui/container/inventory.png");
   private static final akv G = akv.b("container/slot_highlight_back");
   private static final akv H = akv.b("container/slot_highlight_front");
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
   private final List<fog> L;
   protected final T z;
   protected final wp A;
   @Nullable
   protected ctz B;
   @Nullable
   private ctz M;
   @Nullable
   private ctz N;
   @Nullable
   private ctz O;
   @Nullable
   private ctz P;
   protected int C;
   protected int D;
   private boolean Q;
   private cwp R = cwp.j;
   private int S;
   private int T;
   private long U;
   private cwp V = cwp.j;
   private long W;
   protected final Set<ctz> E = Sets.newHashSet();
   protected boolean F;
   private int X;
   private int Y;
   private boolean Z;
   private int aa;
   private long ab;
   private int ac;
   private boolean ad;
   private cwp ae = cwp.j;

   public fva(T $$0, cow $$1, wp $$2) {
      super($$2);
      this.z = $$0;
      this.A = $$1.p_();
      this.Z = true;
      this.v = 8;
      this.w = 6;
      this.x = 8;
      this.y = this.u - 94;
      this.L = new ArrayList<>();
   }

   @Override
   protected void aR_() {
      this.C = (this.n - this.s) / 2;
      this.D = (this.o - this.u) / 2;
      this.L.clear();
      this.a(new foa(this.m));
   }

   protected void a(fog $$0) {
      this.L.add($$0);
   }

   @Override
   public void a(foe $$0, int $$1, int $$2, float $$3) {
      int $$4 = this.C;
      int $$5 = this.D;
      super.a($$0, $$1, $$2, $$3);
      $$0.c().a();
      $$0.c().a((float)$$4, (float)$$5, 0.0F);
      ctz $$6 = this.B;
      this.B = this.b((double)$$1, (double)$$2);
      this.d($$0);
      this.c($$0);
      this.e($$0);
      if ($$6 != null && $$6 != this.B) {
         this.a($$6);
      }

      this.b($$0, $$1, $$2);
      cwp $$7 = this.R.f() ? this.z.g() : this.R;
      if (!$$7.f()) {
         int $$8 = 8;
         int $$9 = this.R.f() ? 8 : 16;
         String $$10 = null;
         if (!this.R.f() && this.Q) {
            $$7 = $$7.c(ayz.f((float)$$7.M() / 2.0F));
         } else if (this.F && this.E.size() > 1) {
            $$7 = $$7.c(this.aa);
            if ($$7.f()) {
               $$10 = n.o + "0";
            }
         }

         this.a($$0, $$7, $$1 - $$4 - 8, $$2 - $$5 - $$9, $$10);
      }

      if (!this.V.f()) {
         float $$11 = (float)(af.c() - this.U) / 100.0F;
         if ($$11 >= 1.0F) {
            $$11 = 1.0F;
            this.V = cwp.j;
         }

         int $$12 = this.N.e - this.S;
         int $$13 = this.N.f - this.T;
         int $$14 = this.S + (int)((float)$$12 * $$11);
         int $$15 = this.T + (int)((float)$$13 * $$11);
         this.a($$0, this.V, $$14, $$15, null);
      }

      $$0.c().b();
   }

   protected void c(foe $$0) {
      for (ctz $$1 : this.z.k) {
         if ($$1.d()) {
            this.a($$0, $$1);
         }
      }
   }

   @Override
   public void b(foe $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
      this.a($$0, $$3, $$1, $$2);
   }

   @Override
   public boolean a(double $$0, double $$1, double $$2, double $$3) {
      if (this.B != null && this.B.h()) {
         for (fog $$4 : this.L) {
            if ($$4.a(this.B) && $$4.a($$2, $$3, this.B.d, this.B.g())) {
               return true;
            }
         }
      }

      return false;
   }

   private void d(foe $$0) {
      if (this.B != null && this.B.e()) {
         $$0.a(gmi::H, G, this.B.e - 4, this.B.f - 4, 24, 24);
      }
   }

   private void e(foe $$0) {
      if (this.B != null && this.B.e()) {
         $$0.a(gmi::F, H, this.B.e - 4, this.B.f - 4, 24, 24);
      }
   }

   protected void a(foe $$0, int $$1, int $$2) {
      if (this.B != null && this.B.h()) {
         cwp $$3 = this.B.g();
         if (this.z.g().f() || this.b($$3)) {
            $$0.a(this.p, this.a($$3), $$3.b(), $$1, $$2, $$3.a(kv.G));
         }
      }
   }

   private boolean b(cwp $$0) {
      return $$0.b().map(fwv::a).map(fwv::a).orElse(false);
   }

   protected List<wp> a(cwp $$0) {
      return a(this.m, $$0);
   }

   private void a(foe $$0, cwp $$1, int $$2, int $$3, @Nullable String $$4) {
      $$0.c().a();
      $$0.c().a(0.0F, 0.0F, 232.0F);
      $$0.a($$1, $$2, $$3);
      $$0.a(this.p, $$1, $$2, $$3 - (this.R.f() ? 0 : 8), $$4);
      $$0.c().b();
   }

   protected void b(foe $$0, int $$1, int $$2) {
      $$0.a(this.p, this.l, this.v, this.w, 4210752, false);
      $$0.a(this.p, this.A, this.x, this.y, 4210752, false);
   }

   protected abstract void a(foe var1, float var2, int var3, int var4);

   protected void a(foe $$0, ctz $$1) {
      int $$2 = $$1.e;
      int $$3 = $$1.f;
      cwp $$4 = $$1.g();
      boolean $$5 = false;
      boolean $$6 = $$1 == this.M && !this.R.f() && !this.Q;
      cwp $$7 = this.z.g();
      String $$8 = null;
      if ($$1 == this.M && !this.R.f() && this.Q && !$$4.f()) {
         $$4 = $$4.c($$4.M() / 2);
      } else if (this.F && this.E.contains($$1) && !$$7.f()) {
         if (this.E.size() == 1) {
            return;
         }

         if (csc.a($$1, $$7, true) && this.z.b($$1)) {
            $$5 = true;
            int $$9 = Math.min($$7.k(), $$1.a_($$7));
            int $$10 = $$1.g().f() ? 0 : $$1.g().M();
            int $$11 = csc.a(this.E, this.X, $$7) + $$10;
            if ($$11 > $$9) {
               $$11 = $$9;
               $$8 = n.o.toString() + $$9;
            }

            $$4 = $$7.c($$11);
         } else {
            this.E.remove($$1);
            this.G();
         }
      }

      $$0.c().a();
      $$0.c().a(0.0F, 0.0F, 100.0F);
      if ($$4.f() && $$1.d()) {
         akv $$12 = $$1.b();
         if ($$12 != null) {
            $$0.a(gmi::H, $$12, $$2, $$3, 16, 16);
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
      cwp $$0 = this.z.g();
      if (!$$0.f() && this.F) {
         if (this.X == 2) {
            this.aa = $$0.k();
         } else {
            this.aa = $$0.M();

            for (ctz $$1 : this.E) {
               cwp $$2 = $$1.g();
               int $$3 = $$2.f() ? 0 : $$2.M();
               int $$4 = Math.min($$0.k(), $$1.a_($$0));
               int $$5 = Math.min(csc.a(this.E, this.X, $$0) + $$3, $$4);
               this.aa -= $$5 - $$3;
            }
         }
      }
   }

   @Nullable
   private ctz b(double $$0, double $$1) {
      for (ctz $$2 : this.z.k) {
         if ($$2.d() && this.a($$2, $$0, $$1)) {
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
         boolean $$3 = this.m.n.H.a($$2) && this.m.r.f();
         ctz $$4 = this.b($$0, $$1);
         long $$5 = af.c();
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
               this.aO_();
               return true;
            }

            if ($$9 != -1) {
               if (this.m.n.ac().c()) {
                  if ($$4 != null && $$4.h()) {
                     this.M = $$4;
                     this.R = cwp.j;
                     this.Q = $$2 == 1;
                  } else {
                     this.M = null;
                  }
               } else if (!this.F) {
                  if (this.z.g().f()) {
                     if ($$3) {
                        this.a($$4, $$9, $$2, csn.d);
                     } else {
                        boolean $$10 = $$9 != -999 && (fep.a(flj.Q().aO().h(), 340) || fep.a(flj.Q().aO().h(), 344));
                        csn $$11 = csn.a;
                        if ($$10) {
                           this.ae = $$4 != null && $$4.h() ? $$4.g().v() : cwp.j;
                           $$11 = csn.b;
                        } else if ($$9 == -999) {
                           $$11 = csn.e;
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
            this.a(this.B, this.B.d, 40, csn.c);
            return;
         }

         for (int $$1 = 0; $$1 < 9; $$1++) {
            if (this.m.n.S[$$1].a($$0)) {
               this.a(this.B, this.B.d, $$1, csn.c);
            }
         }
      }
   }

   protected boolean a(double $$0, double $$1, int $$2, int $$3, int $$4) {
      return $$0 < (double)$$2 || $$1 < (double)$$3 || $$0 >= (double)($$2 + this.s) || $$1 >= (double)($$3 + this.u);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2, double $$3, double $$4) {
      ctz $$5 = this.b($$0, $$1);
      cwp $$6 = this.z.g();
      if (this.M != null && this.m.n.ac().c()) {
         if ($$2 == 0 || $$2 == 1) {
            if (this.R.f()) {
               if ($$5 != this.M && !this.M.g().f()) {
                  this.R = this.M.g().v();
               }
            } else if (this.R.M() > 1 && $$5 != null && csc.a($$5, this.R, false)) {
               long $$7 = af.c();
               if (this.O == $$5) {
                  if ($$7 - this.W > 500L) {
                     this.a(this.M, this.M.d, 0, csn.a);
                     this.a($$5, $$5.d, 1, csn.a);
                     this.a(this.M, this.M.d, 0, csn.a);
                     this.W = $$7 + 750L;
                     this.R.h(1);
                  }
               } else {
                  this.O = $$5;
                  this.W = $$7;
               }
            }
         }
      } else if (this.F && $$5 != null && !$$6.f() && ($$6.M() > this.E.size() || this.X == 2) && csc.a($$5, $$6, true) && $$5.a($$6) && this.z.b($$5)) {
         this.E.add($$5);
         this.G();
      }

      return true;
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      ctz $$3 = this.b($$0, $$1);
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

      if (this.ad && $$3 != null && $$2 == 0 && this.z.a(cwp.j, $$3)) {
         if (t()) {
            if (!this.ae.f()) {
               for (ctz $$8 : this.z.k) {
                  if ($$8 != null && $$8.a(this.m.t) && $$8.h() && $$8.c == $$3.c && csc.a($$8, this.ae, true)) {
                     this.a($$8, $$8.d, $$2, csn.b);
                  }
               }
            }
         } else {
            this.a($$3, $$7, $$2, csn.g);
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

               boolean $$9 = csc.a($$3, this.R, false);
               if ($$7 != -1 && !this.R.f() && $$9) {
                  this.a(this.M, this.M.d, $$2, csn.a);
                  this.a($$3, $$7, 0, csn.a);
                  if (this.z.g().f()) {
                     this.V = cwp.j;
                  } else {
                     this.a(this.M, this.M.d, $$2, csn.a);
                     this.S = ayz.a($$0 - (double)$$4);
                     this.T = ayz.a($$1 - (double)$$5);
                     this.N = this.M;
                     this.V = this.R;
                     this.U = af.c();
                  }
               } else if (!this.R.f()) {
                  this.S = ayz.a($$0 - (double)$$4);
                  this.T = ayz.a($$1 - (double)$$5);
                  this.N = this.M;
                  this.V = this.R;
                  this.U = af.c();
               }

               this.m();
            }
         } else if (this.F && !this.E.isEmpty()) {
            this.a(null, -999, csc.c(0, this.X), csn.f);

            for (ctz $$10 : this.E) {
               this.a($$10, $$10.d, csc.c(1, this.X), csn.f);
            }

            this.a(null, -999, csc.c(2, this.X), csn.f);
         } else if (!this.z.g().f()) {
            if (this.m.n.H.a($$2)) {
               this.a($$3, $$7, $$2, csn.d);
            } else {
               boolean $$11 = $$7 != -999 && (fep.a(flj.Q().aO().h(), 340) || fep.a(flj.Q().aO().h(), 344));
               if ($$11) {
                  this.ae = $$3 != null && $$3.h() ? $$3.g().v() : cwp.j;
               }

               this.a($$3, $$7, $$2, $$11 ? csn.b : csn.a);
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
      this.R = cwp.j;
      this.M = null;
   }

   private boolean a(ctz $$0, double $$1, double $$2) {
      return this.a($$0.e, $$0.f, 16, 16, $$1, $$2);
   }

   protected boolean a(int $$0, int $$1, int $$2, int $$3, double $$4, double $$5) {
      int $$6 = this.C;
      int $$7 = this.D;
      $$4 -= (double)$$6;
      $$5 -= (double)$$7;
      return $$4 >= (double)($$0 - 1) && $$4 < (double)($$0 + $$2 + 1) && $$5 >= (double)($$1 - 1) && $$5 < (double)($$1 + $$3 + 1);
   }

   private void a(ctz $$0) {
      if ($$0.h()) {
         for (fog $$1 : this.L) {
            if ($$1.a($$0)) {
               $$1.b($$0);
            }
         }
      }
   }

   protected void a(ctz $$0, int $$1, int $$2, csn $$3) {
      if ($$0 != null) {
         $$1 = $$0.d;
      }

      this.a($$0, $$3);
      this.m.r.a(this.z.l, $$1, $$2, $$3, this.m.t);
   }

   void a(@Nullable ctz $$0, csn $$1) {
      if ($$0 != null && $$0.h()) {
         for (fog $$2 : this.L) {
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
         this.aO_();
         return true;
      } else {
         this.a($$0, $$1);
         if (this.B != null && this.B.h()) {
            if (this.m.n.H.a($$0, $$1)) {
               this.a(this.B, this.B.d, 0, csn.d);
            } else if (this.m.n.E.a($$0, $$1)) {
               this.a(this.B, this.B.d, s() ? 1 : 0, csn.e);
            }
         }

         return true;
      }
   }

   protected boolean a(int $$0, int $$1) {
      if (this.z.g().f() && this.B != null) {
         if (this.m.n.D.a($$0, $$1)) {
            this.a(this.B, this.B.d, 40, csn.c);
            return true;
         }

         for (int $$2 = 0; $$2 < 9; $$2++) {
            if (this.m.n.S[$$2].a($$0, $$1)) {
               this.a(this.B, this.B.d, $$2, csn.c);
               return true;
            }
         }
      }

      return false;
   }

   @Override
   public void aI_() {
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
      if (this.m.t.bL() && !this.m.t.dQ()) {
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
   public void aO_() {
      this.m.t.p();
      if (this.B != null) {
         this.a(this.B);
      }

      super.aO_();
   }
}
