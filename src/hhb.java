import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class hhb implements hgz {
   private final gsd a;
   private final float b;
   private final ja c;
   private final hkg d;

   public hhb(gsd $$0, float $$1, ja $$2, hkg $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public void a(cyq $$0, fiq $$1, gpd $$2, int $$3, int $$4, boolean $$5) {
      this.a.a($$1, $$2, $$3, $$4, this.c, this.b, this.d);
   }

   public static record a(ale b, float c, ja d) implements hhd.a {
      public static final MapCodec<hhb.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  ale.a.fieldOf("texture").forGetter(hhb.a::b),
                  Codec.FLOAT.optionalFieldOf("openness", 0.0F).forGetter(hhb.a::c),
                  ja.g.optionalFieldOf("orientation", ja.b).forGetter(hhb.a::d)
               )
               .apply($$0, hhb.a::new)
      );

      public a() {
         this(ale.b("shulker"), 0.0F, ja.b);
      }

      public a(cxq $$0) {
         this(gpy.e($$0), 0.0F, ja.b);
      }

      @Override
      public MapCodec<hhb.a> a() {
         return a;
      }

      @Override
      public hhd<?> a(gic $$0) {
         return new hhb(new gsd($$0), this.c, this.d, gpy.p.a(this.b));
      }
   }
}
