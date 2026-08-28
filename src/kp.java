import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record kp(Optional<bf<czd, cl>> c) implements dk<dbv> {
   public static final Codec<kp> a = RecordCodecBuilder.create($$0 -> $$0.group(bf.a(cl.a).optionalFieldOf("items").forGetter(kp::b)).apply($$0, kp::new));

   @Override
   public ki<dbv> a() {
      return kj.ap;
   }

   public boolean a(dbv $$0) {
      return !this.c.isPresent() || this.c.get().a($$0.d());
   }

   public Optional<bf<czd, cl>> b() {
      return this.c;
   }
}
