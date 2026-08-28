import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import org.slf4j.Logger;

public class gqr implements gqj {
   private static final Logger c = LogUtils.getLogger();
   public static final MapCodec<gqr> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(akq.a.fieldOf("resource").forGetter($$0x -> $$0x.d), akq.a.optionalFieldOf("sprite").forGetter($$0x -> $$0x.e)).apply($$0, gqr::new)
   );
   private final akq d;
   private final Optional<akq> e;

   public gqr(akq $$0, Optional<akq> $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public void a(aud $$0, gqj.a $$1) {
      akq $$2 = a.a(this.d);
      Optional<aub> $$3 = $$0.getResource($$2);
      if ($$3.isPresent()) {
         $$1.a(this.e.orElse(this.d), $$3.get());
      } else {
         c.warn("Missing sprite: {}", $$2);
      }
   }

   @Override
   public gql a() {
      return gqm.a;
   }
}
