import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class hct extends hcq implements hcs {
   public static final MapCodec<hct> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("wobble", true).forGetter(hcq::b), hct.a.d.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, hct::new)
   );
   private final hct.a b;
   private final azh c = azh.a();
   private final hcq.a d;

   public hct(boolean $$0, hct.a $$1) {
      super($$0);
      this.b = $$1;
      this.d = this.a(0.9F);
   }

   @Override
   protected float a(cwo $$0, gfy $$1, int $$2, buk $$3) {
      float $$4 = this.b.a($$1, $$0, $$3, this.c);
      long $$5 = $$1.ad();
      if (this.d.a($$5)) {
         this.d.a($$5, $$4);
      }

      return this.d.a();
   }

   @Override
   public MapCodec<hct> a() {
      return a;
   }

   public static enum a implements azv {
      a("random") {
         @Override
         public float a(gfy $$0, cwo $$1, buk $$2, azh $$3) {
            return $$3.i();
         }
      },
      b("daytime") {
         @Override
         public float a(gfy $$0, cwo $$1, buk $$2, azh $$3) {
            return $$0.f(1.0F);
         }
      },
      c("moon_phase") {
         @Override
         public float a(gfy $$0, cwo $$1, buk $$2, azh $$3) {
            return (float)$$0.as() / 8.0F;
         }
      };

      public static final Codec<hct.a> d = azv.a(hct.a::values);
      private final String e;

      a(final String $$0) {
         this.e = $$0;
      }

      @Override
      public String c() {
         return this.e;
      }

      abstract float a(gfy var1, cwo var2, buk var3, azh var4);
   }
}
