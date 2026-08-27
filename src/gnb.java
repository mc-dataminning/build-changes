import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class gnb implements gms {
   public static final Codec<gnb> b = RecordCodecBuilder.create($$0 -> $$0.group(aye.a.fieldOf("pattern").forGetter($$0x -> $$0x.c)).apply($$0, gnb::new));
   private final aye c;

   public gnb(aye $$0) {
      this.c = $$0;
   }

   @Override
   public void a(ato $$0, gms.a $$1) {
      $$1.a(this.c.c());
   }

   @Override
   public gmu a() {
      return gmv.c;
   }
}
