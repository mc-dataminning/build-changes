import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hih() implements hif {
   public static final MapCodec<hih> a = MapCodec.unit(new hih());

   @Override
   public boolean get(daa $$0, @Nullable gmd $$1, @Nullable bxw $$2, int $$3, czy $$4) {
      return $$0.n();
   }

   @Override
   public MapCodec<hih> a() {
      return a;
   }
}
