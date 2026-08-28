import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class him implements hik {
   private final gtm a;
   private final float b;
   private final jb c;
   private final hlq d;

   public him(gtm $$0, float $$1, jb $$2, hlq $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public void a(czi $$0, fjy $$1, gqm $$2, int $$3, int $$4, boolean $$5) {
      this.a.a($$1, $$2, $$3, $$4, this.c, this.b, this.d);
   }

   public static record a(alg b, float c, jb d) implements hio.a {
      public static final MapCodec<him.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  alg.a.fieldOf("texture").forGetter(him.a::b),
                  Codec.FLOAT.optionalFieldOf("openness", 0.0F).forGetter(him.a::c),
                  jb.g.optionalFieldOf("orientation", jb.b).forGetter(him.a::d)
               )
               .apply($$0, him.a::new)
      );

      public a() {
         this(alg.b("shulker"), 0.0F, jb.b);
      }

      public a(cyi $$0) {
         this(grg.e($$0), 0.0F, jb.b);
      }

      @Override
      public MapCodec<him.a> a() {
         return a;
      }

      @Override
      public hio<?> a(gjk $$0) {
         return new him(new gtm($$0), this.c, this.d, grg.p.a(this.b));
      }
   }
}
