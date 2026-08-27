import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import org.slf4j.Logger;

public class fzg implements fyy {
   private static final Logger c = LogUtils.getLogger();
   public static final Codec<fzg> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(aer.a.fieldOf("resource").forGetter($$0x -> $$0x.d), aer.a.optionalFieldOf("sprite").forGetter($$0x -> $$0x.e)).apply($$0, fzg::new)
   );
   private final aer d;
   private final Optional<aer> e;

   public fzg(aer $$0, Optional<aer> $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public void a(anm $$0, fyy.a $$1) {
      aer $$2 = a.a(this.d);
      Optional<ank> $$3 = $$0.getResource($$2);
      if ($$3.isPresent()) {
         $$1.a(this.e.orElse(this.d), $$3.get());
      } else {
         c.warn("Missing sprite: {}", $$2);
      }
   }

   @Override
   public fza a() {
      return fzb.a;
   }
}
