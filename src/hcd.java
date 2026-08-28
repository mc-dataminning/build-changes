import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hcd(ku<?> b, boolean c) implements hby {
   public static final MapCodec<hcd> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(mb.ao.q().fieldOf("component").forGetter(hcd::b), Codec.BOOL.optionalFieldOf("ignore_default", false).forGetter(hcd::c))
            .apply($$0, hcd::new)
   );

   @Override
   public boolean a(cwq $$0, @Nullable gga $$1, @Nullable bvi $$2, int $$3, cwo $$4) {
      return this.c ? $$0.c(this.b) : $$0.b(this.b);
   }

   @Override
   public MapCodec<hcd> a() {
      return a;
   }
}
