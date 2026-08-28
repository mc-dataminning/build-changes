import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class hhr implements hhp {
   private final gss a;
   private final float b;
   private final ja c;
   private final hkw d;

   public hhr(gss $$0, float $$1, ja $$2, hkw $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public void a(cyw $$0, fjc $$1, gps $$2, int $$3, int $$4, boolean $$5) {
      this.a.a($$1, $$2, $$3, $$4, this.c, this.b, this.d);
   }

   public static record a(alg b, float c, ja d) implements hht.a {
      public static final MapCodec<hhr.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  alg.a.fieldOf("texture").forGetter(hhr.a::b),
                  Codec.FLOAT.optionalFieldOf("openness", 0.0F).forGetter(hhr.a::c),
                  ja.g.optionalFieldOf("orientation", ja.b).forGetter(hhr.a::d)
               )
               .apply($$0, hhr.a::new)
      );

      public a() {
         this(alg.b("shulker"), 0.0F, ja.b);
      }

      public a(cxw $$0) {
         this(gqn.e($$0), 0.0F, ja.b);
      }

      @Override
      public MapCodec<hhr.a> a() {
         return a;
      }

      @Override
      public hht<?> a(giq $$0) {
         return new hhr(new gss($$0), this.c, this.d, gqn.p.a(this.b));
      }
   }
}
