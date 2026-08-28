import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record hmm(int c, Optional<Integer> d) {
   public static final Codec<hmm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ayw.l.fieldOf("index").forGetter(hmm::a), ayw.m.optionalFieldOf("time").forGetter(hmm::b)).apply($$0, hmm::new)
   );
   public static final Codec<hmm> b = Codec.either(ayw.l, a)
      .xmap($$0 -> (hmm)$$0.map(hmm::new, $$0x -> $$0x), $$0 -> $$0.d.isPresent() ? Either.right($$0) : Either.left($$0.c));

   public hmm(int $$0) {
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
