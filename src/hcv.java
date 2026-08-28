import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hcv(boolean b) implements hcs {
   public static final MapCodec<hcv> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("remaining", false).forGetter(hcv::b)).apply($$0, hcv::new)
   );

   @Override
   public float a(cwo $$0, @Nullable gfy $$1, @Nullable bvg $$2, int $$3) {
      if ($$2 != null && $$2.fB() == $$0) {
         return this.b ? (float)$$2.fC() : (float)a($$0, $$2);
      } else {
         return 0.0F;
      }
   }

   @Override
   public MapCodec<hcv> a() {
      return a;
   }

   public static int a(cwo $$0, bvg $$1) {
      return $$0.a($$1) - $$1.fC();
   }
}
