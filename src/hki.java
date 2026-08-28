import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record hki(int c, Optional<Integer> d) {
   public static final Codec<hki> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ayu.l.fieldOf("index").forGetter(hki::a), ayu.m.optionalFieldOf("time").forGetter(hki::b)).apply($$0, hki::new)
   );
   public static final Codec<hki> b = Codec.either(ayu.l, a)
      .xmap($$0 -> (hki)$$0.map(hki::new, $$0x -> $$0x), $$0 -> $$0.d.isPresent() ? Either.right($$0) : Either.left($$0.c));

   public hki(int $$0) {
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
