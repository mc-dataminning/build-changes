import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import java.util.List;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fyh extends fty {
   static final alz a = alz.b("icon/checkmark");
   private static final xv b = xv.c("gui.chatSelection.title");
   private static final xv c = xv.c("gui.chatSelection.context");
   @Nullable
   private final fty d;
   private final ggt s;
   private fof u;
   private foz v;
   @Nullable
   private fyh.a w;
   final ggm.a x;
   private final Consumer<ggm.a> y;
   private fyg z;

   public fyh(@Nullable fty $$0, ggt $$1, ggm.a $$2, Consumer<ggm.a> $$3) {
      super(b);
      this.d = $$0;
      this.s = $$1;
      this.x = $$2.d();
      this.y = $$3;
   }

   @Override
   protected void aT_() {
      this.z = new fyg(this.s, this::a);
      this.v = foz.a(this.p, c, this.n - 16);
      this.w = this.c(new fyh.a(this.m, (this.v.a() + 1) * 9));
      this.c(fof.a(xu.k, $$0 -> this.aP_()).a(this.n / 2 - 155, this.o - 32, 150, 20).a());
      this.u = this.c(fof.a(xu.d, $$0 -> {
         this.y.accept(this.x);
         this.aP_();
      }).a(this.n / 2 - 155 + 160, this.o - 32, 150, 20).a());
      this.F();
      this.l();
      this.w.b((double)this.w.p());
   }

   private boolean a(ggi $$0) {
      return $$0.a(this.x.f());
   }

   private void l() {
      int $$0 = this.w.b();
      this.z.a($$0, this.w);
   }

   void E() {
      this.l();
   }

   void F() {
      this.u.j = !this.x.a().isEmpty();
   }

   @Override
   public void a(fns $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 10, 16777215);
      AbuseReportLimits $$4 = this.s.a().b();
      int $$5 = this.x.a().size();
      int $$6 = $$4.maxReportedMessageCount();
      xv $$7 = xv.a("gui.chatSelection.selected", $$5, $$6);
      $$0.a(this.p, $$7, this.n / 2, 16 + 9 * 3 / 2, -1);
      this.v.a($$0, this.n / 2, this.w.c());
   }

   @Override
   public void aP_() {
      this.m.a(this.d);
   }

   @Override
   public xv i() {
      return xu.a(super.i(), c);
   }

   public class a extends fpc<fyh.a.b> implements fyg.a {
      @Nullable
      private fyh.a.c m;

      public a(final fmg $$1, final int $$2) {
         super($$1, fyh.this.n, fyh.this.o - $$2 - 80, 40, 16);
      }

      @Override
      public void b(double $$0) {
         double $$1 = this.n();
         super.b($$0);
         if ((float)this.p() > 1.0E-5F && $$0 <= 1.0E-5F && !bae.b($$0, $$1)) {
            fyh.this.E();
         }
      }

      @Override
      public void a(int $$0, ggi.a $$1) {
         boolean $$2 = $$1.a(fyh.this.x.f());
         ggg $$3 = $$1.h();
         fma $$4 = $$3.a($$1.g());
         fyh.a.b $$5 = new fyh.a.d($$0, $$1.b(), $$1.c(), $$4, $$2, true);
         this.c($$5);
         this.a($$1, $$2);
      }

      private void a(ggi.a $$0, boolean $$1) {
         fyh.a.b $$2 = new fyh.a.e($$0.f(), $$0.d(), $$1);
         this.c($$2);
         fyh.a.c $$3 = new fyh.a.c($$0.e(), $$2);
         if (this.m != null && this.m.a($$3)) {
            this.d(this.m.b());
         }

         this.m = $$3;
      }

      @Override
      public void a(xv $$0) {
         this.c(new fyh.a.f());
         this.c(new fyh.a.a($$0));
         this.c(new fyh.a.f());
         this.m = null;
      }

      @Override
      public int a() {
         return Math.min(350, this.g - 50);
      }

      @Override
      public int b() {
         return bae.e(this.h, this.d);
      }

      @Override
      protected void a(fns $$0, int $$1, int $$2, float $$3, int $$4, int $$5, int $$6, int $$7, int $$8) {
         fyh.a.b $$9 = this.b($$4);
         if (this.b($$9)) {
            boolean $$10 = this.g() == $$9;
            int $$11 = this.aN_() && $$10 ? -1 : -8355712;
            this.a($$0, $$6, $$7, $$8, $$11, -16777216);
         }

         $$9.a($$0, $$4, $$6, $$5, $$7, $$8, $$1, $$2, this.v() == $$9, $$3);
      }

      private boolean b(fyh.a.b $$0) {
         if ($$0.c()) {
            boolean $$1 = this.g() == $$0;
            boolean $$2 = this.g() == null;
            boolean $$3 = this.v() == $$0;
            return $$1 || $$2 && $$3 && $$0.d();
         } else {
            return false;
         }
      }

      @Nullable
      protected fyh.a.b b(fsl $$0) {
         return this.a($$0, fyh.a.b::c);
      }

      public void a(@Nullable fyh.a.b $$0) {
         super.a($$0);
         fyh.a.b $$1 = this.b(fsl.a);
         if ($$1 == null) {
            fyh.this.E();
         }
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         fyh.a.b $$3 = this.g();
         return $$3 != null && $$3.a($$0, $$1, $$2) ? true : super.a($$0, $$1, $$2);
      }

      @Override
      public int c() {
         return this.G() + 9;
      }

      public class a extends fyh.a.b {
         private final xv b;

         public a(final xv $$1) {
            this.b = $$1;
         }

         @Override
         public void a(fns $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            int $$10 = $$2 + $$5 / 2;
            int $$11 = $$3 + $$4 - 8;
            int $$12 = fyh.this.p.a(this.b);
            int $$13 = ($$3 + $$11 - $$12) / 2;
            int $$14 = $$10 - 9 / 2;
            $$0.b(fyh.this.p, this.b, $$13, $$14, -6250336);
         }

         @Override
         public xv a() {
            return this.b;
         }
      }

      public abstract class b extends fpc.a<fyh.a.b> {
         @Override
         public xv a() {
            return xu.a;
         }

         public boolean b() {
            return false;
         }

         public boolean c() {
            return false;
         }

         public boolean d() {
            return this.c();
         }
      }

      static record c(UUID a, fyh.a.b b) {
         public boolean a(fyh.a.c $$0) {
            return $$0.a.equals(this.a);
         }
      }

      public class d extends fyh.a.b {
         private static final int b = 9;
         private static final int c = 8;
         private static final int d = 11;
         private static final int e = 4;
         private final int f;
         private final ya g;
         private final xv h;
         @Nullable
         private final List<azq> i;
         @Nullable
         private final fma.a j;
         @Nullable
         private final List<azq> k;
         private final boolean l;
         private final boolean m;

         public d(final int $$1, final xv $$2, final xv $$3, @Nullable final fma $$4, final boolean $$5, final boolean $$6) {
            this.f = $$1;
            this.j = x.a($$4, fma::f);
            this.k = $$4 != null && $$4.g() != null ? fyh.this.p.c($$4.g(), a.this.a()) : null;
            this.l = $$5;
            this.m = $$6;
            ya $$7 = fyh.this.p.a($$2, this.e() - fyh.this.p.a(xu.u));
            if ($$2 != $$7) {
               this.g = ya.a($$7, xu.u);
               this.i = fyh.this.p.c($$2, a.this.a());
            } else {
               this.g = $$2;
               this.i = null;
            }

            this.h = $$3;
         }

         @Override
         public void a(fns $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            if (this.b() && this.l) {
               this.a($$0, $$2, $$3, $$5);
            }

            int $$10 = $$3 + this.g();
            int $$11 = $$2 + 1 + ($$5 - 9) / 2;
            $$0.b(fyh.this.p, us.a().a(this.g), $$10, $$11, this.l ? -1 : -1593835521);
            if (this.i != null && $$8) {
               fyh.this.b(this.i);
            }

            int $$12 = fyh.this.p.a(this.g);
            this.a($$0, $$10 + $$12 + 4, $$2, $$5, $$6, $$7);
         }

         private void a(fns $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
            if (this.j != null) {
               int $$6 = $$2 + ($$3 - this.j.d) / 2;
               this.j.a($$0, $$1, $$6);
               if (this.k != null && $$4 >= $$1 && $$4 <= $$1 + this.j.c && $$5 >= $$6 && $$5 <= $$6 + this.j.d) {
                  fyh.this.b(this.k);
               }
            }
         }

         private void a(fns $$0, int $$1, int $$2, int $$3) {
            int $$5 = $$1 + ($$3 - 8) / 2;
            $$0.a(glv::C, fyh.a, $$2, $$5, 9, 8);
         }

         private int e() {
            int $$0 = this.j != null ? this.j.c + 4 : 0;
            return a.this.a() - this.g() - 4 - $$0;
         }

         private int g() {
            return this.m ? 11 : 0;
         }

         @Override
         public xv a() {
            return (xv)(this.b() ? xv.a("narrator.select", this.h) : this.h);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(null);
            return this.h();
         }

         @Override
         public boolean a(int $$0, int $$1, int $$2) {
            return fsi.a($$0) ? this.h() : false;
         }

         @Override
         public boolean b() {
            return fyh.this.x.b(this.f);
         }

         @Override
         public boolean c() {
            return true;
         }

         @Override
         public boolean d() {
            return this.l;
         }

         private boolean h() {
            if (this.l) {
               fyh.this.x.a(this.f);
               fyh.this.F();
               return true;
            } else {
               return false;
            }
         }
      }

      public class e extends fyh.a.b {
         private static final int b = 12;
         private static final int c = 4;
         private final xv d;
         private final Supplier<hcm> e;
         private final boolean f;

         public e(final GameProfile $$1, final xv $$2, final boolean $$3) {
            this.d = $$2;
            this.f = $$3;
            this.e = a.this.c.an().a($$1);
         }

         @Override
         public void a(fns $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            int $$10 = $$3 - 12 + 4;
            int $$11 = $$2 + ($$5 - 12) / 2;
            fpf.a($$0, this.e.get(), $$10, $$11, 12);
            int $$12 = $$2 + 1 + ($$5 - 9) / 2;
            $$0.b(fyh.this.p, this.d, $$10 + 12 + 4, $$12, this.f ? -1 : -1593835521);
         }
      }

      public class f extends fyh.a.b {
         @Override
         public void a(fns $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         }
      }
   }
}
