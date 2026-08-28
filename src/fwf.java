import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import java.util.List;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fwf extends frw {
   static final alj a = alj.b("icon/checkmark");
   private static final xj b = xj.c("gui.chatSelection.title");
   private static final xj c = xj.c("gui.chatSelection.context");
   @Nullable
   private final frw d;
   private final gep s;
   private fmd u;
   private fmw v;
   @Nullable
   private fwf.a w;
   final gei.a x;
   private final Consumer<gei.a> y;
   private fwe z;

   public fwf(@Nullable frw $$0, gep $$1, gei.a $$2, Consumer<gei.a> $$3) {
      super(b);
      this.d = $$0;
      this.s = $$1;
      this.x = $$2.d();
      this.y = $$3;
   }

   @Override
   protected void aR_() {
      this.z = new fwe(this.s, this::a);
      this.v = fmw.a(this.p, c, this.n - 16);
      this.w = this.c(new fwf.a(this.m, (this.v.a() + 1) * 9));
      this.c(fmd.a(xi.k, $$0 -> this.aO_()).a(this.n / 2 - 155, this.o - 32, 150, 20).a());
      this.u = this.c(fmd.a(xi.d, $$0 -> {
         this.y.accept(this.x);
         this.aO_();
      }).a(this.n / 2 - 155 + 160, this.o - 32, 150, 20).a());
      this.G();
      this.m();
      this.w.b((double)this.w.p());
   }

   private boolean a(gee $$0) {
      return $$0.a(this.x.f());
   }

   private void m() {
      int $$0 = this.w.c();
      this.z.a($$0, this.w);
   }

   void F() {
      this.m();
   }

   void G() {
      this.u.j = !this.x.a().isEmpty();
   }

   @Override
   public void a(flq $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 10, 16777215);
      AbuseReportLimits $$4 = this.s.a().b();
      int $$5 = this.x.a().size();
      int $$6 = $$4.maxReportedMessageCount();
      xj $$7 = xj.a("gui.chatSelection.selected", $$5, $$6);
      $$0.a(this.p, $$7, this.n / 2, 16 + 9 * 3 / 2, -1);
      this.v.a($$0, this.n / 2, this.w.J());
   }

   @Override
   public void aO_() {
      this.m.a(this.d);
   }

   @Override
   public xj i() {
      return xi.a(super.i(), c);
   }

   public class a extends fmz<fwf.a.b> implements fwe.a {
      @Nullable
      private fwf.a.c m;

      public a(final fke $$1, final int $$2) {
         super($$1, fwf.this.n, fwf.this.o - $$2 - 80, 40, 16);
      }

      @Override
      public void b(double $$0) {
         double $$1 = this.n();
         super.b($$0);
         if ((float)this.p() > 1.0E-5F && $$0 <= 1.0E-5F && !azm.b($$0, $$1)) {
            fwf.this.F();
         }
      }

      @Override
      public void a(int $$0, gee.a $$1) {
         boolean $$2 = $$1.a(fwf.this.x.f());
         gec $$3 = $$1.h();
         fjy $$4 = $$3.a($$1.g());
         fwf.a.b $$5 = new fwf.a.d($$0, $$1.b(), $$1.c(), $$4, $$2, true);
         this.c($$5);
         this.a($$1, $$2);
      }

      private void a(gee.a $$0, boolean $$1) {
         fwf.a.b $$2 = new fwf.a.e($$0.f(), $$0.d(), $$1);
         this.c($$2);
         fwf.a.c $$3 = new fwf.a.c($$0.e(), $$2);
         if (this.m != null && this.m.a($$3)) {
            this.d(this.m.b());
         }

         this.m = $$3;
      }

      @Override
      public void a(xj $$0) {
         this.c(new fwf.a.f());
         this.c(new fwf.a.a($$0));
         this.c(new fwf.a.f());
         this.m = null;
      }

      @Override
      public int b() {
         return Math.min(350, this.g - 50);
      }

      @Override
      public int c() {
         return azm.e(this.h, this.d);
      }

      @Override
      protected void a(flq $$0, int $$1, int $$2, float $$3, int $$4, int $$5, int $$6, int $$7, int $$8) {
         fwf.a.b $$9 = this.d($$4);
         if (this.b($$9)) {
            boolean $$10 = this.h() == $$9;
            int $$11 = this.aL_() && $$10 ? -1 : -8355712;
            this.a($$0, $$6, $$7, $$8, $$11, -16777216);
         }

         $$9.a($$0, $$4, $$6, $$5, $$7, $$8, $$1, $$2, this.v() == $$9, $$3);
      }

      private boolean b(fwf.a.b $$0) {
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
      protected fwf.a.b b(fqj $$0) {
         return this.a($$0, fwf.a.b::c);
      }

      public void a(@Nullable fwf.a.b $$0) {
         super.a($$0);
         fwf.a.b $$1 = this.b(fqj.a);
         if ($$1 == null) {
            fwf.this.F();
         }
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         fwf.a.b $$3 = this.h();
         return $$3 != null && $$3.a($$0, $$1, $$2) ? true : super.a($$0, $$1, $$2);
      }

      @Override
      public int J() {
         return this.G() + 9;
      }

      public class a extends fwf.a.b {
         private final xj b;

         public a(final xj $$1) {
            this.b = $$1;
         }

         @Override
         public void a(flq $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            int $$10 = $$2 + $$5 / 2;
            int $$11 = $$3 + $$4 - 8;
            int $$12 = fwf.this.p.a(this.b);
            int $$13 = ($$3 + $$11 - $$12) / 2;
            int $$14 = $$10 - 9 / 2;
            $$0.b(fwf.this.p, this.b, $$13, $$14, -6250336);
         }

         @Override
         public xj a() {
            return this.b;
         }
      }

      public abstract class b extends fmz.a<fwf.a.b> {
         @Override
         public xj a() {
            return xi.a;
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

      static record c(UUID a, fwf.a.b b) {
         public boolean a(fwf.a.c $$0) {
            return $$0.a.equals(this.a);
         }
      }

      public class d extends fwf.a.b {
         private static final int b = 9;
         private static final int c = 8;
         private static final int d = 11;
         private static final int e = 4;
         private final int f;
         private final xo g;
         private final xj h;
         @Nullable
         private final List<ayy> i;
         @Nullable
         private final fjy.a j;
         @Nullable
         private final List<ayy> k;
         private final boolean l;
         private final boolean m;

         public d(final int $$1, final xj $$2, final xj $$3, @Nullable final fjy $$4, final boolean $$5, final boolean $$6) {
            this.f = $$1;
            this.j = x.a($$4, fjy::f);
            this.k = $$4 != null && $$4.g() != null ? fwf.this.p.c($$4.g(), a.this.b()) : null;
            this.l = $$5;
            this.m = $$6;
            xo $$7 = fwf.this.p.a($$2, this.e() - fwf.this.p.a(xi.u));
            if ($$2 != $$7) {
               this.g = xo.a($$7, xi.u);
               this.i = fwf.this.p.c($$2, a.this.b());
            } else {
               this.g = $$2;
               this.i = null;
            }

            this.h = $$3;
         }

         @Override
         public void a(flq $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            if (this.b() && this.l) {
               this.a($$0, $$2, $$3, $$5);
            }

            int $$10 = $$3 + this.f();
            int $$11 = $$2 + 1 + ($$5 - 9) / 2;
            $$0.b(fwf.this.p, ug.a().a(this.g), $$10, $$11, this.l ? -1 : -1593835521);
            if (this.i != null && $$8) {
               fwf.this.b(this.i);
            }

            int $$12 = fwf.this.p.a(this.g);
            this.a($$0, $$10 + $$12 + 4, $$2, $$5, $$6, $$7);
         }

         private void a(flq $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
            if (this.j != null) {
               int $$6 = $$2 + ($$3 - this.j.d) / 2;
               this.j.a($$0, $$1, $$6);
               if (this.k != null && $$4 >= $$1 && $$4 <= $$1 + this.j.c && $$5 >= $$6 && $$5 <= $$6 + this.j.d) {
                  fwf.this.b(this.k);
               }
            }
         }

         private void a(flq $$0, int $$1, int $$2, int $$3) {
            int $$5 = $$1 + ($$3 - 8) / 2;
            $$0.a(gjq::B, fwf.a, $$2, $$5, 9, 8);
         }

         private int e() {
            int $$0 = this.j != null ? this.j.c + 4 : 0;
            return a.this.b() - this.f() - 4 - $$0;
         }

         private int f() {
            return this.m ? 11 : 0;
         }

         @Override
         public xj a() {
            return (xj)(this.b() ? xj.a("narrator.select", this.h) : this.h);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(null);
            return this.h();
         }

         @Override
         public boolean a(int $$0, int $$1, int $$2) {
            return fqg.a($$0) ? this.h() : false;
         }

         @Override
         public boolean b() {
            return fwf.this.x.b(this.f);
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
               fwf.this.x.a(this.f);
               fwf.this.G();
               return true;
            } else {
               return false;
            }
         }
      }

      public class e extends fwf.a.b {
         private static final int b = 12;
         private static final int c = 4;
         private final xj d;
         private final Supplier<haf> e;
         private final boolean f;

         public e(final GameProfile $$1, final xj $$2, final boolean $$3) {
            this.d = $$2;
            this.f = $$3;
            this.e = a.this.c.an().a($$1);
         }

         @Override
         public void a(flq $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            int $$10 = $$3 - 12 + 4;
            int $$11 = $$2 + ($$5 - 12) / 2;
            fnc.a($$0, this.e.get(), $$10, $$11, 12);
            int $$12 = $$2 + 1 + ($$5 - 9) / 2;
            $$0.b(fwf.this.p, this.d, $$10 + 12 + 4, $$12, this.f ? -1 : -1593835521);
         }
      }

      public class f extends fwf.a.b {
         @Override
         public void a(flq $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         }
      }
   }
}
