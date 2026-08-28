import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import org.slf4j.Logger;

public class gpl implements gpd {
   private static final Logger c = LogUtils.getLogger();
   public static final MapCodec<gpl> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alf.a.fieldOf("resource").forGetter($$0x -> $$0x.d), alf.a.optionalFieldOf("sprite").forGetter($$0x -> $$0x.e)).apply($$0, gpl::new)
   );
   private final alf d;
   private final Optional<alf> e;

   public gpl(alf $$0, Optional<alf> $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public void a(aup $$0, gpd.a $$1) {
      alf $$2 = a.a(this.d);
      Optional<aun> $$3 = $$0.getResource($$2);
      if ($$3.isPresent()) {
         $$1.a(this.e.orElse(this.d), $$3.get());
      } else {
         c.warn("Missing sprite: {}", $$2);
      }
   }

   @Override
   public gpf a() {
      return gpg.a;
   }
}
