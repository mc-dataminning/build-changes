import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hep(boolean b) implements hes {
   public static final MapCodec<hep> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("normalize", true).forGetter(hep::b)).apply($$0, hep::new)
   );

   @Override
   public float a(cxy $$0, @Nullable ghz $$1, @Nullable bwr $$2, int $$3) {
      float $$4 = (float)$$0.o();
      float $$5 = (float)$$0.p();
      return this.b ? azk.a($$4 / $$5, 0.0F, 1.0F) : azk.a($$4, 0.0F, $$5);
   }

   @Override
   public MapCodec<hep> a() {
      return a;
   }
}
