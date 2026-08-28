import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hcj() implements hct {
   public static final MapCodec<hcj> a = MapCodec.unit(new hcj());

   @Override
   public float a(cwp $$0, @Nullable gfz $$1, @Nullable bvh $$2, int $$3) {
      return cvc.c($$0);
   }

   @Override
   public MapCodec<hcj> a() {
      return a;
   }
}
