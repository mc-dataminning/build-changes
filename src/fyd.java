import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fyd extends ftr {
   private static final xv a = xv.c("gui.abuseReport.reason.title");
   private static final xv b = xv.c("gui.abuseReport.reason.description");
   private static final xv c = xv.c("gui.abuseReport.read_info");
   private static final int d = 320;
   private static final int s = 62;
   private static final int u = 4;
   @Nullable
   private final ftr v;
   @Nullable
   private fyd.a w;
   @Nullable
   ggk x;
   private final Consumer<ggk> y;
   final frn z = new frn(this);
   final ggl A;

   public fyd(@Nullable ftr $$0, @Nullable ggk $$1, ggl $$2, Consumer<ggk> $$3) {
      super(a);
      this.v = $$0;
      this.x = $$1;
      this.y = $$3;
      this.A = $$2;
   }

   @Override
   protected void aT_() {
      this.z.a(a, this.p);
      frr $$0 = this.z.c(frr.d().a(4));
      this.w = $$0.a(new fyd.a(this.m));
      fyd.a.a $$1 = x.a(this.x, this.w::a);
      this.w.a($$1);
      $$0.a(frs.b(this.K()));
      frr $$2 = this.z.b(frr.e().a(8));
      $$2.a(fny.a(c, fso.b(this, aza.m)).a());
      $$2.a(fny.a(xu.d, $$0x -> {
         fyd.a.a $$1x = this.w.g();
         if ($$1x != null) {
            this.y.accept($$1x.b());
         }

         this.m.a(this.v);
      }).a());
      this.z.a($$1x -> {
         fnw var10000 = this.c($$1x);
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
   public void a(fnl $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.l(), this.F(), this.E(), this.G(), -16777216);
      $$0.b(this.l(), this.F(), this.J(), this.K(), -1);
      $$0.b(this.p, b, this.l() + 4, this.F() + 4, -1);
      fyd.a.a $$4 = this.w.g();
      if ($$4 != null) {
         int $$5 = this.l() + 4 + 16;
         int $$6 = this.E() - 4;
         int $$7 = this.F() + 4 + 9 + 2;
         int $$8 = this.G() - 4;
         int $$9 = $$6 - $$5;
         int $$10 = $$8 - $$7;
         int $$11 = this.p.b($$4.b.c(), $$9);
         $$0.a(this.p, $$4.b.c(), $$5, $$7 + ($$10 - $$11) / 2, $$9, -1);
      }
   }

   private int l() {
      return (this.n - 320) / 2;
   }

   private int E() {
      return (this.n + 320) / 2;
   }

   private int F() {
      return this.G() - this.K();
   }

   private int G() {
      return this.o - this.z.b() - 4;
   }

   private int J() {
      return 320;
   }

   private int K() {
      return 62;
   }

   int L() {
      return this.z.d() - this.K() - 8;
   }

   @Override
   public void aP_() {
      this.m.a(this.v);
   }

   public class a extends fov<fyd.a.a> {
      public a(final flz $$1) {
         super($$1, fyd.this.n, fyd.this.L(), fyd.this.z.c(), 18);

         for (ggk $$2 : ggk.values()) {
            if (!ggk.a(fyd.this.A).contains($$2)) {
               this.b(new fyd.a.a($$2));
            }
         }
      }

      @Nullable
      public fyd.a.a a(ggk $$0) {
         return this.aI_().stream().filter($$1 -> $$1.b == $$0).findFirst().orElse(null);
      }

      @Override
      public int a() {
         return 320;
      }

      public void a(@Nullable fyd.a.a $$0) {
         super.a($$0);
         fyd.this.x = $$0 != null ? $$0.b() : null;
      }

      public class a extends fov.a<fyd.a.a> {
         final ggk b;

         public a(final ggk $$1) {
            this.b = $$1;
         }

         @Override
         public void a(fnl $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            int $$10 = $$3 + 1;
            int $$11 = $$2 + ($$5 - 9) / 2 + 1;
            $$0.b(fyd.this.p, this.b.b(), $$10, $$11, -1);
         }

         @Override
         public xv a() {
            return xv.a("gui.abuseReport.reason.narration", this.b.b(), this.b.c());
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(this);
            return super.a($$0, $$1, $$2);
         }

         public ggk b() {
            return this.b;
         }
      }
   }
}
