import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class het implements her {
   private final gpw a;
   private final float b;
   private final jn c;
   private final hhy d;

   public het(gpw $$0, float $$1, jn $$2, hhy $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public void a(cxf $$0, fgr $$1, gmx $$2, int $$3, int $$4, boolean $$5) {
      this.a.a($$1, $$2, $$3, $$4, this.c, this.b, this.d);
   }

   public static record a(aku b, float c, jn d) implements hev.a {
      public static final MapCodec<het.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  aku.a.fieldOf("texture").forGetter(het.a::b),
                  Codec.FLOAT.optionalFieldOf("openness", 0.0F).forGetter(het.a::c),
                  jn.g.optionalFieldOf("orientation", jn.b).forGetter(het.a::d)
               )
               .apply($$0, het.a::new)
      );

      public a() {
         this(aku.b("shulker"), 0.0F, jn.b);
      }

      public a(cwe $$0) {
         this(gns.e($$0), 0.0F, jn.b);
      }

      @Override
      public MapCodec<het.a> a() {
         return a;
      }

      @Override
      public hev<?> a(gfy $$0) {
         return new het(new gpw($$0), this.c, this.d, gns.b(this.b));
      }
   }
}
