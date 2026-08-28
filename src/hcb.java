import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hcb(ku<?> b, boolean c) implements hbw {
   public static final MapCodec<hcb> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(mb.ao.q().fieldOf("component").forGetter(hcb::b), Codec.BOOL.optionalFieldOf("ignore_default", false).forGetter(hcb::c))
            .apply($$0, hcb::new)
   );

   @Override
   public boolean a(cwo $$0, @Nullable gfy $$1, @Nullable bvg $$2, int $$3, cwm $$4) {
      return this.c ? $$0.c(this.b) : $$0.b(this.b);
   }

   @Override
   public MapCodec<hcb> a() {
      return a;
   }
}
