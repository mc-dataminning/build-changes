import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class ghp implements ghf {
   static final Logger c = LogUtils.getLogger();
   public static final Codec<ghp> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               aiy.a.fieldOf("resource").forGetter($$0x -> $$0x.d),
               avq.a(ghp.a.a.listOf()).fieldOf("regions").forGetter($$0x -> $$0x.e),
               Codec.DOUBLE.optionalFieldOf("divisor_x", 1.0).forGetter($$0x -> $$0x.f),
               Codec.DOUBLE.optionalFieldOf("divisor_y", 1.0).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, ghp::new)
   );
   private final aiy d;
   private final List<ghp.a> e;
   private final double f;
   private final double g;

   public ghp(aiy $$0, List<ghp.a> $$1, double $$2, double $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public void a(asb $$0, ghf.a $$1) {
      aiy $$2 = a.a(this.d);
      Optional<arz> $$3 = $$0.getResource($$2);
      if ($$3.isPresent()) {
         ghl $$4 = new ghl($$2, $$3.get(), this.e.size());

         for (ghp.a $$5 : this.e) {
            $$1.a($$5.b, new ghp.b($$4, $$5, this.f, this.g));
         }
      } else {
         c.warn("Missing sprite: {}", $$2);
      }
   }

   @Override
   public ghh a() {
      return ghi.d;
   }

   static record a(aiy b, double c, double d, double e, double f) {
      public static final Codec<ghp.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  aiy.a.fieldOf("sprite").forGetter(ghp.a::a),
                  Codec.DOUBLE.fieldOf("x").forGetter(ghp.a::b),
                  Codec.DOUBLE.fieldOf("y").forGetter(ghp.a::c),
                  Codec.DOUBLE.fieldOf("width").forGetter(ghp.a::d),
                  Codec.DOUBLE.fieldOf("height").forGetter(ghp.a::e)
               )
               .apply($$0, ghp.a::new)
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

   static class b implements ghf.b {
      private final ghl a;
      private final ghp.a b;
      private final double c;
      private final double d;

      b(ghl $$0, ghp.a $$1, double $$2, double $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public ggv a(ghe $$0) {
         try {
            eri $$1 = this.a.a();
            double $$2 = (double)$$1.a() / this.c;
            double $$3 = (double)$$1.b() / this.d;
            int $$4 = awi.a(this.b.c * $$2);
            int $$5 = awi.a(this.b.d * $$3);
            int $$6 = awi.a(this.b.e * $$2);
            int $$7 = awi.a(this.b.f * $$3);
            eri $$8 = new eri(eri.a.a, $$6, $$7, false);
            $$1.a($$8, $$4, $$5, 0, 0, $$6, $$7, false, false);
            return new ggv(this.b.b, new gin($$6, $$7), $$8, asd.a);
         } catch (Exception var16) {
            ghp.c.error("Failed to unstitch region {}", this.b.b, var16);
         } finally {
            this.a.b();
         }

         return ggr.a();
      }

      @Override
      public void a() {
         this.a.b();
      }
   }
}
