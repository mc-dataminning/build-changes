import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class hdt implements hdr {
   private final gow a;
   private final float b;
   private final jn c;
   private final hgy d;

   public hdt(gow $$0, float $$1, jn $$2, hgy $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public void a(cwm $$0, fft $$1, glx $$2, int $$3, int $$4, boolean $$5) {
      this.a.a($$1, $$2, $$3, $$4, this.c, this.b, this.d);
   }

   public static record a(akv b, float c, jn d) implements hdv.a {
      public static final MapCodec<hdt.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  akv.a.fieldOf("texture").forGetter(hdt.a::b),
                  Codec.FLOAT.optionalFieldOf("openness", 0.0F).forGetter(hdt.a::c),
                  jn.g.optionalFieldOf("orientation", jn.b).forGetter(hdt.a::d)
               )
               .apply($$0, hdt.a::new)
      );

      public a() {
         this(akv.b("shulker"), 0.0F, jn.b);
      }

      public a(cvl $$0) {
         this(gms.e($$0), 0.0F, jn.b);
      }

      @Override
      public MapCodec<hdt.a> a() {
         return a;
      }

      @Override
      public hdv<?> a(gey $$0) {
         return new hdt(new gow($$0), this.c, this.d, gms.b(this.b));
      }
   }
}
