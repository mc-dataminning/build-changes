import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class hdu implements hds {
   private final gox a;
   private final float b;
   private final jn c;
   private final hgz d;

   public hdu(gox $$0, float $$1, jn $$2, hgz $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public void a(cwn $$0, ffu $$1, gly $$2, int $$3, int $$4, boolean $$5) {
      this.a.a($$1, $$2, $$3, $$4, this.c, this.b, this.d);
   }

   public static record a(akv b, float c, jn d) implements hdw.a {
      public static final MapCodec<hdu.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  akv.a.fieldOf("texture").forGetter(hdu.a::b),
                  Codec.FLOAT.optionalFieldOf("openness", 0.0F).forGetter(hdu.a::c),
                  jn.g.optionalFieldOf("orientation", jn.b).forGetter(hdu.a::d)
               )
               .apply($$0, hdu.a::new)
      );

      public a() {
         this(akv.b("shulker"), 0.0F, jn.b);
      }

      public a(cvm $$0) {
         this(gmt.e($$0), 0.0F, jn.b);
      }

      @Override
      public MapCodec<hdu.a> a() {
         return a;
      }

      @Override
      public hdw<?> a(gez $$0) {
         return new hdu(new gox($$0), this.c, this.d, gmt.b(this.b));
      }
   }
}
