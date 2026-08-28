import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record kq(Optional<bg<daa, cn>> e) implements dm<dcd> {
   public static final Codec<kq> a = RecordCodecBuilder.create($$0 -> $$0.group(bg.a(cn.a).optionalFieldOf("items").forGetter(kq::b)).apply($$0, kq::new));

   @Override
   public kk<dcd> a() {
      return kl.Q;
   }

   public boolean a(dcd $$0) {
      return !this.e.isPresent() || this.e.get().a($$0.c());
   }

   public Optional<bg<daa, cn>> b() {
      return this.e;
   }
}
