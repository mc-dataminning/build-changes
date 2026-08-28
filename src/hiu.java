import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class hiu extends hja {
   public static final MapCodec<hiu> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("wobble", true).forGetter(hja::b), hiu.a.e.fieldOf("target").forGetter(hiu::a)).apply($$0, hiu::new)
   );
   private final hja.a b;
   private final hja.a c;
   private final hiu.a d;
   private final azz e = azz.a();

   public hiu(boolean $$0, hiu.a $$1) {
      super($$0);
      this.b = this.a(0.8F);
      this.c = this.a(0.8F);
      this.d = $$1;
   }

   @Override
   protected float a(daa $$0, gmd $$1, int $$2, bwv $$3) {
      jf $$4 = this.d.a($$1, $$0, $$3);
      long $$5 = $$1.ae();
      return !a($$3, $$4) ? this.a($$2, $$5) : this.a($$3, $$5, $$4.b());
   }

   private float a(int $$0, long $$1) {
      if (this.c.a($$1)) {
         this.c.a($$1, this.e.i());
      }

      float $$2 = this.c.a() + (float)a($$0) / 2.1474836E9F;
      return azq.b($$2, 1.0F);
   }

   private float a(bwv $$0, long $$1, iw $$2) {
      float $$3 = (float)a($$0, $$2);
      float $$4 = a($$0);
      if ($$0 instanceof crz $$5 && $$5.gh() && $$5.dV().u().i()) {
         if (this.b.a($$1)) {
            this.b.a($$1, 0.5F - ($$4 - 0.25F));
         }

         float $$6 = $$3 + this.b.a();
         return azq.b($$6, 1.0F);
      }

      float $$7 = 0.5F - ($$4 - 0.25F - $$3);
      return azq.b($$7, 1.0F);
   }

   private static boolean a(bwv $$0, @Nullable jf $$1) {
      return $$1 != null && $$1.a() == $$0.dV().aj() && !($$1.b().b($$0.dt()) < 1.0E-5F);
   }

   private static double a(bwv $$0, iw $$1) {
      ffs $$2 = ffs.b($$1);
      return Math.atan2($$2.c() - $$0.dG(), $$2.a() - $$0.dA()) / (float) (Math.PI * 2);
   }

   private static float a(bwv $$0) {
      return azq.b($$0.dM() / 360.0F, 1.0F);
   }

   private static int a(int $$0) {
      return $$0 * 1327217883;
   }

   protected hiu.a a() {
      return this.d;
   }

   public static enum a implements bao {
      a("none") {
         @Nullable
         @Override
         public jf a(gmd $$0, daa $$1, bwv $$2) {
            return null;
         }
      },
      b("lodestone") {
         @Nullable
         @Override
         public jf a(gmd $$0, daa $$1, bwv $$2) {
            dcu $$3 = $$1.a(kl.ah);
            return $$3 != null ? $$3.a().orElse(null) : null;
         }
      },
      c("spawn") {
         @Override
         public jf a(gmd $$0, daa $$1, bwv $$2) {
            return jf.a($$0.aj(), $$0.aa());
         }
      },
      d("recovery") {
         @Nullable
         @Override
         public jf a(gmd $$0, daa $$1, bwv $$2) {
            return $$2 instanceof crz $$3 ? $$3.gI().orElse(null) : null;
         }
      };

      public static final Codec<hiu.a> e = bao.a(hiu.a::values);
      private final String f;

      a(final String $$0) {
         this.f = $$0;
      }

      @Override
      public String c() {
         return this.f;
      }

      @Nullable
      abstract jf a(gmd var1, daa var2, bwv var3);
   }
}
