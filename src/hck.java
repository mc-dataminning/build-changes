import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hck() implements hcu {
   public static final MapCodec<hck> a = MapCodec.unit(new hck());

   @Override
   public float a(cwq $$0, @Nullable gga $$1, @Nullable bvi $$2, int $$3) {
      return cvd.c($$0);
   }

   @Override
   public MapCodec<hck> a() {
      return a;
   }
}
