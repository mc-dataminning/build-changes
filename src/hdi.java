import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class hdi implements hdm {
   public static final aku a = aku.b("christmas");
   public static final aku b = aku.b("normal");
   public static final aku c = aku.b("trapped");
   public static final aku d = aku.b("ender");
   private final gbl e;
   private final hgt f;
   private final float g;

   public hdi(gbl $$0, hgt $$1, float $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   @Override
   public void a(cwl $$0, ffs $$1, glv $$2, int $$3, int $$4, boolean $$5) {
      ffw $$6 = this.f.a($$2, gmf::d);
      this.e.a(this.g);
      this.e.a($$1, $$6, $$3, $$4);
   }

   public static record a(aku b, float c) implements hdq.a {
      public static final MapCodec<hdi.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(aku.a.fieldOf("texture").forGetter(hdi.a::b), Codec.FLOAT.optionalFieldOf("openness", 0.0F).forGetter(hdi.a::c))
               .apply($$0, hdi.a::new)
      );

      public a(aku $$0) {
         this($$0, 0.0F);
      }

      @Override
      public MapCodec<hdi.a> a() {
         return a;
      }

      @Override
      public hdq<?> a(gew $$0) {
         gbl $$1 = new gbl($$0.a(gez.V));
         hgt $$2 = gmq.e(this.b);
         return new hdi($$1, $$2, this.c);
      }
   }
}
