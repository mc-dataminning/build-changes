import javax.annotation.Nullable;

public class gvo implements gvn {
   public static final int a = 0;
   private final gvo.b c = new gvo.b();
   private final gvo.b d = new gvo.b();
   public final gvo.a b;

   public gvo(gvo.a $$0) {
      this.b = $$0;
   }

   @Override
   public float unclampedCall(cvl $$0, @Nullable gax $$1, @Nullable buf $$2, int $$3) {
      btj $$4 = (btj)($$2 != null ? $$2 : $$0.G());
      if ($$4 == null) {
         return 0.0F;
      } else {
         $$1 = this.a($$4, $$1);
         return $$1 == null ? 0.0F : this.a($$0, $$1, $$3, $$4);
      }
   }

   private float a(cvl $$0, gax $$1, int $$2, btj $$3) {
      jm $$4 = this.b.getPos($$1, $$0, $$3);
      long $$5 = $$1.aa();
      return !this.a($$3, $$4) ? this.a($$2, $$5) : this.a($$3, $$5, $$4.b());
   }

   private float a(int $$0, long $$1) {
      if (this.d.a($$1)) {
         this.d.a($$1, Math.random());
      }

      double $$2 = this.d.a + (double)((float)this.a($$0) / 2.1474836E9F);
      return azc.b((float)$$2, 1.0F);
   }

   private float a(btj $$0, long $$1, je $$2) {
      double $$3 = this.a($$0, $$2);
      double $$4 = this.a($$0);
      if ($$0 instanceof cnp $$5 && $$5.g() && $$5.dS().s().i()) {
         if (this.c.a($$1)) {
            this.c.a($$1, 0.5 - ($$4 - 0.25));
         }

         double $$6 = $$3 + this.c.a;
         return azc.b((float)$$6, 1.0F);
      }

      double $$7 = 0.5 - ($$4 - 0.25 - $$3);
      return azc.b((float)$$7, 1.0F);
   }

   @Nullable
   private gax a(btj $$0, @Nullable gax $$1) {
      return $$1 == null && $$0.dS() instanceof gax ? (gax)$$0.dS() : $$1;
   }

   private boolean a(btj $$0, @Nullable jm $$1) {
      return $$1 != null && $$1.a() == $$0.dS().ag() && !($$1.b().b($$0.dq()) < 1.0E-5F);
   }

   private double a(btj $$0, je $$1) {
      eye $$2 = eye.b($$1);
      return Math.atan2($$2.c() - $$0.dD(), $$2.a() - $$0.dx()) / (float) (Math.PI * 2);
   }

   private double a(btj $$0) {
      return azc.c((double)($$0.dJ() / 360.0F), 1.0);
   }

   private int a(int $$0) {
      return $$0 * 1327217883;
   }

   public interface a {
      @Nullable
      jm getPos(gax var1, cvl var2, btj var3);
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
         $$2 = azc.c($$2 + 0.5, 1.0) - 0.5;
         this.b += $$2 * 0.1;
         this.b *= 0.8;
         this.a = azc.c(this.a + this.b, 1.0);
      }
   }
}
