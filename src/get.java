import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class get implements gej {
   static final Logger c = LogUtils.getLogger();
   public static final Codec<get> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ahd.a.fieldOf("resource").forGetter($$0x -> $$0x.d),
               atq.a(get.a.a.listOf()).fieldOf("regions").forGetter($$0x -> $$0x.e),
               Codec.DOUBLE.optionalFieldOf("divisor_x", 1.0).forGetter($$0x -> $$0x.f),
               Codec.DOUBLE.optionalFieldOf("divisor_y", 1.0).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, get::new)
   );
   private final ahd d;
   private final List<get.a> e;
   private final double f;
   private final double g;

   public get(ahd $$0, List<get.a> $$1, double $$2, double $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public void a(aqc $$0, gej.a $$1) {
      ahd $$2 = a.a(this.d);
      Optional<aqa> $$3 = $$0.getResource($$2);
      if ($$3.isPresent()) {
         gep $$4 = new gep($$2, $$3.get(), this.e.size());

         for (get.a $$5 : this.e) {
            $$1.a($$5.b, new get.b($$4, $$5, this.f, this.g));
         }
      } else {
         c.warn("Missing sprite: {}", $$2);
      }
   }

   @Override
   public gel a() {
      return gem.d;
   }

   static record a(ahd b, double c, double d, double e, double f) {
      public static final Codec<get.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  ahd.a.fieldOf("sprite").forGetter(get.a::a),
                  Codec.DOUBLE.fieldOf("x").forGetter(get.a::b),
                  Codec.DOUBLE.fieldOf("y").forGetter(get.a::c),
                  Codec.DOUBLE.fieldOf("width").forGetter(get.a::d),
                  Codec.DOUBLE.fieldOf("height").forGetter(get.a::e)
               )
               .apply($$0, get.a::new)
      );

      public ahd a() {
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

   static class b implements gej.b {
      private final gep a;
      private final get.a b;
      private final double c;
      private final double d;

      b(gep $$0, get.a $$1, double $$2, double $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public gdz a(gei $$0) {
         try {
            eou $$1 = this.a.a();
            double $$2 = (double)$$1.a() / this.c;
            double $$3 = (double)$$1.b() / this.d;
            int $$4 = aui.a(this.b.c * $$2);
            int $$5 = aui.a(this.b.d * $$3);
            int $$6 = aui.a(this.b.e * $$2);
            int $$7 = aui.a(this.b.f * $$3);
            eou $$8 = new eou(eou.a.a, $$6, $$7, false);
            $$1.a($$8, $$4, $$5, 0, 0, $$6, $$7, false, false);
            return new gdz(this.b.b, new gfs($$6, $$7), $$8, aqe.a);
         } catch (Exception var16) {
            get.c.error("Failed to unstitch region {}", this.b.b, var16);
         } finally {
            this.a.b();
         }

         return gdv.a();
      }

      @Override
      public void a() {
         this.a.b();
      }
   }
}
