import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class gcn implements gcd {
   static final Logger c = LogUtils.getLogger();
   public static final Codec<gcn> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               agm.a.fieldOf("resource").forGetter($$0x -> $$0x.d),
               asy.a(gcn.a.a.listOf()).fieldOf("regions").forGetter($$0x -> $$0x.e),
               Codec.DOUBLE.optionalFieldOf("divisor_x", 1.0).forGetter($$0x -> $$0x.f),
               Codec.DOUBLE.optionalFieldOf("divisor_y", 1.0).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, gcn::new)
   );
   private final agm d;
   private final List<gcn.a> e;
   private final double f;
   private final double g;

   public gcn(agm $$0, List<gcn.a> $$1, double $$2, double $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public void a(apl $$0, gcd.a $$1) {
      agm $$2 = a.a(this.d);
      Optional<apj> $$3 = $$0.getResource($$2);
      if ($$3.isPresent()) {
         gcj $$4 = new gcj($$2, $$3.get(), this.e.size());

         for (gcn.a $$5 : this.e) {
            $$1.a($$5.b, new gcn.b($$4, $$5, this.f, this.g));
         }
      } else {
         c.warn("Missing sprite: {}", $$2);
      }
   }

   @Override
   public gcf a() {
      return gcg.d;
   }

   static record a(agm b, double c, double d, double e, double f) {
      public static final Codec<gcn.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  agm.a.fieldOf("sprite").forGetter(gcn.a::a),
                  Codec.DOUBLE.fieldOf("x").forGetter(gcn.a::b),
                  Codec.DOUBLE.fieldOf("y").forGetter(gcn.a::c),
                  Codec.DOUBLE.fieldOf("width").forGetter(gcn.a::d),
                  Codec.DOUBLE.fieldOf("height").forGetter(gcn.a::e)
               )
               .apply($$0, gcn.a::new)
      );

      public agm a() {
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

   static class b implements gcd.b {
      private final gcj a;
      private final gcn.a b;
      private final double c;
      private final double d;

      b(gcj $$0, gcn.a $$1, double $$2, double $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public gbt a(gcc $$0) {
         try {
            enc $$1 = this.a.a();
            double $$2 = (double)$$1.a() / this.c;
            double $$3 = (double)$$1.b() / this.d;
            int $$4 = atq.a(this.b.c * $$2);
            int $$5 = atq.a(this.b.d * $$3);
            int $$6 = atq.a(this.b.e * $$2);
            int $$7 = atq.a(this.b.f * $$3);
            enc $$8 = new enc(enc.a.a, $$6, $$7, false);
            $$1.a($$8, $$4, $$5, 0, 0, $$6, $$7, false, false);
            return new gbt(this.b.b, new gdm($$6, $$7), $$8, apn.a);
         } catch (Exception var16) {
            gcn.c.error("Failed to unstitch region {}", this.b.b, var16);
         } finally {
            this.a.b();
         }

         return gbp.a();
      }

      @Override
      public void a() {
         this.a.b();
      }
   }
}
