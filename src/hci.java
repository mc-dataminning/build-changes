import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hci(boolean b) implements hco {
   public static final MapCodec<hci> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("normalize", true).forGetter(hci::b)).apply($$0, hci::new)
   );

   @Override
   public float a(cwn $$0, @Nullable gfw $$1, @Nullable bvf $$2, int $$3) {
      float $$4 = (float)$$0.M();
      float $$5 = (float)$$0.k();
      return this.b ? ayy.a($$4 / $$5, 0.0F, 1.0F) : ayy.a($$4, 0.0F, $$5);
   }

   @Override
   public MapCodec<hci> a() {
      return a;
   }
}
