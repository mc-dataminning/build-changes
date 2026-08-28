import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class hex implements hen {
   static final Logger c = LogUtils.getLogger();
   public static final MapCodec<hex> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               aku.a.fieldOf("resource").forGetter($$0x -> $$0x.d),
               ayi.b(hex.a.a.listOf()).fieldOf("regions").forGetter($$0x -> $$0x.e),
               Codec.DOUBLE.optionalFieldOf("divisor_x", 1.0).forGetter($$0x -> $$0x.f),
               Codec.DOUBLE.optionalFieldOf("divisor_y", 1.0).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, hex::new)
   );
   private final aku d;
   private final List<hex.a> e;
   private final double f;
   private final double g;

   public hex(aku $$0, List<hex.a> $$1, double $$2, double $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public void a(aup $$0, hen.a $$1) {
      aku $$2 = a.a(this.d);
      Optional<aun> $$3 = $$0.getResource($$2);
      if ($$3.isPresent()) {
         het $$4 = new het($$2, $$3.get(), this.e.size());

         for (hex.a $$5 : this.e) {
            $$1.a($$5.b, new hex.b($$4, $$5, this.f, this.g));
         }
      } else {
         c.warn("Missing sprite: {}", $$2);
      }
   }

   @Override
   public hep a() {
      return heq.d;
   }

   static record a(aku b, double c, double d, double e, double f) {
      public static final Codec<hex.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  aku.a.fieldOf("sprite").forGetter(hex.a::a),
                  Codec.DOUBLE.fieldOf("x").forGetter(hex.a::b),
                  Codec.DOUBLE.fieldOf("y").forGetter(hex.a::c),
                  Codec.DOUBLE.fieldOf("width").forGetter(hex.a::d),
                  Codec.DOUBLE.fieldOf("height").forGetter(hex.a::e)
               )
               .apply($$0, hex.a::new)
      );

      public aku a() {
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

   static class b implements hen.b {
      private final het a;
      private final hex.a b;
      private final double c;
      private final double d;

      b(het $$0, hex.a $$1, double $$2, double $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public hed a(hem $$0) {
         try {
            feu $$1 = this.a.a();
            double $$2 = (double)$$1.a() / this.c;
            double $$3 = (double)$$1.b() / this.d;
            int $$4 = ayz.a(this.b.c * $$2);
            int $$5 = ayz.a(this.b.d * $$3);
            int $$6 = ayz.a(this.b.e * $$2);
            int $$7 = ayz.a(this.b.f * $$3);
            feu $$8 = new feu(feu.a.a, $$6, $$7, false);
            $$1.a($$8, $$4, $$5, 0, 0, $$6, $$7, false, false);
            return new hed(this.b.b, new hfx($$6, $$7), $$8, aur.a);
         } catch (Exception var16) {
            hex.c.error("Failed to unstitch region {}", this.b.b, var16);
         } finally {
            this.a.b();
         }

         return hdz.a();
      }

      @Override
      public void a() {
         this.a.b();
      }
   }
}
