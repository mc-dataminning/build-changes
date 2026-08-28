import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record hlc(int c, Optional<Integer> d) {
   public static final Codec<hlc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ayu.l.fieldOf("index").forGetter(hlc::a), ayu.m.optionalFieldOf("time").forGetter(hlc::b)).apply($$0, hlc::new)
   );
   public static final Codec<hlc> b = Codec.either(ayu.l, a)
      .xmap($$0 -> (hlc)$$0.map(hlc::new, $$0x -> $$0x), $$0 -> $$0.d.isPresent() ? Either.right($$0) : Either.left($$0.c));

   public hlc(int $$0) {
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
