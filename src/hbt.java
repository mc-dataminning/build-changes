import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class hbt implements hbk {
   public static final MapCodec<hbt> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(bad.a.fieldOf("pattern").forGetter($$0x -> $$0x.c)).apply($$0, hbt::new));
   private final bad c;

   public hbt(bad $$0) {
      this.c = $$0;
   }

   @Override
   public void a(avl $$0, hbk.a $$1) {
      $$1.a(this.c.c());
   }

   @Override
   public hbm a() {
      return hbn.c;
   }
}
