import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class hfe implements hff {
   public static final hff a = new hfe();

   @Override
   public void a(hfi $$0, cyy $$1, hfg $$2, cyw $$3, @Nullable gjr $$4, @Nullable bxc $$5, int $$6) {
   }

   public static record a() implements hff.b {
      public static final MapCodec<hfe.a> a = MapCodec.unit(hfe.a::new);

      @Override
      public void a(hlh.a $$0) {
      }

      @Override
      public hff a(hff.a $$0) {
         return hfe.a;
      }

      @Override
      public MapCodec<hfe.a> a() {
         return a;
      }
   }
}
