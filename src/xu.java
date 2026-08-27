import com.mojang.serialization.MapCodec;

public class xu implements xw {
   public static final xu a = new xu();
   public static final xx<xu> b = new xx<xu>() {
      private static final MapCodec<xu> a = MapCodec.unit(xu.a);
      private static final ye<vr, xu> b = ye.a(xu.a);

      @Override
      public MapCodec<xu> a() {
         return a;
      }

      @Override
      public ye<vr, xu> b() {
         return b;
      }
   };

   @Override
   public wu a(int $$0) {
      return wg.i();
   }

   @Override
   public xx<xu> a() {
      return b;
   }
}
