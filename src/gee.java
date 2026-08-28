import java.util.function.Consumer;
import javax.annotation.Nullable;

public class gee extends fzq {
   private static final xg a = xg.c("gui.abuseReport.reason.title");
   private static final xg b = xg.c("gui.abuseReport.reason.description");
   private static final xg c = xg.c("gui.abuseReport.read_info");
   private static final int d = 320;
   private static final int s = 62;
   private static final int u = 4;
   @Nullable
   private final fzq v;
   @Nullable
   private gee.a w;
   @Nullable
   gmv x;
   private final Consumer<gmv> y;
   final fxm z = new fxm(this);
   final gmw A;

   public gee(@Nullable fzq $$0, @Nullable gmv $$1, gmw $$2, Consumer<gmv> $$3) {
      super(a);
      this.v = $$0;
      this.x = $$1;
      this.y = $$3;
      this.A = $$2;
   }

   @Override
   protected void aT_() {
      this.z.a(a, this.p);
      fxq $$0 = this.z.c(fxq.d().a(4));
      this.w = $$0.a(new gee.a(this.m));
      gee.a.a $$1 = y.a(this.x, this.w::a);
      this.w.a($$1);
      $$0.a(fxr.b(this.I()));
      fxq $$2 = this.z.b(fxq.e().a(8));
      $$2.a(fty.a(c, fyn.b(this, ayt.m)).a());
      $$2.a(fty.a(xf.d, $$0x -> {
         gee.a.a $$1x = this.w.p();
         if ($$1x != null) {
            this.y.accept($$1x.b());
         }

         this.m.a(this.v);
      }).a());
      this.z.a($$1x -> {
         ftw var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.z.a();
      if (this.w != null) {
         this.w.b(this.n, this.L(), this.z.c());
      }
   }

   @Override
   public void a(ftk $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.m(), this.F(), this.E(), this.G(), -16777216);
      $$0.b(this.m(), this.F(), this.H(), this.I(), -1);
      $$0.b(this.p, b, this.m() + 4, this.F() + 4, -1);
      gee.a.a $$4 = this.w.p();
      if ($$4 != null) {
         int $$5 = this.m() + 4 + 16;
         int $$6 = this.E() - 4;
         int $$7 = this.F() + 4 + 9 + 2;
         int $$8 = this.G() - 4;
         int $$9 = $$6 - $$5;
         int $$10 = $$8 - $$7;
         int $$11 = this.p.b($$4.b.c(), $$9);
         $$0.a(this.p, $$4.b.c(), $$5, $$7 + ($$10 - $$11) / 2, $$9, -1);
      }
   }

   private int m() {
      return (this.n - 320) / 2;
   }

   private int E() {
      return (this.n + 320) / 2;
   }

   private int F() {
      return this.G() - this.I();
   }

   private int G() {
      return this.o - this.z.b() - 4;
   }

   private int H() {
      return 320;
   }

   private int I() {
      return 62;
   }

   int L() {
      return this.z.d() - this.I() - 8;
   }

   @Override
   public void aQ_() {
      this.m.a(this.v);
   }

   public class a extends fuu<gee.a.a> {
      public a(final fqq $$1) {
         super($$1, gee.this.n, gee.this.L(), gee.this.z.c(), 18);

         for (gmv $$2 : gmv.values()) {
            if (!gmv.a(gee.this.A).contains($$2)) {
               this.b(new gee.a.a($$2));
            }
         }
      }

      @Nullable
      public gee.a.a a(gmv $$0) {
         return this.aJ_().stream().filter($$1 -> $$1.b == $$0).findFirst().orElse(null);
      }

      @Override
      public int a() {
         return 320;
      }

      public void a(@Nullable gee.a.a $$0) {
         super.a($$0);
         gee.this.x = $$0 != null ? $$0.b() : null;
      }

      public class a extends fuu.a<gee.a.a> {
         final gmv b;

         public a(final gmv $$1) {
            this.b = $$1;
         }

         @Override
         public void a(ftk $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            int $$10 = $$3 + 1;
            int $$11 = $$2 + ($$5 - 9) / 2 + 1;
            $$0.b(gee.this.p, this.b.b(), $$10, $$11, -1);
         }

         @Override
         public xg a() {
            return xg.a("gui.abuseReport.reason.narration", this.b.b(), this.b.c());
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(this);
            return super.a($$0, $$1, $$2);
         }

         public gmv b() {
            return this.b;
         }
      }
   }
}
