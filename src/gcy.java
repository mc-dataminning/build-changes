import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import java.util.List;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class gcy extends fyn {
   static final alg a = alg.b("icon/checkmark");
   private static final wy b = wy.c("gui.chatSelection.title");
   private static final wy c = wy.c("gui.chatSelection.context");
   @Nullable
   private final fyn d;
   private final glu s;
   private fsv u;
   private fto v;
   @Nullable
   private gcy.a w;
   final gln.a x;
   private final Consumer<gln.a> y;
   private gcx z;

   public gcy(@Nullable fyn $$0, glu $$1, gln.a $$2, Consumer<gln.a> $$3) {
      super(b);
      this.d = $$0;
      this.s = $$1;
      this.x = $$2.d();
      this.y = $$3;
   }

   @Override
   protected void aO_() {
      this.z = new gcx(this.s, this::a);
      this.v = fto.a(this.p, c, this.n - 16);
      this.w = this.c(new gcy.a(this.m, (this.v.a() + 1) * 9));
      this.c(fsv.a(wx.k, $$0 -> this.aL_()).a(this.n / 2 - 155, this.o - 32, 150, 20).a());
      this.u = this.c(fsv.a(wx.d, $$0 -> {
         this.y.accept(this.x);
         this.aL_();
      }).a(this.n / 2 - 155 + 160, this.o - 32, 150, 20).a());
      this.F();
      this.m();
      this.w.a((double)this.w.i());
   }

   private boolean a(glj $$0) {
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
   public void a(fsh $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 10, -1);
      AbuseReportLimits $$4 = this.s.a().b();
      int $$5 = this.x.a().size();
      int $$6 = $$4.maxReportedMessageCount();
      wy $$7 = wy.a("gui.chatSelection.selected", $$5, $$6);
      $$0.a(this.p, $$7, this.n / 2, 26, -1);
      this.v.a($$0, this.n / 2, this.w.c());
   }

   @Override
   public void aL_() {
      this.m.a(this.d);
   }

   @Override
   public wy i() {
      return wx.a(super.i(), c);
   }

   public class a extends ftr<gcy.a.b> implements gcx.a {
      @Nullable
      private gcy.a.c m;

      public a(final fpo $$1, final int $$2) {
         super($$1, gcy.this.n, gcy.this.o - $$2 - 80, 40, 16);
      }

      @Override
      public void a(double $$0) {
         double $$1 = this.g();
         super.a($$0);
         if ((float)this.i() > 1.0E-5F && $$0 <= 1.0E-5F && !azm.b($$0, $$1)) {
            gcy.this.E();
         }
      }

      @Override
      public void a(int $$0, glj.a $$1) {
         boolean $$2 = $$1.a(gcy.this.x.f());
         glh $$3 = $$1.h();
         fpi $$4 = $$3.a($$1.g());
         gcy.a.b $$5 = new gcy.a.d($$0, $$1.b(), $$1.c(), $$4, $$2, true);
         this.c($$5);
         this.a($$1, $$2);
      }

      private void a(glj.a $$0, boolean $$1) {
         gcy.a.b $$2 = new gcy.a.e($$0.f(), $$0.d(), $$1);
         this.c($$2);
         gcy.a.c $$3 = new gcy.a.c($$0.e(), $$2);
         if (this.m != null && this.m.a($$3)) {
            this.d(this.m.b());
         }

         this.m = $$3;
      }

      @Override
      public void a(wy $$0) {
         this.c(new gcy.a.f());
         this.c(new gcy.a.a($$0));
         this.c(new gcy.a.f());
         this.m = null;
      }

      @Override
      public int a() {
         return Math.min(350, this.g - 50);
      }

      public int b() {
         return azm.e(this.h, this.d);
      }

      @Override
      protected void a(fsh $$0, int $$1, int $$2, float $$3, int $$4, int $$5, int $$6, int $$7, int $$8) {
         gcy.a.b $$9 = this.b($$4);
         if (this.b($$9)) {
            boolean $$10 = this.p() == $$9;
            int $$11 = this.aJ_() && $$10 ? -1 : -8355712;
            this.a($$0, $$6, $$7, $$8, $$11, -16777216);
         }

         $$9.a($$0, $$4, $$6, $$5, $$7, $$8, $$1, $$2, this.x() == $$9, $$3);
      }

      private boolean b(gcy.a.b $$0) {
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
      protected gcy.a.b c(fxa $$0) {
         return this.a($$0, gcy.a.b::c);
      }

      public void a(@Nullable gcy.a.b $$0) {
         super.a($$0);
         gcy.a.b $$1 = this.c(fxa.a);
         if ($$1 == null) {
            gcy.this.E();
         }
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         gcy.a.b $$3 = this.p();
         return $$3 != null && $$3.a($$0, $$1, $$2) ? true : super.a($$0, $$1, $$2);
      }

      public int c() {
         return this.I() + 9;
      }

      public class a extends gcy.a.b {
         private final wy b;

         public a(final wy $$1) {
            this.b = $$1;
         }

         @Override
         public void a(fsh $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            int $$10 = $$2 + $$5 / 2;
            int $$11 = $$3 + $$4 - 8;
            int $$12 = gcy.this.p.a(this.b);
            int $$13 = ($$3 + $$11 - $$12) / 2;
            int $$14 = $$10 - 9 / 2;
            $$0.b(gcy.this.p, this.b, $$13, $$14, -6250336);
         }

         @Override
         public wy a() {
            return this.b;
         }
      }

      public abstract static class b extends ftr.a<gcy.a.b> {
         @Override
         public wy a() {
            return wx.a;
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

      static record c(UUID a, gcy.a.b b) {
         public boolean a(gcy.a.c $$0) {
            return $$0.a.equals(this.a);
         }
      }

      public class d extends gcy.a.b {
         private static final int b = 9;
         private static final int c = 8;
         private static final int d = 11;
         private static final int e = 4;
         private final int f;
         private final xd g;
         private final wy h;
         @Nullable
         private final List<ayy> i;
         @Nullable
         private final fpi.a j;
         @Nullable
         private final List<ayy> k;
         private final boolean l;
         private final boolean m;

         public d(final int $$1, final wy $$2, final wy $$3, @Nullable final fpi $$4, final boolean $$5, final boolean $$6) {
            this.f = $$1;
            this.j = y.a($$4, fpi::f);
            this.k = $$4 != null && $$4.g() != null ? gcy.this.p.c($$4.g(), a.this.a()) : null;
            this.l = $$5;
            this.m = $$6;
            xd $$7 = gcy.this.p.a($$2, this.e() - gcy.this.p.a(wx.u));
            if ($$2 != $$7) {
               this.g = xd.a($$7, wx.u);
               this.i = gcy.this.p.c($$2, a.this.a());
            } else {
               this.g = $$2;
               this.i = null;
            }

            this.h = $$3;
         }

         @Override
         public void a(fsh $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            if (this.b() && this.l) {
               this.a($$0, $$2, $$3, $$5);
            }

            int $$10 = $$3 + this.g();
            int $$11 = $$2 + 1 + ($$5 - 9) / 2;
            $$0.b(gcy.this.p, tu.a().a(this.g), $$10, $$11, this.l ? -1 : -1593835521);
            if (this.i != null && $$8) {
               gcy.this.b(this.i);
            }

            int $$12 = gcy.this.p.a(this.g);
            this.a($$0, $$10 + $$12 + 4, $$2, $$5, $$6, $$7);
         }

         private void a(fsh $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
            if (this.j != null) {
               int $$6 = $$2 + ($$3 - this.j.d) / 2;
               this.j.a($$0, $$1, $$6);
               if (this.k != null && $$4 >= $$1 && $$4 <= $$1 + this.j.c && $$5 >= $$6 && $$5 <= $$6 + this.j.d) {
                  gcy.this.b(this.k);
               }
            }
         }

         private void a(fsh $$0, int $$1, int $$2, int $$3) {
            int $$5 = $$1 + ($$3 - 8) / 2;
            $$0.a(gqx::H, gcy.a, $$2, $$5, 9, 8);
         }

         private int e() {
            int $$0 = this.j != null ? this.j.c + 4 : 0;
            return a.this.a() - this.g() - 4 - $$0;
         }

         private int g() {
            return this.m ? 11 : 0;
         }

         @Override
         public wy a() {
            return (wy)(this.b() ? wy.a("narrator.select", this.h) : this.h);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(null);
            return this.h();
         }

         @Override
         public boolean a(int $$0, int $$1, int $$2) {
            return fwx.a($$0) ? this.h() : false;
         }

         @Override
         public boolean b() {
            return gcy.this.x.b(this.f);
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
               gcy.this.x.a(this.f);
               gcy.this.F();
               return true;
            } else {
               return false;
            }
         }
      }

      public class e extends gcy.a.b {
         private static final int b = 12;
         private static final int c = 4;
         private final wy d;
         private final Supplier<hkl> e;
         private final boolean f;

         public e(final GameProfile $$1, final wy $$2, final boolean $$3) {
            this.d = $$2;
            this.f = $$3;
            this.e = a.this.c.an().a($$1);
         }

         @Override
         public void a(fsh $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            int $$10 = $$3 - 12 + 4;
            int $$11 = $$2 + ($$5 - 12) / 2;
            ftu.a($$0, this.e.get(), $$10, $$11, 12);
            int $$12 = $$2 + 1 + ($$5 - 9) / 2;
            $$0.b(gcy.this.p, this.d, $$10 + 12 + 4, $$12, this.f ? -1 : -1593835521);
         }
      }

      public static class f extends gcy.a.b {
         @Override
         public void a(fsh $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         }
      }
   }
}
