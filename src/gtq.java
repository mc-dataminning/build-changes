import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Predicate;

public record gtq(Optional<gtn> b, gta.b c) {
   public static final Codec<gtq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(gtn.a.optionalFieldOf("when").forGetter(gtq::a), gta.b.c.fieldOf("apply").forGetter(gtq::b)).apply($$0, gtq::new)
   );

   public <O, S extends ebs<O, S>> Predicate<S> a(ebr<O, S> $$0) {
      return this.b.<Predicate<S>>map($$1 -> $$1.instantiate($$0)).orElse($$0x -> true);
   }

   public Optional<gtn> a() {
      return this.b;
   }

   public gta.b b() {
      return this.c;
   }
}
