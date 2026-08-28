import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record hgf(int c, Optional<Integer> d) {
   public static final Codec<hgf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ayi.l.fieldOf("index").forGetter(hgf::a), ayi.m.optionalFieldOf("time").forGetter(hgf::b)).apply($$0, hgf::new)
   );
   public static final Codec<hgf> b = Codec.either(ayi.l, a)
      .xmap($$0 -> (hgf)$$0.map(hgf::new, $$0x -> $$0x), $$0 -> $$0.d.isPresent() ? Either.right($$0) : Either.left($$0.c));

   public hgf(int $$0) {
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
