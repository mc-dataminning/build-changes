import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class hke implements hkc {
   private final gvd a;
   private final float b;
   private final jc c;
   private final hnj d;

   public hke(gvd $$0, float $$1, jc $$2, hnj $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public void a(czy $$0, flq $$1, gsc $$2, int $$3, int $$4, boolean $$5) {
      this.a.a($$1, $$2, $$3, $$4, this.c, this.b, this.d);
   }

   public static record a(alk b, float c, jc d) implements hkg.a {
      public static final MapCodec<hke.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  alk.a.fieldOf("texture").forGetter(hke.a::b),
                  Codec.FLOAT.optionalFieldOf("openness", 0.0F).forGetter(hke.a::c),
                  jc.g.optionalFieldOf("orientation", jc.b).forGetter(hke.a::d)
               )
               .apply($$0, hke.a::new)
      );

      public a() {
         this(alk.b("shulker"), 0.0F, jc.b);
      }

      public a(cyy $$0) {
         this(gsw.e($$0), 0.0F, jc.b);
      }

      @Override
      public MapCodec<hke.a> a() {
         return a;
      }

      @Override
      public hkg<?> a(glc $$0) {
         return new hke(new gvd($$0), this.c, this.d, gsw.p.a(this.b));
      }
   }
}
