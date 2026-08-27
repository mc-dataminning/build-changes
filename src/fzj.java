import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class fzj implements fze {
   public static final Codec<fzj> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.STRING.fieldOf("source").forGetter($$0x -> $$0x.c), Codec.STRING.fieldOf("prefix").forGetter($$0x -> $$0x.d)).apply($$0, fzj::new)
   );
   private final String c;
   private final String d;

   public fzj(String $$0, String $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(anw $$0, fze.a $$1) {
      aes $$2 = new aes("textures/" + this.c, ".png");
      $$2.a($$0).forEach(($$2x, $$3) -> {
         aez $$4 = $$2.b($$2x).d(this.d);
         $$1.a($$4, $$3);
      });
   }

   @Override
   public fzg a() {
      return fzh.b;
   }
}
