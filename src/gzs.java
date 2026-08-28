import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class gzs implements gzi {
   static final Logger c = LogUtils.getLogger();
   public static final MapCodec<gzs> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               alj.a.fieldOf("resource").forGetter($$0x -> $$0x.d),
               ayv.a(gzs.a.a.listOf()).fieldOf("regions").forGetter($$0x -> $$0x.e),
               Codec.DOUBLE.optionalFieldOf("divisor_x", 1.0).forGetter($$0x -> $$0x.f),
               Codec.DOUBLE.optionalFieldOf("divisor_y", 1.0).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, gzs::new)
   );
   private final alj d;
   private final List<gzs.a> e;
   private final double f;
   private final double g;

   public gzs(alj $$0, List<gzs.a> $$1, double $$2, double $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public void a(avd $$0, gzi.a $$1) {
      alj $$2 = a.a(this.d);
      Optional<avb> $$3 = $$0.getResource($$2);
      if ($$3.isPresent()) {
         gzo $$4 = new gzo($$2, $$3.get(), this.e.size());

         for (gzs.a $$5 : this.e) {
            $$1.a($$5.b, new gzs.b($$4, $$5, this.f, this.g));
         }
      } else {
         c.warn("Missing sprite: {}", $$2);
      }
   }

   @Override
   public gzk a() {
      return gzl.d;
   }

   static record a(alj b, double c, double d, double e, double f) {
      public static final Codec<gzs.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  alj.a.fieldOf("sprite").forGetter(gzs.a::a),
                  Codec.DOUBLE.fieldOf("x").forGetter(gzs.a::b),
                  Codec.DOUBLE.fieldOf("y").forGetter(gzs.a::c),
                  Codec.DOUBLE.fieldOf("width").forGetter(gzs.a::d),
                  Codec.DOUBLE.fieldOf("height").forGetter(gzs.a::e)
               )
               .apply($$0, gzs.a::new)
      );

      public alj a() {
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

   static class b implements gzi.b {
      private final gzo a;
      private final gzs.a b;
      private final double c;
      private final double d;

      b(gzo $$0, gzs.a $$1, double $$2, double $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public gyy a(gzh $$0) {
         try {
            fdr $$1 = this.a.a();
            double $$2 = (double)$$1.a() / this.c;
            double $$3 = (double)$$1.b() / this.d;
            int $$4 = azm.a(this.b.c * $$2);
            int $$5 = azm.a(this.b.d * $$3);
            int $$6 = azm.a(this.b.e * $$2);
            int $$7 = azm.a(this.b.f * $$3);
            fdr $$8 = new fdr(fdr.a.a, $$6, $$7, false);
            $$1.a($$8, $$4, $$5, 0, 0, $$6, $$7, false, false);
            return new gyy(this.b.b, new has($$6, $$7), $$8, avf.a);
         } catch (Exception var16) {
            gzs.c.error("Failed to unstitch region {}", this.b.b, var16);
         } finally {
            this.a.b();
         }

         return gyu.a();
      }

      @Override
      public void a() {
         this.a.b();
      }
   }
}
