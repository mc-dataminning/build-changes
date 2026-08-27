import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ges implements gej {
   public static final Codec<ges> b = RecordCodecBuilder.create($$0 -> $$0.group(auq.a.fieldOf("pattern").forGetter($$0x -> $$0x.c)).apply($$0, ges::new));
   private final auq c;

   public ges(auq $$0) {
      this.c = $$0;
   }

   @Override
   public void a(aqc $$0, gej.a $$1) {
      $$1.a(this.c.c());
   }

   @Override
   public gel a() {
      return gem.c;
   }
}
