import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class ghi implements ggy {
   static final Logger c = LogUtils.getLogger();
   public static final Codec<ghi> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               aiy.a.fieldOf("resource").forGetter($$0x -> $$0x.d),
               avp.a(ghi.a.a.listOf()).fieldOf("regions").forGetter($$0x -> $$0x.e),
               Codec.DOUBLE.optionalFieldOf("divisor_x", 1.0).forGetter($$0x -> $$0x.f),
               Codec.DOUBLE.optionalFieldOf("divisor_y", 1.0).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, ghi::new)
   );
   private final aiy d;
   private final List<ghi.a> e;
   private final double f;
   private final double g;

   public ghi(aiy $$0, List<ghi.a> $$1, double $$2, double $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public void a(asa $$0, ggy.a $$1) {
      aiy $$2 = a.a(this.d);
      Optional<ary> $$3 = $$0.getResource($$2);
      if ($$3.isPresent()) {
         ghe $$4 = new ghe($$2, $$3.get(), this.e.size());

         for (ghi.a $$5 : this.e) {
            $$1.a($$5.b, new ghi.b($$4, $$5, this.f, this.g));
         }
      } else {
         c.warn("Missing sprite: {}", $$2);
      }
   }

   @Override
   public gha a() {
      return ghb.d;
   }

   static record a(aiy b, double c, double d, double e, double f) {
      public static final Codec<ghi.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  aiy.a.fieldOf("sprite").forGetter(ghi.a::a),
                  Codec.DOUBLE.fieldOf("x").forGetter(ghi.a::b),
                  Codec.DOUBLE.fieldOf("y").forGetter(ghi.a::c),
                  Codec.DOUBLE.fieldOf("width").forGetter(ghi.a::d),
                  Codec.DOUBLE.fieldOf("height").forGetter(ghi.a::e)
               )
               .apply($$0, ghi.a::new)
      );

      public aiy a() {
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

   static class b implements ggy.b {
      private final ghe a;
      private final ghi.a b;
      private final double c;
      private final double d;

      b(ghe $$0, ghi.a $$1, double $$2, double $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public ggo a(ggx $$0) {
         try {
            erb $$1 = this.a.a();
            double $$2 = (double)$$1.a() / this.c;
            double $$3 = (double)$$1.b() / this.d;
            int $$4 = awh.a(this.b.c * $$2);
            int $$5 = awh.a(this.b.d * $$3);
            int $$6 = awh.a(this.b.e * $$2);
            int $$7 = awh.a(this.b.f * $$3);
            erb $$8 = new erb(erb.a.a, $$6, $$7, false);
            $$1.a($$8, $$4, $$5, 0, 0, $$6, $$7, false, false);
            return new ggo(this.b.b, new gig($$6, $$7), $$8, asc.a);
         } catch (Exception var16) {
            ghi.c.error("Failed to unstitch region {}", this.b.b, var16);
         } finally {
            this.a.b();
         }

         return ggk.a();
      }

      @Override
      public void a() {
         this.a.b();
      }
   }
}
