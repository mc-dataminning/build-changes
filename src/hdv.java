import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class hdv implements hdt {
   private final goy a;
   private final float b;
   private final jn c;
   private final hha d;

   public hdv(goy $$0, float $$1, jn $$2, hha $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public void a(cwo $$0, ffv $$1, glz $$2, int $$3, int $$4, boolean $$5) {
      this.a.a($$1, $$2, $$3, $$4, this.c, this.b, this.d);
   }

   public static record a(akv b, float c, jn d) implements hdx.a {
      public static final MapCodec<hdv.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  akv.a.fieldOf("texture").forGetter(hdv.a::b),
                  Codec.FLOAT.optionalFieldOf("openness", 0.0F).forGetter(hdv.a::c),
                  jn.g.optionalFieldOf("orientation", jn.b).forGetter(hdv.a::d)
               )
               .apply($$0, hdv.a::new)
      );

      public a() {
         this(akv.b("shulker"), 0.0F, jn.b);
      }

      public a(cvn $$0) {
         this(gmu.e($$0), 0.0F, jn.b);
      }

      @Override
      public MapCodec<hdv.a> a() {
         return a;
      }

      @Override
      public hdx<?> a(gfa $$0) {
         return new hdv(new goy($$0), this.c, this.d, gmu.b(this.b));
      }
   }
}
