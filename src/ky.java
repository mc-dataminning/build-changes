import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record ky(Optional<bg<dcy, kx.a>> e, cx.d f) implements dm<dcz> {
   public static final Codec<ky> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(bg.a(kx.a.a).optionalFieldOf("explosions").forGetter(ky::b), cx.d.d.optionalFieldOf("flight_duration", cx.d.c).forGetter(ky::c))
            .apply($$0, ky::new)
   );

   @Override
   public kk<dcz> a() {
      return kl.aj;
   }

   public boolean a(dcz $$0) {
      return this.e.isPresent() && !this.e.get().a($$0.b()) ? false : this.f.d($$0.a());
   }

   public Optional<bg<dcy, kx.a>> b() {
      return this.e;
   }

   public cx.d c() {
      return this.f;
   }
}
