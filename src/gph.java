import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class gph implements goy {
   public static final MapCodec<gph> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(azd.a.fieldOf("pattern").forGetter($$0x -> $$0x.c)).apply($$0, gph::new));
   private final azd c;

   public gph(azd $$0) {
      this.c = $$0;
   }

   @Override
   public void a(aul $$0, goy.a $$1) {
      $$1.a(this.c.c());
   }

   @Override
   public gpa a() {
      return gpb.c;
   }
}
