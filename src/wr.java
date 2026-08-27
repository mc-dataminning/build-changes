import com.mojang.serialization.MapCodec;

public class wr implements wt {
   public static final wr a = new wr();
   public static final wu<wr> b = new wu<wr>() {
      private static final MapCodec<wr> a = MapCodec.unit(wr.a);

      @Override
      public MapCodec<wr> a() {
         return a;
      }

      public void a(ug $$0, wr $$1) {
      }

      public wr a(ug $$0) {
         return wr.a;
      }
   };

   @Override
   public vr a(int $$0) {
      return vd.i();
   }

   @Override
   public wu<wr> a() {
      return b;
   }
}
