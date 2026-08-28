import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import java.util.List;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fyu extends ful {
   static final akv a = akv.b("icon/checkmark");
   private static final wp b = wp.c("gui.chatSelection.title");
   private static final wp c = wp.c("gui.chatSelection.context");
   @Nullable
   private final ful d;
   private final ghi s;
   private fot u;
   private fpm v;
   @Nullable
   private fyu.a w;
   final ghb.a x;
   private final Consumer<ghb.a> y;
   private fyt z;

   public fyu(@Nullable ful $$0, ghi $$1, ghb.a $$2, Consumer<ghb.a> $$3) {
      super(b);
      this.d = $$0;
      this.s = $$1;
      this.x = $$2.d();
      this.y = $$3;
   }

   @Override
   protected void aR_() {
      this.z = new fyt(this.s, this::a);
      this.v = fpm.a(this.p, c, this.n - 16);
      this.w = this.c(new fyu.a(this.m, (this.v.a() + 1) * 9));
      this.c(fot.a(wo.k, $$0 -> this.aO_()).a(this.n / 2 - 155, this.o - 32, 150, 20).a());
      this.u = this.c(fot.a(wo.d, $$0 -> {
         this.y.accept(this.x);
         this.aO_();
      }).a(this.n / 2 - 155 + 160, this.o - 32, 150, 20).a());
      this.F();
      this.m();
      this.w.a((double)this.w.i());
   }

   private boolean a(ggx $$0) {
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
   public void a(foe $$0, int $$1, int $$2, float $$3) {
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

   public class a extends fpp<fyu.a.b> implements fyt.a {
      @Nullable
      private fyu.a.c m;

      public a(final flj $$1, final int $$2) {
         super($$1, fyu.this.n, fyu.this.o - $$2 - 80, 40, 16);
      }

      @Override
      public void a(double $$0) {
         double $$1 = this.g();
         super.a($$0);
         if ((float)this.i() > 1.0E-5F && $$0 <= 1.0E-5F && !ayz.b($$0, $$1)) {
            fyu.this.E();
         }
      }

      @Override
      public void a(int $$0, ggx.a $$1) {
         boolean $$2 = $$1.a(fyu.this.x.f());
         ggv $$3 = $$1.h();
         fld $$4 = $$3.a($$1.g());
         fyu.a.b $$5 = new fyu.a.d($$0, $$1.b(), $$1.c(), $$4, $$2, true);
         this.c($$5);
         this.a($$1, $$2);
      }

      private void a(ggx.a $$0, boolean $$1) {
         fyu.a.b $$2 = new fyu.a.e($$0.f(), $$0.d(), $$1);
         this.c($$2);
         fyu.a.c $$3 = new fyu.a.c($$0.e(), $$2);
         if (this.m != null && this.m.a($$3)) {
            this.d(this.m.b());
         }

         this.m = $$3;
      }

      @Override
      public void a(wp $$0) {
         this.c(new fyu.a.f());
         this.c(new fyu.a.a($$0));
         this.c(new fyu.a.f());
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
      protected void a(foe $$0, int $$1, int $$2, float $$3, int $$4, int $$5, int $$6, int $$7, int $$8) {
         fyu.a.b $$9 = this.b($$4);
         if (this.b($$9)) {
            boolean $$10 = this.p() == $$9;
            int $$11 = this.aM_() && $$10 ? -1 : -8355712;
            this.a($$0, $$6, $$7, $$8, $$11, -16777216);
         }

         $$9.a($$0, $$4, $$6, $$5, $$7, $$8, $$1, $$2, this.x() == $$9, $$3);
      }

      private boolean b(fyu.a.b $$0) {
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
      protected fyu.a.b c(fsy $$0) {
         return this.a($$0, fyu.a.b::c);
      }

      public void a(@Nullable fyu.a.b $$0) {
         super.a($$0);
         fyu.a.b $$1 = this.c(fsy.a);
         if ($$1 == null) {
            fyu.this.E();
         }
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         fyu.a.b $$3 = this.p();
         return $$3 != null && $$3.a($$0, $$1, $$2) ? true : super.a($$0, $$1, $$2);
      }

      public int c() {
         return this.I() + 9;
      }

      public class a extends fyu.a.b {
         private final wp b;

         public a(final wp $$1) {
            this.b = $$1;
         }

         @Override
         public void a(foe $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            int $$10 = $$2 + $$5 / 2;
            int $$11 = $$3 + $$4 - 8;
            int $$12 = fyu.this.p.a(this.b);
            int $$13 = ($$3 + $$11 - $$12) / 2;
            int $$14 = $$10 - 9 / 2;
            $$0.b(fyu.this.p, this.b, $$13, $$14, -6250336);
         }

         @Override
         public wp a() {
            return this.b;
         }
      }

      public abstract static class b extends fpp.a<fyu.a.b> {
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

      static record c(UUID a, fyu.a.b b) {
         public boolean a(fyu.a.c $$0) {
            return $$0.a.equals(this.a);
         }
      }

      public class d extends fyu.a.b {
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
         private final fld.a j;
         @Nullable
         private final List<ayl> k;
         private final boolean l;
         private final boolean m;

         public d(final int $$1, final wp $$2, final wp $$3, @Nullable final fld $$4, final boolean $$5, final boolean $$6) {
            this.f = $$1;
            this.j = x.a($$4, fld::f);
            this.k = $$4 != null && $$4.g() != null ? fyu.this.p.c($$4.g(), a.this.a()) : null;
            this.l = $$5;
            this.m = $$6;
            wu $$7 = fyu.this.p.a($$2, this.e() - fyu.this.p.a(wo.u));
            if ($$2 != $$7) {
               this.g = wu.a($$7, wo.u);
               this.i = fyu.this.p.c($$2, a.this.a());
            } else {
               this.g = $$2;
               this.i = null;
            }

            this.h = $$3;
         }

         @Override
         public void a(foe $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            if (this.b() && this.l) {
               this.a($$0, $$2, $$3, $$5);
            }

            int $$10 = $$3 + this.g();
            int $$11 = $$2 + 1 + ($$5 - 9) / 2;
            $$0.b(fyu.this.p, tl.a().a(this.g), $$10, $$11, this.l ? -1 : -1593835521);
            if (this.i != null && $$8) {
               fyu.this.b(this.i);
            }

            int $$12 = fyu.this.p.a(this.g);
            this.a($$0, $$10 + $$12 + 4, $$2, $$5, $$6, $$7);
         }

         private void a(foe $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
            if (this.j != null) {
               int $$6 = $$2 + ($$3 - this.j.d) / 2;
               this.j.a($$0, $$1, $$6);
               if (this.k != null && $$4 >= $$1 && $$4 <= $$1 + this.j.c && $$5 >= $$6 && $$5 <= $$6 + this.j.d) {
                  fyu.this.b(this.k);
               }
            }
         }

         private void a(foe $$0, int $$1, int $$2, int $$3) {
            int $$5 = $$1 + ($$3 - 8) / 2;
            $$0.a(gmi::H, fyu.a, $$2, $$5, 9, 8);
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
            return fsv.a($$0) ? this.h() : false;
         }

         @Override
         public boolean b() {
            return fyu.this.x.b(this.f);
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
               fyu.this.x.a(this.f);
               fyu.this.F();
               return true;
            } else {
               return false;
            }
         }
      }

      public class e extends fyu.a.b {
         private static final int b = 12;
         private static final int c = 4;
         private final wp d;
         private final Supplier<hfu> e;
         private final boolean f;

         public e(final GameProfile $$1, final wp $$2, final boolean $$3) {
            this.d = $$2;
            this.f = $$3;
            this.e = a.this.c.an().a($$1);
         }

         @Override
         public void a(foe $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            int $$10 = $$3 - 12 + 4;
            int $$11 = $$2 + ($$5 - 12) / 2;
            fps.a($$0, this.e.get(), $$10, $$11, 12);
            int $$12 = $$2 + 1 + ($$5 - 9) / 2;
            $$0.b(fyu.this.p, this.d, $$10 + 12 + 4, $$12, this.f ? -1 : -1593835521);
         }
      }

      public static class f extends fyu.a.b {
         @Override
         public void a(foe $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         }
      }
   }
}
