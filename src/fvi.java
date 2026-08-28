import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import java.util.List;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fvi extends fra {
   static final ali a = ali.b("icon/checkmark");
   private static final xi b = xi.c("gui.chatSelection.title");
   private static final xi c = xi.c("gui.chatSelection.context");
   @Nullable
   private final fra d;
   private final gdq s;
   private flh u;
   private fma v;
   @Nullable
   private fvi.a w;
   final gdj.a x;
   private final Consumer<gdj.a> y;
   private fvh z;

   public fvi(@Nullable fra $$0, gdq $$1, gdj.a $$2, Consumer<gdj.a> $$3) {
      super(b);
      this.d = $$0;
      this.s = $$1;
      this.x = $$2.d();
      this.y = $$3;
   }

   @Override
   protected void aR_() {
      this.z = new fvh(this.s, this::a);
      this.v = fma.a(this.p, c, this.n - 16);
      this.w = this.c(new fvi.a(this.m, (this.v.a() + 1) * 9));
      this.c(flh.a(xh.k, $$0 -> this.d()).a(this.n / 2 - 155, this.o - 32, 150, 20).a());
      this.u = this.c(flh.a(xh.d, $$0 -> {
         this.y.accept(this.x);
         this.d();
      }).a(this.n / 2 - 155 + 160, this.o - 32, 150, 20).a());
      this.E();
      this.m();
      this.w.b((double)this.w.p());
   }

   private boolean a(gdf $$0) {
      return $$0.a(this.x.f());
   }

   private void m() {
      int $$0 = this.w.c();
      this.z.a($$0, this.w);
   }

   void D() {
      this.m();
   }

   void E() {
      this.u.j = !this.x.a().isEmpty();
   }

   @Override
   public void a(fku $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 10, 16777215);
      AbuseReportLimits $$4 = this.s.a().b();
      int $$5 = this.x.a().size();
      int $$6 = $$4.maxReportedMessageCount();
      xi $$7 = xi.a("gui.chatSelection.selected", $$5, $$6);
      $$0.a(this.p, $$7, this.n / 2, 16 + 9 * 3 / 2, -1);
      this.v.a($$0, this.n / 2, this.w.J());
   }

   @Override
   public void d() {
      this.m.a(this.d);
   }

   @Override
   public xi i() {
      return xh.a(super.i(), c);
   }

   public class a extends fmd<fvi.a.b> implements fvh.a {
      @Nullable
      private fvi.a.c m;

      public a(final fji $$1, final int $$2) {
         super($$1, fvi.this.n, fvi.this.o - $$2 - 80, 40, 16);
      }

      @Override
      public void b(double $$0) {
         double $$1 = this.n();
         super.b($$0);
         if ((float)this.p() > 1.0E-5F && $$0 <= 1.0E-5F && !azk.b($$0, $$1)) {
            fvi.this.D();
         }
      }

      @Override
      public void a(int $$0, gdf.a $$1) {
         boolean $$2 = $$1.a(fvi.this.x.f());
         gdd $$3 = $$1.h();
         fjc $$4 = $$3.a($$1.g());
         fvi.a.b $$5 = new fvi.a.d($$0, $$1.b(), $$1.c(), $$4, $$2, true);
         this.c($$5);
         this.a($$1, $$2);
      }

      private void a(gdf.a $$0, boolean $$1) {
         fvi.a.b $$2 = new fvi.a.e($$0.f(), $$0.d(), $$1);
         this.c($$2);
         fvi.a.c $$3 = new fvi.a.c($$0.e(), $$2);
         if (this.m != null && this.m.a($$3)) {
            this.d(this.m.b());
         }

         this.m = $$3;
      }

      @Override
      public void a(xi $$0) {
         this.c(new fvi.a.f());
         this.c(new fvi.a.a($$0));
         this.c(new fvi.a.f());
         this.m = null;
      }

      @Override
      public int b() {
         return Math.min(350, this.g - 50);
      }

      @Override
      public int c() {
         return azk.e(this.h, this.d);
      }

      @Override
      protected void a(fku $$0, int $$1, int $$2, float $$3, int $$4, int $$5, int $$6, int $$7, int $$8) {
         fvi.a.b $$9 = this.d($$4);
         if (this.b($$9)) {
            boolean $$10 = this.h() == $$9;
            int $$11 = this.aM_() && $$10 ? -1 : -8355712;
            this.a($$0, $$6, $$7, $$8, $$11, -16777216);
         }

         $$9.a($$0, $$4, $$6, $$5, $$7, $$8, $$1, $$2, this.v() == $$9, $$3);
      }

      private boolean b(fvi.a.b $$0) {
         if ($$0.c()) {
            boolean $$1 = this.h() == $$0;
            boolean $$2 = this.h() == null;
            boolean $$3 = this.v() == $$0;
            return $$1 || $$2 && $$3 && $$0.d();
         } else {
            return false;
         }
      }

      @Nullable
      protected fvi.a.b b(fpn $$0) {
         return this.a($$0, fvi.a.b::c);
      }

      public void a(@Nullable fvi.a.b $$0) {
         super.a($$0);
         fvi.a.b $$1 = this.b(fpn.a);
         if ($$1 == null) {
            fvi.this.D();
         }
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         fvi.a.b $$3 = this.h();
         return $$3 != null && $$3.a($$0, $$1, $$2) ? true : super.a($$0, $$1, $$2);
      }

      @Override
      public int J() {
         return this.G() + 9;
      }

      public class a extends fvi.a.b {
         private final xi b;

         public a(final xi $$1) {
            this.b = $$1;
         }

         @Override
         public void a(fku $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            int $$10 = $$2 + $$5 / 2;
            int $$11 = $$3 + $$4 - 8;
            int $$12 = fvi.this.p.a(this.b);
            int $$13 = ($$3 + $$11 - $$12) / 2;
            int $$14 = $$10 - 9 / 2;
            $$0.b(fvi.this.p, this.b, $$13, $$14, -6250336);
         }

         @Override
         public xi a() {
            return this.b;
         }
      }

      public abstract class b extends fmd.a<fvi.a.b> {
         @Override
         public xi a() {
            return xh.a;
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

      static record c(UUID a, fvi.a.b b) {
         public boolean a(fvi.a.c $$0) {
            return $$0.a.equals(this.a);
         }
      }

      public class d extends fvi.a.b {
         private static final int b = 9;
         private static final int c = 8;
         private static final int d = 11;
         private static final int e = 4;
         private final int f;
         private final xn g;
         private final xi h;
         @Nullable
         private final List<ayw> i;
         @Nullable
         private final fjc.a j;
         @Nullable
         private final List<ayw> k;
         private final boolean l;
         private final boolean m;

         public d(final int $$1, final xi $$2, final xi $$3, @Nullable final fjc $$4, final boolean $$5, final boolean $$6) {
            this.f = $$1;
            this.j = x.a($$4, fjc::f);
            this.k = $$4 != null && $$4.g() != null ? fvi.this.p.c($$4.g(), a.this.b()) : null;
            this.l = $$5;
            this.m = $$6;
            xn $$7 = fvi.this.p.a($$2, this.e() - fvi.this.p.a(xh.u));
            if ($$2 != $$7) {
               this.g = xn.a($$7, xh.u);
               this.i = fvi.this.p.c($$2, a.this.b());
            } else {
               this.g = $$2;
               this.i = null;
            }

            this.h = $$3;
         }

         @Override
         public void a(fku $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            if (this.b() && this.l) {
               this.a($$0, $$2, $$3, $$5);
            }

            int $$10 = $$3 + this.f();
            int $$11 = $$2 + 1 + ($$5 - 9) / 2;
            $$0.b(fvi.this.p, uf.a().a(this.g), $$10, $$11, this.l ? -1 : -1593835521);
            if (this.i != null && $$8) {
               fvi.this.b(this.i);
            }

            int $$12 = fvi.this.p.a(this.g);
            this.a($$0, $$10 + $$12 + 4, $$2, $$5, $$6, $$7);
         }

         private void a(fku $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
            if (this.j != null) {
               int $$6 = $$2 + ($$3 - this.j.d) / 2;
               this.j.a($$0, $$1, $$6);
               if (this.k != null && $$4 >= $$1 && $$4 <= $$1 + this.j.c && $$5 >= $$6 && $$5 <= $$6 + this.j.d) {
                  fvi.this.b(this.k);
               }
            }
         }

         private void a(fku $$0, int $$1, int $$2, int $$3) {
            int $$5 = $$1 + ($$3 - 8) / 2;
            $$0.a(gir::B, fvi.a, $$2, $$5, 9, 8);
         }

         private int e() {
            int $$0 = this.j != null ? this.j.c + 4 : 0;
            return a.this.b() - this.f() - 4 - $$0;
         }

         private int f() {
            return this.m ? 11 : 0;
         }

         @Override
         public xi a() {
            return (xi)(this.b() ? xi.a("narrator.select", this.h) : this.h);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(null);
            return this.h();
         }

         @Override
         public boolean a(int $$0, int $$1, int $$2) {
            return fpk.a($$0) ? this.h() : false;
         }

         @Override
         public boolean b() {
            return fvi.this.x.b(this.f);
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
               fvi.this.x.a(this.f);
               fvi.this.E();
               return true;
            } else {
               return false;
            }
         }
      }

      public class e extends fvi.a.b {
         private static final int b = 12;
         private static final int c = 4;
         private final xi d;
         private final Supplier<gze> e;
         private final boolean f;

         public e(final GameProfile $$1, final xi $$2, final boolean $$3) {
            this.d = $$2;
            this.f = $$3;
            this.e = a.this.c.an().a($$1);
         }

         @Override
         public void a(fku $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            int $$10 = $$3 - 12 + 4;
            int $$11 = $$2 + ($$5 - 12) / 2;
            fmg.a($$0, this.e.get(), $$10, $$11, 12);
            int $$12 = $$2 + 1 + ($$5 - 9) / 2;
            $$0.b(fvi.this.p, this.d, $$10 + 12 + 4, $$12, this.f ? -1 : -1593835521);
         }
      }

      public class f extends fvi.a.b {
         @Override
         public void a(fku $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         }
      }
   }
}
