import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class hjs implements hjq {
   private final guo a;
   private final float b;
   private final jc c;
   private final hmx d;

   public hjs(guo $$0, float $$1, jc $$2, hmx $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public void a(dai $$0, fld $$1, grn $$2, int $$3, int $$4, boolean $$5) {
      this.a.a($$1, $$2, $$3, $$4, this.c, this.b, this.d);
   }

   public static record a(alr b, float c, jc d) implements hju.a {
      public static final MapCodec<hjs.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  alr.a.fieldOf("texture").forGetter(hjs.a::b),
                  Codec.FLOAT.optionalFieldOf("openness", 0.0F).forGetter(hjs.a::c),
                  jc.g.optionalFieldOf("orientation", jc.b).forGetter(hjs.a::d)
               )
               .apply($$0, hjs.a::new)
      );

      public a() {
         this(alr.b("shulker"), 0.0F, jc.b);
      }

      public a(czi $$0) {
         this(gsh.e($$0), 0.0F, jc.b);
      }

      @Override
      public MapCodec<hjs.a> a() {
         return a;
      }

      @Override
      public hju<?> a(gkn $$0) {
         return new hjs(new guo($$0), this.c, this.d, gsh.p.a(this.b));
      }
   }
}
