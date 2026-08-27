import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class fzr implements fzi {
   public static final Codec<fzr> b = RecordCodecBuilder.create($$0 -> $$0.group(asd.a.fieldOf("pattern").forGetter($$0x -> $$0x.c)).apply($$0, fzr::new));
   private final asd c;

   public fzr(asd $$0) {
      this.c = $$0;
   }

   @Override
   public void a(ant $$0, fzi.a $$1) {
      $$1.a(this.c.c());
   }

   @Override
   public fzk a() {
      return fzl.c;
   }
}
