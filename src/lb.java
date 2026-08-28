import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record lb(Optional<jk<dix>> e, Optional<jk<diz>> f) implements dm<div> {
   public static final Codec<lb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(jv.a(mi.bk).optionalFieldOf("material").forGetter(lb::b), jv.a(mi.bl).optionalFieldOf("pattern").forGetter(lb::c)).apply($$0, lb::new)
   );

   @Override
   public kk<div> a() {
      return kl.W;
   }

   public boolean a(div $$0) {
      return this.e.isPresent() && !this.e.get().a($$0.a()) ? false : !this.f.isPresent() || this.f.get().a($$0.b());
   }

   public Optional<jk<dix>> b() {
      return this.e;
   }

   public Optional<jk<diz>> c() {
      return this.f;
   }
}
