import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class hch extends hcn {
   public static final MapCodec<hch> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("wobble", true).forGetter(hcn::b), hch.a.d.fieldOf("target").forGetter(hch::a)).apply($$0, hch::new)
   );
   private final hcn.a b;
   private final hcn.a c;
   private final hch.a d;
   private final azh e = azh.a();

   public hch(boolean $$0, hch.a $$1) {
      super($$0);
      this.b = this.a(0.8F);
      this.c = this.a(0.8F);
      this.d = $$1;
   }

   @Override
   protected float a(cwp $$0, gfy $$1, int $$2, buk $$3) {
      jq $$4 = this.d.a($$1, $$0, $$3);
      long $$5 = $$1.ad();
      return !a($$3, $$4) ? this.a($$2, $$5) : this.a($$3, $$5, $$4.b());
   }

   private float a(int $$0, long $$1) {
      if (this.c.a($$1)) {
         this.c.a($$1, this.e.i());
      }

      float $$2 = this.c.a() + (float)a($$0) / 2.1474836E9F;
      return ayz.b($$2, 1.0F);
   }

   private float a(buk $$0, long $$1, ji $$2) {
      float $$3 = (float)a($$0, $$2);
      float $$4 = a($$0);
      if ($$0 instanceof cox $$5 && $$5.c() && $$5.dW().u().i()) {
         if (this.b.a($$1)) {
            this.b.a($$1, 0.5F - ($$4 - 0.25F));
         }

         float $$6 = $$3 + this.b.a();
         return ayz.b($$6, 1.0F);
      }

      float $$7 = 0.5F - ($$4 - 0.25F - $$3);
      return ayz.b($$7, 1.0F);
   }

   private static boolean a(buk $$0, @Nullable jq $$1) {
      return $$1 != null && $$1.a() == $$0.dW().ai() && !($$1.b().b($$0.du()) < 1.0E-5F);
   }

   private static double a(buk $$0, ji $$1) {
      fba $$2 = fba.b($$1);
      return Math.atan2($$2.c() - $$0.dH(), $$2.a() - $$0.dB()) / (float) (Math.PI * 2);
   }

   private static float a(buk $$0) {
      return ayz.b($$0.dN() / 360.0F, 1.0F);
   }

   private static int a(int $$0) {
      return $$0 * 1327217883;
   }

   protected hch.a a() {
      return this.d;
   }

   public static enum a implements azv {
      a("lodestone") {
         @Nullable
         @Override
         public jq a(gfy $$0, cwp $$1, buk $$2) {
            czj $$3 = $$1.a(kv.ad);
            return $$3 != null ? $$3.a().orElse(null) : null;
         }
      },
      b("spawn") {
         @Nullable
         @Override
         public jq a(gfy $$0, cwp $$1, buk $$2) {
            return cvd.a($$0);
         }
      },
      c("recovery") {
         @Nullable
         @Override
         public jq a(gfy $$0, cwp $$1, buk $$2) {
            return $$2 instanceof cox $$3 ? $$3.gI().orElse(null) : null;
         }
      };

      public static final Codec<hch.a> d = azv.a(hch.a::values);
      private final String e;

      a(final String $$0) {
         this.e = $$0;
      }

      @Override
      public String c() {
         return this.e;
      }

      @Nullable
      abstract jq a(gfy var1, cwp var2, buk var3);
   }
}
