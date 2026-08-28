import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hik(boolean b) implements hiq {
   public static final MapCodec<hik> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("normalize", true).forGetter(hik::b)).apply($$0, hik::new)
   );

   @Override
   public float a(dak $$0, @Nullable glo $$1, @Nullable byf $$2, int $$3) {
      float $$4 = (float)$$0.M();
      float $$5 = (float)$$0.k();
      return this.b ? azz.a($$4 / $$5, 0.0F, 1.0F) : azz.a($$4, 0.0F, $$5);
   }

   @Override
   public MapCodec<hik> a() {
      return a;
   }
}
