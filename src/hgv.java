import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class hgv implements hgz {
   public static final ale a = ale.b("christmas");
   public static final ale b = ale.b("normal");
   public static final ale c = ale.b("trapped");
   public static final ale d = ale.b("ender");
   private final gep e;
   private final hkg f;
   private final float g;

   public hgv(gep $$0, hkg $$1, float $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   @Override
   public void a(cyq $$0, fiq $$1, gpd $$2, int $$3, int $$4, boolean $$5) {
      fiu $$6 = this.f.a($$2, gpn::d);
      this.e.a(this.g);
      this.e.a($$1, $$6, $$3, $$4);
   }

   public static record a(ale b, float c) implements hhd.a {
      public static final MapCodec<hgv.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(ale.a.fieldOf("texture").forGetter(hgv.a::b), Codec.FLOAT.optionalFieldOf("openness", 0.0F).forGetter(hgv.a::c))
               .apply($$0, hgv.a::new)
      );

      public a(ale $$0) {
         this($$0, 0.0F);
      }

      @Override
      public MapCodec<hgv.a> a() {
         return a;
      }

      @Override
      public hhd<?> a(gic $$0) {
         gep $$1 = new gep($$0.a(gif.X));
         hkg $$2 = gpy.m.a(this.b);
         return new hgv($$1, $$2, this.c);
      }
   }
}
