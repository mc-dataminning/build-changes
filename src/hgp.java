import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class hgp extends hgv {
   public static final MapCodec<hgp> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("wobble", true).forGetter(hgv::b), hgp.a.e.fieldOf("target").forGetter(hgp::a)).apply($$0, hgp::new)
   );
   private final hgv.a b;
   private final hgv.a c;
   private final hgp.a d;
   private final azv e = azv.a();

   public hgp(boolean $$0, hgp.a $$1) {
      super($$0);
      this.b = this.a(0.8F);
      this.c = this.a(0.8F);
      this.d = $$1;
   }

   @Override
   protected float a(czd $$0, gjz $$1, int $$2, bwf $$3) {
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

   private float a(bwf $$0, long $$1, iu $$2) {
      float $$3 = (float)a($$0, $$2);
      float $$4 = a($$0);
      if ($$0 instanceof crc $$5 && $$5.gh() && $$5.dV().u().i()) {
         if (this.b.a($$1)) {
            this.b.a($$1, 0.5F - ($$4 - 0.25F));
         }

         float $$6 = $$3 + this.b.a();
         return azm.b($$6, 1.0F);
      }

      float $$7 = 0.5F - ($$4 - 0.25F - $$3);
      return azm.b($$7, 1.0F);
   }

   private static boolean a(bwf $$0, @Nullable jd $$1) {
      return $$1 != null && $$1.a() == $$0.dV().aj() && !($$1.b().b($$0.dt()) < 1.0E-5F);
   }

   private static double a(bwf $$0, iu $$1) {
      feq $$2 = feq.b($$1);
      return Math.atan2($$2.c() - $$0.dG(), $$2.a() - $$0.dA()) / (float) (Math.PI * 2);
   }

   private static float a(bwf $$0) {
      return azm.b($$0.dM() / 360.0F, 1.0F);
   }

   private static int a(int $$0) {
      return $$0 * 1327217883;
   }

   protected hgp.a a() {
      return this.d;
   }

   public static enum a implements bak {
      a("none") {
         @Nullable
         @Override
         public jd a(gjz $$0, czd $$1, bwf $$2) {
            return null;
         }
      },
      b("lodestone") {
         @Nullable
         @Override
         public jd a(gjz $$0, czd $$1, bwf $$2) {
            dbx $$3 = $$1.a(kj.ah);
            return $$3 != null ? $$3.a().orElse(null) : null;
         }
      },
      c("spawn") {
         @Override
         public jd a(gjz $$0, czd $$1, bwf $$2) {
            return jd.a($$0.aj(), $$0.aa());
         }
      },
      d("recovery") {
         @Nullable
         @Override
         public jd a(gjz $$0, czd $$1, bwf $$2) {
            return $$2 instanceof crc $$3 ? $$3.gI().orElse(null) : null;
         }
      };

      public static final Codec<hgp.a> e = bak.a(hgp.a::values);
      private final String f;

      a(final String $$0) {
         this.f = $$0;
      }

      @Override
      public String c() {
         return this.f;
      }

      @Nullable
      abstract jd a(gjz var1, czd var2, bwf var3);
   }
}
