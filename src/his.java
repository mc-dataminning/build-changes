import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class his implements hiq {
   private final gtr a;
   private final float b;
   private final jb c;
   private final hlx d;

   public his(gtr $$0, float $$1, jb $$2, hlx $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public void a(czl $$0, fkd $$1, gqr $$2, int $$3, int $$4, boolean $$5) {
      this.a.a($$1, $$2, $$3, $$4, this.c, this.b, this.d);
   }

   public static record a(alg b, float c, jb d) implements hiu.a {
      public static final MapCodec<his.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  alg.a.fieldOf("texture").forGetter(his.a::b),
                  Codec.FLOAT.optionalFieldOf("openness", 0.0F).forGetter(his.a::c),
                  jb.g.optionalFieldOf("orientation", jb.b).forGetter(his.a::d)
               )
               .apply($$0, his.a::new)
      );

      public a() {
         this(alg.b("shulker"), 0.0F, jb.b);
      }

      public a(cyl $$0) {
         this(grl.e($$0), 0.0F, jb.b);
      }

      @Override
      public MapCodec<his.a> a() {
         return a;
      }

      @Override
      public hiu<?> a(gjp $$0) {
         return new his(new gtr($$0), this.c, this.d, grl.p.a(this.b));
      }
   }
}
