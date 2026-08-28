import java.util.function.Consumer;
import javax.annotation.Nullable;

public class ger extends gad {
   private static final xa a = xa.c("gui.abuseReport.reason.title");
   private static final xa b = xa.c("gui.abuseReport.reason.description");
   private static final xa c = xa.c("gui.abuseReport.read_info");
   private static final int d = 320;
   private static final int s = 62;
   private static final int u = 4;
   @Nullable
   private final gad v;
   @Nullable
   private ger.a w;
   @Nullable
   gni x;
   private final Consumer<gni> y;
   final fxz z = new fxz(this);
   final gnj A;

   public ger(@Nullable gad $$0, @Nullable gni $$1, gnj $$2, Consumer<gni> $$3) {
      super(a);
      this.v = $$0;
      this.x = $$1;
      this.y = $$3;
      this.A = $$2;
   }

   @Override
   protected void aS_() {
      this.z.a(a, this.p);
      fyd $$0 = this.z.c(fyd.d().a(4));
      this.w = $$0.a(new ger.a(this.m));
      ger.a.a $$1 = y.a(this.x, this.w::a);
      this.w.a($$1);
      $$0.a(fye.b(this.I()));
      fyd $$2 = this.z.b(fyd.e().a(8));
      $$2.a(ful.a(c, fza.b(this, ayj.m)).a());
      $$2.a(ful.a(wz.d, $$0x -> {
         ger.a.a $$1x = this.w.p();
         if ($$1x != null) {
            this.y.accept($$1x.b());
         }

         this.m.a(this.v);
      }).a());
      this.z.a($$1x -> {
         fuj var10000 = this.c($$1x);
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
   public void a(ftx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.m(), this.F(), this.E(), this.G(), -16777216);
      $$0.b(this.m(), this.F(), this.H(), this.I(), -1);
      $$0.b(this.p, b, this.m() + 4, this.F() + 4, -1);
      ger.a.a $$4 = this.w.p();
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
   public void aP_() {
      this.m.a(this.v);
   }

   public class a extends fvh<ger.a.a> {
      public a(final frd $$1) {
         super($$1, ger.this.n, ger.this.L(), ger.this.z.c(), 18);

         for (gni $$2 : gni.values()) {
            if (!gni.a(ger.this.A).contains($$2)) {
               this.b(new ger.a.a($$2));
            }
         }
      }

      @Nullable
      public ger.a.a a(gni $$0) {
         return this.aI_().stream().filter($$1 -> $$1.b == $$0).findFirst().orElse(null);
      }

      @Override
      public int a() {
         return 320;
      }

      public void a(@Nullable ger.a.a $$0) {
         super.a($$0);
         ger.this.x = $$0 != null ? $$0.b() : null;
      }

      public class a extends fvh.a<ger.a.a> {
         final gni b;

         public a(final gni $$1) {
            this.b = $$1;
         }

         @Override
         public void a(ftx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            int $$10 = $$3 + 1;
            int $$11 = $$2 + ($$5 - 9) / 2 + 1;
            $$0.b(ger.this.p, this.b.b(), $$10, $$11, -1);
         }

         @Override
         public xa a() {
            return xa.a("gui.abuseReport.reason.narration", this.b.b(), this.b.c());
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(this);
            return super.a($$0, $$1, $$2);
         }

         public gni b() {
            return this.b;
         }
      }
   }
}
