import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class hhk implements hhp {
   private final gsb a;
   private final hkw b;

   public hhk(gsb $$0, hkw $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public void a(cyw $$0, fjc $$1, gps $$2, int $$3, int $$4, boolean $$5) {
      this.a.a($$1, $$2, $$3, $$4, this.b);
   }

   public static record a(alg b) implements hht.a {
      public static final MapCodec<hhk.a> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(alg.a.fieldOf("texture").forGetter(hhk.a::b)).apply($$0, hhk.a::new));

      public a(cxw $$0) {
         this(gqn.b($$0));
      }

      @Override
      public MapCodec<hhk.a> a() {
         return a;
      }

      @Override
      public hht<?> a(giq $$0) {
         return new hhk(new gsb($$0), gqn.o.a(this.b));
      }
   }
}
