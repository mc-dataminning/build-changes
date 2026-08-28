import javax.annotation.Nullable;

public class goo implements gon {
   public static final int a = 0;
   private final goo.b c = new goo.b();
   private final goo.b d = new goo.b();
   public final goo.a b;

   public goo(goo.a $$0) {
      this.b = $$0;
   }

   @Override
   public float unclampedCall(cua $$0, @Nullable fyd $$1, @Nullable bsy $$2, int $$3) {
      bsd $$4 = (bsd)($$2 != null ? $$2 : $$0.E());
      if ($$4 == null) {
         return 0.0F;
      } else {
         $$1 = this.a($$4, $$1);
         return $$1 == null ? 0.0F : this.a($$0, $$1, $$3, $$4);
      }
   }

   private float a(cua $$0, fyd $$1, int $$2, bsd $$3) {
      ji $$4 = this.b.getPos($$1, $$0, $$3);
      long $$5 = $$1.Z();
      return !this.a($$3, $$4) ? this.a($$2, $$5) : this.a($$3, $$5, $$4.b());
   }

   private float a(int $$0, long $$1) {
      if (this.d.a($$1)) {
         this.d.a($$1, Math.random());
      }

      double $$2 = this.d.a + (double)((float)this.a($$0) / 2.1474836E9F);
      return aye.b((float)$$2, 1.0F);
   }

   private float a(bsd $$0, long $$1, ja $$2) {
      double $$3 = this.a($$0, $$2);
      double $$4 = this.a($$0);
      if ($$0 instanceof cmh $$5 && $$5.g() && $$5.dP().s().i()) {
         if (this.c.a($$1)) {
            this.c.a($$1, 0.5 - ($$4 - 0.25));
         }

         double $$6 = $$3 + this.c.a;
         return aye.b((float)$$6, 1.0F);
      }

      double $$7 = 0.5 - ($$4 - 0.25 - $$3);
      return aye.b((float)$$7, 1.0F);
   }

   @Nullable
   private fyd a(bsd $$0, @Nullable fyd $$1) {
      return $$1 == null && $$0.dP() instanceof fyd ? (fyd)$$0.dP() : $$1;
   }

   private boolean a(bsd $$0, @Nullable ji $$1) {
      return $$1 != null && $$1.a() == $$0.dP().af() && !($$1.b().b($$0.dn()) < 1.0E-5F);
   }

   private double a(bsd $$0, ja $$1) {
      evz $$2 = evz.b($$1);
      return Math.atan2($$2.c() - $$0.dA(), $$2.a() - $$0.du()) / (float) (Math.PI * 2);
   }

   private double a(bsd $$0) {
      return aye.c((double)($$0.dG() / 360.0F), 1.0);
   }

   private int a(int $$0) {
      return $$0 * 1327217883;
   }

   public interface a {
      @Nullable
      ji getPos(fyd var1, cua var2, bsd var3);
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
         $$2 = aye.c($$2 + 0.5, 1.0) - 0.5;
         this.b += $$2 * 0.1;
         this.b *= 0.8;
         this.a = aye.c(this.a + this.b, 1.0);
      }
   }
}
