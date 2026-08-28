import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class hcu extends hcr implements hct {
   public static final MapCodec<hcu> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("wobble", true).forGetter(hcr::b), hcu.a.d.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, hcu::new)
   );
   private final hcu.a b;
   private final azh c = azh.a();
   private final hcr.a d;

   public hcu(boolean $$0, hcu.a $$1) {
      super($$0);
      this.b = $$1;
      this.d = this.a(0.9F);
   }

   @Override
   protected float a(cwp $$0, gfz $$1, int $$2, bul $$3) {
      float $$4 = this.b.a($$1, $$0, $$3, this.c);
      long $$5 = $$1.ad();
      if (this.d.a($$5)) {
         this.d.a($$5, $$4);
      }

      return this.d.a();
   }

   @Override
   public MapCodec<hcu> a() {
      return a;
   }

   public static enum a implements azv {
      a("random") {
         @Override
         public float a(gfz $$0, cwp $$1, bul $$2, azh $$3) {
            return $$3.i();
         }
      },
      b("daytime") {
         @Override
         public float a(gfz $$0, cwp $$1, bul $$2, azh $$3) {
            return $$0.f(1.0F);
         }
      },
      c("moon_phase") {
         @Override
         public float a(gfz $$0, cwp $$1, bul $$2, azh $$3) {
            return (float)$$0.as() / 8.0F;
         }
      };

      public static final Codec<hcu.a> d = azv.a(hcu.a::values);
      private final String e;

      a(final String $$0) {
         this.e = $$0;
      }

      @Override
      public String c() {
         return this.e;
      }

      abstract float a(gfz var1, cwp var2, bul var3, azh var4);
   }
}
