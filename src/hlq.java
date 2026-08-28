import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public record hlq(alk c, List<hlq.a> d, double e, double f) implements hlh {
   static final Logger g = LogUtils.getLogger();
   public static final MapCodec<hlq> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               alk.a.fieldOf("resource").forGetter(hlq::b),
               ayy.b(hlq.a.a.listOf()).fieldOf("regions").forGetter(hlq::c),
               Codec.DOUBLE.optionalFieldOf("divisor_x", 1.0).forGetter(hlq::d),
               Codec.DOUBLE.optionalFieldOf("divisor_y", 1.0).forGetter(hlq::e)
            )
            .apply($$0, hlq::new)
   );

   @Override
   public void a(avh $$0, hlh.a $$1) {
      alk $$2 = a.a(this.c);
      Optional<avf> $$3 = $$0.getResource($$2);
      if ($$3.isPresent()) {
         hlm $$4 = new hlm($$2, $$3.get(), this.d.size());

         for (hlq.a $$5 : this.d) {
            $$1.a($$5.b, new hlq.b($$4, $$5, this.e, this.f));
         }
      } else {
         g.warn("Missing sprite: {}", $$2);
      }
   }

   @Override
   public MapCodec<hlq> a() {
      return b;
   }

   public alk b() {
      return this.c;
   }

   public List<hlq.a> c() {
      return this.d;
   }

   public double d() {
      return this.e;
   }

   public double e() {
      return this.f;
   }

   public static record a(alk b, double c, double d, double e, double f) {
      public static final Codec<hlq.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  alk.a.fieldOf("sprite").forGetter(hlq.a::a),
                  Codec.DOUBLE.fieldOf("x").forGetter(hlq.a::b),
                  Codec.DOUBLE.fieldOf("y").forGetter(hlq.a::c),
                  Codec.DOUBLE.fieldOf("width").forGetter(hlq.a::d),
                  Codec.DOUBLE.fieldOf("height").forGetter(hlq.a::e)
               )
               .apply($$0, hlq.a::new)
      );

      public alk a() {
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

   static class b implements hlh.b {
      private final hlm a;
      private final hlq.a b;
      private final double c;
      private final double d;

      b(hlm $$0, hlq.a $$1, double $$2, double $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public hkw a(hlg $$0) {
         try {
            fki $$1 = this.a.a();
            double $$2 = (double)$$1.a() / this.c;
            double $$3 = (double)$$1.b() / this.d;
            int $$4 = azq.a(this.b.c * $$2);
            int $$5 = azq.a(this.b.d * $$3);
            int $$6 = azq.a(this.b.e * $$2);
            int $$7 = azq.a(this.b.f * $$3);
            fki $$8 = new fki(fki.a.a, $$6, $$7, false);
            $$1.a($$8, $$4, $$5, 0, 0, $$6, $$7, false, false);
            return new hkw(this.b.b, new hmq($$6, $$7), $$8, avj.a);
         } catch (Exception var16) {
            hlq.g.error("Failed to unstitch region {}", this.b.b, var16);
         } finally {
            this.a.b();
         }

         return hkr.b();
      }

      @Override
      public void a() {
         this.a.b();
      }
   }
}
