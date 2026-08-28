import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class gyq implements gyh {
   public static final MapCodec<gyq> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(azt.a.fieldOf("pattern").forGetter($$0x -> $$0x.c)).apply($$0, gyq::new));
   private final azt c;

   public gyq(azt $$0) {
      this.c = $$0;
   }

   @Override
   public void a(avb $$0, gyh.a $$1) {
      $$1.a(this.c.c());
   }

   @Override
   public gyj a() {
      return gyk.c;
   }
}
