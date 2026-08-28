import javax.annotation.Nullable;

public abstract class hgv {
   private final boolean a;

   protected hgv(boolean $$0) {
      this.a = $$0;
   }

   public float a(czd $$0, @Nullable gjz $$1, @Nullable bxe $$2, int $$3) {
      bwf $$4 = (bwf)($$2 != null ? $$2 : $$0.J());
      if ($$4 == null) {
         return 0.0F;
      } else {
         if ($$1 == null && $$4.dV() instanceof gjz $$5) {
            $$1 = $$5;
         }

         return $$1 == null ? 0.0F : this.a($$0, $$1, $$3, $$4);
      }
   }

   protected abstract float a(czd var1, gjz var2, int var3, bwf var4);

   protected boolean b() {
      return this.a;
   }

   protected hgv.a a(float $$0) {
      return this.a ? b($$0) : c();
   }

   public static hgv.a b(final float $$0) {
      return new hgv.a() {
         private float b;
         private float c;
         private long d;

         @Override
         public float a() {
            return this.b;
         }

         @Override
         public boolean a(long $$0x) {
            return this.d != $$0;
         }

         @Override
         public void a(long $$0x, float $$1) {
            this.d = $$0;
            float $$2 = azm.b($$1 - this.b + 0.5F, 1.0F) - 0.5F;
            this.c += $$2 * 0.1F;
            this.c = this.c * $$0;
            this.b = azm.b(this.b + this.c, 1.0F);
         }
      };
   }

   public static hgv.a c() {
      return new hgv.a() {
         private float a;

         @Override
         public float a() {
            return this.a;
         }

         @Override
         public boolean a(long $$0) {
            return true;
         }

         @Override
         public void a(long $$0, float $$1) {
            this.a = $$1;
         }
      };
   }

   public interface a {
      float a();

      boolean a(long var1);

      void a(long var1, float var3);
   }
}
