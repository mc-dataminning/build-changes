import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hei() implements hes {
   public static final MapCodec<hei> a = MapCodec.unit(new hei());

   @Override
   public float a(cxy $$0, @Nullable ghz $$1, @Nullable bwr $$2, int $$3) {
      return cwm.c($$0);
   }

   @Override
   public MapCodec<hei> a() {
      return a;
   }
}
