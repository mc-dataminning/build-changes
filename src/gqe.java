import javax.annotation.Nullable;

public class gqe implements gqd {
   public static final int a = 0;
   private final gqe.b c = new gqe.b();
   private final gqe.b d = new gqe.b();
   public final gqe.a b;

   public gqe(gqe.a $$0) {
      this.b = $$0;
   }

   @Override
   public float unclampedCall(cuh $$0, @Nullable fzn $$1, @Nullable bso $$2, int $$3) {
      brv $$4 = (brv)($$2 != null ? $$2 : $$0.D());
      if ($$4 == null) {
         return 0.0F;
      } else {
         $$1 = this.a($$4, $$1);
         return $$1 == null ? 0.0F : this.a($$0, $$1, $$3, $$4);
      }
   }

   private float a(cuh $$0, fzn $$1, int $$2, brv $$3) {
      iz $$4 = this.b.getPos($$1, $$0, $$3);
      long $$5 = $$1.Z();
      return !this.a($$3, $$4) ? this.a($$2, $$5) : this.a($$3, $$5, $$4.b());
   }

   private float a(int $$0, long $$1) {
      if (this.d.a($$1)) {
         this.d.a($$1, Math.random());
      }

      double $$2 = this.d.a + (double)((float)this.a($$0) / 2.1474836E9F);
      return aym.b((float)$$2, 1.0F);
   }

   private float a(brv $$0, long $$1, ir $$2) {
      double $$3 = this.a($$0, $$2);
      double $$4 = this.a($$0);
      if ($$0 instanceof cly $$5 && $$5.g() && $$5.dU().s().i()) {
         if (this.c.a($$1)) {
            this.c.a($$1, 0.5 - ($$4 - 0.25));
         }

         double $$6 = $$3 + this.c.a;
         return aym.b((float)$$6, 1.0F);
      }

      double $$7 = 0.5 - ($$4 - 0.25 - $$3);
      return aym.b((float)$$7, 1.0F);
   }

   @Nullable
   private fzn a(brv $$0, @Nullable fzn $$1) {
      return $$1 == null && $$0.dU() instanceof fzn ? (fzn)$$0.dU() : $$1;
   }

   private boolean a(brv $$0, @Nullable iz $$1) {
      return $$1 != null && $$1.a() == $$0.dU().af() && !($$1.b().b($$0.ds()) < 1.0E-5F);
   }

   private double a(brv $$0, ir $$1) {
      ewu $$2 = ewu.b($$1);
      return Math.atan2($$2.c() - $$0.dF(), $$2.a() - $$0.dz()) / (float) (Math.PI * 2);
   }

   private double a(brv $$0) {
      return aym.c((double)($$0.dL() / 360.0F), 1.0);
   }

   private int a(int $$0) {
      return $$0 * 1327217883;
   }

   public interface a {
      @Nullable
      iz getPos(fzn var1, cuh var2, brv var3);
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
         $$2 = aym.c($$2 + 0.5, 1.0) - 0.5;
         this.b += $$2 * 0.1;
         this.b *= 0.8;
         this.a = aym.c(this.a + this.b, 1.0);
      }
   }
}
