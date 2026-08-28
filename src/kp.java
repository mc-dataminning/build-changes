import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record kp(Optional<bg<czk, cm>> c) implements dl<dbn> {
   public static final Codec<kp> a = RecordCodecBuilder.create($$0 -> $$0.group(bg.a(cm.a).optionalFieldOf("items").forGetter(kp::b)).apply($$0, kp::new));

   @Override
   public kj<dbn> a() {
      return kk.Q;
   }

   public boolean a(dbn $$0) {
      return !this.c.isPresent() || this.c.get().a($$0.c());
   }

   public Optional<bg<czk, cm>> b() {
      return this.c;
   }
}
