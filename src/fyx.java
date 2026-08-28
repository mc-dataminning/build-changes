import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fyx extends ful {
   private static final wp a = wp.c("gui.abuseReport.reason.title");
   private static final wp b = wp.c("gui.abuseReport.reason.description");
   private static final wp c = wp.c("gui.abuseReport.read_info");
   private static final int d = 320;
   private static final int s = 62;
   private static final int u = 4;
   @Nullable
   private final ful v;
   @Nullable
   private fyx.a w;
   @Nullable
   ghg x;
   private final Consumer<ghg> y;
   final fsh z = new fsh(this);
   final ghh A;

   public fyx(@Nullable ful $$0, @Nullable ghg $$1, ghh $$2, Consumer<ghg> $$3) {
      super(a);
      this.v = $$0;
      this.x = $$1;
      this.y = $$3;
      this.A = $$2;
   }

   @Override
   protected void aR_() {
      this.z.a(a, this.p);
      fsl $$0 = this.z.c(fsl.d().a(4));
      this.w = $$0.a(new fyx.a(this.m));
      fyx.a.a $$1 = x.a(this.x, this.w::a);
      this.w.a($$1);
      $$0.a(fsm.b(this.I()));
      fsl $$2 = this.z.b(fsl.e().a(8));
      $$2.a(fot.a(c, fti.b(this, axv.m)).a());
      $$2.a(fot.a(wo.d, $$0x -> {
         fyx.a.a $$1x = this.w.p();
         if ($$1x != null) {
            this.y.accept($$1x.b());
         }

         this.m.a(this.v);
      }).a());
      this.z.a($$1x -> {
         foq var10000 = this.c($$1x);
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
   public void a(foe $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.m(), this.F(), this.E(), this.G(), -16777216);
      $$0.b(this.m(), this.F(), this.H(), this.I(), -1);
      $$0.b(this.p, b, this.m() + 4, this.F() + 4, -1);
      fyx.a.a $$4 = this.w.p();
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
   public void aO_() {
      this.m.a(this.v);
   }

   public class a extends fpp<fyx.a.a> {
      public a(final flj $$1) {
         super($$1, fyx.this.n, fyx.this.L(), fyx.this.z.c(), 18);

         for (ghg $$2 : ghg.values()) {
            if (!ghg.a(fyx.this.A).contains($$2)) {
               this.b(new fyx.a.a($$2));
            }
         }
      }

      @Nullable
      public fyx.a.a a(ghg $$0) {
         return this.aH_().stream().filter($$1 -> $$1.b == $$0).findFirst().orElse(null);
      }

      @Override
      public int a() {
         return 320;
      }

      public void a(@Nullable fyx.a.a $$0) {
         super.a($$0);
         fyx.this.x = $$0 != null ? $$0.b() : null;
      }

      public class a extends fpp.a<fyx.a.a> {
         final ghg b;

         public a(final ghg $$1) {
            this.b = $$1;
         }

         @Override
         public void a(foe $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            int $$10 = $$3 + 1;
            int $$11 = $$2 + ($$5 - 9) / 2 + 1;
            $$0.b(fyx.this.p, this.b.b(), $$10, $$11, -1);
         }

         @Override
         public wp a() {
            return wp.a("gui.abuseReport.reason.narration", this.b.b(), this.b.c());
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(this);
            return super.a($$0, $$1, $$2);
         }

         public ghg b() {
            return this.b;
         }
      }
   }
}
