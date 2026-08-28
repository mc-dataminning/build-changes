import com.mojang.serialization.MapCodec;

public class yw implements yy {
   public static final yw a = new yw();
   public static final yz<yw> b = new yz<yw>() {
      private static final MapCodec<yw> a = MapCodec.unit(yw.a);
      private static final zg<wt, yw> b = zg.a(yw.a);

      @Override
      public MapCodec<yw> a() {
         return a;
      }

      @Override
      public zg<wt, yw> b() {
         return b;
      }
   };

   @Override
   public xw a(int $$0) {
      return xi.i();
   }

   @Override
   public yz<yw> a() {
      return b;
   }
}
