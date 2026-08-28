import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record hkz(String c, String d) implements hkv {
   public static final MapCodec<hkz> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.STRING.fieldOf("source").forGetter(hkz::b), Codec.STRING.fieldOf("prefix").forGetter(hkz::c)).apply($$0, hkz::new)
   );

   @Override
   public void a(avo $$0, hkv.a $$1) {
      alk $$2 = new alk("textures/" + this.c, ".png");
      $$2.a($$0).forEach(($$2x, $$3) -> {
         alr $$4 = $$2.b($$2x).f(this.d);
         $$1.a($$4, $$3);
      });
   }

   @Override
   public MapCodec<hkz> a() {
      return b;
   }

   public String b() {
      return this.c;
   }

   public String c() {
      return this.d;
   }
}
