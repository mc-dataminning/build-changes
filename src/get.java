import java.util.function.Consumer;
import javax.annotation.Nullable;

public class get extends gaf {
   private static final xc a = xc.c("gui.abuseReport.reason.title");
   private static final xc b = xc.c("gui.abuseReport.reason.description");
   private static final xc c = xc.c("gui.abuseReport.read_info");
   private static final int d = 320;
   private static final int s = 62;
   private static final int u = 4;
   @Nullable
   private final gaf v;
   @Nullable
   private get.a w;
   @Nullable
   gnk x;
   private final Consumer<gnk> y;
   final fyb z = new fyb(this);
   final gnl A;

   public get(@Nullable gaf $$0, @Nullable gnk $$1, gnl $$2, Consumer<gnk> $$3) {
      super(a);
      this.v = $$0;
      this.x = $$1;
      this.y = $$3;
      this.A = $$2;
   }

   @Override
   protected void aS_() {
      this.z.a(a, this.p);
      fyf $$0 = this.z.c(fyf.d().a(4));
      this.w = $$0.a(new get.a(this.m));
      get.a.a $$1 = y.a(this.x, this.w::a);
      this.w.a($$1);
      $$0.a(fyg.b(this.I()));
      fyf $$2 = this.z.b(fyf.e().a(8));
      $$2.a(fun.a(c, fzc.b(this, ayl.m)).a());
      $$2.a(fun.a(xb.d, $$0x -> {
         get.a.a $$1x = this.w.p();
         if ($$1x != null) {
            this.y.accept($$1x.b());
         }

         this.m.a(this.v);
      }).a());
      this.z.a($$1x -> {
         ful var10000 = this.c($$1x);
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
   public void a(ftz $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.m(), this.F(), this.E(), this.G(), -16777216);
      $$0.b(this.m(), this.F(), this.H(), this.I(), -1);
      $$0.b(this.p, b, this.m() + 4, this.F() + 4, -1);
      get.a.a $$4 = this.w.p();
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

   public class a extends fvj<get.a.a> {
      public a(final frf $$1) {
         super($$1, get.this.n, get.this.L(), get.this.z.c(), 18);

         for (gnk $$2 : gnk.values()) {
            if (!gnk.a(get.this.A).contains($$2)) {
               this.b(new get.a.a($$2));
            }
         }
      }

      @Nullable
      public get.a.a a(gnk $$0) {
         return this.aI_().stream().filter($$1 -> $$1.b == $$0).findFirst().orElse(null);
      }

      @Override
      public int a() {
         return 320;
      }

      public void a(@Nullable get.a.a $$0) {
         super.a($$0);
         get.this.x = $$0 != null ? $$0.b() : null;
      }

      public class a extends fvj.a<get.a.a> {
         final gnk b;

         public a(final gnk $$1) {
            this.b = $$1;
         }

         @Override
         public void a(ftz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            int $$10 = $$3 + 1;
            int $$11 = $$2 + ($$5 - 9) / 2 + 1;
            $$0.b(get.this.p, this.b.b(), $$10, $$11, -1);
         }

         @Override
         public xc a() {
            return xc.a("gui.abuseReport.reason.narration", this.b.b(), this.b.c());
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(this);
            return super.a($$0, $$1, $$2);
         }

         public gnk b() {
            return this.b;
         }
      }
   }
}
