import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hft(boolean b) implements hfz {
   public static final MapCodec<hft> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("normalize", true).forGetter(hft::b)).apply($$0, hft::new)
   );

   @Override
   public float a(cys $$0, @Nullable gjd $$1, @Nullable bwz $$2, int $$3) {
      float $$4 = (float)$$0.M();
      float $$5 = (float)$$0.k();
      return this.b ? azk.a($$4 / $$5, 0.0F, 1.0F) : azk.a($$4, 0.0F, $$5);
   }

   @Override
   public MapCodec<hft> a() {
      return a;
   }
}
