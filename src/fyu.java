import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class fyu implements fyk {
   static final Logger c = LogUtils.getLogger();
   public static final Codec<fyu> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               aep.a.fieldOf("resource").forGetter($$0x -> $$0x.d),
               aqw.a(fyu.a.a.listOf()).fieldOf("regions").forGetter($$0x -> $$0x.e),
               Codec.DOUBLE.optionalFieldOf("divisor_x", 1.0).forGetter($$0x -> $$0x.f),
               Codec.DOUBLE.optionalFieldOf("divisor_y", 1.0).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, fyu::new)
   );
   private final aep d;
   private final List<fyu.a> e;
   private final double f;
   private final double g;

   public fyu(aep $$0, List<fyu.a> $$1, double $$2, double $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public void a(ank $$0, fyk.a $$1) {
      aep $$2 = a.a(this.d);
      Optional<ani> $$3 = $$0.getResource($$2);
      if ($$3.isPresent()) {
         fyq $$4 = new fyq($$2, $$3.get(), this.e.size());

         for (fyu.a $$5 : this.e) {
            $$1.a($$5.b, new fyu.b($$4, $$5, this.f, this.g));
         }
      } else {
         c.warn("Missing sprite: {}", $$2);
      }
   }

   @Override
   public fym a() {
      return fyn.d;
   }

   static record a(aep b, double c, double d, double e, double f) {
      public static final Codec<fyu.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  aep.a.fieldOf("sprite").forGetter(fyu.a::a),
                  Codec.DOUBLE.fieldOf("x").forGetter(fyu.a::b),
                  Codec.DOUBLE.fieldOf("y").forGetter(fyu.a::c),
                  Codec.DOUBLE.fieldOf("width").forGetter(fyu.a::d),
                  Codec.DOUBLE.fieldOf("height").forGetter(fyu.a::e)
               )
               .apply($$0, fyu.a::new)
      );

      public aep a() {
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

   static class b implements fyk.b {
      private final fyq a;
      private final fyu.a b;
      private final double c;
      private final double d;

      b(fyq $$0, fyu.a $$1, double $$2, double $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public fya a(fyj $$0) {
         try {
            eki $$1 = this.a.a();
            double $$2 = (double)$$1.a() / this.c;
            double $$3 = (double)$$1.b() / this.d;
            int $$4 = aro.a(this.b.c * $$2);
            int $$5 = aro.a(this.b.d * $$3);
            int $$6 = aro.a(this.b.e * $$2);
            int $$7 = aro.a(this.b.f * $$3);
            eki $$8 = new eki(eki.a.a, $$6, $$7, false);
            $$1.a($$8, $$4, $$5, 0, 0, $$6, $$7, false, false);
            return new fya(this.b.b, new fzt($$6, $$7), $$8, anm.a);
         } catch (Exception var16) {
            fyu.c.error("Failed to unstitch region {}", this.b.b, var16);
         } finally {
            this.a.b();
         }

         return fxw.a();
      }

      @Override
      public void a() {
         this.a.b();
      }
   }
}
