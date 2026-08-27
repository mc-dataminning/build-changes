import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class gmg implements glw {
   static final Logger c = LogUtils.getLogger();
   public static final Codec<gmg> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ajv.a.fieldOf("resource").forGetter($$0x -> $$0x.d),
               awu.a(gmg.a.a.listOf()).fieldOf("regions").forGetter($$0x -> $$0x.e),
               Codec.DOUBLE.optionalFieldOf("divisor_x", 1.0).forGetter($$0x -> $$0x.f),
               Codec.DOUBLE.optionalFieldOf("divisor_y", 1.0).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, gmg::new)
   );
   private final ajv d;
   private final List<gmg.a> e;
   private final double f;
   private final double g;

   public gmg(ajv $$0, List<gmg.a> $$1, double $$2, double $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public void a(ate $$0, glw.a $$1) {
      ajv $$2 = a.a(this.d);
      Optional<atc> $$3 = $$0.getResource($$2);
      if ($$3.isPresent()) {
         gmc $$4 = new gmc($$2, $$3.get(), this.e.size());

         for (gmg.a $$5 : this.e) {
            $$1.a($$5.b, new gmg.b($$4, $$5, this.f, this.g));
         }
      } else {
         c.warn("Missing sprite: {}", $$2);
      }
   }

   @Override
   public gly a() {
      return glz.d;
   }

   static record a(ajv b, double c, double d, double e, double f) {
      public static final Codec<gmg.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  ajv.a.fieldOf("sprite").forGetter(gmg.a::a),
                  Codec.DOUBLE.fieldOf("x").forGetter(gmg.a::b),
                  Codec.DOUBLE.fieldOf("y").forGetter(gmg.a::c),
                  Codec.DOUBLE.fieldOf("width").forGetter(gmg.a::d),
                  Codec.DOUBLE.fieldOf("height").forGetter(gmg.a::e)
               )
               .apply($$0, gmg.a::new)
      );

      public ajv a() {
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

   static class b implements glw.b {
      private final gmc a;
      private final gmg.a b;
      private final double c;
      private final double d;

      b(gmc $$0, gmg.a $$1, double $$2, double $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public glm a(glv $$0) {
         try {
            evs $$1 = this.a.a();
            double $$2 = (double)$$1.a() / this.c;
            double $$3 = (double)$$1.b() / this.d;
            int $$4 = axm.a(this.b.c * $$2);
            int $$5 = axm.a(this.b.d * $$3);
            int $$6 = axm.a(this.b.e * $$2);
            int $$7 = axm.a(this.b.f * $$3);
            evs $$8 = new evs(evs.a.a, $$6, $$7, false);
            $$1.a($$8, $$4, $$5, 0, 0, $$6, $$7, false, false);
            return new glm(this.b.b, new gne($$6, $$7), $$8, atg.a);
         } catch (Exception var16) {
            gmg.c.error("Failed to unstitch region {}", this.b.b, var16);
         } finally {
            this.a.b();
         }

         return gli.a();
      }

      @Override
      public void a() {
         this.a.b();
      }
   }
}
