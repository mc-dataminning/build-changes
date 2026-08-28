import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record hkv(int c, Optional<Integer> d) {
   public static final Codec<hkv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ayu.l.fieldOf("index").forGetter(hkv::a), ayu.m.optionalFieldOf("time").forGetter(hkv::b)).apply($$0, hkv::new)
   );
   public static final Codec<hkv> b = Codec.either(ayu.l, a)
      .xmap($$0 -> (hkv)$$0.map(hkv::new, $$0x -> $$0x), $$0 -> $$0.d.isPresent() ? Either.right($$0) : Either.left($$0.c));

   public hkv(int $$0) {
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
