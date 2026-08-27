import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import javax.annotation.Nullable;

public abstract class fvb {
   private static final Object2ObjectMap<aiy, fvb> a = ac.a(new Object2ObjectArrayMap(), $$0 -> {
      fvb.c $$1 = new fvb.c();
      $$0.defaultReturnValue($$1);
      $$0.put(dom.e, $$1);
      $$0.put(dom.f, new fvb.b());
      $$0.put(dom.g, new fvb.a());
   });
   private final float[] b = new float[4];
   private final float c;
   private final boolean d;
   private final fvb.d e;
   private final boolean f;
   private final boolean g;

   public fvb(float $$0, boolean $$1, fvb.d $$2, boolean $$3, boolean $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public static fvb a(doo $$0) {
      return (fvb)a.get($$0.r());
   }

   @Nullable
   public float[] a(float $$0, float $$1) {
      float $$2 = 0.4F;
      float $$3 = awh.b($$0 * (float) (Math.PI * 2)) - 0.0F;
      float $$4 = -0.0F;
      if ($$3 >= -0.4F && $$3 <= 0.4F) {
         float $$5 = ($$3 - -0.0F) / 0.4F * 0.5F + 0.5F;
         float $$6 = 1.0F - (1.0F - awh.a($$5 * (float) Math.PI)) * 0.99F;
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

   public abstract ens a(ens var1, float var2);

   public abstract boolean a(int var1, int var2);

   public fvb.d c() {
      return this.e;
   }

   public boolean d() {
      return this.f;
   }

   public boolean e() {
      return this.g;
   }

   public static class a extends fvb {
      public a() {
         super(Float.NaN, false, fvb.d.c, true, false);
      }

      @Override
      public ens a(ens $$0, float $$1) {
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

   public static class b extends fvb {
      public b() {
         super(Float.NaN, true, fvb.d.a, false, true);
      }

      @Override
      public ens a(ens $$0, float $$1) {
         return $$0;
      }

      @Override
      public boolean a(int $$0, int $$1) {
         return true;
      }
   }

   public static class c extends fvb {
      public static final int a = 192;

      public c() {
         super(192.0F, true, fvb.d.b, false, false);
      }

      @Override
      public ens a(ens $$0, float $$1) {
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
