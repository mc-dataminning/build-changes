import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class gpw implements gpm {
   static final Logger c = LogUtils.getLogger();
   public static final MapCodec<gpw> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               akk.a.fieldOf("resource").forGetter($$0x -> $$0x.d),
               axm.a(gpw.a.a.listOf()).fieldOf("regions").forGetter($$0x -> $$0x.e),
               Codec.DOUBLE.optionalFieldOf("divisor_x", 1.0).forGetter($$0x -> $$0x.f),
               Codec.DOUBLE.optionalFieldOf("divisor_y", 1.0).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, gpw::new)
   );
   private final akk d;
   private final List<gpw.a> e;
   private final double f;
   private final double g;

   public gpw(akk $$0, List<gpw.a> $$1, double $$2, double $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public void a(atu $$0, gpm.a $$1) {
      akk $$2 = a.a(this.d);
      Optional<ats> $$3 = $$0.getResource($$2);
      if ($$3.isPresent()) {
         gps $$4 = new gps($$2, $$3.get(), this.e.size());

         for (gpw.a $$5 : this.e) {
            $$1.a($$5.b, new gpw.b($$4, $$5, this.f, this.g));
         }
      } else {
         c.warn("Missing sprite: {}", $$2);
      }
   }

   @Override
   public gpo a() {
      return gpp.d;
   }

   static record a(akk b, double c, double d, double e, double f) {
      public static final Codec<gpw.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  akk.a.fieldOf("sprite").forGetter(gpw.a::a),
                  Codec.DOUBLE.fieldOf("x").forGetter(gpw.a::b),
                  Codec.DOUBLE.fieldOf("y").forGetter(gpw.a::c),
                  Codec.DOUBLE.fieldOf("width").forGetter(gpw.a::d),
                  Codec.DOUBLE.fieldOf("height").forGetter(gpw.a::e)
               )
               .apply($$0, gpw.a::new)
      );

      public akk a() {
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

   static class b implements gpm.b {
      private final gps a;
      private final gpw.a b;
      private final double c;
      private final double d;

      b(gps $$0, gpw.a $$1, double $$2, double $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public gpc a(gpl $$0) {
         try {
            ezh $$1 = this.a.a();
            double $$2 = (double)$$1.a() / this.c;
            double $$3 = (double)$$1.b() / this.d;
            int $$4 = aye.a(this.b.c * $$2);
            int $$5 = aye.a(this.b.d * $$3);
            int $$6 = aye.a(this.b.e * $$2);
            int $$7 = aye.a(this.b.f * $$3);
            ezh $$8 = new ezh(ezh.a.a, $$6, $$7, false);
            $$1.a($$8, $$4, $$5, 0, 0, $$6, $$7, false, false);
            return new gpc(this.b.b, new gqv($$6, $$7), $$8, atw.a);
         } catch (Exception var16) {
            gpw.c.error("Failed to unstitch region {}", this.b.b, var16);
         } finally {
            this.a.b();
         }

         return goy.a();
      }

      @Override
      public void a() {
         this.a.b();
      }
   }
}
