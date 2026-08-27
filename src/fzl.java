import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import org.slf4j.Logger;

public class fzl implements fzd {
   private static final Logger c = LogUtils.getLogger();
   public static final Codec<fzl> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(aeu.a.fieldOf("resource").forGetter($$0x -> $$0x.d), aeu.a.optionalFieldOf("sprite").forGetter($$0x -> $$0x.e)).apply($$0, fzl::new)
   );
   private final aeu d;
   private final Optional<aeu> e;

   public fzl(aeu $$0, Optional<aeu> $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public void a(anp $$0, fzd.a $$1) {
      aeu $$2 = a.a(this.d);
      Optional<ann> $$3 = $$0.getResource($$2);
      if ($$3.isPresent()) {
         $$1.a(this.e.orElse(this.d), $$3.get());
      } else {
         c.warn("Missing sprite: {}", $$2);
      }
   }

   @Override
   public fzf a() {
      return fzg.a;
   }
}
