import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class gim implements gid {
   public static final Codec<gim> b = RecordCodecBuilder.create($$0 -> $$0.group(awu.a.fieldOf("pattern").forGetter($$0x -> $$0x.c)).apply($$0, gim::new));
   private final awu c;

   public gim(awu $$0) {
      this.c = $$0;
   }

   @Override
   public void a(asf $$0, gid.a $$1) {
      $$1.a(this.c.c());
   }

   @Override
   public gif a() {
      return gig.c;
   }
}
