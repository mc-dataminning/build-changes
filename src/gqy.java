import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class gqy implements gqp {
   public static final MapCodec<gqy> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ayx.a.fieldOf("pattern").forGetter($$0x -> $$0x.c)).apply($$0, gqy::new));
   private final ayx c;

   public gqy(ayx $$0) {
      this.c = $$0;
   }

   @Override
   public void a(aue $$0, gqp.a $$1) {
      $$1.a(this.c.c());
   }

   @Override
   public gqr a() {
      return gqs.c;
   }
}
