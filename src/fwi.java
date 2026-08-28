import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fwi extends frw {
   private static final xj a = xj.c("gui.abuseReport.reason.title");
   private static final xj b = xj.c("gui.abuseReport.reason.description");
   private static final xj c = xj.c("gui.abuseReport.read_info");
   private static final int d = 320;
   private static final int s = 62;
   private static final int u = 4;
   @Nullable
   private final frw v;
   @Nullable
   private fwi.a w;
   @Nullable
   gen x;
   private final Consumer<gen> y;
   final fps z = new fps(this);
   final geo A;

   public fwi(@Nullable frw $$0, @Nullable gen $$1, geo $$2, Consumer<gen> $$3) {
      super(a);
      this.v = $$0;
      this.x = $$1;
      this.y = $$3;
      this.A = $$2;
   }

   @Override
   protected void aR_() {
      this.z.a(a, this.p);
      fpw $$0 = this.z.c(fpw.d().a(4));
      this.w = $$0.a(new fwi.a(this.m));
      fwi.a.a $$1 = x.a(this.x, this.w::a);
      this.w.a($$1);
      $$0.a(fpx.b(this.L()));
      fpw $$2 = this.z.b(fpw.e().a(8));
      $$2.a(fmd.a(c, fqt.b(this, ayi.m)).a());
      $$2.a(fmd.a(xi.d, $$0x -> {
         fwi.a.a $$1x = this.w.h();
         if ($$1x != null) {
            this.y.accept($$1x.b());
         }

         this.m.a(this.v);
      }).a());
      this.z.a($$1x -> {
         fmb var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.z.a();
      if (this.w != null) {
         this.w.b(this.n, this.M(), this.z.c());
      }
   }

   @Override
   public void a(flq $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.m(), this.G(), this.F(), this.J(), -16777216);
      $$0.b(this.m(), this.G(), this.K(), this.L(), -1);
      $$0.b(this.p, b, this.m() + 4, this.G() + 4, -1);
      fwi.a.a $$4 = this.w.h();
      if ($$4 != null) {
         int $$5 = this.m() + 4 + 16;
         int $$6 = this.F() - 4;
         int $$7 = this.G() + 4 + 9 + 2;
         int $$8 = this.J() - 4;
         int $$9 = $$6 - $$5;
         int $$10 = $$8 - $$7;
         int $$11 = this.p.b($$4.b.c(), $$9);
         $$0.a(this.p, $$4.b.c(), $$5, $$7 + ($$10 - $$11) / 2, $$9, -1);
      }
   }

   private int m() {
      return (this.n - 320) / 2;
   }

   private int F() {
      return (this.n + 320) / 2;
   }

   private int G() {
      return this.J() - this.L();
   }

   private int J() {
      return this.o - this.z.b() - 4;
   }

   private int K() {
      return 320;
   }

   private int L() {
      return 62;
   }

   int M() {
      return this.z.d() - this.L() - 8;
   }

   @Override
   public void aO_() {
      this.m.a(this.v);
   }

   public class a extends fmz<fwi.a.a> {
      public a(final fke $$1) {
         super($$1, fwi.this.n, fwi.this.M(), fwi.this.z.c(), 18);

         for (gen $$2 : gen.values()) {
            if (!gen.a(fwi.this.A).contains($$2)) {
               this.b(new fwi.a.a($$2));
            }
         }
      }

      @Nullable
      public fwi.a.a a(gen $$0) {
         return this.aH_().stream().filter($$1 -> $$1.b == $$0).findFirst().orElse(null);
      }

      @Override
      public int b() {
         return 320;
      }

      public void a(@Nullable fwi.a.a $$0) {
         super.a($$0);
         fwi.this.x = $$0 != null ? $$0.b() : null;
      }

      public class a extends fmz.a<fwi.a.a> {
         final gen b;

         public a(final gen $$1) {
            this.b = $$1;
         }

         @Override
         public void a(flq $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            int $$10 = $$3 + 1;
            int $$11 = $$2 + ($$5 - 9) / 2 + 1;
            $$0.b(fwi.this.p, this.b.b(), $$10, $$11, -1);
         }

         @Override
         public xj a() {
            return xj.a("gui.abuseReport.reason.narration", this.b.b(), this.b.c());
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(this);
            return super.a($$0, $$1, $$2);
         }

         public gen b() {
            return this.b;
         }
      }
   }
}
