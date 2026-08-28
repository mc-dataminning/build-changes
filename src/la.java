import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record la(Optional<jj<dhx>> c, Optional<jj<dhz>> d) implements dl<dhv> {
   public static final Codec<la> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ju.a(mh.bk).optionalFieldOf("material").forGetter(la::b), ju.a(mh.bl).optionalFieldOf("pattern").forGetter(la::c)).apply($$0, la::new)
   );

   @Override
   public kj<dhv> a() {
      return kk.W;
   }

   public boolean a(dhv $$0) {
      return this.c.isPresent() && !this.c.get().a($$0.a()) ? false : !this.d.isPresent() || this.d.get().a($$0.b());
   }

   public Optional<jj<dhx>> b() {
      return this.c;
   }

   public Optional<jj<dhz>> c() {
      return this.d;
   }
}
