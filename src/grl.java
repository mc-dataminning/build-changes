import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class grl implements grc {
   public static final Codec<grl> b = RecordCodecBuilder.create($$0 -> $$0.group(ayu.a.fieldOf("pattern").forGetter($$0x -> $$0x.c)).apply($$0, grl::new));
   private final ayu c;

   public grl(ayu $$0) {
      this.c = $$0;
   }

   @Override
   public void a(aud $$0, grc.a $$1) {
      $$1.a(this.c.c());
   }

   @Override
   public gre a() {
      return grf.c;
   }
}
