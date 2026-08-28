import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public record hjd(alg c, List<hjd.a> d, double e, double f) implements hiu {
   static final Logger g = LogUtils.getLogger();
   public static final MapCodec<hjd> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               alg.a.fieldOf("resource").forGetter(hjd::b),
               ayu.b(hjd.a.a.listOf()).fieldOf("regions").forGetter(hjd::c),
               Codec.DOUBLE.optionalFieldOf("divisor_x", 1.0).forGetter(hjd::d),
               Codec.DOUBLE.optionalFieldOf("divisor_y", 1.0).forGetter(hjd::e)
            )
            .apply($$0, hjd::new)
   );

   @Override
   public void a(avd $$0, hiu.a $$1) {
      alg $$2 = a.a(this.c);
      Optional<avb> $$3 = $$0.getResource($$2);
      if ($$3.isPresent()) {
         hiz $$4 = new hiz($$2, $$3.get(), this.d.size());

         for (hjd.a $$5 : this.d) {
            $$1.a($$5.b, new hjd.b($$4, $$5, this.e, this.f));
         }
      } else {
         g.warn("Missing sprite: {}", $$2);
      }
   }

   @Override
   public MapCodec<hjd> a() {
      return b;
   }

   public alg b() {
      return this.c;
   }

   public List<hjd.a> c() {
      return this.d;
   }

   public double d() {
      return this.e;
   }

   public double e() {
      return this.f;
   }

   public static record a(alg b, double c, double d, double e, double f) {
      public static final Codec<hjd.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  alg.a.fieldOf("sprite").forGetter(hjd.a::a),
                  Codec.DOUBLE.fieldOf("x").forGetter(hjd.a::b),
                  Codec.DOUBLE.fieldOf("y").forGetter(hjd.a::c),
                  Codec.DOUBLE.fieldOf("width").forGetter(hjd.a::d),
                  Codec.DOUBLE.fieldOf("height").forGetter(hjd.a::e)
               )
               .apply($$0, hjd.a::new)
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

   static class b implements hiu.b {
      private final hiz a;
      private final hjd.a b;
      private final double c;
      private final double d;

      b(hiz $$0, hjd.a $$1, double $$2, double $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public hij a(hit $$0) {
         try {
            fic $$1 = this.a.a();
            double $$2 = (double)$$1.a() / this.c;
            double $$3 = (double)$$1.b() / this.d;
            int $$4 = azm.a(this.b.c * $$2);
            int $$5 = azm.a(this.b.d * $$3);
            int $$6 = azm.a(this.b.e * $$2);
            int $$7 = azm.a(this.b.f * $$3);
            fic $$8 = new fic(fic.a.a, $$6, $$7, false);
            $$1.a($$8, $$4, $$5, 0, 0, $$6, $$7, false, false);
            return new hij(this.b.b, new hkc($$6, $$7), $$8, avf.a);
         } catch (Exception var16) {
            hjd.g.error("Failed to unstitch region {}", this.b.b, var16);
         } finally {
            this.a.b();
         }

         return hie.b();
      }

      @Override
      public void a() {
         this.a.b();
      }
   }
}
