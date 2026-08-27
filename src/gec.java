import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class gec implements gds {
   static final Logger c = LogUtils.getLogger();
   public static final Codec<gec> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               agt.a.fieldOf("resource").forGetter($$0x -> $$0x.d),
               atg.a(gec.a.a.listOf()).fieldOf("regions").forGetter($$0x -> $$0x.e),
               Codec.DOUBLE.optionalFieldOf("divisor_x", 1.0).forGetter($$0x -> $$0x.f),
               Codec.DOUBLE.optionalFieldOf("divisor_y", 1.0).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, gec::new)
   );
   private final agt d;
   private final List<gec.a> e;
   private final double f;
   private final double g;

   public gec(agt $$0, List<gec.a> $$1, double $$2, double $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public void a(aps $$0, gds.a $$1) {
      agt $$2 = a.a(this.d);
      Optional<apq> $$3 = $$0.getResource($$2);
      if ($$3.isPresent()) {
         gdy $$4 = new gdy($$2, $$3.get(), this.e.size());

         for (gec.a $$5 : this.e) {
            $$1.a($$5.b, new gec.b($$4, $$5, this.f, this.g));
         }
      } else {
         c.warn("Missing sprite: {}", $$2);
      }
   }

   @Override
   public gdu a() {
      return gdv.d;
   }

   static record a(agt b, double c, double d, double e, double f) {
      public static final Codec<gec.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  agt.a.fieldOf("sprite").forGetter(gec.a::a),
                  Codec.DOUBLE.fieldOf("x").forGetter(gec.a::b),
                  Codec.DOUBLE.fieldOf("y").forGetter(gec.a::c),
                  Codec.DOUBLE.fieldOf("width").forGetter(gec.a::d),
                  Codec.DOUBLE.fieldOf("height").forGetter(gec.a::e)
               )
               .apply($$0, gec.a::new)
      );

      public agt a() {
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

   static class b implements gds.b {
      private final gdy a;
      private final gec.a b;
      private final double c;
      private final double d;

      b(gdy $$0, gec.a $$1, double $$2, double $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public gdi a(gdr $$0) {
         try {
            eoe $$1 = this.a.a();
            double $$2 = (double)$$1.a() / this.c;
            double $$3 = (double)$$1.b() / this.d;
            int $$4 = aty.a(this.b.c * $$2);
            int $$5 = aty.a(this.b.d * $$3);
            int $$6 = aty.a(this.b.e * $$2);
            int $$7 = aty.a(this.b.f * $$3);
            eoe $$8 = new eoe(eoe.a.a, $$6, $$7, false);
            $$1.a($$8, $$4, $$5, 0, 0, $$6, $$7, false, false);
            return new gdi(this.b.b, new gfb($$6, $$7), $$8, apu.a);
         } catch (Exception var16) {
            gec.c.error("Failed to unstitch region {}", this.b.b, var16);
         } finally {
            this.a.b();
         }

         return gde.a();
      }

      @Override
      public void a() {
         this.a.b();
      }
   }
}
