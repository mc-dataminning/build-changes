import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class fzi implements fyy {
   static final Logger c = LogUtils.getLogger();
   public static final Codec<fzi> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               aer.a.fieldOf("resource").forGetter($$0x -> $$0x.d),
               aqy.a(fzi.a.a.listOf()).fieldOf("regions").forGetter($$0x -> $$0x.e),
               Codec.DOUBLE.optionalFieldOf("divisor_x", 1.0).forGetter($$0x -> $$0x.f),
               Codec.DOUBLE.optionalFieldOf("divisor_y", 1.0).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, fzi::new)
   );
   private final aer d;
   private final List<fzi.a> e;
   private final double f;
   private final double g;

   public fzi(aer $$0, List<fzi.a> $$1, double $$2, double $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public void a(anm $$0, fyy.a $$1) {
      aer $$2 = a.a(this.d);
      Optional<ank> $$3 = $$0.getResource($$2);
      if ($$3.isPresent()) {
         fze $$4 = new fze($$2, $$3.get(), this.e.size());

         for (fzi.a $$5 : this.e) {
            $$1.a($$5.b, new fzi.b($$4, $$5, this.f, this.g));
         }
      } else {
         c.warn("Missing sprite: {}", $$2);
      }
   }

   @Override
   public fza a() {
      return fzb.d;
   }

   static record a(aer b, double c, double d, double e, double f) {
      public static final Codec<fzi.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  aer.a.fieldOf("sprite").forGetter(fzi.a::a),
                  Codec.DOUBLE.fieldOf("x").forGetter(fzi.a::b),
                  Codec.DOUBLE.fieldOf("y").forGetter(fzi.a::c),
                  Codec.DOUBLE.fieldOf("width").forGetter(fzi.a::d),
                  Codec.DOUBLE.fieldOf("height").forGetter(fzi.a::e)
               )
               .apply($$0, fzi.a::new)
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

   static class b implements fyy.b {
      private final fze a;
      private final fzi.a b;
      private final double c;
      private final double d;

      b(fze $$0, fzi.a $$1, double $$2, double $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public fyo a(fyx $$0) {
         try {
            ekg $$1 = this.a.a();
            double $$2 = (double)$$1.a() / this.c;
            double $$3 = (double)$$1.b() / this.d;
            int $$4 = arp.a(this.b.c * $$2);
            int $$5 = arp.a(this.b.d * $$3);
            int $$6 = arp.a(this.b.e * $$2);
            int $$7 = arp.a(this.b.f * $$3);
            ekg $$8 = new ekg(ekg.a.a, $$6, $$7, false);
            $$1.a($$8, $$4, $$5, 0, 0, $$6, $$7, false, false);
            return new fyo(this.b.b, new gah($$6, $$7), $$8, ano.a);
         } catch (Exception var16) {
            fzi.c.error("Failed to unstitch region {}", this.b.b, var16);
         } finally {
            this.a.b();
         }

         return fyk.a();
      }

      @Override
      public void a() {
         this.a.b();
      }
   }
}
