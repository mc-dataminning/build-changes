import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hdi() implements hds {
   public static final MapCodec<hdi> a = MapCodec.unit(new hdi());

   @Override
   public float a(cxh $$0, @Nullable ggy $$1, @Nullable bvy $$2, int $$3) {
      return cvv.c($$0);
   }

   @Override
   public MapCodec<hdi> a() {
      return a;
   }
}
