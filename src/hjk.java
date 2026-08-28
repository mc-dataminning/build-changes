import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record hjk(int c, Optional<Integer> d) {
   public static final Codec<hjk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ays.l.fieldOf("index").forGetter(hjk::a), ays.m.optionalFieldOf("time").forGetter(hjk::b)).apply($$0, hjk::new)
   );
   public static final Codec<hjk> b = Codec.either(ays.l, a)
      .xmap($$0 -> (hjk)$$0.map(hjk::new, $$0x -> $$0x), $$0 -> $$0.d.isPresent() ? Either.right($$0) : Either.left($$0.c));

   public hjk(int $$0) {
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
