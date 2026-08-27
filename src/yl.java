import com.mojang.serialization.MapCodec;

public class yl implements yn {
   public static final yl a = new yl();
   public static final yo<yl> b = new yo<yl>() {
      private static final MapCodec<yl> a = MapCodec.unit(yl.a);
      private static final yv<wi, yl> b = yv.a(yl.a);

      @Override
      public MapCodec<yl> a() {
         return a;
      }

      @Override
      public yv<wi, yl> b() {
         return b;
      }
   };

   @Override
   public xl a(int $$0) {
      return wx.i();
   }

   @Override
   public yo<yl> a() {
      return b;
   }
}
