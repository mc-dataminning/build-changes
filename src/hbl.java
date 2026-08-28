import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class hbl implements hbm {
   public static final hbm a = new hbl();

   @Override
   public void a(hbp $$0, cwq $$1, hbn $$2, cwo $$3, @Nullable gga $$4, @Nullable bvi $$5, int $$6) {
   }

   public static record a() implements hbm.b {
      public static final MapCodec<hbl.a> a = MapCodec.unit(hbl.a::new);

      @Override
      public void a(hhl.a $$0) {
      }

      @Override
      public hbm a(hbm.a $$0) {
         return hbl.a;
      }

      @Override
      public MapCodec<hbl.a> a() {
         return a;
      }
   }
}
