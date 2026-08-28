import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class gyg implements gxw {
   static final Logger c = LogUtils.getLogger();
   public static final MapCodec<gyg> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               alh.a.fieldOf("resource").forGetter($$0x -> $$0x.d),
               ays.a(gyg.a.a.listOf()).fieldOf("regions").forGetter($$0x -> $$0x.e),
               Codec.DOUBLE.optionalFieldOf("divisor_x", 1.0).forGetter($$0x -> $$0x.f),
               Codec.DOUBLE.optionalFieldOf("divisor_y", 1.0).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, gyg::new)
   );
   private final alh d;
   private final List<gyg.a> e;
   private final double f;
   private final double g;

   public gyg(alh $$0, List<gyg.a> $$1, double $$2, double $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public void a(ava $$0, gxw.a $$1) {
      alh $$2 = a.a(this.d);
      Optional<auy> $$3 = $$0.getResource($$2);
      if ($$3.isPresent()) {
         gyc $$4 = new gyc($$2, $$3.get(), this.e.size());

         for (gyg.a $$5 : this.e) {
            $$1.a($$5.b, new gyg.b($$4, $$5, this.f, this.g));
         }
      } else {
         c.warn("Missing sprite: {}", $$2);
      }
   }

   @Override
   public gxy a() {
      return gxz.d;
   }

   static record a(alh b, double c, double d, double e, double f) {
      public static final Codec<gyg.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  alh.a.fieldOf("sprite").forGetter(gyg.a::a),
                  Codec.DOUBLE.fieldOf("x").forGetter(gyg.a::b),
                  Codec.DOUBLE.fieldOf("y").forGetter(gyg.a::c),
                  Codec.DOUBLE.fieldOf("width").forGetter(gyg.a::d),
                  Codec.DOUBLE.fieldOf("height").forGetter(gyg.a::e)
               )
               .apply($$0, gyg.a::new)
      );

      public alh a() {
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

   static class b implements gxw.b {
      private final gyc a;
      private final gyg.a b;
      private final double c;
      private final double d;

      b(gyc $$0, gyg.a $$1, double $$2, double $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public gxm a(gxv $$0) {
         try {
            fct $$1 = this.a.a();
            double $$2 = (double)$$1.a() / this.c;
            double $$3 = (double)$$1.b() / this.d;
            int $$4 = azj.a(this.b.c * $$2);
            int $$5 = azj.a(this.b.d * $$3);
            int $$6 = azj.a(this.b.e * $$2);
            int $$7 = azj.a(this.b.f * $$3);
            fct $$8 = new fct(fct.a.a, $$6, $$7, false);
            $$1.a($$8, $$4, $$5, 0, 0, $$6, $$7, false, false);
            return new gxm(this.b.b, new gzg($$6, $$7), $$8, avc.a);
         } catch (Exception var16) {
            gyg.c.error("Failed to unstitch region {}", this.b.b, var16);
         } finally {
            this.a.b();
         }

         return gxi.a();
      }

      @Override
      public void a() {
         this.a.b();
      }
   }
}
