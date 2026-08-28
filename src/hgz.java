import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hgz(float b) implements hgx {
   public static final MapCodec<hgz> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ayu.o.optionalFieldOf("period", 1.0F).forGetter(hgz::b)).apply($$0, hgz::new)
   );

   @Override
   public float a(czd $$0, @Nullable gjz $$1, @Nullable bxe $$2, int $$3) {
      return $$2 != null && $$2.fB() == $$0 ? (float)$$2.fC() % this.b : 0.0F;
   }

   @Override
   public MapCodec<hgz> a() {
      return a;
   }
}
