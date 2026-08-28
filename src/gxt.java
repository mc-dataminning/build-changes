import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class gxt implements gxk {
   public static final MapCodec<gxt> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(azo.a.fieldOf("pattern").forGetter($$0x -> $$0x.c)).apply($$0, gxt::new));
   private final azo c;

   public gxt(azo $$0) {
      this.c = $$0;
   }

   @Override
   public void a(auv $$0, gxk.a $$1) {
      $$1.a(this.c.c());
   }

   @Override
   public gxm a() {
      return gxn.c;
   }
}
