import java.util.function.Consumer;
import javax.annotation.Nullable;

public class gci extends fxu {
   private static final wy a = wy.c("gui.abuseReport.reason.title");
   private static final wy b = wy.c("gui.abuseReport.reason.description");
   private static final wy c = wy.c("gui.abuseReport.read_info");
   private static final int d = 320;
   private static final int s = 62;
   private static final int u = 4;
   @Nullable
   private final fxu v;
   @Nullable
   private gci.a w;
   @Nullable
   gky x;
   private final Consumer<gky> y;
   final fvq z = new fvq(this);
   final gkz A;

   public gci(@Nullable fxu $$0, @Nullable gky $$1, gkz $$2, Consumer<gky> $$3) {
      super(a);
      this.v = $$0;
      this.x = $$1;
      this.y = $$3;
      this.A = $$2;
   }

   @Override
   protected void aN_() {
      this.z.a(a, this.p);
      fvu $$0 = this.z.c(fvu.d().a(4));
      this.w = $$0.a(new gci.a(this.m));
      gci.a.a $$1 = x.a(this.x, this.w::a);
      this.w.a($$1);
      $$0.a(fvv.b(this.I()));
      fvu $$2 = this.z.b(fvu.e().a(8));
      $$2.a(fsc.a(c, fwr.b(this, ayh.m)).a());
      $$2.a(fsc.a(wx.d, $$0x -> {
         gci.a.a $$1x = this.w.p();
         if ($$1x != null) {
            this.y.accept($$1x.b());
         }

         this.m.a(this.v);
      }).a());
      this.z.a($$1x -> {
         fsa var10000 = this.c($$1x);
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
   public void a(fro $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.m(), this.F(), this.E(), this.G(), -16777216);
      $$0.b(this.m(), this.F(), this.H(), this.I(), -1);
      $$0.b(this.p, b, this.m() + 4, this.F() + 4, -1);
      gci.a.a $$4 = this.w.p();
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
   public void aK_() {
      this.m.a(this.v);
   }

   public class a extends fsy<gci.a.a> {
      public a(final fos $$1) {
         super($$1, gci.this.n, gci.this.L(), gci.this.z.c(), 18);

         for (gky $$2 : gky.values()) {
            if (!gky.a(gci.this.A).contains($$2)) {
               this.b(new gci.a.a($$2));
            }
         }
      }

      @Nullable
      public gci.a.a a(gky $$0) {
         return this.aD_().stream().filter($$1 -> $$1.b == $$0).findFirst().orElse(null);
      }

      @Override
      public int a() {
         return 320;
      }

      public void a(@Nullable gci.a.a $$0) {
         super.a($$0);
         gci.this.x = $$0 != null ? $$0.b() : null;
      }

      public class a extends fsy.a<gci.a.a> {
         final gky b;

         public a(final gky $$1) {
            this.b = $$1;
         }

         @Override
         public void a(fro $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            int $$10 = $$3 + 1;
            int $$11 = $$2 + ($$5 - 9) / 2 + 1;
            $$0.b(gci.this.p, this.b.b(), $$10, $$11, -1);
         }

         @Override
         public wy a() {
            return wy.a("gui.abuseReport.reason.narration", this.b.b(), this.b.c());
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(this);
            return super.a($$0, $$1, $$2);
         }

         public gky b() {
            return this.b;
         }
      }
   }
}
