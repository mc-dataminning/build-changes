import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class gnc implements gms {
   static final Logger c = LogUtils.getLogger();
   public static final Codec<gnc> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               akf.a.fieldOf("resource").forGetter($$0x -> $$0x.d),
               axe.a(gnc.a.a.listOf()).fieldOf("regions").forGetter($$0x -> $$0x.e),
               Codec.DOUBLE.optionalFieldOf("divisor_x", 1.0).forGetter($$0x -> $$0x.f),
               Codec.DOUBLE.optionalFieldOf("divisor_y", 1.0).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, gnc::new)
   );
   private final akf d;
   private final List<gnc.a> e;
   private final double f;
   private final double g;

   public gnc(akf $$0, List<gnc.a> $$1, double $$2, double $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public void a(ato $$0, gms.a $$1) {
      akf $$2 = a.a(this.d);
      Optional<atm> $$3 = $$0.getResource($$2);
      if ($$3.isPresent()) {
         gmy $$4 = new gmy($$2, $$3.get(), this.e.size());

         for (gnc.a $$5 : this.e) {
            $$1.a($$5.b, new gnc.b($$4, $$5, this.f, this.g));
         }
      } else {
         c.warn("Missing sprite: {}", $$2);
      }
   }

   @Override
   public gmu a() {
      return gmv.d;
   }

   static record a(akf b, double c, double d, double e, double f) {
      public static final Codec<gnc.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  akf.a.fieldOf("sprite").forGetter(gnc.a::a),
                  Codec.DOUBLE.fieldOf("x").forGetter(gnc.a::b),
                  Codec.DOUBLE.fieldOf("y").forGetter(gnc.a::c),
                  Codec.DOUBLE.fieldOf("width").forGetter(gnc.a::d),
                  Codec.DOUBLE.fieldOf("height").forGetter(gnc.a::e)
               )
               .apply($$0, gnc.a::new)
      );

      public akf a() {
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

   static class b implements gms.b {
      private final gmy a;
      private final gnc.a b;
      private final double c;
      private final double d;

      b(gmy $$0, gnc.a $$1, double $$2, double $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public gmi a(gmr $$0) {
         try {
            ewo $$1 = this.a.a();
            double $$2 = (double)$$1.a() / this.c;
            double $$3 = (double)$$1.b() / this.d;
            int $$4 = axw.a(this.b.c * $$2);
            int $$5 = axw.a(this.b.d * $$3);
            int $$6 = axw.a(this.b.e * $$2);
            int $$7 = axw.a(this.b.f * $$3);
            ewo $$8 = new ewo(ewo.a.a, $$6, $$7, false);
            $$1.a($$8, $$4, $$5, 0, 0, $$6, $$7, false, false);
            return new gmi(this.b.b, new goa($$6, $$7), $$8, atq.a);
         } catch (Exception var16) {
            gnc.c.error("Failed to unstitch region {}", this.b.b, var16);
         } finally {
            this.a.b();
         }

         return gme.a();
      }

      @Override
      public void a() {
         this.a.b();
      }
   }
}
