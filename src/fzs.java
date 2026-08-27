import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class fzs implements fzi {
   static final Logger c = LogUtils.getLogger();
   public static final Codec<fzs> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               aex.a.fieldOf("resource").forGetter($$0x -> $$0x.d),
               arg.a(fzs.a.a.listOf()).fieldOf("regions").forGetter($$0x -> $$0x.e),
               Codec.DOUBLE.optionalFieldOf("divisor_x", 1.0).forGetter($$0x -> $$0x.f),
               Codec.DOUBLE.optionalFieldOf("divisor_y", 1.0).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, fzs::new)
   );
   private final aex d;
   private final List<fzs.a> e;
   private final double f;
   private final double g;

   public fzs(aex $$0, List<fzs.a> $$1, double $$2, double $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public void a(anu $$0, fzi.a $$1) {
      aex $$2 = a.a(this.d);
      Optional<ans> $$3 = $$0.getResource($$2);
      if ($$3.isPresent()) {
         fzo $$4 = new fzo($$2, $$3.get(), this.e.size());

         for (fzs.a $$5 : this.e) {
            $$1.a($$5.b, new fzs.b($$4, $$5, this.f, this.g));
         }
      } else {
         c.warn("Missing sprite: {}", $$2);
      }
   }

   @Override
   public fzk a() {
      return fzl.d;
   }

   static record a(aex b, double c, double d, double e, double f) {
      public static final Codec<fzs.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  aex.a.fieldOf("sprite").forGetter(fzs.a::a),
                  Codec.DOUBLE.fieldOf("x").forGetter(fzs.a::b),
                  Codec.DOUBLE.fieldOf("y").forGetter(fzs.a::c),
                  Codec.DOUBLE.fieldOf("width").forGetter(fzs.a::d),
                  Codec.DOUBLE.fieldOf("height").forGetter(fzs.a::e)
               )
               .apply($$0, fzs.a::new)
      );

      public aex a() {
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

   static class b implements fzi.b {
      private final fzo a;
      private final fzs.a b;
      private final double c;
      private final double d;

      b(fzo $$0, fzs.a $$1, double $$2, double $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public fyy a(fzh $$0) {
         try {
            ekq $$1 = this.a.a();
            double $$2 = (double)$$1.a() / this.c;
            double $$3 = (double)$$1.b() / this.d;
            int $$4 = arx.a(this.b.c * $$2);
            int $$5 = arx.a(this.b.d * $$3);
            int $$6 = arx.a(this.b.e * $$2);
            int $$7 = arx.a(this.b.f * $$3);
            ekq $$8 = new ekq(ekq.a.a, $$6, $$7, false);
            $$1.a($$8, $$4, $$5, 0, 0, $$6, $$7, false, false);
            return new fyy(this.b.b, new gar($$6, $$7), $$8, anw.a);
         } catch (Exception var16) {
            fzs.c.error("Failed to unstitch region {}", this.b.b, var16);
         } finally {
            this.a.b();
         }

         return fyu.a();
      }

      @Override
      public void a() {
         this.a.b();
      }
   }
}
