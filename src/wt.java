import com.mojang.serialization.MapCodec;

public class wt implements wv {
   public static final wt a = new wt();
   public static final ww<wt> b = new ww<wt>() {
      private static final MapCodec<wt> a = MapCodec.unit(wt.a);

      @Override
      public MapCodec<wt> a() {
         return a;
      }

      public void a(ui $$0, wt $$1) {
      }

      public wt a(ui $$0) {
         return wt.a;
      }
   };

   @Override
   public vt a(int $$0) {
      return vf.i();
   }

   @Override
   public ww<wt> a() {
      return b;
   }
}
