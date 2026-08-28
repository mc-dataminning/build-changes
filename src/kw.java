import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record kw(Optional<bf<dbm, kv.a>> c, cv.d d) implements dk<dbn> {
   public static final Codec<kw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(bf.a(kv.a.a).optionalFieldOf("explosions").forGetter(kw::b), cv.d.d.optionalFieldOf("flight_duration", cv.d.c).forGetter(kw::c))
            .apply($$0, kw::new)
   );

   @Override
   public ki<dbn> a() {
      return kj.aj;
   }

   public boolean a(dbn $$0) {
      return this.c.isPresent() && !this.c.get().a($$0.b()) ? false : this.d.d($$0.a());
   }

   public Optional<bf<dbm, kv.a>> b() {
      return this.c;
   }

   public cv.d c() {
      return this.d;
   }
}
