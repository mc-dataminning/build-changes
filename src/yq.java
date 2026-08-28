import com.mojang.serialization.MapCodec;

public class yq implements ys {
   public static final yq a = new yq();
   public static final yt<yq> b = new yt<yq>() {
      private static final MapCodec<yq> a = MapCodec.unit(yq.a);
      private static final za<wn, yq> b = za.a(yq.a);

      @Override
      public MapCodec<yq> a() {
         return a;
      }

      @Override
      public za<wn, yq> b() {
         return b;
      }
   };

   @Override
   public xq a(int $$0) {
      return xc.i();
   }

   @Override
   public yt<yq> a() {
      return b;
   }
}
