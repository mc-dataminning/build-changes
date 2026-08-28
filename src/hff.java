import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class hff implements hew {
   public static final MapCodec<hff> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(azi.a.fieldOf("pattern").forGetter($$0x -> $$0x.c)).apply($$0, hff::new));
   private final azi c;

   public hff(azi $$0) {
      this.c = $$0;
   }

   @Override
   public void a(aup $$0, hew.a $$1) {
      $$1.a(this.c.c());
   }

   @Override
   public hey a() {
      return hez.c;
   }
}
