import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import java.util.List;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class geq extends gaf {
   static final alk a = alk.b("icon/checkmark");
   private static final xc b = xc.c("gui.chatSelection.title");
   private static final xc c = xc.c("gui.chatSelection.context");
   @Nullable
   private final gaf d;
   private final gnm s;
   private fun u;
   private fvg v;
   @Nullable
   private geq.a w;
   final gnf.a x;
   private final Consumer<gnf.a> y;
   private gep z;

   public geq(@Nullable gaf $$0, gnm $$1, gnf.a $$2, Consumer<gnf.a> $$3) {
      super(b);
      this.d = $$0;
      this.s = $$1;
      this.x = $$2.d();
      this.y = $$3;
   }

   @Override
   protected void aS_() {
      this.z = new gep(this.s, this::a);
      this.v = fvg.a(this.p, c, this.n - 16);
      this.w = this.c(new geq.a(this.m, (this.v.a() + 1) * 9));
      this.c(fun.a(xb.k, $$0 -> this.aP_()).a(this.n / 2 - 155, this.o - 32, 150, 20).a());
      this.u = this.c(fun.a(xb.d, $$0 -> {
         this.y.accept(this.x);
         this.aP_();
      }).a(this.n / 2 - 155 + 160, this.o - 32, 150, 20).a());
      this.F();
      this.m();
      this.w.a((double)this.w.i());
   }

   private boolean a(gnb $$0) {
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
   public void a(ftz $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 10, -1);
      AbuseReportLimits $$4 = this.s.a().b();
      int $$5 = this.x.a().size();
      int $$6 = $$4.maxReportedMessageCount();
      xc $$7 = xc.a("gui.chatSelection.selected", $$5, $$6);
      $$0.a(this.p, $$7, this.n / 2, 26, -1);
      this.v.a($$0, this.n / 2, this.w.c());
   }

   @Override
   public void aP_() {
      this.m.a(this.d);
   }

   @Override
   public xc i() {
      return xb.a(super.i(), c);
   }

   public class a extends fvj<geq.a.b> implements gep.a {
      @Nullable
      private geq.a.c m;

      public a(final frf $$1, final int $$2) {
         super($$1, geq.this.n, geq.this.o - $$2 - 80, 40, 16);
      }

      @Override
      public void a(double $$0) {
         double $$1 = this.g();
         super.a($$0);
         if ((float)this.i() > 1.0E-5F && $$0 <= 1.0E-5F && !azq.b($$0, $$1)) {
            geq.this.E();
         }
      }

      @Override
      public void a(int $$0, gnb.a $$1) {
         boolean $$2 = $$1.a(geq.this.x.f());
         gmz $$3 = $$1.h();
         fqz $$4 = $$3.a($$1.g());
         geq.a.b $$5 = new geq.a.d($$0, $$1.b(), $$1.c(), $$4, $$2, true);
         this.c($$5);
         this.a($$1, $$2);
      }

      private void a(gnb.a $$0, boolean $$1) {
         geq.a.b $$2 = new geq.a.e($$0.f(), $$0.d(), $$1);
         this.c($$2);
         geq.a.c $$3 = new geq.a.c($$0.e(), $$2);
         if (this.m != null && this.m.a($$3)) {
            this.d(this.m.b());
         }

         this.m = $$3;
      }

      @Override
      public void a(xc $$0) {
         this.c(new geq.a.f());
         this.c(new geq.a.a($$0));
         this.c(new geq.a.f());
         this.m = null;
      }

      @Override
      public int a() {
         return Math.min(350, this.g - 50);
      }

      public int b() {
         return azq.e(this.h, this.d);
      }

      @Override
      protected void a(ftz $$0, int $$1, int $$2, float $$3, int $$4, int $$5, int $$6, int $$7, int $$8) {
         geq.a.b $$9 = this.b($$4);
         if (this.b($$9)) {
            boolean $$10 = this.p() == $$9;
            int $$11 = this.aN_() && $$10 ? -1 : -8355712;
            this.a($$0, $$6, $$7, $$8, $$11, -16777216);
         }

         $$9.a($$0, $$4, $$6, $$5, $$7, $$8, $$1, $$2, this.x() == $$9, $$3);
      }

      private boolean b(geq.a.b $$0) {
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
      protected geq.a.b c(fys $$0) {
         return this.a($$0, geq.a.b::c);
      }

      public void a(@Nullable geq.a.b $$0) {
         super.a($$0);
         geq.a.b $$1 = this.c(fys.a);
         if ($$1 == null) {
            geq.this.E();
         }
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         geq.a.b $$3 = this.p();
         return $$3 != null && $$3.a($$0, $$1, $$2) ? true : super.a($$0, $$1, $$2);
      }

      public int c() {
         return this.I() + 9;
      }

      public class a extends geq.a.b {
         private final xc b;

         public a(final xc $$1) {
            this.b = $$1;
         }

         @Override
         public void a(ftz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            int $$10 = $$2 + $$5 / 2;
            int $$11 = $$3 + $$4 - 8;
            int $$12 = geq.this.p.a(this.b);
            int $$13 = ($$3 + $$11 - $$12) / 2;
            int $$14 = $$10 - 9 / 2;
            $$0.b(geq.this.p, this.b, $$13, $$14, -6250336);
         }

         @Override
         public xc a() {
            return this.b;
         }
      }

      public abstract static class b extends fvj.a<geq.a.b> {
         @Override
         public xc a() {
            return xb.a;
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

      static record c(UUID a, geq.a.b b) {
         public boolean a(geq.a.c $$0) {
            return $$0.a.equals(this.a);
         }
      }

      public class d extends geq.a.b {
         private static final int b = 9;
         private static final int c = 8;
         private static final int d = 11;
         private static final int e = 4;
         private final int f;
         private final xh g;
         private final xc h;
         @Nullable
         private final List<azc> i;
         @Nullable
         private final fqz.a j;
         @Nullable
         private final List<azc> k;
         private final boolean l;
         private final boolean m;

         public d(final int $$1, final xc $$2, final xc $$3, @Nullable final fqz $$4, final boolean $$5, final boolean $$6) {
            this.f = $$1;
            this.j = y.a($$4, fqz::f);
            this.k = $$4 != null && $$4.g() != null ? geq.this.p.c($$4.g(), a.this.a()) : null;
            this.l = $$5;
            this.m = $$6;
            xh $$7 = geq.this.p.a($$2, this.e() - geq.this.p.a(xb.u));
            if ($$2 != $$7) {
               this.g = xh.a($$7, xb.u);
               this.i = geq.this.p.c($$2, a.this.a());
            } else {
               this.g = $$2;
               this.i = null;
            }

            this.h = $$3;
         }

         @Override
         public void a(ftz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            if (this.b() && this.l) {
               this.a($$0, $$2, $$3, $$5);
            }

            int $$10 = $$3 + this.g();
            int $$11 = $$2 + 1 + ($$5 - 9) / 2;
            $$0.b(geq.this.p, tv.a().a(this.g), $$10, $$11, this.l ? -1 : -1593835521);
            if (this.i != null && $$8) {
               geq.this.b(this.i);
            }

            int $$12 = geq.this.p.a(this.g);
            this.a($$0, $$10 + $$12 + 4, $$2, $$5, $$6, $$7);
         }

         private void a(ftz $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
            if (this.j != null) {
               int $$6 = $$2 + ($$3 - this.j.d) / 2;
               this.j.a($$0, $$1, $$6);
               if (this.k != null && $$4 >= $$1 && $$4 <= $$1 + this.j.c && $$5 >= $$6 && $$5 <= $$6 + this.j.d) {
                  geq.this.b(this.k);
               }
            }
         }

         private void a(ftz $$0, int $$1, int $$2, int $$3) {
            int $$5 = $$1 + ($$3 - 8) / 2;
            $$0.a(gsn::H, geq.a, $$2, $$5, 9, 8);
         }

         private int e() {
            int $$0 = this.j != null ? this.j.c + 4 : 0;
            return a.this.a() - this.g() - 4 - $$0;
         }

         private int g() {
            return this.m ? 11 : 0;
         }

         @Override
         public xc a() {
            return (xc)(this.b() ? xc.a("narrator.select", this.h) : this.h);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(null);
            return this.h();
         }

         @Override
         public boolean a(int $$0, int $$1, int $$2) {
            return fyp.a($$0) ? this.h() : false;
         }

         @Override
         public boolean b() {
            return geq.this.x.b(this.f);
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
               geq.this.x.a(this.f);
               geq.this.F();
               return true;
            } else {
               return false;
            }
         }
      }

      public class e extends geq.a.b {
         private static final int b = 12;
         private static final int c = 4;
         private final xc d;
         private final Supplier<hme> e;
         private final boolean f;

         public e(final GameProfile $$1, final xc $$2, final boolean $$3) {
            this.d = $$2;
            this.f = $$3;
            this.e = a.this.c.an().a($$1);
         }

         @Override
         public void a(ftz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            int $$10 = $$3 - 12 + 4;
            int $$11 = $$2 + ($$5 - 12) / 2;
            fvm.a($$0, this.e.get(), $$10, $$11, 12);
            int $$12 = $$2 + 1 + ($$5 - 9) / 2;
            $$0.b(geq.this.p, this.d, $$10 + 12 + 4, $$12, this.f ? -1 : -1593835521);
         }
      }

      public static class f extends geq.a.b {
         @Override
         public void a(ftz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         }
      }
   }
}
