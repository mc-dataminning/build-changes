import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import org.slf4j.Logger;

public class fvg implements fuz {
   private static final Logger c = LogUtils.getLogger();
   public static final Codec<fvg> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(acq.a.fieldOf("resource").forGetter($$0x -> $$0x.d), acq.a.optionalFieldOf("sprite").forGetter($$0x -> $$0x.e)).apply($$0, fvg::new)
   );
   private final acq d;
   private final Optional<acq> e;

   public fvg(acq $$0, Optional<acq> $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public void a(akx $$0, fuz.a $$1) {
      acq $$2 = a.a(this.d);
      Optional<akv> $$3 = $$0.getResource($$2);
      if ($$3.isPresent()) {
         $$1.a(this.e.orElse(this.d), $$3.get());
      } else {
         c.warn("Missing sprite: {}", $$2);
      }
   }

   @Override
   public fva a() {
      return fvb.a;
   }
}
