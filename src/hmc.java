import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record hmc(int c, Optional<Integer> d) {
   public static final Codec<hmc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(azg.l.fieldOf("index").forGetter(hmc::a), azg.m.optionalFieldOf("time").forGetter(hmc::b)).apply($$0, hmc::new)
   );
   public static final Codec<hmc> b = Codec.either(azg.l, a)
      .xmap($$0 -> (hmc)$$0.map(hmc::new, $$0x -> $$0x), $$0 -> $$0.d.isPresent() ? Either.right($$0) : Either.left($$0.c));

   public hmc(int $$0) {
      this($$0, Optional.empty());
   }

   public int a(int $$0) {
      return this.d.orElse($$0);
   }

   public int a() {
      return this.c;
   }

   public Optional<Integer> b() {
      return this.d;
   }
}
