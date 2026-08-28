import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class hjb extends hiy implements hja {
   public static final MapCodec<hjb> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("wobble", true).forGetter(hiy::b), hjb.a.d.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, hjb::new)
   );
   private final hjb.a b;
   private final azx c = azx.a();
   private final hiy.a d;

   public hjb(boolean $$0, hjb.a $$1) {
      super($$0);
      this.b = $$1;
      this.d = this.a(0.9F);
   }

   @Override
   protected float a(czy $$0, gmb $$1, int $$2, bwt $$3) {
      float $$4 = this.b.a($$1, $$0, $$3, this.c);
      long $$5 = $$1.ae();
      if (this.d.a($$5)) {
         this.d.a($$5, $$4);
      }

      return this.d.a();
   }

   @Override
   public MapCodec<hjb> a() {
      return a;
   }

   public static enum a implements bam {
      a("random") {
         @Override
         public float a(gmb $$0, czy $$1, bwt $$2, azx $$3) {
            return $$3.i();
         }
      },
      b("daytime") {
         @Override
         public float a(gmb $$0, czy $$1, bwt $$2, azx $$3) {
            return $$0.f(1.0F);
         }
      },
      c("moon_phase") {
         @Override
         public float a(gmb $$0, czy $$1, bwt $$2, azx $$3) {
            return (float)$$0.at() / 8.0F;
         }
      };

      public static final Codec<hjb.a> d = bam.a(hjb.a::values);
      private final String e;

      a(final String $$0) {
         this.e = $$0;
      }

      @Override
      public String c() {
         return this.e;
      }

      abstract float a(gmb var1, czy var2, bwt var3, azx var4);
   }
}
