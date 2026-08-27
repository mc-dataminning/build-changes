import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class geb implements gds {
   public static final Codec<geb> b = RecordCodecBuilder.create($$0 -> $$0.group(aug.a.fieldOf("pattern").forGetter($$0x -> $$0x.c)).apply($$0, geb::new));
   private final aug c;

   public geb(aug $$0) {
      this.c = $$0;
   }

   @Override
   public void a(aps $$0, gds.a $$1) {
      $$1.a(this.c.c());
   }

   @Override
   public gdu a() {
      return gdv.c;
   }
}
