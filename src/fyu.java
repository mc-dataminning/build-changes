import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fyu extends fui {
   private static final wo a = wo.c("gui.abuseReport.reason.title");
   private static final wo b = wo.c("gui.abuseReport.reason.description");
   private static final wo c = wo.c("gui.abuseReport.read_info");
   private static final int d = 320;
   private static final int s = 62;
   private static final int u = 4;
   @Nullable
   private final fui v;
   @Nullable
   private fyu.a w;
   @Nullable
   ghd x;
   private final Consumer<ghd> y;
   final fse z = new fse(this);
   final ghe A;

   public fyu(@Nullable fui $$0, @Nullable ghd $$1, ghe $$2, Consumer<ghd> $$3) {
      super(a);
      this.v = $$0;
      this.x = $$1;
      this.y = $$3;
      this.A = $$2;
   }

   @Override
   protected void aR_() {
      this.z.a(a, this.p);
      fsi $$0 = this.z.c(fsi.d().a(4));
      this.w = $$0.a(new fyu.a(this.m));
      fyu.a.a $$1 = x.a(this.x, this.w::a);
      this.w.a($$1);
      $$0.a(fsj.b(this.I()));
      fsi $$2 = this.z.b(fsi.e().a(8));
      $$2.a(fop.a(c, ftf.b(this, axu.m)).a());
      $$2.a(fop.a(wn.d, $$0x -> {
         fyu.a.a $$1x = this.w.p();
         if ($$1x != null) {
            this.y.accept($$1x.b());
         }

         this.m.a(this.v);
      }).a());
      this.z.a($$1x -> {
         fon var10000 = this.c($$1x);
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
   public void a(fob $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.m(), this.F(), this.E(), this.G(), -16777216);
      $$0.b(this.m(), this.F(), this.H(), this.I(), -1);
      $$0.b(this.p, b, this.m() + 4, this.F() + 4, -1);
      fyu.a.a $$4 = this.w.p();
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

   public class a extends fpm<fyu.a.a> {
      public a(final flh $$1) {
         super($$1, fyu.this.n, fyu.this.L(), fyu.this.z.c(), 18);

         for (ghd $$2 : ghd.values()) {
            if (!ghd.a(fyu.this.A).contains($$2)) {
               this.b(new fyu.a.a($$2));
            }
         }
      }

      @Nullable
      public fyu.a.a a(ghd $$0) {
         return this.aH_().stream().filter($$1 -> $$1.b == $$0).findFirst().orElse(null);
      }

      @Override
      public int a() {
         return 320;
      }

      public void a(@Nullable fyu.a.a $$0) {
         super.a($$0);
         fyu.this.x = $$0 != null ? $$0.b() : null;
      }

      public class a extends fpm.a<fyu.a.a> {
         final ghd b;

         public a(final ghd $$1) {
            this.b = $$1;
         }

         @Override
         public void a(fob $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            int $$10 = $$3 + 1;
            int $$11 = $$2 + ($$5 - 9) / 2 + 1;
            $$0.b(fyu.this.p, this.b.b(), $$10, $$11, -1);
         }

         @Override
         public wo a() {
            return wo.a("gui.abuseReport.reason.narration", this.b.b(), this.b.c());
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(this);
            return super.a($$0, $$1, $$2);
         }

         public ghd b() {
            return this.b;
         }
      }
   }
}
