import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Predicate;

public record gst(Optional<gsq> b, gsi c) {
   public static final Codec<gst> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(gsq.a.optionalFieldOf("when").forGetter(gst::a), gsi.a.fieldOf("apply").forGetter(gst::b)).apply($$0, gst::new)
   );

   public <O, S extends eav<O, S>> Predicate<S> a(eau<O, S> $$0) {
      return this.b.<Predicate<S>>map($$1 -> $$1.instantiate($$0)).orElse($$0x -> true);
   }

   public Optional<gsq> a() {
      return this.b;
   }

   public gsi b() {
      return this.c;
   }
}
