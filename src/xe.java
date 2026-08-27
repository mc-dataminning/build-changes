import com.mojang.serialization.MapCodec;

public class xe implements xg {
   public static final xe a = new xe();
   public static final xh<xe> b = new xh<xe>() {
      private static final MapCodec<xe> a = MapCodec.unit(xe.a);
      private static final xo<vb, xe> b = xo.a(xe.a);

      @Override
      public MapCodec<xe> a() {
         return a;
      }

      @Override
      public xo<vb, xe> b() {
         return b;
      }
   };

   @Override
   public we a(int $$0) {
      return vq.i();
   }

   @Override
   public xh<xe> a() {
      return b;
   }
}
