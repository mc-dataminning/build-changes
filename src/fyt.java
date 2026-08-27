import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class fyt implements fyk {
   public static final Codec<fyt> b = RecordCodecBuilder.create($$0 -> $$0.group(aru.a.fieldOf("pattern").forGetter($$0x -> $$0x.c)).apply($$0, fyt::new));
   private final aru c;

   public fyt(aru $$0) {
      this.c = $$0;
   }

   @Override
   public void a(ank $$0, fyk.a $$1) {
      $$1.a(this.c.c());
   }

   @Override
   public fym a() {
      return fyn.c;
   }
}
