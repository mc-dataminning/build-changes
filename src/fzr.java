import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import java.util.List;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fzr extends fvi {
   static final aku a = aku.b("icon/checkmark");
   private static final wp b = wp.c("gui.chatSelection.title");
   private static final wp c = wp.c("gui.chatSelection.context");
   @Nullable
   private final fvi d;
   private final gih s;
   private fpq u;
   private fqj v;
   @Nullable
   private fzr.a w;
   final gia.a x;
   private final Consumer<gia.a> y;
   private fzq z;

   public fzr(@Nullable fvi $$0, gih $$1, gia.a $$2, Consumer<gia.a> $$3) {
      super(b);
      this.d = $$0;
      this.s = $$1;
      this.x = $$2.d();
      this.y = $$3;
   }

   @Override
   protected void aR_() {
      this.z = new fzq(this.s, this::a);
      this.v = fqj.a(this.p, c, this.n - 16);
      this.w = this.c(new fzr.a(this.m, (this.v.a() + 1) * 9));
      this.c(fpq.a(wo.k, $$0 -> this.aO_()).a(this.n / 2 - 155, this.o - 32, 150, 20).a());
      this.u = this.c(fpq.a(wo.d, $$0 -> {
         this.y.accept(this.x);
         this.aO_();
      }).a(this.n / 2 - 155 + 160, this.o - 32, 150, 20).a());
      this.F();
      this.m();
      this.w.a((double)this.w.i());
   }

   private boolean a(ghw $$0) {
      return $$0.a(this.x.f());
   }

   private void m() {
      int $$0 = this.w.b();
      this.z.a($$0, this.w);
   }

   void E() {
      this.m();
   }

   void F() {
      this.u.j = !this.x.a().isEmpty();
   }

   @Override
   public void a(fpc $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 10, -1);
      AbuseReportLimits $$4 = this.s.a().b();
      int $$5 = this.x.a().size();
      int $$6 = $$4.maxReportedMessageCount();
      wp $$7 = wp.a("gui.chatSelection.selected", $$5, $$6);
      $$0.a(this.p, $$7, this.n / 2, 26, -1);
      this.v.a($$0, this.n / 2, this.w.c());
   }

   @Override
   public void aO_() {
      this.m.a(this.d);
   }

   @Override
   public wp i() {
      return wo.a(super.i(), c);
   }

   public class a extends fqm<fzr.a.b> implements fzq.a {
      @Nullable
      private fzr.a.c m;

      public a(final fmg $$1, final int $$2) {
         super($$1, fzr.this.n, fzr.this.o - $$2 - 80, 40, 16);
      }

      @Override
      public void a(double $$0) {
         double $$1 = this.g();
         super.a($$0);
         if ((float)this.i() > 1.0E-5F && $$0 <= 1.0E-5F && !ayz.b($$0, $$1)) {
            fzr.this.E();
         }
      }

      @Override
      public void a(int $$0, ghw.a $$1) {
         boolean $$2 = $$1.a(fzr.this.x.f());
         ghu $$3 = $$1.h();
         fma $$4 = $$3.a($$1.g());
         fzr.a.b $$5 = new fzr.a.d($$0, $$1.b(), $$1.c(), $$4, $$2, true);
         this.c($$5);
         this.a($$1, $$2);
      }

      private void a(ghw.a $$0, boolean $$1) {
         fzr.a.b $$2 = new fzr.a.e($$0.f(), $$0.d(), $$1);
         this.c($$2);
         fzr.a.c $$3 = new fzr.a.c($$0.e(), $$2);
         if (this.m != null && this.m.a($$3)) {
            this.d(this.m.b());
         }

         this.m = $$3;
      }

      @Override
      public void a(wp $$0) {
         this.c(new fzr.a.f());
         this.c(new fzr.a.a($$0));
         this.c(new fzr.a.f());
         this.m = null;
      }

      @Override
      public int a() {
         return Math.min(350, this.g - 50);
      }

      public int b() {
         return ayz.e(this.h, this.d);
      }

      @Override
      protected void a(fpc $$0, int $$1, int $$2, float $$3, int $$4, int $$5, int $$6, int $$7, int $$8) {
         fzr.a.b $$9 = this.b($$4);
         if (this.b($$9)) {
            boolean $$10 = this.p() == $$9;
            int $$11 = this.aM_() && $$10 ? -1 : -8355712;
            this.a($$0, $$6, $$7, $$8, $$11, -16777216);
         }

         $$9.a($$0, $$4, $$6, $$5, $$7, $$8, $$1, $$2, this.x() == $$9, $$3);
      }

      private boolean b(fzr.a.b $$0) {
         if ($$0.c()) {
            boolean $$1 = this.p() == $$0;
            boolean $$2 = this.p() == null;
            boolean $$3 = this.x() == $$0;
            return $$1 || $$2 && $$3 && $$0.d();
         } else {
            return false;
         }
      }

      @Nullable
      protected fzr.a.b c(ftv $$0) {
         return this.a($$0, fzr.a.b::c);
      }

      public void a(@Nullable fzr.a.b $$0) {
         super.a($$0);
         fzr.a.b $$1 = this.c(ftv.a);
         if ($$1 == null) {
            fzr.this.E();
         }
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         fzr.a.b $$3 = this.p();
         return $$3 != null && $$3.a($$0, $$1, $$2) ? true : super.a($$0, $$1, $$2);
      }

      public int c() {
         return this.I() + 9;
      }

      public class a extends fzr.a.b {
         private final wp b;

         public a(final wp $$1) {
            this.b = $$1;
         }

         @Override
         public void a(fpc $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            int $$10 = $$2 + $$5 / 2;
            int $$11 = $$3 + $$4 - 8;
            int $$12 = fzr.this.p.a(this.b);
            int $$13 = ($$3 + $$11 - $$12) / 2;
            int $$14 = $$10 - 9 / 2;
            $$0.b(fzr.this.p, this.b, $$13, $$14, -6250336);
         }

         @Override
         public wp a() {
            return this.b;
         }
      }

      public abstract static class b extends fqm.a<fzr.a.b> {
         @Override
         public wp a() {
            return wo.a;
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

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            return this.c();
         }
      }

      static record c(UUID a, fzr.a.b b) {
         public boolean a(fzr.a.c $$0) {
            return $$0.a.equals(this.a);
         }
      }

      public class d extends fzr.a.b {
         private static final int b = 9;
         private static final int c = 8;
         private static final int d = 11;
         private static final int e = 4;
         private final int f;
         private final wu g;
         private final wp h;
         @Nullable
         private final List<ayl> i;
         @Nullable
         private final fma.a j;
         @Nullable
         private final List<ayl> k;
         private final boolean l;
         private final boolean m;

         public d(final int $$1, final wp $$2, final wp $$3, @Nullable final fma $$4, final boolean $$5, final boolean $$6) {
            this.f = $$1;
            this.j = x.a($$4, fma::f);
            this.k = $$4 != null && $$4.g() != null ? fzr.this.p.c($$4.g(), a.this.a()) : null;
            this.l = $$5;
            this.m = $$6;
            wu $$7 = fzr.this.p.a($$2, this.e() - fzr.this.p.a(wo.u));
            if ($$2 != $$7) {
               this.g = wu.a($$7, wo.u);
               this.i = fzr.this.p.c($$2, a.this.a());
            } else {
               this.g = $$2;
               this.i = null;
            }

            this.h = $$3;
         }

         @Override
         public void a(fpc $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            if (this.b() && this.l) {
               this.a($$0, $$2, $$3, $$5);
            }

            int $$10 = $$3 + this.g();
            int $$11 = $$2 + 1 + ($$5 - 9) / 2;
            $$0.b(fzr.this.p, tl.a().a(this.g), $$10, $$11, this.l ? -1 : -1593835521);
            if (this.i != null && $$8) {
               fzr.this.b(this.i);
            }

            int $$12 = fzr.this.p.a(this.g);
            this.a($$0, $$10 + $$12 + 4, $$2, $$5, $$6, $$7);
         }

         private void a(fpc $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
            if (this.j != null) {
               int $$6 = $$2 + ($$3 - this.j.d) / 2;
               this.j.a($$0, $$1, $$6);
               if (this.k != null && $$4 >= $$1 && $$4 <= $$1 + this.j.c && $$5 >= $$6 && $$5 <= $$6 + this.j.d) {
                  fzr.this.b(this.k);
               }
            }
         }

         private void a(fpc $$0, int $$1, int $$2, int $$3) {
            int $$5 = $$1 + ($$3 - 8) / 2;
            $$0.a(gnh::H, fzr.a, $$2, $$5, 9, 8);
         }

         private int e() {
            int $$0 = this.j != null ? this.j.c + 4 : 0;
            return a.this.a() - this.g() - 4 - $$0;
         }

         private int g() {
            return this.m ? 11 : 0;
         }

         @Override
         public wp a() {
            return (wp)(this.b() ? wp.a("narrator.select", this.h) : this.h);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(null);
            return this.h();
         }

         @Override
         public boolean a(int $$0, int $$1, int $$2) {
            return fts.a($$0) ? this.h() : false;
         }

         @Override
         public boolean b() {
            return fzr.this.x.b(this.f);
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
               fzr.this.x.a(this.f);
               fzr.this.F();
               return true;
            } else {
               return false;
            }
         }
      }

      public class e extends fzr.a.b {
         private static final int b = 12;
         private static final int c = 4;
         private final wp d;
         private final Supplier<hgt> e;
         private final boolean f;

         public e(final GameProfile $$1, final wp $$2, final boolean $$3) {
            this.d = $$2;
            this.f = $$3;
            this.e = a.this.c.an().a($$1);
         }

         @Override
         public void a(fpc $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            int $$10 = $$3 - 12 + 4;
            int $$11 = $$2 + ($$5 - 12) / 2;
            fqp.a($$0, this.e.get(), $$10, $$11, 12);
            int $$12 = $$2 + 1 + ($$5 - 9) / 2;
            $$0.b(fzr.this.p, this.d, $$10 + 12 + 4, $$12, this.f ? -1 : -1593835521);
         }
      }

      public static class f extends fzr.a.b {
         @Override
         public void a(fpc $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         }
      }
   }
}
