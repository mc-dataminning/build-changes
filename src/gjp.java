import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class gjp implements gjg {
   public static final Codec<gjp> b = RecordCodecBuilder.create($$0 -> $$0.group(axe.a.fieldOf("pattern").forGetter($$0x -> $$0x.c)).apply($$0, gjp::new));
   private final axe c;

   public gjp(axe $$0) {
      this.c = $$0;
   }

   @Override
   public void a(aso $$0, gjg.a $$1) {
      $$1.a(this.c.c());
   }

   @Override
   public gji a() {
      return gjj.c;
   }
}
