import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hey() implements hfc {
   public static final MapCodec<hey> a = MapCodec.unit(new hey());

   @Override
   public boolean get(cys $$0, @Nullable gjd $$1, @Nullable bwz $$2, int $$3, cyq $$4) {
      return $$0.r();
   }

   @Override
   public MapCodec<hey> a() {
      return a;
   }
}
