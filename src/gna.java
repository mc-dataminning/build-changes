import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import org.slf4j.Logger;

public class gna implements gms {
   private static final Logger c = LogUtils.getLogger();
   public static final Codec<gna> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(akf.a.fieldOf("resource").forGetter($$0x -> $$0x.d), akf.a.optionalFieldOf("sprite").forGetter($$0x -> $$0x.e)).apply($$0, gna::new)
   );
   private final akf d;
   private final Optional<akf> e;

   public gna(akf $$0, Optional<akf> $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public void a(ato $$0, gms.a $$1) {
      akf $$2 = a.a(this.d);
      Optional<atm> $$3 = $$0.getResource($$2);
      if ($$3.isPresent()) {
         $$1.a(this.e.orElse(this.d), $$3.get());
      } else {
         c.warn("Missing sprite: {}", $$2);
      }
   }

   @Override
   public gmu a() {
      return gmv.a;
   }
}
