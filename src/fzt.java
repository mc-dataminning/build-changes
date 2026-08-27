import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class fzt implements fzk {
   public static final Codec<fzt> b = RecordCodecBuilder.create($$0 -> $$0.group(asf.a.fieldOf("pattern").forGetter($$0x -> $$0x.c)).apply($$0, fzt::new));
   private final asf c;

   public fzt(asf $$0) {
      this.c = $$0;
   }

   @Override
   public void a(anv $$0, fzk.a $$1) {
      $$1.a(this.c.c());
   }

   @Override
   public fzm a() {
      return fzn.c;
   }
}
