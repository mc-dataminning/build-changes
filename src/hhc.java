import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class hhc extends hhi {
   public static final MapCodec<hhc> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("wobble", true).forGetter(hhi::b), hhc.a.e.fieldOf("target").forGetter(hhc::a)).apply($$0, hhc::new)
   );
   private final hhi.a b;
   private final hhi.a c;
   private final hhc.a d;
   private final azv e = azv.a();

   public hhc(boolean $$0, hhc.a $$1) {
      super($$0);
      this.b = this.a(0.8F);
      this.c = this.a(0.8F);
      this.d = $$1;
   }

   @Override
   protected float a(czk $$0, gkl $$1, int $$2, bwi $$3) {
      je $$4 = this.d.a($$1, $$0, $$3);
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

   private float a(bwi $$0, long $$1, iv $$2) {
      float $$3 = (float)a($$0, $$2);
      float $$4 = a($$0);
      if ($$0 instanceof crj $$5 && $$5.gg() && $$5.dU().u().i()) {
         if (this.b.a($$1)) {
            this.b.a($$1, 0.5F - ($$4 - 0.25F));
         }

         float $$6 = $$3 + this.b.a();
         return azm.b($$6, 1.0F);
      }

      float $$7 = 0.5F - ($$4 - 0.25F - $$3);
      return azm.b($$7, 1.0F);
   }

   private static boolean a(bwi $$0, @Nullable je $$1) {
      return $$1 != null && $$1.a() == $$0.dU().aj() && !($$1.b().b($$0.ds()) < 1.0E-5F);
   }

   private static double a(bwi $$0, iv $$1) {
      fex $$2 = fex.b($$1);
      return Math.atan2($$2.c() - $$0.dF(), $$2.a() - $$0.dz()) / (float) (Math.PI * 2);
   }

   private static float a(bwi $$0) {
      return azm.b($$0.dL() / 360.0F, 1.0F);
   }

   private static int a(int $$0) {
      return $$0 * 1327217883;
   }

   protected hhc.a a() {
      return this.d;
   }

   public static enum a implements bak {
      a("none") {
         @Nullable
         @Override
         public je a(gkl $$0, czk $$1, bwi $$2) {
            return null;
         }
      },
      b("lodestone") {
         @Nullable
         @Override
         public je a(gkl $$0, czk $$1, bwi $$2) {
            dce $$3 = $$1.a(kk.ah);
            return $$3 != null ? $$3.a().orElse(null) : null;
         }
      },
      c("spawn") {
         @Override
         public je a(gkl $$0, czk $$1, bwi $$2) {
            return je.a($$0.aj(), $$0.aa());
         }
      },
      d("recovery") {
         @Nullable
         @Override
         public je a(gkl $$0, czk $$1, bwi $$2) {
            return $$2 instanceof crj $$3 ? $$3.gH().orElse(null) : null;
         }
      };

      public static final Codec<hhc.a> e = bak.a(hhc.a::values);
      private final String f;

      a(final String $$0) {
         this.f = $$0;
      }

      @Override
      public String c() {
         return this.f;
      }

      @Nullable
      abstract je a(gkl var1, czk var2, bwi var3);
   }
}
