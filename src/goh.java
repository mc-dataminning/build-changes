import javax.annotation.Nullable;

public class goh implements gog {
   public static final int a = 0;
   private final goh.b c = new goh.b();
   private final goh.b d = new goh.b();
   public final goh.a b;

   public goh(goh.a $$0) {
      this.b = $$0;
   }

   @Override
   public float unclampedCall(cur $$0, @Nullable fxx $$1, @Nullable btr $$2, int $$3) {
      bsw $$4 = (bsw)($$2 != null ? $$2 : $$0.F());
      if ($$4 == null) {
         return 0.0F;
      } else {
         $$1 = this.a($$4, $$1);
         return $$1 == null ? 0.0F : this.a($$0, $$1, $$3, $$4);
      }
   }

   private float a(cur $$0, fxx $$1, int $$2, bsw $$3) {
      jh $$4 = this.b.getPos($$1, $$0, $$3);
      long $$5 = $$1.Z();
      return !this.a($$3, $$4) ? this.a($$2, $$5) : this.a($$3, $$5, $$4.b());
   }

   private float a(int $$0, long $$1) {
      if (this.d.a($$1)) {
         this.d.a($$1, Math.random());
      }

      double $$2 = this.d.a + (double)((float)this.a($$0) / 2.1474836E9F);
      return ayz.b((float)$$2, 1.0F);
   }

   private float a(bsw $$0, long $$1, iz $$2) {
      double $$3 = this.a($$0, $$2);
      double $$4 = this.a($$0);
      if ($$0 instanceof cmz $$5 && $$5.g() && $$5.dP().s().i()) {
         if (this.c.a($$1)) {
            this.c.a($$1, 0.5 - ($$4 - 0.25));
         }

         double $$6 = $$3 + this.c.a;
         return ayz.b((float)$$6, 1.0F);
      }

      double $$7 = 0.5 - ($$4 - 0.25 - $$3);
      return ayz.b((float)$$7, 1.0F);
   }

   @Nullable
   private fxx a(bsw $$0, @Nullable fxx $$1) {
      return $$1 == null && $$0.dP() instanceof fxx ? (fxx)$$0.dP() : $$1;
   }

   private boolean a(bsw $$0, @Nullable jh $$1) {
      return $$1 != null && $$1.a() == $$0.dP().af() && !($$1.b().b($$0.dn()) < 1.0E-5F);
   }

   private double a(bsw $$0, iz $$1) {
      evt $$2 = evt.b($$1);
      return Math.atan2($$2.c() - $$0.dA(), $$2.a() - $$0.du()) / (float) (Math.PI * 2);
   }

   private double a(bsw $$0) {
      return ayz.c((double)($$0.dG() / 360.0F), 1.0);
   }

   private int a(int $$0) {
      return $$0 * 1327217883;
   }

   public interface a {
      @Nullable
      jh getPos(fxx var1, cur var2, bsw var3);
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
         $$2 = ayz.c($$2 + 0.5, 1.0) - 0.5;
         this.b += $$2 * 0.1;
         this.b *= 0.8;
         this.a = ayz.c(this.a + this.b, 1.0);
      }
   }
}
