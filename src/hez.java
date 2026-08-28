import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hez() implements hfc {
   public static final MapCodec<hez> a = MapCodec.unit(new hez());

   @Override
   public boolean get(cys $$0, @Nullable gjd $$1, @Nullable bwz $$2, int $$3, cyq $$4) {
      return cxh.g($$0);
   }

   @Override
   public MapCodec<hez> a() {
      return a;
   }
}
