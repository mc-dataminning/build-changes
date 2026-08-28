import com.mojang.serialization.MapCodec;

public class yd implements yf {
   public static final yd a = new yd();
   public static final yg<yd> b = new yg<yd>() {
      private static final MapCodec<yd> a = MapCodec.unit(yd.a);
      private static final yn<wa, yd> b = yn.a(yd.a);

      @Override
      public MapCodec<yd> a() {
         return a;
      }

      @Override
      public yn<wa, yd> b() {
         return b;
      }
   };

   @Override
   public xd a(int $$0) {
      return wp.i();
   }

   @Override
   public yg<yd> a() {
      return b;
   }
}
