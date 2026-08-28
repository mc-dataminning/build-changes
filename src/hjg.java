import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record hjg(String c, String d) implements hjc {
   public static final MapCodec<hjg> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.STRING.fieldOf("source").forGetter(hjg::b), Codec.STRING.fieldOf("prefix").forGetter(hjg::c)).apply($$0, hjg::new)
   );

   @Override
   public void a(avd $$0, hjc.a $$1) {
      akz $$2 = new akz("textures/" + this.c, ".png");
      $$2.a($$0).forEach(($$2x, $$3) -> {
         alg $$4 = $$2.b($$2x).f(this.d);
         $$1.a($$4, $$3);
      });
   }

   @Override
   public MapCodec<hjg> a() {
      return b;
   }

   public String b() {
      return this.c;
   }

   public String c() {
      return this.d;
   }
}
