import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class fzo implements fze {
   static final Logger c = LogUtils.getLogger();
   public static final Codec<fzo> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               aez.a.fieldOf("resource").forGetter($$0x -> $$0x.d),
               arj.a(fzo.a.a.listOf()).fieldOf("regions").forGetter($$0x -> $$0x.e),
               Codec.DOUBLE.optionalFieldOf("divisor_x", 1.0).forGetter($$0x -> $$0x.f),
               Codec.DOUBLE.optionalFieldOf("divisor_y", 1.0).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, fzo::new)
   );
   private final aez d;
   private final List<fzo.a> e;
   private final double f;
   private final double g;

   public fzo(aez $$0, List<fzo.a> $$1, double $$2, double $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public void a(anw $$0, fze.a $$1) {
      aez $$2 = a.a(this.d);
      Optional<anu> $$3 = $$0.getResource($$2);
      if ($$3.isPresent()) {
         fzk $$4 = new fzk($$2, $$3.get(), this.e.size());

         for (fzo.a $$5 : this.e) {
            $$1.a($$5.b, new fzo.b($$4, $$5, this.f, this.g));
         }
      } else {
         c.warn("Missing sprite: {}", $$2);
      }
   }

   @Override
   public fzg a() {
      return fzh.d;
   }

   static record a(aez b, double c, double d, double e, double f) {
      public static final Codec<fzo.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  aez.a.fieldOf("sprite").forGetter(fzo.a::a),
                  Codec.DOUBLE.fieldOf("x").forGetter(fzo.a::b),
                  Codec.DOUBLE.fieldOf("y").forGetter(fzo.a::c),
                  Codec.DOUBLE.fieldOf("width").forGetter(fzo.a::d),
                  Codec.DOUBLE.fieldOf("height").forGetter(fzo.a::e)
               )
               .apply($$0, fzo.a::new)
      );

      public aez a() {
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

   static class b implements fze.b {
      private final fzk a;
      private final fzo.a b;
      private final double c;
      private final double d;

      b(fzk $$0, fzo.a $$1, double $$2, double $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public fyu a(fzd $$0) {
         try {
            ekk $$1 = this.a.a();
            double $$2 = (double)$$1.a() / this.c;
            double $$3 = (double)$$1.b() / this.d;
            int $$4 = asb.a(this.b.c * $$2);
            int $$5 = asb.a(this.b.d * $$3);
            int $$6 = asb.a(this.b.e * $$2);
            int $$7 = asb.a(this.b.f * $$3);
            ekk $$8 = new ekk(ekk.a.a, $$6, $$7, false);
            $$1.a($$8, $$4, $$5, 0, 0, $$6, $$7, false, false);
            return new fyu(this.b.b, new gan($$6, $$7), $$8, any.a);
         } catch (Exception var16) {
            fzo.c.error("Failed to unstitch region {}", this.b.b, var16);
         } finally {
            this.a.b();
         }

         return fyq.a();
      }

      @Override
      public void a() {
         this.a.b();
      }
   }
}
