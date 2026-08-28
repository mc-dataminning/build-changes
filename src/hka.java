import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record hka(int c, Optional<Integer> d) {
   public static final Codec<hka> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ayu.l.fieldOf("index").forGetter(hka::a), ayu.m.optionalFieldOf("time").forGetter(hka::b)).apply($$0, hka::new)
   );
   public static final Codec<hka> b = Codec.either(ayu.l, a)
      .xmap($$0 -> (hka)$$0.map(hka::new, $$0x -> $$0x), $$0 -> $$0.d.isPresent() ? Either.right($$0) : Either.left($$0.c));

   public hka(int $$0) {
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
