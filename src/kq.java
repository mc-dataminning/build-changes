import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record kq(Optional<bg<czk, cm>> c) implements dl<dcc> {
   public static final Codec<kq> a = RecordCodecBuilder.create($$0 -> $$0.group(bg.a(cm.a).optionalFieldOf("items").forGetter(kq::b)).apply($$0, kq::new));

   @Override
   public kj<dcc> a() {
      return kk.ap;
   }

   public boolean a(dcc $$0) {
      return !this.c.isPresent() || this.c.get().a($$0.d());
   }

   public Optional<bg<czk, cm>> b() {
      return this.c;
   }
}
