import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class hii extends hio {
   public static final MapCodec<hii> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("wobble", true).forGetter(hio::b), hii.a.e.fieldOf("target").forGetter(hii::a)).apply($$0, hii::new)
   );
   private final hio.a b;
   private final hio.a c;
   private final hii.a d;
   private final bai e = bai.a();

   public hii(boolean $$0, hii.a $$1) {
      super($$0);
      this.b = this.a(0.8F);
      this.c = this.a(0.8F);
      this.d = $$1;
   }

   @Override
   protected float a(dak $$0, glo $$1, int $$2, bxe $$3) {
      jf $$4 = this.d.a($$1, $$0, $$3);
      long $$5 = $$1.ae();
      return !a($$3, $$4) ? this.a($$2, $$5) : this.a($$3, $$5, $$4.b());
   }

   private float a(int $$0, long $$1) {
      if (this.c.a($$1)) {
         this.c.a($$1, this.e.i());
      }

      float $$2 = this.c.a() + (float)a($$0) / 2.1474836E9F;
      return azz.b($$2, 1.0F);
   }

   private float a(bxe $$0, long $$1, iw $$2) {
      float $$3 = (float)a($$0, $$2);
      float $$4 = a($$0);
      if ($$0 instanceof csi $$5 && $$5.gh() && $$5.dV().u().i()) {
         if (this.b.a($$1)) {
            this.b.a($$1, 0.5F - ($$4 - 0.25F));
         }

         float $$6 = $$3 + this.b.a();
         return azz.b($$6, 1.0F);
      }

      float $$7 = 0.5F - ($$4 - 0.25F - $$3);
      return azz.b($$7, 1.0F);
   }

   private static boolean a(bxe $$0, @Nullable jf $$1) {
      return $$1 != null && $$1.a() == $$0.dV().aj() && !($$1.b().b($$0.dt()) < 1.0E-5F);
   }

   private static double a(bxe $$0, iw $$1) {
      fgc $$2 = fgc.b($$1);
      return Math.atan2($$2.c() - $$0.dG(), $$2.a() - $$0.dA()) / (float) (Math.PI * 2);
   }

   private static float a(bxe $$0) {
      return azz.b($$0.dM() / 360.0F, 1.0F);
   }

   private static int a(int $$0) {
      return $$0 * 1327217883;
   }

   protected hii.a a() {
      return this.d;
   }

   public static enum a implements bax {
      a("none") {
         @Nullable
         @Override
         public jf a(glo $$0, dak $$1, bxe $$2) {
            return null;
         }
      },
      b("lodestone") {
         @Nullable
         @Override
         public jf a(glo $$0, dak $$1, bxe $$2) {
            dde $$3 = $$1.a(kl.ah);
            return $$3 != null ? $$3.a().orElse(null) : null;
         }
      },
      c("spawn") {
         @Override
         public jf a(glo $$0, dak $$1, bxe $$2) {
            return jf.a($$0.aj(), $$0.aa());
         }
      },
      d("recovery") {
         @Nullable
         @Override
         public jf a(glo $$0, dak $$1, bxe $$2) {
            return $$2 instanceof csi $$3 ? $$3.gJ().orElse(null) : null;
         }
      };

      public static final Codec<hii.a> e = bax.a(hii.a::values);
      private final String f;

      a(final String $$0) {
         this.f = $$0;
      }

      @Override
      public String c() {
         return this.f;
      }

      @Nullable
      abstract jf a(glo var1, dak var2, bxe var3);
   }
}
