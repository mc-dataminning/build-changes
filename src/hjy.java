import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class hjy implements hkc {
   public static final alk a = alk.b("christmas");
   public static final alk b = alk.b("normal");
   public static final alk c = alk.b("trapped");
   public static final alk d = alk.b("ender");
   private final ghm e;
   private final hnj f;
   private final float g;

   public hjy(ghm $$0, hnj $$1, float $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   @Override
   public void a(czy $$0, flq $$1, gsc $$2, int $$3, int $$4, boolean $$5) {
      flt $$6 = this.f.a($$2, gsn::d);
      this.e.a(this.g);
      this.e.a($$1, $$6, $$3, $$4);
   }

   public static record a(alk b, float c) implements hkg.a {
      public static final MapCodec<hjy.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(alk.a.fieldOf("texture").forGetter(hjy.a::b), Codec.FLOAT.optionalFieldOf("openness", 0.0F).forGetter(hjy.a::c))
               .apply($$0, hjy.a::new)
      );

      public a(alk $$0) {
         this($$0, 0.0F);
      }

      @Override
      public MapCodec<hjy.a> a() {
         return a;
      }

      @Override
      public hkg<?> a(glc $$0) {
         ghm $$1 = new ghm($$0.a(glf.X));
         hnj $$2 = gsw.m.a(this.b);
         return new hjy($$1, $$2, this.c);
      }
   }
}
