import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class gpl implements gpb {
   static final Logger c = LogUtils.getLogger();
   public static final MapCodec<gpl> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ale.a.fieldOf("resource").forGetter($$0x -> $$0x.d),
               ayf.a(gpl.a.a.listOf()).fieldOf("regions").forGetter($$0x -> $$0x.e),
               Codec.DOUBLE.optionalFieldOf("divisor_x", 1.0).forGetter($$0x -> $$0x.f),
               Codec.DOUBLE.optionalFieldOf("divisor_y", 1.0).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, gpl::new)
   );
   private final ale d;
   private final List<gpl.a> e;
   private final double f;
   private final double g;

   public gpl(ale $$0, List<gpl.a> $$1, double $$2, double $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public void a(auo $$0, gpb.a $$1) {
      ale $$2 = a.a(this.d);
      Optional<aum> $$3 = $$0.getResource($$2);
      if ($$3.isPresent()) {
         gph $$4 = new gph($$2, $$3.get(), this.e.size());

         for (gpl.a $$5 : this.e) {
            $$1.a($$5.b, new gpl.b($$4, $$5, this.f, this.g));
         }
      } else {
         c.warn("Missing sprite: {}", $$2);
      }
   }

   @Override
   public gpd a() {
      return gpe.d;
   }

   static record a(ale b, double c, double d, double e, double f) {
      public static final Codec<gpl.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  ale.a.fieldOf("sprite").forGetter(gpl.a::a),
                  Codec.DOUBLE.fieldOf("x").forGetter(gpl.a::b),
                  Codec.DOUBLE.fieldOf("y").forGetter(gpl.a::c),
                  Codec.DOUBLE.fieldOf("width").forGetter(gpl.a::d),
                  Codec.DOUBLE.fieldOf("height").forGetter(gpl.a::e)
               )
               .apply($$0, gpl.a::new)
      );

      public ale a() {
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

   static class b implements gpb.b {
      private final gph a;
      private final gpl.a b;
      private final double c;
      private final double d;

      b(gph $$0, gpl.a $$1, double $$2, double $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public gor a(gpa $$0) {
         try {
            eyx $$1 = this.a.a();
            double $$2 = (double)$$1.a() / this.c;
            double $$3 = (double)$$1.b() / this.d;
            int $$4 = ayx.a(this.b.c * $$2);
            int $$5 = ayx.a(this.b.d * $$3);
            int $$6 = ayx.a(this.b.e * $$2);
            int $$7 = ayx.a(this.b.f * $$3);
            eyx $$8 = new eyx(eyx.a.a, $$6, $$7, false);
            $$1.a($$8, $$4, $$5, 0, 0, $$6, $$7, false, false);
            return new gor(this.b.b, new gqk($$6, $$7), $$8, auq.a);
         } catch (Exception var16) {
            gpl.c.error("Failed to unstitch region {}", this.b.b, var16);
         } finally {
            this.a.b();
         }

         return gon.a();
      }

      @Override
      public void a() {
         this.a.b();
      }
   }
}
