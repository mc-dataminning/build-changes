import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class hhl extends hhi implements hhk {
   public static final MapCodec<hhl> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("wobble", true).forGetter(hhi::b), hhl.a.d.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, hhl::new)
   );
   private final hhl.a b;
   private final azv c = azv.a();
   private final hhi.a d;

   public hhl(boolean $$0, hhl.a $$1) {
      super($$0);
      this.b = $$1;
      this.d = this.a(0.9F);
   }

   @Override
   protected float a(czk $$0, gkl $$1, int $$2, bwi $$3) {
      float $$4 = this.b.a($$1, $$0, $$3, this.c);
      long $$5 = $$1.ae();
      if (this.d.a($$5)) {
         this.d.a($$5, $$4);
      }

      return this.d.a();
   }

   @Override
   public MapCodec<hhl> a() {
      return a;
   }

   public static enum a implements bak {
      a("random") {
         @Override
         public float a(gkl $$0, czk $$1, bwi $$2, azv $$3) {
            return $$3.i();
         }
      },
      b("daytime") {
         @Override
         public float a(gkl $$0, czk $$1, bwi $$2, azv $$3) {
            return $$0.f(1.0F);
         }
      },
      c("moon_phase") {
         @Override
         public float a(gkl $$0, czk $$1, bwi $$2, azv $$3) {
            return (float)$$0.at() / 8.0F;
         }
      };

      public static final Codec<hhl.a> d = bak.a(hhl.a::values);
      private final String e;

      a(final String $$0) {
         this.e = $$0;
      }

      @Override
      public String c() {
         return this.e;
      }

      abstract float a(gkl var1, czk var2, bwi var3, azv var4);
   }
}
