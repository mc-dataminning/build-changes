import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class fyz implements fyp {
   static final Logger c = LogUtils.getLogger();
   public static final Codec<fyz> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               aer.a.fieldOf("resource").forGetter($$0x -> $$0x.d),
               aqy.a(fyz.a.a.listOf()).fieldOf("regions").forGetter($$0x -> $$0x.e),
               Codec.DOUBLE.optionalFieldOf("divisor_x", 1.0).forGetter($$0x -> $$0x.f),
               Codec.DOUBLE.optionalFieldOf("divisor_y", 1.0).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, fyz::new)
   );
   private final aer d;
   private final List<fyz.a> e;
   private final double f;
   private final double g;

   public fyz(aer $$0, List<fyz.a> $$1, double $$2, double $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public void a(anm $$0, fyp.a $$1) {
      aer $$2 = a.a(this.d);
      Optional<ank> $$3 = $$0.getResource($$2);
      if ($$3.isPresent()) {
         fyv $$4 = new fyv($$2, $$3.get(), this.e.size());

         for (fyz.a $$5 : this.e) {
            $$1.a($$5.b, new fyz.b($$4, $$5, this.f, this.g));
         }
      } else {
         c.warn("Missing sprite: {}", $$2);
      }
   }

   @Override
   public fyr a() {
      return fys.d;
   }

   static record a(aer b, double c, double d, double e, double f) {
      public static final Codec<fyz.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  aer.a.fieldOf("sprite").forGetter(fyz.a::a),
                  Codec.DOUBLE.fieldOf("x").forGetter(fyz.a::b),
                  Codec.DOUBLE.fieldOf("y").forGetter(fyz.a::c),
                  Codec.DOUBLE.fieldOf("width").forGetter(fyz.a::d),
                  Codec.DOUBLE.fieldOf("height").forGetter(fyz.a::e)
               )
               .apply($$0, fyz.a::new)
      );

      public aer a() {
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

   static class b implements fyp.b {
      private final fyv a;
      private final fyz.a b;
      private final double c;
      private final double d;

      b(fyv $$0, fyz.a $$1, double $$2, double $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public fyf a(fyo $$0) {
         try {
            ekh $$1 = this.a.a();
            double $$2 = (double)$$1.a() / this.c;
            double $$3 = (double)$$1.b() / this.d;
            int $$4 = arp.a(this.b.c * $$2);
            int $$5 = arp.a(this.b.d * $$3);
            int $$6 = arp.a(this.b.e * $$2);
            int $$7 = arp.a(this.b.f * $$3);
            ekh $$8 = new ekh(ekh.a.a, $$6, $$7, false);
            $$1.a($$8, $$4, $$5, 0, 0, $$6, $$7, false, false);
            return new fyf(this.b.b, new fzy($$6, $$7), $$8, ano.a);
         } catch (Exception var16) {
            fyz.c.error("Failed to unstitch region {}", this.b.b, var16);
         } finally {
            this.a.b();
         }

         return fyb.a();
      }

      @Override
      public void a() {
         this.a.b();
      }
   }
}
