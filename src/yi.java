import com.mojang.serialization.MapCodec;

public class yi implements yk {
   public static final yi a = new yi();
   public static final yl<yi> b = new yl<yi>() {
      private static final MapCodec<yi> a = MapCodec.unit(yi.a);
      private static final ys<wf, yi> b = ys.a(yi.a);

      @Override
      public MapCodec<yi> a() {
         return a;
      }

      @Override
      public ys<wf, yi> b() {
         return b;
      }
   };

   @Override
   public xi a(int $$0) {
      return wu.i();
   }

   @Override
   public yl<yi> a() {
      return b;
   }
}
