import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class hkc implements hka {
   private final gvb a;
   private final float b;
   private final jb c;
   private final hnh d;

   public hkc(gvb $$0, float $$1, jb $$2, hnh $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public void a(czw $$0, flo $$1, gsa $$2, int $$3, int $$4, boolean $$5) {
      this.a.a($$1, $$2, $$3, $$4, this.c, this.b, this.d);
   }

   public static record a(ali b, float c, jb d) implements hke.a {
      public static final MapCodec<hkc.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  ali.a.fieldOf("texture").forGetter(hkc.a::b),
                  Codec.FLOAT.optionalFieldOf("openness", 0.0F).forGetter(hkc.a::c),
                  jb.g.optionalFieldOf("orientation", jb.b).forGetter(hkc.a::d)
               )
               .apply($$0, hkc.a::new)
      );

      public a() {
         this(ali.b("shulker"), 0.0F, jb.b);
      }

      public a(cyw $$0) {
         this(gsu.e($$0), 0.0F, jb.b);
      }

      @Override
      public MapCodec<hkc.a> a() {
         return a;
      }

      @Override
      public hke<?> a(gla $$0) {
         return new hkc(new gvb($$0), this.c, this.d, gsu.p.a(this.b));
      }
   }
}
