import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record la(Optional<jj<dil>> c, Optional<jj<din>> d) implements dl<dij> {
   public static final Codec<la> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ju.a(mh.bk).optionalFieldOf("material").forGetter(la::b), ju.a(mh.bl).optionalFieldOf("pattern").forGetter(la::c)).apply($$0, la::new)
   );

   @Override
   public kj<dij> a() {
      return kk.W;
   }

   public boolean a(dij $$0) {
      return this.c.isPresent() && !this.c.get().a($$0.a()) ? false : !this.d.isPresent() || this.d.get().a($$0.b());
   }

   public Optional<jj<dil>> b() {
      return this.c;
   }

   public Optional<jj<din>> c() {
      return this.d;
   }
}
