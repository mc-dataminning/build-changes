import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class his extends hiy {
   public static final MapCodec<his> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("wobble", true).forGetter(hiy::b), his.a.e.fieldOf("target").forGetter(his::a)).apply($$0, his::new)
   );
   private final hiy.a b;
   private final hiy.a c;
   private final his.a d;
   private final azx e = azx.a();

   public his(boolean $$0, his.a $$1) {
      super($$0);
      this.b = this.a(0.8F);
      this.c = this.a(0.8F);
      this.d = $$1;
   }

   @Override
   protected float a(czy $$0, gmb $$1, int $$2, bwt $$3) {
      je $$4 = this.d.a($$1, $$0, $$3);
      long $$5 = $$1.ae();
      return !a($$3, $$4) ? this.a($$2, $$5) : this.a($$3, $$5, $$4.b());
   }

   private float a(int $$0, long $$1) {
      if (this.c.a($$1)) {
         this.c.a($$1, this.e.i());
      }

      float $$2 = this.c.a() + (float)a($$0) / 2.1474836E9F;
      return azo.b($$2, 1.0F);
   }

   private float a(bwt $$0, long $$1, iv $$2) {
      float $$3 = (float)a($$0, $$2);
      float $$4 = a($$0);
      if ($$0 instanceof crx $$5 && $$5.gh() && $$5.dV().u().i()) {
         if (this.b.a($$1)) {
            this.b.a($$1, 0.5F - ($$4 - 0.25F));
         }

         float $$6 = $$3 + this.b.a();
         return azo.b($$6, 1.0F);
      }

      float $$7 = 0.5F - ($$4 - 0.25F - $$3);
      return azo.b($$7, 1.0F);
   }

   private static boolean a(bwt $$0, @Nullable je $$1) {
      return $$1 != null && $$1.a() == $$0.dV().aj() && !($$1.b().b($$0.dt()) < 1.0E-5F);
   }

   private static double a(bwt $$0, iv $$1) {
      ffq $$2 = ffq.b($$1);
      return Math.atan2($$2.c() - $$0.dG(), $$2.a() - $$0.dA()) / (float) (Math.PI * 2);
   }

   private static float a(bwt $$0) {
      return azo.b($$0.dM() / 360.0F, 1.0F);
   }

   private static int a(int $$0) {
      return $$0 * 1327217883;
   }

   protected his.a a() {
      return this.d;
   }

   public static enum a implements bam {
      a("none") {
         @Nullable
         @Override
         public je a(gmb $$0, czy $$1, bwt $$2) {
            return null;
         }
      },
      b("lodestone") {
         @Nullable
         @Override
         public je a(gmb $$0, czy $$1, bwt $$2) {
            dcs $$3 = $$1.a(kk.ah);
            return $$3 != null ? $$3.a().orElse(null) : null;
         }
      },
      c("spawn") {
         @Override
         public je a(gmb $$0, czy $$1, bwt $$2) {
            return je.a($$0.aj(), $$0.aa());
         }
      },
      d("recovery") {
         @Nullable
         @Override
         public je a(gmb $$0, czy $$1, bwt $$2) {
            return $$2 instanceof crx $$3 ? $$3.gI().orElse(null) : null;
         }
      };

      public static final Codec<his.a> e = bam.a(his.a::values);
      private final String f;

      a(final String $$0) {
         this.f = $$0;
      }

      @Override
      public String c() {
         return this.f;
      }

      @Nullable
      abstract je a(gmb var1, czy var2, bwt var3);
   }
}
