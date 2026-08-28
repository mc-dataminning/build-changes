import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hfl() implements hfc {
   public static final MapCodec<hfl> a = MapCodec.unit(new hfl());

   @Override
   public boolean get(cys $$0, @Nullable gjd $$1, @Nullable bwz $$2, int $$3, cyq $$4) {
      return $$2 == null ? false : $$2.fy() && $$2.fA() == $$0;
   }

   @Override
   public MapCodec<hfl> a() {
      return a;
   }
}
