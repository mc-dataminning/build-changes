import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public record hle(alr c, List<hle.a> d, double e, double f) implements hkv {
   static final Logger g = LogUtils.getLogger();
   public static final MapCodec<hle> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               alr.a.fieldOf("resource").forGetter(hle::b),
               azg.b(hle.a.a.listOf()).fieldOf("regions").forGetter(hle::c),
               Codec.DOUBLE.optionalFieldOf("divisor_x", 1.0).forGetter(hle::d),
               Codec.DOUBLE.optionalFieldOf("divisor_y", 1.0).forGetter(hle::e)
            )
            .apply($$0, hle::new)
   );

   @Override
   public void a(avo $$0, hkv.a $$1) {
      alr $$2 = a.a(this.c);
      Optional<avm> $$3 = $$0.getResource($$2);
      if ($$3.isPresent()) {
         hla $$4 = new hla($$2, $$3.get(), this.d.size());

         for (hle.a $$5 : this.d) {
            $$1.a($$5.b, new hle.b($$4, $$5, this.e, this.f));
         }
      } else {
         g.warn("Missing sprite: {}", $$2);
      }
   }

   @Override
   public MapCodec<hle> a() {
      return b;
   }

   public alr b() {
      return this.c;
   }

   public List<hle.a> c() {
      return this.d;
   }

   public double d() {
      return this.e;
   }

   public double e() {
      return this.f;
   }

   public static record a(alr b, double c, double d, double e, double f) {
      public static final Codec<hle.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  alr.a.fieldOf("sprite").forGetter(hle.a::a),
                  Codec.DOUBLE.fieldOf("x").forGetter(hle.a::b),
                  Codec.DOUBLE.fieldOf("y").forGetter(hle.a::c),
                  Codec.DOUBLE.fieldOf("width").forGetter(hle.a::d),
                  Codec.DOUBLE.fieldOf("height").forGetter(hle.a::e)
               )
               .apply($$0, hle.a::new)
      );

      public alr a() {
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

   static class b implements hkv.b {
      private final hla a;
      private final hle.a b;
      private final double c;
      private final double d;

      b(hla $$0, hle.a $$1, double $$2, double $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public hkk a(hku $$0) {
         try {
            fkf $$1 = this.a.a();
            double $$2 = (double)$$1.a() / this.c;
            double $$3 = (double)$$1.b() / this.d;
            int $$4 = azz.a(this.b.c * $$2);
            int $$5 = azz.a(this.b.d * $$3);
            int $$6 = azz.a(this.b.e * $$2);
            int $$7 = azz.a(this.b.f * $$3);
            fkf $$8 = new fkf(fkf.a.a, $$6, $$7, false);
            $$1.a($$8, $$4, $$5, 0, 0, $$6, $$7, false, false);
            return new hkk(this.b.b, new hme($$6, $$7), $$8, avq.a);
         } catch (Exception var16) {
            hle.g.error("Failed to unstitch region {}", this.b.b, var16);
         } finally {
            this.a.b();
         }

         return hkf.b();
      }

      @Override
      public void a() {
         this.a.b();
      }
   }
}
