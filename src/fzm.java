import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class fzm implements fzd {
   public static final Codec<fzm> b = RecordCodecBuilder.create($$0 -> $$0.group(ary.a.fieldOf("pattern").forGetter($$0x -> $$0x.c)).apply($$0, fzm::new));
   private final ary c;

   public fzm(ary $$0) {
      this.c = $$0;
   }

   @Override
   public void a(anp $$0, fzd.a $$1) {
      $$1.a(this.c.c());
   }

   @Override
   public fzf a() {
      return fzg.c;
   }
}
