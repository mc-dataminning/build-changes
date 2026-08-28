import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class hdo implements hdm {
   private final gou a;
   private final float b;
   private final jn c;
   private final hgt d;

   public hdo(gou $$0, float $$1, jn $$2, hgt $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public void a(cwl $$0, ffs $$1, glv $$2, int $$3, int $$4, boolean $$5) {
      this.a.a($$1, $$2, $$3, $$4, this.c, this.b, this.d);
   }

   public static record a(aku b, float c, jn d) implements hdq.a {
      public static final MapCodec<hdo.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  aku.a.fieldOf("texture").forGetter(hdo.a::b),
                  Codec.FLOAT.optionalFieldOf("openness", 0.0F).forGetter(hdo.a::c),
                  jn.g.optionalFieldOf("orientation", jn.b).forGetter(hdo.a::d)
               )
               .apply($$0, hdo.a::new)
      );

      public a() {
         this(aku.b("shulker"), 0.0F, jn.b);
      }

      public a(cvk $$0) {
         this(gmq.e($$0), 0.0F, jn.b);
      }

      @Override
      public MapCodec<hdo.a> a() {
         return a;
      }

      @Override
      public hdq<?> a(gew $$0) {
         return new hdo(new gou($$0), this.c, this.d, gmq.b(this.b));
      }
   }
}
