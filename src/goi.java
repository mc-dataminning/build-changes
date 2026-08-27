import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class goi implements gnz {
   public static final MapCodec<goi> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ayn.a.fieldOf("pattern").forGetter($$0x -> $$0x.c)).apply($$0, goi::new));
   private final ayn c;

   public goi(ayn $$0) {
      this.c = $$0;
   }

   @Override
   public void a(atx $$0, gnz.a $$1) {
      $$1.a(this.c.c());
   }

   @Override
   public gob a() {
      return goc.c;
   }
}
