import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class gfa implements geq {
   static final Logger c = LogUtils.getLogger();
   public static final Codec<gfa> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ahg.a.fieldOf("resource").forGetter($$0x -> $$0x.d),
               atv.a(gfa.a.a.listOf()).fieldOf("regions").forGetter($$0x -> $$0x.e),
               Codec.DOUBLE.optionalFieldOf("divisor_x", 1.0).forGetter($$0x -> $$0x.f),
               Codec.DOUBLE.optionalFieldOf("divisor_y", 1.0).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, gfa::new)
   );
   private final ahg d;
   private final List<gfa.a> e;
   private final double f;
   private final double g;

   public gfa(ahg $$0, List<gfa.a> $$1, double $$2, double $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public void a(aqh $$0, geq.a $$1) {
      ahg $$2 = a.a(this.d);
      Optional<aqf> $$3 = $$0.getResource($$2);
      if ($$3.isPresent()) {
         gew $$4 = new gew($$2, $$3.get(), this.e.size());

         for (gfa.a $$5 : this.e) {
            $$1.a($$5.b, new gfa.b($$4, $$5, this.f, this.g));
         }
      } else {
         c.warn("Missing sprite: {}", $$2);
      }
   }

   @Override
   public ges a() {
      return get.d;
   }

   static record a(ahg b, double c, double d, double e, double f) {
      public static final Codec<gfa.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  ahg.a.fieldOf("sprite").forGetter(gfa.a::a),
                  Codec.DOUBLE.fieldOf("x").forGetter(gfa.a::b),
                  Codec.DOUBLE.fieldOf("y").forGetter(gfa.a::c),
                  Codec.DOUBLE.fieldOf("width").forGetter(gfa.a::d),
                  Codec.DOUBLE.fieldOf("height").forGetter(gfa.a::e)
               )
               .apply($$0, gfa.a::new)
      );

      public ahg a() {
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

   static class b implements geq.b {
      private final gew a;
      private final gfa.a b;
      private final double c;
      private final double d;

      b(gew $$0, gfa.a $$1, double $$2, double $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public geg a(gep $$0) {
         try {
            epb $$1 = this.a.a();
            double $$2 = (double)$$1.a() / this.c;
            double $$3 = (double)$$1.b() / this.d;
            int $$4 = aun.a(this.b.c * $$2);
            int $$5 = aun.a(this.b.d * $$3);
            int $$6 = aun.a(this.b.e * $$2);
            int $$7 = aun.a(this.b.f * $$3);
            epb $$8 = new epb(epb.a.a, $$6, $$7, false);
            $$1.a($$8, $$4, $$5, 0, 0, $$6, $$7, false, false);
            return new geg(this.b.b, new gfy($$6, $$7), $$8, aqj.a);
         } catch (Exception var16) {
            gfa.c.error("Failed to unstitch region {}", this.b.b, var16);
         } finally {
            this.a.b();
         }

         return gec.a();
      }

      @Override
      public void a() {
         this.a.b();
      }
   }
}
