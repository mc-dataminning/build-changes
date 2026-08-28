import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import java.util.List;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class ful extends fqd {
   static final alc a = alc.b("icon/checkmark");
   private static final xd b = xd.c("gui.chatSelection.title");
   private static final xd c = xd.c("gui.chatSelection.context");
   @Nullable
   private final fqd d;
   private final gcp s;
   private fkk u;
   private fld v;
   @Nullable
   private ful.a w;
   final gci.a x;
   private final Consumer<gci.a> y;
   private fuk z;

   public ful(@Nullable fqd $$0, gcp $$1, gci.a $$2, Consumer<gci.a> $$3) {
      super(b);
      this.d = $$0;
      this.s = $$1;
      this.x = $$2.d();
      this.y = $$3;
   }

   @Override
   protected void aR_() {
      this.z = new fuk(this.s, this::a);
      this.v = fld.a(this.p, c, this.n - 16);
      this.w = this.c(new ful.a(this.m, (this.v.a() + 1) * 9));
      this.c(fkk.a(xc.k, $$0 -> this.d()).a(this.n / 2 - 155, this.o - 32, 150, 20).a());
      this.u = this.c(fkk.a(xc.d, $$0 -> {
         this.y.accept(this.x);
         this.d();
      }).a(this.n / 2 - 155 + 160, this.o - 32, 150, 20).a());
      this.E();
      this.m();
      this.w.b((double)this.w.p());
   }

   private boolean a(gce $$0) {
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
   public void a(fjx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 10, 16777215);
      AbuseReportLimits $$4 = this.s.a().b();
      int $$5 = this.x.a().size();
      int $$6 = $$4.maxReportedMessageCount();
      xd $$7 = xd.a("gui.chatSelection.selected", $$5, $$6);
      $$0.a(this.p, $$7, this.n / 2, 16 + 9 * 3 / 2, -1);
      this.v.a($$0, this.n / 2, this.w.J());
   }

   @Override
   public void d() {
      this.m.a(this.d);
   }

   @Override
   public xd i() {
      return xc.a(super.i(), c);
   }

   public class a extends flg<ful.a.b> implements fuk.a {
      @Nullable
      private ful.a.c m;

      public a(final fil $$1, final int $$2) {
         super($$1, ful.this.n, ful.this.o - $$2 - 80, 40, 16);
      }

      @Override
      public void b(double $$0) {
         double $$1 = this.n();
         super.b($$0);
         if ((float)this.p() > 1.0E-5F && $$0 <= 1.0E-5F && !azd.b($$0, $$1)) {
            ful.this.D();
         }
      }

      @Override
      public void a(int $$0, gce.a $$1) {
         boolean $$2 = $$1.a(ful.this.x.f());
         gcc $$3 = $$1.h();
         fif $$4 = $$3.a($$1.g());
         ful.a.b $$5 = new ful.a.d($$0, $$1.b(), $$1.c(), $$4, $$2, true);
         this.c($$5);
         this.a($$1, $$2);
      }

      private void a(gce.a $$0, boolean $$1) {
         ful.a.b $$2 = new ful.a.e($$0.f(), $$0.d(), $$1);
         this.c($$2);
         ful.a.c $$3 = new ful.a.c($$0.e(), $$2);
         if (this.m != null && this.m.a($$3)) {
            this.d(this.m.b());
         }

         this.m = $$3;
      }

      @Override
      public void a(xd $$0) {
         this.c(new ful.a.f());
         this.c(new ful.a.a($$0));
         this.c(new ful.a.f());
         this.m = null;
      }

      @Override
      public int b() {
         return Math.min(350, this.g - 50);
      }

      @Override
      public int c() {
         return azd.e(this.h, this.d);
      }

      @Override
      protected void a(fjx $$0, int $$1, int $$2, float $$3, int $$4, int $$5, int $$6, int $$7, int $$8) {
         ful.a.b $$9 = this.d($$4);
         if (this.b($$9)) {
            boolean $$10 = this.h() == $$9;
            int $$11 = this.aM_() && $$10 ? -1 : -8355712;
            this.a($$0, $$6, $$7, $$8, $$11, -16777216);
         }

         $$9.a($$0, $$4, $$6, $$5, $$7, $$8, $$1, $$2, this.v() == $$9, $$3);
      }

      private boolean b(ful.a.b $$0) {
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
      protected ful.a.b b(fop $$0) {
         return this.a($$0, ful.a.b::c);
      }

      public void a(@Nullable ful.a.b $$0) {
         super.a($$0);
         ful.a.b $$1 = this.b(fop.a);
         if ($$1 == null) {
            ful.this.D();
         }
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         ful.a.b $$3 = this.h();
         return $$3 != null && $$3.a($$0, $$1, $$2) ? true : super.a($$0, $$1, $$2);
      }

      @Override
      public int J() {
         return this.G() + 9;
      }

      public class a extends ful.a.b {
         private final xd b;

         public a(final xd $$1) {
            this.b = $$1;
         }

         @Override
         public void a(fjx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            int $$10 = $$2 + $$5 / 2;
            int $$11 = $$3 + $$4 - 8;
            int $$12 = ful.this.p.a(this.b);
            int $$13 = ($$3 + $$11 - $$12) / 2;
            int $$14 = $$10 - 9 / 2;
            $$0.b(ful.this.p, this.b, $$13, $$14, -6250336);
         }

         @Override
         public xd a() {
            return this.b;
         }
      }

      public abstract class b extends flg.a<ful.a.b> {
         @Override
         public xd a() {
            return xc.a;
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

      static record c(UUID a, ful.a.b b) {
         public boolean a(ful.a.c $$0) {
            return $$0.a.equals(this.a);
         }
      }

      public class d extends ful.a.b {
         private static final int b = 9;
         private static final int c = 8;
         private static final int d = 11;
         private static final int e = 4;
         private final int f;
         private final xi g;
         private final xd h;
         @Nullable
         private final List<ayp> i;
         @Nullable
         private final fif.a j;
         @Nullable
         private final List<ayp> k;
         private final boolean l;
         private final boolean m;

         public d(final int $$1, final xd $$2, final xd $$3, @Nullable final fif $$4, final boolean $$5, final boolean $$6) {
            this.f = $$1;
            this.j = x.a($$4, fif::f);
            this.k = $$4 != null && $$4.g() != null ? ful.this.p.c($$4.g(), a.this.b()) : null;
            this.l = $$5;
            this.m = $$6;
            xi $$7 = ful.this.p.a($$2, this.e() - ful.this.p.a(xc.u));
            if ($$2 != $$7) {
               this.g = xi.a($$7, xc.u);
               this.i = ful.this.p.c($$2, a.this.b());
            } else {
               this.g = $$2;
               this.i = null;
            }

            this.h = $$3;
         }

         @Override
         public void a(fjx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            if (this.b() && this.l) {
               this.a($$0, $$2, $$3, $$5);
            }

            int $$10 = $$3 + this.f();
            int $$11 = $$2 + 1 + ($$5 - 9) / 2;
            $$0.b(ful.this.p, ua.a().a(this.g), $$10, $$11, this.l ? -1 : -1593835521);
            if (this.i != null && $$8) {
               ful.this.b(this.i);
            }

            int $$12 = ful.this.p.a(this.g);
            this.a($$0, $$10 + $$12 + 4, $$2, $$5, $$6, $$7);
         }

         private void a(fjx $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
            if (this.j != null) {
               int $$6 = $$2 + ($$3 - this.j.d) / 2;
               this.j.a($$0, $$1, $$6);
               if (this.k != null && $$4 >= $$1 && $$4 <= $$1 + this.j.c && $$5 >= $$6 && $$5 <= $$6 + this.j.d) {
                  ful.this.b(this.k);
               }
            }
         }

         private void a(fjx $$0, int $$1, int $$2, int $$3) {
            int $$5 = $$1 + ($$3 - 8) / 2;
            $$0.a(ghq::B, ful.a, $$2, $$5, 9, 8);
         }

         private int e() {
            int $$0 = this.j != null ? this.j.c + 4 : 0;
            return a.this.b() - this.f() - 4 - $$0;
         }

         private int f() {
            return this.m ? 11 : 0;
         }

         @Override
         public xd a() {
            return (xd)(this.b() ? xd.a("narrator.select", this.h) : this.h);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(null);
            return this.h();
         }

         @Override
         public boolean a(int $$0, int $$1, int $$2) {
            return fom.a($$0) ? this.h() : false;
         }

         @Override
         public boolean b() {
            return ful.this.x.b(this.f);
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
               ful.this.x.a(this.f);
               ful.this.E();
               return true;
            } else {
               return false;
            }
         }
      }

      public class e extends ful.a.b {
         private static final int b = 12;
         private static final int c = 4;
         private final xd d;
         private final Supplier<gyc> e;
         private final boolean f;

         public e(final GameProfile $$1, final xd $$2, final boolean $$3) {
            this.d = $$2;
            this.f = $$3;
            this.e = a.this.c.an().a($$1);
         }

         @Override
         public void a(fjx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            int $$10 = $$3 - 12 + 4;
            int $$11 = $$2 + ($$5 - 12) / 2;
            flj.a($$0, this.e.get(), $$10, $$11, 12);
            int $$12 = $$2 + 1 + ($$5 - 9) / 2;
            $$0.b(ful.this.p, this.d, $$10 + 12 + 4, $$12, this.f ? -1 : -1593835521);
         }
      }

      public class f extends ful.a.b {
         @Override
         public void a(fjx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         }
      }
   }
}
