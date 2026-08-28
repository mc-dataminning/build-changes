import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class het extends heq implements hes {
   public static final MapCodec<het> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("wobble", true).forGetter(heq::b), het.a.d.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, het::new)
   );
   private final het.a b;
   private final azs c = azs.a();
   private final heq.a d;

   public het(boolean $$0, het.a $$1) {
      super($$0);
      this.b = $$1;
      this.d = this.a(0.9F);
   }

   @Override
   protected float a(cxy $$0, ghz $$1, int $$2, bvs $$3) {
      float $$4 = this.b.a($$1, $$0, $$3, this.c);
      long $$5 = $$1.ae();
      if (this.d.a($$5)) {
         this.d.a($$5, $$4);
      }

      return this.d.a();
   }

   @Override
   public MapCodec<het> a() {
      return a;
   }

   public static enum a implements bag {
      a("random") {
         @Override
         public float a(ghz $$0, cxy $$1, bvs $$2, azs $$3) {
            return $$3.i();
         }
      },
      b("daytime") {
         @Override
         public float a(ghz $$0, cxy $$1, bvs $$2, azs $$3) {
            return $$0.f(1.0F);
         }
      },
      c("moon_phase") {
         @Override
         public float a(ghz $$0, cxy $$1, bvs $$2, azs $$3) {
            return (float)$$0.at() / 8.0F;
         }
      };

      public static final Codec<het.a> d = bag.a(het.a::values);
      private final String e;

      a(final String $$0) {
         this.e = $$0;
      }

      @Override
      public String c() {
         return this.e;
      }

      abstract float a(ghz var1, cxy var2, bvs var3, azs var4);
   }
}
