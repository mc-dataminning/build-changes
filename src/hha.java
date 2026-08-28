import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hha() implements hhk {
   public static final MapCodec<hha> a = MapCodec.unit(new hha());

   @Override
   public float a(czk $$0, @Nullable gkl $$1, @Nullable bxj $$2, int $$3) {
      return cxz.c($$0);
   }

   @Override
   public MapCodec<hha> a() {
      return a;
   }
}
