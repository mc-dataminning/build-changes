import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import java.util.List;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class gaq extends fwf {
   static final ald a = ald.b("icon/checkmark");
   private static final wv b = wv.c("gui.chatSelection.title");
   private static final wv c = wv.c("gui.chatSelection.context");
   @Nullable
   private final fwf d;
   private final gji s;
   private fqn u;
   private frg v;
   @Nullable
   private gaq.a w;
   final gjb.a x;
   private final Consumer<gjb.a> y;
   private gap z;

   public gaq(@Nullable fwf $$0, gji $$1, gjb.a $$2, Consumer<gjb.a> $$3) {
      super(b);
      this.d = $$0;
      this.s = $$1;
      this.x = $$2.d();
      this.y = $$3;
   }

   @Override
   protected void aN_() {
      this.z = new gap(this.s, this::a);
      this.v = frg.a(this.p, c, this.n - 16);
      this.w = this.c(new gaq.a(this.m, (this.v.a() + 1) * 9));
      this.c(fqn.a(wu.k, $$0 -> this.aK_()).a(this.n / 2 - 155, this.o - 32, 150, 20).a());
      this.u = this.c(fqn.a(wu.d, $$0 -> {
         this.y.accept(this.x);
         this.aK_();
      }).a(this.n / 2 - 155 + 160, this.o - 32, 150, 20).a());
      this.F();
      this.m();
      this.w.a((double)this.w.i());
   }

   private boolean a(gix $$0) {
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
   public void a(fpz $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 10, -1);
      AbuseReportLimits $$4 = this.s.a().b();
      int $$5 = this.x.a().size();
      int $$6 = $$4.maxReportedMessageCount();
      wv $$7 = wv.a("gui.chatSelection.selected", $$5, $$6);
      $$0.a(this.p, $$7, this.n / 2, 26, -1);
      this.v.a($$0, this.n / 2, this.w.c());
   }

   @Override
   public void aK_() {
      this.m.a(this.d);
   }

   @Override
   public wv i() {
      return wu.a(super.i(), c);
   }

   public class a extends frj<gaq.a.b> implements gap.a {
      @Nullable
      private gaq.a.c m;

      public a(final fnd $$1, final int $$2) {
         super($$1, gaq.this.n, gaq.this.o - $$2 - 80, 40, 16);
      }

      @Override
      public void a(double $$0) {
         double $$1 = this.g();
         super.a($$0);
         if ((float)this.i() > 1.0E-5F && $$0 <= 1.0E-5F && !azk.b($$0, $$1)) {
            gaq.this.E();
         }
      }

      @Override
      public void a(int $$0, gix.a $$1) {
         boolean $$2 = $$1.a(gaq.this.x.f());
         giv $$3 = $$1.h();
         fmx $$4 = $$3.a($$1.g());
         gaq.a.b $$5 = new gaq.a.d($$0, $$1.b(), $$1.c(), $$4, $$2, true);
         this.c($$5);
         this.a($$1, $$2);
      }

      private void a(gix.a $$0, boolean $$1) {
         gaq.a.b $$2 = new gaq.a.e($$0.f(), $$0.d(), $$1);
         this.c($$2);
         gaq.a.c $$3 = new gaq.a.c($$0.e(), $$2);
         if (this.m != null && this.m.a($$3)) {
            this.d(this.m.b());
         }

         this.m = $$3;
      }

      @Override
      public void a(wv $$0) {
         this.c(new gaq.a.f());
         this.c(new gaq.a.a($$0));
         this.c(new gaq.a.f());
         this.m = null;
      }

      @Override
      public int a() {
         return Math.min(350, this.g - 50);
      }

      public int b() {
         return azk.e(this.h, this.d);
      }

      @Override
      protected void a(fpz $$0, int $$1, int $$2, float $$3, int $$4, int $$5, int $$6, int $$7, int $$8) {
         gaq.a.b $$9 = this.b($$4);
         if (this.b($$9)) {
            boolean $$10 = this.p() == $$9;
            int $$11 = this.aI_() && $$10 ? -1 : -8355712;
            this.a($$0, $$6, $$7, $$8, $$11, -16777216);
         }

         $$9.a($$0, $$4, $$6, $$5, $$7, $$8, $$1, $$2, this.x() == $$9, $$3);
      }

      private boolean b(gaq.a.b $$0) {
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
      protected gaq.a.b c(fus $$0) {
         return this.a($$0, gaq.a.b::c);
      }

      public void a(@Nullable gaq.a.b $$0) {
         super.a($$0);
         gaq.a.b $$1 = this.c(fus.a);
         if ($$1 == null) {
            gaq.this.E();
         }
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         gaq.a.b $$3 = this.p();
         return $$3 != null && $$3.a($$0, $$1, $$2) ? true : super.a($$0, $$1, $$2);
      }

      public int c() {
         return this.I() + 9;
      }

      public class a extends gaq.a.b {
         private final wv b;

         public a(final wv $$1) {
            this.b = $$1;
         }

         @Override
         public void a(fpz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            int $$10 = $$2 + $$5 / 2;
            int $$11 = $$3 + $$4 - 8;
            int $$12 = gaq.this.p.a(this.b);
            int $$13 = ($$3 + $$11 - $$12) / 2;
            int $$14 = $$10 - 9 / 2;
            $$0.b(gaq.this.p, this.b, $$13, $$14, -6250336);
         }

         @Override
         public wv a() {
            return this.b;
         }
      }

      public abstract static class b extends frj.a<gaq.a.b> {
         @Override
         public wv a() {
            return wu.a;
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

      static record c(UUID a, gaq.a.b b) {
         public boolean a(gaq.a.c $$0) {
            return $$0.a.equals(this.a);
         }
      }

      public class d extends gaq.a.b {
         private static final int b = 9;
         private static final int c = 8;
         private static final int d = 11;
         private static final int e = 4;
         private final int f;
         private final xa g;
         private final wv h;
         @Nullable
         private final List<ayw> i;
         @Nullable
         private final fmx.a j;
         @Nullable
         private final List<ayw> k;
         private final boolean l;
         private final boolean m;

         public d(final int $$1, final wv $$2, final wv $$3, @Nullable final fmx $$4, final boolean $$5, final boolean $$6) {
            this.f = $$1;
            this.j = x.a($$4, fmx::f);
            this.k = $$4 != null && $$4.g() != null ? gaq.this.p.c($$4.g(), a.this.a()) : null;
            this.l = $$5;
            this.m = $$6;
            xa $$7 = gaq.this.p.a($$2, this.e() - gaq.this.p.a(wu.u));
            if ($$2 != $$7) {
               this.g = xa.a($$7, wu.u);
               this.i = gaq.this.p.c($$2, a.this.a());
            } else {
               this.g = $$2;
               this.i = null;
            }

            this.h = $$3;
         }

         @Override
         public void a(fpz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            if (this.b() && this.l) {
               this.a($$0, $$2, $$3, $$5);
            }

            int $$10 = $$3 + this.g();
            int $$11 = $$2 + 1 + ($$5 - 9) / 2;
            $$0.b(gaq.this.p, tr.a().a(this.g), $$10, $$11, this.l ? -1 : -1593835521);
            if (this.i != null && $$8) {
               gaq.this.b(this.i);
            }

            int $$12 = gaq.this.p.a(this.g);
            this.a($$0, $$10 + $$12 + 4, $$2, $$5, $$6, $$7);
         }

         private void a(fpz $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
            if (this.j != null) {
               int $$6 = $$2 + ($$3 - this.j.d) / 2;
               this.j.a($$0, $$1, $$6);
               if (this.k != null && $$4 >= $$1 && $$4 <= $$1 + this.j.c && $$5 >= $$6 && $$5 <= $$6 + this.j.d) {
                  gaq.this.b(this.k);
               }
            }
         }

         private void a(fpz $$0, int $$1, int $$2, int $$3) {
            int $$5 = $$1 + ($$3 - 8) / 2;
            $$0.a(goi::H, gaq.a, $$2, $$5, 9, 8);
         }

         private int e() {
            int $$0 = this.j != null ? this.j.c + 4 : 0;
            return a.this.a() - this.g() - 4 - $$0;
         }

         private int g() {
            return this.m ? 11 : 0;
         }

         @Override
         public wv a() {
            return (wv)(this.b() ? wv.a("narrator.select", this.h) : this.h);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(null);
            return this.h();
         }

         @Override
         public boolean a(int $$0, int $$1, int $$2) {
            return fup.a($$0) ? this.h() : false;
         }

         @Override
         public boolean b() {
            return gaq.this.x.b(this.f);
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
               gaq.this.x.a(this.f);
               gaq.this.F();
               return true;
            } else {
               return false;
            }
         }
      }

      public class e extends gaq.a.b {
         private static final int b = 12;
         private static final int c = 4;
         private final wv d;
         private final Supplier<hhu> e;
         private final boolean f;

         public e(final GameProfile $$1, final wv $$2, final boolean $$3) {
            this.d = $$2;
            this.f = $$3;
            this.e = a.this.c.an().a($$1);
         }

         @Override
         public void a(fpz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            int $$10 = $$3 - 12 + 4;
            int $$11 = $$2 + ($$5 - 12) / 2;
            frm.a($$0, this.e.get(), $$10, $$11, 12);
            int $$12 = $$2 + 1 + ($$5 - 9) / 2;
            $$0.b(gaq.this.p, this.d, $$10 + 12 + 4, $$12, this.f ? -1 : -1593835521);
         }
      }

      public static class f extends gaq.a.b {
         @Override
         public void a(fpz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         }
      }
   }
}
