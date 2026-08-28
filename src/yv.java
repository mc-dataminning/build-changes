import com.mojang.serialization.MapCodec;

public class yv implements yx {
   public static final yv a = new yv();
   public static final yy<yv> b = new yy<yv>() {
      private static final MapCodec<yv> a = MapCodec.unit(yv.a);
      private static final zf<ws, yv> b = zf.a(yv.a);

      @Override
      public MapCodec<yv> a() {
         return a;
      }

      @Override
      public zf<ws, yv> b() {
         return b;
      }
   };

   @Override
   public xv a(int $$0) {
      return xh.i();
   }

   @Override
   public yy<yv> a() {
      return b;
   }
}
