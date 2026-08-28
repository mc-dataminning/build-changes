import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class gxu implements gxk {
   static final Logger c = LogUtils.getLogger();
   public static final MapCodec<gxu> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ale.a.fieldOf("resource").forGetter($$0x -> $$0x.d),
               ayo.a(gxu.a.a.listOf()).fieldOf("regions").forGetter($$0x -> $$0x.e),
               Codec.DOUBLE.optionalFieldOf("divisor_x", 1.0).forGetter($$0x -> $$0x.f),
               Codec.DOUBLE.optionalFieldOf("divisor_y", 1.0).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, gxu::new)
   );
   private final ale d;
   private final List<gxu.a> e;
   private final double f;
   private final double g;

   public gxu(ale $$0, List<gxu.a> $$1, double $$2, double $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public void a(auv $$0, gxk.a $$1) {
      ale $$2 = a.a(this.d);
      Optional<aut> $$3 = $$0.getResource($$2);
      if ($$3.isPresent()) {
         gxq $$4 = new gxq($$2, $$3.get(), this.e.size());

         for (gxu.a $$5 : this.e) {
            $$1.a($$5.b, new gxu.b($$4, $$5, this.f, this.g));
         }
      } else {
         c.warn("Missing sprite: {}", $$2);
      }
   }

   @Override
   public gxm a() {
      return gxn.d;
   }

   static record a(ale b, double c, double d, double e, double f) {
      public static final Codec<gxu.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  ale.a.fieldOf("sprite").forGetter(gxu.a::a),
                  Codec.DOUBLE.fieldOf("x").forGetter(gxu.a::b),
                  Codec.DOUBLE.fieldOf("y").forGetter(gxu.a::c),
                  Codec.DOUBLE.fieldOf("width").forGetter(gxu.a::d),
                  Codec.DOUBLE.fieldOf("height").forGetter(gxu.a::e)
               )
               .apply($$0, gxu.a::new)
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

   static class b implements gxk.b {
      private final gxq a;
      private final gxu.a b;
      private final double c;
      private final double d;

      b(gxq $$0, gxu.a $$1, double $$2, double $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public gxa a(gxj $$0) {
         try {
            fci $$1 = this.a.a();
            double $$2 = (double)$$1.a() / this.c;
            double $$3 = (double)$$1.b() / this.d;
            int $$4 = azf.a(this.b.c * $$2);
            int $$5 = azf.a(this.b.d * $$3);
            int $$6 = azf.a(this.b.e * $$2);
            int $$7 = azf.a(this.b.f * $$3);
            fci $$8 = new fci(fci.a.a, $$6, $$7, false);
            $$1.a($$8, $$4, $$5, 0, 0, $$6, $$7, false, false);
            return new gxa(this.b.b, new gyu($$6, $$7), $$8, auy.a);
         } catch (Exception var16) {
            gxu.c.error("Failed to unstitch region {}", this.b.b, var16);
         } finally {
            this.a.b();
         }

         return gww.a();
      }

      @Override
      public void a() {
         this.a.b();
      }
   }
}
