import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import javax.annotation.Nullable;

public abstract class gev {
   private static final Object2ObjectMap<akt, gev> b = ad.a(new Object2ObjectArrayMap(), $$0 -> {
      gev.c $$1 = new gev.c();
      $$0.defaultReturnValue($$1);
      $$0.put(dws.f, $$1);
      $$0.put(dws.g, new gev.b());
      $$0.put(dws.h, new gev.a());
      $$0.put(dws.i, new gev.d());
   });
   protected final float[] a = new float[4];
   private final float c;
   private final boolean d;
   private final gev.e e;
   private final boolean f;
   private final boolean g;

   public gev(float $$0, boolean $$1, gev.e $$2, boolean $$3, boolean $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public static gev a(dwu $$0) {
      return (gev)b.get($$0.r());
   }

   @Nullable
   public float[] a(float $$0, float $$1) {
      float $$2 = 0.4F;
      float $$3 = aym.b($$0 * (float) (Math.PI * 2)) - 0.0F;
      float $$4 = -0.0F;
      if ($$3 >= -0.4F && $$3 <= 0.4F) {
         float $$5 = ($$3 - -0.0F) / 0.4F * 0.5F + 0.5F;
         float $$6 = 1.0F - (1.0F - aym.a($$5 * (float) Math.PI)) * 0.99F;
         $$6 *= $$6;
         this.a[0] = $$5 * 0.3F + 0.7F;
         this.a[1] = $$5 * $$5 * 0.7F + 0.2F;
         this.a[2] = $$5 * $$5 * 0.0F + 0.2F;
         this.a[3] = $$6;
         return this.a;
      } else {
         return null;
      }
   }

   public float a() {
      return this.c;
   }

   public boolean b() {
      return this.d;
   }

   public abstract ewu a(ewu var1, float var2);

   public abstract boolean a(int var1, int var2);

   public gev.e c() {
      return this.e;
   }

   public int d() {
      return 16777215;
   }

   public boolean e() {
      return this.f;
   }

   public boolean f() {
      return this.g;
   }

   public static class a extends gev {
      public a() {
         super(Float.NaN, false, gev.e.c, true, false);
      }

      @Override
      public ewu a(ewu $$0, float $$1) {
         return $$0.a(0.15F);
      }

      @Override
      public boolean a(int $$0, int $$1) {
         return false;
      }

      @Nullable
      @Override
      public float[] a(float $$0, float $$1) {
         return null;
      }
   }

   public static class b extends gev {
      public b() {
         super(Float.NaN, true, gev.e.a, false, true);
      }

      @Override
      public ewu a(ewu $$0, float $$1) {
         return $$0;
      }

      @Override
      public boolean a(int $$0, int $$1) {
         return true;
      }
   }

   public static class c extends gev {
      public static final int b = 192;

      public c() {
         super(192.0F, true, gev.e.b, false, false);
      }

      @Override
      public ewu a(ewu $$0, float $$1) {
         return $$0.d((double)($$1 * 0.94F + 0.06F), (double)($$1 * 0.94F + 0.06F), (double)($$1 * 0.91F + 0.09F));
      }

      @Override
      public boolean a(int $$0, int $$1) {
         return false;
      }
   }

   public static class d extends gev {
      public d() {
         super(112.0F, false, gev.e.b, false, false);
      }

      @Override
      public ewu a(ewu $$0, float $$1) {
         return $$0.d((double)($$1 * 0.94F + 0.06F), (double)($$1 * 0.94F + 0.06F), (double)($$1 * 0.91F + 0.09F));
      }

      @Override
      public boolean a(int $$0, int $$1) {
         return false;
      }

      @Override
      public int d() {
         return 14548906;
      }

      @Nullable
      @Override
      public float[] a(float $$0, float $$1) {
         float $$2 = 0.4F;
         float $$3 = aym.b($$0 * (float) (Math.PI * 2)) - 0.0F;
         float $$4 = -0.0F;
         if ($$3 >= -0.4F && $$3 <= 0.4F) {
            float $$5 = ($$3 - -0.0F) / 0.4F * 0.5F + 0.5F;
            float $$6 = 1.0F - (1.0F - aym.a($$5 * (float) Math.PI)) * 0.99F;
            $$6 *= $$6;
            this.a[0] = $$5 * $$5 * 0.3F + 0.35F;
            this.a[1] = $$5 * 0.7F + 0.2F;
            this.a[2] = $$5 * $$5 * 0.0F + 0.2F;
            this.a[3] = $$6;
            return this.a;
         } else {
            return null;
         }
      }
   }

   public static enum e {
      a,
      b,
      c;
   }
}
