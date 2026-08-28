import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class hhd implements hhf {
   private final hie a;
   private final hhf b;
   private final hhf c;

   public hhd(hie $$0, hhf $$1, hhf $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public void a(hhi $$0, dak $$1, hhg $$2, dai $$3, @Nullable glo $$4, @Nullable byf $$5, int $$6) {
      (this.a.get($$1, $$4, $$5, $$6, $$3) ? this.b : this.c).a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public static record a(hht b, hhf.b c, hhf.b d) implements hhf.b {
      public static final MapCodec<hhd.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(hhs.a.forGetter(hhd.a::b), hhh.a.fieldOf("on_true").forGetter(hhd.a::c), hhh.a.fieldOf("on_false").forGetter(hhd.a::d))
               .apply($$0, hhd.a::new)
      );

      @Override
      public MapCodec<hhd.a> a() {
         return a;
      }

      @Override
      public hhf a(hhf.a $$0) {
         return new hhd(this.a(this.b, $$0.d()), this.c.a($$0), this.d.a($$0));
      }

      private hie a(hht $$0, @Nullable baj $$1) {
         if ($$1 == null) {
            return $$0;
         } else {
            glh<glo, hie> $$2 = new glh<>($$2x -> a($$0, $$1, $$2x));
            return ($$2x, $$3, $$4, $$5, $$6) -> {
               hie $$7 = (hie)($$3 == null ? $$0 : $$2.a($$3));
               return $$7.get($$2x, $$3, $$4, $$5, $$6);
            };
         }
      }

      private static <T extends hht> T a(T $$0, baj $$1, glo $$2) {
         return (T)$$1.a($$0.a().codec(), $$0, $$2.J_()).result().orElse($$0);
      }

      @Override
      public void a(hnh.a $$0) {
         this.c.a($$0);
         this.d.a($$0);
      }
   }
}
