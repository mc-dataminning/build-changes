import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import java.util.List;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fva extends fqs {
   static final alh a = alh.b("icon/checkmark");
   private static final xh b = xh.c("gui.chatSelection.title");
   private static final xh c = xh.c("gui.chatSelection.context");
   @Nullable
   private final fqs d;
   private final gdf s;
   private fkz u;
   private fls v;
   @Nullable
   private fva.a w;
   final gcy.a x;
   private final Consumer<gcy.a> y;
   private fuz z;

   public fva(@Nullable fqs $$0, gdf $$1, gcy.a $$2, Consumer<gcy.a> $$3) {
      super(b);
      this.d = $$0;
      this.s = $$1;
      this.x = $$2.d();
      this.y = $$3;
   }

   @Override
   protected void aS_() {
      this.z = new fuz(this.s, this::a);
      this.v = fls.a(this.p, c, this.n - 16);
      this.w = this.c(new fva.a(this.m, (this.v.a() + 1) * 9));
      this.c(fkz.a(xg.k, $$0 -> this.d()).a(this.n / 2 - 155, this.o - 32, 150, 20).a());
      this.u = this.c(fkz.a(xg.d, $$0 -> {
         this.y.accept(this.x);
         this.d();
      }).a(this.n / 2 - 155 + 160, this.o - 32, 150, 20).a());
      this.E();
      this.m();
      this.w.b((double)this.w.p());
   }

   private boolean a(gcu $$0) {
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
   public void a(fkm $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 10, 16777215);
      AbuseReportLimits $$4 = this.s.a().b();
      int $$5 = this.x.a().size();
      int $$6 = $$4.maxReportedMessageCount();
      xh $$7 = xh.a("gui.chatSelection.selected", $$5, $$6);
      $$0.a(this.p, $$7, this.n / 2, 16 + 9 * 3 / 2, -1);
      this.v.a($$0, this.n / 2, this.w.J());
   }

   @Override
   public void d() {
      this.m.a(this.d);
   }

   @Override
   public xh i() {
      return xg.a(super.i(), c);
   }

   public class a extends flv<fva.a.b> implements fuz.a {
      @Nullable
      private fva.a.c m;

      public a(final fja $$1, final int $$2) {
         super($$1, fva.this.n, fva.this.o - $$2 - 80, 40, 16);
      }

      @Override
      public void b(double $$0) {
         double $$1 = this.n();
         super.b($$0);
         if ((float)this.p() > 1.0E-5F && $$0 <= 1.0E-5F && !azj.b($$0, $$1)) {
            fva.this.D();
         }
      }

      @Override
      public void a(int $$0, gcu.a $$1) {
         boolean $$2 = $$1.a(fva.this.x.f());
         gcs $$3 = $$1.h();
         fiu $$4 = $$3.a($$1.g());
         fva.a.b $$5 = new fva.a.d($$0, $$1.b(), $$1.c(), $$4, $$2, true);
         this.c($$5);
         this.a($$1, $$2);
      }

      private void a(gcu.a $$0, boolean $$1) {
         fva.a.b $$2 = new fva.a.e($$0.f(), $$0.d(), $$1);
         this.c($$2);
         fva.a.c $$3 = new fva.a.c($$0.e(), $$2);
         if (this.m != null && this.m.a($$3)) {
            this.d(this.m.b());
         }

         this.m = $$3;
      }

      @Override
      public void a(xh $$0) {
         this.c(new fva.a.f());
         this.c(new fva.a.a($$0));
         this.c(new fva.a.f());
         this.m = null;
      }

      @Override
      public int b() {
         return Math.min(350, this.g - 50);
      }

      @Override
      public int c() {
         return azj.e(this.h, this.d);
      }

      @Override
      protected void a(fkm $$0, int $$1, int $$2, float $$3, int $$4, int $$5, int $$6, int $$7, int $$8) {
         fva.a.b $$9 = this.d($$4);
         if (this.b($$9)) {
            boolean $$10 = this.h() == $$9;
            int $$11 = this.aN_() && $$10 ? -1 : -8355712;
            this.a($$0, $$6, $$7, $$8, $$11, -16777216);
         }

         $$9.a($$0, $$4, $$6, $$5, $$7, $$8, $$1, $$2, this.v() == $$9, $$3);
      }

      private boolean b(fva.a.b $$0) {
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
      protected fva.a.b b(fpf $$0) {
         return this.a($$0, fva.a.b::c);
      }

      public void a(@Nullable fva.a.b $$0) {
         super.a($$0);
         fva.a.b $$1 = this.b(fpf.a);
         if ($$1 == null) {
            fva.this.D();
         }
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         fva.a.b $$3 = this.h();
         return $$3 != null && $$3.a($$0, $$1, $$2) ? true : super.a($$0, $$1, $$2);
      }

      @Override
      public int J() {
         return this.G() + 9;
      }

      public class a extends fva.a.b {
         private final xh b;

         public a(final xh $$1) {
            this.b = $$1;
         }

         @Override
         public void a(fkm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            int $$10 = $$2 + $$5 / 2;
            int $$11 = $$3 + $$4 - 8;
            int $$12 = fva.this.p.a(this.b);
            int $$13 = ($$3 + $$11 - $$12) / 2;
            int $$14 = $$10 - 9 / 2;
            $$0.b(fva.this.p, this.b, $$13, $$14, -6250336);
         }

         @Override
         public xh a() {
            return this.b;
         }
      }

      public abstract class b extends flv.a<fva.a.b> {
         @Override
         public xh a() {
            return xg.a;
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

      static record c(UUID a, fva.a.b b) {
         public boolean a(fva.a.c $$0) {
            return $$0.a.equals(this.a);
         }
      }

      public class d extends fva.a.b {
         private static final int b = 9;
         private static final int c = 8;
         private static final int d = 11;
         private static final int e = 4;
         private final int f;
         private final xm g;
         private final xh h;
         @Nullable
         private final List<ayv> i;
         @Nullable
         private final fiu.a j;
         @Nullable
         private final List<ayv> k;
         private final boolean l;
         private final boolean m;

         public d(final int $$1, final xh $$2, final xh $$3, @Nullable final fiu $$4, final boolean $$5, final boolean $$6) {
            this.f = $$1;
            this.j = x.a($$4, fiu::f);
            this.k = $$4 != null && $$4.g() != null ? fva.this.p.c($$4.g(), a.this.b()) : null;
            this.l = $$5;
            this.m = $$6;
            xm $$7 = fva.this.p.a($$2, this.e() - fva.this.p.a(xg.u));
            if ($$2 != $$7) {
               this.g = xm.a($$7, xg.u);
               this.i = fva.this.p.c($$2, a.this.b());
            } else {
               this.g = $$2;
               this.i = null;
            }

            this.h = $$3;
         }

         @Override
         public void a(fkm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            if (this.b() && this.l) {
               this.a($$0, $$2, $$3, $$5);
            }

            int $$10 = $$3 + this.f();
            int $$11 = $$2 + 1 + ($$5 - 9) / 2;
            $$0.b(fva.this.p, ue.a().a(this.g), $$10, $$11, this.l ? -1 : -1593835521);
            if (this.i != null && $$8) {
               fva.this.b(this.i);
            }

            int $$12 = fva.this.p.a(this.g);
            this.a($$0, $$10 + $$12 + 4, $$2, $$5, $$6, $$7);
         }

         private void a(fkm $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
            if (this.j != null) {
               int $$6 = $$2 + ($$3 - this.j.d) / 2;
               this.j.a($$0, $$1, $$6);
               if (this.k != null && $$4 >= $$1 && $$4 <= $$1 + this.j.c && $$5 >= $$6 && $$5 <= $$6 + this.j.d) {
                  fva.this.b(this.k);
               }
            }
         }

         private void a(fkm $$0, int $$1, int $$2, int $$3) {
            int $$5 = $$1 + ($$3 - 8) / 2;
            $$0.a(gig::B, fva.a, $$2, $$5, 9, 8);
         }

         private int e() {
            int $$0 = this.j != null ? this.j.c + 4 : 0;
            return a.this.b() - this.f() - 4 - $$0;
         }

         private int f() {
            return this.m ? 11 : 0;
         }

         @Override
         public xh a() {
            return (xh)(this.b() ? xh.a("narrator.select", this.h) : this.h);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(null);
            return this.h();
         }

         @Override
         public boolean a(int $$0, int $$1, int $$2) {
            return fpc.a($$0) ? this.h() : false;
         }

         @Override
         public boolean b() {
            return fva.this.x.b(this.f);
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
               fva.this.x.a(this.f);
               fva.this.E();
               return true;
            } else {
               return false;
            }
         }
      }

      public class e extends fva.a.b {
         private static final int b = 12;
         private static final int c = 4;
         private final xh d;
         private final Supplier<gyt> e;
         private final boolean f;

         public e(final GameProfile $$1, final xh $$2, final boolean $$3) {
            this.d = $$2;
            this.f = $$3;
            this.e = a.this.c.an().a($$1);
         }

         @Override
         public void a(fkm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            int $$10 = $$3 - 12 + 4;
            int $$11 = $$2 + ($$5 - 12) / 2;
            fly.a($$0, this.e.get(), $$10, $$11, 12);
            int $$12 = $$2 + 1 + ($$5 - 9) / 2;
            $$0.b(fva.this.p, this.d, $$10 + 12 + 4, $$12, this.f ? -1 : -1593835521);
         }
      }

      public class f extends fva.a.b {
         @Override
         public void a(fkm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         }
      }
   }
}
