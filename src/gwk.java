import javax.annotation.Nullable;

public class gwk implements gwj {
   public static final int a = 0;
   private final gwk.b c = new gwk.b();
   private final gwk.b d = new gwk.b();
   public final gwk.a b;

   public gwk(gwk.a $$0) {
      this.b = $$0;
   }

   @Override
   public float unclampedCall(cvs $$0, @Nullable gbm $$1, @Nullable bun $$2, int $$3) {
      btr $$4 = (btr)($$2 != null ? $$2 : $$0.H());
      if ($$4 == null) {
         return 0.0F;
      } else {
         $$1 = this.a($$4, $$1);
         return $$1 == null ? 0.0F : this.a($$0, $$1, $$3, $$4);
      }
   }

   private float a(cvs $$0, gbm $$1, int $$2, btr $$3) {
      jn $$4 = this.b.getPos($$1, $$0, $$3);
      long $$5 = $$1.aa();
      return !this.a($$3, $$4) ? this.a($$2, $$5) : this.a($$3, $$5, $$4.b());
   }

   private float a(int $$0, long $$1) {
      if (this.d.a($$1)) {
         this.d.a($$1, Math.random());
      }

      double $$2 = this.d.a + (double)((float)this.a($$0) / 2.1474836E9F);
      return azf.b((float)$$2, 1.0F);
   }

   private float a(btr $$0, long $$1, jf $$2) {
      double $$3 = this.a($$0, $$2);
      double $$4 = this.a($$0);
      if ($$0 instanceof cnx $$5 && $$5.g() && $$5.dS().s().i()) {
         if (this.c.a($$1)) {
            this.c.a($$1, 0.5 - ($$4 - 0.25));
         }

         double $$6 = $$3 + this.c.a;
         return azf.b((float)$$6, 1.0F);
      }

      double $$7 = 0.5 - ($$4 - 0.25 - $$3);
      return azf.b((float)$$7, 1.0F);
   }

   @Nullable
   private gbm a(btr $$0, @Nullable gbm $$1) {
      return $$1 == null && $$0.dS() instanceof gbm ? (gbm)$$0.dS() : $$1;
   }

   private boolean a(btr $$0, @Nullable jn $$1) {
      return $$1 != null && $$1.a() == $$0.dS().ag() && !($$1.b().b($$0.dq()) < 1.0E-5F);
   }

   private double a(btr $$0, jf $$1) {
      eyw $$2 = eyw.b($$1);
      return Math.atan2($$2.c() - $$0.dD(), $$2.a() - $$0.dx()) / (float) (Math.PI * 2);
   }

   private double a(btr $$0) {
      return azf.c((double)($$0.dJ() / 360.0F), 1.0);
   }

   private int a(int $$0) {
      return $$0 * 1327217883;
   }

   public interface a {
      @Nullable
      jn getPos(gbm var1, cvs var2, btr var3);
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
         $$2 = azf.c($$2 + 0.5, 1.0) - 0.5;
         this.b += $$2 * 0.1;
         this.b *= 0.8;
         this.a = azf.c(this.a + this.b, 1.0);
      }
   }
}
