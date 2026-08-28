import com.mojang.serialization.MapCodec;

public class yc implements ye {
   public static final yc a = new yc();
   public static final yf<yc> b = new yf<yc>() {
      private static final MapCodec<yc> a = MapCodec.unit(yc.a);
      private static final ym<vz, yc> b = ym.a(yc.a);

      @Override
      public MapCodec<yc> a() {
         return a;
      }

      @Override
      public ym<vz, yc> b() {
         return b;
      }
   };

   @Override
   public xc a(int $$0) {
      return wo.i();
   }

   @Override
   public yf<yc> a() {
      return b;
   }
}
