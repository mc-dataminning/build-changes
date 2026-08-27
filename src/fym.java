import javax.annotation.Nullable;

public class fym implements fyl {
   public static final int a = 0;
   private final fym.b c = new fym.b();
   private final fym.b d = new fym.b();
   public final fym.a b;

   public fym(fym.a $$0) {
      this.b = $$0;
   }

   @Override
   public float unclampedCall(cjh $$0, @Nullable fiz $$1, @Nullable bji $$2, int $$3) {
      bis $$4 = (bis)($$2 != null ? $$2 : $$0.H());
      if ($$4 == null) {
         return 0.0F;
      } else {
         $$1 = this.a($$4, $$1);
         return $$1 == null ? 0.0F : this.a($$0, $$1, $$3, $$4);
      }
   }

   private float a(cjh $$0, fiz $$1, int $$2, bis $$3) {
      hf $$4 = this.b.getPos($$1, $$0, $$3);
      long $$5 = $$1.V();
      return !this.a($$3, $$4) ? this.a($$2, $$5) : this.a($$3, $$5, $$4.b());
   }

   private float a(int $$0, long $$1) {
      if (this.d.a($$1)) {
         this.d.a($$1, Math.random());
      }

      double $$2 = this.d.a + (double)((float)this.a($$0) / 2.1474836E9F);
      return ary.b((float)$$2, 1.0F);
   }

   private float a(bis $$0, long $$1, gw $$2) {
      double $$3 = this.a($$0, $$2);
      double $$4 = this.a($$0);
      if ($$0 instanceof cbw $$5 && $$5.g()) {
         if (this.c.a($$1)) {
            this.c.a($$1, 0.5 - ($$4 - 0.25));
         }

         double $$6 = $$3 + this.c.a;
         return ary.b((float)$$6, 1.0F);
      }

      double $$7 = 0.5 - ($$4 - 0.25 - $$3);
      return ary.b((float)$$7, 1.0F);
   }

   @Nullable
   private fiz a(bis $$0, @Nullable fiz $$1) {
      return $$1 == null && $$0.dL() instanceof fiz ? (fiz)$$0.dL() : $$1;
   }

   private boolean a(bis $$0, @Nullable hf $$1) {
      return $$1 != null && $$1.a() == $$0.dL().ac() && !($$1.b().b($$0.dj()) < 1.0E-5F);
   }

   private double a(bis $$0, gw $$1) {
      ehp $$2 = ehp.b($$1);
      return Math.atan2($$2.c() - $$0.dw(), $$2.a() - $$0.dq()) / (float) (Math.PI * 2);
   }

   private double a(bis $$0) {
      return ary.c((double)($$0.dC() / 360.0F), 1.0);
   }

   private int a(int $$0) {
      return $$0 * 1327217883;
   }

   public interface a {
      @Nullable
      hf getPos(fiz var1, cjh var2, bis var3);
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
         $$2 = ary.c($$2 + 0.5, 1.0) - 0.5;
         this.b += $$2 * 0.1;
         this.b *= 0.8;
         this.a = ary.c(this.a + this.b, 1.0);
      }
   }
}
