import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hig() implements hiq {
   public static final MapCodec<hig> a = MapCodec.unit(new hig());

   @Override
   public float a(dak $$0, @Nullable glo $$1, @Nullable byf $$2, int $$3) {
      return cyz.c($$0);
   }

   @Override
   public MapCodec<hig> a() {
      return a;
   }
}
