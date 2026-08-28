import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class hcv extends hcs implements hcu {
   public static final MapCodec<hcv> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("wobble", true).forGetter(hcs::b), hcv.a.d.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, hcv::new)
   );
   private final hcv.a b;
   private final azh c = azh.a();
   private final hcs.a d;

   public hcv(boolean $$0, hcv.a $$1) {
      super($$0);
      this.b = $$1;
      this.d = this.a(0.9F);
   }

   @Override
   protected float a(cwq $$0, gga $$1, int $$2, bum $$3) {
      float $$4 = this.b.a($$1, $$0, $$3, this.c);
      long $$5 = $$1.ad();
      if (this.d.a($$5)) {
         this.d.a($$5, $$4);
      }

      return this.d.a();
   }

   @Override
   public MapCodec<hcv> a() {
      return a;
   }

   public static enum a implements azv {
      a("random") {
         @Override
         public float a(gga $$0, cwq $$1, bum $$2, azh $$3) {
            return $$3.i();
         }
      },
      b("daytime") {
         @Override
         public float a(gga $$0, cwq $$1, bum $$2, azh $$3) {
            return $$0.f(1.0F);
         }
      },
      c("moon_phase") {
         @Override
         public float a(gga $$0, cwq $$1, bum $$2, azh $$3) {
            return (float)$$0.as() / 8.0F;
         }
      };

      public static final Codec<hcv.a> d = azv.a(hcv.a::values);
      private final String e;

      a(final String $$0) {
         this.e = $$0;
      }

      @Override
      public String c() {
         return this.e;
      }

      abstract float a(gga var1, cwq var2, bum var3, azh var4);
   }
}
