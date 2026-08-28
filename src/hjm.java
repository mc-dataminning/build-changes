import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class hjm implements hjq {
   public static final alr a = alr.b("christmas");
   public static final alr b = alr.b("normal");
   public static final alr c = alr.b("trapped");
   public static final alr d = alr.b("ender");
   private final ggx e;
   private final hmx f;
   private final float g;

   public hjm(ggx $$0, hmx $$1, float $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   @Override
   public void a(dai $$0, fld $$1, grn $$2, int $$3, int $$4, boolean $$5) {
      flg $$6 = this.f.a($$2, gry::d);
      this.e.a(this.g);
      this.e.a($$1, $$6, $$3, $$4);
   }

   public static record a(alr b, float c) implements hju.a {
      public static final MapCodec<hjm.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(alr.a.fieldOf("texture").forGetter(hjm.a::b), Codec.FLOAT.optionalFieldOf("openness", 0.0F).forGetter(hjm.a::c))
               .apply($$0, hjm.a::new)
      );

      public a(alr $$0) {
         this($$0, 0.0F);
      }

      @Override
      public MapCodec<hjm.a> a() {
         return a;
      }

      @Override
      public hju<?> a(gkn $$0) {
         ggx $$1 = new ggx($$0.a(gkq.X));
         hmx $$2 = gsh.m.a(this.b);
         return new hjm($$1, $$2, this.c);
      }
   }
}
