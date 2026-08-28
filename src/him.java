import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class him implements hiq {
   public static final alg a = alg.b("christmas");
   public static final alg b = alg.b("normal");
   public static final alg c = alg.b("trapped");
   public static final alg d = alg.b("ender");
   private final gfz e;
   private final hlx f;
   private final float g;

   public him(gfz $$0, hlx $$1, float $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   @Override
   public void a(czl $$0, fkd $$1, gqr $$2, int $$3, int $$4, boolean $$5) {
      fkh $$6 = this.f.a($$2, grc::d);
      this.e.a(this.g);
      this.e.a($$1, $$6, $$3, $$4);
   }

   public static record a(alg b, float c) implements hiu.a {
      public static final MapCodec<him.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(alg.a.fieldOf("texture").forGetter(him.a::b), Codec.FLOAT.optionalFieldOf("openness", 0.0F).forGetter(him.a::c))
               .apply($$0, him.a::new)
      );

      public a(alg $$0) {
         this($$0, 0.0F);
      }

      @Override
      public MapCodec<him.a> a() {
         return a;
      }

      @Override
      public hiu<?> a(gjp $$0) {
         gfz $$1 = new gfz($$0.a(gjs.X));
         hlx $$2 = grl.m.a(this.b);
         return new him($$1, $$2, this.c);
      }
   }
}
