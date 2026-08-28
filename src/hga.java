import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class hga extends hfx implements hfz {
   public static final MapCodec<hga> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("wobble", true).forGetter(hfx::b), hga.a.d.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, hga::new)
   );
   private final hga.a b;
   private final azt c = azt.a();
   private final hfx.a d;

   public hga(boolean $$0, hga.a $$1) {
      super($$0);
      this.b = $$1;
      this.d = this.a(0.9F);
   }

   @Override
   protected float a(cys $$0, gjd $$1, int $$2, bwa $$3) {
      float $$4 = this.b.a($$1, $$0, $$3, this.c);
      long $$5 = $$1.ae();
      if (this.d.a($$5)) {
         this.d.a($$5, $$4);
      }

      return this.d.a();
   }

   @Override
   public MapCodec<hga> a() {
      return a;
   }

   public static enum a implements bai {
      a("random") {
         @Override
         public float a(gjd $$0, cys $$1, bwa $$2, azt $$3) {
            return $$3.i();
         }
      },
      b("daytime") {
         @Override
         public float a(gjd $$0, cys $$1, bwa $$2, azt $$3) {
            return $$0.f(1.0F);
         }
      },
      c("moon_phase") {
         @Override
         public float a(gjd $$0, cys $$1, bwa $$2, azt $$3) {
            return (float)$$0.at() / 8.0F;
         }
      };

      public static final Codec<hga.a> d = bai.a(hga.a::values);
      private final String e;

      a(final String $$0) {
         this.e = $$0;
      }

      @Override
      public String c() {
         return this.e;
      }

      abstract float a(gjd var1, cys var2, bwa var3, azt var4);
   }
}
