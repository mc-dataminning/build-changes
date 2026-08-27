import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import org.slf4j.Logger;

public class fzq implements fzi {
   private static final Logger c = LogUtils.getLogger();
   public static final Codec<fzq> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(aew.a.fieldOf("resource").forGetter($$0x -> $$0x.d), aew.a.optionalFieldOf("sprite").forGetter($$0x -> $$0x.e)).apply($$0, fzq::new)
   );
   private final aew d;
   private final Optional<aew> e;

   public fzq(aew $$0, Optional<aew> $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public void a(ant $$0, fzi.a $$1) {
      aew $$2 = a.a(this.d);
      Optional<anr> $$3 = $$0.getResource($$2);
      if ($$3.isPresent()) {
         $$1.a(this.e.orElse(this.d), $$3.get());
      } else {
         c.warn("Missing sprite: {}", $$2);
      }
   }

   @Override
   public fzk a() {
      return fzl.a;
   }
}
