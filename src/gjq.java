import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class gjq implements gjg {
   static final Logger c = LogUtils.getLogger();
   public static final Codec<gjq> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ajh.a.fieldOf("resource").forGetter($$0x -> $$0x.d),
               awe.a(gjq.a.a.listOf()).fieldOf("regions").forGetter($$0x -> $$0x.e),
               Codec.DOUBLE.optionalFieldOf("divisor_x", 1.0).forGetter($$0x -> $$0x.f),
               Codec.DOUBLE.optionalFieldOf("divisor_y", 1.0).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, gjq::new)
   );
   private final ajh d;
   private final List<gjq.a> e;
   private final double f;
   private final double g;

   public gjq(ajh $$0, List<gjq.a> $$1, double $$2, double $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public void a(aso $$0, gjg.a $$1) {
      ajh $$2 = a.a(this.d);
      Optional<asm> $$3 = $$0.getResource($$2);
      if ($$3.isPresent()) {
         gjm $$4 = new gjm($$2, $$3.get(), this.e.size());

         for (gjq.a $$5 : this.e) {
            $$1.a($$5.b, new gjq.b($$4, $$5, this.f, this.g));
         }
      } else {
         c.warn("Missing sprite: {}", $$2);
      }
   }

   @Override
   public gji a() {
      return gjj.d;
   }

   static record a(ajh b, double c, double d, double e, double f) {
      public static final Codec<gjq.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  ajh.a.fieldOf("sprite").forGetter(gjq.a::a),
                  Codec.DOUBLE.fieldOf("x").forGetter(gjq.a::b),
                  Codec.DOUBLE.fieldOf("y").forGetter(gjq.a::c),
                  Codec.DOUBLE.fieldOf("width").forGetter(gjq.a::d),
                  Codec.DOUBLE.fieldOf("height").forGetter(gjq.a::e)
               )
               .apply($$0, gjq.a::new)
      );

      public ajh a() {
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

   static class b implements gjg.b {
      private final gjm a;
      private final gjq.a b;
      private final double c;
      private final double d;

      b(gjm $$0, gjq.a $$1, double $$2, double $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public giw a(gjf $$0) {
         try {
            etc $$1 = this.a.a();
            double $$2 = (double)$$1.a() / this.c;
            double $$3 = (double)$$1.b() / this.d;
            int $$4 = aww.a(this.b.c * $$2);
            int $$5 = aww.a(this.b.d * $$3);
            int $$6 = aww.a(this.b.e * $$2);
            int $$7 = aww.a(this.b.f * $$3);
            etc $$8 = new etc(etc.a.a, $$6, $$7, false);
            $$1.a($$8, $$4, $$5, 0, 0, $$6, $$7, false, false);
            return new giw(this.b.b, new gko($$6, $$7), $$8, asq.a);
         } catch (Exception var16) {
            gjq.c.error("Failed to unstitch region {}", this.b.b, var16);
         } finally {
            this.a.b();
         }

         return gis.a();
      }

      @Override
      public void a() {
         this.a.b();
      }
   }
}
