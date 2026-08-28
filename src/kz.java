import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record kz(Optional<ji<dhf>> c, Optional<ji<dhh>> d) implements dk<dhd> {
   public static final Codec<kz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(jt.a(mg.bi).optionalFieldOf("material").forGetter(kz::b), jt.a(mg.bj).optionalFieldOf("pattern").forGetter(kz::c)).apply($$0, kz::new)
   );

   @Override
   public ki<dhd> a() {
      return kj.W;
   }

   public boolean a(dhd $$0) {
      return this.c.isPresent() && !this.c.get().a($$0.a()) ? false : !this.d.isPresent() || this.d.get().a($$0.b());
   }

   public Optional<ji<dhf>> b() {
      return this.c;
   }

   public Optional<ji<dhh>> c() {
      return this.d;
   }
}
