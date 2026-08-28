import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hcf() implements hcp {
   public static final MapCodec<hcf> a = MapCodec.unit(new hcf());

   @Override
   public float a(cwp $$0, @Nullable gfy $$1, @Nullable bvg $$2, int $$3) {
      return cvc.c($$0);
   }

   @Override
   public MapCodec<hcf> a() {
      return a;
   }
}
