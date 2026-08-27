import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import org.slf4j.Logger;

public class gea implements gds {
   private static final Logger c = LogUtils.getLogger();
   public static final Codec<gea> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(agt.a.fieldOf("resource").forGetter($$0x -> $$0x.d), agt.a.optionalFieldOf("sprite").forGetter($$0x -> $$0x.e)).apply($$0, gea::new)
   );
   private final agt d;
   private final Optional<agt> e;

   public gea(agt $$0, Optional<agt> $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public void a(aps $$0, gds.a $$1) {
      agt $$2 = a.a(this.d);
      Optional<apq> $$3 = $$0.getResource($$2);
      if ($$3.isPresent()) {
         $$1.a(this.e.orElse(this.d), $$3.get());
      } else {
         c.warn("Missing sprite: {}", $$2);
      }
   }

   @Override
   public gdu a() {
      return gdv.a;
   }
}
