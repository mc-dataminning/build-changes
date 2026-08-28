import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class hjw implements hka {
   public static final ali a = ali.b("christmas");
   public static final ali b = ali.b("normal");
   public static final ali c = ali.b("trapped");
   public static final ali d = ali.b("ender");
   private final ghk e;
   private final hnh f;
   private final float g;

   public hjw(ghk $$0, hnh $$1, float $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   @Override
   public void a(czw $$0, flo $$1, gsa $$2, int $$3, int $$4, boolean $$5) {
      flr $$6 = this.f.a($$2, gsl::d);
      this.e.a(this.g);
      this.e.a($$1, $$6, $$3, $$4);
   }

   public static record a(ali b, float c) implements hke.a {
      public static final MapCodec<hjw.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(ali.a.fieldOf("texture").forGetter(hjw.a::b), Codec.FLOAT.optionalFieldOf("openness", 0.0F).forGetter(hjw.a::c))
               .apply($$0, hjw.a::new)
      );

      public a(ali $$0) {
         this($$0, 0.0F);
      }

      @Override
      public MapCodec<hjw.a> a() {
         return a;
      }

      @Override
      public hke<?> a(gla $$0) {
         ghk $$1 = new ghk($$0.a(gld.X));
         hnh $$2 = gsu.m.a(this.b);
         return new hjw($$1, $$2, this.c);
      }
   }
}
