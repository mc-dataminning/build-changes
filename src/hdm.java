import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class hdm implements hdk {
   private final gov a;
   private final float b;
   private final jn c;
   private final hgs d;

   public hdm(gov $$0, float $$1, jn $$2, hgs $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public void a(cwn $$0, ffu $$1, glx $$2, int $$3, int $$4, boolean $$5) {
      this.a.a($$1, $$2, $$3, $$4, this.c, this.b, this.d);
   }

   public static record a(aku b, float c, jn d) implements hdo.a {
      public static final MapCodec<hdm.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  aku.a.fieldOf("texture").forGetter(hdm.a::b),
                  Codec.FLOAT.optionalFieldOf("openness", 0.0F).forGetter(hdm.a::c),
                  jn.g.optionalFieldOf("orientation", jn.b).forGetter(hdm.a::d)
               )
               .apply($$0, hdm.a::new)
      );

      public a() {
         this(aku.b("shulker"), 0.0F, jn.b);
      }

      public a(cvm $$0) {
         this(gms.e($$0), 0.0F, jn.b);
      }

      @Override
      public MapCodec<hdm.a> a() {
         return a;
      }

      @Override
      public hdo<?> a(gey $$0) {
         return new hdm(new gov($$0), this.c, this.d, gms.b(this.b));
      }
   }
}
