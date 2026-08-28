import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class gqx implements gqn {
   static final Logger c = LogUtils.getLogger();
   public static final MapCodec<gqx> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               akr.a.fieldOf("resource").forGetter($$0x -> $$0x.d),
               axw.a(gqx.a.a.listOf()).fieldOf("regions").forGetter($$0x -> $$0x.e),
               Codec.DOUBLE.optionalFieldOf("divisor_x", 1.0).forGetter($$0x -> $$0x.f),
               Codec.DOUBLE.optionalFieldOf("divisor_y", 1.0).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, gqx::new)
   );
   private final akr d;
   private final List<gqx.a> e;
   private final double f;
   private final double g;

   public gqx(akr $$0, List<gqx.a> $$1, double $$2, double $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public void a(aue $$0, gqn.a $$1) {
      akr $$2 = a.a(this.d);
      Optional<auc> $$3 = $$0.getResource($$2);
      if ($$3.isPresent()) {
         gqt $$4 = new gqt($$2, $$3.get(), this.e.size());

         for (gqx.a $$5 : this.e) {
            $$1.a($$5.b, new gqx.b($$4, $$5, this.f, this.g));
         }
      } else {
         c.warn("Missing sprite: {}", $$2);
      }
   }

   @Override
   public gqp a() {
      return gqq.d;
   }

   static record a(akr b, double c, double d, double e, double f) {
      public static final Codec<gqx.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  akr.a.fieldOf("sprite").forGetter(gqx.a::a),
                  Codec.DOUBLE.fieldOf("x").forGetter(gqx.a::b),
                  Codec.DOUBLE.fieldOf("y").forGetter(gqx.a::c),
                  Codec.DOUBLE.fieldOf("width").forGetter(gqx.a::d),
                  Codec.DOUBLE.fieldOf("height").forGetter(gqx.a::e)
               )
               .apply($$0, gqx.a::new)
      );

      public akr a() {
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

   static class b implements gqn.b {
      private final gqt a;
      private final gqx.a b;
      private final double c;
      private final double d;

      b(gqt $$0, gqx.a $$1, double $$2, double $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public gqd a(gqm $$0) {
         try {
            fah $$1 = this.a.a();
            double $$2 = (double)$$1.a() / this.c;
            double $$3 = (double)$$1.b() / this.d;
            int $$4 = ayo.a(this.b.c * $$2);
            int $$5 = ayo.a(this.b.d * $$3);
            int $$6 = ayo.a(this.b.e * $$2);
            int $$7 = ayo.a(this.b.f * $$3);
            fah $$8 = new fah(fah.a.a, $$6, $$7, false);
            $$1.a($$8, $$4, $$5, 0, 0, $$6, $$7, false, false);
            return new gqd(this.b.b, new grw($$6, $$7), $$8, aug.a);
         } catch (Exception var16) {
            gqx.c.error("Failed to unstitch region {}", this.b.b, var16);
         } finally {
            this.a.b();
         }

         return gpz.a();
      }

      @Override
      public void a() {
         this.a.b();
      }
   }
}
