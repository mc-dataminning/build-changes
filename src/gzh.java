import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class gzh implements gyx {
   static final Logger c = LogUtils.getLogger();
   public static final MapCodec<gzh> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               all.a.fieldOf("resource").forGetter($$0x -> $$0x.d),
               ayw.a(gzh.a.a.listOf()).fieldOf("regions").forGetter($$0x -> $$0x.e),
               Codec.DOUBLE.optionalFieldOf("divisor_x", 1.0).forGetter($$0x -> $$0x.f),
               Codec.DOUBLE.optionalFieldOf("divisor_y", 1.0).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, gzh::new)
   );
   private final all d;
   private final List<gzh.a> e;
   private final double f;
   private final double g;

   public gzh(all $$0, List<gzh.a> $$1, double $$2, double $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public void a(ave $$0, gyx.a $$1) {
      all $$2 = a.a(this.d);
      Optional<avc> $$3 = $$0.getResource($$2);
      if ($$3.isPresent()) {
         gzd $$4 = new gzd($$2, $$3.get(), this.e.size());

         for (gzh.a $$5 : this.e) {
            $$1.a($$5.b, new gzh.b($$4, $$5, this.f, this.g));
         }
      } else {
         c.warn("Missing sprite: {}", $$2);
      }
   }

   @Override
   public gyz a() {
      return gza.d;
   }

   static record a(all b, double c, double d, double e, double f) {
      public static final Codec<gzh.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  all.a.fieldOf("sprite").forGetter(gzh.a::a),
                  Codec.DOUBLE.fieldOf("x").forGetter(gzh.a::b),
                  Codec.DOUBLE.fieldOf("y").forGetter(gzh.a::c),
                  Codec.DOUBLE.fieldOf("width").forGetter(gzh.a::d),
                  Codec.DOUBLE.fieldOf("height").forGetter(gzh.a::e)
               )
               .apply($$0, gzh.a::new)
      );

      public all a() {
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

   static class b implements gyx.b {
      private final gzd a;
      private final gzh.a b;
      private final double c;
      private final double d;

      b(gzd $$0, gzh.a $$1, double $$2, double $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public gyn a(gyw $$0) {
         try {
            fdk $$1 = this.a.a();
            double $$2 = (double)$$1.a() / this.c;
            double $$3 = (double)$$1.b() / this.d;
            int $$4 = azn.a(this.b.c * $$2);
            int $$5 = azn.a(this.b.d * $$3);
            int $$6 = azn.a(this.b.e * $$2);
            int $$7 = azn.a(this.b.f * $$3);
            fdk $$8 = new fdk(fdk.a.a, $$6, $$7, false);
            $$1.a($$8, $$4, $$5, 0, 0, $$6, $$7, false, false);
            return new gyn(this.b.b, new hah($$6, $$7), $$8, avg.a);
         } catch (Exception var16) {
            gzh.c.error("Failed to unstitch region {}", this.b.b, var16);
         } finally {
            this.a.b();
         }

         return gyj.a();
      }

      @Override
      public void a() {
         this.a.b();
      }
   }
}
