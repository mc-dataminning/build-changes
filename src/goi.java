import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class goi implements gnz {
   public static final MapCodec<goi> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ayl.a.fieldOf("pattern").forGetter($$0x -> $$0x.c)).apply($$0, goi::new));
   private final ayl c;

   public goi(ayl $$0) {
      this.c = $$0;
   }

   @Override
   public void a(atw $$0, gnz.a $$1) {
      $$1.a(this.c.c());
   }

   @Override
   public gob a() {
      return goc.c;
   }
}
