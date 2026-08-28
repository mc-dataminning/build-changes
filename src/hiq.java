import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hiq() implements hja {
   public static final MapCodec<hiq> a = MapCodec.unit(new hiq());

   @Override
   public float a(czy $$0, @Nullable gmb $$1, @Nullable bxu $$2, int $$3) {
      return cyn.c($$0);
   }

   @Override
   public MapCodec<hiq> a() {
      return a;
   }
}
