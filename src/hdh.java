import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class hdh implements hdm {
   private final goe a;
   private final hgt b;

   public hdh(goe $$0, hgt $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public void a(cwl $$0, ffs $$1, glv $$2, int $$3, int $$4, boolean $$5) {
      this.a.a($$1, $$2, $$3, $$4, this.b);
   }

   public static record a(aku b) implements hdq.a {
      public static final MapCodec<hdh.a> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(aku.a.fieldOf("texture").forGetter(hdh.a::b)).apply($$0, hdh.a::new));

      public a(cvk $$0) {
         this(gmq.b($$0));
      }

      @Override
      public MapCodec<hdh.a> a() {
         return a;
      }

      @Override
      public hdq<?> a(gew $$0) {
         return new hdh(new goe($$0), gmq.a(this.b));
      }
   }
}
