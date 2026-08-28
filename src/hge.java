import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import org.slf4j.Logger;

public class hge implements hfw {
   private static final Logger c = LogUtils.getLogger();
   public static final MapCodec<hge> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(aku.a.fieldOf("resource").forGetter($$0x -> $$0x.d), aku.a.optionalFieldOf("sprite").forGetter($$0x -> $$0x.e)).apply($$0, hge::new)
   );
   private final aku d;
   private final Optional<aku> e;

   public hge(aku $$0, Optional<aku> $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public void a(aup $$0, hfw.a $$1) {
      aku $$2 = a.a(this.d);
      Optional<aun> $$3 = $$0.getResource($$2);
      if ($$3.isPresent()) {
         $$1.a(this.e.orElse(this.d), $$3.get());
      } else {
         c.warn("Missing sprite: {}", $$2);
      }
   }

   @Override
   public hfy a() {
      return hfz.a;
   }
}
