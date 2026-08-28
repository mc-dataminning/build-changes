import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record kq(Optional<bg<czn, cm>> c) implements dl<dcf> {
   public static final Codec<kq> a = RecordCodecBuilder.create($$0 -> $$0.group(bg.a(cm.a).optionalFieldOf("items").forGetter(kq::b)).apply($$0, kq::new));

   @Override
   public kj<dcf> a() {
      return kk.ap;
   }

   public boolean a(dcf $$0) {
      return !this.c.isPresent() || this.c.get().a($$0.d());
   }

   public Optional<bg<czn, cm>> b() {
      return this.c;
   }
}
