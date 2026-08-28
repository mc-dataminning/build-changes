import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record kw(Optional<bf<dbg, kv.a>> c, cv.d d) implements dk<dbh> {
   public static final Codec<kw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(bf.a(kv.a.a).optionalFieldOf("explosions").forGetter(kw::b), cv.d.d.optionalFieldOf("flight_duration", cv.d.c).forGetter(kw::c))
            .apply($$0, kw::new)
   );

   @Override
   public ki<dbh> a() {
      return kj.aj;
   }

   public boolean a(dbh $$0) {
      return this.c.isPresent() && !this.c.get().a($$0.b()) ? false : this.d.d($$0.a());
   }

   public Optional<bf<dbg, kv.a>> b() {
      return this.c;
   }

   public cv.d c() {
      return this.d;
   }
}
