import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public record hin(ale c, List<hin.a> d, double e, double f) implements hie {
   static final Logger g = LogUtils.getLogger();
   public static final MapCodec<hin> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ale.a.fieldOf("resource").forGetter(hin::b),
               ays.b(hin.a.a.listOf()).fieldOf("regions").forGetter(hin::c),
               Codec.DOUBLE.optionalFieldOf("divisor_x", 1.0).forGetter(hin::d),
               Codec.DOUBLE.optionalFieldOf("divisor_y", 1.0).forGetter(hin::e)
            )
            .apply($$0, hin::new)
   );

   @Override
   public void a(avb $$0, hie.a $$1) {
      ale $$2 = a.a(this.c);
      Optional<auz> $$3 = $$0.getResource($$2);
      if ($$3.isPresent()) {
         hij $$4 = new hij($$2, $$3.get(), this.d.size());

         for (hin.a $$5 : this.d) {
            $$1.a($$5.b, new hin.b($$4, $$5, this.e, this.f));
         }
      } else {
         g.warn("Missing sprite: {}", $$2);
      }
   }

   @Override
   public MapCodec<hin> a() {
      return b;
   }

   public ale b() {
      return this.c;
   }

   public List<hin.a> c() {
      return this.d;
   }

   public double d() {
      return this.e;
   }

   public double e() {
      return this.f;
   }

   public static record a(ale b, double c, double d, double e, double f) {
      public static final Codec<hin.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  ale.a.fieldOf("sprite").forGetter(hin.a::a),
                  Codec.DOUBLE.fieldOf("x").forGetter(hin.a::b),
                  Codec.DOUBLE.fieldOf("y").forGetter(hin.a::c),
                  Codec.DOUBLE.fieldOf("width").forGetter(hin.a::d),
                  Codec.DOUBLE.fieldOf("height").forGetter(hin.a::e)
               )
               .apply($$0, hin.a::new)
      );

      public ale a() {
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

   static class b implements hie.b {
      private final hij a;
      private final hin.a b;
      private final double c;
      private final double d;

      b(hij $$0, hin.a $$1, double $$2, double $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public hht a(hid $$0) {
         try {
            fhq $$1 = this.a.a();
            double $$2 = (double)$$1.a() / this.c;
            double $$3 = (double)$$1.b() / this.d;
            int $$4 = azk.a(this.b.c * $$2);
            int $$5 = azk.a(this.b.d * $$3);
            int $$6 = azk.a(this.b.e * $$2);
            int $$7 = azk.a(this.b.f * $$3);
            fhq $$8 = new fhq(fhq.a.a, $$6, $$7, false);
            $$1.a($$8, $$4, $$5, 0, 0, $$6, $$7, false, false);
            return new hht(this.b.b, new hjm($$6, $$7), $$8, avd.a);
         } catch (Exception var16) {
            hin.g.error("Failed to unstitch region {}", this.b.b, var16);
         } finally {
            this.a.b();
         }

         return hho.b();
      }

      @Override
      public void a() {
         this.a.b();
      }
   }
}
