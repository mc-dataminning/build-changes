import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class hgg implements hfw {
   static final Logger c = LogUtils.getLogger();
   public static final MapCodec<hgg> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               aku.a.fieldOf("resource").forGetter($$0x -> $$0x.d),
               ayi.b(hgg.a.a.listOf()).fieldOf("regions").forGetter($$0x -> $$0x.e),
               Codec.DOUBLE.optionalFieldOf("divisor_x", 1.0).forGetter($$0x -> $$0x.f),
               Codec.DOUBLE.optionalFieldOf("divisor_y", 1.0).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, hgg::new)
   );
   private final aku d;
   private final List<hgg.a> e;
   private final double f;
   private final double g;

   public hgg(aku $$0, List<hgg.a> $$1, double $$2, double $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public void a(aup $$0, hfw.a $$1) {
      aku $$2 = a.a(this.d);
      Optional<aun> $$3 = $$0.getResource($$2);
      if ($$3.isPresent()) {
         hgc $$4 = new hgc($$2, $$3.get(), this.e.size());

         for (hgg.a $$5 : this.e) {
            $$1.a($$5.b, new hgg.b($$4, $$5, this.f, this.g));
         }
      } else {
         c.warn("Missing sprite: {}", $$2);
      }
   }

   @Override
   public hfy a() {
      return hfz.d;
   }

   static record a(aku b, double c, double d, double e, double f) {
      public static final Codec<hgg.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  aku.a.fieldOf("sprite").forGetter(hgg.a::a),
                  Codec.DOUBLE.fieldOf("x").forGetter(hgg.a::b),
                  Codec.DOUBLE.fieldOf("y").forGetter(hgg.a::c),
                  Codec.DOUBLE.fieldOf("width").forGetter(hgg.a::d),
                  Codec.DOUBLE.fieldOf("height").forGetter(hgg.a::e)
               )
               .apply($$0, hgg.a::new)
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

   static class b implements hfw.b {
      private final hgc a;
      private final hgg.a b;
      private final double c;
      private final double d;

      b(hgc $$0, hgg.a $$1, double $$2, double $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public hfl a(hfv $$0) {
         try {
            ffr $$1 = this.a.a();
            double $$2 = (double)$$1.a() / this.c;
            double $$3 = (double)$$1.b() / this.d;
            int $$4 = ayz.a(this.b.c * $$2);
            int $$5 = ayz.a(this.b.d * $$3);
            int $$6 = ayz.a(this.b.e * $$2);
            int $$7 = ayz.a(this.b.f * $$3);
            ffr $$8 = new ffr(ffr.a.a, $$6, $$7, false);
            $$1.a($$8, $$4, $$5, 0, 0, $$6, $$7, false, false);
            return new hfl(this.b.b, new hhf($$6, $$7), $$8, aur.a);
         } catch (Exception var16) {
            hgg.c.error("Failed to unstitch region {}", this.b.b, var16);
         } finally {
            this.a.b();
         }

         return hfg.b();
      }

      @Override
      public void a() {
         this.a.b();
      }
   }
}
