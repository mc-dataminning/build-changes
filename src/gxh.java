import javax.annotation.Nullable;

public class gxh implements gxg {
   public static final int a = 0;
   private final gxh.b c = new gxh.b();
   private final gxh.b d = new gxh.b();
   public final gxh.a b;

   public gxh(gxh.a $$0) {
      this.b = $$0;
   }

   @Override
   public float unclampedCall(cwb $$0, @Nullable gci $$1, @Nullable bva $$2, int $$3) {
      bue $$4 = (bue)($$2 != null ? $$2 : $$0.I());
      if ($$4 == null) {
         return 0.0F;
      } else {
         $$1 = this.a($$4, $$1);
         return $$1 == null ? 0.0F : this.a($$0, $$1, $$3, $$4);
      }
   }

   private float a(cwb $$0, gci $$1, int $$2, bue $$3) {
      jp $$4 = this.b.getPos($$1, $$0, $$3);
      long $$5 = $$1.aa();
      return !this.a($$3, $$4) ? this.a($$2, $$5) : this.a($$3, $$5, $$4.b());
   }

   private float a(int $$0, long $$1) {
      if (this.d.a($$1)) {
         this.d.a($$1, Math.random());
      }

      double $$2 = this.d.a + (double)((float)this.a($$0) / 2.1474836E9F);
      return azk.b((float)$$2, 1.0F);
   }

   private float a(bue $$0, long $$1, jh $$2) {
      double $$3 = this.a($$0, $$2);
      double $$4 = this.a($$0);
      if ($$0 instanceof com $$5 && $$5.g() && $$5.dX().s().i()) {
         if (this.c.a($$1)) {
            this.c.a($$1, 0.5 - ($$4 - 0.25));
         }

         double $$6 = $$3 + this.c.a;
         return azk.b((float)$$6, 1.0F);
      }

      double $$7 = 0.5 - ($$4 - 0.25 - $$3);
      return azk.b((float)$$7, 1.0F);
   }

   @Nullable
   private gci a(bue $$0, @Nullable gci $$1) {
      return $$1 == null && $$0.dX() instanceof gci ? (gci)$$0.dX() : $$1;
   }

   private boolean a(bue $$0, @Nullable jp $$1) {
      return $$1 != null && $$1.a() == $$0.dX().ag() && !($$1.b().b($$0.dv()) < 1.0E-5F);
   }

   private double a(bue $$0, jh $$1) {
      ezn $$2 = ezn.b($$1);
      return Math.atan2($$2.c() - $$0.dI(), $$2.a() - $$0.dC()) / (float) (Math.PI * 2);
   }

   private double a(bue $$0) {
      return azk.c((double)($$0.dO() / 360.0F), 1.0);
   }

   private int a(int $$0) {
      return $$0 * 1327217883;
   }

   public interface a {
      @Nullable
      jp getPos(gci var1, cwb var2, bue var3);
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
         $$2 = azk.c($$2 + 0.5, 1.0) - 0.5;
         this.b += $$2 * 0.1;
         this.b *= 0.8;
         this.a = azk.c(this.a + this.b, 1.0);
      }
   }
}
