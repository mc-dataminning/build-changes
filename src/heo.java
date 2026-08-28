import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class heo implements hep {
   public static final hep a = new heo();

   @Override
   public void a(hes $$0, cys $$1, heq $$2, cyq $$3, @Nullable gjd $$4, @Nullable bwz $$5, int $$6) {
   }

   public static record a() implements hep.b {
      public static final MapCodec<heo.a> a = MapCodec.unit(heo.a::new);

      @Override
      public void a(hkr.a $$0) {
      }

      @Override
      public hep a(hep.a $$0) {
         return heo.a;
      }

      @Override
      public MapCodec<heo.a> a() {
         return a;
      }
   }
}
