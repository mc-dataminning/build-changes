import javax.annotation.Nullable;

public class gpr implements gpq {
   public static final int a = 0;
   private final gpr.b c = new gpr.b();
   private final gpr.b d = new gpr.b();
   public final gpr.a b;

   public gpr(gpr.a $$0) {
      this.b = $$0;
   }

   @Override
   public float unclampedCall(cuq $$0, @Nullable fzf $$1, @Nullable btn $$2, int $$3) {
      bsr $$4 = (bsr)($$2 != null ? $$2 : $$0.E());
      if ($$4 == null) {
         return 0.0F;
      } else {
         $$1 = this.a($$4, $$1);
         return $$1 == null ? 0.0F : this.a($$0, $$1, $$3, $$4);
      }
   }

   private float a(cuq $$0, fzf $$1, int $$2, bsr $$3) {
      jl $$4 = this.b.getPos($$1, $$0, $$3);
      long $$5 = $$1.Z();
      return !this.a($$3, $$4) ? this.a($$2, $$5) : this.a($$3, $$5, $$4.b());
   }

   private float a(int $$0, long $$1) {
      if (this.d.a($$1)) {
         this.d.a($$1, Math.random());
      }

      double $$2 = this.d.a + (double)((float)this.a($$0) / 2.1474836E9F);
      return ayo.b((float)$$2, 1.0F);
   }

   private float a(bsr $$0, long $$1, jd $$2) {
      double $$3 = this.a($$0, $$2);
      double $$4 = this.a($$0);
      if ($$0 instanceof cmx $$5 && $$5.g() && $$5.dO().s().i()) {
         if (this.c.a($$1)) {
            this.c.a($$1, 0.5 - ($$4 - 0.25));
         }

         double $$6 = $$3 + this.c.a;
         return ayo.b((float)$$6, 1.0F);
      }

      double $$7 = 0.5 - ($$4 - 0.25 - $$3);
      return ayo.b((float)$$7, 1.0F);
   }

   @Nullable
   private fzf a(bsr $$0, @Nullable fzf $$1) {
      return $$1 == null && $$0.dO() instanceof fzf ? (fzf)$$0.dO() : $$1;
   }

   private boolean a(bsr $$0, @Nullable jl $$1) {
      return $$1 != null && $$1.a() == $$0.dO().af() && !($$1.b().b($$0.dm()) < 1.0E-5F);
   }

   private double a(bsr $$0, jd $$1) {
      exc $$2 = exc.b($$1);
      return Math.atan2($$2.c() - $$0.dz(), $$2.a() - $$0.dt()) / (float) (Math.PI * 2);
   }

   private double a(bsr $$0) {
      return ayo.c((double)($$0.dF() / 360.0F), 1.0);
   }

   private int a(int $$0) {
      return $$0 * 1327217883;
   }

   public interface a {
      @Nullable
      jl getPos(fzf var1, cuq var2, bsr var3);
   }

   static class b {
      double a;
      private double b;
      private long c;

      boolean a(long $$0) {
         return this.c != $$0;
      }

      void a(long $$0, double $$1) {
         this.c = $$0;
         double $$2 = $$1 - this.a;
         $$2 = ayo.c($$2 + 0.5, 1.0) - 0.5;
         this.b += $$2 * 0.1;
         this.b *= 0.8;
         this.a = ayo.c(this.a + this.b, 1.0);
      }
   }
}
