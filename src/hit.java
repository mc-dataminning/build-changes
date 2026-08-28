import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hit(boolean b) implements hiq {
   public static final MapCodec<hit> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("remaining", false).forGetter(hit::b)).apply($$0, hit::new)
   );

   @Override
   public float a(dak $$0, @Nullable glo $$1, @Nullable byf $$2, int $$3) {
      if ($$2 != null && $$2.fB() == $$0) {
         return this.b ? (float)$$2.fC() : (float)a($$0, $$2);
      } else {
         return 0.0F;
      }
   }

   @Override
   public MapCodec<hit> a() {
      return a;
   }

   public static int a(dak $$0, byf $$1) {
      return $$0.a($$1) - $$1.fC();
   }
}
