import com.mojang.serialization.MapCodec;

public class ym implements yo {
   public static final ym a = new ym();
   public static final yp<ym> b = new yp<ym>() {
      private static final MapCodec<ym> a = MapCodec.unit(ym.a);
      private static final yw<wj, ym> b = yw.a(ym.a);

      @Override
      public MapCodec<ym> a() {
         return a;
      }

      @Override
      public yw<wj, ym> b() {
         return b;
      }
   };

   @Override
   public xm a(int $$0) {
      return wy.i();
   }

   @Override
   public yp<ym> a() {
      return b;
   }
}
