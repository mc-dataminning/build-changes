import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class gqe implements gpu {
   static final Logger c = LogUtils.getLogger();
   public static final MapCodec<gqe> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               akk.a.fieldOf("resource").forGetter($$0x -> $$0x.d),
               axo.a(gqe.a.a.listOf()).fieldOf("regions").forGetter($$0x -> $$0x.e),
               Codec.DOUBLE.optionalFieldOf("divisor_x", 1.0).forGetter($$0x -> $$0x.f),
               Codec.DOUBLE.optionalFieldOf("divisor_y", 1.0).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, gqe::new)
   );
   private final akk d;
   private final List<gqe.a> e;
   private final double f;
   private final double g;

   public gqe(akk $$0, List<gqe.a> $$1, double $$2, double $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public void a(atw $$0, gpu.a $$1) {
      akk $$2 = a.a(this.d);
      Optional<atu> $$3 = $$0.getResource($$2);
      if ($$3.isPresent()) {
         gqa $$4 = new gqa($$2, $$3.get(), this.e.size());

         for (gqe.a $$5 : this.e) {
            $$1.a($$5.b, new gqe.b($$4, $$5, this.f, this.g));
         }
      } else {
         c.warn("Missing sprite: {}", $$2);
      }
   }

   @Override
   public gpw a() {
      return gpx.d;
   }

   static record a(akk b, double c, double d, double e, double f) {
      public static final Codec<gqe.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  akk.a.fieldOf("sprite").forGetter(gqe.a::a),
                  Codec.DOUBLE.fieldOf("x").forGetter(gqe.a::b),
                  Codec.DOUBLE.fieldOf("y").forGetter(gqe.a::c),
                  Codec.DOUBLE.fieldOf("width").forGetter(gqe.a::d),
                  Codec.DOUBLE.fieldOf("height").forGetter(gqe.a::e)
               )
               .apply($$0, gqe.a::new)
      );

      public akk a() {
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

   static class b implements gpu.b {
      private final gqa a;
      private final gqe.a b;
      private final double c;
      private final double d;

      b(gqa $$0, gqe.a $$1, double $$2, double $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public gpk a(gpt $$0) {
         try {
            ezp $$1 = this.a.a();
            double $$2 = (double)$$1.a() / this.c;
            double $$3 = (double)$$1.b() / this.d;
            int $$4 = ayg.a(this.b.c * $$2);
            int $$5 = ayg.a(this.b.d * $$3);
            int $$6 = ayg.a(this.b.e * $$2);
            int $$7 = ayg.a(this.b.f * $$3);
            ezp $$8 = new ezp(ezp.a.a, $$6, $$7, false);
            $$1.a($$8, $$4, $$5, 0, 0, $$6, $$7, false, false);
            return new gpk(this.b.b, new grd($$6, $$7), $$8, aty.a);
         } catch (Exception var16) {
            gqe.c.error("Failed to unstitch region {}", this.b.b, var16);
         } finally {
            this.a.b();
         }

         return gpg.a();
      }

      @Override
      public void a() {
         this.a.b();
      }
   }
}
