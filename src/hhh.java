import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class hhh implements hgx {
   static final Logger c = LogUtils.getLogger();
   public static final MapCodec<hhh> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ald.a.fieldOf("resource").forGetter($$0x -> $$0x.d),
               ays.b(hhh.a.a.listOf()).fieldOf("regions").forGetter($$0x -> $$0x.e),
               Codec.DOUBLE.optionalFieldOf("divisor_x", 1.0).forGetter($$0x -> $$0x.f),
               Codec.DOUBLE.optionalFieldOf("divisor_y", 1.0).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, hhh::new)
   );
   private final ald d;
   private final List<hhh.a> e;
   private final double f;
   private final double g;

   public hhh(ald $$0, List<hhh.a> $$1, double $$2, double $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public void a(ava $$0, hgx.a $$1) {
      ald $$2 = a.a(this.d);
      Optional<auy> $$3 = $$0.getResource($$2);
      if ($$3.isPresent()) {
         hhd $$4 = new hhd($$2, $$3.get(), this.e.size());

         for (hhh.a $$5 : this.e) {
            $$1.a($$5.b, new hhh.b($$4, $$5, this.f, this.g));
         }
      } else {
         c.warn("Missing sprite: {}", $$2);
      }
   }

   @Override
   public hgz a() {
      return hha.d;
   }

   static record a(ald b, double c, double d, double e, double f) {
      public static final Codec<hhh.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  ald.a.fieldOf("sprite").forGetter(hhh.a::a),
                  Codec.DOUBLE.fieldOf("x").forGetter(hhh.a::b),
                  Codec.DOUBLE.fieldOf("y").forGetter(hhh.a::c),
                  Codec.DOUBLE.fieldOf("width").forGetter(hhh.a::d),
                  Codec.DOUBLE.fieldOf("height").forGetter(hhh.a::e)
               )
               .apply($$0, hhh.a::new)
      );

      public ald a() {
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

   static class b implements hgx.b {
      private final hhd a;
      private final hhh.a b;
      private final double c;
      private final double d;

      b(hhd $$0, hhh.a $$1, double $$2, double $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public hgm a(hgw $$0) {
         try {
            fgo $$1 = this.a.a();
            double $$2 = (double)$$1.a() / this.c;
            double $$3 = (double)$$1.b() / this.d;
            int $$4 = azk.a(this.b.c * $$2);
            int $$5 = azk.a(this.b.d * $$3);
            int $$6 = azk.a(this.b.e * $$2);
            int $$7 = azk.a(this.b.f * $$3);
            fgo $$8 = new fgo(fgo.a.a, $$6, $$7, false);
            $$1.a($$8, $$4, $$5, 0, 0, $$6, $$7, false, false);
            return new hgm(this.b.b, new hig($$6, $$7), $$8, avc.a);
         } catch (Exception var16) {
            hhh.c.error("Failed to unstitch region {}", this.b.b, var16);
         } finally {
            this.a.b();
         }

         return hgh.b();
      }

      @Override
      public void a() {
         this.a.b();
      }
   }
}
