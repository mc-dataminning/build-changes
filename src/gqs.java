import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class gqs implements gqj {
   public static final MapCodec<gqs> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ayw.a.fieldOf("pattern").forGetter($$0x -> $$0x.c)).apply($$0, gqs::new));
   private final ayw c;

   public gqs(ayw $$0) {
      this.c = $$0;
   }

   @Override
   public void a(aud $$0, gqj.a $$1) {
      $$1.a(this.c.c());
   }

   @Override
   public gql a() {
      return gqm.c;
   }
}
