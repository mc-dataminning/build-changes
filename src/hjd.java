import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hjd(boolean b) implements hja {
   public static final MapCodec<hjd> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("remaining", false).forGetter(hjd::b)).apply($$0, hjd::new)
   );

   @Override
   public float a(czy $$0, @Nullable gmb $$1, @Nullable bxu $$2, int $$3) {
      if ($$2 != null && $$2.fB() == $$0) {
         return this.b ? (float)$$2.fC() : (float)a($$0, $$2);
      } else {
         return 0.0F;
      }
   }

   @Override
   public MapCodec<hjd> a() {
      return a;
   }

   public static int a(czy $$0, bxu $$1) {
      return $$0.a($$1) - $$1.fC();
   }
}
