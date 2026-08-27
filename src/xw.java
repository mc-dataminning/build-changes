import com.mojang.serialization.MapCodec;

public class xw implements xy {
   public static final xw a = new xw();
   public static final xz<xw> b = new xz<xw>() {
      private static final MapCodec<xw> a = MapCodec.unit(xw.a);
      private static final yg<vt, xw> b = yg.a(xw.a);

      @Override
      public MapCodec<xw> a() {
         return a;
      }

      @Override
      public yg<vt, xw> b() {
         return b;
      }
   };

   @Override
   public ww a(int $$0) {
      return wi.i();
   }

   @Override
   public xz<xw> a() {
      return b;
   }
}
