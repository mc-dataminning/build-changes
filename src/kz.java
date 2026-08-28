import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record kz(Optional<ji<dhl>> c, Optional<ji<dhn>> d) implements dk<dhj> {
   public static final Codec<kz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(jt.a(mg.bj).optionalFieldOf("material").forGetter(kz::b), jt.a(mg.bk).optionalFieldOf("pattern").forGetter(kz::c)).apply($$0, kz::new)
   );

   @Override
   public ki<dhj> a() {
      return kj.W;
   }

   public boolean a(dhj $$0) {
      return this.c.isPresent() && !this.c.get().a($$0.a()) ? false : !this.d.isPresent() || this.d.get().a($$0.b());
   }

   public Optional<ji<dhl>> b() {
      return this.c;
   }

   public Optional<ji<dhn>> c() {
      return this.d;
   }
}
