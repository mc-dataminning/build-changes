import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record ko(Optional<bf<czd, cl>> c) implements dk<dbg> {
   public static final Codec<ko> a = RecordCodecBuilder.create($$0 -> $$0.group(bf.a(cl.a).optionalFieldOf("items").forGetter(ko::b)).apply($$0, ko::new));

   @Override
   public ki<dbg> a() {
      return kj.Q;
   }

   public boolean a(dbg $$0) {
      return !this.c.isPresent() || this.c.get().a($$0.c());
   }

   public Optional<bf<czd, cl>> b() {
      return this.c;
   }
}
