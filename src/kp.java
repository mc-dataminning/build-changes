import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record kp(Optional<bf<cys, cl>> c) implements dk<dbk> {
   public static final Codec<kp> a = RecordCodecBuilder.create($$0 -> $$0.group(bf.a(cl.a).optionalFieldOf("items").forGetter(kp::b)).apply($$0, kp::new));

   @Override
   public ki<dbk> a() {
      return kj.ap;
   }

   public boolean a(dbk $$0) {
      return !this.c.isPresent() || this.c.get().a($$0.d());
   }

   public Optional<bf<cys, cl>> b() {
      return this.c;
   }
}
