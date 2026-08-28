import com.mojang.serialization.MapCodec;

public class yy implements za {
   public static final yy a = new yy();
   public static final zb<yy> b = new zb<yy>() {
      private static final MapCodec<yy> a = MapCodec.unit(yy.a);
      private static final zi<wv, yy> b = zi.a(yy.a);

      @Override
      public MapCodec<yy> a() {
         return a;
      }

      @Override
      public zi<wv, yy> b() {
         return b;
      }
   };

   @Override
   public xy a(int $$0) {
      return xk.i();
   }

   @Override
   public zb<yy> a() {
      return b;
   }
}
