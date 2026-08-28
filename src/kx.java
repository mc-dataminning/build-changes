import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record kx(Optional<bg<dcb, kw.a>> c, cw.d d) implements dl<dcc> {
   public static final Codec<kx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(bg.a(kw.a.a).optionalFieldOf("explosions").forGetter(kx::b), cw.d.d.optionalFieldOf("flight_duration", cw.d.c).forGetter(kx::c))
            .apply($$0, kx::new)
   );

   @Override
   public kj<dcc> a() {
      return kk.aj;
   }

   public boolean a(dcc $$0) {
      return this.c.isPresent() && !this.c.get().a($$0.b()) ? false : this.d.d($$0.a());
   }

   public Optional<bg<dcb, kw.a>> b() {
      return this.c;
   }

   public cw.d c() {
      return this.d;
   }
}
