import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class gch implements gby {
   public static final Codec<gch> b = RecordCodecBuilder.create($$0 -> $$0.group(att.a.fieldOf("pattern").forGetter($$0x -> $$0x.c)).apply($$0, gch::new));
   private final att c;

   public gch(att $$0) {
      this.c = $$0;
   }

   @Override
   public void a(aph $$0, gby.a $$1) {
      $$1.a(this.c.c());
   }

   @Override
   public gca a() {
      return gcb.c;
   }
}
