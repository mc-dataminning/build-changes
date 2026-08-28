import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class hbj implements hbk {
   public static final hbk a = new hbj();

   @Override
   public void a(hbn $$0, cwo $$1, hbl $$2, cwm $$3, @Nullable gfy $$4, @Nullable bvg $$5, int $$6) {
   }

   public static record a() implements hbk.b {
      public static final MapCodec<hbj.a> a = MapCodec.unit(hbj.a::new);

      @Override
      public void a(hhj.a $$0) {
      }

      @Override
      public hbk a(hbk.a $$0) {
         return hbj.a;
      }

      @Override
      public MapCodec<hbj.a> a() {
         return a;
      }
   }
}
