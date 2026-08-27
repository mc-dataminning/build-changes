import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class gfp implements gff {
   static final Logger c = LogUtils.getLogger();
   public static final Codec<gfp> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ahh.a.fieldOf("resource").forGetter($$0x -> $$0x.d),
               atx.a(gfp.a.a.listOf()).fieldOf("regions").forGetter($$0x -> $$0x.e),
               Codec.DOUBLE.optionalFieldOf("divisor_x", 1.0).forGetter($$0x -> $$0x.f),
               Codec.DOUBLE.optionalFieldOf("divisor_y", 1.0).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, gfp::new)
   );
   private final ahh d;
   private final List<gfp.a> e;
   private final double f;
   private final double g;

   public gfp(ahh $$0, List<gfp.a> $$1, double $$2, double $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public void a(aqj $$0, gff.a $$1) {
      ahh $$2 = a.a(this.d);
      Optional<aqh> $$3 = $$0.getResource($$2);
      if ($$3.isPresent()) {
         gfl $$4 = new gfl($$2, $$3.get(), this.e.size());

         for (gfp.a $$5 : this.e) {
            $$1.a($$5.b, new gfp.b($$4, $$5, this.f, this.g));
         }
      } else {
         c.warn("Missing sprite: {}", $$2);
      }
   }

   @Override
   public gfh a() {
      return gfi.d;
   }

   static record a(ahh b, double c, double d, double e, double f) {
      public static final Codec<gfp.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  ahh.a.fieldOf("sprite").forGetter(gfp.a::a),
                  Codec.DOUBLE.fieldOf("x").forGetter(gfp.a::b),
                  Codec.DOUBLE.fieldOf("y").forGetter(gfp.a::c),
                  Codec.DOUBLE.fieldOf("width").forGetter(gfp.a::d),
                  Codec.DOUBLE.fieldOf("height").forGetter(gfp.a::e)
               )
               .apply($$0, gfp.a::new)
      );

      public ahh a() {
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

   static class b implements gff.b {
      private final gfl a;
      private final gfp.a b;
      private final double c;
      private final double d;

      b(gfl $$0, gfp.a $$1, double $$2, double $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public gev a(gfe $$0) {
         try {
            epl $$1 = this.a.a();
            double $$2 = (double)$$1.a() / this.c;
            double $$3 = (double)$$1.b() / this.d;
            int $$4 = aup.a(this.b.c * $$2);
            int $$5 = aup.a(this.b.d * $$3);
            int $$6 = aup.a(this.b.e * $$2);
            int $$7 = aup.a(this.b.f * $$3);
            epl $$8 = new epl(epl.a.a, $$6, $$7, false);
            $$1.a($$8, $$4, $$5, 0, 0, $$6, $$7, false, false);
            return new gev(this.b.b, new ggn($$6, $$7), $$8, aql.a);
         } catch (Exception var16) {
            gfp.c.error("Failed to unstitch region {}", this.b.b, var16);
         } finally {
            this.a.b();
         }

         return ger.a();
      }

      @Override
      public void a() {
         this.a.b();
      }
   }
}
