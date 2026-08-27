import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class gez implements gep {
   static final Logger c = LogUtils.getLogger();
   public static final Codec<gez> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ahg.a.fieldOf("resource").forGetter($$0x -> $$0x.d),
               atv.a(gez.a.a.listOf()).fieldOf("regions").forGetter($$0x -> $$0x.e),
               Codec.DOUBLE.optionalFieldOf("divisor_x", 1.0).forGetter($$0x -> $$0x.f),
               Codec.DOUBLE.optionalFieldOf("divisor_y", 1.0).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, gez::new)
   );
   private final ahg d;
   private final List<gez.a> e;
   private final double f;
   private final double g;

   public gez(ahg $$0, List<gez.a> $$1, double $$2, double $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public void a(aqh $$0, gep.a $$1) {
      ahg $$2 = a.a(this.d);
      Optional<aqf> $$3 = $$0.getResource($$2);
      if ($$3.isPresent()) {
         gev $$4 = new gev($$2, $$3.get(), this.e.size());

         for (gez.a $$5 : this.e) {
            $$1.a($$5.b, new gez.b($$4, $$5, this.f, this.g));
         }
      } else {
         c.warn("Missing sprite: {}", $$2);
      }
   }

   @Override
   public ger a() {
      return ges.d;
   }

   static record a(ahg b, double c, double d, double e, double f) {
      public static final Codec<gez.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  ahg.a.fieldOf("sprite").forGetter(gez.a::a),
                  Codec.DOUBLE.fieldOf("x").forGetter(gez.a::b),
                  Codec.DOUBLE.fieldOf("y").forGetter(gez.a::c),
                  Codec.DOUBLE.fieldOf("width").forGetter(gez.a::d),
                  Codec.DOUBLE.fieldOf("height").forGetter(gez.a::e)
               )
               .apply($$0, gez.a::new)
      );

      public ahg a() {
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

   static class b implements gep.b {
      private final gev a;
      private final gez.a b;
      private final double c;
      private final double d;

      b(gev $$0, gez.a $$1, double $$2, double $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public gef a(geo $$0) {
         try {
            epa $$1 = this.a.a();
            double $$2 = (double)$$1.a() / this.c;
            double $$3 = (double)$$1.b() / this.d;
            int $$4 = aun.a(this.b.c * $$2);
            int $$5 = aun.a(this.b.d * $$3);
            int $$6 = aun.a(this.b.e * $$2);
            int $$7 = aun.a(this.b.f * $$3);
            epa $$8 = new epa(epa.a.a, $$6, $$7, false);
            $$1.a($$8, $$4, $$5, 0, 0, $$6, $$7, false, false);
            return new gef(this.b.b, new gfx($$6, $$7), $$8, aqj.a);
         } catch (Exception var16) {
            gez.c.error("Failed to unstitch region {}", this.b.b, var16);
         } finally {
            this.a.b();
         }

         return geb.a();
      }

      @Override
      public void a() {
         this.a.b();
      }
   }
}
