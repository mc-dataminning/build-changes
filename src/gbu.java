import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class gbu implements gbl {
   public static final Codec<gbu> b = RecordCodecBuilder.create($$0 -> $$0.group(atp.a.fieldOf("pattern").forGetter($$0x -> $$0x.c)).apply($$0, gbu::new));
   private final atp c;

   public gbu(atp $$0) {
      this.c = $$0;
   }

   @Override
   public void a(apd $$0, gbl.a $$1) {
      $$1.a(this.c.c());
   }

   @Override
   public gbn a() {
      return gbo.c;
   }
}
