import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record hfy(int c, Optional<Integer> d) {
   public static final Codec<hfy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ayh.l.fieldOf("index").forGetter(hfy::a), ayh.m.optionalFieldOf("time").forGetter(hfy::b)).apply($$0, hfy::new)
   );
   public static final Codec<hfy> b = Codec.either(ayh.l, a)
      .xmap($$0 -> (hfy)$$0.map(hfy::new, $$0x -> $$0x), $$0 -> $$0.d.isPresent() ? Either.right($$0) : Either.left($$0.c));

   public hfy(int $$0) {
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
