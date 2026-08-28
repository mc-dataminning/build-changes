import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class hjd extends hja implements hjc {
   public static final MapCodec<hjd> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("wobble", true).forGetter(hja::b), hjd.a.d.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, hjd::new)
   );
   private final hjd.a b;
   private final azz c = azz.a();
   private final hja.a d;

   public hjd(boolean $$0, hjd.a $$1) {
      super($$0);
      this.b = $$1;
      this.d = this.a(0.9F);
   }

   @Override
   protected float a(daa $$0, gmd $$1, int $$2, bwv $$3) {
      float $$4 = this.b.a($$1, $$0, $$3, this.c);
      long $$5 = $$1.ae();
      if (this.d.a($$5)) {
         this.d.a($$5, $$4);
      }

      return this.d.a();
   }

   @Override
   public MapCodec<hjd> a() {
      return a;
   }

   public static enum a implements bao {
      a("random") {
         @Override
         public float a(gmd $$0, daa $$1, bwv $$2, azz $$3) {
            return $$3.i();
         }
      },
      b("daytime") {
         @Override
         public float a(gmd $$0, daa $$1, bwv $$2, azz $$3) {
            return $$0.f(1.0F);
         }
      },
      c("moon_phase") {
         @Override
         public float a(gmd $$0, daa $$1, bwv $$2, azz $$3) {
            return (float)$$0.at() / 8.0F;
         }
      };

      public static final Codec<hjd.a> d = bao.a(hjd.a::values);
      private final String e;

      a(final String $$0) {
         this.e = $$0;
      }

      @Override
      public String c() {
         return this.e;
      }

      abstract float a(gmd var1, daa var2, bwv var3, azz var4);
   }
}
