import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class hgq extends hgn implements hgp {
   public static final MapCodec<hgq> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("wobble", true).forGetter(hgn::b), hgq.a.d.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, hgq::new)
   );
   private final hgq.a b;
   private final azv c = azv.a();
   private final hgn.a d;

   public hgq(boolean $$0, hgq.a $$1) {
      super($$0);
      this.b = $$1;
      this.d = this.a(0.9F);
   }

   @Override
   protected float a(cyy $$0, gjr $$1, int $$2, bwd $$3) {
      float $$4 = this.b.a($$1, $$0, $$3, this.c);
      long $$5 = $$1.ae();
      if (this.d.a($$5)) {
         this.d.a($$5, $$4);
      }

      return this.d.a();
   }

   @Override
   public MapCodec<hgq> a() {
      return a;
   }

   public static enum a implements bak {
      a("random") {
         @Override
         public float a(gjr $$0, cyy $$1, bwd $$2, azv $$3) {
            return $$3.i();
         }
      },
      b("daytime") {
         @Override
         public float a(gjr $$0, cyy $$1, bwd $$2, azv $$3) {
            return $$0.f(1.0F);
         }
      },
      c("moon_phase") {
         @Override
         public float a(gjr $$0, cyy $$1, bwd $$2, azv $$3) {
            return (float)$$0.at() / 8.0F;
         }
      };

      public static final Codec<hgq.a> d = bak.a(hgq.a::values);
      private final String e;

      a(final String $$0) {
         this.e = $$0;
      }

      @Override
      public String c() {
         return this.e;
      }

      abstract float a(gjr var1, cyy var2, bwd var3, azv var4);
   }
}
