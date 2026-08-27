import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class gfb implements ger {
   static final Logger c = LogUtils.getLogger();
   public static final Codec<gfb> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ahg.a.fieldOf("resource").forGetter($$0x -> $$0x.d),
               atw.a(gfb.a.a.listOf()).fieldOf("regions").forGetter($$0x -> $$0x.e),
               Codec.DOUBLE.optionalFieldOf("divisor_x", 1.0).forGetter($$0x -> $$0x.f),
               Codec.DOUBLE.optionalFieldOf("divisor_y", 1.0).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, gfb::new)
   );
   private final ahg d;
   private final List<gfb.a> e;
   private final double f;
   private final double g;

   public gfb(ahg $$0, List<gfb.a> $$1, double $$2, double $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public void a(aqi $$0, ger.a $$1) {
      ahg $$2 = a.a(this.d);
      Optional<aqg> $$3 = $$0.getResource($$2);
      if ($$3.isPresent()) {
         gex $$4 = new gex($$2, $$3.get(), this.e.size());

         for (gfb.a $$5 : this.e) {
            $$1.a($$5.b, new gfb.b($$4, $$5, this.f, this.g));
         }
      } else {
         c.warn("Missing sprite: {}", $$2);
      }
   }

   @Override
   public get a() {
      return geu.d;
   }

   static record a(ahg b, double c, double d, double e, double f) {
      public static final Codec<gfb.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  ahg.a.fieldOf("sprite").forGetter(gfb.a::a),
                  Codec.DOUBLE.fieldOf("x").forGetter(gfb.a::b),
                  Codec.DOUBLE.fieldOf("y").forGetter(gfb.a::c),
                  Codec.DOUBLE.fieldOf("width").forGetter(gfb.a::d),
                  Codec.DOUBLE.fieldOf("height").forGetter(gfb.a::e)
               )
               .apply($$0, gfb.a::new)
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

   static class b implements ger.b {
      private final gex a;
      private final gfb.a b;
      private final double c;
      private final double d;

      b(gex $$0, gfb.a $$1, double $$2, double $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public geh a(geq $$0) {
         try {
            epc $$1 = this.a.a();
            double $$2 = (double)$$1.a() / this.c;
            double $$3 = (double)$$1.b() / this.d;
            int $$4 = auo.a(this.b.c * $$2);
            int $$5 = auo.a(this.b.d * $$3);
            int $$6 = auo.a(this.b.e * $$2);
            int $$7 = auo.a(this.b.f * $$3);
            epc $$8 = new epc(epc.a.a, $$6, $$7, false);
            $$1.a($$8, $$4, $$5, 0, 0, $$6, $$7, false, false);
            return new geh(this.b.b, new gfz($$6, $$7), $$8, aqk.a);
         } catch (Exception var16) {
            gfb.c.error("Failed to unstitch region {}", this.b.b, var16);
         } finally {
            this.a.b();
         }

         return ged.a();
      }

      @Override
      public void a() {
         this.a.b();
      }
   }
}
