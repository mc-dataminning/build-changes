import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class fzn implements fze {
   public static final Codec<fzn> b = RecordCodecBuilder.create($$0 -> $$0.group(asi.a.fieldOf("pattern").forGetter($$0x -> $$0x.c)).apply($$0, fzn::new));
   private final asi c;

   public fzn(asi $$0) {
      this.c = $$0;
   }

   @Override
   public void a(anw $$0, fze.a $$1) {
      $$1.a(this.c.c());
   }

   @Override
   public fzg a() {
      return fzh.c;
   }
}
