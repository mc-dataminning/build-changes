import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class gfa implements ger {
   public static final Codec<gfa> b = RecordCodecBuilder.create($$0 -> $$0.group(auw.a.fieldOf("pattern").forGetter($$0x -> $$0x.c)).apply($$0, gfa::new));
   private final auw c;

   public gfa(auw $$0) {
      this.c = $$0;
   }

   @Override
   public void a(aqi $$0, ger.a $$1) {
      $$1.a(this.c.c());
   }

   @Override
   public get a() {
      return geu.c;
   }
}
