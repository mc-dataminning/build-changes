import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import java.util.List;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fvx extends frp {
   static final all a = all.b("icon/checkmark");
   private static final xl b = xl.c("gui.chatSelection.title");
   private static final xl c = xl.c("gui.chatSelection.context");
   @Nullable
   private final frp d;
   private final geg s;
   private flw u;
   private fmp v;
   @Nullable
   private fvx.a w;
   final gdz.a x;
   private final Consumer<gdz.a> y;
   private fvw z;

   public fvx(@Nullable frp $$0, geg $$1, gdz.a $$2, Consumer<gdz.a> $$3) {
      super(b);
      this.d = $$0;
      this.s = $$1;
      this.x = $$2.d();
      this.y = $$3;
   }

   @Override
   protected void aS_() {
      this.z = new fvw(this.s, this::a);
      this.v = fmp.a(this.p, c, this.n - 16);
      this.w = this.c(new fvx.a(this.m, (this.v.a() + 1) * 9));
      this.c(flw.a(xk.k, $$0 -> this.aP_()).a(this.n / 2 - 155, this.o - 32, 150, 20).a());
      this.u = this.c(flw.a(xk.d, $$0 -> {
         this.y.accept(this.x);
         this.aP_();
      }).a(this.n / 2 - 155 + 160, this.o - 32, 150, 20).a());
      this.E();
      this.m();
      this.w.b((double)this.w.p());
   }

   private boolean a(gdv $$0) {
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
   public void a(flj $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 10, 16777215);
      AbuseReportLimits $$4 = this.s.a().b();
      int $$5 = this.x.a().size();
      int $$6 = $$4.maxReportedMessageCount();
      xl $$7 = xl.a("gui.chatSelection.selected", $$5, $$6);
      $$0.a(this.p, $$7, this.n / 2, 16 + 9 * 3 / 2, -1);
      this.v.a($$0, this.n / 2, this.w.J());
   }

   @Override
   public void aP_() {
      this.m.a(this.d);
   }

   @Override
   public xl i() {
      return xk.a(super.i(), c);
   }

   public class a extends fms<fvx.a.b> implements fvw.a {
      @Nullable
      private fvx.a.c m;

      public a(final fjx $$1, final int $$2) {
         super($$1, fvx.this.n, fvx.this.o - $$2 - 80, 40, 16);
      }

      @Override
      public void b(double $$0) {
         double $$1 = this.n();
         super.b($$0);
         if ((float)this.p() > 1.0E-5F && $$0 <= 1.0E-5F && !azn.b($$0, $$1)) {
            fvx.this.D();
         }
      }

      @Override
      public void a(int $$0, gdv.a $$1) {
         boolean $$2 = $$1.a(fvx.this.x.f());
         gdt $$3 = $$1.h();
         fjr $$4 = $$3.a($$1.g());
         fvx.a.b $$5 = new fvx.a.d($$0, $$1.b(), $$1.c(), $$4, $$2, true);
         this.c($$5);
         this.a($$1, $$2);
      }

      private void a(gdv.a $$0, boolean $$1) {
         fvx.a.b $$2 = new fvx.a.e($$0.f(), $$0.d(), $$1);
         this.c($$2);
         fvx.a.c $$3 = new fvx.a.c($$0.e(), $$2);
         if (this.m != null && this.m.a($$3)) {
            this.d(this.m.b());
         }

         this.m = $$3;
      }

      @Override
      public void a(xl $$0) {
         this.c(new fvx.a.f());
         this.c(new fvx.a.a($$0));
         this.c(new fvx.a.f());
         this.m = null;
      }

      @Override
      public int b() {
         return Math.min(350, this.g - 50);
      }

      @Override
      public int c() {
         return azn.e(this.h, this.d);
      }

      @Override
      protected void a(flj $$0, int $$1, int $$2, float $$3, int $$4, int $$5, int $$6, int $$7, int $$8) {
         fvx.a.b $$9 = this.d($$4);
         if (this.b($$9)) {
            boolean $$10 = this.h() == $$9;
            int $$11 = this.aM_() && $$10 ? -1 : -8355712;
            this.a($$0, $$6, $$7, $$8, $$11, -16777216);
         }

         $$9.a($$0, $$4, $$6, $$5, $$7, $$8, $$1, $$2, this.v() == $$9, $$3);
      }

      private boolean b(fvx.a.b $$0) {
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
      protected fvx.a.b b(fqc $$0) {
         return this.a($$0, fvx.a.b::c);
      }

      public void a(@Nullable fvx.a.b $$0) {
         super.a($$0);
         fvx.a.b $$1 = this.b(fqc.a);
         if ($$1 == null) {
            fvx.this.D();
         }
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         fvx.a.b $$3 = this.h();
         return $$3 != null && $$3.a($$0, $$1, $$2) ? true : super.a($$0, $$1, $$2);
      }

      @Override
      public int J() {
         return this.G() + 9;
      }

      public class a extends fvx.a.b {
         private final xl b;

         public a(final xl $$1) {
            this.b = $$1;
         }

         @Override
         public void a(flj $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            int $$10 = $$2 + $$5 / 2;
            int $$11 = $$3 + $$4 - 8;
            int $$12 = fvx.this.p.a(this.b);
            int $$13 = ($$3 + $$11 - $$12) / 2;
            int $$14 = $$10 - 9 / 2;
            $$0.b(fvx.this.p, this.b, $$13, $$14, -6250336);
         }

         @Override
         public xl a() {
            return this.b;
         }
      }

      public abstract class b extends fms.a<fvx.a.b> {
         @Override
         public xl a() {
            return xk.a;
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

      static record c(UUID a, fvx.a.b b) {
         public boolean a(fvx.a.c $$0) {
            return $$0.a.equals(this.a);
         }
      }

      public class d extends fvx.a.b {
         private static final int b = 9;
         private static final int c = 8;
         private static final int d = 11;
         private static final int e = 4;
         private final int f;
         private final xq g;
         private final xl h;
         @Nullable
         private final List<ayz> i;
         @Nullable
         private final fjr.a j;
         @Nullable
         private final List<ayz> k;
         private final boolean l;
         private final boolean m;

         public d(final int $$1, final xl $$2, final xl $$3, @Nullable final fjr $$4, final boolean $$5, final boolean $$6) {
            this.f = $$1;
            this.j = x.a($$4, fjr::f);
            this.k = $$4 != null && $$4.g() != null ? fvx.this.p.c($$4.g(), a.this.b()) : null;
            this.l = $$5;
            this.m = $$6;
            xq $$7 = fvx.this.p.a($$2, this.e() - fvx.this.p.a(xk.u));
            if ($$2 != $$7) {
               this.g = xq.a($$7, xk.u);
               this.i = fvx.this.p.c($$2, a.this.b());
            } else {
               this.g = $$2;
               this.i = null;
            }

            this.h = $$3;
         }

         @Override
         public void a(flj $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            if (this.b() && this.l) {
               this.a($$0, $$2, $$3, $$5);
            }

            int $$10 = $$3 + this.f();
            int $$11 = $$2 + 1 + ($$5 - 9) / 2;
            $$0.b(fvx.this.p, ui.a().a(this.g), $$10, $$11, this.l ? -1 : -1593835521);
            if (this.i != null && $$8) {
               fvx.this.b(this.i);
            }

            int $$12 = fvx.this.p.a(this.g);
            this.a($$0, $$10 + $$12 + 4, $$2, $$5, $$6, $$7);
         }

         private void a(flj $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
            if (this.j != null) {
               int $$6 = $$2 + ($$3 - this.j.d) / 2;
               this.j.a($$0, $$1, $$6);
               if (this.k != null && $$4 >= $$1 && $$4 <= $$1 + this.j.c && $$5 >= $$6 && $$5 <= $$6 + this.j.d) {
                  fvx.this.b(this.k);
               }
            }
         }

         private void a(flj $$0, int $$1, int $$2, int $$3) {
            int $$5 = $$1 + ($$3 - 8) / 2;
            $$0.a(gjh::B, fvx.a, $$2, $$5, 9, 8);
         }

         private int e() {
            int $$0 = this.j != null ? this.j.c + 4 : 0;
            return a.this.b() - this.f() - 4 - $$0;
         }

         private int f() {
            return this.m ? 11 : 0;
         }

         @Override
         public xl a() {
            return (xl)(this.b() ? xl.a("narrator.select", this.h) : this.h);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(null);
            return this.h();
         }

         @Override
         public boolean a(int $$0, int $$1, int $$2) {
            return fpz.a($$0) ? this.h() : false;
         }

         @Override
         public boolean b() {
            return fvx.this.x.b(this.f);
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
               fvx.this.x.a(this.f);
               fvx.this.E();
               return true;
            } else {
               return false;
            }
         }
      }

      public class e extends fvx.a.b {
         private static final int b = 12;
         private static final int c = 4;
         private final xl d;
         private final Supplier<gzu> e;
         private final boolean f;

         public e(final GameProfile $$1, final xl $$2, final boolean $$3) {
            this.d = $$2;
            this.f = $$3;
            this.e = a.this.c.an().a($$1);
         }

         @Override
         public void a(flj $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            int $$10 = $$3 - 12 + 4;
            int $$11 = $$2 + ($$5 - 12) / 2;
            fmv.a($$0, this.e.get(), $$10, $$11, 12);
            int $$12 = $$2 + 1 + ($$5 - 9) / 2;
            $$0.b(fvx.this.p, this.d, $$10 + 12 + 4, $$12, this.f ? -1 : -1593835521);
         }
      }

      public class f extends fvx.a.b {
         @Override
         public void a(flj $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         }
      }
   }
}
