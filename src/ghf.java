import javax.annotation.Nullable;

public class ghf implements ghe {
   public static final int a = 0;
   private final ghf.b c = new ghf.b();
   private final ghf.b d = new ghf.b();
   public final ghf.a b;

   public ghf(ghf.a $$0) {
      this.b = $$0;
   }

   @Override
   public float unclampedCall(cpq $$0, @Nullable fra $$1, @Nullable box $$2, int $$3) {
      bof $$4 = (bof)($$2 != null ? $$2 : $$0.I());
      if ($$4 == null) {
         return 0.0F;
      } else {
         $$1 = this.a($$4, $$1);
         return $$1 == null ? 0.0F : this.a($$0, $$1, $$3, $$4);
      }
   }

   private float a(cpq $$0, fra $$1, int $$2, bof $$3) {
      ik $$4 = this.b.getPos($$1, $$0, $$3);
      long $$5 = $$1.X();
      return !this.a($$3, $$4) ? this.a($$2, $$5) : this.a($$3, $$5, $$4.b());
   }

   private float a(int $$0, long $$1) {
      if (this.d.a($$1)) {
         this.d.a($$1, Math.random());
      }

      double $$2 = this.d.a + (double)((float)this.a($$0) / 2.1474836E9F);
      return awm.b((float)$$2, 1.0F);
   }

   private float a(bof $$0, long $$1, ib $$2) {
      double $$3 = this.a($$0, $$2);
      double $$4 = this.a($$0);
      if ($$0 instanceof cia $$5 && $$5.g() && $$5.dJ().s().i()) {
         if (this.c.a($$1)) {
            this.c.a($$1, 0.5 - ($$4 - 0.25));
         }

         double $$6 = $$3 + this.c.a;
         return awm.b((float)$$6, 1.0F);
      }

      double $$7 = 0.5 - ($$4 - 0.25 - $$3);
      return awm.b((float)$$7, 1.0F);
   }

   @Nullable
   private fra a(bof $$0, @Nullable fra $$1) {
      return $$1 == null && $$0.dJ() instanceof fra ? (fra)$$0.dJ() : $$1;
   }

   private boolean a(bof $$0, @Nullable ik $$1) {
      return $$1 != null && $$1.a() == $$0.dJ().ad() && !($$1.b().b($$0.dh()) < 1.0E-5F);
   }

   private double a(bof $$0, ib $$1) {
      eov $$2 = eov.b($$1);
      return Math.atan2($$2.c() - $$0.du(), $$2.a() - $$0.do()) / (float) (Math.PI * 2);
   }

   private double a(bof $$0) {
      return awm.c((double)($$0.dA() / 360.0F), 1.0);
   }

   private int a(int $$0) {
      return $$0 * 1327217883;
   }

   public interface a {
      @Nullable
      ik getPos(fra var1, cpq var2, bof var3);
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
         $$2 = awm.c($$2 + 0.5, 1.0) - 0.5;
         this.b += $$2 * 0.1;
         this.b *= 0.8;
         this.a = awm.c(this.a + this.b, 1.0);
      }
   }
}
