import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hfe() implements hfc {
   public static final MapCodec<hfe> a = MapCodec.unit(new hfe());

   @Override
   public boolean get(cys $$0, @Nullable gjd $$1, @Nullable bwz $$2, int $$3, cyq $$4) {
      return $$0.n();
   }

   @Override
   public MapCodec<hfe> a() {
      return a;
   }
}
