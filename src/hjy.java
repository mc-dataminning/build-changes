import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public record hjy(alg c, List<hjy.a> d, double e, double f) implements hjp {
   static final Logger g = LogUtils.getLogger();
   public static final MapCodec<hjy> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               alg.a.fieldOf("resource").forGetter(hjy::b),
               ayu.b(hjy.a.a.listOf()).fieldOf("regions").forGetter(hjy::c),
               Codec.DOUBLE.optionalFieldOf("divisor_x", 1.0).forGetter(hjy::d),
               Codec.DOUBLE.optionalFieldOf("divisor_y", 1.0).forGetter(hjy::e)
            )
            .apply($$0, hjy::new)
   );

   @Override
   public void a(avd $$0, hjp.a $$1) {
      alg $$2 = a.a(this.c);
      Optional<avb> $$3 = $$0.getResource($$2);
      if ($$3.isPresent()) {
         hju $$4 = new hju($$2, $$3.get(), this.d.size());

         for (hjy.a $$5 : this.d) {
            $$1.a($$5.b, new hjy.b($$4, $$5, this.e, this.f));
         }
      } else {
         g.warn("Missing sprite: {}", $$2);
      }
   }

   @Override
   public MapCodec<hjy> a() {
      return b;
   }

   public alg b() {
      return this.c;
   }

   public List<hjy.a> c() {
      return this.d;
   }

   public double d() {
      return this.e;
   }

   public double e() {
      return this.f;
   }

   public static record a(alg b, double c, double d, double e, double f) {
      public static final Codec<hjy.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  alg.a.fieldOf("sprite").forGetter(hjy.a::a),
                  Codec.DOUBLE.fieldOf("x").forGetter(hjy.a::b),
                  Codec.DOUBLE.fieldOf("y").forGetter(hjy.a::c),
                  Codec.DOUBLE.fieldOf("width").forGetter(hjy.a::d),
                  Codec.DOUBLE.fieldOf("height").forGetter(hjy.a::e)
               )
               .apply($$0, hjy.a::new)
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

   static class b implements hjp.b {
      private final hju a;
      private final hjy.a b;
      private final double c;
      private final double d;

      b(hju $$0, hjy.a $$1, double $$2, double $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public hje a(hjo $$0) {
         try {
            fiu $$1 = this.a.a();
            double $$2 = (double)$$1.a() / this.c;
            double $$3 = (double)$$1.b() / this.d;
            int $$4 = azm.a(this.b.c * $$2);
            int $$5 = azm.a(this.b.d * $$3);
            int $$6 = azm.a(this.b.e * $$2);
            int $$7 = azm.a(this.b.f * $$3);
            fiu $$8 = new fiu(fiu.a.a, $$6, $$7, false);
            $$1.a($$8, $$4, $$5, 0, 0, $$6, $$7, false, false);
            return new hje(this.b.b, new hkx($$6, $$7), $$8, avf.a);
         } catch (Exception var16) {
            hjy.g.error("Failed to unstitch region {}", this.b.b, var16);
         } finally {
            this.a.b();
         }

         return hiz.b();
      }

      @Override
      public void a() {
         this.a.b();
      }
   }
}
