import com.mojang.serialization.MapCodec;

public class yg implements yi {
   public static final yg a = new yg();
   public static final yj<yg> b = new yj<yg>() {
      private static final MapCodec<yg> a = MapCodec.unit(yg.a);
      private static final yq<wd, yg> b = yq.a(yg.a);

      @Override
      public MapCodec<yg> a() {
         return a;
      }

      @Override
      public yq<wd, yg> b() {
         return b;
      }
   };

   @Override
   public xg a(int $$0) {
      return ws.i();
   }

   @Override
   public yj<yg> a() {
      return b;
   }
}
