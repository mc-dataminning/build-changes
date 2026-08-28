import com.mojang.serialization.MapCodec;

public class yo implements yq {
   public static final yo a = new yo();
   public static final yr<yo> b = new yr<yo>() {
      private static final MapCodec<yo> a = MapCodec.unit(yo.a);
      private static final yy<wl, yo> b = yy.a(yo.a);

      @Override
      public MapCodec<yo> a() {
         return a;
      }

      @Override
      public yy<wl, yo> b() {
         return b;
      }
   };

   @Override
   public xo a(int $$0) {
      return xa.i();
   }

   @Override
   public yr<yo> a() {
      return b;
   }
}
