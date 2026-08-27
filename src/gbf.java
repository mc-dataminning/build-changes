import javax.annotation.Nullable;

public class gbf implements gbe {
   public static final int a = 0;
   private final gbf.b c = new gbf.b();
   private final gbf.b d = new gbf.b();
   public final gbf.a b;

   public gbf(gbf.a $$0) {
      this.b = $$0;
   }

   @Override
   public float unclampedCall(clo $$0, @Nullable flo $$1, @Nullable bll $$2, int $$3) {
      bkv $$4 = (bkv)($$2 != null ? $$2 : $$0.H());
      if ($$4 == null) {
         return 0.0F;
      } else {
         $$1 = this.a($$4, $$1);
         return $$1 == null ? 0.0F : this.a($$0, $$1, $$3, $$4);
      }
   }

   private float a(clo $$0, flo $$1, int $$2, bkv $$3) {
      ie $$4 = this.b.getPos($$1, $$0, $$3);
      long $$5 = $$1.W();
      return !this.a($$3, $$4) ? this.a($$2, $$5) : this.a($$3, $$5, $$4.b());
   }

   private float a(int $$0, long $$1) {
      if (this.d.a($$1)) {
         this.d.a($$1, Math.random());
      }

      double $$2 = this.d.a + (double)((float)this.a($$0) / 2.1474836E9F);
      return atq.b((float)$$2, 1.0F);
   }

   private float a(bkv $$0, long $$1, hx $$2) {
      double $$3 = this.a($$0, $$2);
      double $$4 = this.a($$0);
      if ($$0 instanceof cdz $$5 && $$5.g()) {
         if (this.c.a($$1)) {
            this.c.a($$1, 0.5 - ($$4 - 0.25));
         }

         double $$6 = $$3 + this.c.a;
         return atq.b((float)$$6, 1.0F);
      }

      double $$7 = 0.5 - ($$4 - 0.25 - $$3);
      return atq.b((float)$$7, 1.0F);
   }

   @Nullable
   private flo a(bkv $$0, @Nullable flo $$1) {
      return $$1 == null && $$0.dN() instanceof flo ? (flo)$$0.dN() : $$1;
   }

   private boolean a(bkv $$0, @Nullable ie $$1) {
      return $$1 != null && $$1.a() == $$0.dN().ad() && !($$1.b().b($$0.dl()) < 1.0E-5F);
   }

   private double a(bkv $$0, hx $$1) {
      ejz $$2 = ejz.b($$1);
      return Math.atan2($$2.c() - $$0.dy(), $$2.a() - $$0.ds()) / (float) (Math.PI * 2);
   }

   private double a(bkv $$0) {
      return atq.c((double)($$0.dE() / 360.0F), 1.0);
   }

   private int a(int $$0) {
      return $$0 * 1327217883;
   }

   public interface a {
      @Nullable
      ie getPos(flo var1, clo var2, bkv var3);
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
         $$2 = atq.c($$2 + 0.5, 1.0) - 0.5;
         this.b += $$2 * 0.1;
         this.b *= 0.8;
         this.a = atq.c(this.a + this.b, 1.0);
      }
   }
}
