import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class hek extends heq {
   public static final MapCodec<hek> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("wobble", true).forGetter(heq::b), hek.a.e.fieldOf("target").forGetter(hek::a)).apply($$0, hek::new)
   );
   private final heq.a b;
   private final heq.a c;
   private final hek.a d;
   private final azs e = azs.a();

   public hek(boolean $$0, hek.a $$1) {
      super($$0);
      this.b = this.a(0.8F);
      this.c = this.a(0.8F);
      this.d = $$1;
   }

   @Override
   protected float a(cxy $$0, ghz $$1, int $$2, bvs $$3) {
      jr $$4 = this.d.a($$1, $$0, $$3);
      long $$5 = $$1.ae();
      return !a($$3, $$4) ? this.a($$2, $$5) : this.a($$3, $$5, $$4.b());
   }

   private float a(int $$0, long $$1) {
      if (this.c.a($$1)) {
         this.c.a($$1, this.e.i());
      }

      float $$2 = this.c.a() + (float)a($$0) / 2.1474836E9F;
      return azk.b($$2, 1.0F);
   }

   private float a(bvs $$0, long $$1, jj $$2) {
      float $$3 = (float)a($$0, $$2);
      float $$4 = a($$0);
      if ($$0 instanceof cqi $$5 && $$5.gg() && $$5.dV().u().i()) {
         if (this.b.a($$1)) {
            this.b.a($$1, 0.5F - ($$4 - 0.25F));
         }

         float $$6 = $$3 + this.b.a();
         return azk.b($$6, 1.0F);
      }

      float $$7 = 0.5F - ($$4 - 0.25F - $$3);
      return azk.b($$7, 1.0F);
   }

   private static boolean a(bvs $$0, @Nullable jr $$1) {
      return $$1 != null && $$1.a() == $$0.dV().aj() && !($$1.b().b($$0.dt()) < 1.0E-5F);
   }

   private static double a(bvs $$0, jj $$1) {
      fcu $$2 = fcu.b($$1);
      return Math.atan2($$2.c() - $$0.dG(), $$2.a() - $$0.dA()) / (float) (Math.PI * 2);
   }

   private static float a(bvs $$0) {
      return azk.b($$0.dM() / 360.0F, 1.0F);
   }

   private static int a(int $$0) {
      return $$0 * 1327217883;
   }

   protected hek.a a() {
      return this.d;
   }

   public static enum a implements bag {
      a("none") {
         @Nullable
         @Override
         public jr a(ghz $$0, cxy $$1, bvs $$2) {
            return null;
         }
      },
      b("lodestone") {
         @Nullable
         @Override
         public jr a(ghz $$0, cxy $$1, bvs $$2) {
            dap $$3 = $$1.a(kx.af);
            return $$3 != null ? $$3.a().orElse(null) : null;
         }
      },
      c("spawn") {
         @Override
         public jr a(ghz $$0, cxy $$1, bvs $$2) {
            return jr.a($$0.aj(), $$0.aa());
         }
      },
      d("recovery") {
         @Nullable
         @Override
         public jr a(ghz $$0, cxy $$1, bvs $$2) {
            return $$2 instanceof cqi $$3 ? $$3.gH().orElse(null) : null;
         }
      };

      public static final Codec<hek.a> e = bag.a(hek.a::values);
      private final String f;

      a(final String $$0) {
         this.f = $$0;
      }

      @Override
      public String c() {
         return this.f;
      }

      @Nullable
      abstract jr a(ghz var1, cxy var2, bvs var3);
   }
}
