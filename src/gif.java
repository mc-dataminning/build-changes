import javax.annotation.Nullable;

public class gif implements gie {
   public static final int a = 0;
   private final gif.b c = new gif.b();
   private final gif.b d = new gif.b();
   public final gif.a b;

   public gif(gif.a $$0) {
      this.b = $$0;
   }

   @Override
   public float unclampedCall(cqk $$0, @Nullable fry $$1, @Nullable bpo $$2, int $$3) {
      bow $$4 = (bow)($$2 != null ? $$2 : $$0.I());
      if ($$4 == null) {
         return 0.0F;
      } else {
         $$1 = this.a($$4, $$1);
         return $$1 == null ? 0.0F : this.a($$0, $$1, $$3, $$4);
      }
   }

   private float a(cqk $$0, fry $$1, int $$2, bow $$3) {
      ik $$4 = this.b.getPos($$1, $$0, $$3);
      long $$5 = $$1.X();
      return !this.a($$3, $$4) ? this.a($$2, $$5) : this.a($$3, $$5, $$4.b());
   }

   private float a(int $$0, long $$1) {
      if (this.d.a($$1)) {
         this.d.a($$1, Math.random());
      }

      double $$2 = this.d.a + (double)((float)this.a($$0) / 2.1474836E9F);
      return aww.b((float)$$2, 1.0F);
   }

   private float a(bow $$0, long $$1, ib $$2) {
      double $$3 = this.a($$0, $$2);
      double $$4 = this.a($$0);
      if ($$0 instanceof cis $$5 && $$5.g() && $$5.dM().s().i()) {
         if (this.c.a($$1)) {
            this.c.a($$1, 0.5 - ($$4 - 0.25));
         }

         double $$6 = $$3 + this.c.a;
         return aww.b((float)$$6, 1.0F);
      }

      double $$7 = 0.5 - ($$4 - 0.25 - $$3);
      return aww.b((float)$$7, 1.0F);
   }

   @Nullable
   private fry a(bow $$0, @Nullable fry $$1) {
      return $$1 == null && $$0.dM() instanceof fry ? (fry)$$0.dM() : $$1;
   }

   private boolean a(bow $$0, @Nullable ik $$1) {
      return $$1 != null && $$1.a() == $$0.dM().ad() && !($$1.b().b($$0.dk()) < 1.0E-5F);
   }

   private double a(bow $$0, ib $$1) {
      epr $$2 = epr.b($$1);
      return Math.atan2($$2.c() - $$0.dx(), $$2.a() - $$0.dr()) / (float) (Math.PI * 2);
   }

   private double a(bow $$0) {
      return aww.c((double)($$0.dD() / 360.0F), 1.0);
   }

   private int a(int $$0) {
      return $$0 * 1327217883;
   }

   public interface a {
      @Nullable
      ik getPos(fry var1, cqk var2, bow var3);
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
         $$2 = aww.c($$2 + 0.5, 1.0) - 0.5;
         this.b += $$2 * 0.1;
         this.b *= 0.8;
         this.a = aww.c(this.a + this.b, 1.0);
      }
   }
}
