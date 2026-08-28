import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class hht implements hhx {
   public static final alg a = alg.b("christmas");
   public static final alg b = alg.b("normal");
   public static final alg c = alg.b("trapped");
   public static final alg d = alg.b("ender");
   private final gfi e;
   private final hle f;
   private final float g;

   public hht(gfi $$0, hle $$1, float $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   @Override
   public void a(czb $$0, fjj $$1, gqa $$2, int $$3, int $$4, boolean $$5) {
      fjn $$6 = this.f.a($$2, gqk::d);
      this.e.a(this.g);
      this.e.a($$1, $$6, $$3, $$4);
   }

   public static record a(alg b, float c) implements hib.a {
      public static final MapCodec<hht.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(alg.a.fieldOf("texture").forGetter(hht.a::b), Codec.FLOAT.optionalFieldOf("openness", 0.0F).forGetter(hht.a::c))
               .apply($$0, hht.a::new)
      );

      public a(alg $$0) {
         this($$0, 0.0F);
      }

      @Override
      public MapCodec<hht.a> a() {
         return a;
      }

      @Override
      public hib<?> a(giy $$0) {
         gfi $$1 = new gfi($$0.a(gjb.X));
         hle $$2 = gqv.m.a(this.b);
         return new hht($$1, $$2, this.c);
      }
   }
}
