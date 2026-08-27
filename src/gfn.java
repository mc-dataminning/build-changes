import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import org.slf4j.Logger;

public class gfn implements gff {
   private static final Logger c = LogUtils.getLogger();
   public static final Codec<gfn> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(ahh.a.fieldOf("resource").forGetter($$0x -> $$0x.d), ahh.a.optionalFieldOf("sprite").forGetter($$0x -> $$0x.e)).apply($$0, gfn::new)
   );
   private final ahh d;
   private final Optional<ahh> e;

   public gfn(ahh $$0, Optional<ahh> $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public void a(aqj $$0, gff.a $$1) {
      ahh $$2 = a.a(this.d);
      Optional<aqh> $$3 = $$0.getResource($$2);
      if ($$3.isPresent()) {
         $$1.a(this.e.orElse(this.d), $$3.get());
      } else {
         c.warn("Missing sprite: {}", $$2);
      }
   }

   @Override
   public gfh a() {
      return gfi.a;
   }
}
