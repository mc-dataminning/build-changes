import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class fzd implements fyy {
   public static final Codec<fzd> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.STRING.fieldOf("source").forGetter($$0x -> $$0x.c), Codec.STRING.fieldOf("prefix").forGetter($$0x -> $$0x.d)).apply($$0, fzd::new)
   );
   private final String c;
   private final String d;

   public fzd(String $$0, String $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(anm $$0, fyy.a $$1) {
      aek $$2 = new aek("textures/" + this.c, ".png");
      $$2.a($$0).forEach(($$2x, $$3) -> {
         aer $$4 = $$2.b($$2x).d(this.d);
         $$1.a($$4, $$3);
      });
   }

   @Override
   public fza a() {
      return fzb.b;
   }
}
