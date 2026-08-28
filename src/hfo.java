import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class hfo implements hfs {
   public static final ald a = ald.b("christmas");
   public static final ald b = ald.b("normal");
   public static final ald c = ald.b("trapped");
   public static final ald d = ald.b("ender");
   private final gdm e;
   private final hiz f;
   private final float g;

   public hfo(gdm $$0, hiz $$1, float $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   @Override
   public void a(cxw $$0, fho $$1, gny $$2, int $$3, int $$4, boolean $$5) {
      fhs $$6 = this.f.a($$2, goi::d);
      this.e.a(this.g);
      this.e.a($$1, $$6, $$3, $$4);
   }

   public static record a(ald b, float c) implements hfw.a {
      public static final MapCodec<hfo.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(ald.a.fieldOf("texture").forGetter(hfo.a::b), Codec.FLOAT.optionalFieldOf("openness", 0.0F).forGetter(hfo.a::c))
               .apply($$0, hfo.a::new)
      );

      public a(ald $$0) {
         this($$0, 0.0F);
      }

      @Override
      public MapCodec<hfo.a> a() {
         return a;
      }

      @Override
      public hfw<?> a(ggz $$0) {
         gdm $$1 = new gdm($$0.a(ghc.X));
         hiz $$2 = got.e(this.b);
         return new hfo($$1, $$2, this.c);
      }
   }
}
