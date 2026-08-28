import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class hir extends hio implements hiq {
   public static final MapCodec<hir> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("wobble", true).forGetter(hio::b), hir.a.d.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, hir::new)
   );
   private final hir.a b;
   private final bai c = bai.a();
   private final hio.a d;

   public hir(boolean $$0, hir.a $$1) {
      super($$0);
      this.b = $$1;
      this.d = this.a(0.9F);
   }

   @Override
   protected float a(dak $$0, glo $$1, int $$2, bxe $$3) {
      float $$4 = this.b.a($$1, $$0, $$3, this.c);
      long $$5 = $$1.ae();
      if (this.d.a($$5)) {
         this.d.a($$5, $$4);
      }

      return this.d.a();
   }

   @Override
   public MapCodec<hir> a() {
      return a;
   }

   public static enum a implements bax {
      a("random") {
         @Override
         public float a(glo $$0, dak $$1, bxe $$2, bai $$3) {
            return $$3.i();
         }
      },
      b("daytime") {
         @Override
         public float a(glo $$0, dak $$1, bxe $$2, bai $$3) {
            return $$0.f(1.0F);
         }
      },
      c("moon_phase") {
         @Override
         public float a(glo $$0, dak $$1, bxe $$2, bai $$3) {
            return (float)$$0.at() / 8.0F;
         }
      };

      public static final Codec<hir.a> d = bax.a(hir.a::values);
      private final String e;

      a(final String $$0) {
         this.e = $$0;
      }

      @Override
      public String c() {
         return this.e;
      }

      abstract float a(glo var1, dak var2, bxe var3, bai var4);
   }
}
