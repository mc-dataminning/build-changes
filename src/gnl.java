import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class gnl implements gnc {
   public static final Codec<gnl> b = RecordCodecBuilder.create($$0 -> $$0.group(ayh.a.fieldOf("pattern").forGetter($$0x -> $$0x.c)).apply($$0, gnl::new));
   private final ayh c;

   public gnl(ayh $$0) {
      this.c = $$0;
   }

   @Override
   public void a(atr $$0, gnc.a $$1) {
      $$1.a(this.c.c());
   }

   @Override
   public gne a() {
      return gnf.c;
   }
}
