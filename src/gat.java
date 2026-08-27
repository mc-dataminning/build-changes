import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import javax.annotation.Nullable;

public abstract class gat {
   private static final Object2ObjectMap<akf, gat> a = ac.a(new Object2ObjectArrayMap(), $$0 -> {
      gat.c $$1 = new gat.c();
      $$0.defaultReturnValue($$1);
      $$0.put(dto.e, $$1);
      $$0.put(dto.f, new gat.b());
      $$0.put(dto.g, new gat.a());
   });
   private final float[] b = new float[4];
   private final float c;
   private final boolean d;
   private final gat.d e;
   private final boolean f;
   private final boolean g;

   public gat(float $$0, boolean $$1, gat.d $$2, boolean $$3, boolean $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public static gat a(dtq $$0) {
      return (gat)a.get($$0.r());
   }

   @Nullable
   public float[] a(float $$0, float $$1) {
      float $$2 = 0.4F;
      float $$3 = axw.b($$0 * (float) (Math.PI * 2)) - 0.0F;
      float $$4 = -0.0F;
      if ($$3 >= -0.4F && $$3 <= 0.4F) {
         float $$5 = ($$3 - -0.0F) / 0.4F * 0.5F + 0.5F;
         float $$6 = 1.0F - (1.0F - axw.a($$5 * (float) Math.PI)) * 0.99F;
         $$6 *= $$6;
         this.b[0] = $$5 * 0.3F + 0.7F;
         this.b[1] = $$5 * $$5 * 0.7F + 0.2F;
         this.b[2] = $$5 * $$5 * 0.0F + 0.2F;
         this.b[3] = $$6;
         return this.b;
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

   public abstract etf a(etf var1, float var2);

   public abstract boolean a(int var1, int var2);

   public gat.d c() {
      return this.e;
   }

   public boolean d() {
      return this.f;
   }

   public boolean e() {
      return this.g;
   }

   public static class a extends gat {
      public a() {
         super(Float.NaN, false, gat.d.c, true, false);
      }

      @Override
      public etf a(etf $$0, float $$1) {
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

   public static class b extends gat {
      public b() {
         super(Float.NaN, true, gat.d.a, false, true);
      }

      @Override
      public etf a(etf $$0, float $$1) {
         return $$0;
      }

      @Override
      public boolean a(int $$0, int $$1) {
         return true;
      }
   }

   public static class c extends gat {
      public static final int a = 192;

      public c() {
         super(192.0F, true, gat.d.b, false, false);
      }

      @Override
      public etf a(etf $$0, float $$1) {
         return $$0.d((double)($$1 * 0.94F + 0.06F), (double)($$1 * 0.94F + 0.06F), (double)($$1 * 0.91F + 0.09F));
      }

      @Override
      public boolean a(int $$0, int $$1) {
         return false;
      }
   }

   public static enum d {
      a,
      b,
      c;
   }
}
