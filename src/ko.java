import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record ko(Optional<bf<cyy, cl>> c) implements dk<dbb> {
   public static final Codec<ko> a = RecordCodecBuilder.create($$0 -> $$0.group(bf.a(cl.a).optionalFieldOf("items").forGetter(ko::b)).apply($$0, ko::new));

   @Override
   public ki<dbb> a() {
      return kj.Q;
   }

   public boolean a(dbb $$0) {
      return !this.c.isPresent() || this.c.get().a($$0.c());
   }

   public Optional<bf<cyy, cl>> b() {
      return this.c;
   }
}
