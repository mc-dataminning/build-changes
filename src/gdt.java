import javax.annotation.Nullable;

public class gdt implements gds {
   public static final int a = 0;
   private final gdt.b c = new gdt.b();
   private final gdt.b d = new gdt.b();
   public final gdt.a b;

   public gdt(gdt.a $$0) {
      this.b = $$0;
   }

   @Override
   public float unclampedCall(cmy $$0, @Nullable fns $$1, @Nullable bml $$2, int $$3) {
      blv $$4 = (blv)($$2 != null ? $$2 : $$0.H());
      if ($$4 == null) {
         return 0.0F;
      } else {
         $$1 = this.a($$4, $$1);
         return $$1 == null ? 0.0F : this.a($$0, $$1, $$3, $$4);
      }
   }

   private float a(cmy $$0, fns $$1, int $$2, blv $$3) {
      ig $$4 = this.b.getPos($$1, $$0, $$3);
      long $$5 = $$1.X();
      return !this.a($$3, $$4) ? this.a($$2, $$5) : this.a($$3, $$5, $$4.b());
   }

   private float a(int $$0, long $$1) {
      if (this.d.a($$1)) {
         this.d.a($$1, Math.random());
      }

      double $$2 = this.d.a + (double)((float)this.a($$0) / 2.1474836E9F);
      return auo.b((float)$$2, 1.0F);
   }

   private float a(blv $$0, long $$1, hx $$2) {
      double $$3 = this.a($$0, $$2);
      double $$4 = this.a($$0);
      if ($$0 instanceof cfi $$5 && $$5.g()) {
         if (this.c.a($$1)) {
            this.c.a($$1, 0.5 - ($$4 - 0.25));
         }

         double $$6 = $$3 + this.c.a;
         return auo.b((float)$$6, 1.0F);
      }

      double $$7 = 0.5 - ($$4 - 0.25 - $$3);
      return auo.b((float)$$7, 1.0F);
   }

   @Nullable
   private fns a(blv $$0, @Nullable fns $$1) {
      return $$1 == null && $$0.dM() instanceof fns ? (fns)$$0.dM() : $$1;
   }

   private boolean a(blv $$0, @Nullable ig $$1) {
      return $$1 != null && $$1.a() == $$0.dM().ae() && !($$1.b().b($$0.dk()) < 1.0E-5F);
   }

   private double a(blv $$0, hx $$1) {
      elt $$2 = elt.b($$1);
      return Math.atan2($$2.c() - $$0.dx(), $$2.a() - $$0.dr()) / (float) (Math.PI * 2);
   }

   private double a(blv $$0) {
      return auo.c((double)($$0.dD() / 360.0F), 1.0);
   }

   private int a(int $$0) {
      return $$0 * 1327217883;
   }

   public interface a {
      @Nullable
      ig getPos(fns var1, cmy var2, blv var3);
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
         $$2 = auo.c($$2 + 0.5, 1.0) - 0.5;
         this.b += $$2 * 0.1;
         this.b *= 0.8;
         this.a = auo.c(this.a + this.b, 1.0);
      }
   }
}
