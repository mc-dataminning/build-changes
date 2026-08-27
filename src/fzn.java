import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class fzn implements fzd {
   static final Logger c = LogUtils.getLogger();
   public static final Codec<fzn> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               aeu.a.fieldOf("resource").forGetter($$0x -> $$0x.d),
               arb.a(fzn.a.a.listOf()).fieldOf("regions").forGetter($$0x -> $$0x.e),
               Codec.DOUBLE.optionalFieldOf("divisor_x", 1.0).forGetter($$0x -> $$0x.f),
               Codec.DOUBLE.optionalFieldOf("divisor_y", 1.0).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, fzn::new)
   );
   private final aeu d;
   private final List<fzn.a> e;
   private final double f;
   private final double g;

   public fzn(aeu $$0, List<fzn.a> $$1, double $$2, double $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public void a(anp $$0, fzd.a $$1) {
      aeu $$2 = a.a(this.d);
      Optional<ann> $$3 = $$0.getResource($$2);
      if ($$3.isPresent()) {
         fzj $$4 = new fzj($$2, $$3.get(), this.e.size());

         for (fzn.a $$5 : this.e) {
            $$1.a($$5.b, new fzn.b($$4, $$5, this.f, this.g));
         }
      } else {
         c.warn("Missing sprite: {}", $$2);
      }
   }

   @Override
   public fzf a() {
      return fzg.d;
   }

   static record a(aeu b, double c, double d, double e, double f) {
      public static final Codec<fzn.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  aeu.a.fieldOf("sprite").forGetter(fzn.a::a),
                  Codec.DOUBLE.fieldOf("x").forGetter(fzn.a::b),
                  Codec.DOUBLE.fieldOf("y").forGetter(fzn.a::c),
                  Codec.DOUBLE.fieldOf("width").forGetter(fzn.a::d),
                  Codec.DOUBLE.fieldOf("height").forGetter(fzn.a::e)
               )
               .apply($$0, fzn.a::new)
      );

      public aeu a() {
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

   static class b implements fzd.b {
      private final fzj a;
      private final fzn.a b;
      private final double c;
      private final double d;

      b(fzj $$0, fzn.a $$1, double $$2, double $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public fyt a(fzc $$0) {
         try {
            ekl $$1 = this.a.a();
            double $$2 = (double)$$1.a() / this.c;
            double $$3 = (double)$$1.b() / this.d;
            int $$4 = ars.a(this.b.c * $$2);
            int $$5 = ars.a(this.b.d * $$3);
            int $$6 = ars.a(this.b.e * $$2);
            int $$7 = ars.a(this.b.f * $$3);
            ekl $$8 = new ekl(ekl.a.a, $$6, $$7, false);
            $$1.a($$8, $$4, $$5, 0, 0, $$6, $$7, false, false);
            return new fyt(this.b.b, new gam($$6, $$7), $$8, anr.a);
         } catch (Exception var16) {
            fzn.c.error("Failed to unstitch region {}", this.b.b, var16);
         } finally {
            this.a.b();
         }

         return fyp.a();
      }

      @Override
      public void a() {
         this.a.b();
      }
   }
}
