import javax.annotation.Nullable;

public class gky implements gkx {
   public static final int a = 0;
   private final gky.b c = new gky.b();
   private final gky.b d = new gky.b();
   public final gky.a b;

   public gky(gky.a $$0) {
      this.b = $$0;
   }

   @Override
   public float unclampedCall(crs $$0, @Nullable fuq $$1, @Nullable bqt $$2, int $$3) {
      bqa $$4 = (bqa)($$2 != null ? $$2 : $$0.D());
      if ($$4 == null) {
         return 0.0F;
      } else {
         $$1 = this.a($$4, $$1);
         return $$1 == null ? 0.0F : this.a($$0, $$1, $$3, $$4);
      }
   }

   private float a(crs $$0, fuq $$1, int $$2, bqa $$3) {
      im $$4 = this.b.getPos($$1, $$0, $$3);
      long $$5 = $$1.Y();
      return !this.a($$3, $$4) ? this.a($$2, $$5) : this.a($$3, $$5, $$4.b());
   }

   private float a(int $$0, long $$1) {
      if (this.d.a($$1)) {
         this.d.a($$1, Math.random());
      }

      double $$2 = this.d.a + (double)((float)this.a($$0) / 2.1474836E9F);
      return axm.b((float)$$2, 1.0F);
   }

   private float a(bqa $$0, long $$1, id $$2) {
      double $$3 = this.a($$0, $$2);
      double $$4 = this.a($$0);
      if ($$0 instanceof cka $$5 && $$5.g() && $$5.dM().s().i()) {
         if (this.c.a($$1)) {
            this.c.a($$1, 0.5 - ($$4 - 0.25));
         }

         double $$6 = $$3 + this.c.a;
         return axm.b((float)$$6, 1.0F);
      }

      double $$7 = 0.5 - ($$4 - 0.25 - $$3);
      return axm.b((float)$$7, 1.0F);
   }

   @Nullable
   private fuq a(bqa $$0, @Nullable fuq $$1) {
      return $$1 == null && $$0.dM() instanceof fuq ? (fuq)$$0.dM() : $$1;
   }

   private boolean a(bqa $$0, @Nullable im $$1) {
      return $$1 != null && $$1.a() == $$0.dM().ae() && !($$1.b().b($$0.dk()) < 1.0E-5F);
   }

   private double a(bqa $$0, id $$1) {
      esj $$2 = esj.b($$1);
      return Math.atan2($$2.c() - $$0.dx(), $$2.a() - $$0.dr()) / (float) (Math.PI * 2);
   }

   private double a(bqa $$0) {
      return axm.c((double)($$0.dD() / 360.0F), 1.0);
   }

   private int a(int $$0) {
      return $$0 * 1327217883;
   }

   public interface a {
      @Nullable
      im getPos(fuq var1, crs var2, bqa var3);
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
         $$2 = axm.c($$2 + 0.5, 1.0) - 0.5;
         this.b += $$2 * 0.1;
         this.b *= 0.8;
         this.a = axm.c(this.a + this.b, 1.0);
      }
   }
}
