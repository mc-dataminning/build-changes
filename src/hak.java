import javax.annotation.Nullable;

public class hak implements haj {
   public static final int a = 0;
   private final hak.b c = new hak.b();
   private final hak.b d = new hak.b();
   public final hak.a b;

   public hak(hak.a $$0) {
      this.b = $$0;
   }

   @Override
   public float unclampedCall(cxg $$0, @Nullable gff $$1, @Nullable bvx $$2, int $$3) {
      bvb $$4 = (bvb)($$2 != null ? $$2 : $$0.J());
      if ($$4 == null) {
         return 0.0F;
      } else {
         $$1 = this.a($$4, $$1);
         return $$1 == null ? 0.0F : this.a($$0, $$1, $$3, $$4);
      }
   }

   private float a(cxg $$0, gff $$1, int $$2, bvb $$3) {
      jp $$4 = this.b.getPos($$1, $$0, $$3);
      long $$5 = $$1.ad();
      return !this.a($$3, $$4) ? this.a($$2, $$5) : this.a($$3, $$5, $$4.b());
   }

   private float a(int $$0, long $$1) {
      if (this.d.a($$1)) {
         this.d.a($$1, Math.random());
      }

      double $$2 = this.d.a + (double)((float)this.a($$0) / 2.1474836E9F);
      return azu.b((float)$$2, 1.0F);
   }

   private float a(bvb $$0, long $$1, jh $$2) {
      double $$3 = this.a($$0, $$2);
      double $$4 = this.a($$0);
      if ($$0 instanceof cpo $$5 && $$5.c() && $$5.dW().u().i()) {
         if (this.c.a($$1)) {
            this.c.a($$1, 0.5 - ($$4 - 0.25));
         }

         double $$6 = $$3 + this.c.a;
         return azu.b((float)$$6, 1.0F);
      }

      double $$7 = 0.5 - ($$4 - 0.25 - $$3);
      return azu.b((float)$$7, 1.0F);
   }

   @Nullable
   private gff a(bvb $$0, @Nullable gff $$1) {
      return $$1 == null && $$0.dW() instanceof gff ? (gff)$$0.dW() : $$1;
   }

   private boolean a(bvb $$0, @Nullable jp $$1) {
      return $$1 != null && $$1.a() == $$0.dW().ai() && !($$1.b().b($$0.du()) < 1.0E-5F);
   }

   private double a(bvb $$0, jh $$1) {
      fbr $$2 = fbr.b($$1);
      return Math.atan2($$2.c() - $$0.dH(), $$2.a() - $$0.dB()) / (float) (Math.PI * 2);
   }

   private double a(bvb $$0) {
      return azu.c((double)($$0.dN() / 360.0F), 1.0);
   }

   private int a(int $$0) {
      return $$0 * 1327217883;
   }

   public interface a {
      @Nullable
      jp getPos(gff var1, cxg var2, bvb var3);
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
         $$2 = azu.c($$2 + 0.5, 1.0) - 0.5;
         this.b += $$2 * 0.1;
         this.b *= 0.8;
         this.a = azu.c(this.a + this.b, 1.0);
      }
   }
}
