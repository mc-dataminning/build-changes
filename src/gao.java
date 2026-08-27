import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class gao implements gae {
   static final Logger c = LogUtils.getLogger();
   public static final Codec<gao> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               afw.a.fieldOf("resource").forGetter($$0x -> $$0x.d),
               asg.a(gao.a.a.listOf()).fieldOf("regions").forGetter($$0x -> $$0x.e),
               Codec.DOUBLE.optionalFieldOf("divisor_x", 1.0).forGetter($$0x -> $$0x.f),
               Codec.DOUBLE.optionalFieldOf("divisor_y", 1.0).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, gao::new)
   );
   private final afw d;
   private final List<gao.a> e;
   private final double f;
   private final double g;

   public gao(afw $$0, List<gao.a> $$1, double $$2, double $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public void a(aot $$0, gae.a $$1) {
      afw $$2 = a.a(this.d);
      Optional<aor> $$3 = $$0.getResource($$2);
      if ($$3.isPresent()) {
         gak $$4 = new gak($$2, $$3.get(), this.e.size());

         for (gao.a $$5 : this.e) {
            $$1.a($$5.b, new gao.b($$4, $$5, this.f, this.g));
         }
      } else {
         c.warn("Missing sprite: {}", $$2);
      }
   }

   @Override
   public gag a() {
      return gah.d;
   }

   static record a(afw b, double c, double d, double e, double f) {
      public static final Codec<gao.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  afw.a.fieldOf("sprite").forGetter(gao.a::a),
                  Codec.DOUBLE.fieldOf("x").forGetter(gao.a::b),
                  Codec.DOUBLE.fieldOf("y").forGetter(gao.a::c),
                  Codec.DOUBLE.fieldOf("width").forGetter(gao.a::d),
                  Codec.DOUBLE.fieldOf("height").forGetter(gao.a::e)
               )
               .apply($$0, gao.a::new)
      );

      public afw a() {
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

   static class b implements gae.b {
      private final gak a;
      private final gao.a b;
      private final double c;
      private final double d;

      b(gak $$0, gao.a $$1, double $$2, double $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public fzu a(gad $$0) {
         try {
            eli $$1 = this.a.a();
            double $$2 = (double)$$1.a() / this.c;
            double $$3 = (double)$$1.b() / this.d;
            int $$4 = asy.a(this.b.c * $$2);
            int $$5 = asy.a(this.b.d * $$3);
            int $$6 = asy.a(this.b.e * $$2);
            int $$7 = asy.a(this.b.f * $$3);
            eli $$8 = new eli(eli.a.a, $$6, $$7, false);
            $$1.a($$8, $$4, $$5, 0, 0, $$6, $$7, false, false);
            return new fzu(this.b.b, new gbn($$6, $$7), $$8, aov.a);
         } catch (Exception var16) {
            gao.c.error("Failed to unstitch region {}", this.b.b, var16);
         } finally {
            this.a.b();
         }

         return fzq.a();
      }

      @Override
      public void a() {
         this.a.b();
      }
   }
}
