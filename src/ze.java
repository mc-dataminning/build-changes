import com.mojang.serialization.MapCodec;

public class ze implements zf {
   public static final zg<ze> a = new zg<ze>() {
      private static final MapCodec<ze> a = xr.a.fieldOf("value").xmap(ze::new, $$0 -> $$0.b);
      private static final zn<xa, ze> b = zn.a(xr.d, $$0 -> $$0.b, ze::new);

      @Override
      public MapCodec<ze> a() {
         return a;
      }

      @Override
      public zn<xa, ze> b() {
         return b;
      }
   };
   final xp b;

   public ze(xp $$0) {
      this.b = $$0;
   }

   @Override
   public yd a(int $$0) {
      return this.b.f();
   }

   @Override
   public zg<ze> a() {
      return a;
   }
}
