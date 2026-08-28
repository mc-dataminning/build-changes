import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record kr(Optional<bg<dak, cn>> e) implements dm<ddc> {
   public static final Codec<kr> a = RecordCodecBuilder.create($$0 -> $$0.group(bg.a(cn.a).optionalFieldOf("items").forGetter(kr::b)).apply($$0, kr::new));

   @Override
   public kk<ddc> a() {
      return kl.ap;
   }

   public boolean a(ddc $$0) {
      return !this.e.isPresent() || this.e.get().a($$0.d());
   }

   public Optional<bg<dak, cn>> b() {
      return this.e;
   }
}
