import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record kz(Optional<ji<dhq>> c, Optional<ji<dhs>> d) implements dk<dho> {
   public static final Codec<kz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(jt.a(mg.bk).optionalFieldOf("material").forGetter(kz::b), jt.a(mg.bl).optionalFieldOf("pattern").forGetter(kz::c)).apply($$0, kz::new)
   );

   @Override
   public ki<dho> a() {
      return kj.W;
   }

   public boolean a(dho $$0) {
      return this.c.isPresent() && !this.c.get().a($$0.a()) ? false : !this.d.isPresent() || this.d.get().a($$0.b());
   }

   public Optional<ji<dhq>> b() {
      return this.c;
   }

   public Optional<ji<dhs>> c() {
      return this.d;
   }
}
