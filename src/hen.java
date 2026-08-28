import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class hen implements her {
   public static final aku a = aku.b("christmas");
   public static final aku b = aku.b("normal");
   public static final aku c = aku.b("trapped");
   public static final aku d = aku.b("ender");
   private final gcm e;
   private final hhy f;
   private final float g;

   public hen(gcm $$0, hhy $$1, float $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   @Override
   public void a(cxf $$0, fgr $$1, gmx $$2, int $$3, int $$4, boolean $$5) {
      fgv $$6 = this.f.a($$2, gnh::d);
      this.e.a(this.g);
      this.e.a($$1, $$6, $$3, $$4);
   }

   public static record a(aku b, float c) implements hev.a {
      public static final MapCodec<hen.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(aku.a.fieldOf("texture").forGetter(hen.a::b), Codec.FLOAT.optionalFieldOf("openness", 0.0F).forGetter(hen.a::c))
               .apply($$0, hen.a::new)
      );

      public a(aku $$0) {
         this($$0, 0.0F);
      }

      @Override
      public MapCodec<hen.a> a() {
         return a;
      }

      @Override
      public hev<?> a(gfy $$0) {
         gcm $$1 = new gcm($$0.a(ggb.V));
         hhy $$2 = gns.e(this.b);
         return new hen($$1, $$2, this.c);
      }
   }
}
