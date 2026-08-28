import com.mojang.serialization.MapCodec;

public class yr implements yt {
   public static final yr a = new yr();
   public static final yu<yr> b = new yu<yr>() {
      private static final MapCodec<yr> a = MapCodec.unit(yr.a);
      private static final zb<wo, yr> b = zb.a(yr.a);

      @Override
      public MapCodec<yr> a() {
         return a;
      }

      @Override
      public zb<wo, yr> b() {
         return b;
      }
   };

   @Override
   public xr a(int $$0) {
      return xd.i();
   }

   @Override
   public yu<yr> a() {
      return b;
   }
}
