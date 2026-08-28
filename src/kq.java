import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record kq(Optional<bg<dak, cn>> e) implements dm<dcn> {
   public static final Codec<kq> a = RecordCodecBuilder.create($$0 -> $$0.group(bg.a(cn.a).optionalFieldOf("items").forGetter(kq::b)).apply($$0, kq::new));

   @Override
   public kk<dcn> a() {
      return kl.Q;
   }

   public boolean a(dcn $$0) {
      return !this.e.isPresent() || this.e.get().a($$0.c());
   }

   public Optional<bg<dak, cn>> b() {
      return this.e;
   }
}
