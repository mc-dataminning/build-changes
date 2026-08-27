import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class fvi implements fuz {
   static final Logger c = LogUtils.getLogger();
   public static final Codec<fvi> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               acq.a.fieldOf("resource").forGetter($$0x -> $$0x.d),
               aoi.a(fvi.a.a.listOf()).fieldOf("regions").forGetter($$0x -> $$0x.e),
               Codec.DOUBLE.optionalFieldOf("divisor_x", 1.0).forGetter($$0x -> $$0x.f),
               Codec.DOUBLE.optionalFieldOf("divisor_y", 1.0).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, fvi::new)
   );
   private final acq d;
   private final List<fvi.a> e;
   private final double f;
   private final double g;

   public fvi(acq $$0, List<fvi.a> $$1, double $$2, double $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public void a(akx $$0, fuz.a $$1) {
      acq $$2 = a.a(this.d);
      Optional<akv> $$3 = $$0.getResource($$2);
      if ($$3.isPresent()) {
         fve $$4 = new fve($$2, $$3.get(), this.e.size());

         for (fvi.a $$5 : this.e) {
            $$1.a($$5.b, new fvi.b($$4, $$5, this.f, this.g));
         }
      } else {
         c.warn("Missing sprite: {}", $$2);
      }
   }

   @Override
   public fva a() {
      return fvb.d;
   }

   static record a(acq b, double c, double d, double e, double f) {
      public static final Codec<fvi.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  acq.a.fieldOf("sprite").forGetter(fvi.a::a),
                  Codec.DOUBLE.fieldOf("x").forGetter(fvi.a::b),
                  Codec.DOUBLE.fieldOf("y").forGetter(fvi.a::c),
                  Codec.DOUBLE.fieldOf("width").forGetter(fvi.a::d),
                  Codec.DOUBLE.fieldOf("height").forGetter(fvi.a::e)
               )
               .apply($$0, fvi.a::new)
      );

      public acq a() {
         return this.b;
      }

      public double b() {
         return this.c;
      }

      public double c() {
         return this.d;
      }

      public double d() {
         return this.e;
      }

      public double e() {
         return this.f;
      }
   }

   static class b implements fuz.b {
      private final fve a;
      private final fvi.a b;
      private final double c;
      private final double d;

      b(fve $$0, fvi.a $$1, double $$2, double $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public fup b() {
         try {
            ehk $$0 = this.a.a();
            double $$1 = (double)$$0.a() / this.c;
            double $$2 = (double)$$0.b() / this.d;
            int $$3 = apa.a(this.b.c * $$1);
            int $$4 = apa.a(this.b.d * $$2);
            int $$5 = apa.a(this.b.e * $$1);
            int $$6 = apa.a(this.b.f * $$2);
            ehk $$7 = new ehk(ehk.a.a, $$5, $$6, false);
            $$0.a($$7, $$3, $$4, 0, 0, $$5, $$6, false, false);
            return new fup(this.b.b, new fwg($$5, $$6), $$7, fwe.e);
         } catch (Exception var15) {
            fvi.c.error("Failed to unstitch region {}", this.b.b, var15);
         } finally {
            this.a.b();
         }

         return ful.a();
      }

      @Override
      public void a() {
         this.a.b();
      }
   }
}
