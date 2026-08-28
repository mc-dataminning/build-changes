import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class hdh implements hdk {
   public static final aku a = aku.b("christmas");
   public static final aku b = aku.b("normal");
   public static final aku c = aku.b("trapped");
   public static final aku d = aku.b("ender");
   private final gbn e;
   private final hgs f;
   private final float g;

   public hdh(gbn $$0, hgs $$1, float $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   @Override
   public void a(cwn $$0, ffu $$1, glx $$2, int $$3, int $$4, boolean $$5) {
      ffy $$6 = this.f.a($$2, gmh::d);
      this.e.a(this.g);
      this.e.a($$1, $$6, $$3, $$4);
   }

   public static record a(aku b, float c) implements hdo.a {
      public static final MapCodec<hdh.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(aku.a.fieldOf("texture").forGetter(hdh.a::b), Codec.FLOAT.optionalFieldOf("openness", 0.0F).forGetter(hdh.a::c))
               .apply($$0, hdh.a::new)
      );

      public a(aku $$0) {
         this($$0, 0.0F);
      }

      @Override
      public MapCodec<hdh.a> a() {
         return a;
      }

      @Override
      public hdo<?> a(gey $$0) {
         gbn $$1 = new gbn($$0.a(gfb.V));
         hgs $$2 = gms.c(this.b);
         return new hdh($$1, $$2, this.c);
      }
   }
}
