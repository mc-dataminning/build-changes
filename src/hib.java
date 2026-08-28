import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record hib(kt.a<?> b) implements hid {
   public static final MapCodec<hib> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(kt.a("predicate").forGetter(hib::b)).apply($$0, hib::new));

   @Override
   public boolean get(czy $$0, @Nullable gmb $$1, @Nullable bxu $$2, int $$3, czw $$4) {
      return this.b.b().a($$0);
   }

   @Override
   public MapCodec<hib> a() {
      return a;
   }
}
