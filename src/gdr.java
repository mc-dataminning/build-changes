import javax.annotation.Nullable;

public class gdr implements gdq {
   public static final int a = 0;
   private final gdr.b c = new gdr.b();
   private final gdr.b d = new gdr.b();
   public final gdr.a b;

   public gdr(gdr.a $$0) {
      this.b = $$0;
   }

   @Override
   public float unclampedCall(cmx $$0, @Nullable fnq $$1, @Nullable bmk $$2, int $$3) {
      blu $$4 = (blu)($$2 != null ? $$2 : $$0.H());
      if ($$4 == null) {
         return 0.0F;
      } else {
         $$1 = this.a($$4, $$1);
         return $$1 == null ? 0.0F : this.a($$0, $$1, $$3, $$4);
      }
   }

   private float a(cmx $$0, fnq $$1, int $$2, blu $$3) {
      ig $$4 = this.b.getPos($$1, $$0, $$3);
      long $$5 = $$1.X();
      return !this.a($$3, $$4) ? this.a($$2, $$5) : this.a($$3, $$5, $$4.b());
   }

   private float a(int $$0, long $$1) {
      if (this.d.a($$1)) {
         this.d.a($$1, Math.random());
      }

      double $$2 = this.d.a + (double)((float)this.a($$0) / 2.1474836E9F);
      return aun.b((float)$$2, 1.0F);
   }

   private float a(blu $$0, long $$1, hx $$2) {
      double $$3 = this.a($$0, $$2);
      double $$4 = this.a($$0);
      if ($$0 instanceof cfh $$5 && $$5.g()) {
         if (this.c.a($$1)) {
            this.c.a($$1, 0.5 - ($$4 - 0.25));
         }

         double $$6 = $$3 + this.c.a;
         return aun.b((float)$$6, 1.0F);
      }

      double $$7 = 0.5 - ($$4 - 0.25 - $$3);
      return aun.b((float)$$7, 1.0F);
   }

   @Nullable
   private fnq a(blu $$0, @Nullable fnq $$1) {
      return $$1 == null && $$0.dM() instanceof fnq ? (fnq)$$0.dM() : $$1;
   }

   private boolean a(blu $$0, @Nullable ig $$1) {
      return $$1 != null && $$1.a() == $$0.dM().ae() && !($$1.b().b($$0.dk()) < 1.0E-5F);
   }

   private double a(blu $$0, hx $$1) {
      els $$2 = els.b($$1);
      return Math.atan2($$2.c() - $$0.dx(), $$2.a() - $$0.dr()) / (float) (Math.PI * 2);
   }

   private double a(blu $$0) {
      return aun.c((double)($$0.dD() / 360.0F), 1.0);
   }

   private int a(int $$0) {
      return $$0 * 1327217883;
   }

   public interface a {
      @Nullable
      ig getPos(fnq var1, cmx var2, blu var3);
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
         $$2 = aun.c($$2 + 0.5, 1.0) - 0.5;
         this.b += $$2 * 0.1;
         this.b *= 0.8;
         this.a = aun.c(this.a + this.b, 1.0);
      }
   }
}
