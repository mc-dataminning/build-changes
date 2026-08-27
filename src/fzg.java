import javax.annotation.Nullable;

public class fzg implements fzf {
   public static final int a = 0;
   private final fzg.b c = new fzg.b();
   private final fzg.b d = new fzg.b();
   public final fzg.a b;

   public fzg(fzg.a $$0) {
      this.b = $$0;
   }

   @Override
   public float unclampedCall(ckj $$0, @Nullable fjr $$1, @Nullable bkj $$2, int $$3) {
      bjt $$4 = (bjt)($$2 != null ? $$2 : $$0.H());
      if ($$4 == null) {
         return 0.0F;
      } else {
         $$1 = this.a($$4, $$1);
         return $$1 == null ? 0.0F : this.a($$0, $$1, $$3, $$4);
      }
   }

   private float a(ckj $$0, fjr $$1, int $$2, bjt $$3) {
      ia $$4 = this.b.getPos($$1, $$0, $$3);
      long $$5 = $$1.V();
      return !this.a($$3, $$4) ? this.a($$2, $$5) : this.a($$3, $$5, $$4.b());
   }

   private float a(int $$0, long $$1) {
      if (this.d.a($$1)) {
         this.d.a($$1, Math.random());
      }

      double $$2 = this.d.a + (double)((float)this.a($$0) / 2.1474836E9F);
      return asy.b((float)$$2, 1.0F);
   }

   private float a(bjt $$0, long $$1, ht $$2) {
      double $$3 = this.a($$0, $$2);
      double $$4 = this.a($$0);
      if ($$0 instanceof ccx $$5 && $$5.g()) {
         if (this.c.a($$1)) {
            this.c.a($$1, 0.5 - ($$4 - 0.25));
         }

         double $$6 = $$3 + this.c.a;
         return asy.b((float)$$6, 1.0F);
      }

      double $$7 = 0.5 - ($$4 - 0.25 - $$3);
      return asy.b((float)$$7, 1.0F);
   }

   @Nullable
   private fjr a(bjt $$0, @Nullable fjr $$1) {
      return $$1 == null && $$0.dL() instanceof fjr ? (fjr)$$0.dL() : $$1;
   }

   private boolean a(bjt $$0, @Nullable ia $$1) {
      return $$1 != null && $$1.a() == $$0.dL().ac() && !($$1.b().b($$0.dj()) < 1.0E-5F);
   }

   private double a(bjt $$0, ht $$1) {
      eif $$2 = eif.b($$1);
      return Math.atan2($$2.c() - $$0.dw(), $$2.a() - $$0.dq()) / (float) (Math.PI * 2);
   }

   private double a(bjt $$0) {
      return asy.c((double)($$0.dC() / 360.0F), 1.0);
   }

   private int a(int $$0) {
      return $$0 * 1327217883;
   }

   public interface a {
      @Nullable
      ia getPos(fjr var1, ckj var2, bjt var3);
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
         $$2 = asy.c($$2 + 0.5, 1.0) - 0.5;
         this.b += $$2 * 0.1;
         this.b *= 0.8;
         this.a = asy.c(this.a + this.b, 1.0);
      }
   }
}
