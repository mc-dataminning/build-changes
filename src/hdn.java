import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class hdn implements hdr {
   public static final akv a = akv.b("christmas");
   public static final akv b = akv.b("normal");
   public static final akv c = akv.b("trapped");
   public static final akv d = akv.b("ender");
   private final gbn e;
   private final hgy f;
   private final float g;

   public hdn(gbn $$0, hgy $$1, float $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   @Override
   public void a(cwm $$0, fft $$1, glx $$2, int $$3, int $$4, boolean $$5) {
      ffx $$6 = this.f.a($$2, gmh::d);
      this.e.a(this.g);
      this.e.a($$1, $$6, $$3, $$4);
   }

   public static record a(akv b, float c) implements hdv.a {
      public static final MapCodec<hdn.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(akv.a.fieldOf("texture").forGetter(hdn.a::b), Codec.FLOAT.optionalFieldOf("openness", 0.0F).forGetter(hdn.a::c))
               .apply($$0, hdn.a::new)
      );

      public a(akv $$0) {
         this($$0, 0.0F);
      }

      @Override
      public MapCodec<hdn.a> a() {
         return a;
      }

      @Override
      public hdv<?> a(gey $$0) {
         gbn $$1 = new gbn($$0.a(gfb.V));
         hgy $$2 = gms.e(this.b);
         return new hdn($$1, $$2, this.c);
      }
   }
}
