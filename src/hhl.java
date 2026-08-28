import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class hhl implements hhp {
   public static final alg a = alg.b("christmas");
   public static final alg b = alg.b("normal");
   public static final alg c = alg.b("trapped");
   public static final alg d = alg.b("ender");
   private final gfb e;
   private final hkw f;
   private final float g;

   public hhl(gfb $$0, hkw $$1, float $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   @Override
   public void a(cyw $$0, fjc $$1, gps $$2, int $$3, int $$4, boolean $$5) {
      fjg $$6 = this.f.a($$2, gqc::d);
      this.e.a(this.g);
      this.e.a($$1, $$6, $$3, $$4);
   }

   public static record a(alg b, float c) implements hht.a {
      public static final MapCodec<hhl.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(alg.a.fieldOf("texture").forGetter(hhl.a::b), Codec.FLOAT.optionalFieldOf("openness", 0.0F).forGetter(hhl.a::c))
               .apply($$0, hhl.a::new)
      );

      public a(alg $$0) {
         this($$0, 0.0F);
      }

      @Override
      public MapCodec<hhl.a> a() {
         return a;
      }

      @Override
      public hht<?> a(giq $$0) {
         gfb $$1 = new gfb($$0.a(git.X));
         hkw $$2 = gqn.m.a(this.b);
         return new hhl($$1, $$2, this.c);
      }
   }
}
