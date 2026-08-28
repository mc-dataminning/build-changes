import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import org.slf4j.Logger;

public class gxn implements gxf {
   private static final Logger c = LogUtils.getLogger();
   public static final MapCodec<gxn> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alc.a.fieldOf("resource").forGetter($$0x -> $$0x.d), alc.a.optionalFieldOf("sprite").forGetter($$0x -> $$0x.e)).apply($$0, gxn::new)
   );
   private final alc d;
   private final Optional<alc> e;

   public gxn(alc $$0, Optional<alc> $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public void a(aut $$0, gxf.a $$1) {
      alc $$2 = a.a(this.d);
      Optional<aur> $$3 = $$0.getResource($$2);
      if ($$3.isPresent()) {
         $$1.a(this.e.orElse(this.d), $$3.get());
      } else {
         c.warn("Missing sprite: {}", $$2);
      }
   }

   @Override
   public gxh a() {
      return gxi.a;
   }
}
