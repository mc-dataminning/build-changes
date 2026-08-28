import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class hdp implements hdt {
   public static final akv a = akv.b("christmas");
   public static final akv b = akv.b("normal");
   public static final akv c = akv.b("trapped");
   public static final akv d = akv.b("ender");
   private final gbp e;
   private final hha f;
   private final float g;

   public hdp(gbp $$0, hha $$1, float $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   @Override
   public void a(cwo $$0, ffv $$1, glz $$2, int $$3, int $$4, boolean $$5) {
      ffz $$6 = this.f.a($$2, gmj::d);
      this.e.a(this.g);
      this.e.a($$1, $$6, $$3, $$4);
   }

   public static record a(akv b, float c) implements hdx.a {
      public static final MapCodec<hdp.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(akv.a.fieldOf("texture").forGetter(hdp.a::b), Codec.FLOAT.optionalFieldOf("openness", 0.0F).forGetter(hdp.a::c))
               .apply($$0, hdp.a::new)
      );

      public a(akv $$0) {
         this($$0, 0.0F);
      }

      @Override
      public MapCodec<hdp.a> a() {
         return a;
      }

      @Override
      public hdx<?> a(gfa $$0) {
         gbp $$1 = new gbp($$0.a(gfd.V));
         hha $$2 = gmu.e(this.b);
         return new hdp($$1, $$2, this.c);
      }
   }
}
