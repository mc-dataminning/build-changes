import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class gpi implements goy {
   static final Logger c = LogUtils.getLogger();
   public static final MapCodec<gpi> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               alb.a.fieldOf("resource").forGetter($$0x -> $$0x.d),
               ayc.a(gpi.a.a.listOf()).fieldOf("regions").forGetter($$0x -> $$0x.e),
               Codec.DOUBLE.optionalFieldOf("divisor_x", 1.0).forGetter($$0x -> $$0x.f),
               Codec.DOUBLE.optionalFieldOf("divisor_y", 1.0).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, gpi::new)
   );
   private final alb d;
   private final List<gpi.a> e;
   private final double f;
   private final double g;

   public gpi(alb $$0, List<gpi.a> $$1, double $$2, double $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public void a(aul $$0, goy.a $$1) {
      alb $$2 = a.a(this.d);
      Optional<auj> $$3 = $$0.getResource($$2);
      if ($$3.isPresent()) {
         gpe $$4 = new gpe($$2, $$3.get(), this.e.size());

         for (gpi.a $$5 : this.e) {
            $$1.a($$5.b, new gpi.b($$4, $$5, this.f, this.g));
         }
      } else {
         c.warn("Missing sprite: {}", $$2);
      }
   }

   @Override
   public gpa a() {
      return gpb.d;
   }

   static record a(alb b, double c, double d, double e, double f) {
      public static final Codec<gpi.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  alb.a.fieldOf("sprite").forGetter(gpi.a::a),
                  Codec.DOUBLE.fieldOf("x").forGetter(gpi.a::b),
                  Codec.DOUBLE.fieldOf("y").forGetter(gpi.a::c),
                  Codec.DOUBLE.fieldOf("width").forGetter(gpi.a::d),
                  Codec.DOUBLE.fieldOf("height").forGetter(gpi.a::e)
               )
               .apply($$0, gpi.a::new)
      );

      public alb a() {
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

   static class b implements goy.b {
      private final gpe a;
      private final gpi.a b;
      private final double c;
      private final double d;

      b(gpe $$0, gpi.a $$1, double $$2, double $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public goo a(gox $$0) {
         try {
            eyu $$1 = this.a.a();
            double $$2 = (double)$$1.a() / this.c;
            double $$3 = (double)$$1.b() / this.d;
            int $$4 = ayu.a(this.b.c * $$2);
            int $$5 = ayu.a(this.b.d * $$3);
            int $$6 = ayu.a(this.b.e * $$2);
            int $$7 = ayu.a(this.b.f * $$3);
            eyu $$8 = new eyu(eyu.a.a, $$6, $$7, false);
            $$1.a($$8, $$4, $$5, 0, 0, $$6, $$7, false, false);
            return new goo(this.b.b, new gqh($$6, $$7), $$8, aun.a);
         } catch (Exception var16) {
            gpi.c.error("Failed to unstitch region {}", this.b.b, var16);
         } finally {
            this.a.b();
         }

         return gok.a();
      }

      @Override
      public void a() {
         this.a.b();
      }
   }
}
