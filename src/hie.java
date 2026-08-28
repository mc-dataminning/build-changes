import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record hie(int c, Optional<Integer> d) {
   public static final Codec<hie> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ays.l.fieldOf("index").forGetter(hie::a), ays.m.optionalFieldOf("time").forGetter(hie::b)).apply($$0, hie::new)
   );
   public static final Codec<hie> b = Codec.either(ays.l, a)
      .xmap($$0 -> (hie)$$0.map(hie::new, $$0x -> $$0x), $$0 -> $$0.d.isPresent() ? Either.right($$0) : Either.left($$0.c));

   public hie(int $$0) {
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
