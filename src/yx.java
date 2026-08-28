import com.mojang.serialization.MapCodec;

public class yx implements yz {
   public static final yx a = new yx();
   public static final za<yx> b = new za<yx>() {
      private static final MapCodec<yx> a = MapCodec.unit(yx.a);
      private static final zh<wu, yx> b = zh.a(yx.a);

      @Override
      public MapCodec<yx> a() {
         return a;
      }

      @Override
      public zh<wu, yx> b() {
         return b;
      }
   };

   @Override
   public xx a(int $$0) {
      return xj.i();
   }

   @Override
   public za<yx> a() {
      return b;
   }
}
