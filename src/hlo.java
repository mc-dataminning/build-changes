import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public record hlo(ali c, List<hlo.a> d, double e, double f) implements hlf {
   static final Logger g = LogUtils.getLogger();
   public static final MapCodec<hlo> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ali.a.fieldOf("resource").forGetter(hlo::b),
               ayw.b(hlo.a.a.listOf()).fieldOf("regions").forGetter(hlo::c),
               Codec.DOUBLE.optionalFieldOf("divisor_x", 1.0).forGetter(hlo::d),
               Codec.DOUBLE.optionalFieldOf("divisor_y", 1.0).forGetter(hlo::e)
            )
            .apply($$0, hlo::new)
   );

   @Override
   public void a(avf $$0, hlf.a $$1) {
      ali $$2 = a.a(this.c);
      Optional<avd> $$3 = $$0.getResource($$2);
      if ($$3.isPresent()) {
         hlk $$4 = new hlk($$2, $$3.get(), this.d.size());

         for (hlo.a $$5 : this.d) {
            $$1.a($$5.b, new hlo.b($$4, $$5, this.e, this.f));
         }
      } else {
         g.warn("Missing sprite: {}", $$2);
      }
   }

   @Override
   public MapCodec<hlo> a() {
      return b;
   }

   public ali b() {
      return this.c;
   }

   public List<hlo.a> c() {
      return this.d;
   }

   public double d() {
      return this.e;
   }

   public double e() {
      return this.f;
   }

   public static record a(ali b, double c, double d, double e, double f) {
      public static final Codec<hlo.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  ali.a.fieldOf("sprite").forGetter(hlo.a::a),
                  Codec.DOUBLE.fieldOf("x").forGetter(hlo.a::b),
                  Codec.DOUBLE.fieldOf("y").forGetter(hlo.a::c),
                  Codec.DOUBLE.fieldOf("width").forGetter(hlo.a::d),
                  Codec.DOUBLE.fieldOf("height").forGetter(hlo.a::e)
               )
               .apply($$0, hlo.a::new)
      );

      public ali a() {
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

   static class b implements hlf.b {
      private final hlk a;
      private final hlo.a b;
      private final double c;
      private final double d;

      b(hlk $$0, hlo.a $$1, double $$2, double $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public hku a(hle $$0) {
         try {
            fkg $$1 = this.a.a();
            double $$2 = (double)$$1.a() / this.c;
            double $$3 = (double)$$1.b() / this.d;
            int $$4 = azo.a(this.b.c * $$2);
            int $$5 = azo.a(this.b.d * $$3);
            int $$6 = azo.a(this.b.e * $$2);
            int $$7 = azo.a(this.b.f * $$3);
            fkg $$8 = new fkg(fkg.a.a, $$6, $$7, false);
            $$1.a($$8, $$4, $$5, 0, 0, $$6, $$7, false, false);
            return new hku(this.b.b, new hmo($$6, $$7), $$8, avh.a);
         } catch (Exception var16) {
            hlo.g.error("Failed to unstitch region {}", this.b.b, var16);
         } finally {
            this.a.b();
         }

         return hkp.b();
      }

      @Override
      public void a() {
         this.a.b();
      }
   }
}
