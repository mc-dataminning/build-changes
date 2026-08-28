import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record hiy(String c, String d) implements hiu {
   public static final MapCodec<hiy> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.STRING.fieldOf("source").forGetter(hiy::b), Codec.STRING.fieldOf("prefix").forGetter(hiy::c)).apply($$0, hiy::new)
   );

   @Override
   public void a(avd $$0, hiu.a $$1) {
      akz $$2 = new akz("textures/" + this.c, ".png");
      $$2.a($$0).forEach(($$2x, $$3) -> {
         alg $$4 = $$2.b($$2x).f(this.d);
         $$1.a($$4, $$3);
      });
   }

   @Override
   public MapCodec<hiy> a() {
      return b;
   }

   public String b() {
      return this.c;
   }

   public String c() {
      return this.d;
   }
}
