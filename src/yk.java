import com.mojang.serialization.MapCodec;

public class yk implements ym {
   public static final yk a = new yk();
   public static final yn<yk> b = new yn<yk>() {
      private static final MapCodec<yk> a = MapCodec.unit(yk.a);
      private static final yu<wh, yk> b = yu.a(yk.a);

      @Override
      public MapCodec<yk> a() {
         return a;
      }

      @Override
      public yu<wh, yk> b() {
         return b;
      }
   };

   @Override
   public xk a(int $$0) {
      return ww.i();
   }

   @Override
   public yn<yk> a() {
      return b;
   }
}
