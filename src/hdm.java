import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class hdm implements hdr {
   private final gog a;
   private final hgy b;

   public hdm(gog $$0, hgy $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public void a(cwm $$0, fft $$1, glx $$2, int $$3, int $$4, boolean $$5) {
      this.a.a($$1, $$2, $$3, $$4, this.b);
   }

   public static record a(akv b) implements hdv.a {
      public static final MapCodec<hdm.a> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(akv.a.fieldOf("texture").forGetter(hdm.a::b)).apply($$0, hdm.a::new));

      public a(cvl $$0) {
         this(gms.b($$0));
      }

      @Override
      public MapCodec<hdm.a> a() {
         return a;
      }

      @Override
      public hdv<?> a(gey $$0) {
         return new hdm(new gog($$0), gms.a(this.b));
      }
   }
}
