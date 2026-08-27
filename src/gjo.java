import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import org.slf4j.Logger;

public class gjo implements gjg {
   private static final Logger c = LogUtils.getLogger();
   public static final Codec<gjo> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(ajh.a.fieldOf("resource").forGetter($$0x -> $$0x.d), ajh.a.optionalFieldOf("sprite").forGetter($$0x -> $$0x.e)).apply($$0, gjo::new)
   );
   private final ajh d;
   private final Optional<ajh> e;

   public gjo(ajh $$0, Optional<ajh> $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public void a(aso $$0, gjg.a $$1) {
      ajh $$2 = a.a(this.d);
      Optional<asm> $$3 = $$0.getResource($$2);
      if ($$3.isPresent()) {
         $$1.a(this.e.orElse(this.d), $$3.get());
      } else {
         c.warn("Missing sprite: {}", $$2);
      }
   }

   @Override
   public gji a() {
      return gjj.a;
   }
}
