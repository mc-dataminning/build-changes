import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record hmo(int c, Optional<Integer> d) {
   public static final Codec<hmo> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ayy.l.fieldOf("index").forGetter(hmo::a), ayy.m.optionalFieldOf("time").forGetter(hmo::b)).apply($$0, hmo::new)
   );
   public static final Codec<hmo> b = Codec.either(ayy.l, a)
      .xmap($$0 -> (hmo)$$0.map(hmo::new, $$0x -> $$0x), $$0 -> $$0.d.isPresent() ? Either.right($$0) : Either.left($$0.c));

   public hmo(int $$0) {
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
