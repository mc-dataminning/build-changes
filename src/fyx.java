import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import org.slf4j.Logger;

public class fyx implements fyp {
   private static final Logger c = LogUtils.getLogger();
   public static final Codec<fyx> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(aer.a.fieldOf("resource").forGetter($$0x -> $$0x.d), aer.a.optionalFieldOf("sprite").forGetter($$0x -> $$0x.e)).apply($$0, fyx::new)
   );
   private final aer d;
   private final Optional<aer> e;

   public fyx(aer $$0, Optional<aer> $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public void a(anm $$0, fyp.a $$1) {
      aer $$2 = a.a(this.d);
      Optional<ank> $$3 = $$0.getResource($$2);
      if ($$3.isPresent()) {
         $$1.a(this.e.orElse(this.d), $$3.get());
      } else {
         c.warn("Missing sprite: {}", $$2);
      }
   }

   @Override
   public fyr a() {
      return fys.a;
   }
}
