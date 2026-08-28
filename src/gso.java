import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Predicate;

public record gso(Optional<gsl> b, gsd c) {
   public static final Codec<gso> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(gsl.a.optionalFieldOf("when").forGetter(gso::a), gsd.a.fieldOf("apply").forGetter(gso::b)).apply($$0, gso::new)
   );

   public <O, S extends eaq<O, S>> Predicate<S> a(eap<O, S> $$0) {
      return this.b.<Predicate<S>>map($$1 -> $$1.instantiate($$0)).orElse($$0x -> true);
   }

   public Optional<gsl> a() {
      return this.b;
   }

   public gsd b() {
      return this.c;
   }
}
