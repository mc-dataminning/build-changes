import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hfa(ks.a<?> b) implements hfc {
   public static final MapCodec<hfa> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ks.a("predicate").forGetter(hfa::b)).apply($$0, hfa::new));

   @Override
   public boolean get(cys $$0, @Nullable gjd $$1, @Nullable bwz $$2, int $$3, cyq $$4) {
      return this.b.b().a($$0);
   }

   @Override
   public MapCodec<hfa> a() {
      return a;
   }
}
