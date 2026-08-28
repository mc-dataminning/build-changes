import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class hig implements hik {
   public static final alg a = alg.b("christmas");
   public static final alg b = alg.b("normal");
   public static final alg c = alg.b("trapped");
   public static final alg d = alg.b("ender");
   private final gfu e;
   private final hlq f;
   private final float g;

   public hig(gfu $$0, hlq $$1, float $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   @Override
   public void a(czi $$0, fjy $$1, gqm $$2, int $$3, int $$4, boolean $$5) {
      fkc $$6 = this.f.a($$2, gqx::d);
      this.e.a(this.g);
      this.e.a($$1, $$6, $$3, $$4);
   }

   public static record a(alg b, float c) implements hio.a {
      public static final MapCodec<hig.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(alg.a.fieldOf("texture").forGetter(hig.a::b), Codec.FLOAT.optionalFieldOf("openness", 0.0F).forGetter(hig.a::c))
               .apply($$0, hig.a::new)
      );

      public a(alg $$0) {
         this($$0, 0.0F);
      }

      @Override
      public MapCodec<hig.a> a() {
         return a;
      }

      @Override
      public hio<?> a(gjk $$0) {
         gfu $$1 = new gfu($$0.a(gjn.X));
         hlq $$2 = grg.m.a(this.b);
         return new hig($$1, $$2, this.c);
      }
   }
}
