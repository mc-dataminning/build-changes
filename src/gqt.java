import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class gqt implements gqj {
   static final Logger c = LogUtils.getLogger();
   public static final MapCodec<gqt> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               akq.a.fieldOf("resource").forGetter($$0x -> $$0x.d),
               axv.a(gqt.a.a.listOf()).fieldOf("regions").forGetter($$0x -> $$0x.e),
               Codec.DOUBLE.optionalFieldOf("divisor_x", 1.0).forGetter($$0x -> $$0x.f),
               Codec.DOUBLE.optionalFieldOf("divisor_y", 1.0).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, gqt::new)
   );
   private final akq d;
   private final List<gqt.a> e;
   private final double f;
   private final double g;

   public gqt(akq $$0, List<gqt.a> $$1, double $$2, double $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public void a(aud $$0, gqj.a $$1) {
      akq $$2 = a.a(this.d);
      Optional<aub> $$3 = $$0.getResource($$2);
      if ($$3.isPresent()) {
         gqp $$4 = new gqp($$2, $$3.get(), this.e.size());

         for (gqt.a $$5 : this.e) {
            $$1.a($$5.b, new gqt.b($$4, $$5, this.f, this.g));
         }
      } else {
         c.warn("Missing sprite: {}", $$2);
      }
   }

   @Override
   public gql a() {
      return gqm.d;
   }

   static record a(akq b, double c, double d, double e, double f) {
      public static final Codec<gqt.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  akq.a.fieldOf("sprite").forGetter(gqt.a::a),
                  Codec.DOUBLE.fieldOf("x").forGetter(gqt.a::b),
                  Codec.DOUBLE.fieldOf("y").forGetter(gqt.a::c),
                  Codec.DOUBLE.fieldOf("width").forGetter(gqt.a::d),
                  Codec.DOUBLE.fieldOf("height").forGetter(gqt.a::e)
               )
               .apply($$0, gqt.a::new)
      );

      public akq a() {
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

   static class b implements gqj.b {
      private final gqp a;
      private final gqt.a b;
      private final double c;
      private final double d;

      b(gqp $$0, gqt.a $$1, double $$2, double $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public gpz a(gqi $$0) {
         try {
            fad $$1 = this.a.a();
            double $$2 = (double)$$1.a() / this.c;
            double $$3 = (double)$$1.b() / this.d;
            int $$4 = ayn.a(this.b.c * $$2);
            int $$5 = ayn.a(this.b.d * $$3);
            int $$6 = ayn.a(this.b.e * $$2);
            int $$7 = ayn.a(this.b.f * $$3);
            fad $$8 = new fad(fad.a.a, $$6, $$7, false);
            $$1.a($$8, $$4, $$5, 0, 0, $$6, $$7, false, false);
            return new gpz(this.b.b, new grs($$6, $$7), $$8, auf.a);
         } catch (Exception var16) {
            gqt.c.error("Failed to unstitch region {}", this.b.b, var16);
         } finally {
            this.a.b();
         }

         return gpv.a();
      }

      @Override
      public void a() {
         this.a.b();
      }
   }
}
