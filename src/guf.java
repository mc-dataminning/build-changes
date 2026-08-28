import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Predicate;

public record guf(Optional<guc> b, gtp.b c) {
   public static final Codec<guf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(guc.a.optionalFieldOf("when").forGetter(guf::a), gtp.b.c.fieldOf("apply").forGetter(guf::b)).apply($$0, guf::new)
   );

   public <O, S extends ebi<O, S>> Predicate<S> a(ebh<O, S> $$0) {
      return this.b.<Predicate<S>>map($$1 -> $$1.instantiate($$0)).orElse($$0x -> true);
   }

   public Optional<guc> a() {
      return this.b;
   }

   public gtp.b b() {
      return this.c;
   }
}
