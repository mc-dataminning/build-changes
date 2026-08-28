import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class hhr extends hho implements hhq {
   public static final MapCodec<hhr> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("wobble", true).forGetter(hho::b), hhr.a.d.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, hhr::new)
   );
   private final hhr.a b;
   private final azv c = azv.a();
   private final hho.a d;

   public hhr(boolean $$0, hhr.a $$1) {
      super($$0);
      this.b = $$1;
      this.d = this.a(0.9F);
   }

   @Override
   protected float a(czn $$0, gkq $$1, int $$2, bwi $$3) {
      float $$4 = this.b.a($$1, $$0, $$3, this.c);
      long $$5 = $$1.ae();
      if (this.d.a($$5)) {
         this.d.a($$5, $$4);
      }

      return this.d.a();
   }

   @Override
   public MapCodec<hhr> a() {
      return a;
   }

   public static enum a implements bak {
      a("random") {
         @Override
         public float a(gkq $$0, czn $$1, bwi $$2, azv $$3) {
            return $$3.i();
         }
      },
      b("daytime") {
         @Override
         public float a(gkq $$0, czn $$1, bwi $$2, azv $$3) {
            return $$0.f(1.0F);
         }
      },
      c("moon_phase") {
         @Override
         public float a(gkq $$0, czn $$1, bwi $$2, azv $$3) {
            return (float)$$0.at() / 8.0F;
         }
      };

      public static final Codec<hhr.a> d = bak.a(hhr.a::values);
      private final String e;

      a(final String $$0) {
         this.e = $$0;
      }

      @Override
      public String c() {
         return this.e;
      }

      abstract float a(gkq var1, czn var2, bwi var3, azv var4);
   }
}
