import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class gqb implements gps {
   public static final MapCodec<gqb> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ayp.a.fieldOf("pattern").forGetter($$0x -> $$0x.c)).apply($$0, gqb::new));
   private final ayp c;

   public gqb(ayp $$0) {
      this.c = $$0;
   }

   @Override
   public void a(atw $$0, gps.a $$1) {
      $$1.a(this.c.c());
   }

   @Override
   public gpu a() {
      return gpv.c;
   }
}
