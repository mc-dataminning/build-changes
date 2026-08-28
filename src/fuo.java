import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fuo extends fqd {
   private static final xd a = xd.c("gui.abuseReport.reason.title");
   private static final xd b = xd.c("gui.abuseReport.reason.description");
   private static final xd c = xd.c("gui.abuseReport.read_info");
   private static final int d = 320;
   private static final int s = 62;
   private static final int u = 4;
   @Nullable
   private final fqd v;
   @Nullable
   private fuo.a w;
   @Nullable
   gcn x;
   private final Consumer<gcn> y;
   final fny z = new fny(this);
   final gco A;

   public fuo(@Nullable fqd $$0, @Nullable gcn $$1, gco $$2, Consumer<gcn> $$3) {
      super(a);
      this.v = $$0;
      this.x = $$1;
      this.y = $$3;
      this.A = $$2;
   }

   @Override
   protected void aR_() {
      this.z.a(a, this.p);
      foc $$0 = this.z.c(foc.d().a(4));
      this.w = $$0.a(new fuo.a(this.m));
      fuo.a.a $$1 = x.a(this.x, this.w::a);
      this.w.a($$1);
      $$0.a(fod.b(this.J()));
      foc $$2 = this.z.b(foc.e().a(8));
      $$2.a(fkk.a(c, fpa.b(this, axz.m)).a());
      $$2.a(fkk.a(xc.d, $$0x -> {
         fuo.a.a $$1x = this.w.h();
         if ($$1x != null) {
            this.y.accept($$1x.b());
         }

         this.m.a(this.v);
      }).a());
      this.z.a($$1x -> {
         fki var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.z.a();
      if (this.w != null) {
         this.w.b(this.n, this.K(), this.z.c());
      }
   }

   @Override
   public void a(fjx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.m(), this.E(), this.D(), this.F(), -16777216);
      $$0.b(this.m(), this.E(), this.G(), this.J(), -1);
      $$0.b(this.p, b, this.m() + 4, this.E() + 4, -1);
      fuo.a.a $$4 = this.w.h();
      if ($$4 != null) {
         int $$5 = this.m() + 4 + 16;
         int $$6 = this.D() - 4;
         int $$7 = this.E() + 4 + 9 + 2;
         int $$8 = this.F() - 4;
         int $$9 = $$6 - $$5;
         int $$10 = $$8 - $$7;
         int $$11 = this.p.b($$4.b.c(), $$9);
         $$0.a(this.p, $$4.b.c(), $$5, $$7 + ($$10 - $$11) / 2, $$9, -1);
      }
   }

   private int m() {
      return (this.n - 320) / 2;
   }

   private int D() {
      return (this.n + 320) / 2;
   }

   private int E() {
      return this.F() - this.J();
   }

   private int F() {
      return this.o - this.z.b() - 4;
   }

   private int G() {
      return 320;
   }

   private int J() {
      return 62;
   }

   int K() {
      return this.z.d() - this.J() - 8;
   }

   @Override
   public void d() {
      this.m.a(this.v);
   }

   public class a extends flg<fuo.a.a> {
      public a(final fil $$1) {
         super($$1, fuo.this.n, fuo.this.K(), fuo.this.z.c(), 18);

         for (gcn $$2 : gcn.values()) {
            if (!gcn.a(fuo.this.A).contains($$2)) {
               this.b(new fuo.a.a($$2));
            }
         }
      }

      @Nullable
      public fuo.a.a a(gcn $$0) {
         return this.aI_().stream().filter($$1 -> $$1.b == $$0).findFirst().orElse(null);
      }

      @Override
      public int b() {
         return 320;
      }

      public void a(@Nullable fuo.a.a $$0) {
         super.a($$0);
         fuo.this.x = $$0 != null ? $$0.b() : null;
      }

      public class a extends flg.a<fuo.a.a> {
         final gcn b;

         public a(final gcn $$1) {
            this.b = $$1;
         }

         @Override
         public void a(fjx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            int $$10 = $$3 + 1;
            int $$11 = $$2 + ($$5 - 9) / 2 + 1;
            $$0.b(fuo.this.p, this.b.b(), $$10, $$11, -1);
         }

         @Override
         public xd a() {
            return xd.a("gui.abuseReport.reason.narration", this.b.b(), this.b.c());
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(this);
            return super.a($$0, $$1, $$2);
         }

         public gcn b() {
            return this.b;
         }
      }
   }
}
