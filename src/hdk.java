import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class hdk extends hdq {
   public static final MapCodec<hdk> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("wobble", true).forGetter(hdq::b), hdk.a.e.fieldOf("target").forGetter(hdk::a)).apply($$0, hdk::new)
   );
   private final hdq.a b;
   private final hdq.a c;
   private final hdk.a d;
   private final azh e = azh.a();

   public hdk(boolean $$0, hdk.a $$1) {
      super($$0);
      this.b = this.a(0.8F);
      this.c = this.a(0.8F);
      this.d = $$1;
   }

   @Override
   protected float a(cxh $$0, ggy $$1, int $$2, bva $$3) {
      jq $$4 = this.d.a($$1, $$0, $$3);
      long $$5 = $$1.ae();
      return !a($$3, $$4) ? this.a($$2, $$5) : this.a($$3, $$5, $$4.b());
   }

   private float a(int $$0, long $$1) {
      if (this.c.a($$1)) {
         this.c.a($$1, this.e.i());
      }

      float $$2 = this.c.a() + (float)a($$0) / 2.1474836E9F;
      return ayz.b($$2, 1.0F);
   }

   private float a(bva $$0, long $$1, ji $$2) {
      float $$3 = (float)a($$0, $$2);
      float $$4 = a($$0);
      if ($$0 instanceof cpr $$5 && $$5.gj() && $$5.dU().u().i()) {
         if (this.b.a($$1)) {
            this.b.a($$1, 0.5F - ($$4 - 0.25F));
         }

         float $$6 = $$3 + this.b.a();
         return ayz.b($$6, 1.0F);
      }

      float $$7 = 0.5F - ($$4 - 0.25F - $$3);
      return ayz.b($$7, 1.0F);
   }

   private static boolean a(bva $$0, @Nullable jq $$1) {
      return $$1 != null && $$1.a() == $$0.dU().aj() && !($$1.b().b($$0.ds()) < 1.0E-5F);
   }

   private static double a(bva $$0, ji $$1) {
      fbx $$2 = fbx.b($$1);
      return Math.atan2($$2.c() - $$0.dF(), $$2.a() - $$0.dz()) / (float) (Math.PI * 2);
   }

   private static float a(bva $$0) {
      return ayz.b($$0.dL() / 360.0F, 1.0F);
   }

   private static int a(int $$0) {
      return $$0 * 1327217883;
   }

   protected hdk.a a() {
      return this.d;
   }

   public static enum a implements azv {
      a("none") {
         @Nullable
         @Override
         public jq a(ggy $$0, cxh $$1, bva $$2) {
            return null;
         }
      },
      b("lodestone") {
         @Nullable
         @Override
         public jq a(ggy $$0, cxh $$1, bva $$2) {
            czz $$3 = $$1.a(kv.af);
            return $$3 != null ? $$3.a().orElse(null) : null;
         }
      },
      c("spawn") {
         @Override
         public jq a(ggy $$0, cxh $$1, bva $$2) {
            return jq.a($$0.aj(), $$0.aa());
         }
      },
      d("recovery") {
         @Nullable
         @Override
         public jq a(ggy $$0, cxh $$1, bva $$2) {
            return $$2 instanceof cpr $$3 ? $$3.gK().orElse(null) : null;
         }
      };

      public static final Codec<hdk.a> e = azv.a(hdk.a::values);
      private final String f;

      a(final String $$0) {
         this.f = $$0;
      }

      @Override
      public String c() {
         return this.f;
      }

      @Nullable
      abstract jq a(ggy var1, cxh var2, bva var3);
   }
}
