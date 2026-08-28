import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public record hke(alg c, List<hke.a> d, double e, double f) implements hjv {
   static final Logger g = LogUtils.getLogger();
   public static final MapCodec<hke> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               alg.a.fieldOf("resource").forGetter(hke::b),
               ayu.b(hke.a.a.listOf()).fieldOf("regions").forGetter(hke::c),
               Codec.DOUBLE.optionalFieldOf("divisor_x", 1.0).forGetter(hke::d),
               Codec.DOUBLE.optionalFieldOf("divisor_y", 1.0).forGetter(hke::e)
            )
            .apply($$0, hke::new)
   );

   @Override
   public void a(avd $$0, hjv.a $$1) {
      alg $$2 = a.a(this.c);
      Optional<avb> $$3 = $$0.getResource($$2);
      if ($$3.isPresent()) {
         hka $$4 = new hka($$2, $$3.get(), this.d.size());

         for (hke.a $$5 : this.d) {
            $$1.a($$5.b, new hke.b($$4, $$5, this.e, this.f));
         }
      } else {
         g.warn("Missing sprite: {}", $$2);
      }
   }

   @Override
   public MapCodec<hke> a() {
      return b;
   }

   public alg b() {
      return this.c;
   }

   public List<hke.a> c() {
      return this.d;
   }

   public double d() {
      return this.e;
   }

   public double e() {
      return this.f;
   }

   public static record a(alg b, double c, double d, double e, double f) {
      public static final Codec<hke.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  alg.a.fieldOf("sprite").forGetter(hke.a::a),
                  Codec.DOUBLE.fieldOf("x").forGetter(hke.a::b),
                  Codec.DOUBLE.fieldOf("y").forGetter(hke.a::c),
                  Codec.DOUBLE.fieldOf("width").forGetter(hke.a::d),
                  Codec.DOUBLE.fieldOf("height").forGetter(hke.a::e)
               )
               .apply($$0, hke.a::new)
      );

      public alg a() {
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

   static class b implements hjv.b {
      private final hka a;
      private final hke.a b;
      private final double c;
      private final double d;

      b(hka $$0, hke.a $$1, double $$2, double $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public hjk a(hju $$0) {
         try {
            fiz $$1 = this.a.a();
            double $$2 = (double)$$1.a() / this.c;
            double $$3 = (double)$$1.b() / this.d;
            int $$4 = azm.a(this.b.c * $$2);
            int $$5 = azm.a(this.b.d * $$3);
            int $$6 = azm.a(this.b.e * $$2);
            int $$7 = azm.a(this.b.f * $$3);
            fiz $$8 = new fiz(fiz.a.a, $$6, $$7, false);
            $$1.a($$8, $$4, $$5, 0, 0, $$6, $$7, false, false);
            return new hjk(this.b.b, new hle($$6, $$7), $$8, avf.a);
         } catch (Exception var16) {
            hke.g.error("Failed to unstitch region {}", this.b.b, var16);
         } finally {
            this.a.b();
         }

         return hjf.b();
      }

      @Override
      public void a() {
         this.a.b();
      }
   }
}
