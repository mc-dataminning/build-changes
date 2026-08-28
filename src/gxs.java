import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import org.slf4j.Logger;

public class gxs implements gxk {
   private static final Logger c = LogUtils.getLogger();
   public static final MapCodec<gxs> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ale.a.fieldOf("resource").forGetter($$0x -> $$0x.d), ale.a.optionalFieldOf("sprite").forGetter($$0x -> $$0x.e)).apply($$0, gxs::new)
   );
   private final ale d;
   private final Optional<ale> e;

   public gxs(ale $$0, Optional<ale> $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public void a(auv $$0, gxk.a $$1) {
      ale $$2 = a.a(this.d);
      Optional<aut> $$3 = $$0.getResource($$2);
      if ($$3.isPresent()) {
         $$1.a(this.e.orElse(this.d), $$3.get());
      } else {
         c.warn("Missing sprite: {}", $$2);
      }
   }

   @Override
   public gxm a() {
      return gxn.a;
   }
}
