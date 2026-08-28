import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record ko(Optional<bf<cys, cl>> c) implements dk<dav> {
   public static final Codec<ko> a = RecordCodecBuilder.create($$0 -> $$0.group(bf.a(cl.a).optionalFieldOf("items").forGetter(ko::b)).apply($$0, ko::new));

   @Override
   public ki<dav> a() {
      return kj.Q;
   }

   public boolean a(dav $$0) {
      return !this.c.isPresent() || this.c.get().a($$0.c());
   }

   public Optional<bf<cys, cl>> b() {
      return this.c;
   }
}
