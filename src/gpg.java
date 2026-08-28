import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import org.slf4j.Logger;

public class gpg implements goy {
   private static final Logger c = LogUtils.getLogger();
   public static final MapCodec<gpg> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alb.a.fieldOf("resource").forGetter($$0x -> $$0x.d), alb.a.optionalFieldOf("sprite").forGetter($$0x -> $$0x.e)).apply($$0, gpg::new)
   );
   private final alb d;
   private final Optional<alb> e;

   public gpg(alb $$0, Optional<alb> $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public void a(aul $$0, goy.a $$1) {
      alb $$2 = a.a(this.d);
      Optional<auj> $$3 = $$0.getResource($$2);
      if ($$3.isPresent()) {
         $$1.a(this.e.orElse(this.d), $$3.get());
      } else {
         c.warn("Missing sprite: {}", $$2);
      }
   }

   @Override
   public gpa a() {
      return gpb.a;
   }
}
