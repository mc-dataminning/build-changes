import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class hbs implements hbi {
   static final Logger c = LogUtils.getLogger();
   public static final MapCodec<hbs> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               alz.a.fieldOf("resource").forGetter($$0x -> $$0x.d),
               azn.a(hbs.a.a.listOf()).fieldOf("regions").forGetter($$0x -> $$0x.e),
               Codec.DOUBLE.optionalFieldOf("divisor_x", 1.0).forGetter($$0x -> $$0x.f),
               Codec.DOUBLE.optionalFieldOf("divisor_y", 1.0).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, hbs::new)
   );
   private final alz d;
   private final List<hbs.a> e;
   private final double f;
   private final double g;

   public hbs(alz $$0, List<hbs.a> $$1, double $$2, double $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public void a(avv $$0, hbi.a $$1) {
      alz $$2 = a.a(this.d);
      Optional<avt> $$3 = $$0.getResource($$2);
      if ($$3.isPresent()) {
         hbo $$4 = new hbo($$2, $$3.get(), this.e.size());

         for (hbs.a $$5 : this.e) {
            $$1.a($$5.b, new hbs.b($$4, $$5, this.f, this.g));
         }
      } else {
         c.warn("Missing sprite: {}", $$2);
      }
   }

   @Override
   public hbk a() {
      return hbl.d;
   }

   static record a(alz b, double c, double d, double e, double f) {
      public static final Codec<hbs.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  alz.a.fieldOf("sprite").forGetter(hbs.a::a),
                  Codec.DOUBLE.fieldOf("x").forGetter(hbs.a::b),
                  Codec.DOUBLE.fieldOf("y").forGetter(hbs.a::c),
                  Codec.DOUBLE.fieldOf("width").forGetter(hbs.a::d),
                  Codec.DOUBLE.fieldOf("height").forGetter(hbs.a::e)
               )
               .apply($$0, hbs.a::new)
      );

      public alz a() {
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

   static class b implements hbi.b {
      private final hbo a;
      private final hbs.a b;
      private final double c;
      private final double d;

      b(hbo $$0, hbs.a $$1, double $$2, double $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public hay a(hbh $$0) {
         try {
            ffl $$1 = this.a.a();
            double $$2 = (double)$$1.a() / this.c;
            double $$3 = (double)$$1.b() / this.d;
            int $$4 = bae.a(this.b.c * $$2);
            int $$5 = bae.a(this.b.d * $$3);
            int $$6 = bae.a(this.b.e * $$2);
            int $$7 = bae.a(this.b.f * $$3);
            ffl $$8 = new ffl(ffl.a.a, $$6, $$7, false);
            $$1.a($$8, $$4, $$5, 0, 0, $$6, $$7, false, false);
            return new hay(this.b.b, new hcs($$6, $$7), $$8, avx.a);
         } catch (Exception var16) {
            hbs.c.error("Failed to unstitch region {}", this.b.b, var16);
         } finally {
            this.a.b();
         }

         return hau.a();
      }

      @Override
      public void a() {
         this.a.b();
      }
   }
}
