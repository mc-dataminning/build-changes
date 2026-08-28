import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class hdt extends hdq implements hds {
   public static final MapCodec<hdt> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("wobble", true).forGetter(hdq::b), hdt.a.d.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, hdt::new)
   );
   private final hdt.a b;
   private final azh c = azh.a();
   private final hdq.a d;

   public hdt(boolean $$0, hdt.a $$1) {
      super($$0);
      this.b = $$1;
      this.d = this.a(0.9F);
   }

   @Override
   protected float a(cxh $$0, ggy $$1, int $$2, bva $$3) {
      float $$4 = this.b.a($$1, $$0, $$3, this.c);
      long $$5 = $$1.ae();
      if (this.d.a($$5)) {
         this.d.a($$5, $$4);
      }

      return this.d.a();
   }

   @Override
   public MapCodec<hdt> a() {
      return a;
   }

   public static enum a implements azv {
      a("random") {
         @Override
         public float a(ggy $$0, cxh $$1, bva $$2, azh $$3) {
            return $$3.i();
         }
      },
      b("daytime") {
         @Override
         public float a(ggy $$0, cxh $$1, bva $$2, azh $$3) {
            return $$0.f(1.0F);
         }
      },
      c("moon_phase") {
         @Override
         public float a(ggy $$0, cxh $$1, bva $$2, azh $$3) {
            return (float)$$0.at() / 8.0F;
         }
      };

      public static final Codec<hdt.a> d = azv.a(hdt.a::values);
      private final String e;

      a(final String $$0) {
         this.e = $$0;
      }

      @Override
      public String c() {
         return this.e;
      }

      abstract float a(ggy var1, cxh var2, bva var3, azh var4);
   }
}
