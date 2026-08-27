import com.mojang.serialization.MapCodec;

public class xg implements xi {
   public static final xg a = new xg();
   public static final xj<xg> b = new xj<xg>() {
      private static final MapCodec<xg> a = MapCodec.unit(xg.a);
      private static final xq<vd, xg> b = xq.a(xg.a);

      @Override
      public MapCodec<xg> a() {
         return a;
      }

      @Override
      public xq<vd, xg> b() {
         return b;
      }
   };

   @Override
   public wg a(int $$0) {
      return vs.i();
   }

   @Override
   public xj<xg> a() {
      return b;
   }
}
