import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class hfi implements hey {
   static final Logger c = LogUtils.getLogger();
   public static final MapCodec<hfi> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               akv.a.fieldOf("resource").forGetter($$0x -> $$0x.d),
               ayi.b(hfi.a.a.listOf()).fieldOf("regions").forGetter($$0x -> $$0x.e),
               Codec.DOUBLE.optionalFieldOf("divisor_x", 1.0).forGetter($$0x -> $$0x.f),
               Codec.DOUBLE.optionalFieldOf("divisor_y", 1.0).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, hfi::new)
   );
   private final akv d;
   private final List<hfi.a> e;
   private final double f;
   private final double g;

   public hfi(akv $$0, List<hfi.a> $$1, double $$2, double $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public void a(aup $$0, hey.a $$1) {
      akv $$2 = a.a(this.d);
      Optional<aun> $$3 = $$0.getResource($$2);
      if ($$3.isPresent()) {
         hfe $$4 = new hfe($$2, $$3.get(), this.e.size());

         for (hfi.a $$5 : this.e) {
            $$1.a($$5.b, new hfi.b($$4, $$5, this.f, this.g));
         }
      } else {
         c.warn("Missing sprite: {}", $$2);
      }
   }

   @Override
   public hfa a() {
      return hfb.d;
   }

   static record a(akv b, double c, double d, double e, double f) {
      public static final Codec<hfi.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  akv.a.fieldOf("sprite").forGetter(hfi.a::a),
                  Codec.DOUBLE.fieldOf("x").forGetter(hfi.a::b),
                  Codec.DOUBLE.fieldOf("y").forGetter(hfi.a::c),
                  Codec.DOUBLE.fieldOf("width").forGetter(hfi.a::d),
                  Codec.DOUBLE.fieldOf("height").forGetter(hfi.a::e)
               )
               .apply($$0, hfi.a::new)
      );

      public akv a() {
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

   static class b implements hey.b {
      private final hfe a;
      private final hfi.a b;
      private final double c;
      private final double d;

      b(hfe $$0, hfi.a $$1, double $$2, double $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public hen a(hex $$0) {
         try {
            fev $$1 = this.a.a();
            double $$2 = (double)$$1.a() / this.c;
            double $$3 = (double)$$1.b() / this.d;
            int $$4 = ayz.a(this.b.c * $$2);
            int $$5 = ayz.a(this.b.d * $$3);
            int $$6 = ayz.a(this.b.e * $$2);
            int $$7 = ayz.a(this.b.f * $$3);
            fev $$8 = new fev(fev.a.a, $$6, $$7, false);
            $$1.a($$8, $$4, $$5, 0, 0, $$6, $$7, false, false);
            return new hen(this.b.b, new hgh($$6, $$7), $$8, aur.a);
         } catch (Exception var16) {
            hfi.c.error("Failed to unstitch region {}", this.b.b, var16);
         } finally {
            this.a.b();
         }

         return hei.b();
      }

      @Override
      public void a() {
         this.a.b();
      }
   }
}
