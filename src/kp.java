import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record kp(Optional<bf<cyy, cl>> c) implements dk<dbq> {
   public static final Codec<kp> a = RecordCodecBuilder.create($$0 -> $$0.group(bf.a(cl.a).optionalFieldOf("items").forGetter(kp::b)).apply($$0, kp::new));

   @Override
   public ki<dbq> a() {
      return kj.ap;
   }

   public boolean a(dbq $$0) {
      return !this.c.isPresent() || this.c.get().a($$0.d());
   }

   public Optional<bf<cyy, cl>> b() {
      return this.c;
   }
}
