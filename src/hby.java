import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hby(ku<?> b) implements hbu {
   public static final MapCodec<hby> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(mb.ao.q().fieldOf("component").forGetter(hby::b)).apply($$0, hby::new));

   @Override
   public boolean a(cwp $$0, @Nullable gfy $$1, @Nullable bvg $$2, int $$3) {
      return $$0.b(this.b);
   }

   @Override
   public MapCodec<hby> a() {
      return a;
   }
}
