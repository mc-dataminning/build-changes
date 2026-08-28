import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import org.slf4j.Logger;

public class gzq implements gzi {
   private static final Logger c = LogUtils.getLogger();
   public static final MapCodec<gzq> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alj.a.fieldOf("resource").forGetter($$0x -> $$0x.d), alj.a.optionalFieldOf("sprite").forGetter($$0x -> $$0x.e)).apply($$0, gzq::new)
   );
   private final alj d;
   private final Optional<alj> e;

   public gzq(alj $$0, Optional<alj> $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public void a(avd $$0, gzi.a $$1) {
      alj $$2 = a.a(this.d);
      Optional<avb> $$3 = $$0.getResource($$2);
      if ($$3.isPresent()) {
         $$1.a(this.e.orElse(this.d), $$3.get());
      } else {
         c.warn("Missing sprite: {}", $$2);
      }
   }

   @Override
   public gzk a() {
      return gzl.a;
   }
}
