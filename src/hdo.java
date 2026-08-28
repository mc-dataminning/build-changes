import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class hdo implements hds {
   public static final akv a = akv.b("christmas");
   public static final akv b = akv.b("normal");
   public static final akv c = akv.b("trapped");
   public static final akv d = akv.b("ender");
   private final gbo e;
   private final hgz f;
   private final float g;

   public hdo(gbo $$0, hgz $$1, float $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   @Override
   public void a(cwn $$0, ffu $$1, gly $$2, int $$3, int $$4, boolean $$5) {
      ffy $$6 = this.f.a($$2, gmi::d);
      this.e.a(this.g);
      this.e.a($$1, $$6, $$3, $$4);
   }

   public static record a(akv b, float c) implements hdw.a {
      public static final MapCodec<hdo.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(akv.a.fieldOf("texture").forGetter(hdo.a::b), Codec.FLOAT.optionalFieldOf("openness", 0.0F).forGetter(hdo.a::c))
               .apply($$0, hdo.a::new)
      );

      public a(akv $$0) {
         this($$0, 0.0F);
      }

      @Override
      public MapCodec<hdo.a> a() {
         return a;
      }

      @Override
      public hdw<?> a(gez $$0) {
         gbo $$1 = new gbo($$0.a(gfc.V));
         hgz $$2 = gmt.e(this.b);
         return new hdo($$1, $$2, this.c);
      }
   }
}
