import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class hhz implements hhx {
   private final gta a;
   private final float b;
   private final ja c;
   private final hle d;

   public hhz(gta $$0, float $$1, ja $$2, hle $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public void a(czb $$0, fjj $$1, gqa $$2, int $$3, int $$4, boolean $$5) {
      this.a.a($$1, $$2, $$3, $$4, this.c, this.b, this.d);
   }

   public static record a(alg b, float c, ja d) implements hib.a {
      public static final MapCodec<hhz.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  alg.a.fieldOf("texture").forGetter(hhz.a::b),
                  Codec.FLOAT.optionalFieldOf("openness", 0.0F).forGetter(hhz.a::c),
                  ja.g.optionalFieldOf("orientation", ja.b).forGetter(hhz.a::d)
               )
               .apply($$0, hhz.a::new)
      );

      public a() {
         this(alg.b("shulker"), 0.0F, ja.b);
      }

      public a(cyb $$0) {
         this(gqv.e($$0), 0.0F, ja.b);
      }

      @Override
      public MapCodec<hhz.a> a() {
         return a;
      }

      @Override
      public hib<?> a(giy $$0) {
         return new hhz(new gta($$0), this.c, this.d, gqv.p.a(this.b));
      }
   }
}
