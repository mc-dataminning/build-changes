import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class hbu implements hbk {
   static final Logger c = LogUtils.getLogger();
   public static final MapCodec<hbu> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               alp.a.fieldOf("resource").forGetter($$0x -> $$0x.d),
               azd.a(hbu.a.a.listOf()).fieldOf("regions").forGetter($$0x -> $$0x.e),
               Codec.DOUBLE.optionalFieldOf("divisor_x", 1.0).forGetter($$0x -> $$0x.f),
               Codec.DOUBLE.optionalFieldOf("divisor_y", 1.0).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, hbu::new)
   );
   private final alp d;
   private final List<hbu.a> e;
   private final double f;
   private final double g;

   public hbu(alp $$0, List<hbu.a> $$1, double $$2, double $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public void a(avl $$0, hbk.a $$1) {
      alp $$2 = a.a(this.d);
      Optional<avj> $$3 = $$0.getResource($$2);
      if ($$3.isPresent()) {
         hbq $$4 = new hbq($$2, $$3.get(), this.e.size());

         for (hbu.a $$5 : this.e) {
            $$1.a($$5.b, new hbu.b($$4, $$5, this.f, this.g));
         }
      } else {
         c.warn("Missing sprite: {}", $$2);
      }
   }

   @Override
   public hbm a() {
      return hbn.d;
   }

   static record a(alp b, double c, double d, double e, double f) {
      public static final Codec<hbu.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  alp.a.fieldOf("sprite").forGetter(hbu.a::a),
                  Codec.DOUBLE.fieldOf("x").forGetter(hbu.a::b),
                  Codec.DOUBLE.fieldOf("y").forGetter(hbu.a::c),
                  Codec.DOUBLE.fieldOf("width").forGetter(hbu.a::d),
                  Codec.DOUBLE.fieldOf("height").forGetter(hbu.a::e)
               )
               .apply($$0, hbu.a::new)
      );

      public alp a() {
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

   static class b implements hbk.b {
      private final hbq a;
      private final hbu.a b;
      private final double c;
      private final double d;

      b(hbq $$0, hbu.a $$1, double $$2, double $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public hba a(hbj $$0) {
         try {
            ffl $$1 = this.a.a();
            double $$2 = (double)$$1.a() / this.c;
            double $$3 = (double)$$1.b() / this.d;
            int $$4 = azu.a(this.b.c * $$2);
            int $$5 = azu.a(this.b.d * $$3);
            int $$6 = azu.a(this.b.e * $$2);
            int $$7 = azu.a(this.b.f * $$3);
            ffl $$8 = new ffl(ffl.a.a, $$6, $$7, false);
            $$1.a($$8, $$4, $$5, 0, 0, $$6, $$7, false, false);
            return new hba(this.b.b, new hcu($$6, $$7), $$8, avn.a);
         } catch (Exception var16) {
            hbu.c.error("Failed to unstitch region {}", this.b.b, var16);
         } finally {
            this.a.b();
         }

         return haw.a();
      }

      @Override
      public void a() {
         this.a.b();
      }
   }
}
