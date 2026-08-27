import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class fzh implements fyy {
   public static final Codec<fzh> b = RecordCodecBuilder.create($$0 -> $$0.group(arv.a.fieldOf("pattern").forGetter($$0x -> $$0x.c)).apply($$0, fzh::new));
   private final arv c;

   public fzh(arv $$0) {
      this.c = $$0;
   }

   @Override
   public void a(anm $$0, fyy.a $$1) {
      $$1.a(this.c.c());
   }

   @Override
   public fza a() {
      return fzb.c;
   }
}
