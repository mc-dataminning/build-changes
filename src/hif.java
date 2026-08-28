import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hif() implements hid {
   public static final MapCodec<hif> a = MapCodec.unit(new hif());

   @Override
   public boolean get(czy $$0, @Nullable gmb $$1, @Nullable bxu $$2, int $$3, czw $$4) {
      return $$0.n();
   }

   @Override
   public MapCodec<hif> a() {
      return a;
   }
}
