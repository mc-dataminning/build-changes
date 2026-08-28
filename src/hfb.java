import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class hfb implements her {
   static final Logger c = LogUtils.getLogger();
   public static final MapCodec<hfb> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               aku.a.fieldOf("resource").forGetter($$0x -> $$0x.d),
               ayh.b(hfb.a.a.listOf()).fieldOf("regions").forGetter($$0x -> $$0x.e),
               Codec.DOUBLE.optionalFieldOf("divisor_x", 1.0).forGetter($$0x -> $$0x.f),
               Codec.DOUBLE.optionalFieldOf("divisor_y", 1.0).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, hfb::new)
   );
   private final aku d;
   private final List<hfb.a> e;
   private final double f;
   private final double g;

   public hfb(aku $$0, List<hfb.a> $$1, double $$2, double $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public void a(auo $$0, her.a $$1) {
      aku $$2 = a.a(this.d);
      Optional<aum> $$3 = $$0.getResource($$2);
      if ($$3.isPresent()) {
         hex $$4 = new hex($$2, $$3.get(), this.e.size());

         for (hfb.a $$5 : this.e) {
            $$1.a($$5.b, new hfb.b($$4, $$5, this.f, this.g));
         }
      } else {
         c.warn("Missing sprite: {}", $$2);
      }
   }

   @Override
   public het a() {
      return heu.d;
   }

   static record a(aku b, double c, double d, double e, double f) {
      public static final Codec<hfb.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  aku.a.fieldOf("sprite").forGetter(hfb.a::a),
                  Codec.DOUBLE.fieldOf("x").forGetter(hfb.a::b),
                  Codec.DOUBLE.fieldOf("y").forGetter(hfb.a::c),
                  Codec.DOUBLE.fieldOf("width").forGetter(hfb.a::d),
                  Codec.DOUBLE.fieldOf("height").forGetter(hfb.a::e)
               )
               .apply($$0, hfb.a::new)
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

   static class b implements her.b {
      private final hex a;
      private final hfb.a b;
      private final double c;
      private final double d;

      b(hex $$0, hfb.a $$1, double $$2, double $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public heg a(heq $$0) {
         try {
            fes $$1 = this.a.a();
            double $$2 = (double)$$1.a() / this.c;
            double $$3 = (double)$$1.b() / this.d;
            int $$4 = ayy.a(this.b.c * $$2);
            int $$5 = ayy.a(this.b.d * $$3);
            int $$6 = ayy.a(this.b.e * $$2);
            int $$7 = ayy.a(this.b.f * $$3);
            fes $$8 = new fes(fes.a.a, $$6, $$7, false);
            $$1.a($$8, $$4, $$5, 0, 0, $$6, $$7, false, false);
            return new heg(this.b.b, new hga($$6, $$7), $$8, auq.a);
         } catch (Exception var16) {
            hfb.c.error("Failed to unstitch region {}", this.b.b, var16);
         } finally {
            this.a.b();
         }

         return heb.b();
      }

      @Override
      public void a() {
         this.a.b();
      }
   }
}
