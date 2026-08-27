import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class gin implements gid {
   static final Logger c = LogUtils.getLogger();
   public static final Codec<gin> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ajc.a.fieldOf("resource").forGetter($$0x -> $$0x.d),
               avu.a(gin.a.a.listOf()).fieldOf("regions").forGetter($$0x -> $$0x.e),
               Codec.DOUBLE.optionalFieldOf("divisor_x", 1.0).forGetter($$0x -> $$0x.f),
               Codec.DOUBLE.optionalFieldOf("divisor_y", 1.0).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, gin::new)
   );
   private final ajc d;
   private final List<gin.a> e;
   private final double f;
   private final double g;

   public gin(ajc $$0, List<gin.a> $$1, double $$2, double $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public void a(asf $$0, gid.a $$1) {
      ajc $$2 = a.a(this.d);
      Optional<asd> $$3 = $$0.getResource($$2);
      if ($$3.isPresent()) {
         gij $$4 = new gij($$2, $$3.get(), this.e.size());

         for (gin.a $$5 : this.e) {
            $$1.a($$5.b, new gin.b($$4, $$5, this.f, this.g));
         }
      } else {
         c.warn("Missing sprite: {}", $$2);
      }
   }

   @Override
   public gif a() {
      return gig.d;
   }

   static record a(ajc b, double c, double d, double e, double f) {
      public static final Codec<gin.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  ajc.a.fieldOf("sprite").forGetter(gin.a::a),
                  Codec.DOUBLE.fieldOf("x").forGetter(gin.a::b),
                  Codec.DOUBLE.fieldOf("y").forGetter(gin.a::c),
                  Codec.DOUBLE.fieldOf("width").forGetter(gin.a::d),
                  Codec.DOUBLE.fieldOf("height").forGetter(gin.a::e)
               )
               .apply($$0, gin.a::new)
      );

      public ajc a() {
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

   static class b implements gid.b {
      private final gij a;
      private final gin.a b;
      private final double c;
      private final double d;

      b(gij $$0, gin.a $$1, double $$2, double $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public ght a(gic $$0) {
         try {
            ese $$1 = this.a.a();
            double $$2 = (double)$$1.a() / this.c;
            double $$3 = (double)$$1.b() / this.d;
            int $$4 = awm.a(this.b.c * $$2);
            int $$5 = awm.a(this.b.d * $$3);
            int $$6 = awm.a(this.b.e * $$2);
            int $$7 = awm.a(this.b.f * $$3);
            ese $$8 = new ese(ese.a.a, $$6, $$7, false);
            $$1.a($$8, $$4, $$5, 0, 0, $$6, $$7, false, false);
            return new ght(this.b.b, new gjl($$6, $$7), $$8, ash.a);
         } catch (Exception var16) {
            gin.c.error("Failed to unstitch region {}", this.b.b, var16);
         } finally {
            this.a.b();
         }

         return ghp.a();
      }

      @Override
      public void a() {
         this.a.b();
      }
   }
}
