import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hby(ku<?> b, boolean c) implements hbt {
   public static final MapCodec<hby> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(mb.ao.q().fieldOf("component").forGetter(hby::b), Codec.BOOL.optionalFieldOf("ignore_default", false).forGetter(hby::c))
            .apply($$0, hby::new)
   );

   @Override
   public boolean a(cwn $$0, @Nullable gfw $$1, @Nullable bvf $$2, int $$3, cwl $$4) {
      return this.c ? $$0.c(this.b) : $$0.b(this.b);
   }

   @Override
   public MapCodec<hby> a() {
      return a;
   }
}
