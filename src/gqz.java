import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;

public abstract class gqz {
   private static final Object2ObjectMap<alr, gqz> a = ag.a(new Object2ObjectArrayMap(), $$0 -> {
      gqz.c $$1 = new gqz.c();
      $$0.defaultReturnValue($$1);
      $$0.put(efl.e, $$1);
      $$0.put(efl.f, new gqz.b());
      $$0.put(efl.g, new gqz.a());
   });
   private final float b;
   private final boolean c;
   private final gqz.d d;
   private final boolean e;
   private final boolean f;

   public gqz(float $$0, boolean $$1, gqz.d $$2, boolean $$3, boolean $$4) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
   }

   public static gqz a(efn $$0) {
      return (gqz)a.get($$0.r());
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

   public abstract fgc a(fgc var1, float var2);

   public abstract boolean a(int var1, int var2);

   public gqz.d c() {
      return this.d;
   }

   public boolean d() {
      return this.e;
   }

   public boolean e() {
      return this.f;
   }

   public static class a extends gqz {
      public a() {
         super(Float.NaN, false, gqz.d.c, true, false);
      }

      @Override
      public fgc a(fgc $$0, float $$1) {
         return $$0.c(0.15F);
      }

      @Override
      public boolean a(int $$0, int $$1) {
         return false;
      }
   }

   public static class b extends gqz {
      public b() {
         super(Float.NaN, true, gqz.d.a, false, true);
      }

      @Override
      public fgc a(fgc $$0, float $$1) {
         return $$0;
      }

      @Override
      public boolean a(int $$0, int $$1) {
         return true;
      }
   }

   public static class c extends gqz {
      public static final int a = 192;
      private static final float b = 0.4F;

      public c() {
         super(192.0F, true, gqz.d.b, false, false);
      }

      @Override
      public boolean a(float $$0) {
         float $$1 = azz.b($$0 * (float) (Math.PI * 2));
         return $$1 >= -0.4F && $$1 <= 0.4F;
      }

      @Override
      public int b(float $$0) {
         float $$1 = azz.b($$0 * (float) (Math.PI * 2));
         float $$2 = $$1 / 0.4F * 0.5F + 0.5F;
         float $$3 = azz.l(1.0F - (1.0F - azz.a($$2 * (float) Math.PI)) * 0.99F);
         return ayh.a($$3, $$2 * 0.3F + 0.7F, $$2 * $$2 * 0.7F + 0.2F, 0.2F);
      }

      @Override
      public fgc a(fgc $$0, float $$1) {
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
