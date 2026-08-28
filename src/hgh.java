import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class hgh extends hgn {
   public static final MapCodec<hgh> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("wobble", true).forGetter(hgn::b), hgh.a.e.fieldOf("target").forGetter(hgh::a)).apply($$0, hgh::new)
   );
   private final hgn.a b;
   private final hgn.a c;
   private final hgh.a d;
   private final azv e = azv.a();

   public hgh(boolean $$0, hgh.a $$1) {
      super($$0);
      this.b = this.a(0.8F);
      this.c = this.a(0.8F);
      this.d = $$1;
   }

   @Override
   protected float a(cyy $$0, gjr $$1, int $$2, bwd $$3) {
      jd $$4 = this.d.a($$1, $$0, $$3);
      long $$5 = $$1.ae();
      return !a($$3, $$4) ? this.a($$2, $$5) : this.a($$3, $$5, $$4.b());
   }

   private float a(int $$0, long $$1) {
      if (this.c.a($$1)) {
         this.c.a($$1, this.e.i());
      }

      float $$2 = this.c.a() + (float)a($$0) / 2.1474836E9F;
      return azm.b($$2, 1.0F);
   }

   private float a(bwd $$0, long $$1, iu $$2) {
      float $$3 = (float)a($$0, $$2);
      float $$4 = a($$0);
      if ($$0 instanceof cqy $$5 && $$5.gg() && $$5.dV().u().i()) {
         if (this.b.a($$1)) {
            this.b.a($$1, 0.5F - ($$4 - 0.25F));
         }

         float $$6 = $$3 + this.b.a();
         return azm.b($$6, 1.0F);
      }

      float $$7 = 0.5F - ($$4 - 0.25F - $$3);
      return azm.b($$7, 1.0F);
   }

   private static boolean a(bwd $$0, @Nullable jd $$1) {
      return $$1 != null && $$1.a() == $$0.dV().aj() && !($$1.b().b($$0.dt()) < 1.0E-5F);
   }

   private static double a(bwd $$0, iu $$1) {
      fei $$2 = fei.b($$1);
      return Math.atan2($$2.c() - $$0.dG(), $$2.a() - $$0.dA()) / (float) (Math.PI * 2);
   }

   private static float a(bwd $$0) {
      return azm.b($$0.dM() / 360.0F, 1.0F);
   }

   private static int a(int $$0) {
      return $$0 * 1327217883;
   }

   protected hgh.a a() {
      return this.d;
   }

   public static enum a implements bak {
      a("none") {
         @Nullable
         @Override
         public jd a(gjr $$0, cyy $$1, bwd $$2) {
            return null;
         }
      },
      b("lodestone") {
         @Nullable
         @Override
         public jd a(gjr $$0, cyy $$1, bwd $$2) {
            dbs $$3 = $$1.a(kj.ah);
            return $$3 != null ? $$3.a().orElse(null) : null;
         }
      },
      c("spawn") {
         @Override
         public jd a(gjr $$0, cyy $$1, bwd $$2) {
            return jd.a($$0.aj(), $$0.aa());
         }
      },
      d("recovery") {
         @Nullable
         @Override
         public jd a(gjr $$0, cyy $$1, bwd $$2) {
            return $$2 instanceof cqy $$3 ? $$3.gH().orElse(null) : null;
         }
      };

      public static final Codec<hgh.a> e = bak.a(hgh.a::values);
      private final String f;

      a(final String $$0) {
         this.f = $$0;
      }

      @Override
      public String c() {
         return this.f;
      }

      @Nullable
      abstract jd a(gjr var1, cyy var2, bwd var3);
   }
}
