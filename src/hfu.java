import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class hfu implements hfs {
   private final gqy a;
   private final float b;
   private final jo c;
   private final hiz d;

   public hfu(gqy $$0, float $$1, jo $$2, hiz $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public void a(cxw $$0, fho $$1, gny $$2, int $$3, int $$4, boolean $$5) {
      this.a.a($$1, $$2, $$3, $$4, this.c, this.b, this.d);
   }

   public static record a(ald b, float c, jo d) implements hfw.a {
      public static final MapCodec<hfu.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  ald.a.fieldOf("texture").forGetter(hfu.a::b),
                  Codec.FLOAT.optionalFieldOf("openness", 0.0F).forGetter(hfu.a::c),
                  jo.g.optionalFieldOf("orientation", jo.b).forGetter(hfu.a::d)
               )
               .apply($$0, hfu.a::new)
      );

      public a() {
         this(ald.b("shulker"), 0.0F, jo.b);
      }

      public a(cwv $$0) {
         this(got.e($$0), 0.0F, jo.b);
      }

      @Override
      public MapCodec<hfu.a> a() {
         return a;
      }

      @Override
      public hfw<?> a(ggz $$0) {
         return new hfu(new gqy($$0), this.c, this.d, got.b(this.b));
      }
   }
}
