import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import org.slf4j.Logger;

public class gye implements gxw {
   private static final Logger c = LogUtils.getLogger();
   public static final MapCodec<gye> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alh.a.fieldOf("resource").forGetter($$0x -> $$0x.d), alh.a.optionalFieldOf("sprite").forGetter($$0x -> $$0x.e)).apply($$0, gye::new)
   );
   private final alh d;
   private final Optional<alh> e;

   public gye(alh $$0, Optional<alh> $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public void a(ava $$0, gxw.a $$1) {
      alh $$2 = a.a(this.d);
      Optional<auy> $$3 = $$0.getResource($$2);
      if ($$3.isPresent()) {
         $$1.a(this.e.orElse(this.d), $$3.get());
      } else {
         c.warn("Missing sprite: {}", $$2);
      }
   }

   @Override
   public gxy a() {
      return gxz.a;
   }
}
