import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Predicate;

public record gud(Optional<gua> b, gtn.b c) {
   public static final Codec<gud> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(gua.a.optionalFieldOf("when").forGetter(gud::a), gtn.b.c.fieldOf("apply").forGetter(gud::b)).apply($$0, gud::new)
   );

   public <O, S extends ebg<O, S>> Predicate<S> a(ebf<O, S> $$0) {
      return this.b.<Predicate<S>>map($$1 -> $$1.instantiate($$0)).orElse($$0x -> true);
   }

   public Optional<gua> a() {
      return this.b;
   }

   public gtn.b b() {
      return this.c;
   }
}
