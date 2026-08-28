import com.mojang.serialization.MapCodec;

public class yu implements yw {
   public static final yu a = new yu();
   public static final yx<yu> b = new yx<yu>() {
      private static final MapCodec<yu> a = MapCodec.unit(yu.a);
      private static final ze<wp, yu> b = ze.a(yu.a);

      @Override
      public MapCodec<yu> a() {
         return a;
      }

      @Override
      public ze<wp, yu> b() {
         return b;
      }
   };

   @Override
   public xu a(int $$0) {
      return xg.i();
   }

   @Override
   public yx<yu> a() {
      return b;
   }
}
