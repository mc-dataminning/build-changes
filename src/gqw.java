import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class gqw implements gqn {
   public static final MapCodec<gqw> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ayx.a.fieldOf("pattern").forGetter($$0x -> $$0x.c)).apply($$0, gqw::new));
   private final ayx c;

   public gqw(ayx $$0) {
      this.c = $$0;
   }

   @Override
   public void a(aue $$0, gqn.a $$1) {
      $$1.a(this.c.c());
   }

   @Override
   public gqp a() {
      return gqq.c;
   }
}
