import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class goj implements gnz {
   static final Logger c = LogUtils.getLogger();
   public static final MapCodec<goj> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               akn.a.fieldOf("resource").forGetter($$0x -> $$0x.d),
               axn.a(goj.a.a.listOf()).fieldOf("regions").forGetter($$0x -> $$0x.e),
               Codec.DOUBLE.optionalFieldOf("divisor_x", 1.0).forGetter($$0x -> $$0x.f),
               Codec.DOUBLE.optionalFieldOf("divisor_y", 1.0).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, goj::new)
   );
   private final akn d;
   private final List<goj.a> e;
   private final double f;
   private final double g;

   public goj(akn $$0, List<goj.a> $$1, double $$2, double $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public void a(atx $$0, gnz.a $$1) {
      akn $$2 = a.a(this.d);
      Optional<atv> $$3 = $$0.getResource($$2);
      if ($$3.isPresent()) {
         gof $$4 = new gof($$2, $$3.get(), this.e.size());

         for (goj.a $$5 : this.e) {
            $$1.a($$5.b, new goj.b($$4, $$5, this.f, this.g));
         }
      } else {
         c.warn("Missing sprite: {}", $$2);
      }
   }

   @Override
   public gob a() {
      return goc.d;
   }

   static record a(akn b, double c, double d, double e, double f) {
      public static final Codec<goj.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  akn.a.fieldOf("sprite").forGetter(goj.a::a),
                  Codec.DOUBLE.fieldOf("x").forGetter(goj.a::b),
                  Codec.DOUBLE.fieldOf("y").forGetter(goj.a::c),
                  Codec.DOUBLE.fieldOf("width").forGetter(goj.a::d),
                  Codec.DOUBLE.fieldOf("height").forGetter(goj.a::e)
               )
               .apply($$0, goj.a::new)
      );

      public akn a() {
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

   static class b implements gnz.b {
      private final gof a;
      private final goj.a b;
      private final double c;
      private final double d;

      b(gof $$0, goj.a $$1, double $$2, double $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public gnp a(gny $$0) {
         try {
            exv $$1 = this.a.a();
            double $$2 = (double)$$1.a() / this.c;
            double $$3 = (double)$$1.b() / this.d;
            int $$4 = ayf.a(this.b.c * $$2);
            int $$5 = ayf.a(this.b.d * $$3);
            int $$6 = ayf.a(this.b.e * $$2);
            int $$7 = ayf.a(this.b.f * $$3);
            exv $$8 = new exv(exv.a.a, $$6, $$7, false);
            $$1.a($$8, $$4, $$5, 0, 0, $$6, $$7, false, false);
            return new gnp(this.b.b, new gpi($$6, $$7), $$8, atz.a);
         } catch (Exception var16) {
            goj.c.error("Failed to unstitch region {}", this.b.b, var16);
         } finally {
            this.a.b();
         }

         return gnl.a();
      }

      @Override
      public void a() {
         this.a.b();
      }
   }
}
