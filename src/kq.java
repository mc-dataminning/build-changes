import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record kq(Optional<bg<czy, cm>> c) implements dl<dcq> {
   public static final Codec<kq> a = RecordCodecBuilder.create($$0 -> $$0.group(bg.a(cm.a).optionalFieldOf("items").forGetter(kq::b)).apply($$0, kq::new));

   @Override
   public kj<dcq> a() {
      return kk.ap;
   }

   public boolean a(dcq $$0) {
      return !this.c.isPresent() || this.c.get().a($$0.d());
   }

   public Optional<bg<czy, cm>> b() {
      return this.c;
   }
}
