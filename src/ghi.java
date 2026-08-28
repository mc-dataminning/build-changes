import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;

public abstract class ghi {
   private static final Object2ObjectMap<alh, ghi> a = ad.a(new Object2ObjectArrayMap(), $$0 -> {
      ghi.c $$1 = new ghi.c();
      $$0.defaultReturnValue($$1);
      $$0.put(dyx.e, $$1);
      $$0.put(dyx.f, new ghi.b());
      $$0.put(dyx.g, new ghi.a());
   });
   private final float b;
   private final boolean c;
   private final ghi.d d;
   private final boolean e;
   private final boolean f;

   public ghi(float $$0, boolean $$1, ghi.d $$2, boolean $$3, boolean $$4) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
   }

   public static ghi a(dyz $$0) {
      return (ghi)a.get($$0.r());
   }

   public boolean a(float $$0) {
      return false;
   }

   public int b(float $$0) {
      return 0;
   }

   public float a() {
      return this.b;
   }

   public boolean b() {
      return this.c;
   }

   public abstract ezh a(ezh var1, float var2);

   public abstract boolean a(int var1, int var2);

   public ghi.d c() {
      return this.d;
   }

   public boolean d() {
      return this.e;
   }

   public boolean e() {
      return this.f;
   }

   public static class a extends ghi {
      public a() {
         super(Float.NaN, false, ghi.d.c, true, false);
      }

      @Override
      public ezh a(ezh $$0, float $$1) {
         return $$0.c(0.15F);
      }

      @Override
      public boolean a(int $$0, int $$1) {
         return false;
      }
   }

   public static class b extends ghi {
      public b() {
         super(Float.NaN, true, ghi.d.a, false, true);
      }

      @Override
      public ezh a(ezh $$0, float $$1) {
         return $$0;
      }

      @Override
      public boolean a(int $$0, int $$1) {
         return true;
      }
   }

   public static class c extends ghi {
      public static final int a = 192;
      private static final float b = 0.4F;

      public c() {
         super(192.0F, true, ghi.d.b, false, false);
      }

      @Override
      public boolean a(float $$0) {
         float $$1 = azj.b($$0 * (float) (Math.PI * 2));
         return $$1 >= -0.4F && $$1 <= 0.4F;
      }

      @Override
      public int b(float $$0) {
         float $$1 = azj.b($$0 * (float) (Math.PI * 2));
         float $$2 = $$1 / 0.4F * 0.5F + 0.5F;
         float $$3 = azj.l(1.0F - (1.0F - azj.a($$2 * (float) Math.PI)) * 0.99F);
         return axu.a($$3, $$2 * 0.3F + 0.7F, $$2 * $$2 * 0.7F + 0.2F, 0.2F);
      }

      @Override
      public ezh a(ezh $$0, float $$1) {
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
