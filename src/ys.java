import com.mojang.serialization.MapCodec;

public class ys implements yu {
   public static final ys a = new ys();
   public static final yv<ys> b = new yv<ys>() {
      private static final MapCodec<ys> a = MapCodec.unit(ys.a);
      private static final zc<wp, ys> b = zc.a(ys.a);

      @Override
      public MapCodec<ys> a() {
         return a;
      }

      @Override
      public zc<wp, ys> b() {
         return b;
      }
   };

   @Override
   public xs a(int $$0) {
      return xe.i();
   }

   @Override
   public yv<ys> a() {
      return b;
   }
}
