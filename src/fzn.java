import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class fzn implements fzi {
   public static final Codec<fzn> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.STRING.fieldOf("source").forGetter($$0x -> $$0x.c), Codec.STRING.fieldOf("prefix").forGetter($$0x -> $$0x.d)).apply($$0, fzn::new)
   );
   private final String c;
   private final String d;

   public fzn(String $$0, String $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(ant $$0, fzi.a $$1) {
      aep $$2 = new aep("textures/" + this.c, ".png");
      $$2.a($$0).forEach(($$2x, $$3) -> {
         aew $$4 = $$2.b($$2x).d(this.d);
         $$1.a($$4, $$3);
      });
   }

   @Override
   public fzk a() {
      return fzl.b;
   }
}
