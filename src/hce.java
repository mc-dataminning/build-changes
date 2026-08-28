import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hce() implements hco {
   public static final MapCodec<hce> a = MapCodec.unit(new hce());

   @Override
   public float a(cwn $$0, @Nullable gfw $$1, @Nullable bvf $$2, int $$3) {
      return cva.c($$0);
   }

   @Override
   public MapCodec<hce> a() {
      return a;
   }
}
