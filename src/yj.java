import com.mojang.serialization.MapCodec;

public class yj implements yl {
   public static final yj a = new yj();
   public static final ym<yj> b = new ym<yj>() {
      private static final MapCodec<yj> a = MapCodec.unit(yj.a);
      private static final yt<wg, yj> b = yt.a(yj.a);

      @Override
      public MapCodec<yj> a() {
         return a;
      }

      @Override
      public yt<wg, yj> b() {
         return b;
      }
   };

   @Override
   public xj a(int $$0) {
      return wv.i();
   }

   @Override
   public ym<yj> a() {
      return b;
   }
}
