import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class fzu implements fzk {
   static final Logger c = LogUtils.getLogger();
   public static final Codec<fzu> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               aey.a.fieldOf("resource").forGetter($$0x -> $$0x.d),
               arh.a(fzu.a.a.listOf()).fieldOf("regions").forGetter($$0x -> $$0x.e),
               Codec.DOUBLE.optionalFieldOf("divisor_x", 1.0).forGetter($$0x -> $$0x.f),
               Codec.DOUBLE.optionalFieldOf("divisor_y", 1.0).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, fzu::new)
   );
   private final aey d;
   private final List<fzu.a> e;
   private final double f;
   private final double g;

   public fzu(aey $$0, List<fzu.a> $$1, double $$2, double $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public void a(anv $$0, fzk.a $$1) {
      aey $$2 = a.a(this.d);
      Optional<ant> $$3 = $$0.getResource($$2);
      if ($$3.isPresent()) {
         fzq $$4 = new fzq($$2, $$3.get(), this.e.size());

         for (fzu.a $$5 : this.e) {
            $$1.a($$5.b, new fzu.b($$4, $$5, this.f, this.g));
         }
      } else {
         c.warn("Missing sprite: {}", $$2);
      }
   }

   @Override
   public fzm a() {
      return fzn.d;
   }

   static record a(aey b, double c, double d, double e, double f) {
      public static final Codec<fzu.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  aey.a.fieldOf("sprite").forGetter(fzu.a::a),
                  Codec.DOUBLE.fieldOf("x").forGetter(fzu.a::b),
                  Codec.DOUBLE.fieldOf("y").forGetter(fzu.a::c),
                  Codec.DOUBLE.fieldOf("width").forGetter(fzu.a::d),
                  Codec.DOUBLE.fieldOf("height").forGetter(fzu.a::e)
               )
               .apply($$0, fzu.a::new)
      );

      public aey a() {
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

   static class b implements fzk.b {
      private final fzq a;
      private final fzu.a b;
      private final double c;
      private final double d;

      b(fzq $$0, fzu.a $$1, double $$2, double $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public fza a(fzj $$0) {
         try {
            eks $$1 = this.a.a();
            double $$2 = (double)$$1.a() / this.c;
            double $$3 = (double)$$1.b() / this.d;
            int $$4 = ary.a(this.b.c * $$2);
            int $$5 = ary.a(this.b.d * $$3);
            int $$6 = ary.a(this.b.e * $$2);
            int $$7 = ary.a(this.b.f * $$3);
            eks $$8 = new eks(eks.a.a, $$6, $$7, false);
            $$1.a($$8, $$4, $$5, 0, 0, $$6, $$7, false, false);
            return new fza(this.b.b, new gat($$6, $$7), $$8, anx.a);
         } catch (Exception var16) {
            fzu.c.error("Failed to unstitch region {}", this.b.b, var16);
         } finally {
            this.a.b();
         }

         return fyw.a();
      }

      @Override
      public void a() {
         this.a.b();
      }
   }
}
