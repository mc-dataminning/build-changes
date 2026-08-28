import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class hgy extends hgv implements hgx {
   public static final MapCodec<hgy> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("wobble", true).forGetter(hgv::b), hgy.a.d.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, hgy::new)
   );
   private final hgy.a b;
   private final azv c = azv.a();
   private final hgv.a d;

   public hgy(boolean $$0, hgy.a $$1) {
      super($$0);
      this.b = $$1;
      this.d = this.a(0.9F);
   }

   @Override
   protected float a(czd $$0, gjz $$1, int $$2, bwf $$3) {
      float $$4 = this.b.a($$1, $$0, $$3, this.c);
      long $$5 = $$1.ae();
      if (this.d.a($$5)) {
         this.d.a($$5, $$4);
      }

      return this.d.a();
   }

   @Override
   public MapCodec<hgy> a() {
      return a;
   }

   public static enum a implements bak {
      a("random") {
         @Override
         public float a(gjz $$0, czd $$1, bwf $$2, azv $$3) {
            return $$3.i();
         }
      },
      b("daytime") {
         @Override
         public float a(gjz $$0, czd $$1, bwf $$2, azv $$3) {
            return $$0.f(1.0F);
         }
      },
      c("moon_phase") {
         @Override
         public float a(gjz $$0, czd $$1, bwf $$2, azv $$3) {
            return (float)$$0.at() / 8.0F;
         }
      };

      public static final Codec<hgy.a> d = bak.a(hgy.a::values);
      private final String e;

      a(final String $$0) {
         this.e = $$0;
      }

      @Override
      public String c() {
         return this.e;
      }

      abstract float a(gjz var1, czd var2, bwf var3, azv var4);
   }
}
