import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hfy(ks.a<?> b) implements hga {
   public static final MapCodec<hfy> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ks.a("predicate").forGetter(hfy::b)).apply($$0, hfy::new));

   @Override
   public boolean get(czd $$0, @Nullable gjz $$1, @Nullable bxe $$2, int $$3, czb $$4) {
      return this.b.b().a($$0);
   }

   @Override
   public MapCodec<hfy> a() {
      return a;
   }
}
