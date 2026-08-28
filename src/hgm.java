import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hgm(boolean b) implements hgp {
   public static final MapCodec<hgm> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("normalize", true).forGetter(hgm::b)).apply($$0, hgm::new)
   );

   @Override
   public float a(cyy $$0, @Nullable gjr $$1, @Nullable bxc $$2, int $$3) {
      float $$4 = (float)$$0.o();
      float $$5 = (float)$$0.p();
      return this.b ? azm.a($$4 / $$5, 0.0F, 1.0F) : azm.a($$4, 0.0F, $$5);
   }

   @Override
   public MapCodec<hgm> a() {
      return a;
   }
}
