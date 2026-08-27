import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ghc implements ggx {
   public static final Codec<ghc> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.STRING.fieldOf("source").forGetter($$0x -> $$0x.c), Codec.STRING.fieldOf("prefix").forGetter($$0x -> $$0x.d)).apply($$0, ghc::new)
   );
   private final String c;
   private final String d;

   public ghc(String $$0, String $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(asa $$0, ggx.a $$1) {
      air $$2 = new air("textures/" + this.c, ".png");
      $$2.a($$0).forEach(($$2x, $$3) -> {
         aiy $$4 = $$2.b($$2x).d(this.d);
         $$1.a($$4, $$3);
      });
   }

   @Override
   public ggz a() {
      return gha.b;
   }
}
