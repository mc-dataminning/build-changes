import javax.annotation.Nullable;

public class gww implements gwv {
   public static final int a = 0;
   private final gww.b c = new gww.b();
   private final gww.b d = new gww.b();
   public final gww.a b;

   public gww(gww.a $$0) {
      this.b = $$0;
   }

   @Override
   public float unclampedCall(cvx $$0, @Nullable gbx $$1, @Nullable buv $$2, int $$3) {
      btz $$4 = (btz)($$2 != null ? $$2 : $$0.I());
      if ($$4 == null) {
         return 0.0F;
      } else {
         $$1 = this.a($$4, $$1);
         return $$1 == null ? 0.0F : this.a($$0, $$1, $$3, $$4);
      }
   }

   private float a(cvx $$0, gbx $$1, int $$2, btz $$3) {
      jo $$4 = this.b.getPos($$1, $$0, $$3);
      long $$5 = $$1.aa();
      return !this.a($$3, $$4) ? this.a($$2, $$5) : this.a($$3, $$5, $$4.b());
   }

   private float a(int $$0, long $$1) {
      if (this.d.a($$1)) {
         this.d.a($$1, Math.random());
      }

      double $$2 = this.d.a + (double)((float)this.a($$0) / 2.1474836E9F);
      return azj.b((float)$$2, 1.0F);
   }

   private float a(btz $$0, long $$1, jg $$2) {
      double $$3 = this.a($$0, $$2);
      double $$4 = this.a($$0);
      if ($$0 instanceof coh $$5 && $$5.g() && $$5.dX().s().i()) {
         if (this.c.a($$1)) {
            this.c.a($$1, 0.5 - ($$4 - 0.25));
         }

         double $$6 = $$3 + this.c.a;
         return azj.b((float)$$6, 1.0F);
      }

      double $$7 = 0.5 - ($$4 - 0.25 - $$3);
      return azj.b((float)$$7, 1.0F);
   }

   @Nullable
   private gbx a(btz $$0, @Nullable gbx $$1) {
      return $$1 == null && $$0.dX() instanceof gbx ? (gbx)$$0.dX() : $$1;
   }

   private boolean a(btz $$0, @Nullable jo $$1) {
      return $$1 != null && $$1.a() == $$0.dX().ag() && !($$1.b().b($$0.dv()) < 1.0E-5F);
   }

   private double a(btz $$0, jg $$1) {
      ezh $$2 = ezh.b($$1);
      return Math.atan2($$2.c() - $$0.dI(), $$2.a() - $$0.dC()) / (float) (Math.PI * 2);
   }

   private double a(btz $$0) {
      return azj.c((double)($$0.dO() / 360.0F), 1.0);
   }

   private int a(int $$0) {
      return $$0 * 1327217883;
   }

   public interface a {
      @Nullable
      jo getPos(gbx var1, cvx var2, btz var3);
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
         $$2 = azj.c($$2 + 0.5, 1.0) - 0.5;
         this.b += $$2 * 0.1;
         this.b *= 0.8;
         this.a = azj.c(this.a + this.b, 1.0);
      }
   }
}
